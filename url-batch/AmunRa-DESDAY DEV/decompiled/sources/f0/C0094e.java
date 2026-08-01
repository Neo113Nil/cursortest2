package f0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: f0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0094e extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ X f2117a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2118b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f2119c;
    public final /* synthetic */ int d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f2120e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0098i f2121f;

    public C0094e(C0098i c0098i, X x2, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.f2121f = c0098i;
        this.f2117a = x2;
        this.f2118b = i;
        this.f2119c = view;
        this.d = i2;
        this.f2120e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.f2118b;
        View view = this.f2119c;
        if (i != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.d != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f2120e.setListener(null);
        C0098i c0098i = this.f2121f;
        X x2 = this.f2117a;
        c0098i.c(x2);
        c0098i.f2162p.remove(x2);
        c0098i.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f2121f.getClass();
    }
}
