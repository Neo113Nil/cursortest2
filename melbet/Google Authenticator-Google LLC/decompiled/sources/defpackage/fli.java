package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class fli extends AnimatorListenerAdapter {
    final /* synthetic */ flm a;

    public fli(flm flmVar) {
        this.a = flmVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        super.onAnimationRepeat(animator);
        flm flmVar = this.a;
        int i = flmVar.e;
        int length = flm.a.length;
        flmVar.e = (i + 4) % flmVar.d.e.length;
    }
}
