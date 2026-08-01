package g0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: g0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0121g extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c0 f2370a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2371b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f2372c;
    public final /* synthetic */ int d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f2373e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0125k f2374f;

    public C0121g(C0125k c0125k, c0 c0Var, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.f2374f = c0125k;
        this.f2370a = c0Var;
        this.f2371b = i;
        this.f2372c = view;
        this.d = i2;
        this.f2373e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.f2371b;
        View view = this.f2372c;
        if (i != 0) {
            view.setTranslationX(RecyclerView.f1530C0);
        }
        if (this.d != 0) {
            view.setTranslationY(RecyclerView.f1530C0);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f2373e.setListener(null);
        C0125k c0125k = this.f2374f;
        c0 c0Var = this.f2370a;
        c0125k.c(c0Var);
        c0125k.f2413p.remove(c0Var);
        c0125k.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f2374f.getClass();
    }
}
