package m0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import h0.d0;

/* renamed from: m0.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0255C extends AnimatorListenerAdapter implements j {

    /* renamed from: a, reason: collision with root package name */
    public final View f3228a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3229b;

    /* renamed from: c, reason: collision with root package name */
    public final ViewGroup f3230c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3231e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3232f = false;
    public final boolean d = true;

    public C0255C(View view, int i) {
        this.f3228a = view;
        this.f3229b = i;
        this.f3230c = (ViewGroup) view.getParent();
        g(true);
    }

    @Override // m0.j
    public final void a() {
        g(false);
        if (this.f3232f) {
            return;
        }
        v.b(this.f3228a, this.f3229b);
    }

    @Override // m0.j
    public final void c(l lVar) {
        lVar.x(this);
    }

    @Override // m0.j
    public final void d() {
        g(true);
        if (this.f3232f) {
            return;
        }
        v.b(this.f3228a, 0);
    }

    @Override // m0.j
    public final void e(l lVar) {
    }

    @Override // m0.j
    public final void f(l lVar) {
    }

    public final void g(boolean z2) {
        ViewGroup viewGroup;
        if (!this.d || this.f3231e == z2 || (viewGroup = this.f3230c) == null) {
            return;
        }
        this.f3231e = z2;
        d0.q(viewGroup, z2);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f3232f = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.f3232f) {
            v.b(this.f3228a, this.f3229b);
            ViewGroup viewGroup = this.f3230c;
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
            v.b(this.f3228a, 0);
            ViewGroup viewGroup = this.f3230c;
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
        if (!this.f3232f) {
            v.b(this.f3228a, this.f3229b);
            ViewGroup viewGroup = this.f3230c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        g(false);
    }
}
