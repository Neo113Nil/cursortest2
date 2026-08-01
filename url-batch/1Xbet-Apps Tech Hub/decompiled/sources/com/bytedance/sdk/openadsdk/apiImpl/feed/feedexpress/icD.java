package com.bytedance.sdk.openadsdk.apiImpl.feed.feedexpress;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.component.adexpress.icD.vG;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView;
import com.bytedance.sdk.openadsdk.apiImpl.feed.so;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressVideoView;
import com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView;
import com.bytedance.sdk.openadsdk.utils.Pj;

/* compiled from: PAGFeedExpressView.java */
/* loaded from: classes2.dex */
public class icD extends so {
    protected AdSlot Mxy;
    protected NativeExpressView Wyp;
    private boolean kj;
    protected String qh;
    protected final Context so;

    public icD(Context context, cR cRVar, AdSlot adSlot) {
        super(context, cRVar, 5, true);
        this.qh = "embeded_ad";
        this.kj = false;
        this.icD.so(1);
        this.Jd.pvs(this);
        this.so = context;
        this.Mxy = adSlot;
        pvs();
        icD();
    }

    protected void pvs() {
        this.Wyp = new NativeExpressView(this.so, this.icD, this.Mxy, this.qh);
        vG();
    }

    private void icD() {
        NativeExpressView nativeExpressView = this.Wyp;
        if (nativeExpressView != null) {
            nativeExpressView.setBackupListener(new vG() { // from class: com.bytedance.sdk.openadsdk.apiImpl.feed.feedexpress.icD.1
                @Override // com.bytedance.sdk.component.adexpress.icD.vG
                public boolean pvs(ViewGroup viewGroup, int i) {
                    PAGFeedExpressBackupView pAGFeedExpressBackupView = new PAGFeedExpressBackupView(icD.this.Wyp.getContext());
                    pAGFeedExpressBackupView.setExtraFuncationHelper(icD.this.Jd);
                    pAGFeedExpressBackupView.pvs(icD.this.Wyp);
                    return true;
                }
            });
        }
    }

    protected void vG() {
        NativeExpressView nativeExpressView = this.Wyp;
        if (nativeExpressView != null) {
            nativeExpressView.setExpressInteractionListener(new PAGExpressAdWrapperListener() { // from class: com.bytedance.sdk.openadsdk.apiImpl.feed.feedexpress.icD.2
                @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
                public void onAdClicked() {
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onAdDismissed() {
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onAdShow(View view, int i) {
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onRenderFail(View view, String str, int i) {
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onRenderSuccess(View view, float f, float f2) {
                    if (!icD.this.Wyp.Ju()) {
                        icD.this.pvs(f, f2);
                        if (icD.this.kj) {
                            icD.this.Wyp.so();
                            return;
                        }
                        return;
                    }
                    com.bytedance.sdk.openadsdk.apiImpl.feed.icD icd = new com.bytedance.sdk.openadsdk.apiImpl.feed.icD(icD.this.so, icD.this.icD, 5, icD.this.Mxy, icD.this.Jd, icD.this.pvs);
                    icD icd2 = icD.this;
                    if (icd2 instanceof pvs) {
                        icd.pvs(((NativeExpressVideoView) icd2.Jd()).getVideoAdListener());
                    }
                    icD.this.Jd.pvs((com.bytedance.sdk.openadsdk.core.icD.pvs) icD.this.Wyp.getClickCreativeListener());
                    PAGMediaView Mxy = icD.this.Jd.Mxy();
                    if (Mxy == null) {
                        Mxy = new PAGMediaView(icD.this.so);
                    }
                    icD.this.Wyp.addView(Mxy);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pvs(float f, float f2) {
        int icD = Pj.icD(this.so, f);
        int icD2 = Pj.icD(this.so, f2);
        ViewGroup.LayoutParams layoutParams = this.Wyp.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(icD, icD2);
        }
        layoutParams.width = icD;
        layoutParams.height = icD2;
        this.Wyp.setLayoutParams(layoutParams);
    }

    public NativeExpressView Jd() {
        return this.Wyp;
    }

    public void pvs(boolean z) {
        this.kj = z;
    }

    public void NB() {
        NativeExpressView nativeExpressView = this.Wyp;
        if (nativeExpressView != null) {
            nativeExpressView.Mxy();
        }
    }
}
