package defpackage;

import java.util.Set;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atc {
    public final UUID a;
    public final atb b;
    public final Set c;
    public final ary d;
    private final asa e;
    private final asa f;
    private final int g;
    private final int h;
    private final long i;
    private final ata j;
    private final long k;
    private final int l;
    private final String m;

    public atc(UUID uuid, atb atbVar, Set set, asa asaVar, asa asaVar2, int i, int i2, ary aryVar, long j, ata ataVar, long j2, int i3, String str) {
        asaVar2.getClass();
        this.a = uuid;
        this.b = atbVar;
        this.c = set;
        this.e = asaVar;
        this.f = asaVar2;
        this.g = i;
        this.h = i2;
        this.d = aryVar;
        this.i = j;
        this.j = ataVar;
        this.k = j2;
        this.l = i3;
        this.m = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !ksp.b(getClass(), obj.getClass())) {
            return false;
        }
        atc atcVar = (atc) obj;
        if (this.g == atcVar.g && this.h == atcVar.h && ksp.b(this.a, atcVar.a) && this.b == atcVar.b && ksp.b(this.e, atcVar.e) && ksp.b(this.d, atcVar.d) && this.i == atcVar.i && ksp.b(this.j, atcVar.j) && this.k == atcVar.k && this.l == atcVar.l && ksp.b(this.m, atcVar.m) && ksp.b(this.c, atcVar.c)) {
            return ksp.b(this.f, atcVar.f);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.e.hashCode()) * 31) + this.c.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g) * 31) + this.h) * 31) + this.d.hashCode();
        ata ataVar = this.j;
        return (((((((((hashCode * 31) + yp.f(this.i)) * 31) + (ataVar != null ? ataVar.hashCode() : 0)) * 31) + yp.f(this.k)) * 31) + this.l) * 31) + this.m.hashCode();
    }

    public final String toString() {
        return "WorkInfo{id='" + this.a + "', state=" + this.b + ", outputData=" + this.e + ", tags=" + this.c + ", progress=" + this.f + ", runAttemptCount=" + this.g + ", generation=" + this.h + ", constraints=" + this.d + ", initialDelayMillis=" + this.i + ", periodicityInfo=" + this.j + ", nextScheduleTimeMillis=" + this.k + "}, stopReason=" + this.l + ", workerClassName=" + this.m;
    }
}
