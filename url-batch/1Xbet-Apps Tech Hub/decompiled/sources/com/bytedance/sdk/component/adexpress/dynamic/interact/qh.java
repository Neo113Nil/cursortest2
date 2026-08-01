package com.bytedance.sdk.component.adexpress.dynamic.interact;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.component.adexpress.widget.DynamicLottieView;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* compiled from: LightInteract.java */
/* loaded from: classes.dex */
public class qh implements so<ViewGroup> {
    private final FrameLayout icD;
    private final DynamicLottieView pvs;

    public qh(Context context, DynamicBaseWidget dynamicBaseWidget, com.bytedance.sdk.component.adexpress.dynamic.vG.yiw yiwVar, String str) {
        DynamicLottieView dynamicLottieView = new DynamicLottieView(context);
        this.pvs = dynamicLottieView;
        dynamicLottieView.setImageLottieTosPath(str);
        FrameLayout frameLayout = new FrameLayout(context);
        this.icD = frameLayout;
        frameLayout.addView(dynamicLottieView, new FrameLayout.LayoutParams(-2, -2));
        double cGU = yiwVar.cGU();
        cGU = cGU == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? 1.0d : cGU;
        double Ca = yiwVar.Ca();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) (dynamicBaseWidget.getDynamicWidth() * 0.32d * cGU), (int) (dynamicBaseWidget.getDynamicWidth() * 0.32d * (Ca != FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? Ca : 1.0d)));
        layoutParams.gravity = 17;
        frameLayout.setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.so
    public void pvs() {
        this.pvs.sUS();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.so
    public void icD() {
        this.pvs.Jd();
        ViewParent parent = this.icD.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.icD);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.so
    public ViewGroup vG() {
        return this.icD;
    }
}
