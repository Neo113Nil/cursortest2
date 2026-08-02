package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class drs extends AnimatorListenerAdapter {
    final /* synthetic */ Runnable a;
    final /* synthetic */ AnimatorListenerAdapter b;
    final /* synthetic */ dru c;

    public drs(dru druVar, Runnable runnable, AnimatorListenerAdapter animatorListenerAdapter) {
        this.a = runnable;
        this.b = animatorListenerAdapter;
        this.c = druVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.run();
        dru druVar = this.c;
        AccountParticleDisc accountParticleDisc = druVar.b.b;
        hel s = hel.s(ObjectAnimator.ofFloat(accountParticleDisc, "scaleX", 0.067f, 1.0f).setDuration(233L), ObjectAnimator.ofFloat(accountParticleDisc, "scaleY", 0.067f, 1.0f).setDuration(233L), ObjectAnimator.ofFloat(accountParticleDisc, "alpha", 0.125f, 1.0f).setDuration(117L));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(s);
        animatorSet.addListener(this.b);
        animatorSet.addListener(new drt(druVar, accountParticleDisc));
        animatorSet.start();
    }
}
