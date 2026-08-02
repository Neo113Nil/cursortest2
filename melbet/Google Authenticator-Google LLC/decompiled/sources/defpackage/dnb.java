package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class dnb extends AnimatorListenerAdapter {
    final /* synthetic */ dne a;

    public dnb(dne dneVar) {
        this.a = dneVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        dni dniVar = this.a.j;
        if (dniVar != null) {
            dniVar.start();
        }
    }
}
