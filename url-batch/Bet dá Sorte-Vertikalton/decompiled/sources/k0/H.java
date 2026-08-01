package k0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.FrameLayout;
import com.glasspulse.glasspulse.R;

/* loaded from: classes.dex */
public final class H extends AnimatorListenerAdapter implements k {

    /* renamed from: a, reason: collision with root package name */
    public final FrameLayout f2725a;

    /* renamed from: b, reason: collision with root package name */
    public final View f2726b;

    /* renamed from: c, reason: collision with root package name */
    public final View f2727c;
    public boolean d = true;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0179h f2728e;

    public H(C0179h c0179h, FrameLayout frameLayout, View view, View view2) {
        this.f2728e = c0179h;
        this.f2725a = frameLayout;
        this.f2726b = view;
        this.f2727c = view2;
    }

    @Override // k0.k
    public final void a() {
    }

    @Override // k0.k
    public final void b(m mVar) {
        mVar.x(this);
    }

    @Override // k0.k
    public final void c() {
    }

    @Override // k0.k
    public final void d(m mVar) {
    }

    @Override // k0.k
    public final void e(m mVar) {
        if (this.d) {
            g();
        }
    }

    public final void g() {
        this.f2727c.setTag(R.id.save_overlay_view, null);
        this.f2725a.getOverlay().remove(this.f2726b);
        this.d = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        g();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.f2725a.getOverlay().remove(this.f2726b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        View view = this.f2726b;
        if (view.getParent() == null) {
            this.f2725a.getOverlay().add(view);
        } else {
            this.f2728e.c();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z2) {
        if (z2) {
            View view = this.f2727c;
            View view2 = this.f2726b;
            view.setTag(R.id.save_overlay_view, view2);
            this.f2725a.getOverlay().add(view2);
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
