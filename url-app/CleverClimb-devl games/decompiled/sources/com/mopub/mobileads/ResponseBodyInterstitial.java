package com.mopub.mobileads;

import android.content.Context;
import com.mopub.common.AdReport;
import com.mopub.common.DataKeys;
import com.mopub.common.ExternalViewabilitySessionManager;
import com.mopub.common.logging.MoPubLog;
import com.mopub.mobileads.CustomEventInterstitial;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class ResponseBodyInterstitial extends CustomEventInterstitial {
    protected AdReport mAdReport;
    protected long mBroadcastIdentifier;
    private EventForwardingBroadcastReceiver mBroadcastReceiver;
    protected Context mContext;
    protected ExternalViewabilitySessionManager mExternalViewabilitySessionManager;

    protected abstract void extractExtras(Map<String, String> map);

    protected abstract void preRenderHtml(CustomEventInterstitial.CustomEventInterstitialListener customEventInterstitialListener);

    @Override // com.mopub.mobileads.CustomEventInterstitial
    public abstract void showInterstitial();

    @Override // com.mopub.mobileads.CustomEventInterstitial
    public void loadInterstitial(Context context, CustomEventInterstitial.CustomEventInterstitialListener customEventInterstitialListener, Map<String, Object> map, Map<String, String> map2) {
        this.mContext = context;
        if (extrasAreValid(map2)) {
            extractExtras(map2);
            try {
                this.mAdReport = (AdReport) map.get(DataKeys.AD_REPORT_KEY);
                Long l = (Long) map.get(DataKeys.BROADCAST_IDENTIFIER_KEY);
                if (l == null) {
                    MoPubLog.e("Broadcast Identifier was not set in localExtras");
                    customEventInterstitialListener.onInterstitialFailed(MoPubErrorCode.INTERNAL_ERROR);
                    return;
                } else {
                    this.mBroadcastIdentifier = l.longValue();
                    this.mBroadcastReceiver = new EventForwardingBroadcastReceiver(customEventInterstitialListener, this.mBroadcastIdentifier);
                    this.mBroadcastReceiver.register(this.mBroadcastReceiver, context);
                    preRenderHtml(customEventInterstitialListener);
                    return;
                }
            } catch (ClassCastException unused) {
                MoPubLog.e("LocalExtras contained an incorrect type.");
                customEventInterstitialListener.onInterstitialFailed(MoPubErrorCode.INTERNAL_ERROR);
                return;
            }
        }
        customEventInterstitialListener.onInterstitialFailed(MoPubErrorCode.NETWORK_INVALID_STATE);
    }

    @Override // com.mopub.mobileads.CustomEventInterstitial
    public void onInvalidate() {
        if (this.mBroadcastReceiver != null) {
            this.mBroadcastReceiver.unregister(this.mBroadcastReceiver);
        }
    }

    private boolean extrasAreValid(Map<String, String> map) {
        return map.containsKey(DataKeys.HTML_RESPONSE_BODY_KEY);
    }
}
