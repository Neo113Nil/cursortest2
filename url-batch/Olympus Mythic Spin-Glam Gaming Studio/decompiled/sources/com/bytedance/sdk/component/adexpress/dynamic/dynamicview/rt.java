package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.ImageView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.h;

/* loaded from: classes4.dex */
public class rt extends hhw {
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

    public rt(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.fb.zg zgVar) {
        super(context, dynamicRootView, zgVar);
        ImageView imageView = new ImageView(context);
        this.cn = imageView;
        imageView.setTag(Integer.valueOf(getClickArea()));
        if (com.bytedance.sdk.component.adexpress.fb.fs()) {
            this.zg = Math.max(dynamicRootView.getLogoUnionHeight(), this.zg);
        }
        addView(this.cn, getWidgetLayoutParams());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.hhw, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.tf
    public boolean bvs() {
        super.bvs();
        if (com.bytedance.sdk.component.adexpress.fb.fs()) {
            ((ImageView) this.cn).setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        }
        DynamicRootView dynamicRootView = this.rt;
        if (dynamicRootView != null && dynamicRootView.getRenderRequest() != null && !TextUtils.isEmpty(this.rt.getRenderRequest().kjb())) {
            String kjb = this.rt.getRenderRequest().kjb();
            if (kjb.equals("logo")) {
                ((ImageView) this.cn).setImageResource(com.bytedance.sdk.component.utils.doe.fb(getContext(), "tt_ad_logo"));
            } else {
                com.bytedance.sdk.component.btk.iv btk = com.bytedance.sdk.component.adexpress.zmn.zmn.zmn.zmn().btk().zmn(kjb).zmn(this.nps).fs(this.zg).fb(this.nps).btk(this.zg);
                String rt = this.rt.getRenderRequest().rt();
                if (!TextUtils.isEmpty(rt)) {
                    btk.fs(rt);
                }
                btk.zmn((ImageView) this.cn);
            }
        } else {
            setVisibility(8);
        }
        ((ImageView) this.cn).setColorFilter(this.klz.nps(), PorterDuff.Mode.SRC_IN);
        return true;
    }
}
