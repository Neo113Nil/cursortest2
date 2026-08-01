package h0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: h0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0125g extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2504a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0126h f2505b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f2506c;
    public final /* synthetic */ View d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0128j f2507e;

    public /* synthetic */ C0125g(C0128j c0128j, C0126h c0126h, ViewPropertyAnimator viewPropertyAnimator, View view, int i) {
        this.f2504a = i;
        this.f2507e = c0128j;
        this.f2505b = c0126h;
        this.f2506c = viewPropertyAnimator;
        this.d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f2504a) {
            case 0:
                this.f2506c.setListener(null);
                View view = this.d;
                view.setAlpha(1.0f);
                view.setTranslationX(RecyclerView.A0);
                view.setTranslationY(RecyclerView.A0);
                C0126h c0126h = this.f2505b;
                a0 a0Var = c0126h.f2509a;
                C0128j c0128j = this.f2507e;
                c0128j.c(a0Var);
                c0128j.f2540r.remove(c0126h.f2509a);
                c0128j.i();
                break;
            default:
                this.f2506c.setListener(null);
                View view2 = this.d;
                view2.setAlpha(1.0f);
                view2.setTranslationX(RecyclerView.A0);
                view2.setTranslationY(RecyclerView.A0);
                C0126h c0126h2 = this.f2505b;
                a0 a0Var2 = c0126h2.f2510b;
                C0128j c0128j2 = this.f2507e;
                c0128j2.c(a0Var2);
                c0128j2.f2540r.remove(c0126h2.f2510b);
                c0128j2.i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f2504a) {
            case 0:
                a0 a0Var = this.f2505b.f2509a;
                this.f2507e.getClass();
                break;
            default:
                a0 a0Var2 = this.f2505b.f2510b;
                this.f2507e.getClass();
                break;
        }
    }
}
