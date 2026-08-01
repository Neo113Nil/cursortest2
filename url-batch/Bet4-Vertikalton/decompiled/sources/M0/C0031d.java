package M0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: M0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0031d extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f569a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0032e f570b;

    public /* synthetic */ C0031d(C0032e c0032e, int i) {
        this.f569a = i;
        this.f570b = c0032e;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f569a) {
            case 1:
                this.f570b.f624b.h(false);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f569a) {
            case 0:
                this.f570b.f624b.h(true);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
