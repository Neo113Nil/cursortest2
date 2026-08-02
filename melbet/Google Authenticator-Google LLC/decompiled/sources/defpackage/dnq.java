package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewTreeObserver;
import com.google.android.libraries.material.speeddial.FloatingSpeedDialView;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class dnq extends AnimatorListenerAdapter {
    final /* synthetic */ ViewTreeObserver.OnPreDrawListener a;
    final /* synthetic */ FloatingSpeedDialView b;

    public dnq(FloatingSpeedDialView floatingSpeedDialView, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        this.a = onPreDrawListener;
        this.b = floatingSpeedDialView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.getViewTreeObserver().removeOnPreDrawListener(this.a);
    }
}
