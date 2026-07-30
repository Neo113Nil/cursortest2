package defpackage;

import java.util.ConcurrentModificationException;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class h12 extends l0 {
    public final f12 o;
    public int p;
    public tz2 q;
    public int r;

    public h12(f12 f12Var, int i) {
        super(i, f12Var.t);
        this.o = f12Var;
        this.p = f12Var.e();
        this.r = -1;
        b();
    }

    public final void a() {
        if (this.p != this.o.e()) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // defpackage.l0, java.util.ListIterator
    public final void add(Object obj) {
        a();
        int i = this.m;
        f12 f12Var = this.o;
        f12Var.add(i, obj);
        this.m++;
        this.n = f12Var.a();
        this.p = f12Var.e();
        this.r = -1;
        b();
    }

    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public final void b() {
        f12 f12Var = this.o;
        Object[] objArr = f12Var.r;
        if (objArr == null) {
            this.q = null;
            return;
        }
        int i = (f12Var.t - 1) & (-32);
        int i2 = this.m;
        if (i2 > i) {
            i2 = i;
        }
        int i3 = (f12Var.p / 5) + 1;
        tz2 tz2Var = this.q;
        if (tz2Var == null) {
            this.q = new tz2(objArr, i2, i, i3);
            return;
        }
        tz2Var.m = i2;
        tz2Var.n = i;
        tz2Var.o = i3;
        if (tz2Var.p.length < i3) {
            tz2Var.p = new Object[i3];
        }
        tz2Var.p[0] = objArr;
        ?? r0 = i2 == i ? 1 : 0;
        tz2Var.q = r0;
        tz2Var.b(i2 - r0, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        a();
        if (!hasNext()) {
            b71.f();
            return null;
        }
        int i = this.m;
        this.r = i;
        tz2 tz2Var = this.q;
        f12 f12Var = this.o;
        if (tz2Var == null) {
            Object[] objArr = f12Var.s;
            this.m = i + 1;
            return objArr[i];
        }
        if (tz2Var.hasNext()) {
            this.m++;
            return tz2Var.next();
        }
        Object[] objArr2 = f12Var.s;
        int i2 = this.m;
        this.m = i2 + 1;
        return objArr2[i2 - tz2Var.n];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        if (!hasPrevious()) {
            b71.f();
            return null;
        }
        int i = this.m;
        this.r = i - 1;
        tz2 tz2Var = this.q;
        f12 f12Var = this.o;
        if (tz2Var == null) {
            Object[] objArr = f12Var.s;
            int i2 = i - 1;
            this.m = i2;
            return objArr[i2];
        }
        int i3 = tz2Var.n;
        if (i <= i3) {
            this.m = i - 1;
            return tz2Var.previous();
        }
        Object[] objArr2 = f12Var.s;
        int i4 = i - 1;
        this.m = i4;
        return objArr2[i4 - i3];
    }

    @Override // defpackage.l0, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        a();
        int i = this.r;
        if (i == -1) {
            throw new IllegalStateException();
        }
        f12 f12Var = this.o;
        f12Var.b(i);
        int i2 = this.r;
        if (i2 < this.m) {
            this.m = i2;
        }
        this.n = f12Var.a();
        this.p = f12Var.e();
        this.r = -1;
        b();
    }

    @Override // defpackage.l0, java.util.ListIterator
    public final void set(Object obj) {
        a();
        int i = this.r;
        if (i == -1) {
            throw new IllegalStateException();
        }
        f12 f12Var = this.o;
        f12Var.set(i, obj);
        this.p = f12Var.e();
        b();
    }
}
