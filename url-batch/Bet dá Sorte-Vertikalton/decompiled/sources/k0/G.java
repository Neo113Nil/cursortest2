package k0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class G extends AnimatorListenerAdapter implements k {

    /* renamed from: a, reason: collision with root package name */
    public final View f2720a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2721b;

    /* renamed from: c, reason: collision with root package name */
    public final ViewGroup f2722c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2723e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2724f = false;
    public final boolean d = true;

    public G(View view, int i) {
        this.f2720a = view;
        this.f2721b = i;
        this.f2722c = (ViewGroup) view.getParent();
        g(true);
    }

    @Override // k0.k
    public final void a() {
        g(false);
        if (this.f2724f) {
            return;
        }
        x.b(this.f2720a, this.f2721b);
    }

    @Override // k0.k
    public final void b(m mVar) {
        mVar.x(this);
    }

    @Override // k0.k
    public final void c() {
        g(true);
        if (this.f2724f) {
            return;
        }
        x.b(this.f2720a, 0);
    }

    @Override // k0.k
    public final void d(m mVar) {
    }

    @Override // k0.k
    public final void e(m mVar) {
    }

    public final void g(boolean z2) {
        ViewGroup viewGroup;
        if (!this.d || this.f2723e == z2 || (viewGroup = this.f2722c) == null) {
            return;
        }
        this.f2723e = z2;
        w.r(viewGroup, z2);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f2724f = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.f2724f) {
            x.b(this.f2720a, this.f2721b);
            ViewGroup viewGroup = this.f2722c;
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
            x.b(this.f2720a, 0);
            ViewGroup viewGroup = this.f2722c;
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
        if (!this.f2724f) {
            x.b(this.f2720a, this.f2721b);
            ViewGroup viewGroup = this.f2722c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        g(false);
    }
}
