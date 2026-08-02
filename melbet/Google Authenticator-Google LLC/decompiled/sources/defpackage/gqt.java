package defpackage;

import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gqt {
    public final Set a;
    public final long b;
    public final gzp c;

    public gqt(Set set, long j, gzp gzpVar) {
        this.a = set;
        this.b = j;
        this.c = gzpVar;
    }

    public static gqt a(gqt gqtVar, gqt gqtVar2) {
        Set set = gqtVar.a;
        hoq.H(set.equals(gqtVar2.a));
        HashSet hashSet = new HashSet();
        gzp gzpVar = gyf.a;
        hashSet.addAll(set);
        long min = Math.min(gqtVar.b, gqtVar2.b);
        gzp gzpVar2 = gqtVar2.c;
        gzp gzpVar3 = gqtVar.c;
        if (gzpVar3.f() && gzpVar2.f()) {
            gzpVar = gzp.h(Long.valueOf(Math.min(((Long) gzpVar3.b()).longValue(), ((Long) gzpVar2.b()).longValue())));
        } else if (gzpVar3.f()) {
            gzpVar = gzpVar3;
        } else if (gzpVar2.f()) {
            gzpVar = gzpVar2;
        }
        return new gqt(hashSet, min, gzpVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gqt) {
            gqt gqtVar = (gqt) obj;
            if (this.a.equals(gqtVar.a) && this.b == gqtVar.b && this.c.equals(gqtVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        long j = this.b;
        return this.c.hashCode() ^ (((hashCode * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003);
    }

    public final String toString() {
        gzp gzpVar = this.c;
        return "SyncSchedule{constraints=" + this.a.toString() + ", nextSyncTime=" + this.b + ", ignoreFirstConstraintTime=" + gzpVar.toString() + "}";
    }

    public gqt() {
        throw null;
    }
}
