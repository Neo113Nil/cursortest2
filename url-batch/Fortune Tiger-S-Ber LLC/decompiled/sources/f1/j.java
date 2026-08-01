package f1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
import k0.r0;
import k0.w0;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class j extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1684a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1685b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j(Object obj, Object obj2, int i4) {
        this.f1684a = i4;
        this.c = obj;
        this.f1685b = obj2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f1684a) {
            case 0:
                ((n.f) this.f1685b).remove(animator);
                ((o) this.c).f1708s.remove(animator);
                break;
            case 1:
                w0 w0Var = (w0) this.f1685b;
                w0Var.f2788a.e(1.0f);
                r0.f((View) this.c, w0Var);
                break;
            case 2:
                View view = (View) this.f1685b;
                HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) this.c;
                hideBottomViewOnScrollBehavior.f1176k = null;
                if (hideBottomViewOnScrollBehavior.f1175j == 1 && view.getVisibility() == 0) {
                    view.setVisibility(4);
                    break;
                }
                break;
            default:
                View view2 = (View) this.f1685b;
                HideViewOnScrollBehavior hideViewOnScrollBehavior = (HideViewOnScrollBehavior) this.c;
                hideViewOnScrollBehavior.f1186k = null;
                if (hideViewOnScrollBehavior.f1185j == 1 && view2.getVisibility() == 0) {
                    view2.setVisibility(4);
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f1684a) {
            case 0:
                ((o) this.c).f1708s.add(animator);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public j(View view, w0 w0Var) {
        this.f1684a = 1;
        this.f1685b = w0Var;
        this.c = view;
    }
}
