package com.bytedance.sdk.component.adexpress.widget;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.Jd.yiw;
import com.bytedance.sdk.component.utils.uc;

/* loaded from: classes.dex */
public class CircleLongPressView extends FrameLayout {
    private TextView Jd;
    private RingProgressView NB;
    private ImageView icD;
    private Context pvs;
    private AnimatorSet sUS;
    private ImageView vG;

    public CircleLongPressView(Context context) {
        super(context);
        this.sUS = new AnimatorSet();
        this.pvs = context;
        NB();
        sUS();
    }

    private void NB() {
        FrameLayout frameLayout = new FrameLayout(this.pvs);
        this.NB = new RingProgressView(this.pvs);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) yiw.pvs(this.pvs, 95.0f), (int) yiw.pvs(this.pvs, 95.0f));
        layoutParams.gravity = 17;
        frameLayout.addView(this.NB, layoutParams);
        ImageView imageView = new ImageView(this.pvs);
        this.icD = imageView;
        imageView.setImageResource(uc.Jd(this.pvs, "tt_interact_circle"));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) yiw.pvs(this.pvs, 75.0f), (int) yiw.pvs(this.pvs, 75.0f));
        layoutParams2.gravity = 17;
        frameLayout.addView(this.icD, layoutParams2);
        ImageView imageView2 = new ImageView(this.pvs);
        this.vG = imageView2;
        imageView2.setImageResource(uc.Jd(this.pvs, "tt_interact_oval"));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams((int) yiw.pvs(this.pvs, 63.0f), (int) yiw.pvs(this.pvs, 63.0f));
        layoutParams3.gravity = 17;
        frameLayout.addView(this.vG, layoutParams3);
        addView(frameLayout);
        TextView textView = new TextView(this.pvs);
        this.Jd = textView;
        textView.setTextColor(-1);
        this.Jd.setMaxLines(1);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 81;
        addView(this.Jd, layoutParams4);
    }

    private void sUS() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.vG, "scaleX", 1.0f, 0.9f);
        ofFloat.setRepeatCount(-1);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat.setRepeatMode(2);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.vG, "scaleY", 1.0f, 0.9f);
        ofFloat2.setRepeatCount(-1);
        ofFloat2.setRepeatMode(2);
        ofFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
        this.sUS.setDuration(800L);
        this.sUS.playTogether(ofFloat, ofFloat2);
    }

    public void setGuideText(String str) {
        this.Jd.setText(str);
    }

    public void pvs() {
        this.sUS.start();
    }

    public void icD() {
        this.sUS.cancel();
    }

    public void vG() {
        this.NB.pvs();
    }

    public void Jd() {
        this.NB.icD();
        this.NB.vG();
    }
}
