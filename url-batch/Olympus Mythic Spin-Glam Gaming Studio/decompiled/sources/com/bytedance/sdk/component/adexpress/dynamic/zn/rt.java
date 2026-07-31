package com.bytedance.sdk.component.adexpress.dynamic.zn;

import android.content.Context;
import android.widget.FrameLayout;

/* loaded from: classes4.dex */
public class rt implements nps<com.bytedance.sdk.component.adexpress.hhw.cn> {
    private com.bytedance.sdk.component.adexpress.hhw.cn zmn;

    public rt(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.btk btkVar, com.bytedance.sdk.component.adexpress.dynamic.fb.nps npsVar) {
        this.zmn = new com.bytedance.sdk.component.adexpress.hhw.cn(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.fb.nps.zmn(context, 180.0f), (int) com.bytedance.sdk.component.adexpress.fb.nps.zmn(context, 180.0f));
        layoutParams.gravity = 17;
        layoutParams.leftMargin = (int) com.bytedance.sdk.component.adexpress.fb.nps.zmn(context, 20.0f);
        this.zmn.setLayoutParams(layoutParams);
        this.zmn.setGuideText(npsVar.mhu());
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
    public com.bytedance.sdk.component.adexpress.hhw.cn zn() {
        return this.zmn;
    }
}
