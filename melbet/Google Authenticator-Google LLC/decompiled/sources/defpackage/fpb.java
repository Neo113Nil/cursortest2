package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.view.ViewPropertyAnimator;
import com.google.android.material.snackbar.SnackbarContentLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fpb extends AnimatorListenerAdapter {
    final /* synthetic */ fpk a;

    public fpb(fpk fpkVar) {
        this.a = fpkVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.f();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        fpk fpkVar = this.a;
        SnackbarContentLayout snackbarContentLayout = fpkVar.t;
        snackbarContentLayout.a.setAlpha(0.0f);
        ViewPropertyAnimator alpha = snackbarContentLayout.a.animate().alpha(1.0f);
        int i = fpkVar.c;
        long j = i;
        ViewPropertyAnimator duration = alpha.setDuration(j);
        TimeInterpolator timeInterpolator = snackbarContentLayout.c;
        ViewPropertyAnimator interpolator = duration.setInterpolator(timeInterpolator);
        long j2 = fpkVar.e - i;
        interpolator.setStartDelay(j2).start();
        if (snackbarContentLayout.b.getVisibility() == 0) {
            snackbarContentLayout.b.setAlpha(0.0f);
            snackbarContentLayout.b.animate().alpha(1.0f).setDuration(j).setInterpolator(timeInterpolator).setStartDelay(j2).start();
        }
    }
}
