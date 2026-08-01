package f0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: f0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0087d extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2041a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ X f2042b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f2043c;
    public final /* synthetic */ ViewPropertyAnimator d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0092i f2044e;

    public C0087d(C0092i c0092i, X x2, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f2044e = c0092i;
        this.f2042b = x2;
        this.d = viewPropertyAnimator;
        this.f2043c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f2041a) {
            case 1:
                this.f2043c.setAlpha(1.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f2041a) {
            case 0:
                this.d.setListener(null);
                this.f2043c.setAlpha(1.0f);
                C0092i c0092i = this.f2044e;
                X x2 = this.f2042b;
                c0092i.c(x2);
                c0092i.f2094q.remove(x2);
                c0092i.i();
                break;
            default:
                this.d.setListener(null);
                C0092i c0092i2 = this.f2044e;
                X x3 = this.f2042b;
                c0092i2.c(x3);
                c0092i2.f2092o.remove(x3);
                c0092i2.i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f2041a) {
            case 0:
                this.f2044e.getClass();
                break;
            default:
                this.f2044e.getClass();
                break;
        }
    }

    public C0087d(C0092i c0092i, X x2, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f2044e = c0092i;
        this.f2042b = x2;
        this.f2043c = view;
        this.d = viewPropertyAnimator;
    }
}
