package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class kl extends AnimatorListenerAdapter {
    public boolean a = false;
    public final /* synthetic */ ll b;

    public kl(ll llVar) {
        this.b = llVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.a) {
            this.a = false;
            return;
        }
        ll llVar = this.b;
        if (((Float) llVar.z.getAnimatedValue()).floatValue() == 0.0f) {
            llVar.A = 0;
            llVar.f(0);
        } else {
            llVar.A = 2;
            llVar.s.invalidate();
        }
    }
}
