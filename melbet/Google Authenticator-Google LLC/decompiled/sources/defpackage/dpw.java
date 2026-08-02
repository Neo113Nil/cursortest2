package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class dpw extends AnimatorListenerAdapter {
    final /* synthetic */ dpx a;

    public dpw(dpx dpxVar) {
        this.a = dpxVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        dpx dpxVar = this.a;
        dpxVar.a.setVisibility(8);
        dpxVar.b.g(null);
    }
}
