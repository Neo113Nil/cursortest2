package q0;

import d6.l;
import java.util.Arrays;
import java.util.ListIterator;
import m0.p1;
import r2.r;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class f extends c {

    /* renamed from: d, reason: collision with root package name */
    public final Object[] f5939d;

    /* renamed from: e, reason: collision with root package name */
    public final Object[] f5940e;

    /* renamed from: f, reason: collision with root package name */
    public final int f5941f;

    /* renamed from: g, reason: collision with root package name */
    public final int f5942g;

    public f(Object[] objArr, Object[] objArr2, int i, int i8) {
        this.f5939d = objArr;
        this.f5940e = objArr2;
        this.f5941f = i;
        this.f5942g = i8;
        if (!(a() > 32)) {
            p1.a("Trie-based persistent vector should have at least 33 elements, got " + a());
        }
        int length = objArr2.length;
    }

    public static Object[] j(Object[] objArr, int i, int i8, Object obj, e eVar) {
        Object[] copyOf;
        int F = m.a.F(i8, i);
        if (i == 0) {
            if (F == 0) {
                copyOf = new Object[32];
            } else {
                copyOf = Arrays.copyOf(objArr, 32);
                q6.i.d(copyOf, "copyOf(...)");
            }
            l.H(objArr, copyOf, F + 1, F, 31);
            eVar.f5938a = objArr[31];
            copyOf[F] = obj;
            return copyOf;
        }
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        q6.i.d(copyOf2, "copyOf(...)");
        int i9 = i - 5;
        Object obj2 = objArr[F];
        q6.i.c(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        copyOf2[F] = j((Object[]) obj2, i9, i8, obj, eVar);
        while (true) {
            F++;
            if (F >= 32 || copyOf2[F] == null) {
                break;
            }
            Object obj3 = objArr[F];
            q6.i.c(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            copyOf2[F] = j((Object[]) obj3, i9, 0, eVar.f5938a, eVar);
        }
        return copyOf2;
    }

    public static Object[] l(Object[] objArr, int i, int i8, e eVar) {
        Object[] l3;
        int F = m.a.F(i8, i);
        if (i == 5) {
            eVar.f5938a = objArr[F];
            l3 = null;
        } else {
            Object obj = objArr[F];
            q6.i.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            l3 = l((Object[]) obj, i - 5, i8, eVar);
        }
        if (l3 == null && F == 0) {
            return null;
        }
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        q6.i.d(copyOf, "copyOf(...)");
        copyOf[F] = l3;
        return copyOf;
    }

    public static Object[] r(Object[] objArr, int i, int i8, Object obj) {
        int F = m.a.F(i8, i);
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        q6.i.d(copyOf, "copyOf(...)");
        if (i == 0) {
            copyOf[F] = obj;
            return copyOf;
        }
        Object obj2 = copyOf[F];
        q6.i.c(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        copyOf[F] = r((Object[]) obj2, i - 5, i8, obj);
        return copyOf;
    }

    @Override // d6.a
    public final int a() {
        return this.f5941f;
    }

    @Override // q0.c
    public final c b(int i, Object obj) {
        int i8 = this.f5941f;
        r.m(i, i8);
        if (i == i8) {
            return c(obj);
        }
        int q4 = q();
        Object[] objArr = this.f5939d;
        if (i >= q4) {
            return k(objArr, i - q4, obj);
        }
        e eVar = new e(null);
        return k(j(objArr, this.f5942g, i, obj, eVar), 0, eVar.f5938a);
    }

    @Override // q0.c
    public final c c(Object obj) {
        int q4 = q();
        int i = this.f5941f;
        int i8 = i - q4;
        Object[] objArr = this.f5939d;
        Object[] objArr2 = this.f5940e;
        if (i8 >= 32) {
            Object[] objArr3 = new Object[32];
            objArr3[0] = obj;
            return m(objArr, objArr2, objArr3);
        }
        Object[] copyOf = Arrays.copyOf(objArr2, 32);
        q6.i.d(copyOf, "copyOf(...)");
        copyOf[i8] = obj;
        return new f(objArr, copyOf, i + 1, this.f5942g);
    }

    @Override // q0.c
    public final g f() {
        return new g(this, this.f5939d, this.f5940e, this.f5942g);
    }

    @Override // q0.c
    public final c g(b bVar) {
        g gVar = new g(this, this.f5939d, this.f5940e, this.f5942g);
        gVar.z(bVar);
        return gVar.c();
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object[] objArr;
        r.l(i, a());
        if (q() <= i) {
            objArr = this.f5940e;
        } else {
            objArr = this.f5939d;
            for (int i8 = this.f5942g; i8 > 0; i8 -= 5) {
                Object obj = objArr[m.a.F(i, i8)];
                q6.i.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr = (Object[]) obj;
            }
        }
        return objArr[i & 31];
    }

    @Override // q0.c
    public final c h(int i) {
        r.l(i, this.f5941f);
        int q4 = q();
        Object[] objArr = this.f5939d;
        int i8 = this.f5942g;
        return i >= q4 ? p(objArr, q4, i8, i - q4) : p(o(objArr, i8, i, new e(this.f5940e[0])), q4, i8, 0);
    }

    @Override // q0.c
    public final c i(int i, Object obj) {
        int i8 = this.f5941f;
        r.l(i, i8);
        int q4 = q();
        Object[] objArr = this.f5939d;
        Object[] objArr2 = this.f5940e;
        int i9 = this.f5942g;
        if (q4 > i) {
            return new f(r(objArr, i9, i, obj), objArr2, i8, i9);
        }
        Object[] copyOf = Arrays.copyOf(objArr2, 32);
        q6.i.d(copyOf, "copyOf(...)");
        copyOf[i & 31] = obj;
        return new f(objArr, copyOf, i8, i9);
    }

    public final f k(Object[] objArr, int i, Object obj) {
        int q4 = q();
        int i8 = this.f5941f;
        int i9 = i8 - q4;
        Object[] objArr2 = this.f5940e;
        Object[] copyOf = Arrays.copyOf(objArr2, 32);
        q6.i.d(copyOf, "copyOf(...)");
        if (i9 < 32) {
            l.H(objArr2, copyOf, i + 1, i, i9);
            copyOf[i] = obj;
            return new f(objArr, copyOf, i8 + 1, this.f5942g);
        }
        Object obj2 = objArr2[31];
        l.H(objArr2, copyOf, i + 1, i, i9 - 1);
        copyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj2;
        return m(objArr, copyOf, objArr3);
    }

    @Override // d6.e, java.util.List
    public final ListIterator listIterator(int i) {
        r.m(i, this.f5941f);
        return new h(this.f5939d, this.f5940e, i, this.f5941f, (this.f5942g / 5) + 1);
    }

    public final f m(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.f5941f;
        int i8 = i >> 5;
        int i9 = this.f5942g;
        if (i8 <= (1 << i9)) {
            return new f(n(i9, objArr, objArr2), objArr3, i + 1, i9);
        }
        Object[] objArr4 = new Object[32];
        objArr4[0] = objArr;
        int i10 = i9 + 5;
        return new f(n(i10, objArr4, objArr2), objArr3, i + 1, i10);
    }

    public final Object[] n(int i, Object[] objArr, Object[] objArr2) {
        Object[] objArr3;
        int F = m.a.F(a() - 1, i);
        if (objArr != null) {
            objArr3 = Arrays.copyOf(objArr, 32);
            q6.i.d(objArr3, "copyOf(...)");
        } else {
            objArr3 = new Object[32];
        }
        if (i == 5) {
            objArr3[F] = objArr2;
            return objArr3;
        }
        objArr3[F] = n(i - 5, (Object[]) objArr3[F], objArr2);
        return objArr3;
    }

    public final Object[] o(Object[] objArr, int i, int i8, e eVar) {
        Object[] copyOf;
        int F = m.a.F(i8, i);
        if (i == 0) {
            if (F == 0) {
                copyOf = new Object[32];
            } else {
                copyOf = Arrays.copyOf(objArr, 32);
                q6.i.d(copyOf, "copyOf(...)");
            }
            l.H(objArr, copyOf, F, F + 1, 32);
            copyOf[31] = eVar.f5938a;
            eVar.f5938a = objArr[F];
            return copyOf;
        }
        int F2 = objArr[31] == null ? m.a.F(q() - 1, i) : 31;
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        q6.i.d(copyOf2, "copyOf(...)");
        int i9 = i - 5;
        int i10 = F + 1;
        if (i10 <= F2) {
            while (true) {
                Object obj = copyOf2[F2];
                q6.i.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                copyOf2[F2] = o((Object[]) obj, i9, 0, eVar);
                if (F2 == i10) {
                    break;
                }
                F2--;
            }
        }
        Object obj2 = copyOf2[F];
        q6.i.c(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        copyOf2[F] = o((Object[]) obj2, i9, i8, eVar);
        return copyOf2;
    }

    public final c p(Object[] objArr, int i, int i8, int i9) {
        int i10 = this.f5941f - i;
        if (i10 != 1) {
            Object[] objArr2 = this.f5940e;
            Object[] copyOf = Arrays.copyOf(objArr2, 32);
            q6.i.d(copyOf, "copyOf(...)");
            int i11 = i10 - 1;
            if (i9 < i11) {
                l.H(objArr2, copyOf, i9, i9 + 1, i10);
            }
            copyOf[i11] = null;
            return new f(objArr, copyOf, (i + i10) - 1, i8);
        }
        if (i8 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
                q6.i.d(objArr, "copyOf(...)");
            }
            return new j(objArr);
        }
        e eVar = new e(null);
        Object[] l3 = l(objArr, i8, i - 1, eVar);
        q6.i.b(l3);
        Object obj = eVar.f5938a;
        q6.i.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr3 = (Object[]) obj;
        if (l3[1] != null) {
            return new f(l3, objArr3, i, i8);
        }
        Object obj2 = l3[0];
        q6.i.c(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        return new f((Object[]) obj2, objArr3, i, i8 - 5);
    }

    public final int q() {
        return (this.f5941f - 1) & (-32);
    }
}
