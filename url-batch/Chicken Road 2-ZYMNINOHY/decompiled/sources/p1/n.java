package p1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes.dex */
public final class n extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p.e f14765a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f14766b;

    public n(q qVar, p.e eVar) {
        this.f14766b = qVar;
        this.f14765a = eVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f14765a.remove(animator);
        this.f14766b.f14785k.remove(animator);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f14766b.f14785k.add(animator);
    }
}
