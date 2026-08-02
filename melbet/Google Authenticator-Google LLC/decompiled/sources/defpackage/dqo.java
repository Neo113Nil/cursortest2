package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class dqo extends AnimatorListenerAdapter {
    final /* synthetic */ gzp a;
    final /* synthetic */ Drawable b;
    final /* synthetic */ dqp c;

    public dqo(dqp dqpVar, gzp gzpVar, Drawable drawable) {
        this.a = gzpVar;
        this.b = drawable;
        this.c = dqpVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        ecj ecjVar;
        dqp dqpVar = this.c;
        dqpVar.e = this.a;
        if (dqpVar.e.f() && (ecjVar = ((dqk) dqpVar.e.b()).c) != null) {
            ecjVar.c = true;
            AnimatorSet animatorSet = ecjVar.b;
            if (animatorSet != null) {
                animatorSet.start();
            }
        }
        dqpVar.a.m(this.b);
    }
}
