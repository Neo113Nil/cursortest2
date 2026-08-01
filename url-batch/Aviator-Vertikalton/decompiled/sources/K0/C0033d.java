package K0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: K0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0033d extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f536a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0034e f537b;

    public /* synthetic */ C0033d(C0034e c0034e, int i) {
        this.f536a = i;
        this.f537b = c0034e;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f536a) {
            case 1:
                this.f537b.f593b.h(false);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f536a) {
            case 0:
                this.f537b.f593b.h(true);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
