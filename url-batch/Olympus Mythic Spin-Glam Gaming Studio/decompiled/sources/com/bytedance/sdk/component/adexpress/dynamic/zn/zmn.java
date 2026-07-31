package com.bytedance.sdk.component.adexpress.dynamic.zn;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* loaded from: classes5.dex */
public class zmn implements nps {
    private com.bytedance.sdk.component.adexpress.hhw.fs zmn;

    public zmn(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.btk btkVar, com.bytedance.sdk.component.adexpress.dynamic.fb.nps npsVar) {
        double io2 = npsVar.io();
        io2 = io2 == 0.0d ? 1.0d : io2;
        double lbc = npsVar.lbc();
        int dynamicWidth = (int) (btkVar.getDynamicWidth() * 0.32d * io2);
        int dynamicWidth2 = (int) (btkVar.getDynamicWidth() * 0.32d * (lbc != 0.0d ? lbc : 1.0d));
        this.zmn = new com.bytedance.sdk.component.adexpress.hhw.fs(context, dynamicWidth, dynamicWidth2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dynamicWidth, dynamicWidth2);
        layoutParams.gravity = 17;
        layoutParams.topMargin = (int) com.bytedance.sdk.component.adexpress.fb.nps.zmn(context, npsVar.cd() - 7);
        layoutParams.leftMargin = (int) com.bytedance.sdk.component.adexpress.fb.nps.zmn(context, npsVar.lt() - 3);
        this.zmn.setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.zn.nps
    public void zmn() {
        this.zmn.zmn();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.zn.nps
    public void fs() {
        this.zmn.fs();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.zn.nps
    public ViewGroup zn() {
        return this.zmn;
    }
}
