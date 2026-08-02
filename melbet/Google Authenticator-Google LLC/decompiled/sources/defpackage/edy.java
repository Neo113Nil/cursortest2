package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class edy extends AnimatorListenerAdapter {
    final /* synthetic */ boolean a;
    final /* synthetic */ eea b;

    public edy(eea eeaVar, boolean z) {
        this.a = z;
        this.b = eeaVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.a) {
            eea eeaVar = this.b;
            eeaVar.o(true);
            eeaVar.p(true);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (this.a) {
            return;
        }
        eea eeaVar = this.b;
        eeaVar.o(false);
        eeaVar.p(false);
    }
}
