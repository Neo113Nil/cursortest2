package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class tz2 extends l0 {
    public int o;
    public Object[] p;
    public boolean q;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public tz2(Object[] objArr, int i, int i2, int i3) {
        super(i, i2);
        this.o = i3;
        Object[] objArr2 = new Object[i3];
        this.p = objArr2;
        ?? r5 = i == i2 ? 1 : 0;
        this.q = r5;
        objArr2[0] = objArr;
        b(i - r5, 1);
    }

    public final Object a() {
        int i = this.m & 31;
        Object obj = this.p[this.o - 1];
        obj.getClass();
        return ((Object[]) obj)[i];
    }

    public final void b(int i, int i2) {
        int i3 = (this.o - i2) * 5;
        while (i2 < this.o) {
            Object[] objArr = this.p;
            Object obj = objArr[i2 - 1];
            obj.getClass();
            objArr[i2] = ((Object[]) obj)[gk2.e(i, i3)];
            i3 -= 5;
            i2++;
        }
    }

    public final void c(int i) {
        int i2 = 0;
        while (gk2.e(this.m, i2) == i) {
            i2 += 5;
        }
        if (i2 > 0) {
            b(this.m, ((this.o - 1) - (i2 / 5)) + 1);
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            b71.f();
            return null;
        }
        Object a = a();
        int i = this.m + 1;
        this.m = i;
        if (i == this.n) {
            this.q = true;
            return a;
        }
        c(0);
        return a;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            b71.f();
            return null;
        }
        this.m--;
        if (this.q) {
            this.q = false;
            return a();
        }
        c(31);
        return a();
    }
}
