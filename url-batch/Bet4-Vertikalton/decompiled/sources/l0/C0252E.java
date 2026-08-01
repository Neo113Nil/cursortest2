package l0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import m.C0260a;

/* renamed from: l0.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0252E extends AnimatorListenerAdapter implements k {

    /* renamed from: a, reason: collision with root package name */
    public final View f3034a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3035b;

    /* renamed from: c, reason: collision with root package name */
    public final ViewGroup f3036c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3037e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3038f = false;
    public final boolean d = true;

    public C0252E(View view, int i) {
        this.f3034a = view;
        this.f3035b = i;
        this.f3036c = (ViewGroup) view.getParent();
        g(true);
    }

    @Override // l0.k
    public final void a() {
        g(false);
        if (this.f3038f) {
            return;
        }
        w.b(this.f3034a, this.f3035b);
    }

    @Override // l0.k
    public final void c(m mVar) {
        mVar.x(this);
    }

    @Override // l0.k
    public final void d(m mVar) {
    }

    @Override // l0.k
    public final void e() {
        g(true);
        if (this.f3038f) {
            return;
        }
        w.b(this.f3034a, 0);
    }

    @Override // l0.k
    public final void f(m mVar) {
    }

    public final void g(boolean z2) {
        ViewGroup viewGroup;
        if (!this.d || this.f3037e == z2 || (viewGroup = this.f3036c) == null) {
            return;
        }
        this.f3037e = z2;
        C0260a.s(viewGroup, z2);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f3038f = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.f3038f) {
            w.b(this.f3034a, this.f3035b);
            ViewGroup viewGroup = this.f3036c;
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
            w.b(this.f3034a, 0);
            ViewGroup viewGroup = this.f3036c;
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
        if (!this.f3038f) {
            w.b(this.f3034a, this.f3035b);
            ViewGroup viewGroup = this.f3036c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        g(false);
    }
}
