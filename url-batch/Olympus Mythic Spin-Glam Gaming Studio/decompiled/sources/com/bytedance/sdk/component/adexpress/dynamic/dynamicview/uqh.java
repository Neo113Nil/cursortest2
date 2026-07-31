package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.h;

/* loaded from: classes4.dex */
public class uqh extends hhw {
    private int zmn;

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

    public uqh(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.fb.zg zgVar) {
        super(context, dynamicRootView, zgVar);
        this.zmn = 0;
        com.bytedance.sdk.component.adexpress.hhw.nqi nqiVar = new com.bytedance.sdk.component.adexpress.hhw.nqi(context, null);
        this.cn = nqiVar;
        nqiVar.setTag(Integer.valueOf(getClickArea()));
        addView(this.cn, getWidgetLayoutParams());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.hhw
    protected FrameLayout.LayoutParams getWidgetLayoutParams() {
        int zmn = (int) ((com.bytedance.sdk.component.adexpress.fb.nps.zmn(com.bytedance.sdk.component.adexpress.fb.zmn(), this.klz.btk()) * 5.0f) + com.bytedance.sdk.component.adexpress.fb.nps.zmn(com.bytedance.sdk.component.adexpress.fb.zmn(), this.klz.zn() + com.bytedance.sdk.component.adexpress.fb.nps.zmn(com.bytedance.sdk.component.adexpress.fb.zmn(), this.klz.fb())));
        if (this.nps > zmn && 4 == this.klz.zg()) {
            this.zmn = (this.nps - zmn) / 2;
        }
        this.nps = zmn;
        return new FrameLayout.LayoutParams(this.nps, this.zg);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.btk
    public void hhw() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.nps, this.zg);
        layoutParams.topMargin = this.iv;
        int i = this.bvs + this.zmn;
        layoutParams.leftMargin = i;
        layoutParams.setMarginStart(i);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.hhw, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.tf
    public boolean bvs() {
        DynamicRootView dynamicRootView;
        super.bvs();
        double mw = this.klz.mw();
        if (com.bytedance.sdk.component.adexpress.fb.fs() && (mw < 0.0d || mw > 5.0d || ((dynamicRootView = this.rt) != null && dynamicRootView.getRenderRequest() != null && this.rt.getRenderRequest().iv() != 4))) {
            this.cn.setVisibility(8);
            return true;
        }
        double d = (mw < 0.0d || mw > 5.0d) ? 5.0d : mw;
        this.cn.setVisibility(0);
        ((com.bytedance.sdk.component.adexpress.hhw.nqi) this.cn).zmn(d, this.klz.nps(), (int) this.klz.btk(), ((int) com.bytedance.sdk.component.adexpress.fb.nps.zmn(this.rc, this.klz.fs())) + ((int) com.bytedance.sdk.component.adexpress.fb.nps.zmn(this.rc, this.klz.zmn())) + ((int) com.bytedance.sdk.component.adexpress.fb.nps.zmn(this.rc, this.klz.btk())));
        return true;
    }
}
