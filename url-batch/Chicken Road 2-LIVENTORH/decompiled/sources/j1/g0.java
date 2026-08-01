package j1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.oriondriftchasers.arordrft.R;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class g0 extends AnimatorListenerAdapter implements m {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f1914a;

    /* renamed from: b, reason: collision with root package name */
    public final View f1915b;

    /* renamed from: c, reason: collision with root package name */
    public final View f1916c;
    public boolean d = true;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h f1917e;

    public g0(h hVar, ViewGroup viewGroup, View view, View view2) {
        this.f1917e = hVar;
        this.f1914a = viewGroup;
        this.f1915b = view;
        this.f1916c = view2;
    }

    @Override // j1.m
    public final void a(o oVar) {
        if (this.d) {
            g();
        }
    }

    @Override // j1.m
    public final void c(o oVar) {
        oVar.y(this);
    }

    public final void g() {
        this.f1916c.setTag(R.id.save_overlay_view, null);
        this.f1914a.getOverlay().remove(this.f1915b);
        this.d = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        g();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.f1914a.getOverlay().remove(this.f1915b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        View view = this.f1915b;
        if (view.getParent() == null) {
            this.f1914a.getOverlay().add(view);
        } else {
            this.f1917e.c();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z3) {
        if (z3) {
            View view = this.f1916c;
            View view2 = this.f1915b;
            view.setTag(R.id.save_overlay_view, view2);
            this.f1914a.getOverlay().add(view2);
            this.d = true;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z3) {
        if (z3) {
            return;
        }
        g();
    }

    @Override // j1.m
    public final void b(o oVar) {
    }

    @Override // j1.m
    public final void d() {
    }

    @Override // j1.m
    public final void e() {
    }
}
