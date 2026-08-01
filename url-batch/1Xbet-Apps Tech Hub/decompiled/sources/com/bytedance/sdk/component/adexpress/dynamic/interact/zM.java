package com.bytedance.sdk.component.adexpress.dynamic.interact;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.component.adexpress.widget.DynamicUnlockView;

/* compiled from: UnlockInteract.java */
/* loaded from: classes.dex */
public class zM implements so<DynamicUnlockView> {
    private final DynamicUnlockView pvs;

    public zM(Context context, DynamicBaseWidget dynamicBaseWidget, com.bytedance.sdk.component.adexpress.dynamic.vG.yiw yiwVar) {
        int i;
        DynamicUnlockView dynamicUnlockView = new DynamicUnlockView(context);
        this.pvs = dynamicUnlockView;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 81;
        if (yiwVar.ea() > 0) {
            i = yiwVar.ea();
        } else {
            i = com.bytedance.sdk.component.adexpress.Jd.icD() ? 0 : 120;
        }
        layoutParams.bottomMargin = (int) com.bytedance.sdk.component.adexpress.Jd.yiw.pvs(context, i);
        dynamicUnlockView.setLayoutParams(layoutParams);
        dynamicUnlockView.setClipChildren(false);
        dynamicUnlockView.setText(yiwVar.cnN());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.so
    public void pvs() {
        DynamicUnlockView dynamicUnlockView = this.pvs;
        if (dynamicUnlockView != null) {
            dynamicUnlockView.pvs();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.so
    public void icD() {
        DynamicUnlockView dynamicUnlockView = this.pvs;
        if (dynamicUnlockView != null) {
            dynamicUnlockView.icD();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.so
    /* renamed from: Jd, reason: merged with bridge method [inline-methods] */
    public DynamicUnlockView vG() {
        return this.pvs;
    }
}
