package D0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class F extends AnimatorListenerAdapter implements m {

    /* renamed from: a, reason: collision with root package name */
    public final View f579a;

    /* renamed from: b, reason: collision with root package name */
    public final int f580b;

    /* renamed from: c, reason: collision with root package name */
    public final ViewGroup f581c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f583e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f584f = false;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f582d = true;

    public F(int i, View view) {
        this.f579a = view;
        this.f580b = i;
        this.f581c = (ViewGroup) view.getParent();
        g(true);
    }

    @Override // D0.m
    public final void b() {
        g(false);
        if (this.f584f) {
            return;
        }
        y.b(this.f579a, this.f580b);
    }

    @Override // D0.m
    public final void d(o oVar) {
        oVar.C(this);
    }

    @Override // D0.m
    public final void e() {
        g(true);
        if (this.f584f) {
            return;
        }
        y.b(this.f579a, 0);
    }

    public final void g(boolean z8) {
        ViewGroup viewGroup;
        if (!this.f582d || this.f583e == z8 || (viewGroup = this.f581c) == null) {
            return;
        }
        this.f583e = z8;
        com.bumptech.glide.e.B(viewGroup, z8);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f584f = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.f584f) {
            y.b(this.f579a, this.f580b);
            ViewGroup viewGroup = this.f581c;
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
    public final void onAnimationStart(Animator animator, boolean z8) {
        if (z8) {
            y.b(this.f579a, 0);
            ViewGroup viewGroup = this.f581c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z8) {
        if (z8) {
            return;
        }
        if (!this.f584f) {
            y.b(this.f579a, this.f580b);
            ViewGroup viewGroup = this.f581c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        g(false);
    }

    @Override // D0.m
    public final void a(o oVar) {
    }

    @Override // D0.m
    public final void c(o oVar) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }
}
