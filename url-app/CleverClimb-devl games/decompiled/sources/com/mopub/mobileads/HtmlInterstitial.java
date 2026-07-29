package com.mopub.mobileads;

import com.mopub.common.CreativeOrientation;
import com.mopub.common.DataKeys;
import com.mopub.mobileads.CustomEventInterstitial;
import java.util.Map;

/* loaded from: classes2.dex */
public class HtmlInterstitial extends ResponseBodyInterstitial {
    private String mClickthroughUrl;
    private String mHtmlData;
    private boolean mIsScrollable;
    private CreativeOrientation mOrientation;
    private String mRedirectUrl;

    @Override // com.mopub.mobileads.ResponseBodyInterstitial
    protected void extractExtras(Map<String, String> map) {
        this.mHtmlData = map.get(DataKeys.HTML_RESPONSE_BODY_KEY);
        this.mIsScrollable = Boolean.valueOf(map.get(DataKeys.SCROLLABLE_KEY)).booleanValue();
        this.mRedirectUrl = map.get(DataKeys.REDIRECT_URL_KEY);
        this.mClickthroughUrl = map.get(DataKeys.CLICKTHROUGH_URL_KEY);
        this.mOrientation = CreativeOrientation.fromHeader(map.get(DataKeys.CREATIVE_ORIENTATION_KEY));
    }

    @Override // com.mopub.mobileads.ResponseBodyInterstitial
    protected void preRenderHtml(CustomEventInterstitial.CustomEventInterstitialListener customEventInterstitialListener) {
        MoPubActivity.preRenderHtml(this, this.mContext, this.mAdReport, customEventInterstitialListener, this.mHtmlData, this.mIsScrollable, this.mRedirectUrl, this.mClickthroughUrl, this.mBroadcastIdentifier);
    }

    @Override // com.mopub.mobileads.ResponseBodyInterstitial, com.mopub.mobileads.CustomEventInterstitial
    public void showInterstitial() {
        MoPubActivity.start(this.mContext, this.mHtmlData, this.mAdReport, this.mIsScrollable, this.mRedirectUrl, this.mClickthroughUrl, this.mOrientation, this.mBroadcastIdentifier);
    }
}
