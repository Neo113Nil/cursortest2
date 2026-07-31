package com.bytedance.sdk.component.adexpress.hhw;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.CycleInterpolator;
import android.widget.TextView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.h;

/* loaded from: classes4.dex */
public class nps extends phc {
    private View fs;
    private TextView zmn;
    private AnimatorSet zn;

    @Override // com.bytedance.sdk.component.adexpress.hhw.phc, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.bytedance.sdk.component.adexpress.hhw.phc, android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            CreativeInfoManager.viewOnMeasure(h.u, this, widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.hhw.phc
    protected void zmn(Context context) {
    }

    public nps(Context context) {
        super(context);
        this.zn = new AnimatorSet();
        fs(context);
    }

    private void fs(Context context) {
        View zmn = com.bytedance.sdk.component.adexpress.zn.zmn.zmn(context);
        this.fs = zmn;
        addView(zmn);
        setClipChildren(false);
        this.zmn = (TextView) findViewById(2097610748);
    }

    public void setButtonText(String str) {
        if (this.zmn == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.zmn.setText(str);
    }

    private void fb() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.fs, "translationY", 0.0f, com.bytedance.sdk.component.adexpress.fb.nps.zmn(getContext(), -3.0f));
        ofFloat.setInterpolator(new CycleInterpolator(1.0f));
        ofFloat.setDuration(1000L);
        ofFloat.setRepeatCount(-1);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.fs, "alpha", 1.0f, 0.8f);
        ofFloat2.setDuration(1000L);
        ofFloat2.setInterpolator(new CycleInterpolator(1.0f));
        ofFloat2.setRepeatCount(-1);
        this.zn.playTogether(ofFloat, ofFloat2);
        this.zn.setDuration(1000L);
        this.zn.start();
    }

    @Override // com.bytedance.sdk.component.adexpress.hhw.phc
    public void zmn() {
        fb();
    }

    @Override // com.bytedance.sdk.component.adexpress.hhw.phc
    public void fs() {
        this.zn.cancel();
    }
}
