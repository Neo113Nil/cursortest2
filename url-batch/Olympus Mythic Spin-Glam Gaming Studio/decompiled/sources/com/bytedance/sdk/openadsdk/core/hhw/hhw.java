package com.bytedance.sdk.openadsdk.core.hhw;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RotateDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;

/* loaded from: classes5.dex */
public class hhw extends FrameLayout {
    private Drawable btk;
    private Drawable fb;
    private int fs;
    private boolean hhw;
    private ValueAnimator nps;
    private boolean zg;
    private int zmn;
    private Drawable zn;

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    public void setProgress(int i) {
        this.fs = i;
        Drawable drawable = this.zn;
        if (drawable != null) {
            drawable.setLevel((int) ((i * 10000.0f) / this.zmn));
        }
    }

    public void setMax(int i) {
        this.zmn = i;
    }

    public void setProgressDrawable(Drawable drawable) {
        this.fb = drawable;
        setBackground(drawable);
        Drawable drawable2 = this.fb;
        if (drawable2 instanceof LayerDrawable) {
            int numberOfLayers = ((LayerDrawable) drawable2).getNumberOfLayers();
            for (int i = 0; i < numberOfLayers; i++) {
                Drawable drawable3 = ((LayerDrawable) this.fb).getDrawable(i);
                if ((drawable3 instanceof ScaleDrawable) || (drawable3 instanceof ClipDrawable)) {
                    this.zn = drawable3;
                }
            }
        }
        Drawable drawable4 = this.fb;
        if (drawable4 instanceof RotateDrawable) {
            this.zn = drawable4;
        }
    }

    public void setIndeterminateDrawable(Drawable drawable) {
        this.btk = drawable;
        setProgressDrawable(drawable);
        if (this.hhw && this.nps == null) {
            zmn();
        }
    }

    public hhw(Context context) {
        super(context);
        this.zmn = 100;
    }

    public hhw(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.zmn = 100;
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(bvs.zmn(this, layoutParams));
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.hhw = true;
        if (this.btk != null) {
            zmn();
        }
    }

    private void zmn() {
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 10000);
        this.nps = ofInt;
        ofInt.setDuration(2000L);
        this.nps.setRepeatCount(-1);
        this.nps.setInterpolator(new LinearInterpolator());
        this.nps.setRepeatMode(1);
        this.nps.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.hhw.hhw.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                hhw.this.setProgress(((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        });
        this.nps.start();
        setMax(10000);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.hhw = false;
        ValueAnimator valueAnimator = this.nps;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.nps.removeAllUpdateListeners();
            this.nps = null;
        }
    }

    @Override // android.view.View
    protected void onVisibilityChanged(@NonNull View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            if (this.zg) {
                this.zg = false;
                ValueAnimator valueAnimator = this.nps;
                if (valueAnimator != null) {
                    valueAnimator.resume();
                    return;
                } else {
                    zmn();
                    return;
                }
            }
            return;
        }
        ValueAnimator valueAnimator2 = this.nps;
        if (valueAnimator2 == null || this.zg) {
            return;
        }
        this.zg = true;
        valueAnimator2.pause();
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }
}
