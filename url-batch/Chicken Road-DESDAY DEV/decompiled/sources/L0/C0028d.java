package L0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: L0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0028d extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f505a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0029e f506b;

    public /* synthetic */ C0028d(C0029e c0029e, int i) {
        this.f505a = i;
        this.f506b = c0029e;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f505a) {
            case 1:
                this.f506b.f561b.h(false);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f505a) {
            case 0:
                this.f506b.f561b.h(true);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
