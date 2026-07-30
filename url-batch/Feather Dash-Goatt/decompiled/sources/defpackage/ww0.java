package defpackage;

import java.util.ConcurrentModificationException;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class ww0 extends x {
    public final uw0 g;
    public int h;
    public nj1 i;
    public int j;

    public ww0(uw0 uw0Var, int i) {
        super(i, uw0Var.l);
        this.g = uw0Var;
        this.h = uw0Var.f();
        this.j = -1;
        b();
    }

    public final void a() {
        if (this.h != this.g.f()) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // defpackage.x, java.util.ListIterator
    public final void add(Object obj) {
        a();
        int i = this.d;
        uw0 uw0Var = this.g;
        uw0Var.add(i, obj);
        this.d++;
        this.e = uw0Var.a();
        this.h = uw0Var.f();
        this.j = -1;
        b();
    }

    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public final void b() {
        uw0 uw0Var = this.g;
        Object[] objArr = uw0Var.j;
        if (objArr == null) {
            this.i = null;
            return;
        }
        int i = (uw0Var.l - 1) & (-32);
        int i2 = this.d;
        if (i2 > i) {
            i2 = i;
        }
        int i3 = (uw0Var.h / 5) + 1;
        nj1 nj1Var = this.i;
        if (nj1Var == null) {
            this.i = new nj1(objArr, i2, i, i3);
            return;
        }
        nj1Var.d = i2;
        nj1Var.e = i;
        nj1Var.g = i3;
        if (nj1Var.h.length < i3) {
            nj1Var.h = new Object[i3];
        }
        nj1Var.h[0] = objArr;
        ?? r0 = i2 == i ? 1 : 0;
        nj1Var.i = r0;
        nj1Var.b(i2 - r0, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        a();
        if (!hasNext()) {
            dd0.c();
            return null;
        }
        int i = this.d;
        this.j = i;
        nj1 nj1Var = this.i;
        uw0 uw0Var = this.g;
        if (nj1Var == null) {
            Object[] objArr = uw0Var.k;
            this.d = i + 1;
            return objArr[i];
        }
        if (nj1Var.hasNext()) {
            this.d++;
            return nj1Var.next();
        }
        Object[] objArr2 = uw0Var.k;
        int i2 = this.d;
        this.d = i2 + 1;
        return objArr2[i2 - nj1Var.e];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        if (!hasPrevious()) {
            dd0.c();
            return null;
        }
        int i = this.d;
        this.j = i - 1;
        nj1 nj1Var = this.i;
        uw0 uw0Var = this.g;
        if (nj1Var == null) {
            Object[] objArr = uw0Var.k;
            int i2 = i - 1;
            this.d = i2;
            return objArr[i2];
        }
        int i3 = nj1Var.e;
        if (i <= i3) {
            this.d = i - 1;
            return nj1Var.previous();
        }
        Object[] objArr2 = uw0Var.k;
        int i4 = i - 1;
        this.d = i4;
        return objArr2[i4 - i3];
    }

    @Override // defpackage.x, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        a();
        int i = this.j;
        if (i == -1) {
            throw new IllegalStateException();
        }
        uw0 uw0Var = this.g;
        uw0Var.b(i);
        int i2 = this.j;
        if (i2 < this.d) {
            this.d = i2;
        }
        this.e = uw0Var.a();
        this.h = uw0Var.f();
        this.j = -1;
        b();
    }

    @Override // defpackage.x, java.util.ListIterator
    public final void set(Object obj) {
        a();
        int i = this.j;
        if (i == -1) {
            throw new IllegalStateException();
        }
        uw0 uw0Var = this.g;
        uw0Var.set(i, obj);
        this.h = uw0Var.f();
        b();
    }
}
