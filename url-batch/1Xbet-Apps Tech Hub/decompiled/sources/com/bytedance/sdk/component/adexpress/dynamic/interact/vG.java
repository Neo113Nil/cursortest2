package com.bytedance.sdk.component.adexpress.dynamic.interact;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.component.adexpress.widget.CircleLongPressView;

/* compiled from: CircleLongPressInteract.java */
/* loaded from: classes.dex */
public class vG implements so {
    private CircleLongPressView pvs;

    public vG(Context context, DynamicBaseWidget dynamicBaseWidget, com.bytedance.sdk.component.adexpress.dynamic.vG.yiw yiwVar) {
        this.pvs = new CircleLongPressView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.Jd.yiw.pvs(context, 180.0f), (int) com.bytedance.sdk.component.adexpress.Jd.yiw.pvs(context, 180.0f));
        layoutParams.gravity = 17;
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
    public CircleLongPressView vG() {
        return this.pvs;
    }
}
