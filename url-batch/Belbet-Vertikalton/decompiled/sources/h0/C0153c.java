package h0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: h0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0153c extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2993a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ V f2994b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f2995c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f2996d;
    public final /* synthetic */ C0158h e;

    public C0153c(C0158h c0158h, V v2, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.e = c0158h;
        this.f2994b = v2;
        this.f2996d = viewPropertyAnimator;
        this.f2995c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f2993a) {
            case 1:
                this.f2995c.setAlpha(1.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f2993a) {
            case 0:
                this.f2996d.setListener(null);
                this.f2995c.setAlpha(1.0f);
                C0158h c0158h = this.e;
                V v2 = this.f2994b;
                c0158h.c(v2);
                c0158h.f3044q.remove(v2);
                c0158h.i();
                break;
            default:
                this.f2996d.setListener(null);
                C0158h c0158h2 = this.e;
                V v3 = this.f2994b;
                c0158h2.c(v3);
                c0158h2.f3042o.remove(v3);
                c0158h2.i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f2993a) {
            case 0:
                this.e.getClass();
                break;
            default:
                this.e.getClass();
                break;
        }
    }

    public C0153c(C0158h c0158h, V v2, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.e = c0158h;
        this.f2994b = v2;
        this.f2995c = view;
        this.f2996d = viewPropertyAnimator;
    }
}
