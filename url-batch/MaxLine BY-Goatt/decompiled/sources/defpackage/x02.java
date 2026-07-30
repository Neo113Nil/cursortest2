package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class x02 implements Iterator, k71 {
    public final vz2[] m;
    public int n;
    public boolean o = true;

    public x02(uz2 uz2Var, vz2[] vz2VarArr) {
        this.m = vz2VarArr;
        vz2VarArr[0].a(uz2Var.d, Integer.bitCount(uz2Var.a) * 2, 0);
        this.n = 0;
        a();
    }

    public final void a() {
        int i = this.n;
        vz2[] vz2VarArr = this.m;
        vz2 vz2Var = vz2VarArr[i];
        if (vz2Var.o < vz2Var.n) {
            return;
        }
        while (-1 < i) {
            int b = b(i);
            if (b == -1) {
                vz2 vz2Var2 = vz2VarArr[i];
                int i2 = vz2Var2.o;
                Object[] objArr = vz2Var2.m;
                if (i2 < objArr.length) {
                    int length = objArr.length;
                    vz2Var2.o = i2 + 1;
                    b = b(i);
                }
            }
            if (b != -1) {
                this.n = b;
                return;
            }
            if (i > 0) {
                vz2 vz2Var3 = vz2VarArr[i - 1];
                int i3 = vz2Var3.o;
                int length2 = vz2Var3.m.length;
                vz2Var3.o = i3 + 1;
            }
            vz2VarArr[i].a(uz2.e.d, 0, 0);
            i--;
        }
        this.o = false;
    }

    public final int b(int i) {
        vz2[] vz2VarArr = this.m;
        vz2 vz2Var = vz2VarArr[i];
        int i2 = vz2Var.o;
        if (i2 < vz2Var.n) {
            return i;
        }
        Object[] objArr = vz2Var.m;
        if (i2 >= objArr.length) {
            return -1;
        }
        int length = objArr.length;
        Object obj = objArr[i2];
        obj.getClass();
        uz2 uz2Var = (uz2) obj;
        if (i == 6) {
            vz2 vz2Var2 = vz2VarArr[i + 1];
            Object[] objArr2 = uz2Var.d;
            vz2Var2.a(objArr2, objArr2.length, 0);
        } else {
            vz2VarArr[i + 1].a(uz2Var.d, Integer.bitCount(uz2Var.a) * 2, 0);
        }
        return b(i + 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.o;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!this.o) {
            b71.f();
            return null;
        }
        Object next = this.m[this.n].next();
        a();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
