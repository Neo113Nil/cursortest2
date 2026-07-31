package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;

/* loaded from: classes15.dex */
public class iqz extends nps implements com.bytedance.sdk.component.adexpress.dynamic.zn {
    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.nps, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.hhw, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.btk, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    public iqz(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.fb.zg zgVar) {
        super(context, dynamicRootView, zgVar);
        dynamicRootView.setTimeOutListener(this);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.nps, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.hhw
    protected FrameLayout.LayoutParams getWidgetLayoutParams() {
        return new FrameLayout.LayoutParams(-2, -2);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.nps, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.hhw, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.btk, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (TextUtils.isEmpty(((TextView) this.cn).getText())) {
            setMeasuredDimension(0, this.zg);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.btk
    public void hhw() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.nps, this.zg);
        int i = this.bvs;
        layoutParams.leftMargin = i;
        layoutParams.gravity = 16;
        layoutParams.setMarginStart(i);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.zn
    public void zmn(CharSequence charSequence, boolean z, int i, boolean z2) {
        if (i == 0) {
            if (getParent() != null) {
                ((ViewGroup) getParent()).removeView(this);
            }
        } else {
            ((TextView) this.cn).setText(" | " + String.format(com.bytedance.sdk.component.utils.doe.zmn(com.bytedance.sdk.component.adexpress.fb.zmn(), "tt_reward_full_skip_count_down"), Integer.valueOf(i)));
        }
        requestLayout();
    }
}
