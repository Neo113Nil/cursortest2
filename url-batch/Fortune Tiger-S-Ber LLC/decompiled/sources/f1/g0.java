package f1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.gglhk.bofio.fortunetiger.R;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class g0 extends AnimatorListenerAdapter implements m {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f1675a;

    /* renamed from: b, reason: collision with root package name */
    public final View f1676b;
    public final View c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1677d = true;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h f1678e;

    public g0(h hVar, ViewGroup viewGroup, View view, View view2) {
        this.f1678e = hVar;
        this.f1675a = viewGroup;
        this.f1676b = view;
        this.c = view2;
    }

    @Override // f1.m
    public final void a(o oVar) {
        if (this.f1677d) {
            g();
        }
    }

    @Override // f1.m
    public final void e(o oVar) {
        oVar.x(this);
    }

    public final void g() {
        this.c.setTag(R.id.save_overlay_view, null);
        this.f1675a.getOverlay().remove(this.f1676b);
        this.f1677d = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        g();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.f1675a.getOverlay().remove(this.f1676b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        View view = this.f1676b;
        if (view.getParent() == null) {
            this.f1675a.getOverlay().add(view);
        } else {
            this.f1678e.c();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z3) {
        if (z3) {
            View view = this.c;
            View view2 = this.f1676b;
            view.setTag(R.id.save_overlay_view, view2);
            this.f1675a.getOverlay().add(view2);
            this.f1677d = true;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z3) {
        if (z3) {
            return;
        }
        g();
    }

    @Override // f1.m
    public final void d(o oVar) {
    }

    @Override // f1.m
    public final void b() {
    }

    @Override // f1.m
    public final void c() {
    }
}
