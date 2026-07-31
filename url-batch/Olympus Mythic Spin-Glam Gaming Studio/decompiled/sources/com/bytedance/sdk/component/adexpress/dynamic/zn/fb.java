package com.bytedance.sdk.component.adexpress.dynamic.zn;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.hhw.phc;

/* loaded from: classes4.dex */
public class fb extends olo<com.bytedance.sdk.component.adexpress.hhw.nps> {
    @Override // com.bytedance.sdk.component.adexpress.dynamic.zn.olo
    protected void fb() {
    }

    public fb(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.btk btkVar, com.bytedance.sdk.component.adexpress.dynamic.fb.nps npsVar) {
        super(context, btkVar, npsVar);
        zmn(npsVar);
    }

    private void zmn(com.bytedance.sdk.component.adexpress.dynamic.fb.nps npsVar) {
        this.zmn = new com.bytedance.sdk.component.adexpress.hhw.nps(this.fs);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 81;
        layoutParams.bottomMargin = (int) com.bytedance.sdk.component.adexpress.fb.nps.zmn(this.fs, npsVar.gn());
        this.zmn.setLayoutParams(layoutParams);
        this.zmn.setSlideText(this.fb.mhu());
        phc phcVar = this.zmn;
        if (phcVar instanceof com.bytedance.sdk.component.adexpress.hhw.nps) {
            ((com.bytedance.sdk.component.adexpress.hhw.nps) phcVar).setButtonText(this.fb.iv());
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.zn.olo, com.bytedance.sdk.component.adexpress.dynamic.zn.nps
    public void zmn() {
        this.zmn.zmn();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.zn.olo, com.bytedance.sdk.component.adexpress.dynamic.zn.nps
    public void fs() {
        this.zmn.fs();
    }
}
