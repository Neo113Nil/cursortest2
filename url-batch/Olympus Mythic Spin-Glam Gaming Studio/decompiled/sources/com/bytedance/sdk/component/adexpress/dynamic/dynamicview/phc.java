package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;

/* loaded from: classes6.dex */
public class phc extends nps implements com.bytedance.sdk.component.adexpress.dynamic.zn {
    private int fs;
    private int iqz;
    private int[] zmn;

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.nps, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.hhw, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.btk, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    public phc(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.fb.zg zgVar) {
        super(context, dynamicRootView, zgVar);
        dynamicRootView.setTimeOutListener(this);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.nps, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.hhw, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.tf
    public boolean bvs() {
        super.bvs();
        ((TextView) this.cn).setText("");
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.btk
    public void hhw() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.nps, this.zg);
        layoutParams.gravity = 8388629;
        layoutParams.setMarginStart(layoutParams.leftMargin);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.nps, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.hhw, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.btk, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (TextUtils.isEmpty(((TextView) this.cn).getText())) {
            setMeasuredDimension(0, this.zg);
        } else {
            setMeasuredDimension(this.nps, this.zg);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.zn
    @SuppressLint({"SetTextI18n"})
    public void zmn(CharSequence charSequence, boolean z, int i, boolean z2) {
        String zmn = com.bytedance.sdk.component.utils.doe.zmn(com.bytedance.sdk.component.adexpress.fb.zmn(), "tt_reward_screen_skip_tx");
        if (i == 0) {
            this.cn.setVisibility(0);
            ((TextView) this.cn).setText("| ".concat(String.valueOf(zmn)));
            this.cn.measure(-2, -2);
            this.zmn = new int[]{this.cn.getMeasuredWidth() + 1, this.cn.getMeasuredHeight()};
            View view = this.cn;
            int[] iArr = this.zmn;
            view.setLayoutParams(new FrameLayout.LayoutParams(iArr[0], iArr[1]));
            ((TextView) this.cn).setGravity(17);
            ((TextView) this.cn).setIncludeFontPadding(false);
            zmn();
            this.cn.setPadding(this.klz.zn(), this.fs, this.klz.fb(), this.iqz);
        }
        requestLayout();
    }

    private void zmn() {
        int zmn = (int) com.bytedance.sdk.component.adexpress.fb.nps.zmn(this.rc, this.klz.btk());
        this.fs = ((this.zg - zmn) / 2) - this.klz.zmn();
        this.iqz = 0;
    }
}
