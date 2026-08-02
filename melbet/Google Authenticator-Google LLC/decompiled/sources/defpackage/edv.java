package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class edv extends AnimatorListenerAdapter {
    final /* synthetic */ eea a;

    public edv(eea eeaVar) {
        this.a = eeaVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        eea eeaVar = this.a;
        eeaVar.m.setVisibility(4);
        eeaVar.l.setVisibility(4);
        eeaVar.v = null;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.n.setVisibility(0);
    }
}
