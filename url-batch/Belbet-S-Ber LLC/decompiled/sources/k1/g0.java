package k1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.gdmhkmf.belbet.R;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class g0 extends AnimatorListenerAdapter implements l {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f2326a;

    /* renamed from: b, reason: collision with root package name */
    public final View f2327b;

    /* renamed from: c, reason: collision with root package name */
    public final View f2328c;
    public boolean d = true;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h f2329e;

    public g0(h hVar, ViewGroup viewGroup, View view, View view2) {
        this.f2329e = hVar;
        this.f2326a = viewGroup;
        this.f2327b = view;
        this.f2328c = view2;
    }

    @Override // k1.l
    public final void a(n nVar) {
        if (this.d) {
            g();
        }
    }

    @Override // k1.l
    public final void d(n nVar) {
        nVar.x(this);
    }

    public final void g() {
        this.f2328c.setTag(R.id.save_overlay_view, null);
        this.f2326a.getOverlay().remove(this.f2327b);
        this.d = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        g();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.f2326a.getOverlay().remove(this.f2327b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        View view = this.f2327b;
        if (view.getParent() == null) {
            this.f2326a.getOverlay().add(view);
        } else {
            this.f2329e.c();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z4) {
        if (z4) {
            View view = this.f2328c;
            View view2 = this.f2327b;
            view.setTag(R.id.save_overlay_view, view2);
            this.f2326a.getOverlay().add(view2);
            this.d = true;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z4) {
        if (z4) {
            return;
        }
        g();
    }

    @Override // k1.l
    public final void f(n nVar) {
    }

    @Override // k1.l
    public final void c() {
    }

    @Override // k1.l
    public final void e() {
    }
}
