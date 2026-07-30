package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class za1 {
    public final int a;
    public final int b;

    public za1(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (i < 0) {
            lh.e("negative start index");
            throw null;
        }
        if (i2 >= i) {
            return;
        }
        lh.e("end index greater than start");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof za1)) {
            return false;
        }
        za1 za1Var = (za1) obj;
        return this.a == za1Var.a && this.b == za1Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Interval(start=");
        sb.append(this.a);
        sb.append(", end=");
        return q40.o(sb, this.b, ')');
    }
}
