package t0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: t0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5041d extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC5032P f40678a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f40679b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f40680c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f40681d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f40682e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C5045h f40683f;

    public C5041d(C5045h c5045h, AbstractC5032P abstractC5032P, int i, View view, int i4, ViewPropertyAnimator viewPropertyAnimator) {
        this.f40683f = c5045h;
        this.f40678a = abstractC5032P;
        this.f40679b = i;
        this.f40680c = view;
        this.f40681d = i4;
        this.f40682e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.f40679b;
        View view = this.f40680c;
        if (i != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.f40681d != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f40682e.setListener(null);
        C5045h c5045h = this.f40683f;
        AbstractC5032P abstractC5032P = this.f40678a;
        c5045h.c(abstractC5032P);
        c5045h.f40709p.remove(abstractC5032P);
        c5045h.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f40683f.getClass();
    }
}
