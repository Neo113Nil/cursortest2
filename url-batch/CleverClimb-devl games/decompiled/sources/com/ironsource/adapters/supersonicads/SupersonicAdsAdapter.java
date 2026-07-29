package com.ironsource.adapters.supersonicads;

import android.app.Activity;
import android.text.TextUtils;
import com.aiming.mdt.utils.Constants;
import com.facebook.ads.AudienceNetworkActivity;
import com.ironsource.b.b;
import com.ironsource.b.c;
import com.ironsource.b.d.c;
import com.ironsource.b.f.h;
import com.ironsource.b.f.l;
import com.ironsource.b.f.n;
import com.ironsource.b.f.u;
import com.ironsource.b.h.g;
import com.ironsource.b.h.i;
import com.ironsource.b.m;
import com.ironsource.sdk.a;
import com.ironsource.sdk.e.c;
import com.ironsource.sdk.e.d;
import com.ironsource.sdk.e.e;
import com.ironsource.sdk.g.f;
import com.tapjoy.TapjoyConstants;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
class SupersonicAdsAdapter extends b implements n, c, d, e {
    private static final String VERSION = "6.7.9";
    private final String AD_VISIBLE_EVENT_NAME;
    private final String APPLICATION_PRIVATE_KEY;
    private final String APPLICATION_USER_AGE_GROUP;
    private final String APPLICATION_USER_GENDER;
    private final String CAMPAIGN_ID;
    private final String CLIENT_SIDE_CALLBACKS;
    private final String CUSTOM_PARAM_PREFIX;
    private final String CUSTOM_SEGMENT;
    private final String DYNAMIC_CONTROLLER_CONFIG;
    private final String DYNAMIC_CONTROLLER_DEBUG_MODE;
    private final String DYNAMIC_CONTROLLER_URL;
    private final String ITEM_COUNT;
    private final String ITEM_NAME;
    private final String ITEM_SIGNATURE;
    private final String LANGUAGE;
    private final String MAX_VIDEO_LENGTH;
    private final String OW_PLACEMENT_ID;
    private final String SDK_PLUGIN_TYPE;
    private final String TIMESTAMP;
    private boolean mConsent;
    private boolean mDidSetConsent;
    private boolean mDidSetInitParams;
    private boolean mIsRVAvailable;
    private String mMediationSegment;
    private h mOfferwallListener;
    private com.ironsource.sdk.b mSSAPublisher;
    private String mUserAgeGroup;
    private String mUserGender;

    @Override // com.ironsource.b.f.r
    public void fetchRewardedVideo(JSONObject jSONObject) {
    }

    @Override // com.ironsource.b.b
    public String getVersion() {
        return VERSION;
    }

    public boolean isOfferwallAvailable() {
        return true;
    }

    @Override // com.ironsource.sdk.e.d
    public void onOWGeneric(String str, String str2) {
    }

    public static SupersonicAdsAdapter startAdapter(String str) {
        return new SupersonicAdsAdapter(str);
    }

    private SupersonicAdsAdapter(String str) {
        super(str);
        this.TIMESTAMP = TapjoyConstants.TJC_TIMESTAMP;
        this.ITEM_SIGNATURE = "itemSignature";
        this.SDK_PLUGIN_TYPE = "SDKPluginType";
        this.OW_PLACEMENT_ID = AudienceNetworkActivity.PLACEMENT_ID;
        this.mIsRVAvailable = false;
        this.mDidSetInitParams = false;
        this.DYNAMIC_CONTROLLER_URL = "controllerUrl";
        this.DYNAMIC_CONTROLLER_DEBUG_MODE = "debugMode";
        this.DYNAMIC_CONTROLLER_CONFIG = "controllerConfig";
        this.APPLICATION_USER_GENDER = "applicationUserGender";
        this.APPLICATION_USER_AGE_GROUP = "applicationUserAgeGroup";
        this.LANGUAGE = com.umeng.commonsdk.proguard.d.M;
        this.MAX_VIDEO_LENGTH = "maxVideoLength";
        this.CAMPAIGN_ID = "campaignId";
        this.CUSTOM_PARAM_PREFIX = "custom_";
        this.CUSTOM_SEGMENT = "custom_Segment";
        this.ITEM_NAME = "itemName";
        this.ITEM_COUNT = "itemCount";
        this.APPLICATION_PRIVATE_KEY = "privateKey";
        this.CLIENT_SIDE_CALLBACKS = "useClientSideCallbacks";
        this.AD_VISIBLE_EVENT_NAME = "impressions";
    }

    public static com.ironsource.b.h getIntegrationData(Activity activity) {
        com.ironsource.b.h hVar = new com.ironsource.b.h("SupersonicAds", VERSION);
        hVar.f6924c = new String[]{"com.ironsource.sdk.controller.ControllerActivity", "com.ironsource.sdk.controller.InterstitialActivity", "com.ironsource.sdk.controller.OpenUrlActivity"};
        return hVar;
    }

    @Override // com.ironsource.b.b
    public String getCoreSDKVersion() {
        return f.e();
    }

    @Override // com.ironsource.b.b
    public void onPause(Activity activity) {
        if (this.mSSAPublisher != null) {
            this.mSSAPublisher.a(activity);
        }
    }

    @Override // com.ironsource.b.b
    public void onResume(Activity activity) {
        if (this.mSSAPublisher != null) {
            this.mSSAPublisher.b(activity);
        }
    }

    @Override // com.ironsource.b.b
    public void setAge(int i) {
        if (i >= 13 && i <= 17) {
            this.mUserAgeGroup = "1";
            return;
        }
        if (i >= 18 && i <= 20) {
            this.mUserAgeGroup = "2";
            return;
        }
        if (i >= 21 && i <= 24) {
            this.mUserAgeGroup = Constants.ALL_LOAD;
            return;
        }
        if (i >= 25 && i <= 34) {
            this.mUserAgeGroup = Constants.ALL_READY;
            return;
        }
        if (i >= 35 && i <= 44) {
            this.mUserAgeGroup = "5";
            return;
        }
        if (i >= 45 && i <= 54) {
            this.mUserAgeGroup = "6";
            return;
        }
        if (i >= 55 && i <= 64) {
            this.mUserAgeGroup = "7";
        } else if (i > 65 && i <= 120) {
            this.mUserAgeGroup = "8";
        } else {
            this.mUserAgeGroup = "0";
        }
    }

    @Override // com.ironsource.b.b
    public void setGender(String str) {
        this.mUserGender = str;
    }

    @Override // com.ironsource.b.b
    public void setMediationSegment(String str) {
        this.mMediationSegment = str;
    }

    @Override // com.ironsource.b.f.r
    public void initRewardedVideo(final Activity activity, final String str, final String str2, final JSONObject jSONObject, u uVar) {
        if (!this.mDidSetInitParams) {
            setParamsBeforeInit(jSONObject);
        }
        activity.runOnUiThread(new Runnable() { // from class: com.ironsource.adapters.supersonicads.SupersonicAdsAdapter.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    SupersonicAdsAdapter.this.mSSAPublisher = a.a(activity);
                    HashMap rewardedVideoExtraParams = SupersonicAdsAdapter.this.getRewardedVideoExtraParams(jSONObject);
                    if (SupersonicAdsAdapter.this.mDidSetConsent) {
                        SupersonicAdsAdapter.this.applyConsent(SupersonicAdsAdapter.this.mConsent);
                    }
                    SupersonicAdsAdapter.this.mSSAPublisher.a(str, str2, SupersonicAdsAdapter.this.getProviderName(), (Map<String, String>) rewardedVideoExtraParams, (e) SupersonicAdsAdapter.this);
                } catch (Exception e) {
                    e.printStackTrace();
                    SupersonicAdsAdapter.this.onRVInitFail("initRewardedVideo");
                }
            }
        });
    }

    @Override // com.ironsource.b.f.r
    public void showRewardedVideo(JSONObject jSONObject, u uVar) {
        this.mActiveRewardedVideoSmash = uVar;
        if (this.mSSAPublisher != null) {
            int b2 = i.a().b(1);
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("demandSourceName", getProviderName());
                jSONObject2.put("sessionDepth", b2);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            this.mSSAPublisher.a(jSONObject2);
            return;
        }
        this.mIsRVAvailable = false;
        if (this.mActiveRewardedVideoSmash != null) {
            this.mActiveRewardedVideoSmash.a(com.ironsource.b.h.d.a("Rewarded Video"));
        }
        Iterator<u> it = this.mAllRewardedVideoSmashes.iterator();
        while (it.hasNext()) {
            u next = it.next();
            if (next != null) {
                next.b(false);
            }
        }
    }

    @Override // com.ironsource.b.f.r
    public synchronized boolean isRewardedVideoAvailable(JSONObject jSONObject) {
        return this.mIsRVAvailable;
    }

    @Override // com.ironsource.b.f.i
    public void initInterstitial(final Activity activity, final String str, final String str2, JSONObject jSONObject, l lVar) {
        if (!this.mDidSetInitParams) {
            setParamsBeforeInit(jSONObject);
        }
        activity.runOnUiThread(new Runnable() { // from class: com.ironsource.adapters.supersonicads.SupersonicAdsAdapter.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    SupersonicAdsAdapter.this.mSSAPublisher = a.a(activity);
                    HashMap interstitialExtraParams = SupersonicAdsAdapter.this.getInterstitialExtraParams();
                    if (SupersonicAdsAdapter.this.mDidSetConsent) {
                        SupersonicAdsAdapter.this.applyConsent(SupersonicAdsAdapter.this.mConsent);
                    }
                    SupersonicAdsAdapter.this.mSSAPublisher.a(str, str2, SupersonicAdsAdapter.this.getProviderName(), (Map<String, String>) interstitialExtraParams, (c) SupersonicAdsAdapter.this);
                } catch (Exception e) {
                    e.printStackTrace();
                    SupersonicAdsAdapter.this.onInterstitialInitFailed(e.getMessage());
                }
            }
        });
    }

    @Override // com.ironsource.b.f.i
    public void loadInterstitial(JSONObject jSONObject, l lVar) {
        if (this.mSSAPublisher != null) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("demandSourceName", getProviderName());
            } catch (JSONException e) {
                e.printStackTrace();
            }
            this.mSSAPublisher.b(jSONObject2);
            return;
        }
        log(c.a.NATIVE, "Please call initInterstitial before calling loadInterstitial", 2);
        Iterator<l> it = this.mAllInterstitialSmashes.iterator();
        while (it.hasNext()) {
            l next = it.next();
            if (next != null) {
                next.a_(com.ironsource.b.h.d.e("Load was called before Init"));
            }
        }
    }

    @Override // com.ironsource.b.f.i
    public void showInterstitial(JSONObject jSONObject, l lVar) {
        this.mActiveInterstitialSmash = lVar;
        if (this.mSSAPublisher != null) {
            int b2 = i.a().b(2);
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("demandSourceName", getProviderName());
                jSONObject2.put("sessionDepth", b2);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            this.mSSAPublisher.c(jSONObject2);
            return;
        }
        log(c.a.NATIVE, "Please call loadInterstitial before calling showInterstitial", 2);
        if (this.mActiveInterstitialSmash != null) {
            this.mActiveInterstitialSmash.c(com.ironsource.b.h.d.a(Constants.ADTYPE_INTERSTITIAL));
        }
    }

    @Override // com.ironsource.b.f.i
    public boolean isInterstitialReady(JSONObject jSONObject) {
        return this.mSSAPublisher != null && this.mSSAPublisher.a(getProviderName());
    }

    @Override // com.ironsource.b.f.n
    public void setInternalOfferwallListener(h hVar) {
        this.mOfferwallListener = hVar;
    }

    @Override // com.ironsource.b.f.n
    public void initOfferwall(final Activity activity, final String str, final String str2, final JSONObject jSONObject) {
        if (!this.mDidSetInitParams) {
            setParamsBeforeInit(jSONObject);
        }
        activity.runOnUiThread(new Runnable() { // from class: com.ironsource.adapters.supersonicads.SupersonicAdsAdapter.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    HashMap offerwallExtraParams = SupersonicAdsAdapter.this.getOfferwallExtraParams(jSONObject);
                    SupersonicAdsAdapter.this.mSSAPublisher = a.a(activity);
                    if (SupersonicAdsAdapter.this.mDidSetConsent) {
                        SupersonicAdsAdapter.this.applyConsent(SupersonicAdsAdapter.this.mConsent);
                    }
                    SupersonicAdsAdapter.this.mSSAPublisher.a(str, str2, offerwallExtraParams, SupersonicAdsAdapter.this);
                } catch (Exception e) {
                    e.printStackTrace();
                    com.ironsource.b.d.d.c().a(c.a.ADAPTER_API, SupersonicAdsAdapter.this.getProviderName() + ":initOfferwall(userId:" + str2 + ")", e);
                    SupersonicAdsAdapter.this.mOfferwallListener.a(false, com.ironsource.b.h.d.b("Adapter initialization failure - " + SupersonicAdsAdapter.this.getProviderName() + " - " + e.getMessage(), "Offerwall"));
                }
            }
        });
    }

    public void getOfferwallCredits() {
        if (this.mSSAPublisher != null) {
            this.mSSAPublisher.a(m.a().j(), m.a().k(), this);
            return;
        }
        log(c.a.NATIVE, "Please call init before calling getOfferwallCredits", 2);
    }

    public void showOfferwall(String str, JSONObject jSONObject) {
        HashMap<String, String> offerwallExtraParams = getOfferwallExtraParams(jSONObject);
        if (offerwallExtraParams != null) {
            offerwallExtraParams.put(AudienceNetworkActivity.PLACEMENT_ID, str);
        }
        if (this.mSSAPublisher != null) {
            this.mSSAPublisher.a(offerwallExtraParams);
        } else {
            log(c.a.NATIVE, "Please call init before calling showOfferwall", 2);
        }
    }

    private synchronized void setParamsBeforeInit(JSONObject jSONObject) {
        this.mDidSetInitParams = true;
        f.d(jSONObject.optString("controllerUrl"));
        if (isAdaptersDebugEnabled()) {
            f.c(3);
        } else {
            f.c(jSONObject.optInt("debugMode", 0));
        }
        f.e(jSONObject.optString("controllerConfig", ""));
    }

    private HashMap<String, String> getGenenralExtraParams() {
        HashMap<String, String> hashMap = new HashMap<>();
        if (!TextUtils.isEmpty(this.mUserAgeGroup)) {
            hashMap.put("applicationUserAgeGroup", this.mUserAgeGroup);
        }
        if (!TextUtils.isEmpty(this.mUserGender)) {
            hashMap.put("applicationUserGender", this.mUserGender);
        }
        String pluginType = getPluginType();
        if (!TextUtils.isEmpty(pluginType)) {
            hashMap.put("SDKPluginType", pluginType);
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public HashMap<String, String> getRewardedVideoExtraParams(JSONObject jSONObject) {
        HashMap<String, String> genenralExtraParams = getGenenralExtraParams();
        String optString = jSONObject.optString(com.umeng.commonsdk.proguard.d.M);
        if (!TextUtils.isEmpty(optString)) {
            genenralExtraParams.put(com.umeng.commonsdk.proguard.d.M, optString);
        }
        String optString2 = jSONObject.optString("maxVideoLength");
        if (!TextUtils.isEmpty(optString2)) {
            genenralExtraParams.put("maxVideoLength", optString2);
        }
        String optString3 = jSONObject.optString("campaignId");
        if (!TextUtils.isEmpty(optString3)) {
            genenralExtraParams.put("campaignId", optString3);
        }
        if (!TextUtils.isEmpty(this.mMediationSegment)) {
            genenralExtraParams.put("custom_Segment", this.mMediationSegment);
        }
        addItemNameCountSignature(genenralExtraParams, jSONObject);
        Map<String, String> rewardedVideoCustomParams = SupersonicConfig.getConfigObj().getRewardedVideoCustomParams();
        if (rewardedVideoCustomParams != null && !rewardedVideoCustomParams.isEmpty()) {
            genenralExtraParams.putAll(rewardedVideoCustomParams);
        }
        return genenralExtraParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public HashMap<String, String> getInterstitialExtraParams() {
        return getGenenralExtraParams();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public HashMap<String, String> getOfferwallExtraParams(JSONObject jSONObject) {
        HashMap<String, String> genenralExtraParams = getGenenralExtraParams();
        String optString = jSONObject.optString(com.umeng.commonsdk.proguard.d.M);
        if (!TextUtils.isEmpty(optString)) {
            genenralExtraParams.put(com.umeng.commonsdk.proguard.d.M, optString);
        }
        genenralExtraParams.put("useClientSideCallbacks", String.valueOf(SupersonicConfig.getConfigObj().getClientSideCallbacks()));
        Map<String, String> offerwallCustomParams = SupersonicConfig.getConfigObj().getOfferwallCustomParams();
        if (offerwallCustomParams != null && !offerwallCustomParams.isEmpty()) {
            genenralExtraParams.putAll(offerwallCustomParams);
        }
        addItemNameCountSignature(genenralExtraParams, jSONObject);
        return genenralExtraParams;
    }

    private void addItemNameCountSignature(HashMap<String, String> hashMap, JSONObject jSONObject) {
        try {
            String optString = jSONObject.optString("itemName");
            int optInt = jSONObject.optInt("itemCount", -1);
            String optString2 = jSONObject.optString("privateKey");
            boolean z = true;
            if (TextUtils.isEmpty(optString)) {
                z = false;
            } else {
                hashMap.put("itemName", optString);
            }
            if (TextUtils.isEmpty(optString2)) {
                z = false;
            }
            if (optInt == -1) {
                z = false;
            } else {
                hashMap.put("itemCount", String.valueOf(optInt));
            }
            if (z) {
                int c2 = g.c();
                hashMap.put(TapjoyConstants.TJC_TIMESTAMP, String.valueOf(c2));
                hashMap.put("itemSignature", createItemSig(c2, optString, optInt, optString2));
            }
        } catch (Exception e) {
            com.ironsource.b.d.d.c().a(c.a.ADAPTER_API, " addItemNameCountSignature", e);
        }
    }

    private String createItemSig(int i, String str, int i2, String str2) {
        return g.b(i + str + i2 + str2);
    }

    private String createMinimumOfferCommissionSig(double d2, String str) {
        return g.b(d2 + str);
    }

    private String createUserCreationDateSig(String str, String str2, String str3) {
        return g.b(str + str2 + str3);
    }

    @Override // com.ironsource.sdk.e.e
    public void onRVNoMoreOffers() {
        com.ironsource.b.d.d.c().a(c.a.INTERNAL, getProviderName() + " :onRVNoMoreOffers ", 1);
        this.mIsRVAvailable = false;
        Iterator<u> it = this.mAllRewardedVideoSmashes.iterator();
        while (it.hasNext()) {
            u next = it.next();
            if (next != null) {
                next.b(false);
            }
        }
    }

    @Override // com.ironsource.sdk.e.e
    public void onRVInitSuccess(com.ironsource.sdk.data.a aVar) {
        int i;
        com.ironsource.b.d.d.c().a(c.a.INTERNAL, getProviderName() + " :onRVInitSuccess ", 1);
        try {
            i = Integer.parseInt(aVar.a());
        } catch (NumberFormatException e) {
            com.ironsource.b.d.d.c().a(c.a.NATIVE, "onRVInitSuccess:parseInt()", e);
            i = 0;
        }
        boolean z = i > 0;
        this.mIsRVAvailable = z;
        Iterator<u> it = this.mAllRewardedVideoSmashes.iterator();
        while (it.hasNext()) {
            u next = it.next();
            if (next != null) {
                next.b(z);
            }
        }
    }

    @Override // com.ironsource.sdk.e.e
    public void onRVInitFail(String str) {
        com.ironsource.b.d.d.c().a(c.a.INTERNAL, getProviderName() + " :onRVInitFail ", 1);
        Iterator<u> it = this.mAllRewardedVideoSmashes.iterator();
        while (it.hasNext()) {
            u next = it.next();
            if (next != null) {
                next.b(false);
            }
        }
    }

    @Override // com.ironsource.sdk.e.e
    public void onRVAdClicked() {
        com.ironsource.b.d.d.c().a(c.a.INTERNAL, getProviderName() + " :onRVAdClicked ", 1);
        if (this.mActiveRewardedVideoSmash != null) {
            this.mActiveRewardedVideoSmash.B();
        }
    }

    @Override // com.ironsource.sdk.e.e
    public void onRVEventNotificationReceived(String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            com.ironsource.b.d.d.c().a(c.a.INTERNAL, getProviderName() + " :onRVEventNotificationReceived: " + str + " extData: " + jSONObject.toString(), 1);
        }
        if (TextUtils.isEmpty(str) || !"impressions".equals(str) || this.mActiveRewardedVideoSmash == null) {
            return;
        }
        this.mActiveRewardedVideoSmash.C();
    }

    @Override // com.ironsource.sdk.e.e
    public void onRVShowFail(String str) {
        com.ironsource.b.d.d.c().a(c.a.INTERNAL, getProviderName() + " :onRVShowFail ", 1);
        if (this.mActiveRewardedVideoSmash != null) {
            this.mActiveRewardedVideoSmash.a(new com.ironsource.b.d.b(509, str));
        }
    }

    @Override // com.ironsource.sdk.e.e
    public void onRVAdCredited(int i) {
        com.ironsource.b.d.d.c().a(c.a.INTERNAL, getProviderName() + " :onRVAdCredited ", 1);
        if (this.mActiveRewardedVideoSmash != null) {
            this.mActiveRewardedVideoSmash.A();
        }
    }

    @Override // com.ironsource.sdk.e.e
    public void onRVAdClosed() {
        com.ironsource.b.d.d.c().a(c.a.INTERNAL, getProviderName() + " :onRVAdClosed ", 1);
        if (this.mActiveRewardedVideoSmash != null) {
            this.mActiveRewardedVideoSmash.z();
        }
    }

    @Override // com.ironsource.sdk.e.e
    public void onRVAdOpened() {
        com.ironsource.b.d.d.c().a(c.a.INTERNAL, getProviderName() + " :onRVAdOpened ", 1);
        if (this.mActiveRewardedVideoSmash != null) {
            this.mActiveRewardedVideoSmash.y();
        }
    }

    @Override // com.ironsource.sdk.e.c
    public void onInterstitialInitSuccess() {
        com.ironsource.b.d.d.c().a(c.a.INTERNAL, getProviderName() + " :onInterstitialInitSuccess ", 1);
        Iterator<l> it = this.mAllInterstitialSmashes.iterator();
        while (it.hasNext()) {
            l next = it.next();
            if (next != null) {
                next.y();
            }
        }
    }

    @Override // com.ironsource.sdk.e.c
    public void onInterstitialInitFailed(String str) {
        com.ironsource.b.d.d.c().a(c.a.INTERNAL, getProviderName() + " :onInterstitialInitFailed ", 1);
        Iterator<l> it = this.mAllInterstitialSmashes.iterator();
        while (it.hasNext()) {
            l next = it.next();
            if (next != null) {
                next.a(com.ironsource.b.h.d.b(str, Constants.ADTYPE_INTERSTITIAL));
            }
        }
    }

    @Override // com.ironsource.sdk.e.c
    public void onInterstitialLoadSuccess() {
        com.ironsource.b.d.d.c().a(c.a.INTERNAL, getProviderName() + " :onInterstitialLoadSuccess ", 1);
        Iterator<l> it = this.mAllInterstitialSmashes.iterator();
        while (it.hasNext()) {
            l next = it.next();
            if (next != null) {
                next.z();
            }
        }
    }

    @Override // com.ironsource.sdk.e.c
    public void onInterstitialLoadFailed(String str) {
        com.ironsource.b.d.d.c().a(c.a.INTERNAL, getProviderName() + " :onInterstitialAdLoadFailed ", 1);
        Iterator<l> it = this.mAllInterstitialSmashes.iterator();
        while (it.hasNext()) {
            l next = it.next();
            if (next != null) {
                next.a_(com.ironsource.b.h.d.e(str));
            }
        }
    }

    @Override // com.ironsource.sdk.e.c
    public void onInterstitialOpen() {
        com.ironsource.b.d.d.c().a(c.a.INTERNAL, getProviderName() + " :onInterstitialAdOpened ", 1);
        if (this.mActiveInterstitialSmash != null) {
            this.mActiveInterstitialSmash.A();
        }
    }

    @Override // com.ironsource.sdk.e.c
    public void onInterstitialClose() {
        com.ironsource.b.d.d.c().a(c.a.INTERNAL, getProviderName() + " :onInterstitialAdClosed ", 1);
        if (this.mActiveInterstitialSmash != null) {
            this.mActiveInterstitialSmash.B();
        }
    }

    @Override // com.ironsource.sdk.e.c
    public void onInterstitialShowSuccess() {
        com.ironsource.b.d.d.c().a(c.a.INTERNAL, getProviderName() + " :onInterstitialAdShowSucceeded ", 1);
        if (this.mActiveInterstitialSmash != null) {
            this.mActiveInterstitialSmash.C();
        }
    }

    @Override // com.ironsource.sdk.e.c
    public void onInterstitialShowFailed(String str) {
        com.ironsource.b.d.d.c().a(c.a.INTERNAL, getProviderName() + " :onInterstitialAdShowFailed ", 1);
        if (this.mActiveInterstitialSmash != null) {
            this.mActiveInterstitialSmash.c(com.ironsource.b.h.d.c(Constants.ADTYPE_INTERSTITIAL, str));
        }
    }

    @Override // com.ironsource.sdk.e.c
    public void onInterstitialClick() {
        com.ironsource.b.d.d.c().a(c.a.INTERNAL, getProviderName() + " :onInterstitialAdClicked ", 1);
        if (this.mActiveInterstitialSmash != null) {
            this.mActiveInterstitialSmash.D();
        }
    }

    @Override // com.ironsource.sdk.e.c
    public void onInterstitialEventNotificationReceived(String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            com.ironsource.b.d.d.c().a(c.a.INTERNAL, getProviderName() + " :onInterstitialEventNotificationReceived: " + str + " extData: " + jSONObject.toString(), 1);
            if (TextUtils.isEmpty(str) || !"impressions".equals(str) || this.mActiveInterstitialSmash == null) {
                return;
            }
            this.mActiveInterstitialSmash.E();
        }
    }

    @Override // com.ironsource.sdk.e.d
    public void onOfferwallInitSuccess() {
        com.ironsource.b.d.d.c().a(c.a.INTERNAL, getProviderName() + " :onOfferwallInitSuccess ", 1);
        if (this.mOfferwallListener != null) {
            this.mOfferwallListener.a(true);
        }
    }

    @Override // com.ironsource.sdk.e.d
    public void onOfferwallInitFail(String str) {
        com.ironsource.b.d.d.c().a(c.a.INTERNAL, getProviderName() + " :onOfferwallInitFail ", 1);
        if (this.mOfferwallListener != null) {
            this.mOfferwallListener.a(false, com.ironsource.b.h.d.b(str));
        }
    }

    @Override // com.ironsource.sdk.e.d
    public void onOfferwallEventNotificationReceived(String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            com.ironsource.b.d.d.c().a(c.a.INTERNAL, getProviderName() + " :onOfferwallEventNotificationReceived ", 1);
        }
    }

    @Override // com.ironsource.sdk.e.d
    public void onOWShowSuccess(String str) {
        if (TextUtils.isEmpty(str)) {
            log(c.a.ADAPTER_API, getProviderName() + ":onOWShowSuccess()", 1);
        } else {
            log(c.a.ADAPTER_API, getProviderName() + ":onOWShowSuccess(placementId:" + str + ")", 1);
        }
        if (this.mOfferwallListener != null) {
            this.mOfferwallListener.a();
        }
    }

    @Override // com.ironsource.sdk.e.d
    public void onOWShowFail(String str) {
        com.ironsource.b.d.d.c().a(c.a.INTERNAL, getProviderName() + " :onOWShowFail ", 1);
        if (this.mOfferwallListener != null) {
            this.mOfferwallListener.a(com.ironsource.b.h.d.b(str));
        }
    }

    @Override // com.ironsource.sdk.e.d
    public boolean onOWAdCredited(int i, int i2, boolean z) {
        com.ironsource.b.d.d.c().a(c.a.INTERNAL, getProviderName() + " :onOWAdCredited ", 1);
        return this.mOfferwallListener != null && this.mOfferwallListener.a(i, i2, z);
    }

    @Override // com.ironsource.sdk.e.d
    public void onOWAdClosed() {
        com.ironsource.b.d.d.c().a(c.a.INTERNAL, getProviderName() + " :onOWAdClosed ", 1);
        if (this.mOfferwallListener != null) {
            this.mOfferwallListener.b();
        }
    }

    @Override // com.ironsource.sdk.e.d
    public void onGetOWCreditsFailed(String str) {
        com.ironsource.b.d.d.c().a(c.a.INTERNAL, getProviderName() + " :onGetOWCreditsFailed ", 1);
        if (this.mOfferwallListener != null) {
            this.mOfferwallListener.b(com.ironsource.b.h.d.b(str));
        }
    }

    @Override // com.ironsource.b.b
    protected void setMediationState(c.a aVar, String str) {
        if (this.mSSAPublisher != null) {
            com.ironsource.b.d.d.c().a(c.a.INTERNAL, getProviderName() + " :setMediationState(" + str + " , " + getProviderName() + " , " + aVar.a() + ")", 1);
            this.mSSAPublisher.a(str, getProviderName(), aVar.a());
        }
    }

    @Override // com.ironsource.b.b
    protected void setConsent(boolean z) {
        this.mDidSetConsent = true;
        this.mConsent = z;
        applyConsent(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void applyConsent(boolean z) {
        if (this.mSSAPublisher == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("gdprConsentStatus", String.valueOf(z));
            jSONObject.put("demandSourceName", getProviderName());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        this.mSSAPublisher.d(jSONObject);
    }
}
