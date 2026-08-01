package com.bytedance.sdk.openadsdk.core.ugen.component.video;

import android.content.Context;
import com.bytedance.adsdk.ugeno.component.frame.UGFrameLayout;

/* compiled from: UGVideoPlaceholderWidget.java */
/* loaded from: classes2.dex */
public class pvs extends com.bytedance.adsdk.ugeno.component.pvs.pvs {
    public pvs(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.component.icD
    /* renamed from: cR, reason: merged with bridge method [inline-methods] */
    public UGVideoPlaceholderView vG() {
        UGVideoPlaceholderView uGVideoPlaceholderView = new UGVideoPlaceholderView(this.icD);
        uGVideoPlaceholderView.pvs(this);
        return uGVideoPlaceholderView;
    }

    public UGFrameLayout zM() {
        return ((UGVideoPlaceholderView) this.NB).getVideoView();
    }

    @Override // com.bytedance.adsdk.ugeno.component.pvs.pvs, com.bytedance.adsdk.ugeno.component.icD
    public void pvs(String str, String str2) {
        super.pvs(str, str2);
    }

    @Override // com.bytedance.adsdk.ugeno.component.pvs.pvs, com.bytedance.adsdk.ugeno.component.pvs, com.bytedance.adsdk.ugeno.component.icD
    public void icD() {
        super.icD();
    }
}
