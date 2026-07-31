package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.h;

/* loaded from: classes6.dex */
public class bvs extends hhw {
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

    public bvs(Context context, @NonNull DynamicRootView dynamicRootView, @NonNull com.bytedance.sdk.component.adexpress.dynamic.fb.zg zgVar) {
        super(context, dynamicRootView, zgVar);
        if (com.bytedance.sdk.component.adexpress.fb.fs()) {
            this.cn = new ImageView(context);
        } else {
            this.cn = new com.bytedance.sdk.component.adexpress.hhw.bvs(context);
        }
        this.cn.setTag(3);
        addView(this.cn, getWidgetLayoutParams());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.hhw, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.tf
    public boolean bvs() {
        super.bvs();
        if (com.bytedance.sdk.component.adexpress.fb.fs()) {
            Drawable zmn = com.bytedance.sdk.component.adexpress.fb.zn.zmn(getContext(), this.klz);
            if (zmn != null) {
                this.cn.setBackground(zmn);
            }
            int fb = com.bytedance.sdk.component.utils.doe.fb(getContext(), "tt_close_btn");
            if (fb > 0) {
                ((ImageView) this.cn).setImageResource(fb);
            }
            ((ImageView) this.cn).setScaleType(ImageView.ScaleType.FIT_XY);
            return true;
        }
        int zmn2 = (int) com.bytedance.sdk.component.adexpress.fb.nps.zmn(this.rc, this.klz.olo());
        View view = this.cn;
        if (view instanceof com.bytedance.sdk.component.adexpress.hhw.bvs) {
            ((com.bytedance.sdk.component.adexpress.hhw.bvs) view).setRadius((int) com.bytedance.sdk.component.adexpress.fb.nps.zmn(this.rc, this.klz.cn()));
            ((com.bytedance.sdk.component.adexpress.hhw.bvs) this.cn).setStrokeWidth(zmn2);
            ((com.bytedance.sdk.component.adexpress.hhw.bvs) this.cn).setStrokeColor(this.klz.cyb());
            ((com.bytedance.sdk.component.adexpress.hhw.bvs) this.cn).setBgColor(this.klz.zak());
            ((com.bytedance.sdk.component.adexpress.hhw.bvs) this.cn).setDislikeColor(this.klz.nps());
            ((com.bytedance.sdk.component.adexpress.hhw.bvs) this.cn).setDislikeWidth((int) com.bytedance.sdk.component.adexpress.fb.nps.zmn(this.rc, 1.0f));
        }
        return true;
    }
}
