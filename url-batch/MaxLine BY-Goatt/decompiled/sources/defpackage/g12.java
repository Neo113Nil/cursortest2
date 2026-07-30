package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class g12 extends l0 {
    public final Object[] o;
    public final tz2 p;

    public g12(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        super(i, i2);
        this.o = objArr2;
        int i4 = (i2 - 1) & (-32);
        this.p = new tz2(objArr, i > i4 ? i4 : i, i4, i3);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            b71.f();
            return null;
        }
        tz2 tz2Var = this.p;
        if (tz2Var.hasNext()) {
            this.m++;
            return tz2Var.next();
        }
        int i = this.m;
        this.m = i + 1;
        return this.o[i - tz2Var.n];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            b71.f();
            return null;
        }
        int i = this.m;
        tz2 tz2Var = this.p;
        int i2 = tz2Var.n;
        if (i <= i2) {
            this.m = i - 1;
            return tz2Var.previous();
        }
        int i3 = i - 1;
        this.m = i3;
        return this.o[i3 - i2];
    }
}
