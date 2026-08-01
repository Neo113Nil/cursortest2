package com.bytedance.sdk.component.adexpress.dynamic.interact;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.component.adexpress.widget.ClickSlideUpView;

/* compiled from: ClickSlideUpInteract.java */
/* loaded from: classes.dex */
public class NB extends cR<ClickSlideUpView> {
    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.cR
    protected void Jd() {
    }

    public NB(Context context, DynamicBaseWidget dynamicBaseWidget, com.bytedance.sdk.component.adexpress.dynamic.vG.yiw yiwVar) {
        super(context, dynamicBaseWidget, yiwVar);
        pvs(yiwVar);
    }

    private void pvs(com.bytedance.sdk.component.adexpress.dynamic.vG.yiw yiwVar) {
        this.pvs = new ClickSlideUpView(this.icD);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 81;
        layoutParams.bottomMargin = (int) com.bytedance.sdk.component.adexpress.Jd.yiw.pvs(this.icD, yiwVar.ea());
        this.pvs.setLayoutParams(layoutParams);
        this.pvs.setSlideText(this.Jd.cnN());
        if (this.pvs instanceof ClickSlideUpView) {
            ((ClickSlideUpView) this.pvs).setButtonText(this.Jd.Wyp());
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
