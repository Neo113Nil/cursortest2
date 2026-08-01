package k0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.FrameLayout;
import com.playgen.securelock.R;

/* loaded from: classes.dex */
public final class G extends AnimatorListenerAdapter implements l {

    /* renamed from: a, reason: collision with root package name */
    public final FrameLayout f2689a;

    /* renamed from: b, reason: collision with root package name */
    public final View f2690b;

    /* renamed from: c, reason: collision with root package name */
    public final View f2691c;
    public boolean d = true;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0187h f2692e;

    public G(C0187h c0187h, FrameLayout frameLayout, View view, View view2) {
        this.f2692e = c0187h;
        this.f2689a = frameLayout;
        this.f2690b = view;
        this.f2691c = view2;
    }

    @Override // k0.l
    public final void a() {
    }

    @Override // k0.l
    public final void b(n nVar) {
        nVar.x(this);
    }

    @Override // k0.l
    public final void c() {
    }

    @Override // k0.l
    public final void d(n nVar) {
    }

    @Override // k0.l
    public final void e(n nVar) {
        if (this.d) {
            g();
        }
    }

    public final void g() {
        this.f2691c.setTag(R.id.save_overlay_view, null);
        this.f2689a.getOverlay().remove(this.f2690b);
        this.d = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        g();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.f2689a.getOverlay().remove(this.f2690b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        View view = this.f2690b;
        if (view.getParent() == null) {
            this.f2689a.getOverlay().add(view);
        } else {
            this.f2692e.c();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z2) {
        if (z2) {
            View view = this.f2691c;
            View view2 = this.f2690b;
            view.setTag(R.id.save_overlay_view, view2);
            this.f2689a.getOverlay().add(view2);
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
