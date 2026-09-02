package o2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class c extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2878a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f2879b;

    public /* synthetic */ c(d dVar, int i) {
        this.f2878a = i;
        this.f2879b = dVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f2878a) {
            case 1:
                this.f2879b.f2932b.h(false);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f2878a) {
            case 0:
                this.f2879b.f2932b.h(true);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
