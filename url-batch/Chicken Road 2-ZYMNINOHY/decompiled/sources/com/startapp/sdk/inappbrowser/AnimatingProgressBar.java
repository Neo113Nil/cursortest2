package com.startapp.sdk.inappbrowser;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ProgressBar;

/* loaded from: classes.dex */
public class AnimatingProgressBar extends ProgressBar {

    /* renamed from: c, reason: collision with root package name */
    private static final AccelerateDecelerateInterpolator f6591c = new AccelerateDecelerateInterpolator();

    /* renamed from: a, reason: collision with root package name */
    private ValueAnimator f6592a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f6593b;

    public AnimatingProgressBar(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f6593b = true;
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f6592a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Override // android.widget.ProgressBar
    public void setProgress(int i4) {
        if (!this.f6593b) {
            super.setProgress(i4);
            return;
        }
        ValueAnimator valueAnimator = this.f6592a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            if (getProgress() >= i4) {
                return;
            }
        } else {
            ValueAnimator ofInt = ValueAnimator.ofInt(getProgress(), i4);
            this.f6592a = ofInt;
            ofInt.setInterpolator(f6591c);
            this.f6592a.addUpdateListener(new a(this));
        }
        this.f6592a.setIntValues(getProgress(), i4);
        this.f6592a.start();
    }

    public final void a() {
        super.setProgress(0);
        ValueAnimator valueAnimator = this.f6592a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }
}
