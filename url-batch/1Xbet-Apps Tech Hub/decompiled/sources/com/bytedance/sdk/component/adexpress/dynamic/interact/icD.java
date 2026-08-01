package com.bytedance.sdk.component.adexpress.dynamic.interact;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.component.adexpress.widget.DynamicBrushMaskView;

/* compiled from: BrushMaskInteract.java */
/* loaded from: classes.dex */
public class icD implements so<DynamicBrushMaskView> {
    private DynamicBrushMaskView pvs;

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.so
    public void pvs() {
    }

    public icD(Context context, DynamicBaseWidget dynamicBaseWidget, com.bytedance.sdk.component.adexpress.dynamic.vG.yiw yiwVar) {
        int i;
        this.pvs = new DynamicBrushMaskView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 81;
        if (yiwVar.ea() > 0) {
            i = yiwVar.ea();
        } else {
            i = com.bytedance.sdk.component.adexpress.Jd.icD() ? 0 : 120;
        }
        layoutParams.bottomMargin = (int) com.bytedance.sdk.component.adexpress.Jd.yiw.pvs(context, i);
        this.pvs.setLayoutParams(layoutParams);
        this.pvs.setClipChildren(false);
        this.pvs.setBrushText(yiwVar.cnN());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.so
    public void icD() {
        DynamicBrushMaskView dynamicBrushMaskView = this.pvs;
        if (dynamicBrushMaskView != null) {
            dynamicBrushMaskView.icD();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.so
    /* renamed from: Jd, reason: merged with bridge method [inline-methods] */
    public DynamicBrushMaskView vG() {
        return this.pvs;
    }
}
