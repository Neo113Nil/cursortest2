package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ul2 {
    public final int a;
    public final int b;
    public final int c;

    public ul2(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ul2)) {
            return false;
        }
        ul2 ul2Var = (ul2) obj;
        return this.a == ul2Var.a && this.b == ul2Var.b && this.c == ul2Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + q40.e(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return "Slide(image=" + this.a + ", titleRes=" + this.b + ", bodyRes=" + this.c + ")";
    }
}
