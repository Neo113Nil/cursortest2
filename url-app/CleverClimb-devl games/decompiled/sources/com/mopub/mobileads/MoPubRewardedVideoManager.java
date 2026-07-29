package com.mopub.mobileads;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.location.Location;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.mopub.common.AdFormat;
import com.mopub.common.AdReport;
import com.mopub.common.ClientMetadata;
import com.mopub.common.Constants;
import com.mopub.common.DataKeys;
import com.mopub.common.MediationSettings;
import com.mopub.common.MoPub;
import com.mopub.common.MoPubReward;
import com.mopub.common.Preconditions;
import com.mopub.common.SharedPreferencesHelper;
import com.mopub.common.VisibleForTesting;
import com.mopub.common.logging.MoPubLog;
import com.mopub.common.util.Json;
import com.mopub.common.util.MoPubCollections;
import com.mopub.common.util.Reflection;
import com.mopub.common.util.ReflectionTarget;
import com.mopub.common.util.Utils;
import com.mopub.network.AdRequest;
import com.mopub.network.AdResponse;
import com.mopub.network.MoPubNetworkError;
import com.mopub.network.Networking;
import com.mopub.network.TrackingRequest;
import com.mopub.volley.NoConnectionError;
import com.mopub.volley.VolleyError;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class MoPubRewardedVideoManager {
    public static final int API_VERSION = 1;
    private static final String CURRENCIES_JSON_REWARDS_MAP_KEY = "rewards";
    private static final String CURRENCIES_JSON_REWARD_AMOUNT_KEY = "amount";
    private static final String CURRENCIES_JSON_REWARD_NAME_KEY = "name";

    @VisibleForTesting
    static final int CUSTOM_DATA_MAX_LENGTH_BYTES = 8192;
    private static final String CUSTOM_EVENT_PREF_NAME = "mopubCustomEventSettings";
    private static final int DEFAULT_LOAD_TIMEOUT = 30000;
    private static SharedPreferences sCustomEventSharedPrefs;
    private static MoPubRewardedVideoManager sInstance;
    private final AdRequestStatusMapping mAdRequestStatus;
    private final Context mContext;
    private final Handler mCustomEventTimeoutHandler;
    private final Map<String, Set<MediationSettings>> mInstanceMediationSettings;
    private WeakReference<Activity> mMainActivity;
    private final Map<String, Runnable> mTimeoutMap;
    private MoPubRewardedVideoListener mVideoListener;
    private final RewardedAdData mRewardedAdData = new RewardedAdData();
    private final Handler mCallbackHandler = new Handler(Looper.getMainLooper());
    private final Set<MediationSettings> mGlobalMediationSettings = new HashSet();

    public static class RewardedVideoRequestListener implements AdRequest.Listener {
        public final String adUnitId;
        private final MoPubRewardedVideoManager mVideoManager;

        public RewardedVideoRequestListener(MoPubRewardedVideoManager moPubRewardedVideoManager, String str) {
            this.adUnitId = str;
            this.mVideoManager = moPubRewardedVideoManager;
        }

        @Override // com.mopub.network.AdRequest.Listener
        public void onSuccess(AdResponse adResponse) {
            this.mVideoManager.onAdSuccess(adResponse, this.adUnitId);
        }

        @Override // com.mopub.volley.Response.ErrorListener
        public void onErrorResponse(VolleyError volleyError) {
            this.mVideoManager.onAdError(volleyError, this.adUnitId);
        }
    }

    public static final class RequestParameters {
        public final String mCustomerId;
        public final String mKeywords;
        public final Location mLocation;
        public final String mUserDataKeywords;

        public RequestParameters(String str) {
            this(str, null);
        }

        public RequestParameters(String str, String str2) {
            this(str, str2, null);
        }

        public RequestParameters(String str, String str2, Location location) {
            this(str, str2, location, null);
        }

        public RequestParameters(String str, String str2, Location location, String str3) {
            this.mKeywords = str;
            this.mCustomerId = str3;
            boolean canCollectPersonalInformation = MoPub.canCollectPersonalInformation();
            this.mUserDataKeywords = canCollectPersonalInformation ? str2 : null;
            this.mLocation = canCollectPersonalInformation ? location : null;
        }
    }

    private MoPubRewardedVideoManager(Activity activity, MediationSettings... mediationSettingsArr) {
        this.mMainActivity = new WeakReference<>(activity);
        this.mContext = activity.getApplicationContext();
        MoPubCollections.addAllNonNull(this.mGlobalMediationSettings, mediationSettingsArr);
        this.mInstanceMediationSettings = new HashMap();
        this.mCustomEventTimeoutHandler = new Handler();
        this.mTimeoutMap = new HashMap();
        this.mAdRequestStatus = new AdRequestStatusMapping();
        sCustomEventSharedPrefs = SharedPreferencesHelper.getSharedPreferences(this.mContext, CUSTOM_EVENT_PREF_NAME);
    }

    public static synchronized List<CustomEventRewardedVideo> initNetworks(Activity activity, List<Class<? extends CustomEventRewardedVideo>> list) {
        synchronized (MoPubRewardedVideoManager.class) {
            Preconditions.checkNotNull(activity);
            Preconditions.checkNotNull(list);
            if (sInstance == null) {
                logErrorNotInitialized();
                return Collections.emptyList();
            }
            LinkedList linkedList = new LinkedList();
            Map<String, ?> all = sCustomEventSharedPrefs.getAll();
            MoPubLog.d(String.format(Locale.US, "fetched init settings for %s networks: %s", Integer.valueOf(all.size()), all.keySet()));
            Iterator it = new LinkedHashSet(list).iterator();
            while (it.hasNext()) {
                String name = ((Class) it.next()).getName();
                if (all.containsKey(name)) {
                    try {
                        Map<String, String> jsonStringToMap = Json.jsonStringToMap((String) all.get(name));
                        CustomEventRewardedVideo customEventRewardedVideo = (CustomEventRewardedVideo) Reflection.instantiateClassWithEmptyConstructor(name, CustomEventRewardedVideo.class);
                        MoPubLog.d(String.format(Locale.US, "Initializing %s with params %s", name, jsonStringToMap));
                        customEventRewardedVideo.checkAndInitializeSdk(activity, Collections.emptyMap(), jsonStringToMap);
                        linkedList.add(customEventRewardedVideo);
                    } catch (Exception unused) {
                        MoPubLog.e("Error fetching init settings for network " + name);
                    }
                } else {
                    MoPubLog.d("Init settings not found for " + name);
                }
            }
            return linkedList;
        }
    }

    public static synchronized void init(Activity activity, MediationSettings... mediationSettingsArr) {
        synchronized (MoPubRewardedVideoManager.class) {
            if (sInstance == null) {
                sInstance = new MoPubRewardedVideoManager(activity, mediationSettingsArr);
            } else {
                MoPubLog.e("Tried to call initializeRewardedVideo more than once. Only the first initialization call has any effect.");
            }
        }
    }

    @ReflectionTarget
    public static void updateActivity(Activity activity) {
        if (sInstance != null) {
            sInstance.mMainActivity = new WeakReference<>(activity);
        } else {
            logErrorNotInitialized();
        }
    }

    public static <T extends MediationSettings> T getGlobalMediationSettings(Class<T> cls) {
        if (sInstance == null) {
            logErrorNotInitialized();
            return null;
        }
        for (MediationSettings mediationSettings : sInstance.mGlobalMediationSettings) {
            if (cls.equals(mediationSettings.getClass())) {
                return cls.cast(mediationSettings);
            }
        }
        return null;
    }

    public static <T extends MediationSettings> T getInstanceMediationSettings(Class<T> cls, String str) {
        if (sInstance == null) {
            logErrorNotInitialized();
            return null;
        }
        Set<MediationSettings> set = sInstance.mInstanceMediationSettings.get(str);
        if (set == null) {
            return null;
        }
        for (MediationSettings mediationSettings : set) {
            if (cls.equals(mediationSettings.getClass())) {
                return cls.cast(mediationSettings);
            }
        }
        return null;
    }

    public static void setVideoListener(MoPubRewardedVideoListener moPubRewardedVideoListener) {
        if (sInstance != null) {
            sInstance.mVideoListener = moPubRewardedVideoListener;
        } else {
            logErrorNotInitialized();
        }
    }

    public static void loadVideo(final String str, RequestParameters requestParameters, MediationSettings... mediationSettingsArr) {
        Preconditions.checkNotNull(str);
        if (sInstance == null) {
            logErrorNotInitialized();
            return;
        }
        if (str.equals(sInstance.mRewardedAdData.getCurrentlyShowingAdUnitId())) {
            MoPubLog.d(String.format(Locale.US, "Did not queue rewarded ad request for ad unit %s. The ad is already showing.", str));
            return;
        }
        if (sInstance.mAdRequestStatus.canPlay(str)) {
            MoPubLog.d(String.format(Locale.US, "Did not queue rewarded ad request for ad unit %s. This ad unit already finished loading and is ready to show.", str));
            postToInstance(new Runnable() { // from class: com.mopub.mobileads.MoPubRewardedVideoManager.1
                @Override // java.lang.Runnable
                public void run() {
                    if (MoPubRewardedVideoManager.sInstance.mVideoListener != null) {
                        MoPubRewardedVideoManager.sInstance.mVideoListener.onRewardedVideoLoadSuccess(str);
                    }
                }
            });
            return;
        }
        HashSet hashSet = new HashSet();
        MoPubCollections.addAllNonNull(hashSet, mediationSettingsArr);
        sInstance.mInstanceMediationSettings.put(str, hashSet);
        String str2 = requestParameters == null ? null : requestParameters.mCustomerId;
        if (!TextUtils.isEmpty(str2)) {
            sInstance.mRewardedAdData.setCustomerId(str2);
        }
        loadVideo(str, new WebViewAdUrlGenerator(sInstance.mContext, false).withAdUnitId(str).withKeywords(requestParameters == null ? null : requestParameters.mKeywords).withUserDataKeywords((requestParameters == null || !MoPub.canCollectPersonalInformation()) ? null : requestParameters.mUserDataKeywords).withLocation(requestParameters != null ? requestParameters.mLocation : null).generateUrlString(Constants.HOST));
    }

    private static void loadVideo(String str, String str2) {
        if (sInstance == null) {
            logErrorNotInitialized();
        } else {
            if (sInstance.mAdRequestStatus.isLoading(str)) {
                MoPubLog.d(String.format(Locale.US, "Did not queue rewarded ad request for ad unit %s. A request is already pending.", str));
                return;
            }
            Networking.getRequestQueue(sInstance.mContext).add(new AdRequest(str2, AdFormat.REWARDED_VIDEO, str, sInstance.mContext, new RewardedVideoRequestListener(sInstance, str)));
            sInstance.mAdRequestStatus.markLoading(str);
            MoPubLog.d(String.format(Locale.US, "Loading rewarded ad request for ad unit %s with URL %s", str, str2));
        }
    }

    public static boolean hasVideo(String str) {
        if (sInstance != null) {
            return isPlayable(str, sInstance.mRewardedAdData.getCustomEvent(str));
        }
        logErrorNotInitialized();
        return false;
    }

    public static void showVideo(String str) {
        showVideo(str, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void showVideo(String str, String str2) {
        if (sInstance == null) {
            logErrorNotInitialized();
            return;
        }
        if (str2 != null && str2.length() > 8192) {
            MoPubLog.w(String.format(Locale.US, "Provided rewarded ad custom data parameter longer than supported(%d bytes, %d maximum)", Integer.valueOf(str2.length()), 8192));
        }
        CustomEventRewardedAd customEvent = sInstance.mRewardedAdData.getCustomEvent(str);
        if (isPlayable(str, customEvent)) {
            if (!sInstance.mRewardedAdData.getAvailableRewards(str).isEmpty() && sInstance.mRewardedAdData.getMoPubReward(str) == null) {
                sInstance.failover(str, MoPubErrorCode.REWARD_NOT_SELECTED);
                return;
            }
            sInstance.mRewardedAdData.updateCustomEventLastShownRewardMapping(customEvent.getClass(), sInstance.mRewardedAdData.getMoPubReward(str));
            sInstance.mRewardedAdData.updateAdUnitToCustomDataMapping(str, str2);
            sInstance.mRewardedAdData.setCurrentlyShowingAdUnitId(str);
            sInstance.mAdRequestStatus.markPlayed(str);
            customEvent.show();
            return;
        }
        if (sInstance.mAdRequestStatus.isLoading(str)) {
            MoPubLog.d("Rewarded ad is not ready to be shown yet.");
        } else {
            MoPubLog.d("No rewarded ad loading or loaded.");
        }
        sInstance.failover(str, MoPubErrorCode.VIDEO_NOT_AVAILABLE);
    }

    private static boolean isPlayable(String str, CustomEventRewardedAd customEventRewardedAd) {
        return sInstance != null && sInstance.mAdRequestStatus.canPlay(str) && customEventRewardedAd != null && customEventRewardedAd.isReady();
    }

    public static Set<MoPubReward> getAvailableRewards(String str) {
        if (sInstance != null) {
            return sInstance.mRewardedAdData.getAvailableRewards(str);
        }
        logErrorNotInitialized();
        return Collections.emptySet();
    }

    public static void selectReward(String str, MoPubReward moPubReward) {
        if (sInstance != null) {
            sInstance.mRewardedAdData.selectReward(str, moPubReward);
        } else {
            logErrorNotInitialized();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onAdSuccess(AdResponse adResponse, String str) {
        this.mAdRequestStatus.markLoaded(str, adResponse.getFailoverUrl(), adResponse.getImpressionTrackingUrl(), adResponse.getClickTrackingUrl());
        Integer adTimeoutMillis = adResponse.getAdTimeoutMillis();
        if (adTimeoutMillis == null || adTimeoutMillis.intValue() <= 0) {
            adTimeoutMillis = 30000;
        }
        String customEventClassName = adResponse.getCustomEventClassName();
        if (customEventClassName == null) {
            MoPubLog.e("Couldn't create custom event, class name was null.");
            failover(str, MoPubErrorCode.ADAPTER_CONFIGURATION_ERROR);
            return;
        }
        CustomEventRewardedAd customEvent = this.mRewardedAdData.getCustomEvent(str);
        if (customEvent != null) {
            customEvent.onInvalidate();
        }
        try {
            final CustomEventRewardedAd customEventRewardedAd = (CustomEventRewardedAd) Reflection.instantiateClassWithEmptyConstructor(customEventClassName, CustomEventRewardedAd.class);
            TreeMap treeMap = new TreeMap();
            treeMap.put(DataKeys.AD_UNIT_ID_KEY, str);
            treeMap.put(DataKeys.REWARDED_AD_CURRENCY_NAME_KEY, adResponse.getRewardedVideoCurrencyName());
            treeMap.put(DataKeys.REWARDED_AD_CURRENCY_AMOUNT_STRING_KEY, adResponse.getRewardedVideoCurrencyAmount());
            treeMap.put(DataKeys.REWARDED_AD_DURATION_KEY, adResponse.getRewardedDuration());
            treeMap.put(DataKeys.SHOULD_REWARD_ON_CLICK_KEY, Boolean.valueOf(adResponse.shouldRewardOnClick()));
            treeMap.put(DataKeys.AD_REPORT_KEY, new AdReport(str, ClientMetadata.getInstance(this.mContext), adResponse));
            treeMap.put(DataKeys.BROADCAST_IDENTIFIER_KEY, Long.valueOf(Utils.generateUniqueId()));
            treeMap.put("Rewarded-Ad-Customer-Id", this.mRewardedAdData.getCustomerId());
            String rewardedCurrencies = adResponse.getRewardedCurrencies();
            this.mRewardedAdData.resetAvailableRewards(str);
            this.mRewardedAdData.resetSelectedReward(str);
            if (TextUtils.isEmpty(rewardedCurrencies)) {
                this.mRewardedAdData.updateAdUnitRewardMapping(str, adResponse.getRewardedVideoCurrencyName(), adResponse.getRewardedVideoCurrencyAmount());
            } else {
                try {
                    parseMultiCurrencyJson(str, rewardedCurrencies);
                } catch (Exception unused) {
                    MoPubLog.e("Error parsing rewarded currencies JSON header: " + rewardedCurrencies);
                    failover(str, MoPubErrorCode.REWARDED_CURRENCIES_PARSING_ERROR);
                    return;
                }
            }
            this.mRewardedAdData.updateAdUnitToServerCompletionUrlMapping(str, adResponse.getRewardedVideoCompletionUrl());
            Activity activity = this.mMainActivity.get();
            if (activity == null) {
                MoPubLog.d("Could not load custom event because Activity reference was null. Call MoPub#updateActivity before requesting more rewarded ads.");
                this.mAdRequestStatus.markFail(str);
                return;
            }
            Runnable runnable = new Runnable() { // from class: com.mopub.mobileads.MoPubRewardedVideoManager.2
                @Override // java.lang.Runnable
                public void run() {
                    MoPubLog.d("Custom Event failed to load rewarded ad in a timely fashion.");
                    MoPubRewardedVideoManager.onRewardedVideoLoadFailure(customEventRewardedAd.getClass(), customEventRewardedAd.getAdNetworkId(), MoPubErrorCode.NETWORK_TIMEOUT);
                    customEventRewardedAd.onInvalidate();
                }
            };
            this.mCustomEventTimeoutHandler.postDelayed(runnable, adTimeoutMillis.intValue());
            this.mTimeoutMap.put(str, runnable);
            Map<String, String> serverExtras = adResponse.getServerExtras();
            if (customEventRewardedAd instanceof CustomEventRewardedVideo) {
                String jSONObject = new JSONObject(serverExtras).toString();
                MoPubLog.d(String.format(Locale.US, "Updating init settings for custom event %s with params %s", customEventClassName, jSONObject));
                sCustomEventSharedPrefs.edit().putString(customEventClassName, jSONObject).commit();
            }
            MoPubLog.d(String.format(Locale.US, "Loading custom event with class name %s", customEventClassName));
            customEventRewardedAd.loadCustomEvent(activity, treeMap, serverExtras);
            this.mRewardedAdData.updateAdUnitCustomEventMapping(str, customEventRewardedAd, customEventRewardedAd.getAdNetworkId());
        } catch (Exception unused2) {
            MoPubLog.e(String.format(Locale.US, "Couldn't create custom event with class name %s", customEventClassName));
            failover(str, MoPubErrorCode.ADAPTER_CONFIGURATION_ERROR);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onAdError(VolleyError volleyError, String str) {
        MoPubErrorCode moPubErrorCode = MoPubErrorCode.INTERNAL_ERROR;
        if (volleyError instanceof MoPubNetworkError) {
            switch (((MoPubNetworkError) volleyError).getReason()) {
                case NO_FILL:
                case WARMING_UP:
                    moPubErrorCode = MoPubErrorCode.NO_FILL;
                    break;
                default:
                    moPubErrorCode = MoPubErrorCode.INTERNAL_ERROR;
                    break;
            }
        }
        if (volleyError instanceof NoConnectionError) {
            moPubErrorCode = MoPubErrorCode.NO_CONNECTION;
        }
        failover(str, moPubErrorCode);
    }

    private void parseMultiCurrencyJson(String str, String str2) throws JSONException {
        String[] jsonArrayToStringArray = Json.jsonArrayToStringArray(Json.jsonStringToMap(str2).get(CURRENCIES_JSON_REWARDS_MAP_KEY));
        if (jsonArrayToStringArray.length == 1) {
            Map<String, String> jsonStringToMap = Json.jsonStringToMap(jsonArrayToStringArray[0]);
            this.mRewardedAdData.updateAdUnitRewardMapping(str, jsonStringToMap.get("name"), jsonStringToMap.get("amount"));
        }
        for (String str3 : jsonArrayToStringArray) {
            Map<String, String> jsonStringToMap2 = Json.jsonStringToMap(str3);
            this.mRewardedAdData.addAvailableReward(str, jsonStringToMap2.get("name"), jsonStringToMap2.get("amount"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void failover(String str, MoPubErrorCode moPubErrorCode) {
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(moPubErrorCode);
        String failoverUrl = this.mAdRequestStatus.getFailoverUrl(str);
        this.mAdRequestStatus.markFail(str);
        if (failoverUrl != null && !moPubErrorCode.equals(MoPubErrorCode.EXPIRED)) {
            loadVideo(str, failoverUrl);
        } else if (sInstance.mVideoListener != null) {
            sInstance.mVideoListener.onRewardedVideoLoadFailure(str, moPubErrorCode);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cancelTimeouts(String str) {
        Runnable remove = this.mTimeoutMap.remove(str);
        if (remove != null) {
            this.mCustomEventTimeoutHandler.removeCallbacks(remove);
        }
    }

    public static <T extends CustomEventRewardedAd> void onRewardedVideoLoadSuccess(Class<T> cls, String str) {
        postToInstance(new ForEachMoPubIdRunnable(cls, str) { // from class: com.mopub.mobileads.MoPubRewardedVideoManager.3
            @Override // com.mopub.mobileads.MoPubRewardedVideoManager.ForEachMoPubIdRunnable
            protected void forEach(String str2) {
                MoPubRewardedVideoManager.sInstance.cancelTimeouts(str2);
                if (MoPubRewardedVideoManager.sInstance.mVideoListener != null) {
                    MoPubRewardedVideoManager.sInstance.mVideoListener.onRewardedVideoLoadSuccess(str2);
                }
            }
        });
    }

    public static <T extends CustomEventRewardedAd> void onRewardedVideoLoadFailure(Class<T> cls, String str, final MoPubErrorCode moPubErrorCode) {
        postToInstance(new ForEachMoPubIdRunnable(cls, str) { // from class: com.mopub.mobileads.MoPubRewardedVideoManager.4
            @Override // com.mopub.mobileads.MoPubRewardedVideoManager.ForEachMoPubIdRunnable
            protected void forEach(String str2) {
                MoPubRewardedVideoManager.sInstance.cancelTimeouts(str2);
                MoPubRewardedVideoManager.sInstance.failover(str2, moPubErrorCode);
            }
        });
    }

    public static <T extends CustomEventRewardedAd> void onRewardedVideoStarted(Class<T> cls, String str) {
        final String currentlyShowingAdUnitId = sInstance.mRewardedAdData.getCurrentlyShowingAdUnitId();
        if (TextUtils.isEmpty(currentlyShowingAdUnitId)) {
            postToInstance(new ForEachMoPubIdRunnable(cls, str) { // from class: com.mopub.mobileads.MoPubRewardedVideoManager.5
                @Override // com.mopub.mobileads.MoPubRewardedVideoManager.ForEachMoPubIdRunnable
                protected void forEach(String str2) {
                    MoPubRewardedVideoManager.onRewardedVideoStartedAction(str2);
                }
            });
        } else {
            postToInstance(new Runnable() { // from class: com.mopub.mobileads.MoPubRewardedVideoManager.6
                @Override // java.lang.Runnable
                public void run() {
                    MoPubRewardedVideoManager.onRewardedVideoStartedAction(currentlyShowingAdUnitId);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void onRewardedVideoStartedAction(String str) {
        Preconditions.checkNotNull(str);
        if (sInstance.mVideoListener != null) {
            sInstance.mVideoListener.onRewardedVideoStarted(str);
        }
        TrackingRequest.makeTrackingHttpRequest(sInstance.mAdRequestStatus.getImpressionTrackerUrlString(str), sInstance.mContext);
        sInstance.mAdRequestStatus.clearImpressionUrl(str);
    }

    public static <T extends CustomEventRewardedAd> void onRewardedVideoPlaybackError(Class<T> cls, String str, final MoPubErrorCode moPubErrorCode) {
        final String currentlyShowingAdUnitId = sInstance.mRewardedAdData.getCurrentlyShowingAdUnitId();
        if (TextUtils.isEmpty(currentlyShowingAdUnitId)) {
            postToInstance(new ForEachMoPubIdRunnable(cls, str) { // from class: com.mopub.mobileads.MoPubRewardedVideoManager.7
                @Override // com.mopub.mobileads.MoPubRewardedVideoManager.ForEachMoPubIdRunnable
                protected void forEach(String str2) {
                    MoPubRewardedVideoManager.onRewardedVideoPlaybackErrorAction(str2, moPubErrorCode);
                }
            });
        } else {
            postToInstance(new Runnable() { // from class: com.mopub.mobileads.MoPubRewardedVideoManager.8
                @Override // java.lang.Runnable
                public void run() {
                    MoPubRewardedVideoManager.onRewardedVideoPlaybackErrorAction(currentlyShowingAdUnitId, moPubErrorCode);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void onRewardedVideoPlaybackErrorAction(String str, MoPubErrorCode moPubErrorCode) {
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(moPubErrorCode);
        if (sInstance.mVideoListener != null) {
            sInstance.mVideoListener.onRewardedVideoPlaybackError(str, moPubErrorCode);
        }
    }

    public static <T extends CustomEventRewardedAd> void onRewardedVideoClicked(Class<T> cls, String str) {
        final String currentlyShowingAdUnitId = sInstance.mRewardedAdData.getCurrentlyShowingAdUnitId();
        if (TextUtils.isEmpty(currentlyShowingAdUnitId)) {
            postToInstance(new ForEachMoPubIdRunnable(cls, str) { // from class: com.mopub.mobileads.MoPubRewardedVideoManager.9
                @Override // com.mopub.mobileads.MoPubRewardedVideoManager.ForEachMoPubIdRunnable
                protected void forEach(String str2) {
                    MoPubRewardedVideoManager.onRewardedVideoClickedAction(str2);
                }
            });
        } else {
            postToInstance(new Runnable() { // from class: com.mopub.mobileads.MoPubRewardedVideoManager.10
                @Override // java.lang.Runnable
                public void run() {
                    MoPubRewardedVideoManager.onRewardedVideoClickedAction(currentlyShowingAdUnitId);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void onRewardedVideoClickedAction(String str) {
        Preconditions.checkNotNull(str);
        if (sInstance.mVideoListener != null) {
            sInstance.mVideoListener.onRewardedVideoClicked(str);
        }
        TrackingRequest.makeTrackingHttpRequest(sInstance.mAdRequestStatus.getClickTrackerUrlString(str), sInstance.mContext);
        sInstance.mAdRequestStatus.clearClickUrl(str);
    }

    public static <T extends CustomEventRewardedAd> void onRewardedVideoClosed(Class<T> cls, String str) {
        final String currentlyShowingAdUnitId = sInstance.mRewardedAdData.getCurrentlyShowingAdUnitId();
        if (TextUtils.isEmpty(currentlyShowingAdUnitId)) {
            postToInstance(new ForEachMoPubIdRunnable(cls, str) { // from class: com.mopub.mobileads.MoPubRewardedVideoManager.11
                @Override // com.mopub.mobileads.MoPubRewardedVideoManager.ForEachMoPubIdRunnable
                protected void forEach(String str2) {
                    MoPubRewardedVideoManager.onRewardedVideoClosedAction(str2);
                }
            });
        } else {
            postToInstance(new Runnable() { // from class: com.mopub.mobileads.MoPubRewardedVideoManager.12
                @Override // java.lang.Runnable
                public void run() {
                    MoPubRewardedVideoManager.onRewardedVideoClosedAction(currentlyShowingAdUnitId);
                }
            });
        }
        sInstance.mRewardedAdData.setCurrentlyShowingAdUnitId(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void onRewardedVideoClosedAction(String str) {
        Preconditions.checkNotNull(str);
        if (sInstance.mVideoListener != null) {
            sInstance.mVideoListener.onRewardedVideoClosed(str);
        }
    }

    public static <T extends CustomEventRewardedAd> void onRewardedVideoCompleted(Class<T> cls, String str, MoPubReward moPubReward) {
        String currentlyShowingAdUnitId = sInstance.mRewardedAdData.getCurrentlyShowingAdUnitId();
        rewardOnClient(cls, str, moPubReward, currentlyShowingAdUnitId);
        rewardOnServer(currentlyShowingAdUnitId);
    }

    private static void rewardOnServer(final String str) {
        final String serverCompletionUrl = sInstance.mRewardedAdData.getServerCompletionUrl(str);
        if (TextUtils.isEmpty(serverCompletionUrl)) {
            return;
        }
        postToInstance(new Runnable() { // from class: com.mopub.mobileads.MoPubRewardedVideoManager.13
            @Override // java.lang.Runnable
            public void run() {
                String num;
                MoPubReward moPubReward = MoPubRewardedVideoManager.sInstance.mRewardedAdData.getMoPubReward(str);
                String label = moPubReward == null ? "" : moPubReward.getLabel();
                if (moPubReward == null) {
                    num = Integer.toString(0);
                } else {
                    num = Integer.toString(moPubReward.getAmount());
                }
                String str2 = num;
                CustomEventRewardedAd customEvent = MoPubRewardedVideoManager.sInstance.mRewardedAdData.getCustomEvent(str);
                RewardedVideoCompletionRequestHandler.makeRewardedVideoCompletionRequest(MoPubRewardedVideoManager.sInstance.mContext, serverCompletionUrl, MoPubRewardedVideoManager.sInstance.mRewardedAdData.getCustomerId(), label, str2, (customEvent == null || customEvent.getClass() == null) ? null : customEvent.getClass().getName(), MoPubRewardedVideoManager.sInstance.mRewardedAdData.getCustomData(str));
            }
        });
    }

    private static <T extends CustomEventRewardedAd> void rewardOnClient(final Class<T> cls, final String str, final MoPubReward moPubReward, final String str2) {
        postToInstance(new Runnable() { // from class: com.mopub.mobileads.MoPubRewardedVideoManager.14
            @Override // java.lang.Runnable
            public void run() {
                MoPubReward chooseReward = MoPubRewardedVideoManager.chooseReward(MoPubRewardedVideoManager.sInstance.mRewardedAdData.getLastShownMoPubReward(cls), moPubReward);
                HashSet hashSet = new HashSet();
                if (TextUtils.isEmpty(str2)) {
                    hashSet.addAll(MoPubRewardedVideoManager.sInstance.mRewardedAdData.getMoPubIdsForAdNetwork(cls, str));
                } else {
                    hashSet.add(str2);
                }
                if (MoPubRewardedVideoManager.sInstance.mVideoListener != null) {
                    MoPubRewardedVideoManager.sInstance.mVideoListener.onRewardedVideoCompleted(hashSet, chooseReward);
                }
            }
        });
    }

    @VisibleForTesting
    static MoPubReward chooseReward(MoPubReward moPubReward, MoPubReward moPubReward2) {
        return (moPubReward2.isSuccessful() && moPubReward != null) ? moPubReward : moPubReward2;
    }

    private static void postToInstance(Runnable runnable) {
        if (sInstance != null) {
            sInstance.mCallbackHandler.post(runnable);
        }
    }

    private static void logErrorNotInitialized() {
        MoPubLog.e("MoPub rewarded ad was not initialized. You must call MoPub.initializeRewardedVideo() before loading or attempting to play rewarded ads.");
    }

    private static abstract class ForEachMoPubIdRunnable implements Runnable {
        private final Class<? extends CustomEventRewardedAd> mCustomEventClass;
        private final String mThirdPartyId;

        protected abstract void forEach(String str);

        ForEachMoPubIdRunnable(Class<? extends CustomEventRewardedAd> cls, String str) {
            Preconditions.checkNotNull(cls);
            Preconditions.checkNotNull(str);
            this.mCustomEventClass = cls;
            this.mThirdPartyId = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator<String> it = MoPubRewardedVideoManager.sInstance.mRewardedAdData.getMoPubIdsForAdNetwork(this.mCustomEventClass, this.mThirdPartyId).iterator();
            while (it.hasNext()) {
                forEach(it.next());
            }
        }
    }

    @VisibleForTesting
    @Deprecated
    static RewardedAdData getRewardedAdData() {
        if (sInstance != null) {
            return sInstance.mRewardedAdData;
        }
        return null;
    }

    @VisibleForTesting
    @Deprecated
    static AdRequestStatusMapping getAdRequestStatusMapping() {
        if (sInstance != null) {
            return sInstance.mAdRequestStatus;
        }
        return null;
    }

    @VisibleForTesting
    @Deprecated
    static void setCustomEventSharedPrefs(SharedPreferences sharedPreferences) {
        Preconditions.checkNotNull(sharedPreferences);
        sCustomEventSharedPrefs = sharedPreferences;
    }
}
