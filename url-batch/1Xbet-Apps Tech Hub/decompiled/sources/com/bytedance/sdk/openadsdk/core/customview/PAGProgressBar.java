package com.bytedance.sdk.openadsdk.core.customview;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RotateDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;

/* loaded from: classes2.dex */
public class PAGProgressBar extends FrameLayout {
    private Drawable Jd;
    private Drawable NB;
    private int icD;
    private int pvs;
    private boolean sUS;
    private boolean so;
    private Drawable vG;
    private ValueAnimator yiw;

    public void setProgress(int i) {
        this.icD = i;
        Drawable drawable = this.vG;
        if (drawable != null) {
            drawable.setLevel((int) ((i * 10000.0f) / this.pvs));
        }
    }

    public void setMax(int i) {
        this.pvs = i;
    }

    public void setProgressDrawable(Drawable drawable) {
        this.Jd = drawable;
        setBackground(drawable);
        Drawable drawable2 = this.Jd;
        if (drawable2 instanceof LayerDrawable) {
            int numberOfLayers = ((LayerDrawable) drawable2).getNumberOfLayers();
            for (int i = 0; i < numberOfLayers; i++) {
                Drawable drawable3 = ((LayerDrawable) this.Jd).getDrawable(i);
                if ((drawable3 instanceof ScaleDrawable) || (drawable3 instanceof ClipDrawable)) {
                    this.vG = drawable3;
                }
            }
        }
        Drawable drawable4 = this.Jd;
        if (drawable4 instanceof RotateDrawable) {
            this.vG = drawable4;
        }
    }

    public void setIndeterminateDrawable(Drawable drawable) {
        this.NB = drawable;
        setProgressDrawable(drawable);
        if (this.sUS && this.yiw == null) {
            pvs();
        }
    }

    public PAGProgressBar(Context context) {
        super(context);
        this.pvs = 100;
    }

    public PAGProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.pvs = 100;
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(pvs.pvs(this, layoutParams));
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.sUS = true;
        if (this.NB != null) {
            pvs();
        }
    }

    private void pvs() {
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 10000);
        this.yiw = ofInt;
        ofInt.setDuration(2000L);
        this.yiw.setRepeatCount(-1);
        this.yiw.setInterpolator(new LinearInterpolator());
        this.yiw.setRepeatMode(1);
        this.yiw.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.customview.PAGProgressBar.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                PAGProgressBar.this.setProgress(((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        });
        this.yiw.start();
        setMax(10000);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.sUS = false;
        ValueAnimator valueAnimator = this.yiw;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.yiw.removeAllUpdateListeners();
            this.yiw = null;
        }
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            if (this.so) {
                this.so = false;
                ValueAnimator valueAnimator = this.yiw;
                if (valueAnimator != null) {
                    valueAnimator.resume();
                    return;
                } else {
                    pvs();
                    return;
                }
            }
            return;
        }
        if (this.yiw == null || this.so) {
            return;
        }
        this.so = true;
        this.yiw.pause();
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }
}
