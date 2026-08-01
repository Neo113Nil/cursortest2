package I0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes.dex */
public final class k extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f598a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f599b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f600c;

    public k(l lVar, boolean z2, int i) {
        this.f600c = lVar;
        this.f598a = z2;
        this.f599b = i;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        l lVar = this.f600c;
        lVar.f581b.setTranslationX(0.0f);
        lVar.a(0.0f, this.f598a, this.f599b);
    }
}
