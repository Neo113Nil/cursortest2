package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.TextView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.h;

/* loaded from: classes5.dex */
public class iv extends hhw {
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

    public iv(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.fb.zg zgVar) {
        super(context, dynamicRootView, zgVar);
        if (com.bytedance.sdk.component.adexpress.fb.fs()) {
            ImageView imageView = new ImageView(context);
            this.cn = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            this.nps = this.zg;
        } else {
            this.cn = new TextView(context);
        }
        this.cn.setTag(3);
        addView(this.cn, getWidgetLayoutParams());
        if (dynamicRootView.getRenderRequest() != null) {
            if (dynamicRootView.getRenderRequest().zg() && dynamicRootView.getRenderRequest().rp()) {
                return;
            }
            this.cn.setVisibility(8);
            setVisibility(8);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.hhw, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.tf
    public boolean bvs() {
        super.bvs();
        if (com.bytedance.sdk.component.adexpress.fb.fs()) {
            Drawable zmn = com.bytedance.sdk.component.adexpress.fb.zn.zmn(getContext(), this.klz);
            if (zmn != null) {
                ((ImageView) this.cn).setBackground(zmn);
            }
            ((ImageView) this.cn).setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            int fb = com.bytedance.sdk.component.utils.doe.fb(getContext(), "tt_reward_full_feedback");
            if (fb > 0) {
                ((ImageView) this.cn).setImageResource(fb);
            }
        }
        return true;
    }
}
