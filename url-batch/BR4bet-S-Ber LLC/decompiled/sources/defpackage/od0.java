package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.moontiko.really.admiralcasino.R;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class od0 extends AnimatorListenerAdapter implements x90 {
    public final ViewGroup a;
    public final View b;
    public final View c;
    public boolean d = true;
    public final /* synthetic */ fl e;

    public od0(fl flVar, ViewGroup viewGroup, View view, View view2) {
        this.e = flVar;
        this.a = viewGroup;
        this.b = view;
        this.c = view2;
    }

    @Override // defpackage.x90
    public final void d(z90 z90Var) {
        z90Var.x(this);
    }

    @Override // defpackage.x90
    public final void f(z90 z90Var) {
        if (this.d) {
            g();
        }
    }

    public final void g() {
        this.c.setTag(R.id.save_overlay_view, null);
        this.a.getOverlay().remove(this.b);
        this.d = false;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (z) {
            return;
        }
        g();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.a.getOverlay().remove(this.b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        View view = this.b;
        if (view.getParent() == null) {
            this.a.getOverlay().add(view);
        } else {
            this.e.c();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z) {
        if (z) {
            View view = this.c;
            View view2 = this.b;
            view.setTag(R.id.save_overlay_view, view2);
            this.a.getOverlay().add(view2);
            this.d = true;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        g();
    }

    @Override // defpackage.x90
    public final void a(z90 z90Var) {
    }

    @Override // defpackage.x90
    public final void b() {
    }

    @Override // defpackage.x90
    public final void c() {
    }
}
