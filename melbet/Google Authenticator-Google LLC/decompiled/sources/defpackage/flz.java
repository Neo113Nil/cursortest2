package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class flz extends AnimatorListenerAdapter {
    final /* synthetic */ fmb a;

    public flz(fmb fmbVar) {
        this.a = fmbVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        super.onAnimationRepeat(animator);
        fmb fmbVar = this.a;
        fmbVar.c = (fmbVar.c + 1) % fmbVar.b.e.length;
        fmbVar.d = true;
    }
}
