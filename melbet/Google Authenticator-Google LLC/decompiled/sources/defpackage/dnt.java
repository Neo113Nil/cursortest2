package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class dnt extends AnimatorListenerAdapter {
    final /* synthetic */ dnu a;

    public dnt(dnu dnuVar) {
        this.a = dnuVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        dnu dnuVar = this.a;
        if (dnuVar.b == animator) {
            dnuVar.b = null;
        }
    }
}
