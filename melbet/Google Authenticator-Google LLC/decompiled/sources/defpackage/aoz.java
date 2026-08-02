package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aoz extends AnimatorListenerAdapter {
    final /* synthetic */ ape a;

    public aoz(ape apeVar) {
        this.a = apeVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.p();
        animator.removeListener(this);
    }
}
