package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class dqn extends AnimatorListenerAdapter {
    final /* synthetic */ dqp a;

    public dqn(dqp dqpVar) {
        this.a = dqpVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ecj ecjVar;
        dqp dqpVar = this.a;
        if (dqpVar.e.f() && (ecjVar = ((dqk) dqpVar.e.b()).c) != null) {
            ecjVar.c = false;
            AnimatorSet animatorSet = ecjVar.b;
            if (animatorSet != null) {
                animatorSet.end();
            }
        }
        dqpVar.a.m(null);
    }
}
