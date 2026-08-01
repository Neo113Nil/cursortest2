package g0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: g0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0122f extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a0 f2406a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2407b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f2408c;
    public final /* synthetic */ int d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f2409e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0126j f2410f;

    public C0122f(C0126j c0126j, a0 a0Var, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.f2410f = c0126j;
        this.f2406a = a0Var;
        this.f2407b = i;
        this.f2408c = view;
        this.d = i2;
        this.f2409e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.f2407b;
        View view = this.f2408c;
        if (i != 0) {
            view.setTranslationX(RecyclerView.f1559A0);
        }
        if (this.d != 0) {
            view.setTranslationY(RecyclerView.f1559A0);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f2409e.setListener(null);
        C0126j c0126j = this.f2410f;
        a0 a0Var = this.f2406a;
        c0126j.c(a0Var);
        c0126j.f2448p.remove(a0Var);
        c0126j.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f2410f.getClass();
    }
}
