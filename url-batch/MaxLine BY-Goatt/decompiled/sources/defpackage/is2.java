package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class is2 {
    public final String a;
    public final int b;
    public final x01 c;

    public is2(String str, int i, x01 x01Var) {
        this.a = str;
        this.b = i;
        this.c = x01Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof is2)) {
            return false;
        }
        is2 is2Var = (is2) obj;
        return this.a.equals(is2Var.a) && this.b == is2Var.b && this.c.equals(is2Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + q40.e(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "Tab(route=" + this.a + ", labelRes=" + this.b + ", icon=" + this.c + ")";
    }
}
