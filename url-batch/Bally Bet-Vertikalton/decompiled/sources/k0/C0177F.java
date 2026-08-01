package k0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.FrameLayout;
import com.skydrop.fallring.R;

/* renamed from: k0.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0177F extends AnimatorListenerAdapter implements InterfaceC0189k {

    /* renamed from: a, reason: collision with root package name */
    public final FrameLayout f2745a;

    /* renamed from: b, reason: collision with root package name */
    public final View f2746b;

    /* renamed from: c, reason: collision with root package name */
    public final View f2747c;
    public boolean d = true;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0186h f2748e;

    public C0177F(C0186h c0186h, FrameLayout frameLayout, View view, View view2) {
        this.f2748e = c0186h;
        this.f2745a = frameLayout;
        this.f2746b = view;
        this.f2747c = view2;
    }

    @Override // k0.InterfaceC0189k
    public final void a() {
    }

    @Override // k0.InterfaceC0189k
    public final void b(AbstractC0191m abstractC0191m) {
        abstractC0191m.x(this);
    }

    @Override // k0.InterfaceC0189k
    public final void c() {
    }

    @Override // k0.InterfaceC0189k
    public final void d(AbstractC0191m abstractC0191m) {
    }

    @Override // k0.InterfaceC0189k
    public final void e(AbstractC0191m abstractC0191m) {
        if (this.d) {
            g();
        }
    }

    public final void g() {
        this.f2747c.setTag(R.id.save_overlay_view, null);
        this.f2745a.getOverlay().remove(this.f2746b);
        this.d = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        g();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.f2745a.getOverlay().remove(this.f2746b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        View view = this.f2746b;
        if (view.getParent() == null) {
            this.f2745a.getOverlay().add(view);
        } else {
            this.f2748e.c();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z2) {
        if (z2) {
            View view = this.f2747c;
            View view2 = this.f2746b;
            view.setTag(R.id.save_overlay_view, view2);
            this.f2745a.getOverlay().add(view2);
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
