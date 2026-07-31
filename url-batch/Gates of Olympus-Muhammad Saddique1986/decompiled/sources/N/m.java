package N;

import I.C0143d;
import I.W;
import h2.AbstractC0508a;
import java.util.Arrays;
import k2.C0570b;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: e, reason: collision with root package name */
    public static final m f3521e = new m(0, 0, new Object[0], null);

    /* renamed from: a, reason: collision with root package name */
    public int f3522a;

    /* renamed from: b, reason: collision with root package name */
    public int f3523b;

    /* renamed from: c, reason: collision with root package name */
    public final P.b f3524c;

    /* renamed from: d, reason: collision with root package name */
    public Object[] f3525d;

    public m(int i3, int i4, Object[] objArr, P.b bVar) {
        this.f3522a = i3;
        this.f3523b = i4;
        this.f3524c = bVar;
        this.f3525d = objArr;
    }

    public static m j(int i3, Object obj, Object obj2, int i4, Object obj3, Object obj4, int i5, P.b bVar) {
        if (i5 > 30) {
            return new m(0, 0, new Object[]{obj, obj2, obj3, obj4}, bVar);
        }
        int I3 = AbstractC0508a.I(i3, i5);
        int I4 = AbstractC0508a.I(i4, i5);
        if (I3 != I4) {
            return new m((1 << I3) | (1 << I4), 0, I3 < I4 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, bVar);
        }
        return new m(0, 1 << I3, new Object[]{j(i3, obj, obj2, i4, obj3, obj4, i5 + 5, bVar)}, bVar);
    }

    public final Object[] a(int i3, int i4, int i5, Object obj, Object obj2, int i6, P.b bVar) {
        Object obj3 = this.f3525d[i3];
        m j3 = j(obj3 != null ? obj3.hashCode() : 0, obj3, x(i3), i5, obj, obj2, i6 + 5, bVar);
        int t3 = t(i4);
        int i7 = t3 + 1;
        Object[] objArr = this.f3525d;
        Object[] objArr2 = new Object[objArr.length - 1];
        S1.k.o0(objArr, objArr2, 0, i3, 6);
        S1.k.m0(objArr, objArr2, i3, i3 + 2, i7);
        objArr2[t3 - 1] = j3;
        S1.k.m0(objArr, objArr2, t3, i7, objArr.length);
        return objArr2;
    }

    public final int b() {
        if (this.f3523b == 0) {
            return this.f3525d.length / 2;
        }
        int bitCount = Integer.bitCount(this.f3522a);
        int length = this.f3525d.length;
        for (int i3 = bitCount * 2; i3 < length; i3++) {
            bitCount += s(i3).b();
        }
        return bitCount;
    }

    public final boolean c(Object obj) {
        C0570b e02 = O2.d.e0(O2.d.g0(0, this.f3525d.length), 2);
        int i3 = e02.f6419d;
        int i4 = e02.f6420e;
        int i5 = e02.f6421f;
        if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
            while (!f2.j.a(obj, this.f3525d[i3])) {
                if (i3 != i4) {
                    i3 += i5;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(int i3, int i4, Object obj) {
        int I3 = 1 << AbstractC0508a.I(i3, i4);
        if (h(I3)) {
            return f2.j.a(obj, this.f3525d[f(I3)]);
        }
        if (!i(I3)) {
            return false;
        }
        m s3 = s(t(I3));
        return i4 == 30 ? s3.c(obj) : s3.d(i3, i4 + 5, obj);
    }

    public final boolean e(m mVar) {
        if (this == mVar) {
            return true;
        }
        if (this.f3523b != mVar.f3523b || this.f3522a != mVar.f3522a) {
            return false;
        }
        int length = this.f3525d.length;
        for (int i3 = 0; i3 < length; i3++) {
            if (this.f3525d[i3] != mVar.f3525d[i3]) {
                return false;
            }
        }
        return true;
    }

    public final int f(int i3) {
        return Integer.bitCount((i3 - 1) & this.f3522a) * 2;
    }

    public final Object g(int i3, int i4, Object obj) {
        int I3 = 1 << AbstractC0508a.I(i3, i4);
        if (h(I3)) {
            int f3 = f(I3);
            if (f2.j.a(obj, this.f3525d[f3])) {
                return x(f3);
            }
            return null;
        }
        if (!i(I3)) {
            return null;
        }
        m s3 = s(t(I3));
        if (i4 != 30) {
            return s3.g(i3, i4 + 5, obj);
        }
        C0570b e02 = O2.d.e0(O2.d.g0(0, s3.f3525d.length), 2);
        int i5 = e02.f6419d;
        int i6 = e02.f6420e;
        int i7 = e02.f6421f;
        if ((i7 <= 0 || i5 > i6) && (i7 >= 0 || i6 > i5)) {
            return null;
        }
        while (!f2.j.a(obj, s3.f3525d[i5])) {
            if (i5 == i6) {
                return null;
            }
            i5 += i7;
        }
        return s3.x(i5);
    }

    public final boolean h(int i3) {
        return (i3 & this.f3522a) != 0;
    }

    public final boolean i(int i3) {
        return (i3 & this.f3523b) != 0;
    }

    public final m k(int i3, Q.c cVar) {
        cVar.getClass();
        cVar.e(cVar.f3952h - 1);
        cVar.f3950f = x(i3);
        Object[] objArr = this.f3525d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f3524c != cVar.f3948d) {
            return new m(0, 0, AbstractC0508a.m(objArr, i3), cVar.f3948d);
        }
        this.f3525d = AbstractC0508a.m(objArr, i3);
        return this;
    }

    public final m l(int i3, Object obj, Object obj2, int i4, Q.c cVar) {
        m l3;
        int I3 = 1 << AbstractC0508a.I(i3, i4);
        boolean h3 = h(I3);
        P.b bVar = this.f3524c;
        if (h3) {
            int f3 = f(I3);
            if (!f2.j.a(obj, this.f3525d[f3])) {
                cVar.getClass();
                cVar.e(cVar.f3952h + 1);
                P.b bVar2 = cVar.f3948d;
                if (bVar != bVar2) {
                    return new m(this.f3522a ^ I3, this.f3523b | I3, a(f3, I3, i3, obj, obj2, i4, bVar2), bVar2);
                }
                this.f3525d = a(f3, I3, i3, obj, obj2, i4, bVar2);
                this.f3522a ^= I3;
                this.f3523b |= I3;
                return this;
            }
            cVar.f3950f = x(f3);
            if (x(f3) == obj2) {
                return this;
            }
            if (bVar == cVar.f3948d) {
                this.f3525d[f3 + 1] = obj2;
                return this;
            }
            cVar.f3951g++;
            Object[] objArr = this.f3525d;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            f2.j.e(copyOf, "copyOf(this, size)");
            copyOf[f3 + 1] = obj2;
            return new m(this.f3522a, this.f3523b, copyOf, cVar.f3948d);
        }
        if (!i(I3)) {
            cVar.getClass();
            cVar.e(cVar.f3952h + 1);
            P.b bVar3 = cVar.f3948d;
            int f4 = f(I3);
            if (bVar != bVar3) {
                return new m(this.f3522a | I3, this.f3523b, AbstractC0508a.l(this.f3525d, f4, obj, obj2), bVar3);
            }
            this.f3525d = AbstractC0508a.l(this.f3525d, f4, obj, obj2);
            this.f3522a |= I3;
            return this;
        }
        int t3 = t(I3);
        m s3 = s(t3);
        if (i4 == 30) {
            C0570b e02 = O2.d.e0(O2.d.g0(0, s3.f3525d.length), 2);
            int i5 = e02.f6419d;
            int i6 = e02.f6420e;
            int i7 = e02.f6421f;
            if ((i7 > 0 && i5 <= i6) || (i7 < 0 && i6 <= i5)) {
                while (!f2.j.a(obj, s3.f3525d[i5])) {
                    if (i5 != i6) {
                        i5 += i7;
                    }
                }
                cVar.f3950f = s3.x(i5);
                if (s3.f3524c == cVar.f3948d) {
                    s3.f3525d[i5 + 1] = obj2;
                    l3 = s3;
                } else {
                    cVar.f3951g++;
                    Object[] objArr2 = s3.f3525d;
                    Object[] copyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                    f2.j.e(copyOf2, "copyOf(this, size)");
                    copyOf2[i5 + 1] = obj2;
                    l3 = new m(0, 0, copyOf2, cVar.f3948d);
                }
            }
            cVar.getClass();
            cVar.e(cVar.f3952h + 1);
            l3 = new m(0, 0, AbstractC0508a.l(s3.f3525d, 0, obj, obj2), cVar.f3948d);
            break;
        }
        l3 = s3.l(i3, obj, obj2, i4 + 5, cVar);
        return s3 == l3 ? this : r(t3, l3, cVar.f3948d);
    }

    public final m m(m mVar, int i3, P.a aVar, Q.c cVar) {
        Object[] objArr;
        int i4;
        m j3;
        if (this == mVar) {
            aVar.f3912a += b();
            return this;
        }
        int i5 = 0;
        if (i3 > 30) {
            P.b bVar = cVar.f3948d;
            int i6 = mVar.f3523b;
            Object[] objArr2 = this.f3525d;
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length + mVar.f3525d.length);
            f2.j.e(copyOf, "copyOf(this, newSize)");
            int length = this.f3525d.length;
            C0570b e02 = O2.d.e0(O2.d.g0(0, mVar.f3525d.length), 2);
            int i7 = e02.f6419d;
            int i8 = e02.f6420e;
            int i9 = e02.f6421f;
            if ((i9 > 0 && i7 <= i8) || (i9 < 0 && i8 <= i7)) {
                while (true) {
                    if (c(mVar.f3525d[i7])) {
                        aVar.f3912a++;
                    } else {
                        Object[] objArr3 = mVar.f3525d;
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
            if (length == this.f3525d.length) {
                return this;
            }
            if (length == mVar.f3525d.length) {
                return mVar;
            }
            if (length == copyOf.length) {
                return new m(0, 0, copyOf, bVar);
            }
            Object[] copyOf2 = Arrays.copyOf(copyOf, length);
            f2.j.e(copyOf2, "copyOf(this, newSize)");
            return new m(0, 0, copyOf2, bVar);
        }
        int i10 = this.f3523b | mVar.f3523b;
        int i11 = this.f3522a;
        int i12 = mVar.f3522a;
        int i13 = (i11 ^ i12) & (~i10);
        int i14 = i11 & i12;
        int i15 = i13;
        while (i14 != 0) {
            int lowestOneBit = Integer.lowestOneBit(i14);
            if (f2.j.a(this.f3525d[f(lowestOneBit)], mVar.f3525d[mVar.f(lowestOneBit)])) {
                i15 |= lowestOneBit;
            } else {
                i10 |= lowestOneBit;
            }
            i14 ^= lowestOneBit;
        }
        if (!((i10 & i15) == 0)) {
            C0143d.T("Check failed.");
            throw null;
        }
        m mVar2 = (f2.j.a(this.f3524c, cVar.f3948d) && this.f3522a == i15 && this.f3523b == i10) ? this : new m(i15, i10, new Object[Integer.bitCount(i10) + (Integer.bitCount(i15) * 2)], null);
        int i16 = i10;
        int i17 = 0;
        while (i16 != 0) {
            int lowestOneBit2 = Integer.lowestOneBit(i16);
            Object[] objArr4 = mVar2.f3525d;
            int length2 = (objArr4.length - 1) - i17;
            if (i(lowestOneBit2)) {
                j3 = s(t(lowestOneBit2));
                if (mVar.i(lowestOneBit2)) {
                    j3 = j3.m(mVar.s(mVar.t(lowestOneBit2)), i3 + 5, aVar, cVar);
                } else if (mVar.h(lowestOneBit2)) {
                    int f3 = mVar.f(lowestOneBit2);
                    Object obj = mVar.f3525d[f3];
                    Object x3 = mVar.x(f3);
                    int i18 = cVar.f3952h;
                    objArr = objArr4;
                    j3 = j3.l(obj != null ? obj.hashCode() : i5, obj, x3, i3 + 5, cVar);
                    if (cVar.f3952h == i18) {
                        aVar.f3912a++;
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
                        Object obj2 = this.f3525d[f4];
                        int i19 = i3 + 5;
                        if (j3.d(obj2 != null ? obj2.hashCode() : 0, i19, obj2)) {
                            aVar.f3912a++;
                        } else {
                            j3 = j3.l(obj2 != null ? obj2.hashCode() : 0, obj2, x(f4), i19, cVar);
                        }
                    }
                } else {
                    int f5 = f(i4);
                    Object obj3 = this.f3525d[f5];
                    Object x4 = x(f5);
                    int f6 = mVar.f(i4);
                    Object obj4 = mVar.f3525d[f6];
                    j3 = j(obj3 != null ? obj3.hashCode() : 0, obj3, x4, obj4 != null ? obj4.hashCode() : 0, obj4, mVar.x(f6), i3 + 5, cVar.f3948d);
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
                Object[] objArr5 = mVar2.f3525d;
                objArr5[i21] = mVar.f3525d[f7];
                objArr5[i21 + 1] = mVar.x(f7);
                if (h(lowestOneBit3)) {
                    aVar.f3912a++;
                }
            } else {
                int f8 = f(lowestOneBit3);
                Object[] objArr6 = mVar2.f3525d;
                objArr6[i21] = this.f3525d[f8];
                objArr6[i21 + 1] = x(f8);
            }
            i20++;
            i15 ^= lowestOneBit3;
        }
        return e(mVar2) ? this : mVar.e(mVar2) ? mVar : mVar2;
    }

    public final m n(int i3, Object obj, int i4, Q.c cVar) {
        m n3;
        int I3 = 1 << AbstractC0508a.I(i3, i4);
        if (h(I3)) {
            int f3 = f(I3);
            return f2.j.a(obj, this.f3525d[f3]) ? p(f3, I3, cVar) : this;
        }
        if (!i(I3)) {
            return this;
        }
        int t3 = t(I3);
        m s3 = s(t3);
        if (i4 == 30) {
            C0570b e02 = O2.d.e0(O2.d.g0(0, s3.f3525d.length), 2);
            int i5 = e02.f6419d;
            int i6 = e02.f6420e;
            int i7 = e02.f6421f;
            if ((i7 > 0 && i5 <= i6) || (i7 < 0 && i6 <= i5)) {
                while (!f2.j.a(obj, s3.f3525d[i5])) {
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
        return q(s3, n3, t3, I3, cVar.f3948d);
    }

    public final m o(int i3, Object obj, Object obj2, int i4, Q.c cVar) {
        m o3;
        int I3 = 1 << AbstractC0508a.I(i3, i4);
        if (h(I3)) {
            int f3 = f(I3);
            return (f2.j.a(obj, this.f3525d[f3]) && f2.j.a(obj2, x(f3))) ? p(f3, I3, cVar) : this;
        }
        if (!i(I3)) {
            return this;
        }
        int t3 = t(I3);
        m s3 = s(t3);
        if (i4 == 30) {
            C0570b e02 = O2.d.e0(O2.d.g0(0, s3.f3525d.length), 2);
            int i5 = e02.f6419d;
            int i6 = e02.f6420e;
            int i7 = e02.f6421f;
            if ((i7 > 0 && i5 <= i6) || (i7 < 0 && i6 <= i5)) {
                while (true) {
                    if (!f2.j.a(obj, s3.f3525d[i5]) || !f2.j.a(obj2, s3.x(i5))) {
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
        return q(s3, o3, t3, I3, cVar.f3948d);
    }

    public final m p(int i3, int i4, Q.c cVar) {
        cVar.getClass();
        cVar.e(cVar.f3952h - 1);
        cVar.f3950f = x(i3);
        Object[] objArr = this.f3525d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f3524c != cVar.f3948d) {
            return new m(i4 ^ this.f3522a, this.f3523b, AbstractC0508a.m(objArr, i3), cVar.f3948d);
        }
        this.f3525d = AbstractC0508a.m(objArr, i3);
        this.f3522a ^= i4;
        return this;
    }

    public final m q(m mVar, m mVar2, int i3, int i4, P.b bVar) {
        P.b bVar2 = this.f3524c;
        if (mVar2 == null) {
            Object[] objArr = this.f3525d;
            if (objArr.length == 1) {
                return null;
            }
            if (bVar2 != bVar) {
                return new m(this.f3522a, i4 ^ this.f3523b, AbstractC0508a.n(objArr, i3), bVar);
            }
            this.f3525d = AbstractC0508a.n(objArr, i3);
            this.f3523b ^= i4;
        } else if (bVar2 == bVar || mVar != mVar2) {
            return r(i3, mVar2, bVar);
        }
        return this;
    }

    public final m r(int i3, m mVar, P.b bVar) {
        Object[] objArr = this.f3525d;
        if (objArr.length == 1 && mVar.f3525d.length == 2 && mVar.f3523b == 0) {
            mVar.f3522a = this.f3523b;
            return mVar;
        }
        if (this.f3524c == bVar) {
            objArr[i3] = mVar;
            return this;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        f2.j.e(copyOf, "copyOf(this, size)");
        copyOf[i3] = mVar;
        return new m(this.f3522a, this.f3523b, copyOf, bVar);
    }

    public final m s(int i3) {
        Object obj = this.f3525d[i3];
        f2.j.d(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        return (m) obj;
    }

    public final int t(int i3) {
        return (this.f3525d.length - 1) - Integer.bitCount((i3 - 1) & this.f3523b);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00cf A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final K2.m u(int i3, int i4, Object obj, Object obj2) {
        K2.m u3;
        int i5 = 1;
        int I3 = 1 << AbstractC0508a.I(i3, i4);
        int i6 = 0;
        if (h(I3)) {
            int f3 = f(I3);
            if (!f2.j.a(obj, this.f3525d[f3])) {
                return new K2.m(i5, 1, new m(this.f3522a ^ I3, this.f3523b | I3, a(f3, I3, i3, obj, obj2, i4, null), null));
            }
            if (x(f3) == obj2) {
                return null;
            }
            Object[] objArr = this.f3525d;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            f2.j.e(copyOf, "copyOf(this, size)");
            copyOf[f3 + 1] = obj2;
            return new K2.m(i6, 1, new m(this.f3522a, this.f3523b, copyOf, null));
        }
        if (!i(I3)) {
            return new K2.m(i5, 1, new m(this.f3522a | I3, this.f3523b, AbstractC0508a.l(this.f3525d, f(I3), obj, obj2), null));
        }
        int t3 = t(I3);
        m s3 = s(t3);
        if (i4 == 30) {
            C0570b e02 = O2.d.e0(O2.d.g0(0, s3.f3525d.length), 2);
            int i7 = e02.f6419d;
            int i8 = e02.f6420e;
            int i9 = e02.f6421f;
            if ((i9 > 0 && i7 <= i8) || (i9 < 0 && i8 <= i7)) {
                while (!f2.j.a(obj, s3.f3525d[i7])) {
                    if (i7 != i8) {
                        i7 += i9;
                    }
                }
                if (obj2 == s3.x(i7)) {
                    u3 = null;
                } else {
                    Object[] objArr2 = s3.f3525d;
                    Object[] copyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                    f2.j.e(copyOf2, "copyOf(this, size)");
                    copyOf2[i7 + 1] = obj2;
                    u3 = new K2.m(i6, 1, new m(0, 0, copyOf2, null));
                }
                if (u3 == null) {
                    return null;
                }
            }
            u3 = new K2.m(i5, 1, new m(0, 0, AbstractC0508a.l(s3.f3525d, 0, obj, obj2), null));
            if (u3 == null) {
            }
        } else {
            u3 = s3.u(i3, i4 + 5, obj, obj2);
            if (u3 == null) {
                return null;
            }
        }
        u3.f3331c = w(t3, I3, (m) u3.f3331c);
        return u3;
    }

    public final m v(int i3, W w2, int i4) {
        m v3;
        int I3 = 1 << AbstractC0508a.I(i3, i4);
        if (h(I3)) {
            int f3 = f(I3);
            if (!f2.j.a(w2, this.f3525d[f3])) {
                return this;
            }
            Object[] objArr = this.f3525d;
            if (objArr.length == 2) {
                return null;
            }
            return new m(this.f3522a ^ I3, this.f3523b, AbstractC0508a.m(objArr, f3), null);
        }
        if (!i(I3)) {
            return this;
        }
        int t3 = t(I3);
        m s3 = s(t3);
        if (i4 == 30) {
            C0570b e02 = O2.d.e0(O2.d.g0(0, s3.f3525d.length), 2);
            int i5 = e02.f6419d;
            int i6 = e02.f6420e;
            int i7 = e02.f6421f;
            if ((i7 > 0 && i5 <= i6) || (i7 < 0 && i6 <= i5)) {
                while (!f2.j.a(w2, s3.f3525d[i5])) {
                    if (i5 != i6) {
                        i5 += i7;
                    }
                }
                Object[] objArr2 = s3.f3525d;
                v3 = objArr2.length == 2 ? null : new m(0, 0, AbstractC0508a.m(objArr2, i5), null);
            }
            v3 = s3;
            break;
        }
        v3 = s3.v(i3, w2, i4 + 5);
        if (v3 != null) {
            return s3 != v3 ? w(t3, I3, v3) : this;
        }
        Object[] objArr3 = this.f3525d;
        if (objArr3.length == 1) {
            return null;
        }
        return new m(this.f3522a, I3 ^ this.f3523b, AbstractC0508a.n(objArr3, t3), null);
    }

    public final m w(int i3, int i4, m mVar) {
        Object[] objArr = mVar.f3525d;
        if (objArr.length != 2 || mVar.f3523b != 0) {
            Object[] objArr2 = this.f3525d;
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length);
            f2.j.e(copyOf, "copyOf(this, newSize)");
            copyOf[i3] = mVar;
            return new m(this.f3522a, this.f3523b, copyOf, null);
        }
        if (this.f3525d.length == 1) {
            mVar.f3522a = this.f3523b;
            return mVar;
        }
        int f3 = f(i4);
        Object[] objArr3 = this.f3525d;
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        Object[] copyOf2 = Arrays.copyOf(objArr3, objArr3.length + 1);
        f2.j.e(copyOf2, "copyOf(this, newSize)");
        S1.k.m0(copyOf2, copyOf2, i3 + 2, i3 + 1, objArr3.length);
        S1.k.m0(copyOf2, copyOf2, f3 + 2, f3, i3);
        copyOf2[f3] = obj;
        copyOf2[f3 + 1] = obj2;
        return new m(this.f3522a ^ i4, i4 ^ this.f3523b, copyOf2, null);
    }

    public final Object x(int i3) {
        return this.f3525d[i3 + 1];
    }
}
