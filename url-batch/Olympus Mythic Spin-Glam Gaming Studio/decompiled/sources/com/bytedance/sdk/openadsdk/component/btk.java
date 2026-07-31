package com.bytedance.sdk.openadsdk.component;

import com.bytedance.sdk.component.utils.iqz;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdInteractionListener;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.fb.iv;
import com.ironsource.Zf;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public class btk implements com.bytedance.sdk.openadsdk.zmn.fb.fs {
    private final PAGAppOpenAdInteractionListener fs;
    private final nqi zmn;
    private final AtomicBoolean zn = new AtomicBoolean(false);
    private final AtomicBoolean fb = new AtomicBoolean(false);

    public btk(PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener, nqi nqiVar) {
        this.zmn = nqiVar;
        this.fs = pAGAppOpenAdInteractionListener;
    }

    @Override // com.bytedance.sdk.openadsdk.zmn.fb.fs
    public void zmn() {
        if (!this.fb.compareAndSet(false, true)) {
            iv.zmn("show_callback_repeat", this.zn.get(), this.fb.get(), this.zmn);
            return;
        }
        iv.zmn("show_callback", this.zn.get(), this.fb.get(), this.zmn);
        iqz.zmn("BVA", "onAdShow");
        PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener = this.fs;
        if (pAGAppOpenAdInteractionListener != null) {
            pAGAppOpenAdInteractionListener.onAdShowed();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
    public void onAdClicked() {
        iqz.zmn("BVA", Zf.f);
        PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener = this.fs;
        if (pAGAppOpenAdInteractionListener != null) {
            pAGAppOpenAdInteractionListener.onAdClicked();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.zmn.fb.fs
    public void fs() {
        iqz.zmn("BVA", "onAdSkip");
        if (!this.zn.getAndSet(true)) {
            iv.zmn("close_callback", this.zn.get(), this.fb.get(), this.zmn);
            PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener = this.fs;
            if (pAGAppOpenAdInteractionListener != null) {
                pAGAppOpenAdInteractionListener.onAdDismissed();
                return;
            }
            return;
        }
        iv.zmn("close_callback_repeat", this.zn.get(), this.fb.get(), this.zmn);
    }

    @Override // com.bytedance.sdk.openadsdk.zmn.fb.fs
    public void zn() {
        if (!this.zn.getAndSet(true)) {
            iv.zmn("close_callback", this.zn.get(), this.fb.get(), this.zmn);
            PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener = this.fs;
            if (pAGAppOpenAdInteractionListener != null) {
                pAGAppOpenAdInteractionListener.onAdDismissed();
                return;
            }
            return;
        }
        iv.zmn("close_callback_repeat", this.zn.get(), this.fb.get(), this.zmn);
    }
}
