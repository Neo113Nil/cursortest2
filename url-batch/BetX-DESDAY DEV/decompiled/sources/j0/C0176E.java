package j0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: j0.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0176E extends AnimatorListenerAdapter implements k {

    /* renamed from: a, reason: collision with root package name */
    public final View f2878a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2879b;

    /* renamed from: c, reason: collision with root package name */
    public final ViewGroup f2880c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2882e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2883f = false;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f2881d = true;

    public C0176E(View view, int i) {
        this.f2878a = view;
        this.f2879b = i;
        this.f2880c = (ViewGroup) view.getParent();
        g(true);
    }

    @Override // j0.k
    public final void a(m mVar) {
    }

    @Override // j0.k
    public final void b() {
        g(false);
        if (this.f2883f) {
            return;
        }
        w.b(this.f2878a, this.f2879b);
    }

    @Override // j0.k
    public final void c(m mVar) {
    }

    @Override // j0.k
    public final void d(m mVar) {
        mVar.x(this);
    }

    @Override // j0.k
    public final void e() {
        g(true);
        if (this.f2883f) {
            return;
        }
        w.b(this.f2878a, 0);
    }

    public final void g(boolean z2) {
        ViewGroup viewGroup;
        if (!this.f2881d || this.f2882e == z2 || (viewGroup = this.f2880c) == null) {
            return;
        }
        this.f2882e = z2;
        i1.m.o(viewGroup, z2);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f2883f = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.f2883f) {
            w.b(this.f2878a, this.f2879b);
            ViewGroup viewGroup = this.f2880c;
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
            w.b(this.f2878a, 0);
            ViewGroup viewGroup = this.f2880c;
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
        if (!this.f2883f) {
            w.b(this.f2878a, this.f2879b);
            ViewGroup viewGroup = this.f2880c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        g(false);
    }
}
