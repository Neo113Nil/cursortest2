package w4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class i extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public boolean f7925a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f7926b;

    public i(j jVar) {
        this.f7926b = jVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f7925a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f7925a) {
            this.f7925a = false;
            return;
        }
        j jVar = this.f7926b;
        if (((Float) jVar.f7950u.getAnimatedValue()).floatValue() == 0.0f) {
            jVar.f7951v = 0;
            jVar.f(0);
        } else {
            jVar.f7951v = 2;
            jVar.f7943n.invalidate();
        }
    }
}
