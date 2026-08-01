package h0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: h0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0124f extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a0 f2493a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2494b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f2495c;
    public final /* synthetic */ int d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f2496e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0128j f2497f;

    public C0124f(C0128j c0128j, a0 a0Var, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.f2497f = c0128j;
        this.f2493a = a0Var;
        this.f2494b = i;
        this.f2495c = view;
        this.d = i2;
        this.f2496e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.f2494b;
        View view = this.f2495c;
        if (i != 0) {
            view.setTranslationX(RecyclerView.A0);
        }
        if (this.d != 0) {
            view.setTranslationY(RecyclerView.A0);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f2496e.setListener(null);
        C0128j c0128j = this.f2497f;
        a0 a0Var = this.f2493a;
        c0128j.c(a0Var);
        c0128j.f2538p.remove(a0Var);
        c0128j.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f2497f.getClass();
    }
}
