package M0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: M0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0031d extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f586a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0032e f587b;

    public /* synthetic */ C0031d(C0032e c0032e, int i) {
        this.f586a = i;
        this.f587b = c0032e;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f586a) {
            case 1:
                this.f587b.f641b.h(false);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f586a) {
            case 0:
                this.f587b.f641b.h(true);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
