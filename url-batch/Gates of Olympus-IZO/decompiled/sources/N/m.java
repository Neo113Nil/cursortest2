package N;

import I.C0089d;
import I.X;
import a.AbstractC0157a;
import e2.AbstractC0381e;
import e2.C0378b;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: e, reason: collision with root package name */
    public static final m f2839e = new m(0, 0, new Object[0], null);

    /* renamed from: a, reason: collision with root package name */
    public int f2840a;

    /* renamed from: b, reason: collision with root package name */
    public int f2841b;

    /* renamed from: c, reason: collision with root package name */
    public final P.b f2842c;

    /* renamed from: d, reason: collision with root package name */
    public Object[] f2843d;

    public m(int i3, int i4, Object[] objArr, P.b bVar) {
        this.f2840a = i3;
        this.f2841b = i4;
        this.f2842c = bVar;
        this.f2843d = objArr;
    }

    public static m j(int i3, Object obj, Object obj2, int i4, Object obj3, Object obj4, int i5, P.b bVar) {
        if (i5 > 30) {
            return new m(0, 0, new Object[]{obj, obj2, obj3, obj4}, bVar);
        }
        int J3 = AbstractC0157a.J(i3, i5);
        int J4 = AbstractC0157a.J(i4, i5);
        if (J3 != J4) {
            return new m((1 << J3) | (1 << J4), 0, J3 < J4 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, bVar);
        }
        return new m(0, 1 << J3, new Object[]{j(i3, obj, obj2, i4, obj3, obj4, i5 + 5, bVar)}, bVar);
    }

    public final Object[] a(int i3, int i4, int i5, Object obj, Object obj2, int i6, P.b bVar) {
        Object obj3 = this.f2843d[i3];
        m j3 = j(obj3 != null ? obj3.hashCode() : 0, obj3, x(i3), i5, obj, obj2, i6 + 5, bVar);
        int t3 = t(i4);
        int i7 = t3 + 1;
        Object[] objArr = this.f2843d;
        Object[] objArr2 = new Object[objArr.length - 1];
        M1.k.Z(objArr, objArr2, 0, i3, 6);
        M1.k.X(objArr, objArr2, i3, i3 + 2, i7);
        objArr2[t3 - 1] = j3;
        M1.k.X(objArr, objArr2, t3, i7, objArr.length);
        return objArr2;
    }

    public final int b() {
        if (this.f2841b == 0) {
            return this.f2843d.length / 2;
        }
        int bitCount = Integer.bitCount(this.f2840a);
        int length = this.f2843d.length;
        for (int i3 = bitCount * 2; i3 < length; i3++) {
            bitCount += s(i3).b();
        }
        return bitCount;
    }

    public final boolean c(Object obj) {
        C0378b L2 = AbstractC0381e.L(AbstractC0381e.Q(0, this.f2843d.length), 2);
        int i3 = L2.f4768d;
        int i4 = L2.f4769e;
        int i5 = L2.f4770f;
        if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
            while (!Z1.i.a(obj, this.f2843d[i3])) {
                if (i3 != i4) {
                    i3 += i5;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(int i3, Object obj, int i4) {
        int J3 = 1 << AbstractC0157a.J(i3, i4);
        if (h(J3)) {
            return Z1.i.a(obj, this.f2843d[f(J3)]);
        }
        if (!i(J3)) {
            return false;
        }
        m s3 = s(t(J3));
        return i4 == 30 ? s3.c(obj) : s3.d(i3, obj, i4 + 5);
    }

    public final boolean e(m mVar) {
        if (this == mVar) {
            return true;
        }
        if (this.f2841b != mVar.f2841b || this.f2840a != mVar.f2840a) {
            return false;
        }
        int length = this.f2843d.length;
        for (int i3 = 0; i3 < length; i3++) {
            if (this.f2843d[i3] != mVar.f2843d[i3]) {
                return false;
            }
        }
        return true;
    }

    public final int f(int i3) {
        return Integer.bitCount((i3 - 1) & this.f2840a) * 2;
    }

    public final Object g(int i3, Object obj, int i4) {
        int J3 = 1 << AbstractC0157a.J(i3, i4);
        if (h(J3)) {
            int f3 = f(J3);
            if (Z1.i.a(obj, this.f2843d[f3])) {
                return x(f3);
            }
            return null;
        }
        if (!i(J3)) {
            return null;
        }
        m s3 = s(t(J3));
        if (i4 != 30) {
            return s3.g(i3, obj, i4 + 5);
        }
        C0378b L2 = AbstractC0381e.L(AbstractC0381e.Q(0, s3.f2843d.length), 2);
        int i5 = L2.f4768d;
        int i6 = L2.f4769e;
        int i7 = L2.f4770f;
        if ((i7 <= 0 || i5 > i6) && (i7 >= 0 || i6 > i5)) {
            return null;
        }
        while (!Z1.i.a(obj, s3.f2843d[i5])) {
            if (i5 == i6) {
                return null;
            }
            i5 += i7;
        }
        return s3.x(i5);
    }

    public final boolean h(int i3) {
        return (i3 & this.f2840a) != 0;
    }

    public final boolean i(int i3) {
        return (i3 & this.f2841b) != 0;
    }

    public final m k(int i3, Q.c cVar) {
        cVar.getClass();
        cVar.e(cVar.f3086h - 1);
        cVar.f3084f = x(i3);
        Object[] objArr = this.f2843d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f2842c != cVar.f3082d) {
            return new m(0, 0, AbstractC0157a.h(objArr, i3), cVar.f3082d);
        }
        this.f2843d = AbstractC0157a.h(objArr, i3);
        return this;
    }

    public final m l(int i3, Object obj, Object obj2, int i4, Q.c cVar) {
        m l3;
        int J3 = 1 << AbstractC0157a.J(i3, i4);
        boolean h3 = h(J3);
        P.b bVar = this.f2842c;
        if (h3) {
            int f3 = f(J3);
            if (!Z1.i.a(obj, this.f2843d[f3])) {
                cVar.getClass();
                cVar.e(cVar.f3086h + 1);
                P.b bVar2 = cVar.f3082d;
                if (bVar != bVar2) {
                    return new m(this.f2840a ^ J3, this.f2841b | J3, a(f3, J3, i3, obj, obj2, i4, bVar2), bVar2);
                }
                this.f2843d = a(f3, J3, i3, obj, obj2, i4, bVar2);
                this.f2840a ^= J3;
                this.f2841b |= J3;
                return this;
            }
            cVar.f3084f = x(f3);
            if (x(f3) == obj2) {
                return this;
            }
            if (bVar == cVar.f3082d) {
                this.f2843d[f3 + 1] = obj2;
                return this;
            }
            cVar.f3085g++;
            Object[] objArr = this.f2843d;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            Z1.i.e(copyOf, "copyOf(this, size)");
            copyOf[f3 + 1] = obj2;
            return new m(this.f2840a, this.f2841b, copyOf, cVar.f3082d);
        }
        if (!i(J3)) {
            cVar.getClass();
            cVar.e(cVar.f3086h + 1);
            P.b bVar3 = cVar.f3082d;
            int f4 = f(J3);
            if (bVar != bVar3) {
                return new m(this.f2840a | J3, this.f2841b, AbstractC0157a.g(this.f2843d, f4, obj, obj2), bVar3);
            }
            this.f2843d = AbstractC0157a.g(this.f2843d, f4, obj, obj2);
            this.f2840a |= J3;
            return this;
        }
        int t3 = t(J3);
        m s3 = s(t3);
        if (i4 == 30) {
            C0378b L2 = AbstractC0381e.L(AbstractC0381e.Q(0, s3.f2843d.length), 2);
            int i5 = L2.f4768d;
            int i6 = L2.f4769e;
            int i7 = L2.f4770f;
            if ((i7 > 0 && i5 <= i6) || (i7 < 0 && i6 <= i5)) {
                while (!Z1.i.a(obj, s3.f2843d[i5])) {
                    if (i5 != i6) {
                        i5 += i7;
                    }
                }
                cVar.f3084f = s3.x(i5);
                if (s3.f2842c == cVar.f3082d) {
                    s3.f2843d[i5 + 1] = obj2;
                    l3 = s3;
                } else {
                    cVar.f3085g++;
                    Object[] objArr2 = s3.f2843d;
                    Object[] copyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                    Z1.i.e(copyOf2, "copyOf(this, size)");
                    copyOf2[i5 + 1] = obj2;
                    l3 = new m(0, 0, copyOf2, cVar.f3082d);
                }
            }
            cVar.getClass();
            cVar.e(cVar.f3086h + 1);
            l3 = new m(0, 0, AbstractC0157a.g(s3.f2843d, 0, obj, obj2), cVar.f3082d);
            break;
        }
        l3 = s3.l(i3, obj, obj2, i4 + 5, cVar);
        return s3 == l3 ? this : r(t3, l3, cVar.f3082d);
    }

    public final m m(m mVar, int i3, P.a aVar, Q.c cVar) {
        Object[] objArr;
        int i4;
        m j3;
        if (this == mVar) {
            aVar.f3019a += b();
            return this;
        }
        int i5 = 0;
        if (i3 > 30) {
            P.b bVar = cVar.f3082d;
            int i6 = mVar.f2841b;
            Object[] objArr2 = this.f2843d;
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length + mVar.f2843d.length);
            Z1.i.e(copyOf, "copyOf(this, newSize)");
            int length = this.f2843d.length;
            C0378b L2 = AbstractC0381e.L(AbstractC0381e.Q(0, mVar.f2843d.length), 2);
            int i7 = L2.f4768d;
            int i8 = L2.f4769e;
            int i9 = L2.f4770f;
            if ((i9 > 0 && i7 <= i8) || (i9 < 0 && i8 <= i7)) {
                while (true) {
                    if (c(mVar.f2843d[i7])) {
                        aVar.f3019a++;
                    } else {
                        Object[] objArr3 = mVar.f2843d;
                        copyOf[length] = objArr3[i7];
                        copyOf[length + 1] = objArr3[i7 + 1];
                        length += 2;
                    }
                    if (i7 == i8) {
                        break;
                    }
                    i7 += i9;
                }
            }
            if (length == this.f2843d.length) {
                return this;
            }
            if (length == mVar.f2843d.length) {
                return mVar;
            }
            if (length == copyOf.length) {
                return new m(0, 0, copyOf, bVar);
            }
            Object[] copyOf2 = Arrays.copyOf(copyOf, length);
            Z1.i.e(copyOf2, "copyOf(this, newSize)");
            return new m(0, 0, copyOf2, bVar);
        }
        int i10 = this.f2841b | mVar.f2841b;
        int i11 = this.f2840a;
        int i12 = mVar.f2840a;
        int i13 = (i11 ^ i12) & (~i10);
        int i14 = i11 & i12;
        int i15 = i13;
        while (i14 != 0) {
            int lowestOneBit = Integer.lowestOneBit(i14);
            if (Z1.i.a(this.f2843d[f(lowestOneBit)], mVar.f2843d[mVar.f(lowestOneBit)])) {
                i15 |= lowestOneBit;
            } else {
                i10 |= lowestOneBit;
            }
            i14 ^= lowestOneBit;
        }
        if (!((i10 & i15) == 0)) {
            C0089d.S("Check failed.");
            throw null;
        }
        m mVar2 = (Z1.i.a(this.f2842c, cVar.f3082d) && this.f2840a == i15 && this.f2841b == i10) ? this : new m(i15, i10, new Object[Integer.bitCount(i10) + (Integer.bitCount(i15) * 2)], null);
        int i16 = i10;
        int i17 = 0;
        while (i16 != 0) {
            int lowestOneBit2 = Integer.lowestOneBit(i16);
            Object[] objArr4 = mVar2.f2843d;
            int length2 = (objArr4.length - 1) - i17;
            if (i(lowestOneBit2)) {
                j3 = s(t(lowestOneBit2));
                if (mVar.i(lowestOneBit2)) {
                    j3 = j3.m(mVar.s(mVar.t(lowestOneBit2)), i3 + 5, aVar, cVar);
                } else if (mVar.h(lowestOneBit2)) {
                    int f3 = mVar.f(lowestOneBit2);
                    Object obj = mVar.f2843d[f3];
                    Object x3 = mVar.x(f3);
                    int i18 = cVar.f3086h;
                    objArr = objArr4;
                    j3 = j3.l(obj != null ? obj.hashCode() : i5, obj, x3, i3 + 5, cVar);
                    if (cVar.f3086h == i18) {
                        aVar.f3019a++;
                    }
                    i4 = lowestOneBit2;
                }
                objArr = objArr4;
                i4 = lowestOneBit2;
            } else {
                objArr = objArr4;
                i4 = lowestOneBit2;
                if (mVar.i(i4)) {
                    j3 = mVar.s(mVar.t(i4));
                    if (h(i4)) {
                        int f4 = f(i4);
                        Object obj2 = this.f2843d[f4];
                        int i19 = i3 + 5;
                        if (j3.d(obj2 != null ? obj2.hashCode() : 0, obj2, i19)) {
                            aVar.f3019a++;
                        } else {
                            j3 = j3.l(obj2 != null ? obj2.hashCode() : 0, obj2, x(f4), i19, cVar);
                        }
                    }
                } else {
                    int f5 = f(i4);
                    Object obj3 = this.f2843d[f5];
                    Object x4 = x(f5);
                    int f6 = mVar.f(i4);
                    Object obj4 = mVar.f2843d[f6];
                    j3 = j(obj3 != null ? obj3.hashCode() : 0, obj3, x4, obj4 != null ? obj4.hashCode() : 0, obj4, mVar.x(f6), i3 + 5, cVar.f3082d);
                }
            }
            objArr[length2] = j3;
            i17++;
            i16 ^= i4;
            i5 = 0;
        }
        int i20 = 0;
        while (i15 != 0) {
            int lowestOneBit3 = Integer.lowestOneBit(i15);
            int i21 = i20 * 2;
            if (mVar.h(lowestOneBit3)) {
                int f7 = mVar.f(lowestOneBit3);
                Object[] objArr5 = mVar2.f2843d;
                objArr5[i21] = mVar.f2843d[f7];
                objArr5[i21 + 1] = mVar.x(f7);
                if (h(lowestOneBit3)) {
                    aVar.f3019a++;
                }
            } else {
                int f8 = f(lowestOneBit3);
                Object[] objArr6 = mVar2.f2843d;
                objArr6[i21] = this.f2843d[f8];
                objArr6[i21 + 1] = x(f8);
            }
            i20++;
            i15 ^= lowestOneBit3;
        }
        return e(mVar2) ? this : mVar.e(mVar2) ? mVar : mVar2;
    }

    public final m n(int i3, Object obj, int i4, Q.c cVar) {
        m n3;
        int J3 = 1 << AbstractC0157a.J(i3, i4);
        if (h(J3)) {
            int f3 = f(J3);
            return Z1.i.a(obj, this.f2843d[f3]) ? p(f3, J3, cVar) : this;
        }
        if (!i(J3)) {
            return this;
        }
        int t3 = t(J3);
        m s3 = s(t3);
        if (i4 == 30) {
            C0378b L2 = AbstractC0381e.L(AbstractC0381e.Q(0, s3.f2843d.length), 2);
            int i5 = L2.f4768d;
            int i6 = L2.f4769e;
            int i7 = L2.f4770f;
            if ((i7 > 0 && i5 <= i6) || (i7 < 0 && i6 <= i5)) {
                while (!Z1.i.a(obj, s3.f2843d[i5])) {
                    if (i5 != i6) {
                        i5 += i7;
                    }
                }
                n3 = s3.k(i5, cVar);
            }
            n3 = s3;
            break;
        }
        n3 = s3.n(i3, obj, i4 + 5, cVar);
        return q(s3, n3, t3, J3, cVar.f3082d);
    }

    public final m o(int i3, Object obj, Object obj2, int i4, Q.c cVar) {
        m o3;
        int J3 = 1 << AbstractC0157a.J(i3, i4);
        if (h(J3)) {
            int f3 = f(J3);
            return (Z1.i.a(obj, this.f2843d[f3]) && Z1.i.a(obj2, x(f3))) ? p(f3, J3, cVar) : this;
        }
        if (!i(J3)) {
            return this;
        }
        int t3 = t(J3);
        m s3 = s(t3);
        if (i4 == 30) {
            C0378b L2 = AbstractC0381e.L(AbstractC0381e.Q(0, s3.f2843d.length), 2);
            int i5 = L2.f4768d;
            int i6 = L2.f4769e;
            int i7 = L2.f4770f;
            if ((i7 > 0 && i5 <= i6) || (i7 < 0 && i6 <= i5)) {
                while (true) {
                    if (!Z1.i.a(obj, s3.f2843d[i5]) || !Z1.i.a(obj2, s3.x(i5))) {
                        if (i5 == i6) {
                            break;
                        }
                        i5 += i7;
                    } else {
                        o3 = s3.k(i5, cVar);
                        break;
                    }
                }
            }
            o3 = s3;
        } else {
            o3 = s3.o(i3, obj, obj2, i4 + 5, cVar);
        }
        return q(s3, o3, t3, J3, cVar.f3082d);
    }

    public final m p(int i3, int i4, Q.c cVar) {
        cVar.getClass();
        cVar.e(cVar.f3086h - 1);
        cVar.f3084f = x(i3);
        Object[] objArr = this.f2843d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f2842c != cVar.f3082d) {
            return new m(i4 ^ this.f2840a, this.f2841b, AbstractC0157a.h(objArr, i3), cVar.f3082d);
        }
        this.f2843d = AbstractC0157a.h(objArr, i3);
        this.f2840a ^= i4;
        return this;
    }

    public final m q(m mVar, m mVar2, int i3, int i4, P.b bVar) {
        P.b bVar2 = this.f2842c;
        if (mVar2 == null) {
            Object[] objArr = this.f2843d;
            if (objArr.length == 1) {
                return null;
            }
            if (bVar2 != bVar) {
                return new m(this.f2840a, i4 ^ this.f2841b, AbstractC0157a.i(objArr, i3), bVar);
            }
            this.f2843d = AbstractC0157a.i(objArr, i3);
            this.f2841b ^= i4;
        } else if (bVar2 == bVar || mVar != mVar2) {
            return r(i3, mVar2, bVar);
        }
        return this;
    }

    public final m r(int i3, m mVar, P.b bVar) {
        Object[] objArr = this.f2843d;
        if (objArr.length == 1 && mVar.f2843d.length == 2 && mVar.f2841b == 0) {
            mVar.f2840a = this.f2841b;
            return mVar;
        }
        if (this.f2842c == bVar) {
            objArr[i3] = mVar;
            return this;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        Z1.i.e(copyOf, "copyOf(this, size)");
        copyOf[i3] = mVar;
        return new m(this.f2840a, this.f2841b, copyOf, bVar);
    }

    public final m s(int i3) {
        Object obj = this.f2843d[i3];
        Z1.i.d(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        return (m) obj;
    }

    public final int t(int i3) {
        return (this.f2843d.length - 1) - Integer.bitCount((i3 - 1) & this.f2841b);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00cf A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final E2.n u(int i3, int i4, Object obj, Object obj2) {
        E2.n u3;
        int i5 = 1;
        int J3 = 1 << AbstractC0157a.J(i3, i4);
        int i6 = 0;
        if (h(J3)) {
            int f3 = f(J3);
            if (!Z1.i.a(obj, this.f2843d[f3])) {
                return new E2.n(new m(this.f2840a ^ J3, this.f2841b | J3, a(f3, J3, i3, obj, obj2, i4, null), null), i5, 1);
            }
            if (x(f3) == obj2) {
                return null;
            }
            Object[] objArr = this.f2843d;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            Z1.i.e(copyOf, "copyOf(this, size)");
            copyOf[f3 + 1] = obj2;
            return new E2.n(new m(this.f2840a, this.f2841b, copyOf, null), i6, 1);
        }
        if (!i(J3)) {
            return new E2.n(new m(this.f2840a | J3, this.f2841b, AbstractC0157a.g(this.f2843d, f(J3), obj, obj2), null), i5, 1);
        }
        int t3 = t(J3);
        m s3 = s(t3);
        if (i4 == 30) {
            C0378b L2 = AbstractC0381e.L(AbstractC0381e.Q(0, s3.f2843d.length), 2);
            int i7 = L2.f4768d;
            int i8 = L2.f4769e;
            int i9 = L2.f4770f;
            if ((i9 > 0 && i7 <= i8) || (i9 < 0 && i8 <= i7)) {
                while (!Z1.i.a(obj, s3.f2843d[i7])) {
                    if (i7 != i8) {
                        i7 += i9;
                    }
                }
                if (obj2 == s3.x(i7)) {
                    u3 = null;
                } else {
                    Object[] objArr2 = s3.f2843d;
                    Object[] copyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                    Z1.i.e(copyOf2, "copyOf(this, size)");
                    copyOf2[i7 + 1] = obj2;
                    u3 = new E2.n(new m(0, 0, copyOf2, null), i6, 1);
                }
                if (u3 == null) {
                    return null;
                }
            }
            u3 = new E2.n(new m(0, 0, AbstractC0157a.g(s3.f2843d, 0, obj, obj2), null), i5, 1);
            if (u3 == null) {
            }
        } else {
            u3 = s3.u(i3, i4 + 5, obj, obj2);
            if (u3 == null) {
                return null;
            }
        }
        u3.f844c = w(t3, J3, (m) u3.f844c);
        return u3;
    }

    public final m v(int i3, X x3, int i4) {
        m v3;
        int J3 = 1 << AbstractC0157a.J(i3, i4);
        if (h(J3)) {
            int f3 = f(J3);
            if (!Z1.i.a(x3, this.f2843d[f3])) {
                return this;
            }
            Object[] objArr = this.f2843d;
            if (objArr.length == 2) {
                return null;
            }
            return new m(this.f2840a ^ J3, this.f2841b, AbstractC0157a.h(objArr, f3), null);
        }
        if (!i(J3)) {
            return this;
        }
        int t3 = t(J3);
        m s3 = s(t3);
        if (i4 == 30) {
            C0378b L2 = AbstractC0381e.L(AbstractC0381e.Q(0, s3.f2843d.length), 2);
            int i5 = L2.f4768d;
            int i6 = L2.f4769e;
            int i7 = L2.f4770f;
            if ((i7 > 0 && i5 <= i6) || (i7 < 0 && i6 <= i5)) {
                while (!Z1.i.a(x3, s3.f2843d[i5])) {
                    if (i5 != i6) {
                        i5 += i7;
                    }
                }
                Object[] objArr2 = s3.f2843d;
                v3 = objArr2.length == 2 ? null : new m(0, 0, AbstractC0157a.h(objArr2, i5), null);
            }
            v3 = s3;
            break;
        }
        v3 = s3.v(i3, x3, i4 + 5);
        if (v3 != null) {
            return s3 != v3 ? w(t3, J3, v3) : this;
        }
        Object[] objArr3 = this.f2843d;
        if (objArr3.length == 1) {
            return null;
        }
        return new m(this.f2840a, J3 ^ this.f2841b, AbstractC0157a.i(objArr3, t3), null);
    }

    public final m w(int i3, int i4, m mVar) {
        Object[] objArr = mVar.f2843d;
        if (objArr.length != 2 || mVar.f2841b != 0) {
            Object[] objArr2 = this.f2843d;
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length);
            Z1.i.e(copyOf, "copyOf(this, newSize)");
            copyOf[i3] = mVar;
            return new m(this.f2840a, this.f2841b, copyOf, null);
        }
        if (this.f2843d.length == 1) {
            mVar.f2840a = this.f2841b;
            return mVar;
        }
        int f3 = f(i4);
        Object[] objArr3 = this.f2843d;
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        Object[] copyOf2 = Arrays.copyOf(objArr3, objArr3.length + 1);
        Z1.i.e(copyOf2, "copyOf(this, newSize)");
        M1.k.X(copyOf2, copyOf2, i3 + 2, i3 + 1, objArr3.length);
        M1.k.X(copyOf2, copyOf2, f3 + 2, f3, i3);
        copyOf2[f3] = obj;
        copyOf2[f3 + 1] = obj2;
        return new m(this.f2840a ^ i4, i4 ^ this.f2841b, copyOf2, null);
    }

    public final Object x(int i3) {
        return this.f2843d[i3 + 1];
    }
}
