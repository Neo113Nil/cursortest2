package p0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.FrameLayout;
import com.fortunequest.neontrack.R;

/* loaded from: classes.dex */
public final class E extends AnimatorListenerAdapter implements k {

    /* renamed from: a, reason: collision with root package name */
    public final FrameLayout f3632a;

    /* renamed from: b, reason: collision with root package name */
    public final View f3633b;

    /* renamed from: c, reason: collision with root package name */
    public final View f3634c;
    public boolean d = true;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h f3635e;

    public E(h hVar, FrameLayout frameLayout, View view, View view2) {
        this.f3635e = hVar;
        this.f3632a = frameLayout;
        this.f3633b = view;
        this.f3634c = view2;
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
        if (this.d) {
            g();
        }
    }

    public final void g() {
        this.f3634c.setTag(R.id.save_overlay_view, null);
        this.f3632a.getOverlay().remove(this.f3633b);
        this.d = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        g();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.f3632a.getOverlay().remove(this.f3633b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        View view = this.f3633b;
        if (view.getParent() == null) {
            this.f3632a.getOverlay().add(view);
        } else {
            this.f3635e.c();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z2) {
        if (z2) {
            View view = this.f3634c;
            View view2 = this.f3633b;
            view.setTag(R.id.save_overlay_view, view2);
            this.f3632a.getOverlay().add(view2);
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
