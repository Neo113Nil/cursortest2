package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class fmd extends AnimatorListenerAdapter {
    final /* synthetic */ fmf a;

    public fmd(fmf fmfVar) {
        this.a = fmfVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        fmf fmfVar = this.a;
        fmfVar.a();
        aqc aqcVar = fmfVar.h;
        if (aqcVar != null) {
            aqcVar.b(fmfVar.j);
        }
    }
}
