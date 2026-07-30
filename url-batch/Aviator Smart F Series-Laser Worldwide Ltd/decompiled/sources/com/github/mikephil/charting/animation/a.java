package com.github.mikephil.charting.animation;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import androidx.annotation.RequiresApi;
import com.github.mikephil.charting.animation.b;

/* loaded from: classes3.dex */
public class a {
    private ValueAnimator.AnimatorUpdateListener mListener;
    protected float mPhaseY = 1.0f;
    protected float mPhaseX = 1.0f;

    public a() {
    }

    @RequiresApi(11)
    private ObjectAnimator xAnimator(int i8, b.c0 c0Var) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "phaseX", 0.0f, 1.0f);
        ofFloat.setInterpolator(c0Var);
        ofFloat.setDuration(i8);
        return ofFloat;
    }

    @RequiresApi(11)
    private ObjectAnimator yAnimator(int i8, b.c0 c0Var) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "phaseY", 0.0f, 1.0f);
        ofFloat.setInterpolator(c0Var);
        ofFloat.setDuration(i8);
        return ofFloat;
    }

    @RequiresApi(11)
    public void animateX(int i8) {
        animateX(i8, b.Linear);
    }

    @RequiresApi(11)
    public void animateXY(int i8, int i9) {
        b.c0 c0Var = b.Linear;
        animateXY(i8, i9, c0Var, c0Var);
    }

    @RequiresApi(11)
    public void animateY(int i8) {
        animateY(i8, b.Linear);
    }

    public float getPhaseX() {
        return this.mPhaseX;
    }

    public float getPhaseY() {
        return this.mPhaseY;
    }

    public void setPhaseX(float f8) {
        if (f8 > 1.0f) {
            f8 = 1.0f;
        } else if (f8 < 0.0f) {
            f8 = 0.0f;
        }
        this.mPhaseX = f8;
    }

    public void setPhaseY(float f8) {
        if (f8 > 1.0f) {
            f8 = 1.0f;
        } else if (f8 < 0.0f) {
            f8 = 0.0f;
        }
        this.mPhaseY = f8;
    }

    @RequiresApi(11)
    public a(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.mListener = animatorUpdateListener;
    }

    @RequiresApi(11)
    public void animateX(int i8, b.c0 c0Var) {
        ObjectAnimator xAnimator = xAnimator(i8, c0Var);
        xAnimator.addUpdateListener(this.mListener);
        xAnimator.start();
    }

    @RequiresApi(11)
    public void animateXY(int i8, int i9, b.c0 c0Var) {
        ObjectAnimator xAnimator = xAnimator(i8, c0Var);
        ObjectAnimator yAnimator = yAnimator(i9, c0Var);
        if (i8 > i9) {
            xAnimator.addUpdateListener(this.mListener);
        } else {
            yAnimator.addUpdateListener(this.mListener);
        }
        xAnimator.start();
        yAnimator.start();
    }

    @RequiresApi(11)
    public void animateY(int i8, b.c0 c0Var) {
        ObjectAnimator yAnimator = yAnimator(i8, c0Var);
        yAnimator.addUpdateListener(this.mListener);
        yAnimator.start();
    }

    @RequiresApi(11)
    public void animateXY(int i8, int i9, b.c0 c0Var, b.c0 c0Var2) {
        ObjectAnimator xAnimator = xAnimator(i8, c0Var);
        ObjectAnimator yAnimator = yAnimator(i9, c0Var2);
        if (i8 > i9) {
            xAnimator.addUpdateListener(this.mListener);
        } else {
            yAnimator.addUpdateListener(this.mListener);
        }
        xAnimator.start();
        yAnimator.start();
    }
}
