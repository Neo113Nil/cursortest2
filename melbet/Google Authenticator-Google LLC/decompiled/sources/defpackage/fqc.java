package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class fqc extends AnimatorListenerAdapter {
    final /* synthetic */ fqe a;

    public fqc(fqe fqeVar) {
        this.a = fqeVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.f.m(true);
    }
}
