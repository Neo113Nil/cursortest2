package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class edx extends AnimatorListenerAdapter {
    final /* synthetic */ eea a;

    public edx(eea eeaVar) {
        this.a = eeaVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.n.setVisibility(8);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        eea eeaVar = this.a;
        eeaVar.m.setVisibility(0);
        eeaVar.l.setVisibility(0);
    }
}
