package k0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class F extends AnimatorListenerAdapter implements k {

    /* renamed from: a, reason: collision with root package name */
    public final View f2674a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2675b;

    /* renamed from: c, reason: collision with root package name */
    public final ViewGroup f2676c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2677e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2678f = false;
    public final boolean d = true;

    public F(View view, int i) {
        this.f2674a = view;
        this.f2675b = i;
        this.f2676c = (ViewGroup) view.getParent();
        g(true);
    }

    @Override // k0.k
    public final void a() {
        g(false);
        if (this.f2678f) {
            return;
        }
        w.b(this.f2674a, this.f2675b);
    }

    @Override // k0.k
    public final void b(m mVar) {
        mVar.x(this);
    }

    @Override // k0.k
    public final void c() {
        g(true);
        if (this.f2678f) {
            return;
        }
        w.b(this.f2674a, 0);
    }

    @Override // k0.k
    public final void d(m mVar) {
    }

    @Override // k0.k
    public final void e(m mVar) {
    }

    public final void g(boolean z2) {
        ViewGroup viewGroup;
        if (!this.d || this.f2677e == z2 || (viewGroup = this.f2676c) == null) {
            return;
        }
        this.f2677e = z2;
        s1.l.h0(viewGroup, z2);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f2678f = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.f2678f) {
            w.b(this.f2674a, this.f2675b);
            ViewGroup viewGroup = this.f2676c;
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
            w.b(this.f2674a, 0);
            ViewGroup viewGroup = this.f2676c;
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
        if (!this.f2678f) {
            w.b(this.f2674a, this.f2675b);
            ViewGroup viewGroup = this.f2676c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        g(false);
    }
}
