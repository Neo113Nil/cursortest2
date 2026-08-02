package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class drt extends AnimatorListenerAdapter {
    final /* synthetic */ AccountParticleDisc a;
    final /* synthetic */ dru b;

    public drt(dru druVar, AccountParticleDisc accountParticleDisc) {
        this.a = accountParticleDisc;
        this.b = druVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        AccountParticleDisc accountParticleDisc = this.a;
        accountParticleDisc.setTranslationY(0.0f);
        accountParticleDisc.setTranslationX(0.0f);
        SelectedAccountDisc selectedAccountDisc = this.b.b;
        accountParticleDisc.setPivotX(selectedAccountDisc.getHeight() >> 1);
        accountParticleDisc.setPivotY(selectedAccountDisc.getHeight() >> 1);
    }
}
