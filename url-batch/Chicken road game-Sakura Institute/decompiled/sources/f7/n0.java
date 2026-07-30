package f7;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f3522a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3523b;

    public n0(long j8, long j9) {
        this.f3522a = j8;
        this.f3523b = j9;
        if (j8 < 0) {
            throw new IllegalArgumentException(("stopTimeout(" + j8 + " ms) cannot be negative").toString());
        }
        if (j9 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("replayExpiration(" + j9 + " ms) cannot be negative").toString());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return this.f3522a == n0Var.f3522a && this.f3523b == n0Var.f3523b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f3523b) + (Long.hashCode(this.f3522a) * 31);
    }

    public final String toString() {
        f6.c cVar = new f6.c(2);
        long j8 = this.f3522a;
        if (j8 > 0) {
            cVar.add("stopTimeout=" + j8 + "ms");
        }
        long j9 = this.f3523b;
        if (j9 < Long.MAX_VALUE) {
            cVar.add("replayExpiration=" + j9 + "ms");
        }
        return "SharingStarted.WhileSubscribed(" + e6.l.m0(t6.a.s(cVar), null, null, null, null, 63) + ')';
    }
}
