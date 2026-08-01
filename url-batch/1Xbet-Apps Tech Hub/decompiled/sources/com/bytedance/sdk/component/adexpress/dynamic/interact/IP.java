package com.bytedance.sdk.component.adexpress.dynamic.interact;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.component.adexpress.widget.PressInteractView;

/* compiled from: PressInteract.java */
/* loaded from: classes.dex */
public class IP implements so<PressInteractView> {
    private PressInteractView pvs;

    public IP(Context context, DynamicBaseWidget dynamicBaseWidget, com.bytedance.sdk.component.adexpress.dynamic.vG.yiw yiwVar) {
        this.pvs = new PressInteractView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.Jd.yiw.pvs(context, 180.0f), (int) com.bytedance.sdk.component.adexpress.Jd.yiw.pvs(context, 180.0f));
        layoutParams.gravity = 17;
        layoutParams.leftMargin = (int) com.bytedance.sdk.component.adexpress.Jd.yiw.pvs(context, 20.0f);
        this.pvs.setLayoutParams(layoutParams);
        this.pvs.setGuideText(yiwVar.cnN());
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
    /* renamed from: Jd, reason: merged with bridge method [inline-methods] */
    public PressInteractView vG() {
        return this.pvs;
    }
}
