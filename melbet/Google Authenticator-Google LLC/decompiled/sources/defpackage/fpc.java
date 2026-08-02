package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.view.ViewPropertyAnimator;
import com.google.android.material.snackbar.SnackbarContentLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class fpc extends AnimatorListenerAdapter {
    final /* synthetic */ fpk a;

    public fpc(fpk fpkVar) {
        this.a = fpkVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.k();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        fpk fpkVar = this.a;
        SnackbarContentLayout snackbarContentLayout = fpkVar.t;
        snackbarContentLayout.a.setAlpha(1.0f);
        ViewPropertyAnimator alpha = snackbarContentLayout.a.animate().alpha(0.0f);
        long j = fpkVar.d;
        ViewPropertyAnimator duration = alpha.setDuration(j);
        TimeInterpolator timeInterpolator = snackbarContentLayout.c;
        duration.setInterpolator(timeInterpolator).setStartDelay(0L).start();
        if (snackbarContentLayout.b.getVisibility() == 0) {
            snackbarContentLayout.b.setAlpha(1.0f);
            snackbarContentLayout.b.animate().alpha(0.0f).setDuration(j).setInterpolator(timeInterpolator).setStartDelay(0L).start();
        }
    }
}
