package defpackage;

import java.util.Set;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class htw extends gyx {
    static final gze a = new gze();
    static final Set b = hnu.k();
    final htx c;

    public htw(htz htzVar) {
        super(htzVar, a);
        this.c = htzVar.c;
    }

    @Override // defpackage.gyy
    public final void finalizeReferent() {
        b.remove(this);
        htx htxVar = this.c;
        if (((hty) htxVar.a.get()).equals(hty.a)) {
            htz.a.a().logp(Level.SEVERE, "com.google.common.util.concurrent.ClosingFuture$State", "closeIfLeaked", "Uh oh! An open ClosingFuture has leaked and will close: {0}", htxVar);
            htxVar.e();
        }
    }
}
