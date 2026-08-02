package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ggg {
    public final hel a;
    public final boolean b;
    public final long c;
    private final int d;

    public ggg(hel helVar, boolean z, long j, int i) {
        this.a = helVar;
        this.b = z;
        this.c = j;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ggg) {
            ggg gggVar = (ggg) obj;
            if (hnu.H(this.a, gggVar.a) && this.b == gggVar.b && this.c == gggVar.c) {
                int i = this.d;
                int i2 = gggVar.d;
                if (i == 0) {
                    throw null;
                }
                if (i == i2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        int i = this.d;
        a.D(i);
        int i2 = ((hashCode * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003;
        long j = this.c;
        return ((((int) (j ^ (j >>> 32))) ^ i2) * 1000003) ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        int i = this.d;
        String str = i != 1 ? i != 2 ? "null" : "NORMAL" : "MINI";
        long j = this.c;
        return "DebugDataRequest{acceptTypes=" + valueOf + ", allowPii=" + this.b + ", timeLimitMs=" + j + ", size=" + str + "}";
    }

    public ggg() {
        throw null;
    }
}
