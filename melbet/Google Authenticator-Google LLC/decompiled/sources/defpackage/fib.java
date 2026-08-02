package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fib extends AnimatorListenerAdapter {
    final /* synthetic */ fif a;
    private boolean b;

    public fib(fif fifVar) {
        this.a = fifVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.b = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        fif fifVar = this.a;
        fifVar.A = 0;
        fifVar.v = null;
        if (this.b) {
            return;
        }
        fifVar.B.k(4, false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        fif fifVar = this.a;
        fifVar.B.k(0, false);
        fifVar.A = 1;
        fifVar.v = animator;
        this.b = false;
    }
}
