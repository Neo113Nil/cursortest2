package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import com.google.android.libraries.onegoogle.account.disc.RingFrameLayout;
import com.google.android.libraries.onegoogle.common.CirclePulseDrawable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dqp {
    public final dpb a;
    public final RingFrameLayout b;
    public dkq c;
    public efu d;
    public gzp e;
    public gzp f;
    private AnimatorSet g = new AnimatorSet();

    public dqp(dpb dpbVar, RingFrameLayout ringFrameLayout) {
        gyf gyfVar = gyf.a;
        this.e = gyfVar;
        this.f = gyfVar;
        this.a = dpbVar;
        this.b = ringFrameLayout;
        dpbVar.e();
        dpbVar.d(new be(this, 9));
        ringFrameLayout.setVisibility(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(gzp gzpVar, boolean z) {
        dqq dqqVar;
        int i;
        if (this.g.isRunning()) {
            this.g.cancel();
        }
        if (!this.f.f()) {
            this.e = gzpVar;
            return;
        }
        int intValue = ((Integer) this.f.b()).intValue();
        dkq dkqVar = null;
        if (gzpVar.f()) {
            dqk dqkVar = (dqk) gzpVar.b();
            dqr dqrVar = dqkVar.a;
            if (dqrVar != null) {
                dqqVar = dqrVar.a(new kee(this.a));
            } else {
                ecj ecjVar = dqkVar.c;
                if (ecjVar == null) {
                    throw new IllegalStateException("RingContent must have a ring drawable factory.");
                }
                CirclePulseDrawable circlePulseDrawable = ecjVar.a;
                circlePulseDrawable.setAlpha(128);
                AnimatorSet animatorSet = ecjVar.b;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    ecjVar.b.removeAllListeners();
                }
                int i2 = intValue + intValue;
                AnimatorSet a = ecj.a(circlePulseDrawable, "firstPulseSize", i2, 950L, 900L);
                AnimatorSet a2 = ecj.a(circlePulseDrawable, "secondPulseSize", i2, 900L, 834L);
                a2.setStartDelay(400L);
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.playTogether(a, a2);
                ecjVar.b = animatorSet2;
                ecjVar.b.addListener(new eci(ecjVar));
                if (ecjVar.c) {
                    ecjVar.b.start();
                }
                dqqVar = circlePulseDrawable;
            }
        } else {
            dqqVar = null;
        }
        int i3 = hel.d;
        heg hegVar = new heg(4);
        dpb dpbVar = this.a;
        if (dpbVar.b() != null) {
            ObjectAnimator duration = ObjectAnimator.ofInt(dpbVar, "currRingThickness", intValue, -1).setDuration(200L);
            duration.addListener(new dqn(this));
            hegVar.h(duration);
        }
        if (dqqVar != null) {
            ObjectAnimator duration2 = ObjectAnimator.ofInt(dpbVar, "currRingThickness", -1, intValue).setDuration(200L);
            duration2.addListener(new dqo(this, gzpVar, dqqVar));
            hegVar.h(duration2);
        }
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playSequentially(hegVar.g());
        this.g = animatorSet3;
        if (!z || dpbVar.b() == dqqVar) {
            this.g.setDuration(0L);
        }
        this.g.start();
        if (gzpVar.f() && (i = ((dqk) gzpVar.b()).d) != 0) {
            jkj k = hrc.a.k();
            if (!k.b.M()) {
                k.t();
            }
            hrc hrcVar = (hrc) k.b;
            hrcVar.c = i - 1;
            hrcVar.b |= 1;
            iwq iwqVar = efs.a;
            jkj k2 = eft.a.k();
            jkj k3 = hrd.a.k();
            if (!k3.b.M()) {
                k3.t();
            }
            hrd hrdVar = (hrd) k3.b;
            hrc hrcVar2 = (hrc) k.q();
            hrcVar2.getClass();
            hrdVar.d = hrcVar2;
            hrdVar.b |= 8;
            if (!k2.b.M()) {
                k2.t();
            }
            eft eftVar = (eft) k2.b;
            hrd hrdVar2 = (hrd) k3.q();
            hrdVar2.getClass();
            eftVar.c = hrdVar2;
            eftVar.b |= 1;
            dkqVar = new dkq(iwqVar, (eft) k2.q());
        }
        this.c = dkqVar;
        efu efuVar = this.d;
        if (efuVar == null) {
            return;
        }
        RingFrameLayout ringFrameLayout = this.b;
        ringFrameLayout.e(efuVar);
        dkq dkqVar2 = this.c;
        efu efuVar2 = this.d;
        if (dkqVar2 != null) {
            ringFrameLayout.c(efuVar2, dkqVar2);
        } else {
            ringFrameLayout.b(efuVar2);
        }
    }

    public final void b(gzp gzpVar) {
        fao.c();
        a(gzpVar, false);
    }
}
