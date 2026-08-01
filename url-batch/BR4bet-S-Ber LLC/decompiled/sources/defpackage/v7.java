package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.view.ViewPropertyAnimator;
import com.google.android.material.snackbar.SnackbarContentLayout;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class v7 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ f8 b;

    public /* synthetic */ v7(f8 f8Var, int i) {
        this.a = i;
        this.b = f8Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.a;
        f8 f8Var = this.b;
        switch (i) {
            case 0:
                f8Var.c();
                break;
            case 1:
                f8Var.d();
                break;
            case 2:
                f8Var.c();
                break;
            default:
                f8Var.d();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        int i = this.a;
        f8 f8Var = this.b;
        switch (i) {
            case 1:
                SnackbarContentLayout snackbarContentLayout = f8Var.j;
                int i2 = f8Var.c;
                int i3 = f8Var.a;
                int i4 = i2 - i3;
                snackbarContentLayout.f.setAlpha(0.0f);
                long j = i3;
                ViewPropertyAnimator duration = snackbarContentLayout.f.animate().alpha(1.0f).setDuration(j);
                TimeInterpolator timeInterpolator = snackbarContentLayout.i;
                long j2 = i4;
                duration.setInterpolator(timeInterpolator).setStartDelay(j2).start();
                if (snackbarContentLayout.g.getVisibility() == 0) {
                    snackbarContentLayout.g.setAlpha(0.0f);
                    snackbarContentLayout.g.animate().alpha(1.0f).setDuration(j).setInterpolator(timeInterpolator).setStartDelay(j2).start();
                    break;
                }
                break;
            case 2:
                SnackbarContentLayout snackbarContentLayout2 = f8Var.j;
                int i5 = f8Var.b;
                snackbarContentLayout2.f.setAlpha(1.0f);
                long j3 = i5;
                ViewPropertyAnimator duration2 = snackbarContentLayout2.f.animate().alpha(0.0f).setDuration(j3);
                TimeInterpolator timeInterpolator2 = snackbarContentLayout2.i;
                duration2.setInterpolator(timeInterpolator2).setStartDelay(0L).start();
                if (snackbarContentLayout2.g.getVisibility() == 0) {
                    snackbarContentLayout2.g.setAlpha(1.0f);
                    snackbarContentLayout2.g.animate().alpha(0.0f).setDuration(j3).setInterpolator(timeInterpolator2).setStartDelay(0L).start();
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public /* synthetic */ v7(f8 f8Var, int i, int i2) {
        this.a = i2;
        this.b = f8Var;
    }
}
