package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class y01 {
    public final x01 a;
    public final int b;

    public y01(x01 x01Var, int i) {
        this.a = x01Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y01)) {
            return false;
        }
        y01 y01Var = (y01) obj;
        return this.a.equals(y01Var.a) && this.b == y01Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImageVectorEntry(imageVector=");
        sb.append(this.a);
        sb.append(", configFlags=");
        return q40.o(sb, this.b, ')');
    }
}
