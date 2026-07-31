package com.bytedance.sdk.component.adexpress.dynamic.zn;

import android.content.Context;
import android.widget.FrameLayout;

/* loaded from: classes5.dex */
public class zn implements nps {
    com.bytedance.sdk.component.adexpress.hhw.btk zmn;

    public zn(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.btk btkVar, com.bytedance.sdk.component.adexpress.dynamic.fb.nps npsVar) {
        this.zmn = new com.bytedance.sdk.component.adexpress.hhw.btk(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(btkVar.getDynamicHeight(), btkVar.getDynamicHeight());
        layoutParams.gravity = 17;
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
    /* renamed from: fb, reason: merged with bridge method [inline-methods] */
    public com.bytedance.sdk.component.adexpress.hhw.btk zn() {
        return this.zmn;
    }
}
