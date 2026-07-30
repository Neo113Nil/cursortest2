package t0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: t0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5042e extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40684a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C5043f f40685b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f40686c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ View f40687d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C5045h f40688e;

    public /* synthetic */ C5042e(C5045h c5045h, C5043f c5043f, ViewPropertyAnimator viewPropertyAnimator, View view, int i) {
        this.f40684a = i;
        this.f40688e = c5045h;
        this.f40685b = c5043f;
        this.f40686c = viewPropertyAnimator;
        this.f40687d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40684a) {
            case 0:
                this.f40686c.setListener(null);
                View view = this.f40687d;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                C5043f c5043f = this.f40685b;
                AbstractC5032P abstractC5032P = c5043f.f40689a;
                C5045h c5045h = this.f40688e;
                c5045h.c(abstractC5032P);
                c5045h.f40711r.remove(c5043f.f40689a);
                c5045h.i();
                break;
            default:
                this.f40686c.setListener(null);
                View view2 = this.f40687d;
                view2.setAlpha(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                C5043f c5043f2 = this.f40685b;
                AbstractC5032P abstractC5032P2 = c5043f2.f40690b;
                C5045h c5045h2 = this.f40688e;
                c5045h2.c(abstractC5032P2);
                c5045h2.f40711r.remove(c5043f2.f40690b);
                c5045h2.i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f40684a) {
            case 0:
                AbstractC5032P abstractC5032P = this.f40685b.f40689a;
                this.f40688e.getClass();
                break;
            default:
                AbstractC5032P abstractC5032P2 = this.f40685b.f40690b;
                this.f40688e.getClass();
                break;
        }
    }
}
