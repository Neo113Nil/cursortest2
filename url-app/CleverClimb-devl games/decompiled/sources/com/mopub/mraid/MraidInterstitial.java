package com.mopub.mraid;

import com.mopub.common.DataKeys;
import com.mopub.mobileads.CustomEventInterstitial;
import com.mopub.mobileads.MraidActivity;
import com.mopub.mobileads.ResponseBodyInterstitial;
import java.util.Map;

/* loaded from: classes2.dex */
class MraidInterstitial extends ResponseBodyInterstitial {
    protected String mHtmlData;

    MraidInterstitial() {
    }

    @Override // com.mopub.mobileads.ResponseBodyInterstitial
    protected void extractExtras(Map<String, String> map) {
        this.mHtmlData = map.get(DataKeys.HTML_RESPONSE_BODY_KEY);
    }

    @Override // com.mopub.mobileads.ResponseBodyInterstitial
    protected void preRenderHtml(CustomEventInterstitial.CustomEventInterstitialListener customEventInterstitialListener) {
        MraidActivity.preRenderHtml(this, this.mContext, customEventInterstitialListener, this.mHtmlData, Long.valueOf(this.mBroadcastIdentifier));
    }

    @Override // com.mopub.mobileads.ResponseBodyInterstitial, com.mopub.mobileads.CustomEventInterstitial
    public void showInterstitial() {
        MraidActivity.start(this.mContext, this.mAdReport, this.mHtmlData, this.mBroadcastIdentifier);
    }
}
