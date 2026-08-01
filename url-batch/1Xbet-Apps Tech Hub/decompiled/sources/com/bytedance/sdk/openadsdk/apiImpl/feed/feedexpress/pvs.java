package com.bytedance.sdk.openadsdk.apiImpl.feed.feedexpress;

import android.content.Context;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressVideoView;

/* compiled from: PAGFeedExpressVideoView.java */
/* loaded from: classes2.dex */
public class pvs extends icD {
    public pvs(Context context, cR cRVar, AdSlot adSlot) {
        super(context, cRVar, adSlot);
    }

    @Override // com.bytedance.sdk.openadsdk.apiImpl.feed.feedexpress.icD
    protected void pvs() {
        this.Wyp = new NativeExpressVideoView(this.so, this.icD, this.Mxy, this.qh);
        this.pvs.pvs(((NativeExpressVideoView) this.Wyp).getVideoController());
        vG();
    }

    public com.bytedance.sdk.openadsdk.multipro.icD.pvs icD() {
        if (this.Wyp != null) {
            return ((NativeExpressVideoView) this.Wyp).getVideoModel();
        }
        return null;
    }
}
