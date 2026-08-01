package com.bytedance.sdk.component.adexpress.widget;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.CycleInterpolator;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.Jd.yiw;
import com.bytedance.sdk.component.adexpress.vG.pvs;

/* loaded from: classes.dex */
public class ClickSlideUpView extends SlideUpView {
    private View icD;
    private TextView pvs;
    private AnimatorSet vG;

    @Override // com.bytedance.sdk.component.adexpress.widget.SlideUpView
    protected void pvs(Context context) {
    }

    public ClickSlideUpView(Context context) {
        super(context);
        this.vG = new AnimatorSet();
        icD(context);
    }

    private void icD(Context context) {
        View pvs = pvs.pvs(context);
        this.icD = pvs;
        addView(pvs);
        setClipChildren(false);
        this.pvs = (TextView) findViewById(2097610748);
    }

    public void setButtonText(String str) {
        if (this.pvs == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.pvs.setText(str);
    }

    private void Jd() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.icD, "translationY", 0.0f, yiw.pvs(getContext(), -3.0f));
        ofFloat.setInterpolator(new CycleInterpolator(1.0f));
        ofFloat.setDuration(1000L);
        ofFloat.setRepeatCount(-1);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.icD, "alpha", 1.0f, 0.8f);
        ofFloat2.setDuration(1000L);
        ofFloat2.setInterpolator(new CycleInterpolator(1.0f));
        ofFloat2.setRepeatCount(-1);
        this.vG.playTogether(ofFloat, ofFloat2);
        this.vG.setDuration(1000L);
        this.vG.start();
    }

    @Override // com.bytedance.sdk.component.adexpress.widget.SlideUpView
    public void pvs() {
        Jd();
    }

    @Override // com.bytedance.sdk.component.adexpress.widget.SlideUpView
    public void icD() {
        this.vG.cancel();
    }
}
