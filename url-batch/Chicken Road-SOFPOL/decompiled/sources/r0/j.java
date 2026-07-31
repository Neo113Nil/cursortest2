package r0;

import java.util.Arrays;
import m0.p1;
import r2.o;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: e, reason: collision with root package name */
    public static final j f6488e = new j(0, 0, new Object[0], null);

    /* renamed from: a, reason: collision with root package name */
    public int f6489a;

    /* renamed from: b, reason: collision with root package name */
    public int f6490b;

    /* renamed from: c, reason: collision with root package name */
    public final t0.b f6491c;

    /* renamed from: d, reason: collision with root package name */
    public Object[] f6492d;

    public j(int i, int i8, Object[] objArr, t0.b bVar) {
        this.f6489a = i;
        this.f6490b = i8;
        this.f6491c = bVar;
        this.f6492d = objArr;
    }

    public static j j(int i, Object obj, Object obj2, int i8, Object obj3, Object obj4, int i9, t0.b bVar) {
        if (i9 > 30) {
            return new j(0, 0, new Object[]{obj, obj2, obj3, obj4}, bVar);
        }
        int L = h0.a.L(i, i9);
        int L2 = h0.a.L(i8, i9);
        if (L != L2) {
            return new j((1 << L) | (1 << L2), 0, L < L2 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, bVar);
        }
        return new j(0, 1 << L, new Object[]{j(i, obj, obj2, i8, obj3, obj4, i9 + 5, bVar)}, bVar);
    }

    public final Object[] a(int i, int i8, int i9, Object obj, Object obj2, int i10, t0.b bVar) {
        Object obj3 = this.f6492d[i];
        j j7 = j(obj3 != null ? obj3.hashCode() : 0, obj3, x(i), i9, obj, obj2, i10 + 5, bVar);
        int t3 = t(i8);
        int i11 = t3 + 1;
        Object[] objArr = this.f6492d;
        Object[] objArr2 = new Object[objArr.length - 1];
        d6.l.J(objArr, objArr2, 0, i, 6);
        d6.l.H(objArr, objArr2, i, i + 2, i11);
        objArr2[t3 - 1] = j7;
        d6.l.H(objArr, objArr2, t3, i11, objArr.length);
        return objArr2;
    }

    public final int b() {
        if (this.f6490b == 0) {
            return this.f6492d.length / 2;
        }
        int bitCount = Integer.bitCount(this.f6489a);
        int length = this.f6492d.length;
        for (int i = bitCount * 2; i < length; i++) {
            bitCount += s(i).b();
        }
        return bitCount;
    }

    public final boolean c(Object obj) {
        v6.b q02 = o.q0(o.u0(0, this.f6492d.length));
        int i = q02.f7492d;
        int i8 = q02.f7493e;
        int i9 = q02.f7494f;
        if ((i9 > 0 && i <= i8) || (i9 < 0 && i8 <= i)) {
            while (!q6.i.a(obj, this.f6492d[i])) {
                if (i != i8) {
                    i += i9;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(int i, int i8, Object obj) {
        int L = 1 << h0.a.L(i, i8);
        if (h(L)) {
            return q6.i.a(obj, this.f6492d[f(L)]);
        }
        if (!i(L)) {
            return false;
        }
        j s5 = s(t(L));
        return i8 == 30 ? s5.c(obj) : s5.d(i, i8 + 5, obj);
    }

    public final boolean e(j jVar) {
        if (this == jVar) {
            return true;
        }
        if (this.f6490b == jVar.f6490b && this.f6489a == jVar.f6489a) {
            int length = this.f6492d.length;
            for (int i = 0; i < length; i++) {
                if (this.f6492d[i] == jVar.f6492d[i]) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f(int i) {
        return Integer.bitCount((i - 1) & this.f6489a) * 2;
    }

    public final Object g(int i, int i8, Object obj) {
        int L = 1 << h0.a.L(i, i8);
        if (h(L)) {
            int f6 = f(L);
            if (q6.i.a(obj, this.f6492d[f6])) {
                return x(f6);
            }
            return null;
        }
        if (!i(L)) {
            return null;
        }
        j s5 = s(t(L));
        if (i8 != 30) {
            return s5.g(i, i8 + 5, obj);
        }
        v6.b q02 = o.q0(o.u0(0, s5.f6492d.length));
        int i9 = q02.f7492d;
        int i10 = q02.f7493e;
        int i11 = q02.f7494f;
        if ((i11 <= 0 || i9 > i10) && (i11 >= 0 || i10 > i9)) {
            return null;
        }
        while (!q6.i.a(obj, s5.f6492d[i9])) {
            if (i9 == i10) {
                return null;
            }
            i9 += i11;
        }
        return s5.x(i9);
    }

    public final boolean h(int i) {
        return (i & this.f6489a) != 0;
    }

    public final boolean i(int i) {
        return (i & this.f6490b) != 0;
    }

    public final j k(int i, u0.f fVar) {
        fVar.e(fVar.f7150h - 1);
        fVar.f7148f = x(i);
        Object[] objArr = this.f6492d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f6491c != fVar.f7146d) {
            return new j(0, 0, h0.a.g(i, objArr), fVar.f7146d);
        }
        this.f6492d = h0.a.g(i, objArr);
        return this;
    }

    public final j l(int i, Object obj, Object obj2, int i8, u0.f fVar) {
        u0.f fVar2;
        j l3;
        int L = 1 << h0.a.L(i, i8);
        boolean h8 = h(L);
        t0.b bVar = this.f6491c;
        if (h8) {
            int f6 = f(L);
            if (!q6.i.a(obj, this.f6492d[f6])) {
                fVar.e(fVar.f7150h + 1);
                t0.b bVar2 = fVar.f7146d;
                if (bVar != bVar2) {
                    return new j(this.f6489a ^ L, this.f6490b | L, a(f6, L, i, obj, obj2, i8, bVar2), bVar2);
                }
                this.f6492d = a(f6, L, i, obj, obj2, i8, bVar2);
                this.f6489a ^= L;
                this.f6490b |= L;
                return this;
            }
            fVar.f7148f = x(f6);
            if (x(f6) == obj2) {
                return this;
            }
            if (bVar == fVar.f7146d) {
                this.f6492d[f6 + 1] = obj2;
                return this;
            }
            fVar.f7149g++;
            Object[] objArr = this.f6492d;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            q6.i.d(copyOf, "copyOf(...)");
            copyOf[f6 + 1] = obj2;
            return new j(this.f6489a, this.f6490b, copyOf, fVar.f7146d);
        }
        if (!i(L)) {
            fVar.e(fVar.f7150h + 1);
            t0.b bVar3 = fVar.f7146d;
            int f8 = f(L);
            if (bVar != bVar3) {
                return new j(this.f6489a | L, this.f6490b, h0.a.f(this.f6492d, f8, obj, obj2), bVar3);
            }
            this.f6492d = h0.a.f(this.f6492d, f8, obj, obj2);
            this.f6489a |= L;
            return this;
        }
        int t3 = t(L);
        j s5 = s(t3);
        if (i8 == 30) {
            v6.b q02 = o.q0(o.u0(0, s5.f6492d.length));
            int i9 = q02.f7492d;
            int i10 = q02.f7493e;
            int i11 = q02.f7494f;
            if ((i11 > 0 && i9 <= i10) || (i11 < 0 && i10 <= i9)) {
                while (!q6.i.a(obj, s5.f6492d[i9])) {
                    if (i9 != i10) {
                        i9 += i11;
                    }
                }
                fVar.f7148f = s5.x(i9);
                if (s5.f6491c == fVar.f7146d) {
                    s5.f6492d[i9 + 1] = obj2;
                    l3 = s5;
                } else {
                    fVar.f7149g++;
                    Object[] objArr2 = s5.f6492d;
                    Object[] copyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                    q6.i.d(copyOf2, "copyOf(...)");
                    copyOf2[i9 + 1] = obj2;
                    l3 = new j(0, 0, copyOf2, fVar.f7146d);
                }
                fVar2 = fVar;
            }
            fVar.e(fVar.f7150h + 1);
            l3 = new j(0, 0, h0.a.f(s5.f6492d, 0, obj, obj2), fVar.f7146d);
            fVar2 = fVar;
        } else {
            fVar2 = fVar;
            l3 = s5.l(i, obj, obj2, i8 + 5, fVar2);
        }
        return s5 == l3 ? this : r(t3, l3, fVar2.f7146d);
    }

    public final j m(j jVar, int i, t0.a aVar, u0.f fVar) {
        Object[] objArr;
        j j7;
        if (this == jVar) {
            aVar.f6893a += b();
            return this;
        }
        int i8 = 0;
        if (i > 30) {
            t0.b bVar = fVar.f7146d;
            int i9 = jVar.f6490b;
            Object[] objArr2 = this.f6492d;
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length + jVar.f6492d.length);
            q6.i.d(copyOf, "copyOf(...)");
            int length = this.f6492d.length;
            v6.b q02 = o.q0(o.u0(0, jVar.f6492d.length));
            int i10 = q02.f7492d;
            int i11 = q02.f7493e;
            int i12 = q02.f7494f;
            if ((i12 > 0 && i10 <= i11) || (i12 < 0 && i11 <= i10)) {
                while (true) {
                    if (c(jVar.f6492d[i10])) {
                        aVar.f6893a++;
                    } else {
                        Object[] objArr3 = jVar.f6492d;
                        copyOf[length] = objArr3[i10];
                        copyOf[length + 1] = objArr3[i10 + 1];
                        length += 2;
                    }
                    if (i10 == i11) {
                        break;
                    }
                    i10 += i12;
                }
            }
            if (length != this.f6492d.length) {
                if (length == jVar.f6492d.length) {
                    return jVar;
                }
                if (length == copyOf.length) {
                    return new j(0, 0, copyOf, bVar);
                }
                Object[] copyOf2 = Arrays.copyOf(copyOf, length);
                q6.i.d(copyOf2, "copyOf(...)");
                return new j(0, 0, copyOf2, bVar);
            }
        } else {
            int i13 = this.f6490b | jVar.f6490b;
            int i14 = this.f6489a;
            int i15 = jVar.f6489a;
            int i16 = (i14 ^ i15) & (~i13);
            int i17 = i14 & i15;
            int i18 = i16;
            while (i17 != 0) {
                int lowestOneBit = Integer.lowestOneBit(i17);
                if (q6.i.a(this.f6492d[f(lowestOneBit)], jVar.f6492d[jVar.f(lowestOneBit)])) {
                    i18 |= lowestOneBit;
                } else {
                    i13 |= lowestOneBit;
                }
                i17 ^= lowestOneBit;
            }
            if ((i13 & i18) != 0) {
                p1.b("Check failed.");
            }
            j jVar2 = (q6.i.a(this.f6491c, fVar.f7146d) && this.f6489a == i18 && this.f6490b == i13) ? this : new j(i18, i13, new Object[Integer.bitCount(i13) + (Integer.bitCount(i18) * 2)], null);
            int i19 = i13;
            int i20 = 0;
            while (i19 != 0) {
                int lowestOneBit2 = Integer.lowestOneBit(i19);
                Object[] objArr4 = jVar2.f6492d;
                int length2 = (objArr4.length - 1) - i20;
                if (i(lowestOneBit2)) {
                    j7 = s(t(lowestOneBit2));
                    if (jVar.i(lowestOneBit2)) {
                        j7 = j7.m(jVar.s(jVar.t(lowestOneBit2)), i + 5, aVar, fVar);
                        objArr = objArr4;
                    } else if (jVar.h(lowestOneBit2)) {
                        int f6 = jVar.f(lowestOneBit2);
                        Object obj = jVar.f6492d[f6];
                        Object x7 = jVar.x(f6);
                        int i21 = fVar.f7150h;
                        objArr = objArr4;
                        j7 = j7.l(obj != null ? obj.hashCode() : i8, obj, x7, i + 5, fVar);
                        if (fVar.f7150h == i21) {
                            aVar.f6893a++;
                        }
                    } else {
                        objArr = objArr4;
                    }
                } else {
                    objArr = objArr4;
                    if (jVar.i(lowestOneBit2)) {
                        j s5 = jVar.s(jVar.t(lowestOneBit2));
                        if (h(lowestOneBit2)) {
                            int f8 = f(lowestOneBit2);
                            Object obj2 = this.f6492d[f8];
                            int i22 = i + 5;
                            if (s5.d(obj2 != null ? obj2.hashCode() : 0, i22, obj2)) {
                                aVar.f6893a++;
                            } else {
                                j7 = s5.l(obj2 != null ? obj2.hashCode() : 0, obj2, x(f8), i22, fVar);
                            }
                        }
                        j7 = s5;
                    } else {
                        int f9 = f(lowestOneBit2);
                        Object obj3 = this.f6492d[f9];
                        Object x8 = x(f9);
                        int f10 = jVar.f(lowestOneBit2);
                        Object obj4 = jVar.f6492d[f10];
                        j7 = j(obj3 != null ? obj3.hashCode() : 0, obj3, x8, obj4 != null ? obj4.hashCode() : 0, obj4, jVar.x(f10), i + 5, fVar.f7146d);
                    }
                }
                objArr[length2] = j7;
                i20++;
                i19 ^= lowestOneBit2;
                i8 = 0;
            }
            int i23 = 0;
            while (i18 != 0) {
                int lowestOneBit3 = Integer.lowestOneBit(i18);
                int i24 = i23 * 2;
                if (jVar.h(lowestOneBit3)) {
                    int f11 = jVar.f(lowestOneBit3);
                    Object[] objArr5 = jVar2.f6492d;
                    objArr5[i24] = jVar.f6492d[f11];
                    objArr5[i24 + 1] = jVar.x(f11);
                    if (h(lowestOneBit3)) {
                        aVar.f6893a++;
                    }
                } else {
                    int f12 = f(lowestOneBit3);
                    Object[] objArr6 = jVar2.f6492d;
                    objArr6[i24] = this.f6492d[f12];
                    objArr6[i24 + 1] = x(f12);
                }
                i23++;
                i18 ^= lowestOneBit3;
            }
            if (!e(jVar2)) {
                return jVar.e(jVar2) ? jVar : jVar2;
            }
        }
        return this;
    }

    public final j n(int i, Object obj, int i8, u0.f fVar) {
        j n6;
        int L = 1 << h0.a.L(i, i8);
        if (h(L)) {
            int f6 = f(L);
            if (q6.i.a(obj, this.f6492d[f6])) {
                return p(f6, L, fVar);
            }
        } else if (i(L)) {
            int t3 = t(L);
            j s5 = s(t3);
            if (i8 == 30) {
                v6.b q02 = o.q0(o.u0(0, s5.f6492d.length));
                int i9 = q02.f7492d;
                int i10 = q02.f7493e;
                int i11 = q02.f7494f;
                if ((i11 > 0 && i9 <= i10) || (i11 < 0 && i10 <= i9)) {
                    while (!q6.i.a(obj, s5.f6492d[i9])) {
                        if (i9 != i10) {
                            i9 += i11;
                        }
                    }
                    n6 = s5.k(i9, fVar);
                }
                n6 = s5;
                break;
            }
            n6 = s5.n(i, obj, i8 + 5, fVar);
            return q(s5, n6, t3, L, fVar.f7146d);
        }
        return this;
    }

    public final j o(int i, Object obj, Object obj2, int i8, u0.f fVar) {
        j jVar;
        j o2;
        int L = 1 << h0.a.L(i, i8);
        if (h(L)) {
            int f6 = f(L);
            if (q6.i.a(obj, this.f6492d[f6]) && q6.i.a(obj2, x(f6))) {
                return p(f6, L, fVar);
            }
        } else if (i(L)) {
            int t3 = t(L);
            j s5 = s(t3);
            if (i8 == 30) {
                v6.b q02 = o.q0(o.u0(0, s5.f6492d.length));
                int i9 = q02.f7492d;
                int i10 = q02.f7493e;
                int i11 = q02.f7494f;
                if ((i11 > 0 && i9 <= i10) || (i11 < 0 && i10 <= i9)) {
                    while (true) {
                        if (!q6.i.a(obj, s5.f6492d[i9]) || !q6.i.a(obj2, s5.x(i9))) {
                            if (i9 == i10) {
                                break;
                            }
                            i9 += i11;
                        } else {
                            o2 = s5.k(i9, fVar);
                            break;
                        }
                    }
                }
                o2 = s5;
                jVar = s5;
            } else {
                jVar = s5;
                o2 = jVar.o(i, obj, obj2, i8 + 5, fVar);
            }
            return q(jVar, o2, t3, L, fVar.f7146d);
        }
        return this;
    }

    public final j p(int i, int i8, u0.f fVar) {
        fVar.e(fVar.f7150h - 1);
        fVar.f7148f = x(i);
        Object[] objArr = this.f6492d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f6491c != fVar.f7146d) {
            return new j(i8 ^ this.f6489a, this.f6490b, h0.a.g(i, objArr), fVar.f7146d);
        }
        this.f6492d = h0.a.g(i, objArr);
        this.f6489a ^= i8;
        return this;
    }

    public final j q(j jVar, j jVar2, int i, int i8, t0.b bVar) {
        t0.b bVar2 = this.f6491c;
        if (jVar2 != null) {
            return (bVar2 == bVar || jVar != jVar2) ? r(i, jVar2, bVar) : this;
        }
        Object[] objArr = this.f6492d;
        if (objArr.length == 1) {
            return null;
        }
        if (bVar2 != bVar) {
            return new j(this.f6489a, i8 ^ this.f6490b, h0.a.h(i, objArr), bVar);
        }
        this.f6492d = h0.a.h(i, objArr);
        this.f6490b ^= i8;
        return this;
    }

    public final j r(int i, j jVar, t0.b bVar) {
        Object[] objArr = this.f6492d;
        if (objArr.length == 1 && jVar.f6492d.length == 2 && jVar.f6490b == 0) {
            jVar.f6489a = this.f6490b;
            return jVar;
        }
        if (this.f6491c == bVar) {
            objArr[i] = jVar;
            return this;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        q6.i.d(copyOf, "copyOf(...)");
        copyOf[i] = jVar;
        return new j(this.f6489a, this.f6490b, copyOf, bVar);
    }

    public final j s(int i) {
        Object obj = this.f6492d[i];
        q6.i.c(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        return (j) obj;
    }

    public final int t(int i) {
        return (this.f6492d.length - 1) - Integer.bitCount((i - 1) & this.f6490b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d0, code lost:
    
        if (r14 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00dc, code lost:
    
        r14.f4190e = w(r12, r4, (r0.j) r14.f4190e);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00e6, code lost:
    
        return r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d9, code lost:
    
        if (r14 == null) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final k5.e u(int i, int i8, Object obj, Object obj2) {
        k5.e u7;
        int L = 1 << h0.a.L(i, i8);
        if (h(L)) {
            int f6 = f(L);
            if (!q6.i.a(obj, this.f6492d[f6])) {
                return new k5.e(1, new j(this.f6489a ^ L, this.f6490b | L, a(f6, L, i, obj, obj2, i8, null), null));
            }
            if (x(f6) != obj2) {
                Object[] objArr = this.f6492d;
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                q6.i.d(copyOf, "copyOf(...)");
                copyOf[f6 + 1] = obj2;
                return new k5.e(0, new j(this.f6489a, this.f6490b, copyOf, null));
            }
        } else {
            if (!i(L)) {
                return new k5.e(1, new j(this.f6489a | L, this.f6490b, h0.a.f(this.f6492d, f(L), obj, obj2), null));
            }
            int t3 = t(L);
            j s5 = s(t3);
            if (i8 == 30) {
                v6.b q02 = o.q0(o.u0(0, s5.f6492d.length));
                int i9 = q02.f7492d;
                int i10 = q02.f7493e;
                int i11 = q02.f7494f;
                if ((i11 > 0 && i9 <= i10) || (i11 < 0 && i10 <= i9)) {
                    while (!q6.i.a(obj, s5.f6492d[i9])) {
                        if (i9 != i10) {
                            i9 += i11;
                        }
                    }
                    if (obj2 == s5.x(i9)) {
                        u7 = null;
                    } else {
                        Object[] objArr2 = s5.f6492d;
                        Object[] copyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                        q6.i.d(copyOf2, "copyOf(...)");
                        copyOf2[i9 + 1] = obj2;
                        u7 = new k5.e(0, new j(0, 0, copyOf2, null));
                    }
                }
                u7 = new k5.e(1, new j(0, 0, h0.a.f(s5.f6492d, 0, obj, obj2), null));
                break;
            }
            u7 = s5.u(i, i8 + 5, obj, obj2);
        }
        return null;
    }

    public final j v(int i, int i8, Object obj) {
        j v7;
        int L = 1 << h0.a.L(i, i8);
        if (h(L)) {
            int f6 = f(L);
            if (q6.i.a(obj, this.f6492d[f6])) {
                Object[] objArr = this.f6492d;
                if (objArr.length != 2) {
                    return new j(this.f6489a ^ L, this.f6490b, h0.a.g(f6, objArr), null);
                }
                return null;
            }
            return this;
        }
        if (i(L)) {
            int t3 = t(L);
            j s5 = s(t3);
            if (i8 == 30) {
                v6.b q02 = o.q0(o.u0(0, s5.f6492d.length));
                int i9 = q02.f7492d;
                int i10 = q02.f7493e;
                int i11 = q02.f7494f;
                if ((i11 > 0 && i9 <= i10) || (i11 < 0 && i10 <= i9)) {
                    while (!q6.i.a(obj, s5.f6492d[i9])) {
                        if (i9 != i10) {
                            i9 += i11;
                        }
                    }
                    Object[] objArr2 = s5.f6492d;
                    v7 = objArr2.length == 2 ? null : new j(0, 0, h0.a.g(i9, objArr2), null);
                }
                v7 = s5;
                break;
            }
            v7 = s5.v(i, i8 + 5, obj);
            if (v7 == null) {
                Object[] objArr3 = this.f6492d;
                if (objArr3.length != 1) {
                    return new j(this.f6489a, L ^ this.f6490b, h0.a.h(t3, objArr3), null);
                }
                return null;
            }
            if (s5 != v7) {
                return w(t3, L, v7);
            }
        }
        return this;
    }

    public final j w(int i, int i8, j jVar) {
        Object[] objArr = jVar.f6492d;
        if (objArr.length != 2 || jVar.f6490b != 0) {
            Object[] objArr2 = this.f6492d;
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length);
            q6.i.d(copyOf, "copyOf(...)");
            copyOf[i] = jVar;
            return new j(this.f6489a, this.f6490b, copyOf, null);
        }
        if (this.f6492d.length == 1) {
            jVar.f6489a = this.f6490b;
            return jVar;
        }
        int f6 = f(i8);
        Object[] objArr3 = this.f6492d;
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        Object[] copyOf2 = Arrays.copyOf(objArr3, objArr3.length + 1);
        q6.i.d(copyOf2, "copyOf(...)");
        d6.l.H(copyOf2, copyOf2, i + 2, i + 1, objArr3.length);
        d6.l.H(copyOf2, copyOf2, f6 + 2, f6, i);
        copyOf2[f6] = obj;
        copyOf2[f6 + 1] = obj2;
        return new j(this.f6489a ^ i8, i8 ^ this.f6490b, copyOf2, null);
    }

    public final Object x(int i) {
        return this.f6492d[i + 1];
    }
}
