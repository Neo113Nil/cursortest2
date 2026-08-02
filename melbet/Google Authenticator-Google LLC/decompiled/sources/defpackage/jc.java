package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jc extends AnimatorListenerAdapter {
    final /* synthetic */ lp a;
    final /* synthetic */ ViewPropertyAnimator b;
    final /* synthetic */ View c;
    final /* synthetic */ kv d;

    public jc(kv kvVar, lp lpVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.d = kvVar;
        this.a = lpVar;
        this.b = viewPropertyAnimator;
        this.c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.setListener(null);
        this.c.setAlpha(1.0f);
        kv kvVar = this.d;
        lp lpVar = this.a;
        kvVar.a(lpVar);
        kvVar.k.remove(lpVar);
        kvVar.c();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
