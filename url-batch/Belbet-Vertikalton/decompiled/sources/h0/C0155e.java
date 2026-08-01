package h0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: h0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0155e extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3014a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0156f f3015b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f3016c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ View f3017d;
    public final /* synthetic */ C0158h e;

    public /* synthetic */ C0155e(C0158h c0158h, C0156f c0156f, ViewPropertyAnimator viewPropertyAnimator, View view, int i) {
        this.f3014a = i;
        this.e = c0158h;
        this.f3015b = c0156f;
        this.f3016c = viewPropertyAnimator;
        this.f3017d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f3014a) {
            case 0:
                this.f3016c.setListener(null);
                View view = this.f3017d;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                C0156f c0156f = this.f3015b;
                V v2 = c0156f.f3022a;
                C0158h c0158h = this.e;
                c0158h.c(v2);
                c0158h.f3045r.remove(c0156f.f3022a);
                c0158h.i();
                break;
            default:
                this.f3016c.setListener(null);
                View view2 = this.f3017d;
                view2.setAlpha(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                C0156f c0156f2 = this.f3015b;
                V v3 = c0156f2.f3023b;
                C0158h c0158h2 = this.e;
                c0158h2.c(v3);
                c0158h2.f3045r.remove(c0156f2.f3023b);
                c0158h2.i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f3014a) {
            case 0:
                V v2 = this.f3015b.f3022a;
                this.e.getClass();
                break;
            default:
                V v3 = this.f3015b.f3023b;
                this.e.getClass();
                break;
        }
    }
}
