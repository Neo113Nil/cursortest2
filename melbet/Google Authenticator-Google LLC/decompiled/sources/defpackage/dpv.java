package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class dpv extends AnimatorListenerAdapter {
    final /* synthetic */ Drawable a;
    final /* synthetic */ dpx b;

    public dpv(dpx dpxVar, Drawable drawable) {
        this.a = drawable;
        this.b = dpxVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        dpx dpxVar = this.b;
        dpxVar.b.g(this.a);
        dpxVar.a.setVisibility(0);
    }
}
