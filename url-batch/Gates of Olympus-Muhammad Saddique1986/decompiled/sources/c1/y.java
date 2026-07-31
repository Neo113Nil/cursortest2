package c1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* loaded from: classes.dex */
public final class y extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ F f5618a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f5619b;

    public y(View view, F f3) {
        this.f5618a = f3;
        this.f5619b = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        F f3 = this.f5618a;
        f3.f5557a.c(1.0f);
        C0375B.d(this.f5619b, f3);
    }
}
