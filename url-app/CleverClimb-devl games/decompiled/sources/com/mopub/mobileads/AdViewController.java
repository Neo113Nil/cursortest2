package com.mopub.mobileads;

import android.content.Context;
import android.location.Location;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.mopub.common.AdReport;
import com.mopub.common.ClientMetadata;
import com.mopub.common.Constants;
import com.mopub.common.MoPub;
import com.mopub.common.Preconditions;
import com.mopub.common.VisibleForTesting;
import com.mopub.common.logging.MoPubLog;
import com.mopub.common.util.DeviceUtils;
import com.mopub.common.util.Dips;
import com.mopub.common.util.Utils;
import com.mopub.mraid.MraidNativeCommandHandler;
import com.mopub.network.AdRequest;
import com.mopub.network.AdResponse;
import com.mopub.network.MoPubNetworkError;
import com.mopub.network.Networking;
import com.mopub.network.TrackingRequest;
import com.mopub.volley.NetworkResponse;
import com.mopub.volley.VolleyError;
import com.tapjoy.TJAdUnitConstants;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public class AdViewController {
    static final double BACKOFF_FACTOR = 1.5d;
    static final int DEFAULT_REFRESH_TIME_MILLISECONDS = 60000;
    static final int MAX_REFRESH_TIME_MILLISECONDS = 600000;
    private static final FrameLayout.LayoutParams WRAP_AND_CENTER_LAYOUT_PARAMS = new FrameLayout.LayoutParams(-2, -2, 17);
    private static final WeakHashMap<View, Boolean> sViewShouldHonorServerDimensions = new WeakHashMap<>();
    private AdRequest mActiveRequest;
    private AdResponse mAdResponse;
    private String mAdUnitId;
    private boolean mAdWasLoaded;
    private Context mContext;
    private String mCustomEventClassName;
    private boolean mIsDestroyed;
    private boolean mIsLoading;
    private boolean mIsTesting;
    private String mKeywords;
    private Location mLocation;
    private MoPubView mMoPubView;
    private String mUrl;
    private WebViewAdUrlGenerator mUrlGenerator;
    private String mUserDataKeywords;

    @VisibleForTesting
    int mBackoffPower = 1;
    private Map<String, Object> mLocalExtras = new HashMap();
    private boolean mCurrentAutoRefreshStatus = true;
    private boolean mShouldAllowAutoRefresh = true;
    private int mTimeoutMilliseconds = -1;
    private final long mBroadcastIdentifier = Utils.generateUniqueId();
    private final AdRequest.Listener mAdListener = new AdRequest.Listener() { // from class: com.mopub.mobileads.AdViewController.1
        @Override // com.mopub.network.AdRequest.Listener
        public void onSuccess(AdResponse adResponse) {
            AdViewController.this.onAdLoadSuccess(adResponse);
        }

        @Override // com.mopub.volley.Response.ErrorListener
        public void onErrorResponse(VolleyError volleyError) {
            AdViewController.this.onAdLoadError(volleyError);
        }
    };
    private final Runnable mRefreshRunnable = new Runnable() { // from class: com.mopub.mobileads.AdViewController.2
        @Override // java.lang.Runnable
        public void run() {
            AdViewController.this.internalLoadAd();
        }
    };
    private Integer mRefreshTimeMillis = Integer.valueOf(DEFAULT_REFRESH_TIME_MILLISECONDS);
    private Handler mHandler = new Handler();

    public static void setShouldHonorServerDimensions(View view) {
        sViewShouldHonorServerDimensions.put(view, true);
    }

    private static boolean getShouldHonorServerDimensions(View view) {
        return sViewShouldHonorServerDimensions.get(view) != null;
    }

    public AdViewController(Context context, MoPubView moPubView) {
        this.mContext = context;
        this.mMoPubView = moPubView;
        this.mUrlGenerator = new WebViewAdUrlGenerator(this.mContext.getApplicationContext(), MraidNativeCommandHandler.isStorePictureSupported(this.mContext));
    }

    @VisibleForTesting
    void onAdLoadSuccess(AdResponse adResponse) {
        this.mBackoffPower = 1;
        this.mAdResponse = adResponse;
        this.mCustomEventClassName = adResponse.getCustomEventClassName();
        this.mTimeoutMilliseconds = this.mAdResponse.getAdTimeoutMillis() == null ? this.mTimeoutMilliseconds : this.mAdResponse.getAdTimeoutMillis().intValue();
        this.mRefreshTimeMillis = this.mAdResponse.getRefreshTimeMillis();
        setNotLoading();
        loadCustomEvent(this.mMoPubView, adResponse.getCustomEventClassName(), adResponse.getServerExtras());
        scheduleRefreshTimerIfEnabled();
    }

    @VisibleForTesting
    void onAdLoadError(VolleyError volleyError) {
        if (volleyError instanceof MoPubNetworkError) {
            MoPubNetworkError moPubNetworkError = (MoPubNetworkError) volleyError;
            if (moPubNetworkError.getRefreshTimeMillis() != null) {
                this.mRefreshTimeMillis = moPubNetworkError.getRefreshTimeMillis();
            }
        }
        MoPubErrorCode errorCodeFromVolleyError = getErrorCodeFromVolleyError(volleyError, this.mContext);
        if (errorCodeFromVolleyError == MoPubErrorCode.SERVER_ERROR) {
            this.mBackoffPower++;
        }
        setNotLoading();
        adDidFail(errorCodeFromVolleyError);
    }

    @VisibleForTesting
    void loadCustomEvent(MoPubView moPubView, String str, Map<String, String> map) {
        Preconditions.checkNotNull(map);
        if (moPubView == null) {
            MoPubLog.d("Can't load an ad in this ad view because it was destroyed.");
        } else {
            moPubView.loadCustomEvent(str, map);
        }
    }

    @VisibleForTesting
    static MoPubErrorCode getErrorCodeFromVolleyError(VolleyError volleyError, Context context) {
        NetworkResponse networkResponse = volleyError.networkResponse;
        if (volleyError instanceof MoPubNetworkError) {
            switch (((MoPubNetworkError) volleyError).getReason()) {
                case WARMING_UP:
                    return MoPubErrorCode.WARMUP;
                case NO_FILL:
                    return MoPubErrorCode.NO_FILL;
                default:
                    return MoPubErrorCode.UNSPECIFIED;
            }
        }
        if (networkResponse == null) {
            if (!DeviceUtils.isNetworkAvailable(context)) {
                return MoPubErrorCode.NO_CONNECTION;
            }
            return MoPubErrorCode.UNSPECIFIED;
        }
        if (volleyError.networkResponse.statusCode >= 400) {
            return MoPubErrorCode.SERVER_ERROR;
        }
        return MoPubErrorCode.UNSPECIFIED;
    }

    public MoPubView getMoPubView() {
        return this.mMoPubView;
    }

    public void loadAd() {
        this.mBackoffPower = 1;
        internalLoadAd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void internalLoadAd() {
        this.mAdWasLoaded = true;
        if (TextUtils.isEmpty(this.mAdUnitId)) {
            MoPubLog.d("Can't load an ad in this ad view because the ad unit ID is not set. Did you forget to call setAdUnitId()?");
        } else if (!isNetworkAvailable()) {
            MoPubLog.d("Can't load an ad because there is no network connectivity.");
            scheduleRefreshTimerIfEnabled();
        } else {
            loadNonJavascript(generateAdUrl());
        }
    }

    void loadNonJavascript(String str) {
        if (str == null) {
            return;
        }
        if (!str.startsWith("javascript:")) {
            MoPubLog.d("Loading url: " + str);
        }
        if (this.mIsLoading) {
            if (TextUtils.isEmpty(this.mAdUnitId)) {
                return;
            }
            MoPubLog.i("Already loading an ad for " + this.mAdUnitId + ", wait to finish.");
            return;
        }
        this.mUrl = str;
        this.mIsLoading = true;
        fetchAd(this.mUrl);
    }

    public void reload() {
        MoPubLog.d("Reload ad: " + this.mUrl);
        loadNonJavascript(this.mUrl);
    }

    boolean loadFailUrl(MoPubErrorCode moPubErrorCode) {
        this.mIsLoading = false;
        StringBuilder sb = new StringBuilder();
        sb.append("MoPubErrorCode: ");
        sb.append(moPubErrorCode == null ? "" : moPubErrorCode.toString());
        Log.v("MoPub", sb.toString());
        String failoverUrl = this.mAdResponse == null ? "" : this.mAdResponse.getFailoverUrl();
        if (!TextUtils.isEmpty(failoverUrl)) {
            MoPubLog.d("Loading failover url: " + failoverUrl);
            loadNonJavascript(failoverUrl);
            return true;
        }
        adDidFail(MoPubErrorCode.NO_FILL);
        return false;
    }

    void setNotLoading() {
        this.mIsLoading = false;
        if (this.mActiveRequest != null) {
            if (!this.mActiveRequest.isCanceled()) {
                this.mActiveRequest.cancel();
            }
            this.mActiveRequest = null;
        }
    }

    public String getKeywords() {
        return this.mKeywords;
    }

    public void setKeywords(String str) {
        this.mKeywords = str;
    }

    public String getUserDataKeywords() {
        if (MoPub.canCollectPersonalInformation()) {
            return this.mUserDataKeywords;
        }
        return null;
    }

    public void setUserDataKeywords(String str) {
        if (!MoPub.canCollectPersonalInformation()) {
            this.mUserDataKeywords = null;
        } else {
            this.mUserDataKeywords = str;
        }
    }

    public Location getLocation() {
        if (MoPub.canCollectPersonalInformation()) {
            return this.mLocation;
        }
        return null;
    }

    public void setLocation(Location location) {
        if (!MoPub.canCollectPersonalInformation()) {
            this.mLocation = null;
        } else {
            this.mLocation = location;
        }
    }

    public String getAdUnitId() {
        return this.mAdUnitId;
    }

    public String getCustomEventClassName() {
        return this.mCustomEventClassName;
    }

    public void setAdUnitId(String str) {
        this.mAdUnitId = str;
    }

    public long getBroadcastIdentifier() {
        return this.mBroadcastIdentifier;
    }

    public int getAdWidth() {
        if (this.mAdResponse == null || this.mAdResponse.getWidth() == null) {
            return 0;
        }
        return this.mAdResponse.getWidth().intValue();
    }

    public int getAdHeight() {
        if (this.mAdResponse == null || this.mAdResponse.getHeight() == null) {
            return 0;
        }
        return this.mAdResponse.getHeight().intValue();
    }

    @Deprecated
    public boolean getAutorefreshEnabled() {
        return getCurrentAutoRefreshStatus();
    }

    public boolean getCurrentAutoRefreshStatus() {
        return this.mCurrentAutoRefreshStatus;
    }

    void pauseRefresh() {
        setAutoRefreshStatus(false);
    }

    void resumeRefresh() {
        if (this.mShouldAllowAutoRefresh) {
            setAutoRefreshStatus(true);
        }
    }

    void setShouldAllowAutoRefresh(boolean z) {
        this.mShouldAllowAutoRefresh = z;
        setAutoRefreshStatus(z);
    }

    private void setAutoRefreshStatus(boolean z) {
        if (this.mAdWasLoaded && this.mCurrentAutoRefreshStatus != z) {
            MoPubLog.d("Refresh " + (z ? TJAdUnitConstants.String.ENABLED : "disabled") + " for ad unit (" + this.mAdUnitId + ").");
        }
        this.mCurrentAutoRefreshStatus = z;
        if (this.mAdWasLoaded && this.mCurrentAutoRefreshStatus) {
            scheduleRefreshTimerIfEnabled();
        } else {
            if (this.mCurrentAutoRefreshStatus) {
                return;
            }
            cancelRefreshTimer();
        }
    }

    public AdReport getAdReport() {
        if (this.mAdUnitId == null || this.mAdResponse == null) {
            return null;
        }
        return new AdReport(this.mAdUnitId, ClientMetadata.getInstance(this.mContext), this.mAdResponse);
    }

    public boolean getTesting() {
        return this.mIsTesting;
    }

    public void setTesting(boolean z) {
        this.mIsTesting = z;
    }

    boolean isDestroyed() {
        return this.mIsDestroyed;
    }

    void cleanup() {
        if (this.mIsDestroyed) {
            return;
        }
        if (this.mActiveRequest != null) {
            this.mActiveRequest.cancel();
            this.mActiveRequest = null;
        }
        setAutoRefreshStatus(false);
        cancelRefreshTimer();
        this.mMoPubView = null;
        this.mContext = null;
        this.mUrlGenerator = null;
        this.mIsDestroyed = true;
    }

    Integer getAdTimeoutDelay() {
        return Integer.valueOf(this.mTimeoutMilliseconds);
    }

    void trackImpression() {
        if (this.mAdResponse != null) {
            TrackingRequest.makeTrackingHttpRequest(this.mAdResponse.getImpressionTrackingUrl(), this.mContext);
        }
    }

    void registerClick() {
        if (this.mAdResponse != null) {
            TrackingRequest.makeTrackingHttpRequest(this.mAdResponse.getClickTrackingUrl(), this.mContext);
        }
    }

    void fetchAd(String str) {
        MoPubView moPubView = getMoPubView();
        if (moPubView == null || this.mContext == null) {
            MoPubLog.d("Can't load an ad in this ad view because it was destroyed.");
            setNotLoading();
        } else {
            AdRequest adRequest = new AdRequest(str, moPubView.getAdFormat(), this.mAdUnitId, this.mContext, this.mAdListener);
            Networking.getRequestQueue(this.mContext).add(adRequest);
            this.mActiveRequest = adRequest;
        }
    }

    void forceRefresh() {
        setNotLoading();
        loadAd();
    }

    String generateAdUrl() {
        if (this.mUrlGenerator == null) {
            return null;
        }
        boolean canCollectPersonalInformation = MoPub.canCollectPersonalInformation();
        this.mUrlGenerator.withAdUnitId(this.mAdUnitId).withKeywords(this.mKeywords).withUserDataKeywords(canCollectPersonalInformation ? this.mUserDataKeywords : null).withLocation(canCollectPersonalInformation ? this.mLocation : null);
        return this.mUrlGenerator.generateUrlString(Constants.HOST);
    }

    void adDidFail(MoPubErrorCode moPubErrorCode) {
        MoPubLog.i("Ad failed to load.");
        setNotLoading();
        MoPubView moPubView = getMoPubView();
        if (moPubView == null) {
            return;
        }
        scheduleRefreshTimerIfEnabled();
        moPubView.adFailed(moPubErrorCode);
    }

    void scheduleRefreshTimerIfEnabled() {
        cancelRefreshTimer();
        if (!this.mCurrentAutoRefreshStatus || this.mRefreshTimeMillis == null || this.mRefreshTimeMillis.intValue() <= 0) {
            return;
        }
        this.mHandler.postDelayed(this.mRefreshRunnable, Math.min(600000L, this.mRefreshTimeMillis.intValue() * ((long) Math.pow(BACKOFF_FACTOR, this.mBackoffPower))));
    }

    void setLocalExtras(Map<String, Object> map) {
        this.mLocalExtras = map != null ? new TreeMap(map) : new TreeMap();
    }

    Map<String, Object> getLocalExtras() {
        return this.mLocalExtras != null ? new TreeMap(this.mLocalExtras) : new TreeMap();
    }

    private void cancelRefreshTimer() {
        this.mHandler.removeCallbacks(this.mRefreshRunnable);
    }

    private boolean isNetworkAvailable() {
        if (this.mContext == null) {
            return false;
        }
        if (!DeviceUtils.isPermissionGranted(this.mContext, "android.permission.ACCESS_NETWORK_STATE")) {
            return true;
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.mContext.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    void setAdContentView(final View view) {
        this.mHandler.post(new Runnable() { // from class: com.mopub.mobileads.AdViewController.3
            @Override // java.lang.Runnable
            public void run() {
                MoPubView moPubView = AdViewController.this.getMoPubView();
                if (moPubView == null) {
                    return;
                }
                moPubView.removeAllViews();
                moPubView.addView(view, AdViewController.this.getAdLayoutParams(view));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public FrameLayout.LayoutParams getAdLayoutParams(View view) {
        Integer num;
        Integer num2 = null;
        if (this.mAdResponse != null) {
            num2 = this.mAdResponse.getWidth();
            num = this.mAdResponse.getHeight();
        } else {
            num = null;
        }
        if (num2 != null && num != null && getShouldHonorServerDimensions(view) && num2.intValue() > 0 && num.intValue() > 0) {
            return new FrameLayout.LayoutParams(Dips.asIntPixels(num2.intValue(), this.mContext), Dips.asIntPixels(num.intValue(), this.mContext), 17);
        }
        return WRAP_AND_CENTER_LAYOUT_PARAMS;
    }

    @VisibleForTesting
    @Deprecated
    Integer getRefreshTimeMillis() {
        return this.mRefreshTimeMillis;
    }

    @VisibleForTesting
    @Deprecated
    void setRefreshTimeMillis(Integer num) {
        this.mRefreshTimeMillis = num;
    }
}
