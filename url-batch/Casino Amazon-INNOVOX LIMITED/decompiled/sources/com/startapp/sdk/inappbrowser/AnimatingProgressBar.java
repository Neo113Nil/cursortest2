package com.startapp.sdk.inappbrowser;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ProgressBar;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public class AnimatingProgressBar extends ProgressBar {
    private static final AccelerateDecelerateInterpolator c = new AccelerateDecelerateInterpolator();

    /* renamed from: a, reason: collision with root package name */
    private ValueAnimator f161a;
    private final boolean b;

    public AnimatingProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = true;
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f161a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Override // android.widget.ProgressBar
    public void setProgress(int i) {
        if (!this.b) {
            super.setProgress(i);
            return;
        }
        ValueAnimator valueAnimator = this.f161a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            if (getProgress() >= i) {
                return;
            }
        } else {
            ValueAnimator ofInt = ValueAnimator.ofInt(getProgress(), i);
            this.f161a = ofInt;
            ofInt.setInterpolator(c);
            this.f161a.addUpdateListener(new a(this));
        }
        this.f161a.setIntValues(getProgress(), i);
        this.f161a.start();
    }

    public final void a() {
        super.setProgress(0);
        ValueAnimator valueAnimator = this.f161a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }
}
