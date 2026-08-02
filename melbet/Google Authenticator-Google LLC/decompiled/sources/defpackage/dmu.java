package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class dmu extends AnimatorListenerAdapter {
    final /* synthetic */ View a;
    final /* synthetic */ ViewTreeObserver.OnPreDrawListener b;

    public dmu(View view, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        this.a = view;
        this.b = onPreDrawListener;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.getViewTreeObserver().removeOnPreDrawListener(this.b);
    }
}
