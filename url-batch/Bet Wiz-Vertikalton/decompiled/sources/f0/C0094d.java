package f0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: f0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0094d extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2178a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ X f2179b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f2180c;
    public final /* synthetic */ ViewPropertyAnimator d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0099i f2181e;

    public C0094d(C0099i c0099i, X x2, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f2181e = c0099i;
        this.f2179b = x2;
        this.d = viewPropertyAnimator;
        this.f2180c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f2178a) {
            case 1:
                this.f2180c.setAlpha(1.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f2178a) {
            case 0:
                this.d.setListener(null);
                this.f2180c.setAlpha(1.0f);
                C0099i c0099i = this.f2181e;
                X x2 = this.f2179b;
                c0099i.c(x2);
                c0099i.f2231q.remove(x2);
                c0099i.i();
                break;
            default:
                this.d.setListener(null);
                C0099i c0099i2 = this.f2181e;
                X x3 = this.f2179b;
                c0099i2.c(x3);
                c0099i2.f2229o.remove(x3);
                c0099i2.i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f2178a) {
            case 0:
                this.f2181e.getClass();
                break;
            default:
                this.f2181e.getClass();
                break;
        }
    }

    public C0094d(C0099i c0099i, X x2, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f2181e = c0099i;
        this.f2179b = x2;
        this.f2180c = view;
        this.d = viewPropertyAnimator;
    }
}
