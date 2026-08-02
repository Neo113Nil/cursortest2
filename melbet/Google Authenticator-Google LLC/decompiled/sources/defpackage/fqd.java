package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class fqd extends AnimatorListenerAdapter {
    final /* synthetic */ fqe a;

    public fqd(fqe fqeVar) {
        this.a = fqeVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.f.m(false);
    }
}
