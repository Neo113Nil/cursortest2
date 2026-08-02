package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aoy extends AnimatorListenerAdapter {
    final /* synthetic */ qi a;
    final /* synthetic */ ape b;

    public aoy(ape apeVar, qi qiVar) {
        this.b = apeVar;
        this.a = qiVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.remove(animator);
        this.b.k.remove(animator);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.b.k.add(animator);
    }
}
