package defpackage;

import android.animation.Animator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class anp implements Animator.AnimatorListener {
    final /* synthetic */ anq a;
    final /* synthetic */ anr b;

    public anp(anr anrVar, anq anqVar) {
        this.b = anrVar;
        this.a = anqVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        anq anqVar = this.a;
        anr anrVar = this.b;
        anrVar.a(1.0f, anqVar, true);
        anqVar.e();
        anqVar.f();
        anqVar.g();
        if (!anrVar.d) {
            anrVar.c += 1.0f;
            return;
        }
        anrVar.d = false;
        animator.cancel();
        animator.setDuration(1332L);
        animator.start();
        anqVar.c(false);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.b.c = 0.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }
}
