package K;

import G.C0192d;
import a.AbstractC0345a;
import java.util.Arrays;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;
import w2.C1294c;
import z2.C1436t;

/* loaded from: classes.dex */
public final class e extends c {

    /* renamed from: e, reason: collision with root package name */
    public final Object[] f3424e;

    /* renamed from: i, reason: collision with root package name */
    public final Object[] f3425i;

    /* renamed from: j, reason: collision with root package name */
    public final int f3426j;

    /* renamed from: k, reason: collision with root package name */
    public final int f3427k;

    public e(Object[] objArr, Object[] objArr2, int i2, int i4) {
        this.f3424e = objArr;
        this.f3425i = objArr2;
        this.f3426j = i2;
        this.f3427k = i4;
        if (e() > 32) {
            int length = objArr2.length;
            return;
        }
        C0192d.S("Trie-based persistent vector should have at least 33 elements, got " + e());
        throw null;
    }

    public static Object[] G(Object[] objArr, int i2, int i4, Object obj) {
        int J3 = u3.d.J(i4, i2);
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        if (i2 == 0) {
            copyOf[J3] = obj;
        } else {
            Object obj2 = copyOf[J3];
            Intrinsics.d(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            copyOf[J3] = G((Object[]) obj2, i2 - 5, i4, obj);
        }
        return copyOf;
    }

    public static Object[] h(Object[] objArr, int i2, int i4, Object obj, C1294c c1294c) {
        Object[] copyOf;
        int J3 = u3.d.J(i4, i2);
        if (i2 == 0) {
            if (J3 == 0) {
                copyOf = new Object[32];
            } else {
                copyOf = Arrays.copyOf(objArr, 32);
                Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            }
            C1436t.f(objArr, copyOf, J3 + 1, J3, 31);
            c1294c.f11388d = objArr[31];
            copyOf[J3] = obj;
            return copyOf;
        }
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
        int i5 = i2 - 5;
        Object obj2 = objArr[J3];
        Intrinsics.d(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        copyOf2[J3] = h((Object[]) obj2, i5, i4, obj, c1294c);
        while (true) {
            J3++;
            if (J3 >= 32 || copyOf2[J3] == null) {
                break;
            }
            Object obj3 = objArr[J3];
            Intrinsics.d(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            copyOf2[J3] = h((Object[]) obj3, i5, 0, c1294c.f11388d, c1294c);
        }
        return copyOf2;
    }

    public static Object[] w(Object[] objArr, int i2, int i4, C1294c c1294c) {
        Object[] w4;
        int J3 = u3.d.J(i4, i2);
        if (i2 == 5) {
            c1294c.f11388d = objArr[J3];
            w4 = null;
        } else {
            Object obj = objArr[J3];
            Intrinsics.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            w4 = w((Object[]) obj, i2 - 5, i4, c1294c);
        }
        if (w4 == null && J3 == 0) {
            return null;
        }
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        copyOf[J3] = w4;
        return copyOf;
    }

    public final e B(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i2 = this.f3426j;
        int i4 = i2 >> 5;
        int i5 = this.f3427k;
        if (i4 <= (1 << i5)) {
            return new e(C(i5, objArr, objArr2), objArr3, i2 + 1, i5);
        }
        Object[] objArr4 = new Object[32];
        objArr4[0] = objArr;
        int i6 = i5 + 5;
        return new e(C(i6, objArr4, objArr2), objArr3, i2 + 1, i6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (r5 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object[] C(int i2, Object[] objArr, Object[] objArr2) {
        Object[] objArr3;
        int J3 = u3.d.J(e() - 1, i2);
        if (objArr != null) {
            objArr3 = Arrays.copyOf(objArr, 32);
            Intrinsics.checkNotNullExpressionValue(objArr3, "copyOf(this, newSize)");
        }
        objArr3 = new Object[32];
        if (i2 == 5) {
            objArr3[J3] = objArr2;
        } else {
            objArr3[J3] = C(i2 - 5, (Object[]) objArr3[J3], objArr2);
        }
        return objArr3;
    }

    public final Object[] D(Object[] objArr, int i2, int i4, C1294c c1294c) {
        Object[] copyOf;
        int J3 = u3.d.J(i4, i2);
        if (i2 == 0) {
            if (J3 == 0) {
                copyOf = new Object[32];
            } else {
                copyOf = Arrays.copyOf(objArr, 32);
                Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            }
            C1436t.f(objArr, copyOf, J3, J3 + 1, 32);
            copyOf[31] = c1294c.f11388d;
            c1294c.f11388d = objArr[J3];
            return copyOf;
        }
        int J4 = objArr[31] == null ? u3.d.J(F() - 1, i2) : 31;
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
        int i5 = i2 - 5;
        int i6 = J3 + 1;
        if (i6 <= J4) {
            while (true) {
                Object obj = copyOf2[J4];
                Intrinsics.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                copyOf2[J4] = D((Object[]) obj, i5, 0, c1294c);
                if (J4 == i6) {
                    break;
                }
                J4--;
            }
        }
        Object obj2 = copyOf2[J3];
        Intrinsics.d(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        copyOf2[J3] = D((Object[]) obj2, i5, i4, c1294c);
        return copyOf2;
    }

    public final c E(Object[] objArr, int i2, int i4, int i5) {
        e eVar;
        int i6 = this.f3426j - i2;
        Object obj = null;
        if (i6 != 1) {
            Object[] objArr2 = this.f3425i;
            Object[] copyOf = Arrays.copyOf(objArr2, 32);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            int i7 = i6 - 1;
            if (i5 < i7) {
                C1436t.f(objArr2, copyOf, i5, i5 + 1, i6);
            }
            copyOf[i7] = null;
            return new e(objArr, copyOf, (i2 + i6) - 1, i4);
        }
        if (i4 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
                Intrinsics.checkNotNullExpressionValue(objArr, "copyOf(this, newSize)");
            }
            return new i(objArr);
        }
        C1294c c1294c = new C1294c(obj);
        Object[] w4 = w(objArr, i4, i2 - 1, c1294c);
        Intrinsics.c(w4);
        Object obj2 = c1294c.f11388d;
        Intrinsics.d(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr3 = (Object[]) obj2;
        if (w4[1] == null) {
            Object obj3 = w4[0];
            Intrinsics.d(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            eVar = new e((Object[]) obj3, objArr3, i2, i4 - 5);
        } else {
            eVar = new e(w4, objArr3, i2, i4);
        }
        return eVar;
    }

    public final int F() {
        return (this.f3426j - 1) & (-32);
    }

    @Override // J.c
    public final f a() {
        return new f(this, this.f3424e, this.f3425i, this.f3427k);
    }

    @Override // java.util.Collection, java.util.List, J.c
    public final J.c add(Object obj) {
        int F3 = F();
        int i2 = this.f3426j;
        int i4 = i2 - F3;
        Object[] objArr = this.f3424e;
        Object[] objArr2 = this.f3425i;
        if (i4 >= 32) {
            Object[] objArr3 = new Object[32];
            objArr3[0] = obj;
            return B(objArr, objArr2, objArr3);
        }
        Object[] copyOf = Arrays.copyOf(objArr2, 32);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        copyOf[i4] = obj;
        return new e(objArr, copyOf, i2 + 1, this.f3427k);
    }

    @Override // z2.AbstractC1418b
    public final int e() {
        return this.f3426j;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        Object[] objArr;
        AbstractC0345a.j(i2, e());
        if (F() <= i2) {
            objArr = this.f3425i;
        } else {
            objArr = this.f3424e;
            for (int i4 = this.f3427k; i4 > 0; i4 -= 5) {
                Object obj = objArr[u3.d.J(i2, i4)];
                Intrinsics.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr = (Object[]) obj;
            }
        }
        return objArr[i2 & 31];
    }

    @Override // J.c
    public final J.c l(int i2) {
        AbstractC0345a.j(i2, this.f3426j);
        int F3 = F();
        Object[] objArr = this.f3424e;
        int i4 = this.f3427k;
        return i2 >= F3 ? E(objArr, F3, i4, i2 - F3) : E(D(objArr, i4, i2, new C1294c(this.f3425i[0])), F3, i4, 0);
    }

    @Override // z2.AbstractC1420d, java.util.List
    public final ListIterator listIterator(int i2) {
        AbstractC0345a.k(i2, this.f3426j);
        return new g(this.f3424e, this.f3425i, i2, this.f3426j, (this.f3427k / 5) + 1);
    }

    @Override // J.c
    public final J.c o(b bVar) {
        f fVar = new f(this, this.f3424e, this.f3425i, this.f3427k);
        fVar.V(bVar);
        return fVar.s();
    }

    public final e s(Object[] objArr, int i2, Object obj) {
        int F3 = F();
        int i4 = this.f3426j;
        int i5 = i4 - F3;
        Object[] objArr2 = this.f3425i;
        Object[] copyOf = Arrays.copyOf(objArr2, 32);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        if (i5 < 32) {
            C1436t.f(objArr2, copyOf, i2 + 1, i2, i5);
            copyOf[i2] = obj;
            return new e(objArr, copyOf, i4 + 1, this.f3427k);
        }
        Object obj2 = objArr2[31];
        C1436t.f(objArr2, copyOf, i2 + 1, i2, i5 - 1);
        copyOf[i2] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj2;
        return B(objArr, copyOf, objArr3);
    }

    @Override // z2.AbstractC1420d, java.util.List, J.c
    public final J.c set(int i2, Object obj) {
        int i4 = this.f3426j;
        AbstractC0345a.j(i2, i4);
        int F3 = F();
        Object[] objArr = this.f3424e;
        Object[] objArr2 = this.f3425i;
        int i5 = this.f3427k;
        if (F3 > i2) {
            return new e(G(objArr, i5, i2, obj), objArr2, i4, i5);
        }
        Object[] copyOf = Arrays.copyOf(objArr2, 32);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        copyOf[i2 & 31] = obj;
        return new e(objArr, copyOf, i4, i5);
    }

    @Override // java.util.List, J.c
    public final J.c add(int i2, Object obj) {
        int i4 = this.f3426j;
        AbstractC0345a.k(i2, i4);
        if (i2 == i4) {
            return add(obj);
        }
        int F3 = F();
        Object[] objArr = this.f3424e;
        if (i2 >= F3) {
            return s(objArr, i2 - F3, obj);
        }
        C1294c c1294c = new C1294c((Object) null);
        return s(h(objArr, this.f3427k, i2, obj, c1294c), 0, c1294c.f11388d);
    }
}
