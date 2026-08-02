package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ghm {
    public final jjq a;
    public final long b;
    public final etm c;
    private final String d;

    public ghm(String str, jjq jjqVar, long j, etm etmVar) {
        this.d = str;
        this.a = jjqVar;
        this.b = j;
        this.c = etmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ghm)) {
            return false;
        }
        ghm ghmVar = (ghm) obj;
        return ksp.b(this.d, ghmVar.d) && ksp.b(this.a, ghmVar.a) && this.b == ghmVar.b && ksp.b(this.c, ghmVar.c);
    }

    public final int hashCode() {
        int hashCode = this.d.hashCode() * 31;
        jjq jjqVar = this.a;
        int hashCode2 = (hashCode + (jjqVar == null ? 0 : jjqVar.hashCode())) * 31;
        long j = this.b;
        return ((hashCode2 + ((int) (j ^ (j >>> 32)))) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "Metadata(serverToken=" + this.d + ", experimentToken=" + this.a + ", lastUpdateEpochMillis=" + this.b + ", commitProperties=" + this.c + ")";
    }
}
