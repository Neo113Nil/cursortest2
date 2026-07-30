package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class bh1 {
    public static final bh1 c = new bh1(t80.x(0), t80.x(0));
    public final long a;
    public final long b;

    public bh1(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bh1)) {
            return false;
        }
        bh1 bh1Var = (bh1) obj;
        return wh1.a(this.a, bh1Var.a) && wh1.a(this.b, bh1Var.b);
    }

    public final int hashCode() {
        xh1[] xh1VarArr = wh1.b;
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "TextIndent(firstLine=" + ((Object) wh1.d(this.a)) + ", restLine=" + ((Object) wh1.d(this.b)) + ')';
    }
}
