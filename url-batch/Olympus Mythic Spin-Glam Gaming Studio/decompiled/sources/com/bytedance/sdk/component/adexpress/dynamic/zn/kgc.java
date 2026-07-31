package com.bytedance.sdk.component.adexpress.dynamic.zn;

import android.content.Context;
import android.widget.FrameLayout;

/* loaded from: classes15.dex */
public class kgc implements nps<com.bytedance.sdk.component.adexpress.hhw.rc> {
    private final com.bytedance.sdk.component.adexpress.hhw.rc zmn;

    public kgc(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.btk btkVar, com.bytedance.sdk.component.adexpress.dynamic.fb.nps npsVar) {
        int i;
        com.bytedance.sdk.component.adexpress.hhw.rc rcVar = new com.bytedance.sdk.component.adexpress.hhw.rc(context);
        this.zmn = rcVar;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 81;
        if (npsVar.gn() > 0) {
            i = npsVar.gn();
        } else {
            i = com.bytedance.sdk.component.adexpress.fb.fs() ? 0 : 120;
        }
        layoutParams.bottomMargin = (int) com.bytedance.sdk.component.adexpress.fb.nps.zmn(context, i);
        rcVar.setLayoutParams(layoutParams);
        rcVar.setClipChildren(false);
        rcVar.setText(npsVar.mhu());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.zn.nps
    public void zmn() {
        com.bytedance.sdk.component.adexpress.hhw.rc rcVar = this.zmn;
        if (rcVar != null) {
            rcVar.zmn();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.zn.nps
    public void fs() {
        com.bytedance.sdk.component.adexpress.hhw.rc rcVar = this.zmn;
        if (rcVar != null) {
            rcVar.fs();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.zn.nps
    /* renamed from: fb, reason: merged with bridge method [inline-methods] */
    public com.bytedance.sdk.component.adexpress.hhw.rc zn() {
        return this.zmn;
    }
}
