package l0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import k0.AbstractC0180a;

/* renamed from: l0.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0255E extends AnimatorListenerAdapter implements k {

    /* renamed from: a, reason: collision with root package name */
    public final View f3062a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3063b;

    /* renamed from: c, reason: collision with root package name */
    public final ViewGroup f3064c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3065e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3066f = false;
    public final boolean d = true;

    public C0255E(View view, int i) {
        this.f3062a = view;
        this.f3063b = i;
        this.f3064c = (ViewGroup) view.getParent();
        g(true);
    }

    @Override // l0.k
    public final void a() {
        g(false);
        if (this.f3066f) {
            return;
        }
        w.b(this.f3062a, this.f3063b);
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
        if (this.f3066f) {
            return;
        }
        w.b(this.f3062a, 0);
    }

    @Override // l0.k
    public final void f(m mVar) {
    }

    public final void g(boolean z2) {
        ViewGroup viewGroup;
        if (!this.d || this.f3065e == z2 || (viewGroup = this.f3064c) == null) {
            return;
        }
        this.f3065e = z2;
        AbstractC0180a.r(viewGroup, z2);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f3066f = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.f3066f) {
            w.b(this.f3062a, this.f3063b);
            ViewGroup viewGroup = this.f3064c;
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
            w.b(this.f3062a, 0);
            ViewGroup viewGroup = this.f3064c;
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
        if (!this.f3066f) {
            w.b(this.f3062a, this.f3063b);
            ViewGroup viewGroup = this.f3064c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        g(false);
    }
}
