package z5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class d extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9184a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f9185b;

    public /* synthetic */ d(e eVar, int i) {
        this.f9184a = i;
        this.f9185b = eVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f9184a) {
            case 1:
                this.f9185b.f9239b.h(false);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f9184a) {
            case 0:
                this.f9185b.f9239b.h(true);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
