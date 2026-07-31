package com.bytedance.sdk.openadsdk.component.zn;

import com.bytedance.sdk.component.utils.iqz;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdInteractionListener;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.fb.iv;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes12.dex */
public class zmn implements com.bytedance.sdk.openadsdk.zmn.zn.fs {
    private final nqi fb;
    private final PAGInterstitialAdInteractionListener zmn;
    private final AtomicBoolean fs = new AtomicBoolean(false);
    private final AtomicBoolean zn = new AtomicBoolean(false);

    public zmn(PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener, com.bytedance.sdk.openadsdk.core.model.zmn zmnVar) {
        this.zmn = pAGInterstitialAdInteractionListener;
        this.fb = zmnVar != null ? zmnVar.nps() : null;
    }

    @Override // com.bytedance.sdk.openadsdk.zmn.zn.fs
    public void zmn() {
        if (!this.fs.compareAndSet(false, true)) {
            iv.zmn("show_callback_repeat", this.zn.get(), this.fs.get(), this.fb);
            return;
        }
        iv.zmn("show_callback", this.zn.get(), this.fs.get(), this.fb);
        iqz.zmn("BVA", "full video onAdShow");
        PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener = this.zmn;
        if (pAGInterstitialAdInteractionListener != null) {
            pAGInterstitialAdInteractionListener.onAdShowed();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.zmn.zn.fs
    public void fs() {
        if (!this.zn.compareAndSet(false, true)) {
            iv.zmn("close_callback_repeat", this.zn.get(), this.fs.get(), this.fb);
            return;
        }
        iv.zmn("close_callback", this.zn.get(), this.fs.get(), this.fb);
        iqz.zmn("BVA", "full video onAdClose");
        PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener = this.zmn;
        if (pAGInterstitialAdInteractionListener != null) {
            pAGInterstitialAdInteractionListener.onAdDismissed();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
    public void onAdClicked() {
        PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener = this.zmn;
        if (pAGInterstitialAdInteractionListener != null) {
            pAGInterstitialAdInteractionListener.onAdClicked();
        }
    }
}
