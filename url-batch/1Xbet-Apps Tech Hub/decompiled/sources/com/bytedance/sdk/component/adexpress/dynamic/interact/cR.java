package com.bytedance.sdk.component.adexpress.dynamic.interact;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.component.adexpress.widget.SlideUpView;

/* compiled from: SlideUpInteract.java */
/* loaded from: classes.dex */
public class cR<E extends SlideUpView> implements so<E> {
    protected com.bytedance.sdk.component.adexpress.dynamic.vG.yiw Jd;
    protected int NB;
    protected Context icD;
    protected SlideUpView pvs;
    protected DynamicBaseWidget vG;

    public cR(Context context, DynamicBaseWidget dynamicBaseWidget, com.bytedance.sdk.component.adexpress.dynamic.vG.yiw yiwVar, int i) {
        this.NB = i;
        this.icD = context;
        this.vG = dynamicBaseWidget;
        this.Jd = yiwVar;
        Jd();
    }

    public cR(Context context, DynamicBaseWidget dynamicBaseWidget, com.bytedance.sdk.component.adexpress.dynamic.vG.yiw yiwVar) {
        this(context, dynamicBaseWidget, yiwVar, 0);
    }

    protected void Jd() {
        this.pvs = new SlideUpView(this.icD, this.Jd.jhZ());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, (int) com.bytedance.sdk.component.adexpress.Jd.yiw.pvs(this.icD, 200.0f));
        layoutParams.gravity = 81;
        layoutParams.bottomMargin = (int) com.bytedance.sdk.component.adexpress.Jd.yiw.pvs(this.icD, 100 - this.NB);
        this.pvs.setLayoutParams(layoutParams);
        try {
            this.pvs.setGuideText(this.Jd.cnN());
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.so
    public void pvs() {
        this.pvs.pvs();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.so
    public void icD() {
        this.pvs.icD();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.so
    /* renamed from: NB, reason: merged with bridge method [inline-methods] */
    public E vG() {
        return (E) this.pvs;
    }
}
