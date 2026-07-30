package k0;

import java.util.Arrays;
import java.util.ListIterator;
import r6.k;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class e extends c {

    /* renamed from: f, reason: collision with root package name */
    public final Object[] f5298f;

    /* renamed from: g, reason: collision with root package name */
    public final Object[] f5299g;

    /* renamed from: h, reason: collision with root package name */
    public final int f5300h;

    /* renamed from: i, reason: collision with root package name */
    public final int f5301i;

    public e(Object[] objArr, Object[] objArr2, int i7, int i8) {
        this.f5298f = objArr;
        this.f5299g = objArr2;
        this.f5300h = i7;
        this.f5301i = i8;
        if (a() > 32) {
            int length = objArr2.length;
            return;
        }
        g0.d.R("Trie-based persistent vector should have at least 33 elements, got " + a());
        throw null;
    }

    public static Object[] B(Object[] objArr, int i7, int i8, Object obj, c3.h hVar) {
        Object[] copyOf;
        int f02 = j1.c.f0(i8, i7);
        if (i7 == 0) {
            if (f02 == 0) {
                copyOf = new Object[32];
            } else {
                copyOf = Arrays.copyOf(objArr, 32);
                k.e(copyOf, "copyOf(this, newSize)");
            }
            e6.k.X(objArr, copyOf, f02 + 1, f02, 31);
            hVar.f1653a = objArr[31];
            copyOf[f02] = obj;
            return copyOf;
        }
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        k.e(copyOf2, "copyOf(this, newSize)");
        int i9 = i7 - 5;
        Object obj2 = objArr[f02];
        k.d(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        copyOf2[f02] = B((Object[]) obj2, i9, i8, obj, hVar);
        while (true) {
            f02++;
            if (f02 >= 32 || copyOf2[f02] == null) {
                break;
            }
            Object obj3 = objArr[f02];
            k.d(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            copyOf2[f02] = B((Object[]) obj3, i9, 0, hVar.f1653a, hVar);
        }
        return copyOf2;
    }

    public static Object[] D(Object[] objArr, int i7, int i8, c3.h hVar) {
        Object[] D;
        int f02 = j1.c.f0(i8, i7);
        if (i7 == 5) {
            hVar.f1653a = objArr[f02];
            D = null;
        } else {
            Object obj = objArr[f02];
            k.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            D = D((Object[]) obj, i7 - 5, i8, hVar);
        }
        if (D == null && f02 == 0) {
            return null;
        }
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        k.e(copyOf, "copyOf(this, newSize)");
        copyOf[f02] = D;
        return copyOf;
    }

    public static Object[] J(int i7, int i8, Object obj, Object[] objArr) {
        int f02 = j1.c.f0(i8, i7);
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        k.e(copyOf, "copyOf(this, newSize)");
        if (i7 == 0) {
            copyOf[f02] = obj;
            return copyOf;
        }
        Object obj2 = copyOf[f02];
        k.d(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        copyOf[f02] = J(i7 - 5, i8, obj, (Object[]) obj2);
        return copyOf;
    }

    @Override // k0.c
    public final c A(int i7, Object obj) {
        int i8 = this.f5300h;
        a.a.l(i7, i8);
        int I = I();
        Object[] objArr = this.f5298f;
        Object[] objArr2 = this.f5299g;
        int i9 = this.f5301i;
        if (I > i7) {
            return new e(J(i9, i7, obj, objArr), objArr2, i8, i9);
        }
        Object[] copyOf = Arrays.copyOf(objArr2, 32);
        k.e(copyOf, "copyOf(this, newSize)");
        copyOf[i7 & 31] = obj;
        return new e(objArr, copyOf, i8, i9);
    }

    public final e C(Object[] objArr, int i7, Object obj) {
        int I = I();
        int i8 = this.f5300h;
        int i9 = i8 - I;
        Object[] objArr2 = this.f5299g;
        Object[] copyOf = Arrays.copyOf(objArr2, 32);
        k.e(copyOf, "copyOf(this, newSize)");
        if (i9 < 32) {
            e6.k.X(objArr2, copyOf, i7 + 1, i7, i9);
            copyOf[i7] = obj;
            return new e(objArr, copyOf, i8 + 1, this.f5301i);
        }
        Object obj2 = objArr2[31];
        e6.k.X(objArr2, copyOf, i7 + 1, i7, i9 - 1);
        copyOf[i7] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj2;
        return E(objArr, copyOf, objArr3);
    }

    public final e E(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i7 = this.f5300h;
        int i8 = i7 >> 5;
        int i9 = this.f5301i;
        if (i8 <= (1 << i9)) {
            return new e(F(i9, objArr, objArr2), objArr3, i7 + 1, i9);
        }
        Object[] objArr4 = new Object[32];
        objArr4[0] = objArr;
        int i10 = i9 + 5;
        return new e(F(i10, objArr4, objArr2), objArr3, i7 + 1, i10);
    }

    public final Object[] F(int i7, Object[] objArr, Object[] objArr2) {
        Object[] objArr3;
        int f02 = j1.c.f0(a() - 1, i7);
        if (objArr != null) {
            objArr3 = Arrays.copyOf(objArr, 32);
            k.e(objArr3, "copyOf(this, newSize)");
        } else {
            objArr3 = new Object[32];
        }
        if (i7 == 5) {
            objArr3[f02] = objArr2;
            return objArr3;
        }
        objArr3[f02] = F(i7 - 5, (Object[]) objArr3[f02], objArr2);
        return objArr3;
    }

    public final Object[] G(Object[] objArr, int i7, int i8, c3.h hVar) {
        Object[] copyOf;
        int f02 = j1.c.f0(i8, i7);
        if (i7 == 0) {
            if (f02 == 0) {
                copyOf = new Object[32];
            } else {
                copyOf = Arrays.copyOf(objArr, 32);
                k.e(copyOf, "copyOf(this, newSize)");
            }
            e6.k.X(objArr, copyOf, f02, f02 + 1, 32);
            copyOf[31] = hVar.f1653a;
            hVar.f1653a = objArr[f02];
            return copyOf;
        }
        int f03 = objArr[31] == null ? j1.c.f0(I() - 1, i7) : 31;
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        k.e(copyOf2, "copyOf(this, newSize)");
        int i9 = i7 - 5;
        int i10 = f02 + 1;
        if (i10 <= f03) {
            while (true) {
                Object obj = copyOf2[f03];
                k.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                copyOf2[f03] = G((Object[]) obj, i9, 0, hVar);
                if (f03 == i10) {
                    break;
                }
                f03--;
            }
        }
        Object obj2 = copyOf2[f02];
        k.d(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        copyOf2[f02] = G((Object[]) obj2, i9, i8, hVar);
        return copyOf2;
    }

    public final c H(Object[] objArr, int i7, int i8, int i9) {
        int i10 = this.f5300h - i7;
        if (i10 != 1) {
            Object[] objArr2 = this.f5299g;
            Object[] copyOf = Arrays.copyOf(objArr2, 32);
            k.e(copyOf, "copyOf(this, newSize)");
            int i11 = i10 - 1;
            if (i9 < i11) {
                e6.k.X(objArr2, copyOf, i9, i9 + 1, i10);
            }
            copyOf[i11] = null;
            return new e(objArr, copyOf, (i7 + i10) - 1, i8);
        }
        if (i8 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
                k.e(objArr, "copyOf(this, newSize)");
            }
            return new i(objArr);
        }
        c3.h hVar = new c3.h(null);
        Object[] D = D(objArr, i8, i7 - 1, hVar);
        k.c(D);
        Object obj = hVar.f1653a;
        k.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr3 = (Object[]) obj;
        if (D[1] != null) {
            return new e(D, objArr3, i7, i8);
        }
        Object obj2 = D[0];
        k.d(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        return new e((Object[]) obj2, objArr3, i7, i8 - 5);
    }

    public final int I() {
        return (this.f5300h - 1) & (-32);
    }

    @Override // e6.a
    public final int a() {
        return this.f5300h;
    }

    @Override // k0.c
    public final c g(int i7, Object obj) {
        int i8 = this.f5300h;
        a.a.n(i7, i8);
        if (i7 == i8) {
            return m(obj);
        }
        int I = I();
        Object[] objArr = this.f5298f;
        if (i7 >= I) {
            return C(objArr, i7 - I, obj);
        }
        c3.h hVar = new c3.h(null);
        return C(B(objArr, this.f5301i, i7, obj, hVar), 0, hVar.f1653a);
    }

    @Override // java.util.List
    public final Object get(int i7) {
        Object[] objArr;
        a.a.l(i7, a());
        if (I() <= i7) {
            objArr = this.f5299g;
        } else {
            objArr = this.f5298f;
            for (int i8 = this.f5301i; i8 > 0; i8 -= 5) {
                Object obj = objArr[j1.c.f0(i7, i8)];
                k.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr = (Object[]) obj;
            }
        }
        return objArr[i7 & 31];
    }

    @Override // e6.d, java.util.List
    public final ListIterator listIterator(int i7) {
        a.a.n(i7, this.f5300h);
        return new g(this.f5298f, this.f5299g, i7, this.f5300h, (this.f5301i / 5) + 1);
    }

    @Override // k0.c
    public final c m(Object obj) {
        int I = I();
        int i7 = this.f5300h;
        int i8 = i7 - I;
        Object[] objArr = this.f5298f;
        Object[] objArr2 = this.f5299g;
        if (i8 >= 32) {
            Object[] objArr3 = new Object[32];
            objArr3[0] = obj;
            return E(objArr, objArr2, objArr3);
        }
        Object[] copyOf = Arrays.copyOf(objArr2, 32);
        k.e(copyOf, "copyOf(this, newSize)");
        copyOf[i8] = obj;
        return new e(objArr, copyOf, i7 + 1, this.f5301i);
    }

    @Override // k0.c
    public final f x() {
        return new f(this, this.f5298f, this.f5299g, this.f5301i);
    }

    @Override // k0.c
    public final c y(b bVar) {
        f fVar = new f(this, this.f5298f, this.f5299g, this.f5301i);
        fVar.R(bVar);
        return fVar.m();
    }

    @Override // k0.c
    public final c z(int i7) {
        a.a.l(i7, this.f5300h);
        int I = I();
        Object[] objArr = this.f5298f;
        int i8 = this.f5301i;
        return i7 >= I ? H(objArr, I, i8, i7 - I) : H(G(objArr, i8, i7, new c3.h(this.f5299g[0])), I, i8, 0);
    }
}
