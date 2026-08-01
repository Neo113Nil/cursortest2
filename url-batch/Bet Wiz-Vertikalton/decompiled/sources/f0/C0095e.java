package f0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: f0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0095e extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ X f2185a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2186b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f2187c;
    public final /* synthetic */ int d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f2188e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0099i f2189f;

    public C0095e(C0099i c0099i, X x2, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.f2189f = c0099i;
        this.f2185a = x2;
        this.f2186b = i;
        this.f2187c = view;
        this.d = i2;
        this.f2188e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.f2186b;
        View view = this.f2187c;
        if (i != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.d != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f2188e.setListener(null);
        C0099i c0099i = this.f2189f;
        X x2 = this.f2185a;
        c0099i.c(x2);
        c0099i.f2230p.remove(x2);
        c0099i.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f2189f.getClass();
    }
}
