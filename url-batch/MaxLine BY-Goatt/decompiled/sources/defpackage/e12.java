package defpackage;

import java.util.Arrays;
import java.util.ListIterator;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class e12 extends w0 {
    public final Object[] n;
    public final Object[] o;
    public final int p;
    public final int q;

    public e12(Object[] objArr, Object[] objArr2, int i, int i2) {
        this.n = objArr;
        this.o = objArr2;
        this.p = i;
        this.q = i2;
        if (!(a() > 32)) {
            v32.a("Trie-based persistent vector should have at least 33 elements, got " + a());
        }
        int length = objArr2.length;
    }

    public static Object[] k(Object[] objArr, int i, int i2, Object obj, j31 j31Var) {
        int e = gk2.e(i2, i);
        if (i == 0) {
            Object[] copyOf = e == 0 ? new Object[32] : Arrays.copyOf(objArr, 32);
            ni.e(e + 1, e, 31, objArr, copyOf);
            j31Var.m = objArr[31];
            copyOf[e] = obj;
            return copyOf;
        }
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        int i3 = i - 5;
        Object obj2 = objArr[e];
        obj2.getClass();
        copyOf2[e] = k((Object[]) obj2, i3, i2, obj, j31Var);
        while (true) {
            e++;
            if (e >= 32 || copyOf2[e] == null) {
                break;
            }
            Object obj3 = objArr[e];
            obj3.getClass();
            copyOf2[e] = k((Object[]) obj3, i3, 0, j31Var.m, j31Var);
        }
        return copyOf2;
    }

    public static Object[] m(Object[] objArr, int i, int i2, j31 j31Var) {
        Object[] m;
        int e = gk2.e(i2, i);
        if (i == 5) {
            j31Var.m = objArr[e];
            m = null;
        } else {
            Object obj = objArr[e];
            obj.getClass();
            m = m((Object[]) obj, i - 5, i2, j31Var);
        }
        if (m == null && e == 0) {
            return null;
        }
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        copyOf[e] = m;
        return copyOf;
    }

    public static Object[] s(int i, int i2, Object obj, Object[] objArr) {
        int e = gk2.e(i2, i);
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        if (i == 0) {
            copyOf[e] = obj;
            return copyOf;
        }
        Object obj2 = copyOf[e];
        obj2.getClass();
        copyOf[e] = s(i - 5, i2, obj, (Object[]) obj2);
        return copyOf;
    }

    @Override // defpackage.b0
    public final int a() {
        return this.p;
    }

    @Override // defpackage.w0
    public final w0 b(int i, Object obj) {
        int i2 = this.p;
        yj1.n(i, i2);
        if (i == i2) {
            return c(obj);
        }
        int r = r();
        Object[] objArr = this.n;
        if (i >= r) {
            return l(i - r, obj, objArr);
        }
        j31 j31Var = new j31(null);
        return l(0, j31Var.m, k(objArr, this.q, i, obj, j31Var));
    }

    @Override // defpackage.w0
    public final w0 c(Object obj) {
        int r = r();
        int i = this.p;
        int i2 = i - r;
        Object[] objArr = this.n;
        Object[] objArr2 = this.o;
        if (i2 < 32) {
            Object[] copyOf = Arrays.copyOf(objArr2, 32);
            copyOf[i2] = obj;
            return new e12(objArr, copyOf, i + 1, this.q);
        }
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj;
        return n(objArr, objArr2, objArr3);
    }

    @Override // defpackage.w0
    public final f12 e() {
        return new f12(this, this.n, this.o, this.q);
    }

    @Override // defpackage.w0
    public final w0 f(v0 v0Var) {
        f12 f12Var = new f12(this, this.n, this.o, this.q);
        f12Var.A(v0Var);
        return f12Var.c();
    }

    @Override // defpackage.w0
    public final w0 g(int i) {
        yj1.m(i, a());
        int r = r();
        int i2 = this.q;
        Object[] objArr = this.n;
        return i >= r ? q(objArr, r, i2, i - r) : q(p(objArr, i2, i, new j31(this.o[0])), r, i2, 0);
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object[] objArr;
        yj1.m(i, a());
        if (r() <= i) {
            objArr = this.o;
        } else {
            Object[] objArr2 = this.n;
            for (int i2 = this.q; i2 > 0; i2 -= 5) {
                Object[] objArr3 = objArr2[gk2.e(i, i2)];
                objArr3.getClass();
                objArr2 = objArr3;
            }
            objArr = objArr2;
        }
        return objArr[i & 31];
    }

    @Override // defpackage.w0
    public final w0 j(int i, Object obj) {
        int i2 = this.p;
        yj1.m(i, i2);
        int r = r();
        Object[] objArr = this.n;
        Object[] objArr2 = this.o;
        int i3 = this.q;
        if (r > i) {
            return new e12(s(i3, i, obj, objArr), objArr2, i2, i3);
        }
        Object[] copyOf = Arrays.copyOf(objArr2, 32);
        copyOf[i & 31] = obj;
        return new e12(objArr, copyOf, i2, i3);
    }

    public final e12 l(int i, Object obj, Object[] objArr) {
        int r = r();
        int i2 = this.p;
        int i3 = i2 - r;
        Object[] objArr2 = this.o;
        Object[] copyOf = Arrays.copyOf(objArr2, 32);
        if (i3 < 32) {
            ni.e(i + 1, i, i3, objArr2, copyOf);
            copyOf[i] = obj;
            return new e12(objArr, copyOf, i2 + 1, this.q);
        }
        Object obj2 = objArr2[31];
        ni.e(i + 1, i, i3 - 1, objArr2, copyOf);
        copyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj2;
        return n(objArr, copyOf, objArr3);
    }

    @Override // defpackage.h0, java.util.List
    public final ListIterator listIterator(int i) {
        yj1.n(i, this.p);
        return new g12(i, this.p, (this.q / 5) + 1, this.n, this.o);
    }

    public final e12 n(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.p;
        int i2 = i >> 5;
        int i3 = this.q;
        if (i2 <= (1 << i3)) {
            return new e12(o(i3, objArr, objArr2), objArr3, i + 1, i3);
        }
        Object[] objArr4 = new Object[32];
        objArr4[0] = objArr;
        int i4 = i3 + 5;
        return new e12(o(i4, objArr4, objArr2), objArr3, i + 1, i4);
    }

    public final Object[] o(int i, Object[] objArr, Object[] objArr2) {
        int e = gk2.e(a() - 1, i);
        Object[] copyOf = objArr != null ? Arrays.copyOf(objArr, 32) : new Object[32];
        if (i == 5) {
            copyOf[e] = objArr2;
            return copyOf;
        }
        copyOf[e] = o(i - 5, (Object[]) copyOf[e], objArr2);
        return copyOf;
    }

    public final Object[] p(Object[] objArr, int i, int i2, j31 j31Var) {
        int e = gk2.e(i2, i);
        if (i == 0) {
            Object[] copyOf = e == 0 ? new Object[32] : Arrays.copyOf(objArr, 32);
            ni.e(e, e + 1, 32, objArr, copyOf);
            copyOf[31] = j31Var.m;
            j31Var.m = objArr[e];
            return copyOf;
        }
        int e2 = objArr[31] == null ? gk2.e(r() - 1, i) : 31;
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        int i3 = i - 5;
        int i4 = e + 1;
        if (i4 <= e2) {
            while (true) {
                Object obj = copyOf2[e2];
                obj.getClass();
                copyOf2[e2] = p((Object[]) obj, i3, 0, j31Var);
                if (e2 == i4) {
                    break;
                }
                e2--;
            }
        }
        Object obj2 = copyOf2[e];
        obj2.getClass();
        copyOf2[e] = p((Object[]) obj2, i3, i2, j31Var);
        return copyOf2;
    }

    public final w0 q(Object[] objArr, int i, int i2, int i3) {
        int i4 = this.p - i;
        if (i4 != 1) {
            Object[] objArr2 = this.o;
            Object[] copyOf = Arrays.copyOf(objArr2, 32);
            int i5 = i4 - 1;
            if (i3 < i5) {
                ni.e(i3, i3 + 1, i4, objArr2, copyOf);
            }
            copyOf[i5] = null;
            return new e12(objArr, copyOf, (i + i4) - 1, i2);
        }
        if (i2 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
            }
            return new am2(objArr);
        }
        j31 j31Var = new j31(null);
        Object[] m = m(objArr, i2, i - 1, j31Var);
        m.getClass();
        Object obj = j31Var.m;
        obj.getClass();
        Object[] objArr3 = (Object[]) obj;
        if (m[1] != null) {
            return new e12(m, objArr3, i, i2);
        }
        Object obj2 = m[0];
        obj2.getClass();
        return new e12((Object[]) obj2, objArr3, i, i2 - 5);
    }

    public final int r() {
        return (this.p - 1) & (-32);
    }
}
