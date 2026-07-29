package com.mopub.network;

import com.mopub.common.MoPub;
import com.mopub.common.util.DateAndTime;
import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class AdResponse implements Serializable {
    private static final long serialVersionUID = 1;
    private final Integer mAdTimeoutDelayMillis;
    private final String mAdType;
    private final String mAdUnitId;
    private final MoPub.BrowserAgent mBrowserAgent;
    private final String mClickTrackingUrl;
    private final String mCustomEventClassName;
    private final String mDspCreativeId;
    private final String mFailoverUrl;
    private final String mFullAdType;
    private final Integer mHeight;
    private final String mImpressionTrackingUrl;
    private final JSONObject mJsonBody;
    private final String mNetworkType;
    private final String mRedirectUrl;
    private final Integer mRefreshTimeMillis;
    private final String mRequestId;
    private final String mResponseBody;
    private final String mRewardedCurrencies;
    private final Integer mRewardedDuration;
    private final String mRewardedVideoCompletionUrl;
    private final String mRewardedVideoCurrencyAmount;
    private final String mRewardedVideoCurrencyName;
    private final boolean mScrollable;
    private final Map<String, String> mServerExtras;
    private final boolean mShouldRewardOnClick;
    private final long mTimestamp;
    private final Integer mWidth;

    private AdResponse(Builder builder) {
        this.mAdType = builder.adType;
        this.mAdUnitId = builder.adUnitId;
        this.mFullAdType = builder.fullAdType;
        this.mNetworkType = builder.networkType;
        this.mRewardedVideoCurrencyName = builder.rewardedVideoCurrencyName;
        this.mRewardedVideoCurrencyAmount = builder.rewardedVideoCurrencyAmount;
        this.mRewardedCurrencies = builder.rewardedCurrencies;
        this.mRewardedVideoCompletionUrl = builder.rewardedVideoCompletionUrl;
        this.mRewardedDuration = builder.rewardedDuration;
        this.mShouldRewardOnClick = builder.shouldRewardOnClick;
        this.mRedirectUrl = builder.redirectUrl;
        this.mClickTrackingUrl = builder.clickTrackingUrl;
        this.mImpressionTrackingUrl = builder.impressionTrackingUrl;
        this.mFailoverUrl = builder.failoverUrl;
        this.mRequestId = builder.requestId;
        this.mWidth = builder.width;
        this.mHeight = builder.height;
        this.mAdTimeoutDelayMillis = builder.adTimeoutDelayMillis;
        this.mRefreshTimeMillis = builder.refreshTimeMillis;
        this.mDspCreativeId = builder.dspCreativeId;
        this.mScrollable = builder.scrollable;
        this.mResponseBody = builder.responseBody;
        this.mJsonBody = builder.jsonBody;
        this.mCustomEventClassName = builder.customEventClassName;
        this.mBrowserAgent = builder.browserAgent;
        this.mServerExtras = builder.serverExtras;
        this.mTimestamp = DateAndTime.now().getTime();
    }

    public boolean hasJson() {
        return this.mJsonBody != null;
    }

    public JSONObject getJsonBody() {
        return this.mJsonBody;
    }

    public String getStringBody() {
        return this.mResponseBody;
    }

    public String getAdType() {
        return this.mAdType;
    }

    public String getFullAdType() {
        return this.mFullAdType;
    }

    public String getAdUnitId() {
        return this.mAdUnitId;
    }

    public String getNetworkType() {
        return this.mNetworkType;
    }

    public String getRewardedVideoCurrencyName() {
        return this.mRewardedVideoCurrencyName;
    }

    public String getRewardedVideoCurrencyAmount() {
        return this.mRewardedVideoCurrencyAmount;
    }

    public String getRewardedCurrencies() {
        return this.mRewardedCurrencies;
    }

    public String getRewardedVideoCompletionUrl() {
        return this.mRewardedVideoCompletionUrl;
    }

    public Integer getRewardedDuration() {
        return this.mRewardedDuration;
    }

    public boolean shouldRewardOnClick() {
        return this.mShouldRewardOnClick;
    }

    public String getRedirectUrl() {
        return this.mRedirectUrl;
    }

    public String getClickTrackingUrl() {
        return this.mClickTrackingUrl;
    }

    public String getImpressionTrackingUrl() {
        return this.mImpressionTrackingUrl;
    }

    public String getFailoverUrl() {
        return this.mFailoverUrl;
    }

    public String getRequestId() {
        return this.mRequestId;
    }

    public boolean isScrollable() {
        return this.mScrollable;
    }

    public Integer getWidth() {
        return this.mWidth;
    }

    public Integer getHeight() {
        return this.mHeight;
    }

    public Integer getAdTimeoutMillis() {
        return this.mAdTimeoutDelayMillis;
    }

    public Integer getRefreshTimeMillis() {
        return this.mRefreshTimeMillis;
    }

    public String getDspCreativeId() {
        return this.mDspCreativeId;
    }

    public String getCustomEventClassName() {
        return this.mCustomEventClassName;
    }

    public MoPub.BrowserAgent getBrowserAgent() {
        return this.mBrowserAgent;
    }

    public Map<String, String> getServerExtras() {
        return new TreeMap(this.mServerExtras);
    }

    public long getTimestamp() {
        return this.mTimestamp;
    }

    public Builder toBuilder() {
        return new Builder().setAdType(this.mAdType).setNetworkType(this.mNetworkType).setRewardedVideoCurrencyName(this.mRewardedVideoCurrencyName).setRewardedVideoCurrencyAmount(this.mRewardedVideoCurrencyAmount).setRewardedCurrencies(this.mRewardedCurrencies).setRewardedVideoCompletionUrl(this.mRewardedVideoCompletionUrl).setRewardedDuration(this.mRewardedDuration).setShouldRewardOnClick(this.mShouldRewardOnClick).setRedirectUrl(this.mRedirectUrl).setClickTrackingUrl(this.mClickTrackingUrl).setImpressionTrackingUrl(this.mImpressionTrackingUrl).setFailoverUrl(this.mFailoverUrl).setDimensions(this.mWidth, this.mHeight).setAdTimeoutDelayMilliseconds(this.mAdTimeoutDelayMillis).setRefreshTimeMilliseconds(this.mRefreshTimeMillis).setDspCreativeId(this.mDspCreativeId).setScrollable(Boolean.valueOf(this.mScrollable)).setResponseBody(this.mResponseBody).setJsonBody(this.mJsonBody).setCustomEventClassName(this.mCustomEventClassName).setBrowserAgent(this.mBrowserAgent).setServerExtras(this.mServerExtras);
    }

    public static class Builder {
        private Integer adTimeoutDelayMillis;
        private String adType;
        private String adUnitId;
        private MoPub.BrowserAgent browserAgent;
        private String clickTrackingUrl;
        private String customEventClassName;
        private String dspCreativeId;
        private String failoverUrl;
        private String fullAdType;
        private Integer height;
        private String impressionTrackingUrl;
        private JSONObject jsonBody;
        private String networkType;
        private String redirectUrl;
        private Integer refreshTimeMillis;
        private String requestId;
        private String responseBody;
        private String rewardedCurrencies;
        private Integer rewardedDuration;
        private String rewardedVideoCompletionUrl;
        private String rewardedVideoCurrencyAmount;
        private String rewardedVideoCurrencyName;
        private boolean scrollable = false;
        private Map<String, String> serverExtras = new TreeMap();
        private boolean shouldRewardOnClick;
        private Integer width;

        public Builder setAdType(String str) {
            this.adType = str;
            return this;
        }

        public Builder setAdUnitId(String str) {
            this.adUnitId = str;
            return this;
        }

        public Builder setFullAdType(String str) {
            this.fullAdType = str;
            return this;
        }

        public Builder setNetworkType(String str) {
            this.networkType = str;
            return this;
        }

        public Builder setRewardedVideoCurrencyName(String str) {
            this.rewardedVideoCurrencyName = str;
            return this;
        }

        public Builder setRewardedVideoCurrencyAmount(String str) {
            this.rewardedVideoCurrencyAmount = str;
            return this;
        }

        public Builder setRewardedCurrencies(String str) {
            this.rewardedCurrencies = str;
            return this;
        }

        public Builder setRewardedVideoCompletionUrl(String str) {
            this.rewardedVideoCompletionUrl = str;
            return this;
        }

        public Builder setRewardedDuration(Integer num) {
            this.rewardedDuration = num;
            return this;
        }

        public Builder setShouldRewardOnClick(boolean z) {
            this.shouldRewardOnClick = z;
            return this;
        }

        public Builder setRedirectUrl(String str) {
            this.redirectUrl = str;
            return this;
        }

        public Builder setClickTrackingUrl(String str) {
            this.clickTrackingUrl = str;
            return this;
        }

        public Builder setImpressionTrackingUrl(String str) {
            this.impressionTrackingUrl = str;
            return this;
        }

        public Builder setFailoverUrl(String str) {
            this.failoverUrl = str;
            return this;
        }

        public Builder setRequestId(String str) {
            this.requestId = str;
            return this;
        }

        public Builder setDimensions(Integer num, Integer num2) {
            this.width = num;
            this.height = num2;
            return this;
        }

        public Builder setAdTimeoutDelayMilliseconds(Integer num) {
            this.adTimeoutDelayMillis = num;
            return this;
        }

        public Builder setRefreshTimeMilliseconds(Integer num) {
            this.refreshTimeMillis = num;
            return this;
        }

        public Builder setScrollable(Boolean bool) {
            this.scrollable = bool == null ? this.scrollable : bool.booleanValue();
            return this;
        }

        public Builder setDspCreativeId(String str) {
            this.dspCreativeId = str;
            return this;
        }

        public Builder setResponseBody(String str) {
            this.responseBody = str;
            return this;
        }

        public Builder setJsonBody(JSONObject jSONObject) {
            this.jsonBody = jSONObject;
            return this;
        }

        public Builder setCustomEventClassName(String str) {
            this.customEventClassName = str;
            return this;
        }

        public Builder setBrowserAgent(MoPub.BrowserAgent browserAgent) {
            this.browserAgent = browserAgent;
            return this;
        }

        public Builder setServerExtras(Map<String, String> map) {
            if (map == null) {
                this.serverExtras = new TreeMap();
            } else {
                this.serverExtras = new TreeMap(map);
            }
            return this;
        }

        public AdResponse build() {
            return new AdResponse(this);
        }
    }
}
