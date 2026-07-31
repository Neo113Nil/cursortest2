package com.bytedance.sdk.component.adexpress.dynamic.zn;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.hhw.phc;

/* loaded from: classes3.dex */
public class btk extends olo<com.bytedance.sdk.component.adexpress.hhw.nps> {
    @Override // com.bytedance.sdk.component.adexpress.dynamic.zn.olo
    protected void fb() {
    }

    public btk(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.btk btkVar, com.bytedance.sdk.component.adexpress.dynamic.fb.nps npsVar) {
        super(context, btkVar, npsVar);
        zmn(npsVar);
    }

    private void zmn(com.bytedance.sdk.component.adexpress.dynamic.fb.nps npsVar) {
        this.zmn = new com.bytedance.sdk.component.adexpress.hhw.zg(this.fs);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 81;
        this.zmn.setLayoutParams(layoutParams);
        phc phcVar = this.zmn;
        if (phcVar instanceof com.bytedance.sdk.component.adexpress.hhw.zg) {
            ((com.bytedance.sdk.component.adexpress.hhw.zg) phcVar).setButtonText(this.fb.mhu());
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
