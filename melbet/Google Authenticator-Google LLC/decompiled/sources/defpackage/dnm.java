package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.libraries.material.speeddial.FloatingSpeedDialView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dnm extends AnimatorListenerAdapter {
    final /* synthetic */ boolean a;
    final /* synthetic */ FloatingSpeedDialView b;

    public dnm(FloatingSpeedDialView floatingSpeedDialView, boolean z) {
        this.a = z;
        this.b = floatingSpeedDialView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.a) {
            return;
        }
        this.b.setVisibility(8);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (this.a) {
            this.b.setVisibility(0);
        }
    }
}
