package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class drq extends AnimatorListenerAdapter {
    final /* synthetic */ drr a;

    public drq(drr drrVar) {
        this.a = drrVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.a.b.setEnabled(true);
    }
}
