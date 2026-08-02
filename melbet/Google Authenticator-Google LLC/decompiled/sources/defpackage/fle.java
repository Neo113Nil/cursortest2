package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class fle extends AnimatorListenerAdapter {
    final /* synthetic */ flh a;

    public fle(flh flhVar) {
        this.a = flhVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        flh flhVar = this.a;
        flhVar.a();
        aqc aqcVar = flhVar.i;
        if (aqcVar != null) {
            aqcVar.b(flhVar.j);
        }
    }
}
