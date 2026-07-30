package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ah2 {
    public final k92 a;
    public final int b;
    public final long c;

    public ah2(k92 k92Var, int i, long j) {
        this.a = k92Var;
        this.b = i;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ah2)) {
            return false;
        }
        ah2 ah2Var = (ah2) obj;
        return this.a == ah2Var.a && this.b == ah2Var.b && this.c == ah2Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + q40.e(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "AnchorInfo(direction=" + this.a + ", offset=" + this.b + ", selectableId=" + this.c + ')';
    }
}
