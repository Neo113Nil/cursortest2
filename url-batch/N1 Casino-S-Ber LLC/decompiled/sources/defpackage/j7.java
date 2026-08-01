package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.view.ViewPropertyAnimator;
import com.google.android.material.snackbar.SnackbarContentLayout;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class j7 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ s7 b;

    public /* synthetic */ j7(s7 s7Var, int i) {
        this.a = i;
        this.b = s7Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.a;
        s7 s7Var = this.b;
        switch (i) {
            case 0:
                s7Var.b();
                break;
            case 1:
                s7Var.c();
                break;
            case 2:
                s7Var.b();
                break;
            default:
                s7Var.c();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        int i = this.a;
        s7 s7Var = this.b;
        switch (i) {
            case 1:
                SnackbarContentLayout snackbarContentLayout = s7Var.j;
                int i2 = s7Var.c;
                int i3 = s7Var.a;
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
                SnackbarContentLayout snackbarContentLayout2 = s7Var.j;
                int i5 = s7Var.b;
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

    public /* synthetic */ j7(s7 s7Var, int i, int i2) {
        this.a = i2;
        this.b = s7Var;
    }
}
