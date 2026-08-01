package k0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.FrameLayout;
import com.visualfortune.eyerest.R;

/* loaded from: classes.dex */
public final class G extends AnimatorListenerAdapter implements k {

    /* renamed from: a, reason: collision with root package name */
    public final FrameLayout f2679a;

    /* renamed from: b, reason: collision with root package name */
    public final View f2680b;

    /* renamed from: c, reason: collision with root package name */
    public final View f2681c;
    public boolean d = true;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0184h f2682e;

    public G(C0184h c0184h, FrameLayout frameLayout, View view, View view2) {
        this.f2682e = c0184h;
        this.f2679a = frameLayout;
        this.f2680b = view;
        this.f2681c = view2;
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
        this.f2681c.setTag(R.id.save_overlay_view, null);
        this.f2679a.getOverlay().remove(this.f2680b);
        this.d = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        g();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.f2679a.getOverlay().remove(this.f2680b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        View view = this.f2680b;
        if (view.getParent() == null) {
            this.f2679a.getOverlay().add(view);
        } else {
            this.f2682e.c();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z2) {
        if (z2) {
            View view = this.f2681c;
            View view2 = this.f2680b;
            view.setTag(R.id.save_overlay_view, view2);
            this.f2679a.getOverlay().add(view2);
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
