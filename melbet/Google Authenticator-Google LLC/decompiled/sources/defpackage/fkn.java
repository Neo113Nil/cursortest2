package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fkn extends AnimatorListenerAdapter {
    final /* synthetic */ boolean a;
    final /* synthetic */ int b;
    final /* synthetic */ fko c;

    public fkn(fko fkoVar, boolean z, int i) {
        this.a = z;
        this.b = i;
        this.c = fkoVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        fko fkoVar = this.c;
        fkoVar.a.setTranslationX(0.0f);
        fkoVar.g(0.0f, this.a, this.b);
    }
}
