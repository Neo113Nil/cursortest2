package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dkc implements jwz {
    private final hac a;

    public dkc(hac hacVar) {
        this.a = hacVar;
    }

    @Override // defpackage.jwz
    public final iws a(kae kaeVar, jww jwwVar, jwx jwxVar) {
        dkb dkbVar;
        if (!((Boolean) this.a.bB()).booleanValue()) {
            return jwxVar.b(kaeVar, jwwVar);
        }
        eik eikVar = (eik) jwwVar.e(dju.a);
        if (eikVar == null) {
            dkbVar = new dkb(new eqa(null, "https://" + jwxVar.a() + "/" + kaeVar.b, false, SystemClock.elapsedRealtime()));
        } else {
            dkbVar = new dkb(new eqa(jwxVar.a(), eik.b(eikVar), true, SystemClock.elapsedRealtime()));
        }
        return new djz(jwxVar.b(kaeVar, jwwVar.h(dkbVar)), dkbVar);
    }
}
