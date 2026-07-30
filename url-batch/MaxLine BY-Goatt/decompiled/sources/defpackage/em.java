package defpackage;

import java.util.HashMap;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class em {
    public final dq2 a;
    public final HashMap b;

    public em(dq2 dq2Var, HashMap hashMap) {
        this.a = dq2Var;
        this.b = hashMap;
    }

    public final long a(y42 y42Var, long j, int i) {
        long h = j - this.a.h();
        fm fmVar = (fm) this.b.get(y42Var);
        long j2 = fmVar.a;
        return Math.min(Math.max((long) (Math.pow(3.0d, i - 1) * j2 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j2 > 1 ? j2 : 2L) * r12))), h), fmVar.b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof em)) {
            return false;
        }
        em emVar = (em) obj;
        return this.a.equals(emVar.a) && this.b.equals(emVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.a + ", values=" + this.b + "}";
    }
}
