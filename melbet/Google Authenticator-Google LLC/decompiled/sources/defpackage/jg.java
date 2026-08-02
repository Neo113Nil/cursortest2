package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jg extends AnimatorListenerAdapter {
    final /* synthetic */ jh a;
    final /* synthetic */ ViewPropertyAnimator b;
    final /* synthetic */ View c;
    final /* synthetic */ kv d;

    public jg(kv kvVar, jh jhVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.d = kvVar;
        this.a = jhVar;
        this.b = viewPropertyAnimator;
        this.c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.setListener(null);
        View view = this.c;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        kv kvVar = this.d;
        jh jhVar = this.a;
        kvVar.a(jhVar.b);
        kvVar.l.remove(jhVar.b);
        kvVar.c();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        lp lpVar = this.a.b;
    }
}
