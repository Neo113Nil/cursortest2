package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class po2 {
    public final long a;
    public final long b;

    public po2(long j, long j2) {
        this.a = j;
        this.b = j2;
        if (j < 0) {
            ch2.i("stopTimeout(", j, " ms) cannot be negative");
            throw null;
        }
        if (j2 >= 0) {
            return;
        }
        ch2.i("replayExpiration(", j2, " ms) cannot be negative");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof po2)) {
            return false;
        }
        po2 po2Var = (po2) obj;
        return this.a == po2Var.a && this.b == po2Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        le1 le1Var = new le1(2);
        long j = this.a;
        if (j > 0) {
            le1Var.add("stopTimeout=" + j + "ms");
        }
        long j2 = this.b;
        if (j2 < Long.MAX_VALUE) {
            le1Var.add("replayExpiration=" + j2 + "ms");
        }
        return in1.m(new StringBuilder("SharingStarted.WhileSubscribed("), zv.A(pv.a(le1Var), null, null, null, null, 63), ')');
    }
}
