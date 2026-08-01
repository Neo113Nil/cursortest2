package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.Jd.yiw;
import com.bytedance.sdk.component.adexpress.dynamic.vG.so;
import com.bytedance.sdk.component.utils.uc;

/* loaded from: classes.dex */
public class DynamicSkipCountDownBtn extends DynamicButton implements com.bytedance.sdk.component.adexpress.dynamic.vG {
    private int icD;
    private int[] pvs;
    private int uc;

    public DynamicSkipCountDownBtn(Context context, DynamicRootView dynamicRootView, so soVar) {
        super(context, dynamicRootView, soVar);
        dynamicRootView.setTimeOutListener(this);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicButton, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Jd
    public boolean Mxy() {
        super.Mxy();
        ((TextView) this.bNS).setText("");
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget
    public void sUS() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.yiw, this.so);
        layoutParams.gravity = 8388629;
        layoutParams.setMarginStart(layoutParams.leftMargin);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (TextUtils.isEmpty(((TextView) this.bNS).getText())) {
            setMeasuredDimension(0, this.so);
        } else {
            setMeasuredDimension(this.yiw, this.so);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.vG
    public void pvs(CharSequence charSequence, boolean z, int i, boolean z2) {
        String pvs = uc.pvs(com.bytedance.sdk.component.adexpress.Jd.pvs(), "tt_reward_screen_skip_tx");
        if (i == 0) {
            this.bNS.setVisibility(0);
            ((TextView) this.bNS).setText("| ".concat(String.valueOf(pvs)));
            this.bNS.measure(-2, -2);
            this.pvs = new int[]{this.bNS.getMeasuredWidth() + 1, this.bNS.getMeasuredHeight()};
            View view = this.bNS;
            int[] iArr = this.pvs;
            view.setLayoutParams(new FrameLayout.LayoutParams(iArr[0], iArr[1]));
            ((TextView) this.bNS).setGravity(17);
            ((TextView) this.bNS).setIncludeFontPadding(false);
            pvs();
            this.bNS.setPadding(this.kj.vG(), this.icD, this.kj.Jd(), this.uc);
        }
        requestLayout();
    }

    private void pvs() {
        int pvs = (int) yiw.pvs(this.qh, this.kj.NB());
        this.icD = ((this.so - pvs) / 2) - this.kj.pvs();
        this.uc = 0;
    }
}
