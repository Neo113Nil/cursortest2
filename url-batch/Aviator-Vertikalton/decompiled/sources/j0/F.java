package j0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.FrameLayout;
import com.fortuneink.neonpad.R;

/* loaded from: classes.dex */
public final class F extends AnimatorListenerAdapter implements k {

    /* renamed from: a, reason: collision with root package name */
    public final FrameLayout f2880a;

    /* renamed from: b, reason: collision with root package name */
    public final View f2881b;

    /* renamed from: c, reason: collision with root package name */
    public final View f2882c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2883d = true;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h f2884e;

    public F(h hVar, FrameLayout frameLayout, View view, View view2) {
        this.f2884e = hVar;
        this.f2880a = frameLayout;
        this.f2881b = view;
        this.f2882c = view2;
    }

    @Override // j0.k
    public final void a(m mVar) {
        if (this.f2883d) {
            g();
        }
    }

    @Override // j0.k
    public final void b() {
    }

    @Override // j0.k
    public final void c(m mVar) {
    }

    @Override // j0.k
    public final void d(m mVar) {
        mVar.x(this);
    }

    @Override // j0.k
    public final void e() {
    }

    public final void g() {
        this.f2882c.setTag(R.id.save_overlay_view, null);
        this.f2880a.getOverlay().remove(this.f2881b);
        this.f2883d = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        g();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.f2880a.getOverlay().remove(this.f2881b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        View view = this.f2881b;
        if (view.getParent() == null) {
            this.f2880a.getOverlay().add(view);
        } else {
            this.f2884e.c();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z2) {
        if (z2) {
            View view = this.f2882c;
            View view2 = this.f2881b;
            view.setTag(R.id.save_overlay_view, view2);
            this.f2880a.getOverlay().add(view2);
            this.f2883d = true;
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
