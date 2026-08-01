package j1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class f0 extends AnimatorListenerAdapter implements m {

    /* renamed from: a, reason: collision with root package name */
    public final View f1907a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1908b;

    /* renamed from: c, reason: collision with root package name */
    public final ViewGroup f1909c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1910e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1911f = false;
    public final boolean d = true;

    public f0(View view, int i) {
        this.f1907a = view;
        this.f1908b = i;
        this.f1909c = (ViewGroup) view.getParent();
        g(true);
    }

    @Override // j1.m
    public final void c(o oVar) {
        oVar.y(this);
    }

    @Override // j1.m
    public final void d() {
        g(false);
        if (this.f1911f) {
            return;
        }
        y.b(this.f1907a, this.f1908b);
    }

    @Override // j1.m
    public final void e() {
        g(true);
        if (this.f1911f) {
            return;
        }
        y.b(this.f1907a, 0);
    }

    public final void g(boolean z3) {
        ViewGroup viewGroup;
        if (!this.d || this.f1910e == z3 || (viewGroup = this.f1909c) == null) {
            return;
        }
        this.f1910e = z3;
        h.a.p0(viewGroup, z3);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f1911f = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.f1911f) {
            y.b(this.f1907a, this.f1908b);
            ViewGroup viewGroup = this.f1909c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        g(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z3) {
        if (z3) {
            y.b(this.f1907a, 0);
            ViewGroup viewGroup = this.f1909c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z3) {
        if (z3) {
            return;
        }
        if (!this.f1911f) {
            y.b(this.f1907a, this.f1908b);
            ViewGroup viewGroup = this.f1909c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        g(false);
    }

    @Override // j1.m
    public final void a(o oVar) {
    }

    @Override // j1.m
    public final void b(o oVar) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }
}
