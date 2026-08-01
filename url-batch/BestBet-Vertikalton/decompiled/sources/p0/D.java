package p0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import c1.AbstractC0091d;

/* loaded from: classes.dex */
public final class D extends AnimatorListenerAdapter implements k {

    /* renamed from: a, reason: collision with root package name */
    public final View f3627a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3628b;

    /* renamed from: c, reason: collision with root package name */
    public final ViewGroup f3629c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3630e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3631f = false;
    public final boolean d = true;

    public D(View view, int i) {
        this.f3627a = view;
        this.f3628b = i;
        this.f3629c = (ViewGroup) view.getParent();
        g(true);
    }

    @Override // p0.k
    public final void a() {
        g(false);
        if (this.f3631f) {
            return;
        }
        w.b(this.f3627a, this.f3628b);
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
        if (this.f3631f) {
            return;
        }
        w.b(this.f3627a, 0);
    }

    @Override // p0.k
    public final void f(m mVar) {
    }

    public final void g(boolean z2) {
        ViewGroup viewGroup;
        if (!this.d || this.f3630e == z2 || (viewGroup = this.f3629c) == null) {
            return;
        }
        this.f3630e = z2;
        AbstractC0091d.v(viewGroup, z2);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f3631f = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.f3631f) {
            w.b(this.f3627a, this.f3628b);
            ViewGroup viewGroup = this.f3629c;
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
            w.b(this.f3627a, 0);
            ViewGroup viewGroup = this.f3629c;
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
        if (!this.f3631f) {
            w.b(this.f3627a, this.f3628b);
            ViewGroup viewGroup = this.f3629c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        g(false);
    }
}
