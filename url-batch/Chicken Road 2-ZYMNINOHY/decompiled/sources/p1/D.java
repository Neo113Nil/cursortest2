package p1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class D extends AnimatorListenerAdapter implements p {

    /* renamed from: a, reason: collision with root package name */
    public final View f14733a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14734b;

    /* renamed from: c, reason: collision with root package name */
    public final ViewGroup f14735c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f14737e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f14738f = false;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f14736d = true;

    public D(View view, int i4) {
        this.f14733a = view;
        this.f14734b = i4;
        this.f14735c = (ViewGroup) view.getParent();
        f(true);
    }

    @Override // p1.p
    public final void a(q qVar) {
        if (!this.f14738f) {
            y.f14807a.x(this.f14733a, this.f14734b);
            ViewGroup viewGroup = this.f14735c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        f(false);
        qVar.w(this);
    }

    @Override // p1.p
    public final void b() {
        f(false);
    }

    @Override // p1.p
    public final void d() {
        f(true);
    }

    public final void f(boolean z) {
        ViewGroup viewGroup;
        if (!this.f14736d || this.f14737e == z || (viewGroup = this.f14735c) == null) {
            return;
        }
        this.f14737e = z;
        O3.l.v(viewGroup, z);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f14738f = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.f14738f) {
            y.f14807a.x(this.f14733a, this.f14734b);
            ViewGroup viewGroup = this.f14735c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        f(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        if (this.f14738f) {
            return;
        }
        y.f14807a.x(this.f14733a, this.f14734b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        if (this.f14738f) {
            return;
        }
        y.f14807a.x(this.f14733a, 0);
    }

    @Override // p1.p
    public final void c() {
    }

    @Override // p1.p
    public final void e(q qVar) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
