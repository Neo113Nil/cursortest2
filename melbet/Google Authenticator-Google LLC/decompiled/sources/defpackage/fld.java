package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class fld extends AnimatorListenerAdapter {
    final /* synthetic */ flh a;

    public fld(flh flhVar) {
        this.a = flhVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        super.onAnimationRepeat(animator);
        flh flhVar = this.a;
        flhVar.f = (flhVar.f + 4) % flhVar.e.e.length;
    }
}
