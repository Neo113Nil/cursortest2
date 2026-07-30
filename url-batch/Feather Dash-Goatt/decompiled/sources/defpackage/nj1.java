package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class nj1 extends x {
    public int g;
    public Object[] h;
    public boolean i;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public nj1(Object[] objArr, int i, int i2, int i3) {
        super(i, i2);
        this.g = i3;
        Object[] objArr2 = new Object[i3];
        this.h = objArr2;
        ?? r5 = i == i2 ? 1 : 0;
        this.i = r5;
        objArr2[0] = objArr;
        b(i - r5, 1);
    }

    public final Object a() {
        int i = this.d & 31;
        Object obj = this.h[this.g - 1];
        obj.getClass();
        return ((Object[]) obj)[i];
    }

    public final void b(int i, int i2) {
        int i3 = (this.g - i2) * 5;
        while (i2 < this.g) {
            Object[] objArr = this.h;
            Object obj = objArr[i2 - 1];
            obj.getClass();
            objArr[i2] = ((Object[]) obj)[t80.z(i, i3)];
            i3 -= 5;
            i2++;
        }
    }

    public final void c(int i) {
        int i2 = 0;
        while (t80.z(this.d, i2) == i) {
            i2 += 5;
        }
        if (i2 > 0) {
            b(this.d, ((this.g - 1) - (i2 / 5)) + 1);
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            dd0.c();
            return null;
        }
        Object a = a();
        int i = this.d + 1;
        this.d = i;
        if (i == this.e) {
            this.i = true;
            return a;
        }
        c(0);
        return a;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            dd0.c();
            return null;
        }
        this.d--;
        if (this.i) {
            this.i = false;
            return a();
        }
        c(31);
        return a();
    }
}
