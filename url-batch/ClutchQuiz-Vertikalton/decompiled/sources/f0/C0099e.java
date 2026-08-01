package f0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: f0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0099e extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ W f2241a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2242b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f2243c;
    public final /* synthetic */ int d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f2244e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0103i f2245f;

    public C0099e(C0103i c0103i, W w2, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.f2245f = c0103i;
        this.f2241a = w2;
        this.f2242b = i;
        this.f2243c = view;
        this.d = i2;
        this.f2244e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.f2242b;
        View view = this.f2243c;
        if (i != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.d != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f2244e.setListener(null);
        C0103i c0103i = this.f2245f;
        W w2 = this.f2241a;
        c0103i.c(w2);
        c0103i.f2279p.remove(w2);
        c0103i.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f2245f.getClass();
    }
}
