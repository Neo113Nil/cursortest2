package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class gg extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ q20 b;
    public final /* synthetic */ View c;
    public final /* synthetic */ ViewPropertyAnimator d;
    public final /* synthetic */ lg e;

    public gg(lg lgVar, q20 q20Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.e = lgVar;
        this.b = q20Var;
        this.d = viewPropertyAnimator;
        this.c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                this.c.setAlpha(1.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.a;
        q20 q20Var = this.b;
        lg lgVar = this.e;
        ViewPropertyAnimator viewPropertyAnimator = this.d;
        switch (i) {
            case 0:
                viewPropertyAnimator.setListener(null);
                this.c.setAlpha(1.0f);
                lgVar.c(q20Var);
                lgVar.q.remove(q20Var);
                lgVar.i();
                break;
            default:
                viewPropertyAnimator.setListener(null);
                lgVar.c(q20Var);
                lgVar.o.remove(q20Var);
                lgVar.i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                this.e.getClass();
                break;
            default:
                this.e.getClass();
                break;
        }
    }

    public gg(lg lgVar, q20 q20Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.e = lgVar;
        this.b = q20Var;
        this.c = view;
        this.d = viewPropertyAnimator;
    }
}
