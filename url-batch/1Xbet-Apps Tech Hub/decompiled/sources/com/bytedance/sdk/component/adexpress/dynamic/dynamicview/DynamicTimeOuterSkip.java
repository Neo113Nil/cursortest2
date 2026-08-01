package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.dynamic.vG.so;
import com.bytedance.sdk.component.utils.uc;

/* loaded from: classes.dex */
public class DynamicTimeOuterSkip extends DynamicButton implements com.bytedance.sdk.component.adexpress.dynamic.vG {
    private boolean pvs;

    public DynamicTimeOuterSkip(Context context, DynamicRootView dynamicRootView, so soVar) {
        super(context, dynamicRootView, soVar);
        dynamicRootView.setTimeOutListener(this);
        if (dynamicRootView.getRenderRequest() != null) {
            this.pvs = dynamicRootView.getRenderRequest().Ju();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicButton, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Jd
    public boolean Mxy() {
        super.Mxy();
        if (!TextUtils.equals(this.Ju.Wyp().icD(), "skip-with-time-skip-btn")) {
            return true;
        }
        ((TextView) this.bNS).setText("");
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (TextUtils.isEmpty(((TextView) this.bNS).getText())) {
            setMeasuredDimension(0, this.so);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget
    public void sUS() {
        if (TextUtils.equals("skip-with-time-skip-btn", this.Ju.Wyp().icD())) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.yiw, this.so);
            layoutParams.gravity = 8388629;
            setLayoutParams(layoutParams);
            this.bNS.setTextAlignment(1);
            ((TextView) this.bNS).setGravity(17);
        } else {
            super.sUS();
        }
        if (!"skip-with-time-skip-btn".equals(this.Ju.Wyp().icD())) {
            this.bNS.setTextAlignment(1);
            ((TextView) this.bNS).setGravity(17);
        }
        setVisibility(8);
    }

    private String pvs(boolean z) {
        String pvs = uc.pvs(com.bytedance.sdk.component.adexpress.Jd.pvs(), "tt_reward_screen_skip_tx");
        if (!"skip-with-time-skip-btn".equals(this.Ju.Wyp().icD())) {
            return pvs;
        }
        if (com.bytedance.sdk.component.adexpress.Jd.icD() && this.pvs) {
            pvs = "X";
        }
        return z ? pvs : "| ".concat(String.valueOf(pvs));
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.vG
    public void pvs(CharSequence charSequence, boolean z, int i, boolean z2) {
        int i2 = 0;
        if (z) {
            ((TextView) this.bNS).setText(pvs(z2));
        } else {
            if (z2) {
                ((TextView) this.bNS).setText(pvs(z2));
            }
            if (!z2) {
                i2 = 8;
            }
        }
        setVisibility(i2);
    }
}
