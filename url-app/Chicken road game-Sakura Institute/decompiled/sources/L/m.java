package L;

import G.C0192d;
import G.W;
import G1.y;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import z2.C1436t;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: e, reason: collision with root package name */
    public static final m f3483e = new m(0, 0, new Object[0], null);

    /* renamed from: a, reason: collision with root package name */
    public int f3484a;

    /* renamed from: b, reason: collision with root package name */
    public int f3485b;

    /* renamed from: c, reason: collision with root package name */
    public final N.b f3486c;

    /* renamed from: d, reason: collision with root package name */
    public Object[] f3487d;

    public m(int i2, int i4, Object[] objArr, N.b bVar) {
        this.f3484a = i2;
        this.f3485b = i4;
        this.f3486c = bVar;
        this.f3487d = objArr;
    }

    public static m j(int i2, Object obj, Object obj2, int i4, Object obj3, Object obj4, int i5, N.b bVar) {
        if (i5 > 30) {
            return new m(0, 0, new Object[]{obj, obj2, obj3, obj4}, bVar);
        }
        int H3 = M1.a.H(i2, i5);
        int H4 = M1.a.H(i4, i5);
        if (H3 != H4) {
            return new m((1 << H3) | (1 << H4), 0, H3 < H4 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, bVar);
        }
        return new m(0, 1 << H3, new Object[]{j(i2, obj, obj2, i4, obj3, obj4, i5 + 5, bVar)}, bVar);
    }

    public final Object[] a(int i2, int i4, int i5, Object obj, Object obj2, int i6, N.b bVar) {
        Object obj3 = this.f3487d[i2];
        m j4 = j(obj3 != null ? obj3.hashCode() : 0, obj3, x(i2), i5, obj, obj2, i6 + 5, bVar);
        int t4 = t(i4);
        int i7 = t4 + 1;
        Object[] objArr = this.f3487d;
        Object[] objArr2 = new Object[objArr.length - 1];
        C1436t.h(objArr, objArr2, 0, i2, 6);
        C1436t.f(objArr, objArr2, i2, i2 + 2, i7);
        objArr2[t4 - 1] = j4;
        C1436t.f(objArr, objArr2, t4, i7, objArr.length);
        return objArr2;
    }

    public final int b() {
        if (this.f3485b == 0) {
            return this.f3487d.length / 2;
        }
        int bitCount = Integer.bitCount(this.f3484a);
        int length = this.f3487d.length;
        for (int i2 = bitCount * 2; i2 < length; i2++) {
            bitCount += s(i2).b();
        }
        return bitCount;
    }

    public final boolean c(Object obj) {
        kotlin.ranges.a g4 = kotlin.ranges.b.g(kotlin.ranges.b.h(0, this.f3487d.length), 2);
        int i2 = g4.f7505d;
        int i4 = g4.f7506e;
        int i5 = g4.f7507i;
        if ((i5 > 0 && i2 <= i4) || (i5 < 0 && i4 <= i2)) {
            while (!Intrinsics.a(obj, this.f3487d[i2])) {
                if (i2 != i4) {
                    i2 += i5;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(int i2, int i4, Object obj) {
        int H3 = 1 << M1.a.H(i2, i4);
        if (h(H3)) {
            return Intrinsics.a(obj, this.f3487d[f(H3)]);
        }
        if (!i(H3)) {
            return false;
        }
        m s4 = s(t(H3));
        return i4 == 30 ? s4.c(obj) : s4.d(i2, i4 + 5, obj);
    }

    public final boolean e(m mVar) {
        if (this == mVar) {
            return true;
        }
        if (this.f3485b != mVar.f3485b || this.f3484a != mVar.f3484a) {
            return false;
        }
        int length = this.f3487d.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (this.f3487d[i2] != mVar.f3487d[i2]) {
                return false;
            }
        }
        return true;
    }

    public final int f(int i2) {
        return Integer.bitCount((i2 - 1) & this.f3484a) * 2;
    }

    public final Object g(int i2, int i4, Object obj) {
        int H3 = 1 << M1.a.H(i2, i4);
        if (h(H3)) {
            int f4 = f(H3);
            if (Intrinsics.a(obj, this.f3487d[f4])) {
                return x(f4);
            }
            return null;
        }
        if (!i(H3)) {
            return null;
        }
        m s4 = s(t(H3));
        if (i4 != 30) {
            return s4.g(i2, i4 + 5, obj);
        }
        kotlin.ranges.a g4 = kotlin.ranges.b.g(kotlin.ranges.b.h(0, s4.f3487d.length), 2);
        int i5 = g4.f7505d;
        int i6 = g4.f7506e;
        int i7 = g4.f7507i;
        if ((i7 <= 0 || i5 > i6) && (i7 >= 0 || i6 > i5)) {
            return null;
        }
        while (!Intrinsics.a(obj, s4.f3487d[i5])) {
            if (i5 == i6) {
                return null;
            }
            i5 += i7;
        }
        return s4.x(i5);
    }

    public final boolean h(int i2) {
        return (i2 & this.f3484a) != 0;
    }

    public final boolean i(int i2) {
        return (i2 & this.f3485b) != 0;
    }

    public final m k(int i2, e eVar) {
        eVar.g(eVar.d() - 1);
        eVar.f3468j = x(i2);
        Object[] objArr = this.f3487d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f3486c != eVar.f3466e) {
            return new m(0, 0, M1.a.n(objArr, i2), eVar.f3466e);
        }
        this.f3487d = M1.a.n(objArr, i2);
        return this;
    }

    public final m l(int i2, Object obj, Object obj2, int i4, e eVar) {
        m l4;
        int H3 = 1 << M1.a.H(i2, i4);
        boolean h4 = h(H3);
        N.b bVar = this.f3486c;
        if (h4) {
            int f4 = f(H3);
            if (!Intrinsics.a(obj, this.f3487d[f4])) {
                eVar.g(eVar.f3470l + 1);
                N.b bVar2 = eVar.f3466e;
                if (bVar != bVar2) {
                    return new m(this.f3484a ^ H3, this.f3485b | H3, a(f4, H3, i2, obj, obj2, i4, bVar2), bVar2);
                }
                this.f3487d = a(f4, H3, i2, obj, obj2, i4, bVar2);
                this.f3484a ^= H3;
                this.f3485b |= H3;
                return this;
            }
            eVar.f3468j = x(f4);
            if (x(f4) == obj2) {
                return this;
            }
            if (bVar == eVar.f3466e) {
                this.f3487d[f4 + 1] = obj2;
                return this;
            }
            eVar.f3469k++;
            Object[] objArr = this.f3487d;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
            copyOf[f4 + 1] = obj2;
            return new m(this.f3484a, this.f3485b, copyOf, eVar.f3466e);
        }
        if (!i(H3)) {
            eVar.g(eVar.f3470l + 1);
            N.b bVar3 = eVar.f3466e;
            int f5 = f(H3);
            if (bVar != bVar3) {
                return new m(this.f3484a | H3, this.f3485b, M1.a.m(this.f3487d, f5, obj, obj2), bVar3);
            }
            this.f3487d = M1.a.m(this.f3487d, f5, obj, obj2);
            this.f3484a |= H3;
            return this;
        }
        int t4 = t(H3);
        m s4 = s(t4);
        if (i4 == 30) {
            kotlin.ranges.a g4 = kotlin.ranges.b.g(kotlin.ranges.b.h(0, s4.f3487d.length), 2);
            int i5 = g4.f7505d;
            int i6 = g4.f7506e;
            int i7 = g4.f7507i;
            if ((i7 > 0 && i5 <= i6) || (i7 < 0 && i6 <= i5)) {
                while (!Intrinsics.a(obj, s4.f3487d[i5])) {
                    if (i5 != i6) {
                        i5 += i7;
                    }
                }
                eVar.f3468j = s4.x(i5);
                if (s4.f3486c == eVar.f3466e) {
                    s4.f3487d[i5 + 1] = obj2;
                    l4 = s4;
                } else {
                    eVar.f3469k++;
                    Object[] objArr2 = s4.f3487d;
                    Object[] copyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                    Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, size)");
                    copyOf2[i5 + 1] = obj2;
                    l4 = new m(0, 0, copyOf2, eVar.f3466e);
                }
            }
            eVar.g(eVar.f3470l + 1);
            l4 = new m(0, 0, M1.a.m(s4.f3487d, 0, obj, obj2), eVar.f3466e);
            break;
        }
        l4 = s4.l(i2, obj, obj2, i4 + 5, eVar);
        return s4 == l4 ? this : r(t4, l4, eVar.f3466e);
    }

    public final m m(m mVar, int i2, N.a aVar, e eVar) {
        Object[] objArr;
        int i4;
        m j4;
        if (this == mVar) {
            aVar.f3611a += b();
            return this;
        }
        int i5 = 0;
        if (i2 > 30) {
            N.b bVar = eVar.f3466e;
            int i6 = mVar.f3485b;
            Object[] objArr2 = this.f3487d;
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length + mVar.f3487d.length);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            int length = this.f3487d.length;
            kotlin.ranges.a g4 = kotlin.ranges.b.g(kotlin.ranges.b.h(0, mVar.f3487d.length), 2);
            int i7 = g4.f7505d;
            int i8 = g4.f7506e;
            int i9 = g4.f7507i;
            if ((i9 > 0 && i7 <= i8) || (i9 < 0 && i8 <= i7)) {
                while (true) {
                    if (c(mVar.f3487d[i7])) {
                        aVar.f3611a++;
                    } else {
                        Object[] objArr3 = mVar.f3487d;
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
            if (length == this.f3487d.length) {
                return this;
            }
            if (length == mVar.f3487d.length) {
                return mVar;
            }
            if (length == copyOf.length) {
                return new m(0, 0, copyOf, bVar);
            }
            Object[] copyOf2 = Arrays.copyOf(copyOf, length);
            Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
            return new m(0, 0, copyOf2, bVar);
        }
        int i10 = this.f3485b | mVar.f3485b;
        int i11 = this.f3484a;
        int i12 = mVar.f3484a;
        int i13 = (i11 ^ i12) & (~i10);
        int i14 = i11 & i12;
        int i15 = i13;
        while (i14 != 0) {
            int lowestOneBit = Integer.lowestOneBit(i14);
            if (Intrinsics.a(this.f3487d[f(lowestOneBit)], mVar.f3487d[mVar.f(lowestOneBit)])) {
                i15 |= lowestOneBit;
            } else {
                i10 |= lowestOneBit;
            }
            i14 ^= lowestOneBit;
        }
        if (!((i10 & i15) == 0)) {
            C0192d.T("Check failed.");
            throw null;
        }
        m mVar2 = (Intrinsics.a(this.f3486c, eVar.f3466e) && this.f3484a == i15 && this.f3485b == i10) ? this : new m(i15, i10, new Object[Integer.bitCount(i10) + (Integer.bitCount(i15) * 2)], null);
        int i16 = i10;
        int i17 = 0;
        while (i16 != 0) {
            int lowestOneBit2 = Integer.lowestOneBit(i16);
            Object[] objArr4 = mVar2.f3487d;
            int length2 = (objArr4.length - 1) - i17;
            if (i(lowestOneBit2)) {
                j4 = s(t(lowestOneBit2));
                if (mVar.i(lowestOneBit2)) {
                    j4 = j4.m(mVar.s(mVar.t(lowestOneBit2)), i2 + 5, aVar, eVar);
                } else if (mVar.h(lowestOneBit2)) {
                    int f4 = mVar.f(lowestOneBit2);
                    Object obj = mVar.f3487d[f4];
                    Object x2 = mVar.x(f4);
                    int i18 = eVar.f3470l;
                    objArr = objArr4;
                    j4 = j4.l(obj != null ? obj.hashCode() : i5, obj, x2, i2 + 5, eVar);
                    if (eVar.f3470l == i18) {
                        aVar.f3611a++;
                    }
                    i4 = lowestOneBit2;
                }
                objArr = objArr4;
                i4 = lowestOneBit2;
            } else {
                objArr = objArr4;
                i4 = lowestOneBit2;
                if (mVar.i(i4)) {
                    j4 = mVar.s(mVar.t(i4));
                    if (h(i4)) {
                        int f5 = f(i4);
                        Object obj2 = this.f3487d[f5];
                        int i19 = i2 + 5;
                        if (j4.d(obj2 != null ? obj2.hashCode() : 0, i19, obj2)) {
                            aVar.f3611a++;
                        } else {
                            j4 = j4.l(obj2 != null ? obj2.hashCode() : 0, obj2, x(f5), i19, eVar);
                        }
                    }
                } else {
                    int f6 = f(i4);
                    Object obj3 = this.f3487d[f6];
                    Object x3 = x(f6);
                    int f7 = mVar.f(i4);
                    Object obj4 = mVar.f3487d[f7];
                    j4 = j(obj3 != null ? obj3.hashCode() : 0, obj3, x3, obj4 != null ? obj4.hashCode() : 0, obj4, mVar.x(f7), i2 + 5, eVar.f3466e);
                }
            }
            objArr[length2] = j4;
            i17++;
            i16 ^= i4;
            i5 = 0;
        }
        int i20 = 0;
        while (i15 != 0) {
            int lowestOneBit3 = Integer.lowestOneBit(i15);
            int i21 = i20 * 2;
            if (mVar.h(lowestOneBit3)) {
                int f8 = mVar.f(lowestOneBit3);
                Object[] objArr5 = mVar2.f3487d;
                objArr5[i21] = mVar.f3487d[f8];
                objArr5[i21 + 1] = mVar.x(f8);
                if (h(lowestOneBit3)) {
                    aVar.f3611a++;
                }
            } else {
                int f9 = f(lowestOneBit3);
                Object[] objArr6 = mVar2.f3487d;
                objArr6[i21] = this.f3487d[f9];
                objArr6[i21 + 1] = x(f9);
            }
            i20++;
            i15 ^= lowestOneBit3;
        }
        return e(mVar2) ? this : mVar.e(mVar2) ? mVar : mVar2;
    }

    public final m n(int i2, Object obj, int i4, e eVar) {
        m n2;
        int H3 = 1 << M1.a.H(i2, i4);
        if (h(H3)) {
            int f4 = f(H3);
            return Intrinsics.a(obj, this.f3487d[f4]) ? p(f4, H3, eVar) : this;
        }
        if (!i(H3)) {
            return this;
        }
        int t4 = t(H3);
        m s4 = s(t4);
        if (i4 == 30) {
            kotlin.ranges.a g4 = kotlin.ranges.b.g(kotlin.ranges.b.h(0, s4.f3487d.length), 2);
            int i5 = g4.f7505d;
            int i6 = g4.f7506e;
            int i7 = g4.f7507i;
            if ((i7 > 0 && i5 <= i6) || (i7 < 0 && i6 <= i5)) {
                while (!Intrinsics.a(obj, s4.f3487d[i5])) {
                    if (i5 != i6) {
                        i5 += i7;
                    }
                }
                n2 = s4.k(i5, eVar);
            }
            n2 = s4;
            break;
        }
        n2 = s4.n(i2, obj, i4 + 5, eVar);
        return q(s4, n2, t4, H3, eVar.f3466e);
    }

    public final m o(int i2, Object obj, Object obj2, int i4, e eVar) {
        m o4;
        int H3 = 1 << M1.a.H(i2, i4);
        if (h(H3)) {
            int f4 = f(H3);
            return (Intrinsics.a(obj, this.f3487d[f4]) && Intrinsics.a(obj2, x(f4))) ? p(f4, H3, eVar) : this;
        }
        if (!i(H3)) {
            return this;
        }
        int t4 = t(H3);
        m s4 = s(t4);
        if (i4 == 30) {
            kotlin.ranges.a g4 = kotlin.ranges.b.g(kotlin.ranges.b.h(0, s4.f3487d.length), 2);
            int i5 = g4.f7505d;
            int i6 = g4.f7506e;
            int i7 = g4.f7507i;
            if ((i7 > 0 && i5 <= i6) || (i7 < 0 && i6 <= i5)) {
                while (true) {
                    if (!Intrinsics.a(obj, s4.f3487d[i5]) || !Intrinsics.a(obj2, s4.x(i5))) {
                        if (i5 == i6) {
                            break;
                        }
                        i5 += i7;
                    } else {
                        o4 = s4.k(i5, eVar);
                        break;
                    }
                }
            }
            o4 = s4;
        } else {
            o4 = s4.o(i2, obj, obj2, i4 + 5, eVar);
        }
        return q(s4, o4, t4, H3, eVar.f3466e);
    }

    public final m p(int i2, int i4, e eVar) {
        eVar.g(eVar.d() - 1);
        eVar.f3468j = x(i2);
        Object[] objArr = this.f3487d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f3486c != eVar.f3466e) {
            return new m(i4 ^ this.f3484a, this.f3485b, M1.a.n(objArr, i2), eVar.f3466e);
        }
        this.f3487d = M1.a.n(objArr, i2);
        this.f3484a ^= i4;
        return this;
    }

    public final m q(m mVar, m mVar2, int i2, int i4, N.b bVar) {
        N.b bVar2 = this.f3486c;
        if (mVar2 == null) {
            Object[] objArr = this.f3487d;
            if (objArr.length == 1) {
                return null;
            }
            if (bVar2 != bVar) {
                return new m(this.f3484a, i4 ^ this.f3485b, M1.a.o(objArr, i2), bVar);
            }
            this.f3487d = M1.a.o(objArr, i2);
            this.f3485b ^= i4;
        } else if (bVar2 == bVar || mVar != mVar2) {
            return r(i2, mVar2, bVar);
        }
        return this;
    }

    public final m r(int i2, m mVar, N.b bVar) {
        Object[] objArr = this.f3487d;
        if (objArr.length == 1 && mVar.f3487d.length == 2 && mVar.f3485b == 0) {
            mVar.f3484a = this.f3485b;
            return mVar;
        }
        if (this.f3486c == bVar) {
            objArr[i2] = mVar;
            return this;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        copyOf[i2] = mVar;
        return new m(this.f3484a, this.f3485b, copyOf, bVar);
    }

    public final m s(int i2) {
        Object obj = this.f3487d[i2];
        Intrinsics.d(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        return (m) obj;
    }

    public final int t(int i2) {
        return (this.f3487d.length - 1) - Integer.bitCount((i2 - 1) & this.f3485b);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00cb A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final y u(int i2, int i4, Object obj, Object obj2) {
        y u4;
        int i5 = 1;
        int H3 = 1 << M1.a.H(i2, i4);
        int i6 = 0;
        if (h(H3)) {
            int f4 = f(H3);
            if (!Intrinsics.a(obj, this.f3487d[f4])) {
                return new y(i5, new m(this.f3484a ^ H3, this.f3485b | H3, a(f4, H3, i2, obj, obj2, i4, null), null));
            }
            if (x(f4) == obj2) {
                return null;
            }
            Object[] objArr = this.f3487d;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
            copyOf[f4 + 1] = obj2;
            return new y(i6, new m(this.f3484a, this.f3485b, copyOf, null));
        }
        if (!i(H3)) {
            return new y(i5, new m(this.f3484a | H3, this.f3485b, M1.a.m(this.f3487d, f(H3), obj, obj2), null));
        }
        int t4 = t(H3);
        m s4 = s(t4);
        if (i4 == 30) {
            kotlin.ranges.a g4 = kotlin.ranges.b.g(kotlin.ranges.b.h(0, s4.f3487d.length), 2);
            int i7 = g4.f7505d;
            int i8 = g4.f7506e;
            int i9 = g4.f7507i;
            if ((i9 > 0 && i7 <= i8) || (i9 < 0 && i8 <= i7)) {
                while (!Intrinsics.a(obj, s4.f3487d[i7])) {
                    if (i7 != i8) {
                        i7 += i9;
                    }
                }
                if (obj2 == s4.x(i7)) {
                    u4 = null;
                } else {
                    Object[] objArr2 = s4.f3487d;
                    Object[] copyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                    Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, size)");
                    copyOf2[i7 + 1] = obj2;
                    u4 = new y(i6, new m(0, 0, copyOf2, null));
                }
                if (u4 == null) {
                    return null;
                }
            }
            u4 = new y(i5, new m(0, 0, M1.a.m(s4.f3487d, 0, obj, obj2), null));
            if (u4 == null) {
            }
        } else {
            u4 = s4.u(i2, i4 + 5, obj, obj2);
            if (u4 == null) {
                return null;
            }
        }
        u4.f3165b = w(t4, H3, (m) u4.f3165b);
        return u4;
    }

    public final m v(int i2, W w4, int i4) {
        m v4;
        int H3 = 1 << M1.a.H(i2, i4);
        if (h(H3)) {
            int f4 = f(H3);
            if (!Intrinsics.a(w4, this.f3487d[f4])) {
                return this;
            }
            Object[] objArr = this.f3487d;
            if (objArr.length == 2) {
                return null;
            }
            return new m(this.f3484a ^ H3, this.f3485b, M1.a.n(objArr, f4), null);
        }
        if (!i(H3)) {
            return this;
        }
        int t4 = t(H3);
        m s4 = s(t4);
        if (i4 == 30) {
            kotlin.ranges.a g4 = kotlin.ranges.b.g(kotlin.ranges.b.h(0, s4.f3487d.length), 2);
            int i5 = g4.f7505d;
            int i6 = g4.f7506e;
            int i7 = g4.f7507i;
            if ((i7 > 0 && i5 <= i6) || (i7 < 0 && i6 <= i5)) {
                while (!Intrinsics.a(w4, s4.f3487d[i5])) {
                    if (i5 != i6) {
                        i5 += i7;
                    }
                }
                Object[] objArr2 = s4.f3487d;
                v4 = objArr2.length == 2 ? null : new m(0, 0, M1.a.n(objArr2, i5), null);
            }
            v4 = s4;
            break;
        }
        v4 = s4.v(i2, w4, i4 + 5);
        if (v4 != null) {
            return s4 != v4 ? w(t4, H3, v4) : this;
        }
        Object[] objArr3 = this.f3487d;
        if (objArr3.length == 1) {
            return null;
        }
        return new m(this.f3484a, H3 ^ this.f3485b, M1.a.o(objArr3, t4), null);
    }

    public final m w(int i2, int i4, m mVar) {
        Object[] objArr = mVar.f3487d;
        if (objArr.length != 2 || mVar.f3485b != 0) {
            Object[] objArr2 = this.f3487d;
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            copyOf[i2] = mVar;
            return new m(this.f3484a, this.f3485b, copyOf, null);
        }
        if (this.f3487d.length == 1) {
            mVar.f3484a = this.f3485b;
            return mVar;
        }
        int f4 = f(i4);
        Object[] objArr3 = this.f3487d;
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        Object[] copyOf2 = Arrays.copyOf(objArr3, objArr3.length + 1);
        Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
        C1436t.f(copyOf2, copyOf2, i2 + 2, i2 + 1, objArr3.length);
        C1436t.f(copyOf2, copyOf2, f4 + 2, f4, i2);
        copyOf2[f4] = obj;
        copyOf2[f4 + 1] = obj2;
        return new m(this.f3484a ^ i4, i4 ^ this.f3485b, copyOf2, null);
    }

    public final Object x(int i2) {
        return this.f3487d[i2 + 1];
    }
}
