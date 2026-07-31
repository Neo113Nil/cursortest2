package t2;

/* renamed from: t2.M, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1042M {

    /* renamed from: a, reason: collision with root package name */
    public final long f8993a;

    /* renamed from: b, reason: collision with root package name */
    public final long f8994b;

    public C1042M(long j3, long j4) {
        this.f8993a = j3;
        this.f8994b = j4;
        if (j3 < 0) {
            throw new IllegalArgumentException(("stopTimeout(" + j3 + " ms) cannot be negative").toString());
        }
        if (j4 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("replayExpiration(" + j4 + " ms) cannot be negative").toString());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1042M) {
            C1042M c1042m = (C1042M) obj;
            if (this.f8993a == c1042m.f8993a && this.f8994b == c1042m.f8994b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f8994b) + (Long.hashCode(this.f8993a) * 31);
    }

    public final String toString() {
        T1.b bVar = new T1.b(2);
        long j3 = this.f8993a;
        if (j3 > 0) {
            bVar.add("stopTimeout=" + j3 + "ms");
        }
        long j4 = this.f8994b;
        if (j4 < Long.MAX_VALUE) {
            bVar.add("replayExpiration=" + j4 + "ms");
        }
        return "SharingStarted.WhileSubscribed(" + S1.l.P0(O2.l.P(bVar), null, null, null, null, 63) + ')';
    }
}
