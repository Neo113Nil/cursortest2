package k1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class f0 extends AnimatorListenerAdapter implements l {

    /* renamed from: a, reason: collision with root package name */
    public final View f2319a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2320b;

    /* renamed from: c, reason: collision with root package name */
    public final ViewGroup f2321c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2322e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2323f = false;
    public final boolean d = true;

    public f0(View view, int i) {
        this.f2319a = view;
        this.f2320b = i;
        this.f2321c = (ViewGroup) view.getParent();
        g(true);
    }

    @Override // k1.l
    public final void c() {
        g(false);
        if (this.f2323f) {
            return;
        }
        x.b(this.f2319a, this.f2320b);
    }

    @Override // k1.l
    public final void d(n nVar) {
        nVar.x(this);
    }

    @Override // k1.l
    public final void e() {
        g(true);
        if (this.f2323f) {
            return;
        }
        x.b(this.f2319a, 0);
    }

    public final void g(boolean z4) {
        ViewGroup viewGroup;
        if (!this.d || this.f2322e == z4 || (viewGroup = this.f2321c) == null) {
            return;
        }
        this.f2322e = z4;
        b4.l.h0(viewGroup, z4);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f2323f = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.f2323f) {
            x.b(this.f2319a, this.f2320b);
            ViewGroup viewGroup = this.f2321c;
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
    public final void onAnimationStart(Animator animator, boolean z4) {
        if (z4) {
            x.b(this.f2319a, 0);
            ViewGroup viewGroup = this.f2321c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z4) {
        if (z4) {
            return;
        }
        if (!this.f2323f) {
            x.b(this.f2319a, this.f2320b);
            ViewGroup viewGroup = this.f2321c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        g(false);
    }

    @Override // k1.l
    public final void a(n nVar) {
    }

    @Override // k1.l
    public final void f(n nVar) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }
}
