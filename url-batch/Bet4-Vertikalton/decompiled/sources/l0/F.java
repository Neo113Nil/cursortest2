package l0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.FrameLayout;
import com.playbag.tripgear.R;

/* loaded from: classes.dex */
public final class F extends AnimatorListenerAdapter implements k {

    /* renamed from: a, reason: collision with root package name */
    public final FrameLayout f3039a;

    /* renamed from: b, reason: collision with root package name */
    public final View f3040b;

    /* renamed from: c, reason: collision with root package name */
    public final View f3041c;
    public boolean d = true;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h f3042e;

    public F(h hVar, FrameLayout frameLayout, View view, View view2) {
        this.f3042e = hVar;
        this.f3039a = frameLayout;
        this.f3040b = view;
        this.f3041c = view2;
    }

    @Override // l0.k
    public final void a() {
    }

    @Override // l0.k
    public final void c(m mVar) {
        mVar.x(this);
    }

    @Override // l0.k
    public final void d(m mVar) {
    }

    @Override // l0.k
    public final void e() {
    }

    @Override // l0.k
    public final void f(m mVar) {
        if (this.d) {
            g();
        }
    }

    public final void g() {
        this.f3041c.setTag(R.id.save_overlay_view, null);
        this.f3039a.getOverlay().remove(this.f3040b);
        this.d = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        g();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.f3039a.getOverlay().remove(this.f3040b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        View view = this.f3040b;
        if (view.getParent() == null) {
            this.f3039a.getOverlay().add(view);
        } else {
            this.f3042e.c();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z2) {
        if (z2) {
            View view = this.f3041c;
            View view2 = this.f3040b;
            view.setTag(R.id.save_overlay_view, view2);
            this.f3039a.getOverlay().add(view2);
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
