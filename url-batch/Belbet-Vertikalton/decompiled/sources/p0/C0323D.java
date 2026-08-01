package p0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: p0.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0323D extends AnimatorListenerAdapter implements k {

    /* renamed from: a, reason: collision with root package name */
    public final View f3792a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3793b;

    /* renamed from: c, reason: collision with root package name */
    public final ViewGroup f3794c;
    public boolean e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3796f = false;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f3795d = true;

    public C0323D(View view, int i) {
        this.f3792a = view;
        this.f3793b = i;
        this.f3794c = (ViewGroup) view.getParent();
        g(true);
    }

    @Override // p0.k
    public final void a() {
        g(false);
        if (this.f3796f) {
            return;
        }
        w.b(this.f3792a, this.f3793b);
    }

    @Override // p0.k
    public final void b(m mVar) {
    }

    @Override // p0.k
    public final void c(m mVar) {
        mVar.x(this);
    }

    @Override // p0.k
    public final void e() {
        g(true);
        if (this.f3796f) {
            return;
        }
        w.b(this.f3792a, 0);
    }

    @Override // p0.k
    public final void f(m mVar) {
    }

    public final void g(boolean z2) {
        ViewGroup viewGroup;
        if (!this.f3795d || this.e == z2 || (viewGroup = this.f3794c) == null) {
            return;
        }
        this.e = z2;
        H1.d.h0(viewGroup, z2);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f3796f = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.f3796f) {
            w.b(this.f3792a, this.f3793b);
            ViewGroup viewGroup = this.f3794c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        g(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z2) {
        if (z2) {
            w.b(this.f3792a, 0);
            ViewGroup viewGroup = this.f3794c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z2) {
        if (z2) {
            return;
        }
        if (!this.f3796f) {
            w.b(this.f3792a, this.f3793b);
            ViewGroup viewGroup = this.f3794c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        g(false);
    }
}
