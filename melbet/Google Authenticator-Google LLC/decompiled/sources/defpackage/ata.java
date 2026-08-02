package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ata {
    private final long a;
    private final long b;

    public ata(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ksp.b(getClass(), obj.getClass())) {
            ata ataVar = (ata) obj;
            if (ataVar.a == this.a && ataVar.b == this.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (zx.f(this.a) * 31) + zx.f(this.b);
    }

    public final String toString() {
        return "PeriodicityInfo{repeatIntervalMillis=" + this.a + ", flexIntervalMillis=" + this.b + "}";
    }
}
