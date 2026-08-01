package R0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: R0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0028d extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f656a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f657b;

    public /* synthetic */ C0028d(e eVar, int i) {
        this.f656a = i;
        this.f657b = eVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f656a) {
            case 1:
                this.f657b.f710b.h(false);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f656a) {
            case 0:
                this.f657b.f710b.h(true);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
