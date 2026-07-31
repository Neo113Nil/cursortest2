package com.bytedance.sdk.openadsdk.zmn.fb;

import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.nu;

/* loaded from: classes3.dex */
public class zmn implements PAGAppOpenAdLoadListener {
    private final PAGAppOpenAdLoadListener zmn;

    public zmn(PAGAppOpenAdLoadListener pAGAppOpenAdLoadListener) {
        this.zmn = pAGAppOpenAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.nps
    public void onError(final int i, final String str) {
        if (this.zmn == null) {
            return;
        }
        if (str == null) {
            str = "Unknown exception.";
        }
        nu.zmn(new Runnable() { // from class: com.bytedance.sdk.openadsdk.zmn.fb.zmn.1
            @Override // java.lang.Runnable
            public void run() {
                if (zmn.this.zmn != null) {
                    zmn.this.zmn.onError(i, str);
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* renamed from: zmn, reason: merged with bridge method [inline-methods] */
    public void onAdLoaded(final PAGAppOpenAd pAGAppOpenAd) {
        if (this.zmn == null) {
            return;
        }
        nu.zmn(new Runnable() { // from class: com.bytedance.sdk.openadsdk.zmn.fb.zmn.2
            @Override // java.lang.Runnable
            public void run() {
                if (zmn.this.zmn != null) {
                    zmn.this.zmn.onAdLoaded(pAGAppOpenAd);
                }
            }
        });
    }
}
