package s2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class c extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3240a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f3241b;

    public /* synthetic */ c(d dVar, int i) {
        this.f3240a = i;
        this.f3241b = dVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f3240a) {
            case 1:
                this.f3241b.f3293b.i(false);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f3240a) {
            case 0:
                this.f3241b.f3293b.i(true);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
