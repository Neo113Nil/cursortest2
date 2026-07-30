package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class ia {
    public final long a;
    public final ds b;
    public final int c;
    public final int d;
    public final ja e;

    public ia(long j, ds dsVar, int i, int i2, ja jaVar) {
        dsVar.getClass();
        jaVar.getClass();
        this.a = j;
        this.b = dsVar;
        this.c = i;
        this.d = i2;
        this.e = jaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ia)) {
            return false;
        }
        ia iaVar = (ia) obj;
        return this.a == iaVar.a && this.b == iaVar.b && this.c == iaVar.c && this.d == iaVar.d && this.e == iaVar.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + qy0.c(this.d, qy0.c(this.c, (this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31, 31), 31);
    }

    public final String toString() {
        return "AttemptRecord(timestampMillis=" + this.a + ", difficulty=" + this.b + ", distance=" + this.c + ", collectedGoldenFeathers=" + this.d + ", result=" + this.e + ")";
    }
}
