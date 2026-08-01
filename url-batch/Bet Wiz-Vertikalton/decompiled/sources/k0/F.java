package k0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import j0.AbstractC0142a;

/* loaded from: classes.dex */
public final class F extends AnimatorListenerAdapter implements l {

    /* renamed from: a, reason: collision with root package name */
    public final View f2733a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2734b;

    /* renamed from: c, reason: collision with root package name */
    public final ViewGroup f2735c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2736e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2737f = false;
    public final boolean d = true;

    public F(View view, int i) {
        this.f2733a = view;
        this.f2734b = i;
        this.f2735c = (ViewGroup) view.getParent();
        g(true);
    }

    @Override // k0.l
    public final void a() {
        g(false);
        if (this.f2737f) {
            return;
        }
        x.b(this.f2733a, this.f2734b);
    }

    @Override // k0.l
    public final void b(n nVar) {
        nVar.x(this);
    }

    @Override // k0.l
    public final void c() {
        g(true);
        if (this.f2737f) {
            return;
        }
        x.b(this.f2733a, 0);
    }

    @Override // k0.l
    public final void d(n nVar) {
    }

    @Override // k0.l
    public final void e(n nVar) {
    }

    public final void g(boolean z2) {
        ViewGroup viewGroup;
        if (!this.d || this.f2736e == z2 || (viewGroup = this.f2735c) == null) {
            return;
        }
        this.f2736e = z2;
        AbstractC0142a.o(viewGroup, z2);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f2737f = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.f2737f) {
            x.b(this.f2733a, this.f2734b);
            ViewGroup viewGroup = this.f2735c;
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
            x.b(this.f2733a, 0);
            ViewGroup viewGroup = this.f2735c;
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
        if (!this.f2737f) {
            x.b(this.f2733a, this.f2734b);
            ViewGroup viewGroup = this.f2735c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        g(false);
    }
}
