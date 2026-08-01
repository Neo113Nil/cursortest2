package t0;

import b1.t;
import java.util.Arrays;
import java.util.ListIterator;
import kotlin.collections.v;
import n0.n1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d extends b {

    /* renamed from: e, reason: collision with root package name */
    public final Object[] f9200e;

    /* renamed from: i, reason: collision with root package name */
    public final Object[] f9201i;

    /* renamed from: r, reason: collision with root package name */
    public final int f9202r;

    /* renamed from: s, reason: collision with root package name */
    public final int f9203s;

    public d(Object[] objArr, Object[] objArr2, int i3, int i10) {
        this.f9200e = objArr;
        this.f9201i = objArr2;
        this.f9202r = i3;
        this.f9203s = i10;
        if (!(b() > 32)) {
            n1.a("Trie-based persistent vector should have at least 33 elements, got " + b());
        }
        int length = objArr2.length;
    }

    public static Object[] m(Object[] objArr, int i3, int i10, Object obj, f2.a aVar) {
        int x10 = k7.e.x(i10, i3);
        if (i3 == 0) {
            Object[] copyOf = x10 == 0 ? new Object[32] : Arrays.copyOf(objArr, 32);
            v.d(x10 + 1, x10, 31, objArr, copyOf);
            aVar.f4064d = objArr[31];
            copyOf[x10] = obj;
            return copyOf;
        }
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        int i11 = i3 - 5;
        Object obj2 = objArr[x10];
        obj2.getClass();
        copyOf2[x10] = m((Object[]) obj2, i11, i10, obj, aVar);
        while (true) {
            x10++;
            if (x10 >= 32 || copyOf2[x10] == null) {
                break;
            }
            Object obj3 = objArr[x10];
            obj3.getClass();
            copyOf2[x10] = m((Object[]) obj3, i11, 0, aVar.f4064d, aVar);
        }
        return copyOf2;
    }

    public static Object[] o(Object[] objArr, int i3, int i10, f2.a aVar) {
        Object[] o6;
        int x10 = k7.e.x(i10, i3);
        if (i3 == 5) {
            aVar.f4064d = objArr[x10];
            o6 = null;
        } else {
            Object obj = objArr[x10];
            obj.getClass();
            o6 = o((Object[]) obj, i3 - 5, i10, aVar);
        }
        if (o6 == null && x10 == 0) {
            return null;
        }
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        copyOf[x10] = o6;
        return copyOf;
    }

    public static Object[] u(Object[] objArr, int i3, int i10, Object obj) {
        int x10 = k7.e.x(i10, i3);
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        if (i3 == 0) {
            copyOf[x10] = obj;
            return copyOf;
        }
        Object obj2 = copyOf[x10];
        obj2.getClass();
        copyOf[x10] = u((Object[]) obj2, i3 - 5, i10, obj);
        return copyOf;
    }

    @Override // kotlin.collections.a
    public final int b() {
        return this.f9202r;
    }

    @Override // t0.b
    public final b c(int i3, Object obj) {
        int i10 = this.f9202r;
        i7.a.C(i3, i10);
        if (i3 == i10) {
            return e(obj);
        }
        int t6 = t();
        Object[] objArr = this.f9200e;
        if (i3 >= t6) {
            return n(i3 - t6, obj, objArr);
        }
        f2.a aVar = new f2.a(null);
        return n(0, aVar.f4064d, m(objArr, this.f9203s, i3, obj, aVar));
    }

    @Override // t0.b
    public final b e(Object obj) {
        int t6 = t();
        int i3 = this.f9202r;
        int i10 = i3 - t6;
        Object[] objArr = this.f9200e;
        Object[] objArr2 = this.f9201i;
        if (i10 < 32) {
            Object[] copyOf = Arrays.copyOf(objArr2, 32);
            copyOf[i10] = obj;
            return new d(objArr, copyOf, i3 + 1, this.f9203s);
        }
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj;
        return p(objArr, objArr2, objArr3);
    }

    @Override // t0.b
    public final e g() {
        return new e(this, this.f9200e, this.f9201i, this.f9203s);
    }

    @Override // java.util.List
    public final Object get(int i3) {
        Object[] objArr;
        i7.a.w(i3, b());
        if (t() <= i3) {
            objArr = this.f9201i;
        } else {
            objArr = this.f9200e;
            for (int i10 = this.f9203s; i10 > 0; i10 -= 5) {
                Object obj = objArr[k7.e.x(i3, i10)];
                obj.getClass();
                objArr = (Object[]) obj;
            }
        }
        return objArr[i3 & 31];
    }

    @Override // t0.b
    public final b h(t tVar) {
        e eVar = new e(this, this.f9200e, this.f9201i, this.f9203s);
        eVar.C(tVar);
        return eVar.e();
    }

    @Override // t0.b
    public final b i(int i3) {
        i7.a.w(i3, b());
        int t6 = t();
        int i10 = this.f9203s;
        Object[] objArr = this.f9200e;
        return i3 >= t6 ? s(objArr, t6, i10, i3 - t6) : s(r(objArr, i10, i3, new f2.a(this.f9201i[0])), t6, i10, 0);
    }

    @Override // t0.b
    public final b k(int i3, Object obj) {
        int i10 = this.f9202r;
        i7.a.w(i3, i10);
        int t6 = t();
        Object[] objArr = this.f9200e;
        Object[] objArr2 = this.f9201i;
        int i11 = this.f9203s;
        if (t6 > i3) {
            return new d(u(objArr, i11, i3, obj), objArr2, i10, i11);
        }
        Object[] copyOf = Arrays.copyOf(objArr2, 32);
        copyOf[i3 & 31] = obj;
        return new d(objArr, copyOf, i10, i11);
    }

    @Override // kotlin.collections.f, java.util.List
    public final ListIterator listIterator(int i3) {
        i7.a.C(i3, this.f9202r);
        return new f(i3, this.f9202r, (this.f9203s / 5) + 1, this.f9200e, this.f9201i);
    }

    public final d n(int i3, Object obj, Object[] objArr) {
        int t6 = t();
        int i10 = this.f9202r;
        int i11 = i10 - t6;
        Object[] objArr2 = this.f9201i;
        Object[] copyOf = Arrays.copyOf(objArr2, 32);
        if (i11 < 32) {
            v.d(i3 + 1, i3, i11, objArr2, copyOf);
            copyOf[i3] = obj;
            return new d(objArr, copyOf, i10 + 1, this.f9203s);
        }
        Object obj2 = objArr2[31];
        v.d(i3 + 1, i3, i11 - 1, objArr2, copyOf);
        copyOf[i3] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj2;
        return p(objArr, copyOf, objArr3);
    }

    public final d p(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i3 = this.f9202r;
        int i10 = i3 >> 5;
        int i11 = this.f9203s;
        if (i10 <= (1 << i11)) {
            return new d(q(i11, objArr, objArr2), objArr3, i3 + 1, i11);
        }
        Object[] objArr4 = new Object[32];
        objArr4[0] = objArr;
        int i12 = i11 + 5;
        return new d(q(i12, objArr4, objArr2), objArr3, i3 + 1, i12);
    }

    public final Object[] q(int i3, Object[] objArr, Object[] objArr2) {
        int x10 = k7.e.x(b() - 1, i3);
        Object[] copyOf = objArr != null ? Arrays.copyOf(objArr, 32) : new Object[32];
        if (i3 == 5) {
            copyOf[x10] = objArr2;
            return copyOf;
        }
        copyOf[x10] = q(i3 - 5, (Object[]) copyOf[x10], objArr2);
        return copyOf;
    }

    public final Object[] r(Object[] objArr, int i3, int i10, f2.a aVar) {
        int x10 = k7.e.x(i10, i3);
        if (i3 == 0) {
            Object[] copyOf = x10 == 0 ? new Object[32] : Arrays.copyOf(objArr, 32);
            v.d(x10, x10 + 1, 32, objArr, copyOf);
            copyOf[31] = aVar.f4064d;
            aVar.f4064d = objArr[x10];
            return copyOf;
        }
        int x11 = objArr[31] == null ? k7.e.x(t() - 1, i3) : 31;
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        int i11 = i3 - 5;
        int i12 = x10 + 1;
        if (i12 <= x11) {
            while (true) {
                Object obj = copyOf2[x11];
                obj.getClass();
                copyOf2[x11] = r((Object[]) obj, i11, 0, aVar);
                if (x11 == i12) {
                    break;
                }
                x11--;
            }
        }
        Object obj2 = copyOf2[x10];
        obj2.getClass();
        copyOf2[x10] = r((Object[]) obj2, i11, i10, aVar);
        return copyOf2;
    }

    public final b s(Object[] objArr, int i3, int i10, int i11) {
        int i12 = this.f9202r - i3;
        if (i12 != 1) {
            Object[] objArr2 = this.f9201i;
            Object[] copyOf = Arrays.copyOf(objArr2, 32);
            int i13 = i12 - 1;
            if (i11 < i13) {
                v.d(i11, i11 + 1, i12, objArr2, copyOf);
            }
            copyOf[i13] = null;
            return new d(objArr, copyOf, (i3 + i12) - 1, i10);
        }
        if (i10 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
            }
            return new h(objArr);
        }
        f2.a aVar = new f2.a(null);
        Object[] o6 = o(objArr, i10, i3 - 1, aVar);
        o6.getClass();
        Object obj = aVar.f4064d;
        obj.getClass();
        Object[] objArr3 = (Object[]) obj;
        if (o6[1] != null) {
            return new d(o6, objArr3, i3, i10);
        }
        Object obj2 = o6[0];
        obj2.getClass();
        return new d((Object[]) obj2, objArr3, i3, i10 - 5);
    }

    public final int t() {
        return (this.f9202r - 1) & (-32);
    }
}
