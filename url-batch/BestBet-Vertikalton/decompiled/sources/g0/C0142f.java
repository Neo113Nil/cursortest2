package g0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: g0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0142f extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2826a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0143g f2827b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f2828c;
    public final /* synthetic */ View d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0145i f2829e;

    public /* synthetic */ C0142f(C0145i c0145i, C0143g c0143g, ViewPropertyAnimator viewPropertyAnimator, View view, int i) {
        this.f2826a = i;
        this.f2829e = c0145i;
        this.f2827b = c0143g;
        this.f2828c = viewPropertyAnimator;
        this.d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f2826a) {
            case 0:
                this.f2828c.setListener(null);
                View view = this.d;
                view.setAlpha(1.0f);
                view.setTranslationX(RecyclerView.f1937A0);
                view.setTranslationY(RecyclerView.f1937A0);
                C0143g c0143g = this.f2827b;
                Y y2 = c0143g.f2837a;
                C0145i c0145i = this.f2829e;
                c0145i.c(y2);
                c0145i.f2865r.remove(c0143g.f2837a);
                c0145i.i();
                break;
            default:
                this.f2828c.setListener(null);
                View view2 = this.d;
                view2.setAlpha(1.0f);
                view2.setTranslationX(RecyclerView.f1937A0);
                view2.setTranslationY(RecyclerView.f1937A0);
                C0143g c0143g2 = this.f2827b;
                Y y3 = c0143g2.f2838b;
                C0145i c0145i2 = this.f2829e;
                c0145i2.c(y3);
                c0145i2.f2865r.remove(c0143g2.f2838b);
                c0145i2.i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f2826a) {
            case 0:
                Y y2 = this.f2827b.f2837a;
                this.f2829e.getClass();
                break;
            default:
                Y y3 = this.f2827b.f2838b;
                this.f2829e.getClass();
                break;
        }
    }
}
