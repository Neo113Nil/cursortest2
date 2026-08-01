package com.bytedance.sdk.component.adexpress.dynamic.interact;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.component.adexpress.widget.ClickInteractView;

/* compiled from: ClickInteract.java */
/* loaded from: classes.dex */
public class Jd implements so {
    ClickInteractView pvs;

    public Jd(Context context, DynamicBaseWidget dynamicBaseWidget, com.bytedance.sdk.component.adexpress.dynamic.vG.yiw yiwVar) {
        this.pvs = new ClickInteractView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dynamicBaseWidget.getDynamicHeight(), dynamicBaseWidget.getDynamicHeight());
        layoutParams.gravity = 17;
        this.pvs.setLayoutParams(layoutParams);
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
    public ClickInteractView vG() {
        return this.pvs;
    }
}
