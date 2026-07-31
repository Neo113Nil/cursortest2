package c5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class g0 extends AnimatorListenerAdapter implements m {

    /* renamed from: a, reason: collision with root package name */
    public final View f1668a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1669b;

    /* renamed from: c, reason: collision with root package name */
    public final ViewGroup f1670c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1672e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1673f = false;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f1671d = true;

    public g0(View view, int i) {
        this.f1668a = view;
        this.f1669b = i;
        this.f1670c = (ViewGroup) view.getParent();
        g(true);
    }

    @Override // c5.m
    public final void b() {
        g(false);
        if (this.f1673f) {
            return;
        }
        z.b(this.f1668a, this.f1669b);
    }

    @Override // c5.m
    public final void c() {
        g(true);
        if (this.f1673f) {
            return;
        }
        z.b(this.f1668a, 0);
    }

    @Override // c5.m
    public final void d(o oVar) {
        oVar.x(this);
    }

    public final void g(boolean z3) {
        ViewGroup viewGroup;
        if (!this.f1671d || this.f1672e == z3 || (viewGroup = this.f1670c) == null) {
            return;
        }
        this.f1672e = z3;
        s6.a.I(viewGroup, z3);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f1673f = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.f1673f) {
            z.b(this.f1668a, this.f1669b);
            ViewGroup viewGroup = this.f1670c;
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
            z.b(this.f1668a, 0);
            ViewGroup viewGroup = this.f1670c;
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
        if (!this.f1673f) {
            z.b(this.f1668a, this.f1669b);
            ViewGroup viewGroup = this.f1670c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        g(false);
    }

    @Override // c5.m
    public final void e(o oVar) {
    }

    @Override // c5.m
    public final void f(o oVar) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }
}
