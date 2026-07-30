package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class bb1 implements ol, Iterable, yb0 {
    public final ab1 d;
    public final int e;
    public final int g;

    public bb1(ab1 ab1Var, int i, int i2) {
        this.d = ab1Var;
        this.e = i;
        this.g = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bb1)) {
            return false;
        }
        bb1 bb1Var = (bb1) obj;
        return bb1Var.e == this.e && bb1Var.g == this.g && bb1Var.d == this.d;
    }

    public final int hashCode() {
        return (this.d.hashCode() * 31) + this.e;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        ab1 ab1Var = this.d;
        if (ab1Var.l != this.g) {
            cb1.e();
        }
        int i = this.e;
        ab1Var.g(i);
        return new s50(ab1Var, i + 1, ab1Var.d[(i * 5) + 3] + i);
    }
}
