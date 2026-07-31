package com.bytedance.sdk.component.adexpress.hhw;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.view.MotionEvent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.am;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.h;

/* loaded from: classes9.dex */
public class zn extends FrameLayout {
    private cyb btk;
    private TextView fb;
    private ImageView fs;
    private AnimatorSet hhw;
    private Context zmn;
    private ImageView zn;

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            CreativeInfoManager.viewOnMeasure(h.u, this, widthMeasureSpec, heightMeasureSpec);
        }
    }

    public zn(@NonNull Context context) {
        super(context);
        this.hhw = new AnimatorSet();
        this.zmn = context;
        btk();
        hhw();
    }

    private void btk() {
        FrameLayout frameLayout = new FrameLayout(this.zmn);
        this.btk = new cyb(this.zmn);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.fb.nps.zmn(this.zmn, 95.0f), (int) com.bytedance.sdk.component.adexpress.fb.nps.zmn(this.zmn, 95.0f));
        layoutParams.gravity = 17;
        frameLayout.addView(this.btk, layoutParams);
        this.fs = new ImageView(this.zmn);
        int zmn = am.zmn(this.zmn, 60.0f);
        this.fs.setImageDrawable(com.bytedance.sdk.component.adexpress.fb.zg.zmn(1, null, null, new int[]{zmn, zmn}, Integer.valueOf(am.zmn(this.zmn, 1.0f)), Integer.valueOf(Color.parseColor("#80FFFFFF"))));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.fb.nps.zmn(this.zmn, 75.0f), (int) com.bytedance.sdk.component.adexpress.fb.nps.zmn(this.zmn, 75.0f));
        layoutParams2.gravity = 17;
        frameLayout.addView(this.fs, layoutParams2);
        this.zn = new ImageView(this.zmn);
        int zmn2 = am.zmn(this.zmn, 50.0f);
        this.zn.setImageDrawable(com.bytedance.sdk.component.adexpress.fb.zg.zmn(1, Integer.valueOf(Color.parseColor("#80FFFFFF")), null, new int[]{zmn2, zmn2}, null, null));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.fb.nps.zmn(this.zmn, 63.0f), (int) com.bytedance.sdk.component.adexpress.fb.nps.zmn(this.zmn, 63.0f));
        layoutParams3.gravity = 17;
        frameLayout.addView(this.zn, layoutParams3);
        addView(frameLayout);
        TextView textView = new TextView(this.zmn);
        this.fb = textView;
        textView.setTextColor(-1);
        this.fb.setMaxLines(1);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 81;
        addView(this.fb, layoutParams4);
    }

    private void hhw() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.zn, "scaleX", 1.0f, 0.9f);
        ofFloat.setRepeatCount(-1);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat.setRepeatMode(2);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.zn, "scaleY", 1.0f, 0.9f);
        ofFloat2.setRepeatCount(-1);
        ofFloat2.setRepeatMode(2);
        ofFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
        this.hhw.setDuration(800L);
        this.hhw.playTogether(ofFloat, ofFloat2);
    }

    public void setGuideText(String str) {
        this.fb.setText(str);
    }

    public void zmn() {
        this.hhw.start();
    }

    public void fs() {
        this.hhw.cancel();
    }

    public void zn() {
        this.btk.zmn();
    }

    public void fb() {
        this.btk.fs();
        this.btk.zn();
    }
}
