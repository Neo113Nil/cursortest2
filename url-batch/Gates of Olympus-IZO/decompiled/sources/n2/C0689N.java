package n2;

import a.AbstractC0157a;

/* renamed from: n2.N, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0689N {

    /* renamed from: a, reason: collision with root package name */
    public final long f6310a;

    /* renamed from: b, reason: collision with root package name */
    public final long f6311b;

    public C0689N(long j3, long j4) {
        this.f6310a = j3;
        this.f6311b = j4;
        if (j3 < 0) {
            throw new IllegalArgumentException(("stopTimeout(" + j3 + " ms) cannot be negative").toString());
        }
        if (j4 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("replayExpiration(" + j4 + " ms) cannot be negative").toString());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0689N) {
            C0689N c0689n = (C0689N) obj;
            if (this.f6310a == c0689n.f6310a && this.f6311b == c0689n.f6311b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f6311b) + (Long.hashCode(this.f6310a) * 31);
    }

    public final String toString() {
        N1.c cVar = new N1.c(2);
        long j3 = this.f6310a;
        if (j3 > 0) {
            cVar.add("stopTimeout=" + j3 + "ms");
        }
        long j4 = this.f6311b;
        if (j4 < Long.MAX_VALUE) {
            cVar.add("replayExpiration=" + j4 + "ms");
        }
        return "SharingStarted.WhileSubscribed(" + M1.l.r0(AbstractC0157a.k(cVar), null, null, null, null, 63) + ')';
    }
}
