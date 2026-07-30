package defpackage;

import java.util.Arrays;
import java.util.ListIterator;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class tw0 extends j0 {
    public final Object[] e;
    public final Object[] g;
    public final int h;
    public final int i;

    public tw0(Object[] objArr, Object[] objArr2, int i, int i2) {
        this.e = objArr;
        this.g = objArr2;
        this.h = i;
        this.i = i2;
        if (!(a() > 32)) {
            cy0.a("Trie-based persistent vector should have at least 33 elements, got " + a());
        }
        int length = objArr2.length;
    }

    public static Object[] j(Object[] objArr, int i, int i2, Object obj, l90 l90Var) {
        int z = t80.z(i2, i);
        if (i == 0) {
            Object[] copyOf = z == 0 ? new Object[32] : Arrays.copyOf(objArr, 32);
            w9.c(objArr, copyOf, z + 1, z, 31);
            l90Var.d = objArr[31];
            copyOf[z] = obj;
            return copyOf;
        }
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        int i3 = i - 5;
        Object obj2 = objArr[z];
        obj2.getClass();
        copyOf2[z] = j((Object[]) obj2, i3, i2, obj, l90Var);
        while (true) {
            z++;
            if (z >= 32 || copyOf2[z] == null) {
                break;
            }
            Object obj3 = objArr[z];
            obj3.getClass();
            copyOf2[z] = j((Object[]) obj3, i3, 0, l90Var.d, l90Var);
        }
        return copyOf2;
    }

    public static Object[] l(Object[] objArr, int i, int i2, l90 l90Var) {
        Object[] l;
        int z = t80.z(i2, i);
        if (i == 5) {
            l90Var.d = objArr[z];
            l = null;
        } else {
            Object obj = objArr[z];
            obj.getClass();
            l = l((Object[]) obj, i - 5, i2, l90Var);
        }
        if (l == null && z == 0) {
            return null;
        }
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        copyOf[z] = l;
        return copyOf;
    }

    public static Object[] r(Object[] objArr, int i, int i2, Object obj) {
        int z = t80.z(i2, i);
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        if (i == 0) {
            copyOf[z] = obj;
            return copyOf;
        }
        Object obj2 = copyOf[z];
        obj2.getClass();
        copyOf[z] = r((Object[]) obj2, i - 5, i2, obj);
        return copyOf;
    }

    @Override // defpackage.m
    public final int a() {
        return this.h;
    }

    @Override // defpackage.j0
    public final j0 b(int i, Object obj) {
        int i2 = this.h;
        y90.k(i, i2);
        if (i == i2) {
            return d(obj);
        }
        int q = q();
        Object[] objArr = this.e;
        if (i >= q) {
            return k(objArr, i - q, obj);
        }
        l90 l90Var = new l90(null);
        return k(j(objArr, this.i, i, obj, l90Var), 0, l90Var.d);
    }

    @Override // defpackage.j0
    public final j0 d(Object obj) {
        int q = q();
        int i = this.h;
        int i2 = i - q;
        Object[] objArr = this.e;
        Object[] objArr2 = this.g;
        if (i2 < 32) {
            Object[] copyOf = Arrays.copyOf(objArr2, 32);
            copyOf[i2] = obj;
            return new tw0(objArr, copyOf, i + 1, this.i);
        }
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj;
        return m(objArr, objArr2, objArr3);
    }

    @Override // defpackage.j0
    public final uw0 f() {
        return new uw0(this, this.e, this.g, this.i);
    }

    @Override // defpackage.j0
    public final j0 g(i0 i0Var) {
        uw0 uw0Var = new uw0(this, this.e, this.g, this.i);
        uw0Var.z(i0Var);
        return uw0Var.d();
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object[] objArr;
        y90.c(i, a());
        if (q() <= i) {
            objArr = this.g;
        } else {
            Object[] objArr2 = this.e;
            for (int i2 = this.i; i2 > 0; i2 -= 5) {
                Object[] objArr3 = objArr2[t80.z(i, i2)];
                objArr3.getClass();
                objArr2 = objArr3;
            }
            objArr = objArr2;
        }
        return objArr[i & 31];
    }

    @Override // defpackage.j0
    public final j0 h(int i) {
        y90.c(i, a());
        int q = q();
        int i2 = this.i;
        Object[] objArr = this.e;
        return i >= q ? p(objArr, q, i2, i - q) : p(o(objArr, i2, i, new l90(this.g[0])), q, i2, 0);
    }

    @Override // defpackage.j0
    public final j0 i(int i, Object obj) {
        int i2 = this.h;
        y90.c(i, i2);
        int q = q();
        Object[] objArr = this.e;
        Object[] objArr2 = this.g;
        int i3 = this.i;
        if (q > i) {
            return new tw0(r(objArr, i3, i, obj), objArr2, i2, i3);
        }
        Object[] copyOf = Arrays.copyOf(objArr2, 32);
        copyOf[i & 31] = obj;
        return new tw0(objArr, copyOf, i2, i3);
    }

    public final tw0 k(Object[] objArr, int i, Object obj) {
        int q = q();
        int i2 = this.h;
        int i3 = i2 - q;
        Object[] objArr2 = this.g;
        Object[] copyOf = Arrays.copyOf(objArr2, 32);
        if (i3 < 32) {
            w9.c(objArr2, copyOf, i + 1, i, i3);
            copyOf[i] = obj;
            return new tw0(objArr, copyOf, i2 + 1, this.i);
        }
        Object obj2 = objArr2[31];
        w9.c(objArr2, copyOf, i + 1, i, i3 - 1);
        copyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj2;
        return m(objArr, copyOf, objArr3);
    }

    @Override // defpackage.w, java.util.List
    public final ListIterator listIterator(int i) {
        y90.k(i, this.h);
        return new vw0(this.e, this.g, i, this.h, (this.i / 5) + 1);
    }

    public final tw0 m(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.h;
        int i2 = i >> 5;
        int i3 = this.i;
        if (i2 <= (1 << i3)) {
            return new tw0(n(i3, objArr, objArr2), objArr3, i + 1, i3);
        }
        Object[] objArr4 = new Object[32];
        objArr4[0] = objArr;
        int i4 = i3 + 5;
        return new tw0(n(i4, objArr4, objArr2), objArr3, i + 1, i4);
    }

    public final Object[] n(int i, Object[] objArr, Object[] objArr2) {
        int z = t80.z(a() - 1, i);
        Object[] copyOf = objArr != null ? Arrays.copyOf(objArr, 32) : new Object[32];
        if (i == 5) {
            copyOf[z] = objArr2;
            return copyOf;
        }
        copyOf[z] = n(i - 5, (Object[]) copyOf[z], objArr2);
        return copyOf;
    }

    public final Object[] o(Object[] objArr, int i, int i2, l90 l90Var) {
        int z = t80.z(i2, i);
        if (i == 0) {
            Object[] copyOf = z == 0 ? new Object[32] : Arrays.copyOf(objArr, 32);
            w9.c(objArr, copyOf, z, z + 1, 32);
            copyOf[31] = l90Var.d;
            l90Var.d = objArr[z];
            return copyOf;
        }
        int z2 = objArr[31] == null ? t80.z(q() - 1, i) : 31;
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        int i3 = i - 5;
        int i4 = z + 1;
        if (i4 <= z2) {
            while (true) {
                Object obj = copyOf2[z2];
                obj.getClass();
                copyOf2[z2] = o((Object[]) obj, i3, 0, l90Var);
                if (z2 == i4) {
                    break;
                }
                z2--;
            }
        }
        Object obj2 = copyOf2[z];
        obj2.getClass();
        copyOf2[z] = o((Object[]) obj2, i3, i2, l90Var);
        return copyOf2;
    }

    public final j0 p(Object[] objArr, int i, int i2, int i3) {
        int i4 = this.h - i;
        if (i4 != 1) {
            Object[] objArr2 = this.g;
            Object[] copyOf = Arrays.copyOf(objArr2, 32);
            int i5 = i4 - 1;
            if (i3 < i5) {
                w9.c(objArr2, copyOf, i3, i3 + 1, i4);
            }
            copyOf[i5] = null;
            return new tw0(objArr, copyOf, (i + i4) - 1, i2);
        }
        if (i2 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
            }
            return new eb1(objArr);
        }
        l90 l90Var = new l90(null);
        Object[] l = l(objArr, i2, i - 1, l90Var);
        l.getClass();
        Object obj = l90Var.d;
        obj.getClass();
        Object[] objArr3 = (Object[]) obj;
        if (l[1] != null) {
            return new tw0(l, objArr3, i, i2);
        }
        Object obj2 = l[0];
        obj2.getClass();
        return new tw0((Object[]) obj2, objArr3, i, i2 - 5);
    }

    public final int q() {
        return (this.h - 1) & (-32);
    }
}
