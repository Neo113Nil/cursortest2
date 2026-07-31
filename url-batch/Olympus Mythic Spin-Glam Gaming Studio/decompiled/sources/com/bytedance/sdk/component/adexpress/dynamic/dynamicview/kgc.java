package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.view.MotionEvent;
import androidx.annotation.ColorInt;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.h;

/* loaded from: classes.dex */
public class kgc extends hhw {
    public fs zmn;

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.hhw, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.btk, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.hhw, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.btk, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            CreativeInfoManager.viewOnMeasure(h.u, this, widthMeasureSpec, heightMeasureSpec);
        }
    }

    public kgc(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.fb.zg zgVar) {
        super(context, dynamicRootView, zgVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.hhw, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.tf
    public boolean bvs() {
        return super.bvs();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.btk
    protected fs zmn(Bitmap bitmap) {
        zmn zmnVar = new zmn(bitmap, this.zmn);
        this.zmn = zmnVar;
        return zmnVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.btk
    protected GradientDrawable getDrawable() {
        fs fsVar = new fs();
        this.zmn = fsVar;
        return fsVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.btk
    protected GradientDrawable zmn(GradientDrawable.Orientation orientation, @ColorInt int[] iArr) {
        fs fsVar = new fs(orientation, iArr);
        this.zmn = fsVar;
        return fsVar;
    }
}
