package com.startapp.sdk.inappbrowser;

import android.animation.ValueAnimator;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AnimatingProgressBar f163a;

    public a(AnimatingProgressBar animatingProgressBar) {
        this.f163a = animatingProgressBar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        super/*android.widget.ProgressBar*/.setProgress(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
