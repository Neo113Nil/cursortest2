package com.bytedance.sdk.component.adexpress.widget;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.motion.widget.Key;
import com.bytedance.sdk.component.utils.uc;

/* loaded from: classes.dex */
public class BluePressInteractView extends FrameLayout {
    private View Jd;
    private int Mxy;
    private View NB;
    private Context Wyp;
    private ObjectAnimator icD;
    private AnimatorSet pvs;
    private View sUS;
    private int so;
    private boolean vG;
    private ImageView yiw;

    public BluePressInteractView(Context context, int i, int i2) {
        super(context);
        this.vG = false;
        this.pvs = new AnimatorSet();
        this.so = i;
        this.Mxy = i2;
        this.Wyp = context;
        vG();
        Jd();
    }

    private void vG() {
        View view = new View(this.Wyp);
        this.Jd = view;
        view.setBackground(pvs("#1A7BBEFF", "#337BBEFF"));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) (this.so * 0.45d), (int) (this.Mxy * 0.45d));
        layoutParams.gravity = 17;
        this.Jd.setLayoutParams(layoutParams);
        addView(this.Jd);
        View view2 = new View(this.Wyp);
        this.NB = view2;
        view2.setBackground(pvs("#337BBEFF", "#807BBEFF"));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) (this.so * 0.25d), (int) (this.Mxy * 0.25d));
        layoutParams2.gravity = 17;
        this.NB.setLayoutParams(layoutParams2);
        addView(this.NB);
        View view3 = new View(this.Wyp);
        this.sUS = view3;
        view3.setBackground(pvs("#807BBEFF", "#FF7BBEFF"));
        int i = this.so;
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams((int) (i * 0.25d), (int) (i * 0.25d));
        layoutParams3.gravity = 17;
        this.sUS.setLayoutParams(layoutParams3);
        addView(this.sUS);
        ImageView imageView = new ImageView(this.Wyp);
        this.yiw = imageView;
        imageView.setImageResource(uc.Jd(getContext(), "tt_blue_hand"));
        this.yiw.setScaleType(ImageView.ScaleType.FIT_CENTER);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams((int) (this.so * 0.62d), (int) (this.Mxy * 0.53d));
        layoutParams4.gravity = 17;
        layoutParams4.topMargin = (layoutParams4.width / 2) - 5;
        layoutParams4.leftMargin = (layoutParams4.height / 2) - 5;
        this.yiw.setLayoutParams(layoutParams4);
        addView(this.yiw);
    }

    private void Jd() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.Jd, "scaleX", 1.0f, 2.0f, 1.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.Jd, "scaleY", 1.0f, 2.0f, 1.0f);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.NB, "scaleX", 1.0f, 2.5f, 1.0f);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.NB, "scaleY", 1.0f, 2.5f, 1.0f);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.sUS, "scaleX", 1.0f, 1.5f, 1.0f);
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.sUS, "scaleY", 1.0f, 1.5f, 1.0f);
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(this.yiw, Key.ROTATION, 0.0f, -20.0f, 0.0f);
        this.icD = ofFloat7;
        ofFloat7.setDuration(1000L);
        this.pvs.setDuration(1500L);
        this.pvs.setInterpolator(new AccelerateDecelerateInterpolator());
        this.pvs.play(ofFloat).with(ofFloat2).with(ofFloat3).with(ofFloat4).with(ofFloat5).with(ofFloat6);
        this.pvs.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.widget.BluePressInteractView.1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (BluePressInteractView.this.vG) {
                    return;
                }
                BluePressInteractView.this.icD.start();
                BluePressInteractView.this.pvs.start();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                BluePressInteractView.this.vG = true;
            }
        });
    }

    private GradientDrawable pvs(String str, String str2) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(Color.parseColor(str));
        gradientDrawable.setStroke(1, Color.parseColor(str2));
        return gradientDrawable;
    }

    public void pvs() {
        this.vG = false;
        ObjectAnimator objectAnimator = this.icD;
        if (objectAnimator == null || this.pvs == null) {
            return;
        }
        objectAnimator.start();
        this.pvs.start();
    }

    public void icD() {
        this.vG = true;
        ObjectAnimator objectAnimator = this.icD;
        if (objectAnimator == null || this.pvs == null) {
            return;
        }
        objectAnimator.cancel();
        this.pvs.cancel();
    }
}
