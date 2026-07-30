package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class x32 extends s03 {
    public final Object p;
    public final long q;

    public x32(long j, Object obj) {
        this.p = obj;
        this.q = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x32)) {
            return false;
        }
        x32 x32Var = (x32) obj;
        return this.p.equals(x32Var.p) && this.q == x32Var.q;
    }

    public final int hashCode() {
        return Long.hashCode(this.q) + (this.p.hashCode() * 31);
    }

    public final String toString() {
        return "PredictiveBackHandlerInfo(owner=" + this.p + ", compositeKey=" + this.q + ')';
    }
}
