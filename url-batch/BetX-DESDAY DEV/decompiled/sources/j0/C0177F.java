package j0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.FrameLayout;
import com.luckyarcade.spinthrow.R;

/* renamed from: j0.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0177F extends AnimatorListenerAdapter implements k {

    /* renamed from: a, reason: collision with root package name */
    public final FrameLayout f2884a;

    /* renamed from: b, reason: collision with root package name */
    public final View f2885b;

    /* renamed from: c, reason: collision with root package name */
    public final View f2886c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2887d = true;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h f2888e;

    public C0177F(h hVar, FrameLayout frameLayout, View view, View view2) {
        this.f2888e = hVar;
        this.f2884a = frameLayout;
        this.f2885b = view;
        this.f2886c = view2;
    }

    @Override // j0.k
    public final void a(m mVar) {
        if (this.f2887d) {
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
        this.f2886c.setTag(R.id.save_overlay_view, null);
        this.f2884a.getOverlay().remove(this.f2885b);
        this.f2887d = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        g();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.f2884a.getOverlay().remove(this.f2885b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        View view = this.f2885b;
        if (view.getParent() == null) {
            this.f2884a.getOverlay().add(view);
        } else {
            this.f2888e.c();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z2) {
        if (z2) {
            View view = this.f2886c;
            View view2 = this.f2885b;
            view.setTag(R.id.save_overlay_view, view2);
            this.f2884a.getOverlay().add(view2);
            this.f2887d = true;
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
