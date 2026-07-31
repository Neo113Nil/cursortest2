package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;

/* loaded from: classes4.dex */
public class rp extends nps implements com.bytedance.sdk.component.adexpress.dynamic.zn {
    private boolean fs;
    private boolean iqz;
    private boolean zmn;

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.nps, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.hhw, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.btk, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    public rp(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.fb.zg zgVar) {
        super(context, dynamicRootView, zgVar);
        dynamicRootView.setTimeOutListener(this);
        if ("timedown".equals(zgVar.iv().fs())) {
            dynamicRootView.setTimedown(this.zg);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.nps, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.hhw, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.tf
    public boolean bvs() {
        super.bvs();
        if (com.bytedance.sdk.component.adexpress.fb.hhw.fs(this.rt.getRenderRequest().fb())) {
            setVisibility(8);
        }
        if ("timedown".equals(this.mw.iv().fs())) {
            ((TextView) this.cn).setText(String.valueOf((int) Double.parseDouble(this.klz.iv())));
            return true;
        }
        ((TextView) this.cn).setText(((int) Double.parseDouble(this.klz.iv())) + "s");
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.btk
    public void hhw() {
        if (TextUtils.equals("skip-with-countdowns-video-countdown", this.mw.iv().fs()) || TextUtils.equals("skip-with-time-countdown", this.mw.iv().fs())) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.nps, this.zg);
            layoutParams.gravity = 8388627;
            if (com.bytedance.sdk.component.adexpress.fb.fs()) {
                layoutParams.leftMargin = this.bvs;
            }
            layoutParams.setMarginStart(layoutParams.leftMargin);
            layoutParams.setMarginEnd(layoutParams.rightMargin);
            setLayoutParams(layoutParams);
            return;
        }
        super.hhw();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.nps, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.hhw, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.btk, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (TextUtils.isEmpty(((TextView) this.cn).getText())) {
            setMeasuredDimension(0, this.zg);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.zn
    public void zmn(CharSequence charSequence, boolean z, int i, boolean z2) {
        String str = "";
        if (z2 || this.iqz) {
            ((TextView) this.cn).setText("");
            setVisibility(8);
            return;
        }
        try {
            if (Integer.parseInt((String) charSequence) <= 0) {
                setVisibility(8);
                return;
            }
        } catch (Exception unused) {
        }
        setVisibility(0);
        if (!z && this.rt.getRenderRequest().zmn() && com.bytedance.sdk.component.adexpress.fb.hhw.fs(this.rt.getRenderRequest().fb())) {
            if (com.bytedance.sdk.component.adexpress.fb.fs()) {
                ((TextView) this.cn).setText(i + "s");
            } else {
                ((TextView) this.cn).setText(String.format(com.bytedance.sdk.component.utils.doe.zmn(com.bytedance.sdk.component.adexpress.fb.zmn(), "tt_reward_full_skip"), Integer.valueOf(i)));
            }
            this.zmn = true;
            return;
        }
        if (com.bytedance.sdk.component.adexpress.fb.fs() && !"open_ad".equals(this.rt.getRenderRequest().fb()) && this.rt.getRenderRequest().zmn()) {
            this.iqz = true;
            setVisibility(8);
            return;
        }
        if ("timedown".equals(this.mw.iv().fs())) {
            ((TextView) this.cn).setText(charSequence);
            return;
        }
        ((TextView) this.cn).setText(((Object) charSequence) + "s");
        this.fs = true;
        if (this.zmn) {
            CharSequence text = ((TextView) this.cn).getText();
            if (text != null) {
                str = text.toString();
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) (com.bytedance.sdk.component.adexpress.dynamic.btk.rc.fs(str, this.klz.btk(), true)[0] + com.bytedance.sdk.component.adexpress.fb.nps.zmn(com.bytedance.sdk.component.adexpress.fb.zmn(), this.klz.zn() + this.klz.fb())), this.zg);
            layoutParams.gravity = 8388629;
            this.cn.setLayoutParams(layoutParams);
            this.zmn = false;
            requestLayout();
        }
    }
}
