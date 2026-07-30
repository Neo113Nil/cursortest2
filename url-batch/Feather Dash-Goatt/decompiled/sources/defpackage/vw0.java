package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class vw0 extends x {
    public final Object[] g;
    public final nj1 h;

    public vw0(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        super(i, i2);
        this.g = objArr2;
        int i4 = (i2 - 1) & (-32);
        this.h = new nj1(objArr, i > i4 ? i4 : i, i4, i3);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            dd0.c();
            return null;
        }
        nj1 nj1Var = this.h;
        if (nj1Var.hasNext()) {
            this.d++;
            return nj1Var.next();
        }
        int i = this.d;
        this.d = i + 1;
        return this.g[i - nj1Var.e];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            dd0.c();
            return null;
        }
        int i = this.d;
        nj1 nj1Var = this.h;
        int i2 = nj1Var.e;
        if (i <= i2) {
            this.d = i - 1;
            return nj1Var.previous();
        }
        int i3 = i - 1;
        this.d = i3;
        return this.g[i3 - i2];
    }
}
