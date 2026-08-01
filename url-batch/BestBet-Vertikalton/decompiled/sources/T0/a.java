package T0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.snackbar.SnackbarContentLayout;

/* loaded from: classes.dex */
public final class a extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1026a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f1027b;

    public /* synthetic */ a(i iVar, int i) {
        this.f1026a = i;
        this.f1027b = iVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f1026a) {
            case 0:
                this.f1027b.b();
                break;
            case 1:
                this.f1027b.c();
                break;
            case 2:
                this.f1027b.b();
                break;
            default:
                this.f1027b.c();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f1026a) {
            case 1:
                i iVar = this.f1027b;
                SnackbarContentLayout snackbarContentLayout = iVar.f1055j;
                int i = iVar.f1051c;
                int i2 = iVar.f1049a;
                int i3 = i - i2;
                snackbarContentLayout.f2357a.setAlpha(RecyclerView.f1937A0);
                long j2 = i2;
                ViewPropertyAnimator duration = snackbarContentLayout.f2357a.animate().alpha(1.0f).setDuration(j2);
                TimeInterpolator timeInterpolator = snackbarContentLayout.f2359c;
                long j3 = i3;
                duration.setInterpolator(timeInterpolator).setStartDelay(j3).start();
                if (snackbarContentLayout.f2358b.getVisibility() == 0) {
                    snackbarContentLayout.f2358b.setAlpha(RecyclerView.f1937A0);
                    snackbarContentLayout.f2358b.animate().alpha(1.0f).setDuration(j2).setInterpolator(timeInterpolator).setStartDelay(j3).start();
                    break;
                }
                break;
            case 2:
                i iVar2 = this.f1027b;
                SnackbarContentLayout snackbarContentLayout2 = iVar2.f1055j;
                snackbarContentLayout2.f2357a.setAlpha(1.0f);
                ViewPropertyAnimator alpha = snackbarContentLayout2.f2357a.animate().alpha(RecyclerView.f1937A0);
                long j4 = iVar2.f1050b;
                ViewPropertyAnimator duration2 = alpha.setDuration(j4);
                TimeInterpolator timeInterpolator2 = snackbarContentLayout2.f2359c;
                long j5 = 0;
                duration2.setInterpolator(timeInterpolator2).setStartDelay(j5).start();
                if (snackbarContentLayout2.f2358b.getVisibility() == 0) {
                    snackbarContentLayout2.f2358b.setAlpha(1.0f);
                    snackbarContentLayout2.f2358b.animate().alpha(RecyclerView.f1937A0).setDuration(j4).setInterpolator(timeInterpolator2).setStartDelay(j5).start();
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public /* synthetic */ a(i iVar, int i, int i2) {
        this.f1026a = i2;
        this.f1027b = iVar;
    }
}
