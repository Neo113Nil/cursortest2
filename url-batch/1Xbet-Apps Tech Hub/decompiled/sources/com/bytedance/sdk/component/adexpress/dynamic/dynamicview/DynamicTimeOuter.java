package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.Jd.sUS;
import com.bytedance.sdk.component.adexpress.Jd.yiw;
import com.bytedance.sdk.component.adexpress.dynamic.Jd.qh;
import com.bytedance.sdk.component.adexpress.dynamic.vG.so;
import com.bytedance.sdk.component.utils.uc;

/* loaded from: classes.dex */
public class DynamicTimeOuter extends DynamicButton implements com.bytedance.sdk.component.adexpress.dynamic.vG {
    private boolean icD;
    private boolean pvs;
    private boolean uc;

    public DynamicTimeOuter(Context context, DynamicRootView dynamicRootView, so soVar) {
        super(context, dynamicRootView, soVar);
        dynamicRootView.setTimeOutListener(this);
        if ("timedown".equals(soVar.Wyp().icD())) {
            dynamicRootView.setTimedown(this.so);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicButton, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Jd
    public boolean Mxy() {
        super.Mxy();
        if (sUS.icD(this.IP.getRenderRequest().Jd())) {
            setVisibility(8);
        }
        if ("timedown".equals(this.Ju.Wyp().icD())) {
            ((TextView) this.bNS).setText(String.valueOf((int) Double.parseDouble(this.kj.Wyp())));
            return true;
        }
        ((TextView) this.bNS).setText(((int) Double.parseDouble(this.kj.Wyp())) + "s");
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget
    public void sUS() {
        if (TextUtils.equals("skip-with-countdowns-video-countdown", this.Ju.Wyp().icD()) || TextUtils.equals("skip-with-time-countdown", this.Ju.Wyp().icD())) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.yiw, this.so);
            layoutParams.gravity = 8388627;
            if (com.bytedance.sdk.component.adexpress.Jd.icD()) {
                layoutParams.leftMargin = this.Mxy;
            }
            layoutParams.setMarginStart(layoutParams.leftMargin);
            layoutParams.setMarginEnd(layoutParams.rightMargin);
            setLayoutParams(layoutParams);
            return;
        }
        super.sUS();
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (TextUtils.isEmpty(((TextView) this.bNS).getText())) {
            setMeasuredDimension(0, this.so);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.vG
    public void pvs(CharSequence charSequence, boolean z, int i, boolean z2) {
        if (z2 || this.uc) {
            ((TextView) this.bNS).setText("");
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
        if (!z && this.IP.getRenderRequest().pvs() && sUS.icD(this.IP.getRenderRequest().Jd())) {
            ((TextView) this.bNS).setText(String.format(uc.pvs(com.bytedance.sdk.component.adexpress.Jd.pvs(), "tt_reward_full_skip"), Integer.valueOf(i)));
            this.pvs = true;
            return;
        }
        if (com.bytedance.sdk.component.adexpress.Jd.icD() && !"open_ad".equals(this.IP.getRenderRequest().Jd()) && this.IP.getRenderRequest().pvs()) {
            this.uc = true;
            setVisibility(8);
            return;
        }
        if ("timedown".equals(this.Ju.Wyp().icD())) {
            ((TextView) this.bNS).setText(charSequence);
            return;
        }
        ((TextView) this.bNS).setText(((Object) charSequence) + "s");
        this.icD = true;
        if (this.pvs) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) (qh.icD(((TextView) this.bNS).getText() != null ? r4.toString() : "", this.kj.NB(), true)[0] + yiw.pvs(com.bytedance.sdk.component.adexpress.Jd.pvs(), this.kj.vG() + this.kj.Jd())), this.so);
            layoutParams.gravity = 8388629;
            this.bNS.setLayoutParams(layoutParams);
            this.pvs = false;
            requestLayout();
        }
    }
}
