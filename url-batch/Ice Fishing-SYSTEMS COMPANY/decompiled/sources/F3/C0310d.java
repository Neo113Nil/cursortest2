package F3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: F3.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0310d extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1022a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0311e f1023b;

    public /* synthetic */ C0310d(C0311e c0311e, int i) {
        this.f1022a = i;
        this.f1023b = c0311e;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f1022a) {
            case 1:
                this.f1023b.f1085b.h(false);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f1022a) {
            case 0:
                this.f1023b.f1085b.h(true);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
