package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fmw extends AnimatorListenerAdapter {
    final /* synthetic */ View a;
    final /* synthetic */ Animator b;

    public fmw(View view, Animator animator) {
        this.a = view;
        this.b = animator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.setVisibility(8);
        this.b.start();
    }
}
