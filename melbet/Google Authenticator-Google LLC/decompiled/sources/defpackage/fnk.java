package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class fnk extends AnimatorListenerAdapter {
    final /* synthetic */ AnimatorSet a;
    final /* synthetic */ fnr b;

    public fnk(fnr fnrVar, AnimatorSet animatorSet) {
        this.a = animatorSet;
        this.b = fnrVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        fnr fnrVar = this.b;
        fnrVar.c.setVisibility(8);
        fng fngVar = fnrVar.a;
        if (!fngVar.i()) {
            fnrVar.j.clearFocus();
        }
        fngVar.j(2, true);
        if (fnrVar.m == this.a) {
            fnrVar.m = null;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.b.a.j(1, true);
    }
}
