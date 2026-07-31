package M;

import I.C0089d;
import M1.B;
import java.util.Arrays;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class f extends c {

    /* renamed from: d, reason: collision with root package name */
    public final Object[] f2737d;

    /* renamed from: e, reason: collision with root package name */
    public final Object[] f2738e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2739f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2740g;

    public f(Object[] objArr, Object[] objArr2, int i3, int i4) {
        this.f2737d = objArr;
        this.f2738e = objArr2;
        this.f2739f = i3;
        this.f2740g = i4;
        if (b() > 32) {
            int length = objArr2.length;
            return;
        }
        C0089d.R("Trie-based persistent vector should have at least 33 elements, got " + b());
        throw null;
    }

    public static Object[] n(Object[] objArr, int i3, int i4, Object obj, e eVar) {
        Object[] copyOf;
        int F3 = B.F(i4, i3);
        if (i3 == 0) {
            if (F3 == 0) {
                copyOf = new Object[32];
            } else {
                copyOf = Arrays.copyOf(objArr, 32);
                Z1.i.e(copyOf, "copyOf(this, newSize)");
            }
            M1.k.X(objArr, copyOf, F3 + 1, F3, 31);
            eVar.f2736a = objArr[31];
            copyOf[F3] = obj;
            return copyOf;
        }
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        Z1.i.e(copyOf2, "copyOf(this, newSize)");
        int i5 = i3 - 5;
        Object obj2 = objArr[F3];
        Z1.i.d(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        copyOf2[F3] = n((Object[]) obj2, i5, i4, obj, eVar);
        while (true) {
            F3++;
            if (F3 >= 32 || copyOf2[F3] == null) {
                break;
            }
            Object obj3 = objArr[F3];
            Z1.i.d(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            copyOf2[F3] = n((Object[]) obj3, i5, 0, eVar.f2736a, eVar);
        }
        return copyOf2;
    }

    public static Object[] p(Object[] objArr, int i3, int i4, e eVar) {
        Object[] p;
        int F3 = B.F(i4, i3);
        if (i3 == 5) {
            eVar.f2736a = objArr[F3];
            p = null;
        } else {
            Object obj = objArr[F3];
            Z1.i.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            p = p((Object[]) obj, i3 - 5, i4, eVar);
        }
        if (p == null && F3 == 0) {
            return null;
        }
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        Z1.i.e(copyOf, "copyOf(this, newSize)");
        copyOf[F3] = p;
        return copyOf;
    }

    public static Object[] v(Object[] objArr, int i3, int i4, Object obj) {
        int F3 = B.F(i4, i3);
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        Z1.i.e(copyOf, "copyOf(this, newSize)");
        if (i3 == 0) {
            copyOf[F3] = obj;
        } else {
            Object obj2 = copyOf[F3];
            Z1.i.d(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            copyOf[F3] = v((Object[]) obj2, i3 - 5, i4, obj);
        }
        return copyOf;
    }

    @Override // M1.AbstractC0140a
    public final int b() {
        return this.f2739f;
    }

    @Override // M.c
    public final c c(int i3, Object obj) {
        int i4 = this.f2739f;
        B.r(i3, i4);
        if (i3 == i4) {
            return d(obj);
        }
        int u3 = u();
        Object[] objArr = this.f2737d;
        if (i3 >= u3) {
            return o(objArr, i3 - u3, obj);
        }
        e eVar = new e(null);
        return o(n(objArr, this.f2740g, i3, obj, eVar), 0, eVar.f2736a);
    }

    @Override // M.c
    public final c d(Object obj) {
        int u3 = u();
        int i3 = this.f2739f;
        int i4 = i3 - u3;
        Object[] objArr = this.f2737d;
        Object[] objArr2 = this.f2738e;
        if (i4 >= 32) {
            Object[] objArr3 = new Object[32];
            objArr3[0] = obj;
            return q(objArr, objArr2, objArr3);
        }
        Object[] copyOf = Arrays.copyOf(objArr2, 32);
        Z1.i.e(copyOf, "copyOf(this, newSize)");
        copyOf[i4] = obj;
        return new f(objArr, copyOf, i3 + 1, this.f2740g);
    }

    @Override // java.util.List
    public final Object get(int i3) {
        Object[] objArr;
        B.q(i3, b());
        if (u() <= i3) {
            objArr = this.f2738e;
        } else {
            objArr = this.f2737d;
            for (int i4 = this.f2740g; i4 > 0; i4 -= 5) {
                Object obj = objArr[B.F(i3, i4)];
                Z1.i.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr = (Object[]) obj;
            }
        }
        return objArr[i3 & 31];
    }

    @Override // M.c
    public final g j() {
        return new g(this, this.f2737d, this.f2738e, this.f2740g);
    }

    @Override // M.c
    public final c k(b bVar) {
        g gVar = new g(this, this.f2737d, this.f2738e, this.f2740g);
        gVar.D(bVar);
        return gVar.d();
    }

    @Override // M.c
    public final c l(int i3) {
        B.q(i3, this.f2739f);
        int u3 = u();
        Object[] objArr = this.f2737d;
        int i4 = this.f2740g;
        return i3 >= u3 ? t(objArr, u3, i4, i3 - u3) : t(s(objArr, i4, i3, new e(this.f2738e[0])), u3, i4, 0);
    }

    @Override // M1.AbstractC0143d, java.util.List
    public final ListIterator listIterator(int i3) {
        B.r(i3, this.f2739f);
        return new h(this.f2737d, this.f2738e, i3, this.f2739f, (this.f2740g / 5) + 1);
    }

    @Override // M.c
    public final c m(int i3, Object obj) {
        int i4 = this.f2739f;
        B.q(i3, i4);
        int u3 = u();
        Object[] objArr = this.f2737d;
        Object[] objArr2 = this.f2738e;
        int i5 = this.f2740g;
        if (u3 > i3) {
            return new f(v(objArr, i5, i3, obj), objArr2, i4, i5);
        }
        Object[] copyOf = Arrays.copyOf(objArr2, 32);
        Z1.i.e(copyOf, "copyOf(this, newSize)");
        copyOf[i3 & 31] = obj;
        return new f(objArr, copyOf, i4, i5);
    }

    public final f o(Object[] objArr, int i3, Object obj) {
        int u3 = u();
        int i4 = this.f2739f;
        int i5 = i4 - u3;
        Object[] objArr2 = this.f2738e;
        Object[] copyOf = Arrays.copyOf(objArr2, 32);
        Z1.i.e(copyOf, "copyOf(this, newSize)");
        if (i5 < 32) {
            M1.k.X(objArr2, copyOf, i3 + 1, i3, i5);
            copyOf[i3] = obj;
            return new f(objArr, copyOf, i4 + 1, this.f2740g);
        }
        Object obj2 = objArr2[31];
        M1.k.X(objArr2, copyOf, i3 + 1, i3, i5 - 1);
        copyOf[i3] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj2;
        return q(objArr, copyOf, objArr3);
    }

    public final f q(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i3 = this.f2739f;
        int i4 = i3 >> 5;
        int i5 = this.f2740g;
        if (i4 <= (1 << i5)) {
            return new f(r(i5, objArr, objArr2), objArr3, i3 + 1, i5);
        }
        Object[] objArr4 = new Object[32];
        objArr4[0] = objArr;
        int i6 = i5 + 5;
        return new f(r(i6, objArr4, objArr2), objArr3, i3 + 1, i6);
    }

    public final Object[] r(int i3, Object[] objArr, Object[] objArr2) {
        Object[] objArr3;
        int F3 = B.F(b() - 1, i3);
        if (objArr != null) {
            objArr3 = Arrays.copyOf(objArr, 32);
            Z1.i.e(objArr3, "copyOf(this, newSize)");
        } else {
            objArr3 = new Object[32];
        }
        if (i3 == 5) {
            objArr3[F3] = objArr2;
        } else {
            objArr3[F3] = r(i3 - 5, (Object[]) objArr3[F3], objArr2);
        }
        return objArr3;
    }

    public final Object[] s(Object[] objArr, int i3, int i4, e eVar) {
        Object[] copyOf;
        int F3 = B.F(i4, i3);
        if (i3 == 0) {
            if (F3 == 0) {
                copyOf = new Object[32];
            } else {
                copyOf = Arrays.copyOf(objArr, 32);
                Z1.i.e(copyOf, "copyOf(this, newSize)");
            }
            M1.k.X(objArr, copyOf, F3, F3 + 1, 32);
            copyOf[31] = eVar.f2736a;
            eVar.f2736a = objArr[F3];
            return copyOf;
        }
        int F4 = objArr[31] == null ? B.F(u() - 1, i3) : 31;
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        Z1.i.e(copyOf2, "copyOf(this, newSize)");
        int i5 = i3 - 5;
        int i6 = F3 + 1;
        if (i6 <= F4) {
            while (true) {
                Object obj = copyOf2[F4];
                Z1.i.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                copyOf2[F4] = s((Object[]) obj, i5, 0, eVar);
                if (F4 == i6) {
                    break;
                }
                F4--;
            }
        }
        Object obj2 = copyOf2[F3];
        Z1.i.d(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        copyOf2[F3] = s((Object[]) obj2, i5, i4, eVar);
        return copyOf2;
    }

    public final c t(Object[] objArr, int i3, int i4, int i5) {
        f fVar;
        int i6 = this.f2739f - i3;
        if (i6 != 1) {
            Object[] objArr2 = this.f2738e;
            Object[] copyOf = Arrays.copyOf(objArr2, 32);
            Z1.i.e(copyOf, "copyOf(this, newSize)");
            int i7 = i6 - 1;
            if (i5 < i7) {
                M1.k.X(objArr2, copyOf, i5, i5 + 1, i6);
            }
            copyOf[i7] = null;
            return new f(objArr, copyOf, (i3 + i6) - 1, i4);
        }
        if (i4 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
                Z1.i.e(objArr, "copyOf(this, newSize)");
            }
            return new j(objArr);
        }
        e eVar = new e(null);
        Object[] p = p(objArr, i4, i3 - 1, eVar);
        Z1.i.c(p);
        Object obj = eVar.f2736a;
        Z1.i.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr3 = (Object[]) obj;
        if (p[1] == null) {
            Object obj2 = p[0];
            Z1.i.d(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            fVar = new f((Object[]) obj2, objArr3, i3, i4 - 5);
        } else {
            fVar = new f(p, objArr3, i3, i4);
        }
        return fVar;
    }

    public final int u() {
        return (this.f2739f - 1) & (-32);
    }
}
