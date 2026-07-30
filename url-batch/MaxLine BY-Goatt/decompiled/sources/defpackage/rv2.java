package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class rv2 {
    public static final rv2 c = new rv2(mi2.l(0), mi2.l(0));
    public final long a;
    public final long b;

    public rv2(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rv2)) {
            return false;
        }
        rv2 rv2Var = (rv2) obj;
        return sw2.a(this.a, rv2Var.a) && sw2.a(this.b, rv2Var.b);
    }

    public final int hashCode() {
        tw2[] tw2VarArr = sw2.b;
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "TextIndent(firstLine=" + ((Object) sw2.d(this.a)) + ", restLine=" + ((Object) sw2.d(this.b)) + ')';
    }
}
