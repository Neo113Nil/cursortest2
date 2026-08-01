package f1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class f0 extends AnimatorListenerAdapter implements m {

    /* renamed from: a, reason: collision with root package name */
    public final View f1668a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1669b;
    public final ViewGroup c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1671e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1672f = false;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f1670d = true;

    public f0(View view, int i4) {
        this.f1668a = view;
        this.f1669b = i4;
        this.c = (ViewGroup) view.getParent();
        g(true);
    }

    @Override // f1.m
    public final void b() {
        g(false);
        if (this.f1672f) {
            return;
        }
        y.b(this.f1668a, this.f1669b);
    }

    @Override // f1.m
    public final void c() {
        g(true);
        if (this.f1672f) {
            return;
        }
        y.b(this.f1668a, 0);
    }

    @Override // f1.m
    public final void e(o oVar) {
        oVar.x(this);
    }

    public final void g(boolean z3) {
        ViewGroup viewGroup;
        if (!this.f1670d || this.f1671e == z3 || (viewGroup = this.c) == null) {
            return;
        }
        this.f1671e = z3;
        k3.d.g0(viewGroup, z3);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f1672f = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.f1672f) {
            y.b(this.f1668a, this.f1669b);
            ViewGroup viewGroup = this.c;
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
            y.b(this.f1668a, 0);
            ViewGroup viewGroup = this.c;
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
        if (!this.f1672f) {
            y.b(this.f1668a, this.f1669b);
            ViewGroup viewGroup = this.c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        g(false);
    }

    @Override // f1.m
    public final void a(o oVar) {
    }

    @Override // f1.m
    public final void d(o oVar) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }
}
