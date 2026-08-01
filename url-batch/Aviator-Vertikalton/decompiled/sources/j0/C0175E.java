package j0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: j0.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0175E extends AnimatorListenerAdapter implements k {

    /* renamed from: a, reason: collision with root package name */
    public final View f2874a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2875b;

    /* renamed from: c, reason: collision with root package name */
    public final ViewGroup f2876c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2878e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2879f = false;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f2877d = true;

    public C0175E(View view, int i) {
        this.f2874a = view;
        this.f2875b = i;
        this.f2876c = (ViewGroup) view.getParent();
        g(true);
    }

    @Override // j0.k
    public final void a(m mVar) {
    }

    @Override // j0.k
    public final void b() {
        g(false);
        if (this.f2879f) {
            return;
        }
        w.b(this.f2874a, this.f2875b);
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
        if (this.f2879f) {
            return;
        }
        w.b(this.f2874a, 0);
    }

    public final void g(boolean z2) {
        ViewGroup viewGroup;
        if (!this.f2877d || this.f2878e == z2 || (viewGroup = this.f2876c) == null) {
            return;
        }
        this.f2878e = z2;
        i1.m.o(viewGroup, z2);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f2879f = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.f2879f) {
            w.b(this.f2874a, this.f2875b);
            ViewGroup viewGroup = this.f2876c;
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
            w.b(this.f2874a, 0);
            ViewGroup viewGroup = this.f2876c;
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
        if (!this.f2879f) {
            w.b(this.f2874a, this.f2875b);
            ViewGroup viewGroup = this.f2876c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        g(false);
    }
}
