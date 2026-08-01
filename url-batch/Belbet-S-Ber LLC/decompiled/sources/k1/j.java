package k1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
import n0.b1;
import n0.x0;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class j extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2335a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2336b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2337c;

    public /* synthetic */ j(Object obj, Object obj2, int i) {
        this.f2335a = i;
        this.f2337c = obj;
        this.f2336b = obj2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f2335a) {
            case 0:
                ((q.f) this.f2336b).remove(animator);
                ((n) this.f2337c).f2358s.remove(animator);
                break;
            case 1:
                b1 b1Var = (b1) this.f2336b;
                b1Var.f2759a.e(1.0f);
                x0.f((View) this.f2337c, b1Var);
                break;
            case 2:
                View view = (View) this.f2336b;
                HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) this.f2337c;
                hideBottomViewOnScrollBehavior.f913k = null;
                if (hideBottomViewOnScrollBehavior.f912j == 1 && view.getVisibility() == 0) {
                    view.setVisibility(4);
                    break;
                }
                break;
            default:
                View view2 = (View) this.f2336b;
                HideViewOnScrollBehavior hideViewOnScrollBehavior = (HideViewOnScrollBehavior) this.f2337c;
                hideViewOnScrollBehavior.f923k = null;
                if (hideViewOnScrollBehavior.f922j == 1 && view2.getVisibility() == 0) {
                    view2.setVisibility(4);
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f2335a) {
            case 0:
                ((n) this.f2337c).f2358s.add(animator);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public j(View view, b1 b1Var) {
        this.f2335a = 1;
        this.f2336b = b1Var;
        this.f2337c = view;
    }
}
