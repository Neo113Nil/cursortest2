package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class flj extends AnimatorListenerAdapter {
    final /* synthetic */ flm a;

    public flj(flm flmVar) {
        this.a = flmVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        flm flmVar = this.a;
        flmVar.a();
        aqc aqcVar = flmVar.h;
        if (aqcVar != null) {
            aqcVar.b(flmVar.j);
        }
    }
}
