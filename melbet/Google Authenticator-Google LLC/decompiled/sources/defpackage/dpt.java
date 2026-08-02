package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.libraries.onegoogle.account.disc.BadgeFrameLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class dpt extends AnimatorListenerAdapter {
    final /* synthetic */ dpn a;
    final /* synthetic */ dpx b;

    public dpt(dpx dpxVar, dpn dpnVar) {
        this.a = dpnVar;
        this.b = dpxVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        dpx dpxVar = this.b;
        dkq dkqVar = null;
        dpxVar.d = null;
        dpn dpnVar = this.a;
        if (dpnVar != null) {
            int i = dpnVar.d - 1;
            int i2 = i != 0 ? i != 1 ? 6 : 5 : 8;
            iwq iwqVar = efs.a;
            jkj k = eft.a.k();
            jkj k2 = hrd.a.k();
            jkj k3 = hrb.a.k();
            if (!k3.b.M()) {
                k3.t();
            }
            hrb hrbVar = (hrb) k3.b;
            hrbVar.c = i2 - 1;
            hrbVar.b |= 1;
            hrb hrbVar2 = (hrb) k3.q();
            if (!k2.b.M()) {
                k2.t();
            }
            hrd hrdVar = (hrd) k2.b;
            hrbVar2.getClass();
            hrdVar.c = hrbVar2;
            hrdVar.b |= 2;
            hrd hrdVar2 = (hrd) k2.q();
            if (!k.b.M()) {
                k.t();
            }
            eft eftVar = (eft) k.b;
            hrdVar2.getClass();
            eftVar.c = hrdVar2;
            eftVar.b |= 1;
            dkqVar = new dkq(iwqVar, (eft) k.q());
        }
        dpxVar.e = dkqVar;
        efu efuVar = dpxVar.c;
        if (efuVar == null) {
            return;
        }
        BadgeFrameLayout badgeFrameLayout = dpxVar.a;
        badgeFrameLayout.e(efuVar);
        dkq dkqVar2 = dpxVar.e;
        if (dkqVar2 != null) {
            badgeFrameLayout.c(dpxVar.c, dkqVar2);
        } else {
            badgeFrameLayout.b(dpxVar.c);
        }
    }
}
