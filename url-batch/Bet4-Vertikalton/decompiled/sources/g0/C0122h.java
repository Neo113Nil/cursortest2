package g0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: g0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0122h extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2381a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0123i f2382b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f2383c;
    public final /* synthetic */ View d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0125k f2384e;

    public /* synthetic */ C0122h(C0125k c0125k, C0123i c0123i, ViewPropertyAnimator viewPropertyAnimator, View view, int i) {
        this.f2381a = i;
        this.f2384e = c0125k;
        this.f2382b = c0123i;
        this.f2383c = viewPropertyAnimator;
        this.d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f2381a) {
            case 0:
                this.f2383c.setListener(null);
                View view = this.d;
                view.setAlpha(1.0f);
                view.setTranslationX(RecyclerView.f1530C0);
                view.setTranslationY(RecyclerView.f1530C0);
                C0123i c0123i = this.f2382b;
                c0 c0Var = c0123i.f2386a;
                C0125k c0125k = this.f2384e;
                c0125k.c(c0Var);
                c0125k.f2415r.remove(c0123i.f2386a);
                c0125k.i();
                break;
            default:
                this.f2383c.setListener(null);
                View view2 = this.d;
                view2.setAlpha(1.0f);
                view2.setTranslationX(RecyclerView.f1530C0);
                view2.setTranslationY(RecyclerView.f1530C0);
                C0123i c0123i2 = this.f2382b;
                c0 c0Var2 = c0123i2.f2387b;
                C0125k c0125k2 = this.f2384e;
                c0125k2.c(c0Var2);
                c0125k2.f2415r.remove(c0123i2.f2387b);
                c0125k2.i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f2381a) {
            case 0:
                c0 c0Var = this.f2382b.f2386a;
                this.f2384e.getClass();
                break;
            default:
                c0 c0Var2 = this.f2382b.f2387b;
                this.f2384e.getClass();
                break;
        }
    }
}
