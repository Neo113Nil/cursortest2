package n0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.FrameLayout;
import com.clutchquizarena.app.R;

/* loaded from: classes.dex */
public final class F extends AnimatorListenerAdapter implements k {

    /* renamed from: a, reason: collision with root package name */
    public final FrameLayout f3122a;

    /* renamed from: b, reason: collision with root package name */
    public final View f3123b;

    /* renamed from: c, reason: collision with root package name */
    public final View f3124c;
    public boolean d = true;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h f3125e;

    public F(h hVar, FrameLayout frameLayout, View view, View view2) {
        this.f3125e = hVar;
        this.f3122a = frameLayout;
        this.f3123b = view;
        this.f3124c = view2;
    }

    @Override // n0.k
    public final void a() {
    }

    @Override // n0.k
    public final void b(m mVar) {
        mVar.x(this);
    }

    @Override // n0.k
    public final void c() {
    }

    @Override // n0.k
    public final void d(m mVar) {
    }

    @Override // n0.k
    public final void f(m mVar) {
        if (this.d) {
            g();
        }
    }

    public final void g() {
        this.f3124c.setTag(R.id.save_overlay_view, null);
        this.f3122a.getOverlay().remove(this.f3123b);
        this.d = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        g();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.f3122a.getOverlay().remove(this.f3123b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        View view = this.f3123b;
        if (view.getParent() == null) {
            this.f3122a.getOverlay().add(view);
        } else {
            this.f3125e.c();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z2) {
        if (z2) {
            View view = this.f3124c;
            View view2 = this.f3123b;
            view.setTag(R.id.save_overlay_view, view2);
            this.f3122a.getOverlay().add(view2);
            this.d = true;
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
