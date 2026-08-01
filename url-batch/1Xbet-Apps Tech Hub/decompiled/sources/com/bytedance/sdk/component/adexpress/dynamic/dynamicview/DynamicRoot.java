package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import com.bytedance.sdk.component.adexpress.dynamic.vG.so;

/* loaded from: classes.dex */
public class DynamicRoot extends DynamicBaseWidgetImp {
    public icD pvs;

    public DynamicRoot(Context context, DynamicRootView dynamicRootView, so soVar) {
        super(context, dynamicRootView, soVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Jd
    public boolean Mxy() {
        return super.Mxy();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget
    protected icD pvs(Bitmap bitmap) {
        pvs pvsVar = new pvs(bitmap, this.pvs);
        this.pvs = pvsVar;
        return pvsVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget
    protected GradientDrawable getDrawable() {
        icD icd = new icD();
        this.pvs = icd;
        return icd;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget
    protected GradientDrawable pvs(GradientDrawable.Orientation orientation, int[] iArr) {
        icD icd = new icD(orientation, iArr);
        this.pvs = icd;
        return icd;
    }
}
