package m0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.FrameLayout;
import com.winfour.winrandom.R;

/* renamed from: m0.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0256D extends AnimatorListenerAdapter implements j {

    /* renamed from: a, reason: collision with root package name */
    public final FrameLayout f3233a;

    /* renamed from: b, reason: collision with root package name */
    public final View f3234b;

    /* renamed from: c, reason: collision with root package name */
    public final View f3235c;
    public boolean d = true;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g f3236e;

    public C0256D(g gVar, FrameLayout frameLayout, View view, View view2) {
        this.f3236e = gVar;
        this.f3233a = frameLayout;
        this.f3234b = view;
        this.f3235c = view2;
    }

    @Override // m0.j
    public final void a() {
    }

    @Override // m0.j
    public final void c(l lVar) {
        lVar.x(this);
    }

    @Override // m0.j
    public final void d() {
    }

    @Override // m0.j
    public final void e(l lVar) {
    }

    @Override // m0.j
    public final void f(l lVar) {
        if (this.d) {
            g();
        }
    }

    public final void g() {
        this.f3235c.setTag(R.id.save_overlay_view, null);
        this.f3233a.getOverlay().remove(this.f3234b);
        this.d = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        g();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.f3233a.getOverlay().remove(this.f3234b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        View view = this.f3234b;
        if (view.getParent() == null) {
            this.f3233a.getOverlay().add(view);
        } else {
            this.f3236e.c();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z2) {
        if (z2) {
            View view = this.f3235c;
            View view2 = this.f3234b;
            view.setTag(R.id.save_overlay_view, view2);
            this.f3233a.getOverlay().add(view2);
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
