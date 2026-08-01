package n0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class E extends AnimatorListenerAdapter implements k {

    /* renamed from: a, reason: collision with root package name */
    public final View f3117a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3118b;

    /* renamed from: c, reason: collision with root package name */
    public final ViewGroup f3119c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3120e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3121f = false;
    public final boolean d = true;

    public E(View view, int i) {
        this.f3117a = view;
        this.f3118b = i;
        this.f3119c = (ViewGroup) view.getParent();
        g(true);
    }

    @Override // n0.k
    public final void a() {
        g(false);
        if (this.f3121f) {
            return;
        }
        w.b(this.f3117a, this.f3118b);
    }

    @Override // n0.k
    public final void b(m mVar) {
        mVar.x(this);
    }

    @Override // n0.k
    public final void c() {
        g(true);
        if (this.f3121f) {
            return;
        }
        w.b(this.f3117a, 0);
    }

    @Override // n0.k
    public final void d(m mVar) {
    }

    @Override // n0.k
    public final void f(m mVar) {
    }

    public final void g(boolean z2) {
        ViewGroup viewGroup;
        if (!this.d || this.f3120e == z2 || (viewGroup = this.f3119c) == null) {
            return;
        }
        this.f3120e = z2;
        h0.g.p(viewGroup, z2);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f3121f = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.f3121f) {
            w.b(this.f3117a, this.f3118b);
            ViewGroup viewGroup = this.f3119c;
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
            w.b(this.f3117a, 0);
            ViewGroup viewGroup = this.f3119c;
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
        if (!this.f3121f) {
            w.b(this.f3117a, this.f3118b);
            ViewGroup viewGroup = this.f3119c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        g(false);
    }
}
