package com.bytedance.sdk.openadsdk.core.bannerexpress;

import android.content.Context;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.model.cR;

/* compiled from: PAGBannerVideoAdImpl.java */
/* loaded from: classes2.dex */
public class vG extends pvs {
    public vG(Context context, cR cRVar, AdSlot adSlot) {
        super(context, cRVar, adSlot);
    }

    @Override // com.bytedance.sdk.openadsdk.core.bannerexpress.pvs
    public void pvs(Context context, cR cRVar, AdSlot adSlot) {
        this.pvs = new BannerExpressVideoView(context, cRVar, adSlot);
        this.pvs.addOnAttachStateChangeListener(this.sUS);
    }

    public com.bytedance.sdk.openadsdk.multipro.icD.pvs vG() {
        if (this.pvs != null) {
            return ((BannerExpressVideoView) this.pvs).getVideoModel();
        }
        return null;
    }
}
