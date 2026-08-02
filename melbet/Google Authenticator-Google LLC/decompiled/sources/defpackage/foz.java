package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class foz extends AnimatorListenerAdapter {
    final /* synthetic */ fpk a;

    public foz(fpk fpkVar) {
        this.a = fpkVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.k();
    }
}
