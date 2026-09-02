package f1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class l extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1412a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f1413b;

    public l(m mVar) {
        this.f1413b = mVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f1412a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f1412a) {
            this.f1412a = false;
            return;
        }
        m mVar = this.f1413b;
        if (((Float) mVar.f1443z.getAnimatedValue()).floatValue() == 0.0f) {
            mVar.A = 0;
            mVar.f(0);
        } else {
            mVar.A = 2;
            mVar.f1436s.invalidate();
        }
    }
}
