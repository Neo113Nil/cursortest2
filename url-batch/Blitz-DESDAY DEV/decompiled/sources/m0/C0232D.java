package m0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import m.C0227a;

/* renamed from: m0.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0232D extends AnimatorListenerAdapter implements k {

    /* renamed from: a, reason: collision with root package name */
    public final View f3121a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3122b;

    /* renamed from: c, reason: collision with root package name */
    public final ViewGroup f3123c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3124e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3125f = false;
    public final boolean d = true;

    public C0232D(View view, int i) {
        this.f3121a = view;
        this.f3122b = i;
        this.f3123c = (ViewGroup) view.getParent();
        g(true);
    }

    @Override // m0.k
    public final void a() {
        g(false);
        if (this.f3125f) {
            return;
        }
        w.b(this.f3121a, this.f3122b);
    }

    @Override // m0.k
    public final void c(m mVar) {
        mVar.x(this);
    }

    @Override // m0.k
    public final void d() {
        g(true);
        if (this.f3125f) {
            return;
        }
        w.b(this.f3121a, 0);
    }

    @Override // m0.k
    public final void e(m mVar) {
    }

    @Override // m0.k
    public final void f(m mVar) {
    }

    public final void g(boolean z2) {
        ViewGroup viewGroup;
        if (!this.d || this.f3124e == z2 || (viewGroup = this.f3123c) == null) {
            return;
        }
        this.f3124e = z2;
        C0227a.q(viewGroup, z2);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f3125f = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.f3125f) {
            w.b(this.f3121a, this.f3122b);
            ViewGroup viewGroup = this.f3123c;
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
            w.b(this.f3121a, 0);
            ViewGroup viewGroup = this.f3123c;
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
        if (!this.f3125f) {
            w.b(this.f3121a, this.f3122b);
            ViewGroup viewGroup = this.f3123c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        g(false);
    }
}
