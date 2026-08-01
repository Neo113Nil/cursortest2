package com.bytedance.sdk.openadsdk.core.ugen.component;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;

/* compiled from: UGLogoWidget.java */
/* loaded from: classes2.dex */
public class vG extends com.bytedance.adsdk.ugeno.component.icD<FrameLayout> {
    public vG(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.component.icD
    /* renamed from: pvs, reason: merged with bridge method [inline-methods] */
    public FrameLayout vG() {
        FrameLayout frameLayout = new FrameLayout(this.icD);
        frameLayout.addView(new PAGLogoView(this.icD));
        return frameLayout;
    }

    @Override // com.bytedance.adsdk.ugeno.component.icD
    public void icD() {
        super.icD();
    }
}
