package p0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.FrameLayout;
import com.winpower.neonfit.R;

/* renamed from: p0.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0324E extends AnimatorListenerAdapter implements k {

    /* renamed from: a, reason: collision with root package name */
    public final FrameLayout f3797a;

    /* renamed from: b, reason: collision with root package name */
    public final View f3798b;

    /* renamed from: c, reason: collision with root package name */
    public final View f3799c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3800d = true;
    public final /* synthetic */ g e;

    public C0324E(g gVar, FrameLayout frameLayout, View view, View view2) {
        this.e = gVar;
        this.f3797a = frameLayout;
        this.f3798b = view;
        this.f3799c = view2;
    }

    @Override // p0.k
    public final void a() {
    }

    @Override // p0.k
    public final void b(m mVar) {
    }

    @Override // p0.k
    public final void c(m mVar) {
        mVar.x(this);
    }

    @Override // p0.k
    public final void e() {
    }

    @Override // p0.k
    public final void f(m mVar) {
        if (this.f3800d) {
            g();
        }
    }

    public final void g() {
        this.f3799c.setTag(R.id.save_overlay_view, null);
        this.f3797a.getOverlay().remove(this.f3798b);
        this.f3800d = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        g();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.f3797a.getOverlay().remove(this.f3798b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        View view = this.f3798b;
        if (view.getParent() == null) {
            this.f3797a.getOverlay().add(view);
        } else {
            this.e.c();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z2) {
        if (z2) {
            View view = this.f3799c;
            View view2 = this.f3798b;
            view.setTag(R.id.save_overlay_view, view2);
            this.f3797a.getOverlay().add(view2);
            this.f3800d = true;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z2) {
        if (z2) {
            return;
        }
        g();
    }
}
