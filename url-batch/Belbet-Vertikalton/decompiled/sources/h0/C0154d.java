package h0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: h0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0154d extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ V f3004a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3005b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f3006c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3007d;
    public final /* synthetic */ ViewPropertyAnimator e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0158h f3008f;

    public C0154d(C0158h c0158h, V v2, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.f3008f = c0158h;
        this.f3004a = v2;
        this.f3005b = i;
        this.f3006c = view;
        this.f3007d = i2;
        this.e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.f3005b;
        View view = this.f3006c;
        if (i != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.f3007d != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.e.setListener(null);
        C0158h c0158h = this.f3008f;
        V v2 = this.f3004a;
        c0158h.c(v2);
        c0158h.f3043p.remove(v2);
        c0158h.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f3008f.getClass();
    }
}
