package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class fqn extends AnimatorListenerAdapter {
    final /* synthetic */ fqo a;

    public fqn(fqo fqoVar) {
        this.a = fqoVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        fqo fqoVar = this.a;
        fqoVar.x();
        fqoVar.d.start();
    }
}
