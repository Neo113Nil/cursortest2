package com.bytedance.sdk.component.adexpress.dynamic.interact;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.component.adexpress.widget.BluePressInteractView;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* compiled from: BluePressInteract.java */
/* loaded from: classes.dex */
public class pvs implements so {
    private BluePressInteractView pvs;

    public pvs(Context context, DynamicBaseWidget dynamicBaseWidget, com.bytedance.sdk.component.adexpress.dynamic.vG.yiw yiwVar) {
        double cGU = yiwVar.cGU();
        cGU = cGU == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? 1.0d : cGU;
        double Ca = yiwVar.Ca();
        int dynamicWidth = (int) (dynamicBaseWidget.getDynamicWidth() * 0.32d * cGU);
        int dynamicWidth2 = (int) (dynamicBaseWidget.getDynamicWidth() * 0.32d * (Ca != FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? Ca : 1.0d));
        this.pvs = new BluePressInteractView(context, dynamicWidth, dynamicWidth2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dynamicWidth, dynamicWidth2);
        layoutParams.gravity = 17;
        layoutParams.topMargin = (int) com.bytedance.sdk.component.adexpress.Jd.yiw.pvs(context, yiwVar.Cwg() - 7);
        layoutParams.leftMargin = (int) com.bytedance.sdk.component.adexpress.Jd.yiw.pvs(context, yiwVar.neB() - 3);
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
    public ViewGroup vG() {
        return this.pvs;
    }
}
