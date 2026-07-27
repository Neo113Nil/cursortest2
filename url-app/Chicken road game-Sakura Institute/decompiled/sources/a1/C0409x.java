package a1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: a1.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0409x extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0368D f4899a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f4900b;

    public C0409x(C0368D c0368d, View view) {
        this.f4899a = c0368d;
        this.f4900b = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C0368D c0368d = this.f4899a;
        c0368d.f4839a.c(1.0f);
        C0411z.d(c0368d, this.f4900b);
    }
}
