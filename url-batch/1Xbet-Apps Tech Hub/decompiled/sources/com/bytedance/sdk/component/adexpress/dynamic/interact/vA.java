package com.bytedance.sdk.component.adexpress.dynamic.interact;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.component.adexpress.widget.SlideUp3DView;

/* compiled from: SlideUp3DInteract.java */
/* loaded from: classes.dex */
public class vA implements so<SlideUp3DView> {
    private com.bytedance.sdk.component.adexpress.dynamic.vG.yiw Jd;
    private Context icD;
    private SlideUp3DView pvs;
    private DynamicBaseWidget vG;

    public vA(Context context, DynamicBaseWidget dynamicBaseWidget, com.bytedance.sdk.component.adexpress.dynamic.vG.yiw yiwVar) {
        this.icD = context;
        this.vG = dynamicBaseWidget;
        this.Jd = yiwVar;
        Jd();
    }

    protected void Jd() {
        this.pvs = new SlideUp3DView(this.icD);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, (int) com.bytedance.sdk.component.adexpress.Jd.yiw.pvs(this.icD, 250.0f));
        layoutParams.gravity = 81;
        layoutParams.bottomMargin = (int) com.bytedance.sdk.component.adexpress.Jd.yiw.pvs(this.icD, 120.0f);
        this.pvs.setLayoutParams(layoutParams);
        this.pvs.setGuideText(this.Jd.cnN());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.so
    public void pvs() {
        this.pvs.icD();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.so
    public void icD() {
        this.pvs.vG();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.so
    /* renamed from: NB, reason: merged with bridge method [inline-methods] */
    public SlideUp3DView vG() {
        return this.pvs;
    }
}
