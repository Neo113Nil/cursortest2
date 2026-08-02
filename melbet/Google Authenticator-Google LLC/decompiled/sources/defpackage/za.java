package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class za extends AnimatorListenerAdapter {
    final /* synthetic */ View a;
    final /* synthetic */ brn b;

    public za(brn brnVar, View view) {
        this.b = brnVar;
        this.a = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        brn brnVar = this.b;
        brnVar.L(1.0f);
        zc.d(this.a, brnVar);
    }
}
