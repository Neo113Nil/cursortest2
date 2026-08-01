package com.bytedance.sdk.openadsdk.component;

import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdInteractionListener;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PAGAppOpenAdWrapper.java */
/* loaded from: classes2.dex */
public class NB implements com.bytedance.sdk.openadsdk.apiImpl.vG.icD {
    private final AtomicBoolean icD = new AtomicBoolean(false);
    private final PAGAppOpenAdInteractionListener pvs;

    public NB(PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener) {
        this.pvs = pAGAppOpenAdInteractionListener;
    }

    @Override // com.bytedance.sdk.openadsdk.apiImpl.vG.icD
    public void pvs() {
        PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener = this.pvs;
        if (pAGAppOpenAdInteractionListener != null) {
            pAGAppOpenAdInteractionListener.onAdShowed();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
    public void onAdClicked() {
        PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener = this.pvs;
        if (pAGAppOpenAdInteractionListener != null) {
            pAGAppOpenAdInteractionListener.onAdClicked();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.apiImpl.vG.icD
    public void icD() {
        PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener = this.pvs;
        if (pAGAppOpenAdInteractionListener != null) {
            pAGAppOpenAdInteractionListener.onAdDismissed();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.apiImpl.vG.icD
    public void vG() {
        PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener;
        if (this.icD.getAndSet(true) || (pAGAppOpenAdInteractionListener = this.pvs) == null) {
            return;
        }
        pAGAppOpenAdInteractionListener.onAdDismissed();
    }
}
