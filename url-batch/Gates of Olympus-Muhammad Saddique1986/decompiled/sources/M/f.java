package M;

import I.C0143d;
import O2.l;
import a.AbstractC0235a;
import java.util.Arrays;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class f extends c {

    /* renamed from: d, reason: collision with root package name */
    public final Object[] f3428d;

    /* renamed from: e, reason: collision with root package name */
    public final Object[] f3429e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3430f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3431g;

    public f(Object[] objArr, Object[] objArr2, int i3, int i4) {
        this.f3428d = objArr;
        this.f3429e = objArr2;
        this.f3430f = i3;
        this.f3431g = i4;
        if (b() > 32) {
            int length = objArr2.length;
            return;
        }
        C0143d.S("Trie-based persistent vector should have at least 33 elements, got " + b());
        throw null;
    }

    public static Object[] n(Object[] objArr, int i3, int i4, Object obj, e eVar) {
        Object[] copyOf;
        int h02 = l.h0(i4, i3);
        if (i3 == 0) {
            if (h02 == 0) {
                copyOf = new Object[32];
            } else {
                copyOf = Arrays.copyOf(objArr, 32);
                f2.j.e(copyOf, "copyOf(this, newSize)");
            }
            S1.k.m0(objArr, copyOf, h02 + 1, h02, 31);
            eVar.f3427a = objArr[31];
            copyOf[h02] = obj;
            return copyOf;
        }
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        f2.j.e(copyOf2, "copyOf(this, newSize)");
        int i5 = i3 - 5;
        Object obj2 = objArr[h02];
        f2.j.d(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        copyOf2[h02] = n((Object[]) obj2, i5, i4, obj, eVar);
        while (true) {
            h02++;
            if (h02 >= 32 || copyOf2[h02] == null) {
                break;
            }
            Object obj3 = objArr[h02];
            f2.j.d(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            copyOf2[h02] = n((Object[]) obj3, i5, 0, eVar.f3427a, eVar);
        }
        return copyOf2;
    }

    public static Object[] p(Object[] objArr, int i3, int i4, e eVar) {
        Object[] p3;
        int h02 = l.h0(i4, i3);
        if (i3 == 5) {
            eVar.f3427a = objArr[h02];
            p3 = null;
        } else {
            Object obj = objArr[h02];
            f2.j.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            p3 = p((Object[]) obj, i3 - 5, i4, eVar);
        }
        if (p3 == null && h02 == 0) {
            return null;
        }
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        f2.j.e(copyOf, "copyOf(this, newSize)");
        copyOf[h02] = p3;
        return copyOf;
    }

    public static Object[] v(Object[] objArr, int i3, int i4, Object obj) {
        int h02 = l.h0(i4, i3);
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        f2.j.e(copyOf, "copyOf(this, newSize)");
        if (i3 == 0) {
            copyOf[h02] = obj;
        } else {
            Object obj2 = copyOf[h02];
            f2.j.d(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            copyOf[h02] = v((Object[]) obj2, i3 - 5, i4, obj);
        }
        return copyOf;
    }

    @Override // S1.AbstractC0222a
    public final int b() {
        return this.f3430f;
    }

    @Override // M.c
    public final c c(int i3, Object obj) {
        int i4 = this.f3430f;
        AbstractC0235a.m(i3, i4);
        if (i3 == i4) {
            return d(obj);
        }
        int u3 = u();
        Object[] objArr = this.f3428d;
        if (i3 >= u3) {
            return o(objArr, i3 - u3, obj);
        }
        e eVar = new e(null);
        return o(n(objArr, this.f3431g, i3, obj, eVar), 0, eVar.f3427a);
    }

    @Override // M.c
    public final c d(Object obj) {
        int u3 = u();
        int i3 = this.f3430f;
        int i4 = i3 - u3;
        Object[] objArr = this.f3428d;
        Object[] objArr2 = this.f3429e;
        if (i4 >= 32) {
            Object[] objArr3 = new Object[32];
            objArr3[0] = obj;
            return q(objArr, objArr2, objArr3);
        }
        Object[] copyOf = Arrays.copyOf(objArr2, 32);
        f2.j.e(copyOf, "copyOf(this, newSize)");
        copyOf[i4] = obj;
        return new f(objArr, copyOf, i3 + 1, this.f3431g);
    }

    @Override // java.util.List
    public final Object get(int i3) {
        Object[] objArr;
        AbstractC0235a.l(i3, b());
        if (u() <= i3) {
            objArr = this.f3429e;
        } else {
            objArr = this.f3428d;
            for (int i4 = this.f3431g; i4 > 0; i4 -= 5) {
                Object obj = objArr[l.h0(i3, i4)];
                f2.j.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr = (Object[]) obj;
            }
        }
        return objArr[i3 & 31];
    }

    @Override // M.c
    public final g j() {
        return new g(this, this.f3428d, this.f3429e, this.f3431g);
    }

    @Override // M.c
    public final c k(b bVar) {
        g gVar = new g(this, this.f3428d, this.f3429e, this.f3431g);
        gVar.D(bVar);
        return gVar.d();
    }

    @Override // M.c
    public final c l(int i3) {
        AbstractC0235a.l(i3, this.f3430f);
        int u3 = u();
        Object[] objArr = this.f3428d;
        int i4 = this.f3431g;
        return i3 >= u3 ? t(objArr, u3, i4, i3 - u3) : t(s(objArr, i4, i3, new e(this.f3429e[0])), u3, i4, 0);
    }

    @Override // S1.AbstractC0225d, java.util.List
    public final ListIterator listIterator(int i3) {
        AbstractC0235a.m(i3, this.f3430f);
        return new h(this.f3428d, this.f3429e, i3, this.f3430f, (this.f3431g / 5) + 1);
    }

    @Override // M.c
    public final c m(int i3, Object obj) {
        int i4 = this.f3430f;
        AbstractC0235a.l(i3, i4);
        int u3 = u();
        Object[] objArr = this.f3428d;
        Object[] objArr2 = this.f3429e;
        int i5 = this.f3431g;
        if (u3 > i3) {
            return new f(v(objArr, i5, i3, obj), objArr2, i4, i5);
        }
        Object[] copyOf = Arrays.copyOf(objArr2, 32);
        f2.j.e(copyOf, "copyOf(this, newSize)");
        copyOf[i3 & 31] = obj;
        return new f(objArr, copyOf, i4, i5);
    }

    public final f o(Object[] objArr, int i3, Object obj) {
        int u3 = u();
        int i4 = this.f3430f;
        int i5 = i4 - u3;
        Object[] objArr2 = this.f3429e;
        Object[] copyOf = Arrays.copyOf(objArr2, 32);
        f2.j.e(copyOf, "copyOf(this, newSize)");
        if (i5 < 32) {
            S1.k.m0(objArr2, copyOf, i3 + 1, i3, i5);
            copyOf[i3] = obj;
            return new f(objArr, copyOf, i4 + 1, this.f3431g);
        }
        Object obj2 = objArr2[31];
        S1.k.m0(objArr2, copyOf, i3 + 1, i3, i5 - 1);
        copyOf[i3] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj2;
        return q(objArr, copyOf, objArr3);
    }

    public final f q(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i3 = this.f3430f;
        int i4 = i3 >> 5;
        int i5 = this.f3431g;
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
        int h02 = l.h0(b() - 1, i3);
        if (objArr != null) {
            objArr3 = Arrays.copyOf(objArr, 32);
            f2.j.e(objArr3, "copyOf(this, newSize)");
        } else {
            objArr3 = new Object[32];
        }
        if (i3 == 5) {
            objArr3[h02] = objArr2;
        } else {
            objArr3[h02] = r(i3 - 5, (Object[]) objArr3[h02], objArr2);
        }
        return objArr3;
    }

    public final Object[] s(Object[] objArr, int i3, int i4, e eVar) {
        Object[] copyOf;
        int h02 = l.h0(i4, i3);
        if (i3 == 0) {
            if (h02 == 0) {
                copyOf = new Object[32];
            } else {
                copyOf = Arrays.copyOf(objArr, 32);
                f2.j.e(copyOf, "copyOf(this, newSize)");
            }
            S1.k.m0(objArr, copyOf, h02, h02 + 1, 32);
            copyOf[31] = eVar.f3427a;
            eVar.f3427a = objArr[h02];
            return copyOf;
        }
        int h03 = objArr[31] == null ? l.h0(u() - 1, i3) : 31;
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        f2.j.e(copyOf2, "copyOf(this, newSize)");
        int i5 = i3 - 5;
        int i6 = h02 + 1;
        if (i6 <= h03) {
            while (true) {
                Object obj = copyOf2[h03];
                f2.j.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                copyOf2[h03] = s((Object[]) obj, i5, 0, eVar);
                if (h03 == i6) {
                    break;
                }
                h03--;
            }
        }
        Object obj2 = copyOf2[h02];
        f2.j.d(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        copyOf2[h02] = s((Object[]) obj2, i5, i4, eVar);
        return copyOf2;
    }

    public final c t(Object[] objArr, int i3, int i4, int i5) {
        f fVar;
        int i6 = this.f3430f - i3;
        if (i6 != 1) {
            Object[] objArr2 = this.f3429e;
            Object[] copyOf = Arrays.copyOf(objArr2, 32);
            f2.j.e(copyOf, "copyOf(this, newSize)");
            int i7 = i6 - 1;
            if (i5 < i7) {
                S1.k.m0(objArr2, copyOf, i5, i5 + 1, i6);
            }
            copyOf[i7] = null;
            return new f(objArr, copyOf, (i3 + i6) - 1, i4);
        }
        if (i4 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
                f2.j.e(objArr, "copyOf(this, newSize)");
            }
            return new j(objArr);
        }
        e eVar = new e(null);
        Object[] p3 = p(objArr, i4, i3 - 1, eVar);
        f2.j.c(p3);
        Object obj = eVar.f3427a;
        f2.j.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr3 = (Object[]) obj;
        if (p3[1] == null) {
            Object obj2 = p3[0];
            f2.j.d(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            fVar = new f((Object[]) obj2, objArr3, i3, i4 - 5);
        } else {
            fVar = new f(p3, objArr3, i3, i4);
        }
        return fVar;
    }

    public final int u() {
        return (this.f3430f - 1) & (-32);
    }
}
