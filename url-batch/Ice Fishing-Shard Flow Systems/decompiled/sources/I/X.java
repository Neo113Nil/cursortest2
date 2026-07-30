package I;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;

/* loaded from: classes.dex */
public final class X extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1162a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1163b;

    public X(ActionBarOverlayLayout actionBarOverlayLayout) {
        this.f1163b = actionBarOverlayLayout;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.f1162a) {
            case 0:
                ((Z) this.f1163b).b();
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f1163b;
                actionBarOverlayLayout.f3172E = null;
                actionBarOverlayLayout.f3187s = false;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f1162a) {
            case 0:
                ((Z) this.f1163b).a();
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f1163b;
                actionBarOverlayLayout.f3172E = null;
                actionBarOverlayLayout.f3187s = false;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f1162a) {
            case 0:
                ((Z) this.f1163b).c();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public X(Z z7, View view) {
        this.f1163b = z7;
    }
}
