package l0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.FrameLayout;
import com.winworm.neongrid.R;

/* loaded from: classes.dex */
public final class F extends AnimatorListenerAdapter implements k {

    /* renamed from: a, reason: collision with root package name */
    public final FrameLayout f3067a;

    /* renamed from: b, reason: collision with root package name */
    public final View f3068b;

    /* renamed from: c, reason: collision with root package name */
    public final View f3069c;
    public boolean d = true;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h f3070e;

    public F(h hVar, FrameLayout frameLayout, View view, View view2) {
        this.f3070e = hVar;
        this.f3067a = frameLayout;
        this.f3068b = view;
        this.f3069c = view2;
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
        this.f3069c.setTag(R.id.save_overlay_view, null);
        this.f3067a.getOverlay().remove(this.f3068b);
        this.d = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        g();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.f3067a.getOverlay().remove(this.f3068b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        View view = this.f3068b;
        if (view.getParent() == null) {
            this.f3067a.getOverlay().add(view);
        } else {
            this.f3070e.c();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z2) {
        if (z2) {
            View view = this.f3069c;
            View view2 = this.f3068b;
            view.setTag(R.id.save_overlay_view, view2);
            this.f3067a.getOverlay().add(view2);
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
