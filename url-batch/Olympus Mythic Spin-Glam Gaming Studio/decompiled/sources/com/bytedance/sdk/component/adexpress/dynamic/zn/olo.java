package com.bytedance.sdk.component.adexpress.dynamic.zn;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.hhw.phc;

/* loaded from: classes14.dex */
public class olo<E extends phc> implements nps<E> {
    protected int btk;
    protected com.bytedance.sdk.component.adexpress.dynamic.fb.nps fb;
    protected Context fs;
    protected phc zmn;
    protected com.bytedance.sdk.component.adexpress.dynamic.dynamicview.btk zn;

    public olo(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.btk btkVar, com.bytedance.sdk.component.adexpress.dynamic.fb.nps npsVar, int i) {
        this.btk = i;
        this.fs = context;
        this.zn = btkVar;
        this.fb = npsVar;
        fb();
    }

    public olo(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.btk btkVar, com.bytedance.sdk.component.adexpress.dynamic.fb.nps npsVar) {
        this(context, btkVar, npsVar, 0);
    }

    protected void fb() {
        this.zmn = new phc(this.fs, this.fb.vlj());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, (int) com.bytedance.sdk.component.adexpress.fb.nps.zmn(this.fs, 200.0f));
        layoutParams.gravity = 81;
        layoutParams.bottomMargin = (int) com.bytedance.sdk.component.adexpress.fb.nps.zmn(this.fs, 100 - this.btk);
        this.zmn.setLayoutParams(layoutParams);
        try {
            this.zmn.setGuideText(this.fb.mhu());
        } catch (Throwable unused) {
        }
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
    /* renamed from: btk, reason: merged with bridge method [inline-methods] */
    public E zn() {
        return (E) this.zmn;
    }
}
