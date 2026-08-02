package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.android.apps.authenticator2.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aov extends AnimatorListenerAdapter implements apb {
    private final View a;
    private boolean b = false;

    public aov(View view) {
        this.a = view;
    }

    @Override // defpackage.apb
    public final void c() {
        View view = this.a;
        view.setTag(R.id.transition_pause_alpha, Float.valueOf(view.getVisibility() == 0 ? apq.a(view) : 0.0f));
    }

    @Override // defpackage.apb
    public final void d() {
        this.a.setTag(R.id.transition_pause_alpha, null);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        apq.c(this.a, 1.0f);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (this.b) {
            this.a.setLayerType(0, null);
        }
        if (z) {
            return;
        }
        apq.c(this.a, 1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.a;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.b = true;
            view.setLayerType(2, null);
        }
    }

    @Override // defpackage.apb
    public final void f() {
    }

    @Override // defpackage.apb
    public final void g() {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // defpackage.apb
    public final void a(ape apeVar) {
    }

    @Override // defpackage.apb
    public final void b(ape apeVar) {
    }

    @Override // defpackage.apb
    public final /* synthetic */ void e(ape apeVar) {
    }
}
