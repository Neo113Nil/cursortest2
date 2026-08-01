package k0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.FrameLayout;
import com.shotwins.games.R;

/* renamed from: k0.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0176F extends AnimatorListenerAdapter implements InterfaceC0188k {

    /* renamed from: a, reason: collision with root package name */
    public final FrameLayout f2761a;

    /* renamed from: b, reason: collision with root package name */
    public final View f2762b;

    /* renamed from: c, reason: collision with root package name */
    public final View f2763c;
    public boolean d = true;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0185h f2764e;

    public C0176F(C0185h c0185h, FrameLayout frameLayout, View view, View view2) {
        this.f2764e = c0185h;
        this.f2761a = frameLayout;
        this.f2762b = view;
        this.f2763c = view2;
    }

    @Override // k0.InterfaceC0188k
    public final void a() {
    }

    @Override // k0.InterfaceC0188k
    public final void b(AbstractC0190m abstractC0190m) {
        abstractC0190m.x(this);
    }

    @Override // k0.InterfaceC0188k
    public final void c() {
    }

    @Override // k0.InterfaceC0188k
    public final void d(AbstractC0190m abstractC0190m) {
    }

    @Override // k0.InterfaceC0188k
    public final void e(AbstractC0190m abstractC0190m) {
        if (this.d) {
            g();
        }
    }

    public final void g() {
        this.f2763c.setTag(R.id.save_overlay_view, null);
        this.f2761a.getOverlay().remove(this.f2762b);
        this.d = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        g();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.f2761a.getOverlay().remove(this.f2762b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        View view = this.f2762b;
        if (view.getParent() == null) {
            this.f2761a.getOverlay().add(view);
        } else {
            this.f2764e.c();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z2) {
        if (z2) {
            View view = this.f2763c;
            View view2 = this.f2762b;
            view.setTag(R.id.save_overlay_view, view2);
            this.f2761a.getOverlay().add(view2);
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
