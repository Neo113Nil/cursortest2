package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class s50 implements Iterator, yb0 {
    public final ab1 d;
    public final int e;
    public int g;
    public final int h;

    public s50(ab1 ab1Var, int i, int i2) {
        this.d = ab1Var;
        this.e = i2;
        this.g = i;
        this.h = ab1Var.l;
        if (ab1Var.k) {
            cb1.e();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.g < this.e;
    }

    @Override // java.util.Iterator
    public final Object next() {
        ab1 ab1Var = this.d;
        int i = ab1Var.l;
        int i2 = this.h;
        if (i != i2) {
            cb1.e();
        }
        int i3 = this.g;
        this.g = ab1Var.d[(i3 * 5) + 3] + i3;
        return new bb1(ab1Var, i3, i2);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
