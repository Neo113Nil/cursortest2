package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.libraries.material.speeddial.FloatingSpeedDialView;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class dno extends AnimatorListenerAdapter {
    final /* synthetic */ FloatingSpeedDialView a;

    public dno(FloatingSpeedDialView floatingSpeedDialView) {
        this.a = floatingSpeedDialView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.d = null;
    }
}
