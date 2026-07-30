package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class kh2 {
    public final xw0 a;
    public final long b;
    public final int c;
    public final boolean d;

    public kh2(xw0 xw0Var, long j, int i, boolean z) {
        this.a = xw0Var;
        this.b = j;
        this.c = i;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kh2)) {
            return false;
        }
        kh2 kh2Var = (kh2) obj;
        return this.a == kh2Var.a && au1.b(this.b, kh2Var.b) && this.c == kh2Var.c && this.d == kh2Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((q40.u(this.c) + in1.h(this.a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionHandleInfo(handle=");
        sb.append(this.a);
        sb.append(", position=");
        sb.append((Object) au1.i(this.b));
        sb.append(", anchor=");
        int i = this.c;
        sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "Right" : "Middle" : "Left");
        sb.append(", visible=");
        sb.append(this.d);
        sb.append(')');
        return sb.toString();
    }
}
