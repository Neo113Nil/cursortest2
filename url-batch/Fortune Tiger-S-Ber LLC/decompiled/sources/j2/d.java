package j2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class d extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2301a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f2302b;

    public /* synthetic */ d(e eVar, int i4) {
        this.f2301a = i4;
        this.f2302b = eVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f2301a) {
            case 1:
                this.f2302b.f2356b.i(false);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f2301a) {
            case 0:
                this.f2302b.f2356b.i(true);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
