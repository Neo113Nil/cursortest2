package g0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: g0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0123g extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2412a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0124h f2413b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f2414c;
    public final /* synthetic */ View d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0126j f2415e;

    public /* synthetic */ C0123g(C0126j c0126j, C0124h c0124h, ViewPropertyAnimator viewPropertyAnimator, View view, int i) {
        this.f2412a = i;
        this.f2415e = c0126j;
        this.f2413b = c0124h;
        this.f2414c = viewPropertyAnimator;
        this.d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f2412a) {
            case 0:
                this.f2414c.setListener(null);
                View view = this.d;
                view.setAlpha(1.0f);
                view.setTranslationX(RecyclerView.f1559A0);
                view.setTranslationY(RecyclerView.f1559A0);
                C0124h c0124h = this.f2413b;
                a0 a0Var = c0124h.f2419a;
                C0126j c0126j = this.f2415e;
                c0126j.c(a0Var);
                c0126j.f2450r.remove(c0124h.f2419a);
                c0126j.i();
                break;
            default:
                this.f2414c.setListener(null);
                View view2 = this.d;
                view2.setAlpha(1.0f);
                view2.setTranslationX(RecyclerView.f1559A0);
                view2.setTranslationY(RecyclerView.f1559A0);
                C0124h c0124h2 = this.f2413b;
                a0 a0Var2 = c0124h2.f2420b;
                C0126j c0126j2 = this.f2415e;
                c0126j2.c(a0Var2);
                c0126j2.f2450r.remove(c0124h2.f2420b);
                c0126j2.i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f2412a) {
            case 0:
                a0 a0Var = this.f2413b.f2419a;
                this.f2415e.getClass();
                break;
            default:
                a0 a0Var2 = this.f2413b.f2420b;
                this.f2415e.getClass();
                break;
        }
    }
}
