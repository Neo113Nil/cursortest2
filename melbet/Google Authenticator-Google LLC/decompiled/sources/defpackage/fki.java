package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fki extends AnimatorListenerAdapter {
    final /* synthetic */ fkj a;

    public fki(fkj fkjVar) {
        this.a = fkjVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        fkj fkjVar = this.a;
        fkjVar.a.setTranslationY(0.0f);
        fkjVar.g(0.0f);
    }
}
