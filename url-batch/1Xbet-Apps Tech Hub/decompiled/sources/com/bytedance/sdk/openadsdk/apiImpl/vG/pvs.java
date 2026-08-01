package com.bytedance.sdk.openadsdk.apiImpl.vG;

import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.ae;

/* compiled from: PAGAppOpenAdListenerAdapter.java */
/* loaded from: classes2.dex */
public class pvs implements PAGAppOpenAdLoadListener {
    private final PAGAppOpenAdLoadListener pvs;

    public pvs(PAGAppOpenAdLoadListener pAGAppOpenAdLoadListener) {
        this.pvs = pAGAppOpenAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.Jd
    public void onError(final int i, final String str) {
        if (this.pvs == null) {
            return;
        }
        if (str == null) {
            str = "Unknown exception.";
        }
        ae.pvs(new Runnable() { // from class: com.bytedance.sdk.openadsdk.apiImpl.vG.pvs.1
            @Override // java.lang.Runnable
            public void run() {
                if (pvs.this.pvs != null) {
                    pvs.this.pvs.onError(i, str);
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* renamed from: pvs, reason: merged with bridge method [inline-methods] */
    public void onAdLoaded(final PAGAppOpenAd pAGAppOpenAd) {
        if (this.pvs == null) {
            return;
        }
        ae.pvs(new Runnable() { // from class: com.bytedance.sdk.openadsdk.apiImpl.vG.pvs.2
            @Override // java.lang.Runnable
            public void run() {
                if (pvs.this.pvs != null) {
                    pvs.this.pvs.onAdLoaded(pAGAppOpenAd);
                }
            }
        });
    }
}
