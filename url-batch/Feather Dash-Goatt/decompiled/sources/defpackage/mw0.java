package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class mw0 implements Iterator, yb0 {
    public final pj1[] d;
    public int e;
    public boolean g = true;

    public mw0(oj1 oj1Var, pj1[] pj1VarArr) {
        this.d = pj1VarArr;
        pj1VarArr[0].a(oj1Var.d, Integer.bitCount(oj1Var.a) * 2, 0);
        this.e = 0;
        a();
    }

    public final void a() {
        int i = this.e;
        pj1[] pj1VarArr = this.d;
        pj1 pj1Var = pj1VarArr[i];
        if (pj1Var.g < pj1Var.e) {
            return;
        }
        while (-1 < i) {
            int b = b(i);
            if (b == -1) {
                pj1 pj1Var2 = pj1VarArr[i];
                int i2 = pj1Var2.g;
                Object[] objArr = pj1Var2.d;
                if (i2 < objArr.length) {
                    int length = objArr.length;
                    pj1Var2.g = i2 + 1;
                    b = b(i);
                }
            }
            if (b != -1) {
                this.e = b;
                return;
            }
            if (i > 0) {
                pj1 pj1Var3 = pj1VarArr[i - 1];
                int i3 = pj1Var3.g;
                int length2 = pj1Var3.d.length;
                pj1Var3.g = i3 + 1;
            }
            pj1VarArr[i].a(oj1.e.d, 0, 0);
            i--;
        }
        this.g = false;
    }

    public final int b(int i) {
        pj1[] pj1VarArr = this.d;
        pj1 pj1Var = pj1VarArr[i];
        int i2 = pj1Var.g;
        if (i2 < pj1Var.e) {
            return i;
        }
        Object[] objArr = pj1Var.d;
        if (i2 >= objArr.length) {
            return -1;
        }
        int length = objArr.length;
        Object obj = objArr[i2];
        obj.getClass();
        oj1 oj1Var = (oj1) obj;
        if (i == 6) {
            pj1 pj1Var2 = pj1VarArr[i + 1];
            Object[] objArr2 = oj1Var.d;
            pj1Var2.a(objArr2, objArr2.length, 0);
        } else {
            pj1VarArr[i + 1].a(oj1Var.d, Integer.bitCount(oj1Var.a) * 2, 0);
        }
        return b(i + 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.g;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!this.g) {
            dd0.c();
            return null;
        }
        Object next = this.d[this.e].next();
        a();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
