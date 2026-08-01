package k0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: k0.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0176E extends AnimatorListenerAdapter implements InterfaceC0189k {

    /* renamed from: a, reason: collision with root package name */
    public final View f2740a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2741b;

    /* renamed from: c, reason: collision with root package name */
    public final ViewGroup f2742c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2743e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2744f = false;
    public final boolean d = true;

    public C0176E(View view, int i) {
        this.f2740a = view;
        this.f2741b = i;
        this.f2742c = (ViewGroup) view.getParent();
        g(true);
    }

    @Override // k0.InterfaceC0189k
    public final void a() {
        g(false);
        if (this.f2744f) {
            return;
        }
        AbstractC0201w.b(this.f2740a, this.f2741b);
    }

    @Override // k0.InterfaceC0189k
    public final void b(AbstractC0191m abstractC0191m) {
        abstractC0191m.x(this);
    }

    @Override // k0.InterfaceC0189k
    public final void c() {
        g(true);
        if (this.f2744f) {
            return;
        }
        AbstractC0201w.b(this.f2740a, 0);
    }

    @Override // k0.InterfaceC0189k
    public final void d(AbstractC0191m abstractC0191m) {
    }

    @Override // k0.InterfaceC0189k
    public final void e(AbstractC0191m abstractC0191m) {
    }

    public final void g(boolean z2) {
        ViewGroup viewGroup;
        if (!this.d || this.f2743e == z2 || (viewGroup = this.f2742c) == null) {
            return;
        }
        this.f2743e = z2;
        i1.p.j(viewGroup, z2);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f2744f = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.f2744f) {
            AbstractC0201w.b(this.f2740a, this.f2741b);
            ViewGroup viewGroup = this.f2742c;
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
            AbstractC0201w.b(this.f2740a, 0);
            ViewGroup viewGroup = this.f2742c;
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
        if (!this.f2744f) {
            AbstractC0201w.b(this.f2740a, this.f2741b);
            ViewGroup viewGroup = this.f2742c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        g(false);
    }
}
