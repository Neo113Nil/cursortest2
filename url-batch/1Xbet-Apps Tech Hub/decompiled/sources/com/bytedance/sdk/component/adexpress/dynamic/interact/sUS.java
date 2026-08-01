package com.bytedance.sdk.component.adexpress.dynamic.interact;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.component.adexpress.widget.ClickSlideUpView;
import com.bytedance.sdk.component.adexpress.widget.ClickSlideUpView2;

/* compiled from: ClickSlideUpInteract2.java */
/* loaded from: classes.dex */
public class sUS extends cR<ClickSlideUpView> {
    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.cR
    protected void Jd() {
    }

    public sUS(Context context, DynamicBaseWidget dynamicBaseWidget, com.bytedance.sdk.component.adexpress.dynamic.vG.yiw yiwVar) {
        super(context, dynamicBaseWidget, yiwVar);
        pvs(yiwVar);
    }

    private void pvs(com.bytedance.sdk.component.adexpress.dynamic.vG.yiw yiwVar) {
        this.pvs = new ClickSlideUpView2(this.icD);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 81;
        this.pvs.setLayoutParams(layoutParams);
        if (this.pvs instanceof ClickSlideUpView2) {
            ((ClickSlideUpView2) this.pvs).setButtonText(this.Jd.cnN());
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.cR, com.bytedance.sdk.component.adexpress.dynamic.interact.so
    public void pvs() {
        this.pvs.pvs();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.cR, com.bytedance.sdk.component.adexpress.dynamic.interact.so
    public void icD() {
        this.pvs.icD();
    }
}
