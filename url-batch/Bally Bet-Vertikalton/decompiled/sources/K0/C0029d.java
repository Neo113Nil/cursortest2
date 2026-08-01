package K0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: K0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0029d extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f486a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0030e f487b;

    public /* synthetic */ C0029d(C0030e c0030e, int i) {
        this.f486a = i;
        this.f487b = c0030e;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f486a) {
            case 1:
                this.f487b.f541b.h(false);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f486a) {
            case 0:
                this.f487b.f541b.h(true);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
