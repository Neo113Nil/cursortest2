package N0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: N0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0031d extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f641a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0032e f642b;

    public /* synthetic */ C0031d(C0032e c0032e, int i) {
        this.f641a = i;
        this.f642b = c0032e;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f641a) {
            case 1:
                this.f642b.f699b.h(false);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f641a) {
            case 0:
                this.f642b.f699b.h(true);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
