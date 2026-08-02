package defpackage;

import j$.time.Instant;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class eju implements ejv {
    private final boolean a;
    private final Instant b;
    private final /* synthetic */ int c;
    private final jkp d;

    private eju(jkp jkpVar, boolean z, Instant instant, int i) {
        this.c = i;
        this.d = jkpVar;
        this.a = z;
        this.b = instant;
    }

    public static eju c(lhg lhgVar) {
        Instant instant = Instant.EPOCH;
        jmh jmhVar = lhgVar.e;
        if (jmhVar == null) {
            jmhVar = jmh.a;
        }
        Instant c = imk.c(jmhVar);
        boolean z = false;
        for (lhf lhfVar : lhgVar.d) {
            jkb jkbVar = lhfVar.f;
            if (jkbVar == null) {
                jkbVar = jkb.a;
            }
            Instant plus = c.plus(imk.b(jkbVar));
            jkb jkbVar2 = lhfVar.g;
            if (jkbVar2 == null) {
                jkbVar2 = jkb.a;
            }
            Instant plus2 = plus.plus(imk.b(jkbVar2));
            if (true == plus2.isAfter(instant)) {
                instant = plus2;
            }
            z |= !((lhfVar.b & 16) != 0);
        }
        return new eju(lhgVar, z, instant, 0);
    }

    public static eju d(lfs lfsVar) {
        Instant instant = Instant.EPOCH;
        jmh jmhVar = lfsVar.g;
        if (jmhVar == null) {
            jmhVar = jmh.a;
        }
        Instant c = imk.c(jmhVar);
        HashSet hashSet = new HashSet();
        for (lfx lfxVar : lfsVar.k) {
            jkb jkbVar = lfxVar.f;
            if (jkbVar == null) {
                jkbVar = jkb.a;
            }
            Instant plus = c.plus(imk.b(jkbVar));
            if (true == plus.isAfter(instant)) {
                instant = plus;
            }
            int i = lfxVar.c;
            int i2 = i != 0 ? i != 3 ? i != 4 ? i != 5 ? 0 : 3 : 2 : 1 : 4;
            if (i2 == 0) {
                throw null;
            }
            int i3 = i2 - 1;
            if (i3 == 0) {
                hashSet.add(Long.valueOf(lfxVar.e));
            } else if (i3 == 1) {
                hashSet.remove(Long.valueOf(lfxVar.e));
            }
        }
        return new eju(lfsVar, !hashSet.isEmpty(), instant, 1);
    }

    @Override // defpackage.ejv
    public final long a() {
        int i = this.c;
        jkp jkpVar = this.d;
        return i != 0 ? jkpVar.c(null) : jkpVar.c(null);
    }

    @Override // defpackage.ejv
    public final /* synthetic */ Object b() {
        return this.d;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        if (this.c != 0) {
            eju ejuVar = (eju) obj;
            boolean z = ejuVar.a;
            boolean z2 = this.a;
            return z2 != z ? !z2 ? 1 : -1 : ejuVar.b.compareTo(this.b);
        }
        eju ejuVar2 = (eju) obj;
        boolean z3 = ejuVar2.a;
        boolean z4 = this.a;
        return z4 != z3 ? !z4 ? 1 : -1 : ejuVar2.b.compareTo(this.b);
    }
}
