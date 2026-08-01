package com.bytedance.sdk.openadsdk.core.bannerexpress;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressVideoView;
import com.bytedance.sdk.openadsdk.utils.Pj;

/* loaded from: classes2.dex */
public class BannerExpressVideoView extends BannerExpressView {
    public BannerExpressVideoView(Context context, cR cRVar, AdSlot adSlot) {
        super(context, cRVar, adSlot);
    }

    @Override // com.bytedance.sdk.openadsdk.core.bannerexpress.BannerExpressView
    protected void pvs() {
        this.icD = new NativeExpressVideoView(this.pvs, this.Jd, this.NB, this.Mxy);
        addView(this.icD, new ViewGroup.LayoutParams(-1, -1));
        if (this.sUS != null) {
            setExpressInteractionListener(this.sUS);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bannerexpress.BannerExpressView
    public void pvs(cR cRVar, AdSlot adSlot) {
        this.vG = new NativeExpressVideoView(this.pvs, cRVar, adSlot, this.Mxy);
        this.vG.setExpressInteractionListener(new PAGExpressAdWrapperListener() { // from class: com.bytedance.sdk.openadsdk.core.bannerexpress.BannerExpressVideoView.1
            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onAdDismissed() {
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onAdShow(View view, int i) {
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onRenderFail(View view, String str, int i) {
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
            public void onAdClicked() {
                if (BannerExpressVideoView.this.sUS != null) {
                    BannerExpressVideoView.this.sUS.onAdClicked();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onRenderSuccess(View view, float f, float f2) {
                BannerExpressVideoView.this.pvs(f, f2);
                BannerExpressVideoView.this.NB();
            }
        });
        Pj.pvs((View) this.vG, 8);
        addView(this.vG, new ViewGroup.LayoutParams(-1, -1));
    }

    public com.bytedance.sdk.openadsdk.multipro.icD.pvs getVideoModel() {
        if (this.icD != null) {
            return ((NativeExpressVideoView) this.icD).getVideoModel();
        }
        return null;
    }
}
