package l0;

import java.util.Arrays;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: e, reason: collision with root package name */
    public static final k f5761e = new k(0, 0, new Object[0], null);

    /* renamed from: a, reason: collision with root package name */
    public int f5762a;

    /* renamed from: b, reason: collision with root package name */
    public int f5763b;

    /* renamed from: c, reason: collision with root package name */
    public final n0.b f5764c;

    /* renamed from: d, reason: collision with root package name */
    public Object[] f5765d;

    public k(int i7, int i8, Object[] objArr, n0.b bVar) {
        this.f5762a = i7;
        this.f5763b = i8;
        this.f5764c = bVar;
        this.f5765d = objArr;
    }

    public static k j(int i7, Object obj, Object obj2, int i8, Object obj3, Object obj4, int i9, n0.b bVar) {
        if (i9 > 30) {
            return new k(0, 0, new Object[]{obj, obj2, obj3, obj4}, bVar);
        }
        int E = t6.a.E(i7, i9);
        int E2 = t6.a.E(i8, i9);
        if (E != E2) {
            return new k((1 << E) | (1 << E2), 0, E < E2 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, bVar);
        }
        return new k(0, 1 << E, new Object[]{j(i7, obj, obj2, i8, obj3, obj4, i9 + 5, bVar)}, bVar);
    }

    public final Object[] a(int i7, int i8, int i9, Object obj, Object obj2, int i10, n0.b bVar) {
        Object obj3 = this.f5765d[i7];
        k j8 = j(obj3 != null ? obj3.hashCode() : 0, obj3, x(i7), i9, obj, obj2, i10 + 5, bVar);
        int t2 = t(i8);
        int i11 = t2 + 1;
        Object[] objArr = this.f5765d;
        Object[] objArr2 = new Object[objArr.length - 1];
        e6.k.Z(objArr, objArr2, 0, i7, 6);
        e6.k.X(objArr, objArr2, i7, i7 + 2, i11);
        objArr2[t2 - 1] = j8;
        e6.k.X(objArr, objArr2, t2, i11, objArr.length);
        return objArr2;
    }

    public final int b() {
        if (this.f5763b == 0) {
            return this.f5765d.length / 2;
        }
        int bitCount = Integer.bitCount(this.f5762a);
        int length = this.f5765d.length;
        for (int i7 = bitCount * 2; i7 < length; i7++) {
            bitCount += s(i7).b();
        }
        return bitCount;
    }

    public final boolean c(Object obj) {
        w6.b n8 = v1.g.n(v1.g.o(0, this.f5765d.length), 2);
        int i7 = n8.f9521f;
        int i8 = n8.f9522g;
        int i9 = n8.f9523h;
        if ((i9 > 0 && i7 <= i8) || (i9 < 0 && i8 <= i7)) {
            while (!r6.k.a(obj, this.f5765d[i7])) {
                if (i7 != i8) {
                    i7 += i9;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(int i7, int i8, Object obj) {
        int E = 1 << t6.a.E(i7, i8);
        if (h(E)) {
            return r6.k.a(obj, this.f5765d[f(E)]);
        }
        if (!i(E)) {
            return false;
        }
        k s5 = s(t(E));
        return i8 == 30 ? s5.c(obj) : s5.d(i7, i8 + 5, obj);
    }

    public final boolean e(k kVar) {
        if (this == kVar) {
            return true;
        }
        if (this.f5763b == kVar.f5763b && this.f5762a == kVar.f5762a) {
            int length = this.f5765d.length;
            for (int i7 = 0; i7 < length; i7++) {
                if (this.f5765d[i7] == kVar.f5765d[i7]) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f(int i7) {
        return Integer.bitCount((i7 - 1) & this.f5762a) * 2;
    }

    public final Object g(int i7, int i8, Object obj) {
        int E = 1 << t6.a.E(i7, i8);
        if (h(E)) {
            int f9 = f(E);
            if (r6.k.a(obj, this.f5765d[f9])) {
                return x(f9);
            }
            return null;
        }
        if (!i(E)) {
            return null;
        }
        k s5 = s(t(E));
        if (i8 != 30) {
            return s5.g(i7, i8 + 5, obj);
        }
        w6.b n8 = v1.g.n(v1.g.o(0, s5.f5765d.length), 2);
        int i9 = n8.f9521f;
        int i10 = n8.f9522g;
        int i11 = n8.f9523h;
        if ((i11 <= 0 || i9 > i10) && (i11 >= 0 || i10 > i9)) {
            return null;
        }
        while (!r6.k.a(obj, s5.f5765d[i9])) {
            if (i9 == i10) {
                return null;
            }
            i9 += i11;
        }
        return s5.x(i9);
    }

    public final boolean h(int i7) {
        return (i7 & this.f5762a) != 0;
    }

    public final boolean i(int i7) {
        return (i7 & this.f5763b) != 0;
    }

    public final k k(int i7, o0.c cVar) {
        cVar.e(cVar.f6820j - 1);
        cVar.f6818h = x(i7);
        Object[] objArr = this.f5765d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f5764c != cVar.f6816f) {
            return new k(0, 0, t6.a.l(objArr, i7), cVar.f6816f);
        }
        this.f5765d = t6.a.l(objArr, i7);
        return this;
    }

    public final k l(int i7, Object obj, Object obj2, int i8, o0.c cVar) {
        o0.c cVar2;
        k l8;
        int E = 1 << t6.a.E(i7, i8);
        boolean h3 = h(E);
        n0.b bVar = this.f5764c;
        if (h3) {
            int f9 = f(E);
            if (!r6.k.a(obj, this.f5765d[f9])) {
                cVar.e(cVar.f6820j + 1);
                n0.b bVar2 = cVar.f6816f;
                if (bVar != bVar2) {
                    return new k(this.f5762a ^ E, this.f5763b | E, a(f9, E, i7, obj, obj2, i8, bVar2), bVar2);
                }
                this.f5765d = a(f9, E, i7, obj, obj2, i8, bVar2);
                this.f5762a ^= E;
                this.f5763b |= E;
                return this;
            }
            cVar.f6818h = x(f9);
            if (x(f9) == obj2) {
                return this;
            }
            if (bVar == cVar.f6816f) {
                this.f5765d[f9 + 1] = obj2;
                return this;
            }
            cVar.f6819i++;
            Object[] objArr = this.f5765d;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            r6.k.e(copyOf, "copyOf(this, size)");
            copyOf[f9 + 1] = obj2;
            return new k(this.f5762a, this.f5763b, copyOf, cVar.f6816f);
        }
        if (!i(E)) {
            cVar.e(cVar.f6820j + 1);
            n0.b bVar3 = cVar.f6816f;
            int f10 = f(E);
            if (bVar != bVar3) {
                return new k(this.f5762a | E, this.f5763b, t6.a.k(this.f5765d, f10, obj, obj2), bVar3);
            }
            this.f5765d = t6.a.k(this.f5765d, f10, obj, obj2);
            this.f5762a |= E;
            return this;
        }
        int t2 = t(E);
        k s5 = s(t2);
        if (i8 == 30) {
            w6.b n8 = v1.g.n(v1.g.o(0, s5.f5765d.length), 2);
            int i9 = n8.f9521f;
            int i10 = n8.f9522g;
            int i11 = n8.f9523h;
            if ((i11 > 0 && i9 <= i10) || (i11 < 0 && i10 <= i9)) {
                while (!r6.k.a(obj, s5.f5765d[i9])) {
                    if (i9 != i10) {
                        i9 += i11;
                    }
                }
                cVar.f6818h = s5.x(i9);
                if (s5.f5764c == cVar.f6816f) {
                    s5.f5765d[i9 + 1] = obj2;
                    l8 = s5;
                } else {
                    cVar.f6819i++;
                    Object[] objArr2 = s5.f5765d;
                    Object[] copyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                    r6.k.e(copyOf2, "copyOf(this, size)");
                    copyOf2[i9 + 1] = obj2;
                    l8 = new k(0, 0, copyOf2, cVar.f6816f);
                }
                cVar2 = cVar;
            }
            cVar.e(cVar.f6820j + 1);
            l8 = new k(0, 0, t6.a.k(s5.f5765d, 0, obj, obj2), cVar.f6816f);
            cVar2 = cVar;
        } else {
            cVar2 = cVar;
            l8 = s5.l(i7, obj, obj2, i8 + 5, cVar2);
        }
        return s5 == l8 ? this : r(t2, l8, cVar2.f6816f);
    }

    public final k m(k kVar, int i7, n0.a aVar, o0.c cVar) {
        Object[] objArr;
        k j8;
        if (this == kVar) {
            aVar.f6496a += b();
            return this;
        }
        int i8 = 0;
        if (i7 > 30) {
            n0.b bVar = cVar.f6816f;
            int i9 = kVar.f5763b;
            Object[] objArr2 = this.f5765d;
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length + kVar.f5765d.length);
            r6.k.e(copyOf, "copyOf(this, newSize)");
            int length = this.f5765d.length;
            w6.b n8 = v1.g.n(v1.g.o(0, kVar.f5765d.length), 2);
            int i10 = n8.f9521f;
            int i11 = n8.f9522g;
            int i12 = n8.f9523h;
            if ((i12 > 0 && i10 <= i11) || (i12 < 0 && i11 <= i10)) {
                while (true) {
                    if (c(kVar.f5765d[i10])) {
                        aVar.f6496a++;
                    } else {
                        Object[] objArr3 = kVar.f5765d;
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
            if (length != this.f5765d.length) {
                if (length == kVar.f5765d.length) {
                    return kVar;
                }
                if (length == copyOf.length) {
                    return new k(0, 0, copyOf, bVar);
                }
                Object[] copyOf2 = Arrays.copyOf(copyOf, length);
                r6.k.e(copyOf2, "copyOf(this, newSize)");
                return new k(0, 0, copyOf2, bVar);
            }
        } else {
            int i13 = this.f5763b | kVar.f5763b;
            int i14 = this.f5762a;
            int i15 = kVar.f5762a;
            int i16 = (i14 ^ i15) & (~i13);
            int i17 = i14 & i15;
            int i18 = i16;
            while (i17 != 0) {
                int lowestOneBit = Integer.lowestOneBit(i17);
                if (r6.k.a(this.f5765d[f(lowestOneBit)], kVar.f5765d[kVar.f(lowestOneBit)])) {
                    i18 |= lowestOneBit;
                } else {
                    i13 |= lowestOneBit;
                }
                i17 ^= lowestOneBit;
            }
            if ((i13 & i18) != 0) {
                g0.d.S("Check failed.");
                throw null;
            }
            k kVar2 = (r6.k.a(this.f5764c, cVar.f6816f) && this.f5762a == i18 && this.f5763b == i13) ? this : new k(i18, i13, new Object[Integer.bitCount(i13) + (Integer.bitCount(i18) * 2)], null);
            int i19 = i13;
            int i20 = 0;
            while (i19 != 0) {
                int lowestOneBit2 = Integer.lowestOneBit(i19);
                Object[] objArr4 = kVar2.f5765d;
                int length2 = (objArr4.length - 1) - i20;
                if (i(lowestOneBit2)) {
                    j8 = s(t(lowestOneBit2));
                    if (kVar.i(lowestOneBit2)) {
                        j8 = j8.m(kVar.s(kVar.t(lowestOneBit2)), i7 + 5, aVar, cVar);
                        objArr = objArr4;
                    } else if (kVar.h(lowestOneBit2)) {
                        int f9 = kVar.f(lowestOneBit2);
                        Object obj = kVar.f5765d[f9];
                        Object x8 = kVar.x(f9);
                        int i21 = cVar.f6820j;
                        objArr = objArr4;
                        j8 = j8.l(obj != null ? obj.hashCode() : i8, obj, x8, i7 + 5, cVar);
                        if (cVar.f6820j == i21) {
                            aVar.f6496a++;
                        }
                    } else {
                        objArr = objArr4;
                    }
                } else {
                    objArr = objArr4;
                    if (kVar.i(lowestOneBit2)) {
                        k s5 = kVar.s(kVar.t(lowestOneBit2));
                        if (h(lowestOneBit2)) {
                            int f10 = f(lowestOneBit2);
                            Object obj2 = this.f5765d[f10];
                            int i22 = i7 + 5;
                            if (s5.d(obj2 != null ? obj2.hashCode() : 0, i22, obj2)) {
                                aVar.f6496a++;
                            } else {
                                j8 = s5.l(obj2 != null ? obj2.hashCode() : 0, obj2, x(f10), i22, cVar);
                            }
                        }
                        j8 = s5;
                    } else {
                        int f11 = f(lowestOneBit2);
                        Object obj3 = this.f5765d[f11];
                        Object x9 = x(f11);
                        int f12 = kVar.f(lowestOneBit2);
                        Object obj4 = kVar.f5765d[f12];
                        j8 = j(obj3 != null ? obj3.hashCode() : 0, obj3, x9, obj4 != null ? obj4.hashCode() : 0, obj4, kVar.x(f12), i7 + 5, cVar.f6816f);
                    }
                }
                objArr[length2] = j8;
                i20++;
                i19 ^= lowestOneBit2;
                i8 = 0;
            }
            int i23 = 0;
            while (i18 != 0) {
                int lowestOneBit3 = Integer.lowestOneBit(i18);
                int i24 = i23 * 2;
                if (kVar.h(lowestOneBit3)) {
                    int f13 = kVar.f(lowestOneBit3);
                    Object[] objArr5 = kVar2.f5765d;
                    objArr5[i24] = kVar.f5765d[f13];
                    objArr5[i24 + 1] = kVar.x(f13);
                    if (h(lowestOneBit3)) {
                        aVar.f6496a++;
                    }
                } else {
                    int f14 = f(lowestOneBit3);
                    Object[] objArr6 = kVar2.f5765d;
                    objArr6[i24] = this.f5765d[f14];
                    objArr6[i24 + 1] = x(f14);
                }
                i23++;
                i18 ^= lowestOneBit3;
            }
            if (!e(kVar2)) {
                return kVar.e(kVar2) ? kVar : kVar2;
            }
        }
        return this;
    }

    public final k n(int i7, Object obj, int i8, o0.c cVar) {
        k n8;
        int E = 1 << t6.a.E(i7, i8);
        if (h(E)) {
            int f9 = f(E);
            if (r6.k.a(obj, this.f5765d[f9])) {
                return p(f9, E, cVar);
            }
        } else if (i(E)) {
            int t2 = t(E);
            k s5 = s(t2);
            if (i8 == 30) {
                w6.b n9 = v1.g.n(v1.g.o(0, s5.f5765d.length), 2);
                int i9 = n9.f9521f;
                int i10 = n9.f9522g;
                int i11 = n9.f9523h;
                if ((i11 > 0 && i9 <= i10) || (i11 < 0 && i10 <= i9)) {
                    while (!r6.k.a(obj, s5.f5765d[i9])) {
                        if (i9 != i10) {
                            i9 += i11;
                        }
                    }
                    n8 = s5.k(i9, cVar);
                }
                n8 = s5;
                break;
            }
            n8 = s5.n(i7, obj, i8 + 5, cVar);
            return q(s5, n8, t2, E, cVar.f6816f);
        }
        return this;
    }

    public final k o(int i7, Object obj, Object obj2, int i8, o0.c cVar) {
        k kVar;
        k o2;
        int E = 1 << t6.a.E(i7, i8);
        if (h(E)) {
            int f9 = f(E);
            if (r6.k.a(obj, this.f5765d[f9]) && r6.k.a(obj2, x(f9))) {
                return p(f9, E, cVar);
            }
        } else if (i(E)) {
            int t2 = t(E);
            k s5 = s(t2);
            if (i8 == 30) {
                w6.b n8 = v1.g.n(v1.g.o(0, s5.f5765d.length), 2);
                int i9 = n8.f9521f;
                int i10 = n8.f9522g;
                int i11 = n8.f9523h;
                if ((i11 > 0 && i9 <= i10) || (i11 < 0 && i10 <= i9)) {
                    while (true) {
                        if (!r6.k.a(obj, s5.f5765d[i9]) || !r6.k.a(obj2, s5.x(i9))) {
                            if (i9 == i10) {
                                break;
                            }
                            i9 += i11;
                        } else {
                            o2 = s5.k(i9, cVar);
                            break;
                        }
                    }
                    kVar = s5;
                }
                o2 = s5;
                kVar = s5;
            } else {
                kVar = s5;
                o2 = kVar.o(i7, obj, obj2, i8 + 5, cVar);
            }
            return q(kVar, o2, t2, E, cVar.f6816f);
        }
        return this;
    }

    public final k p(int i7, int i8, o0.c cVar) {
        cVar.e(cVar.f6820j - 1);
        cVar.f6818h = x(i7);
        Object[] objArr = this.f5765d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f5764c != cVar.f6816f) {
            return new k(i8 ^ this.f5762a, this.f5763b, t6.a.l(objArr, i7), cVar.f6816f);
        }
        this.f5765d = t6.a.l(objArr, i7);
        this.f5762a ^= i8;
        return this;
    }

    public final k q(k kVar, k kVar2, int i7, int i8, n0.b bVar) {
        n0.b bVar2 = this.f5764c;
        if (kVar2 != null) {
            return (bVar2 == bVar || kVar != kVar2) ? r(i7, kVar2, bVar) : this;
        }
        Object[] objArr = this.f5765d;
        if (objArr.length == 1) {
            return null;
        }
        if (bVar2 != bVar) {
            return new k(this.f5762a, i8 ^ this.f5763b, t6.a.m(objArr, i7), bVar);
        }
        this.f5765d = t6.a.m(objArr, i7);
        this.f5763b ^= i8;
        return this;
    }

    public final k r(int i7, k kVar, n0.b bVar) {
        Object[] objArr = this.f5765d;
        if (objArr.length == 1 && kVar.f5765d.length == 2 && kVar.f5763b == 0) {
            kVar.f5762a = this.f5763b;
            return kVar;
        }
        if (this.f5764c == bVar) {
            objArr[i7] = kVar;
            return this;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        r6.k.e(copyOf, "copyOf(this, size)");
        copyOf[i7] = kVar;
        return new k(this.f5762a, this.f5763b, copyOf, bVar);
    }

    public final k s(int i7) {
        Object obj = this.f5765d[i7];
        r6.k.d(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        return (k) obj;
    }

    public final int t(int i7) {
        return (this.f5765d.length - 1) - Integer.bitCount((i7 - 1) & this.f5763b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d5, code lost:
    
        if (r14 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e1, code lost:
    
        r14.f5526c = w(r12, r4, (l0.k) r14.f5526c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00eb, code lost:
    
        return r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00de, code lost:
    
        if (r14 == null) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final l.i u(int i7, int i8, Object obj, Object obj2) {
        l.i u8;
        int i9 = 1;
        int E = 1 << t6.a.E(i7, i8);
        int i10 = 0;
        if (h(E)) {
            int f9 = f(E);
            if (!r6.k.a(obj, this.f5765d[f9])) {
                return new l.i(i9, 2, new k(this.f5762a ^ E, this.f5763b | E, a(f9, E, i7, obj, obj2, i8, null), null));
            }
            if (x(f9) != obj2) {
                Object[] objArr = this.f5765d;
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                r6.k.e(copyOf, "copyOf(this, size)");
                copyOf[f9 + 1] = obj2;
                return new l.i(i10, 2, new k(this.f5762a, this.f5763b, copyOf, null));
            }
        } else {
            if (!i(E)) {
                return new l.i(i9, 2, new k(this.f5762a | E, this.f5763b, t6.a.k(this.f5765d, f(E), obj, obj2), null));
            }
            int t2 = t(E);
            k s5 = s(t2);
            if (i8 == 30) {
                w6.b n8 = v1.g.n(v1.g.o(0, s5.f5765d.length), 2);
                int i11 = n8.f9521f;
                int i12 = n8.f9522g;
                int i13 = n8.f9523h;
                if ((i13 > 0 && i11 <= i12) || (i13 < 0 && i12 <= i11)) {
                    while (!r6.k.a(obj, s5.f5765d[i11])) {
                        if (i11 != i12) {
                            i11 += i13;
                        }
                    }
                    if (obj2 == s5.x(i11)) {
                        u8 = null;
                    } else {
                        Object[] objArr2 = s5.f5765d;
                        Object[] copyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                        r6.k.e(copyOf2, "copyOf(this, size)");
                        copyOf2[i11 + 1] = obj2;
                        u8 = new l.i(i10, 2, new k(0, 0, copyOf2, null));
                    }
                }
                u8 = new l.i(i9, 2, new k(0, 0, t6.a.k(s5.f5765d, 0, obj, obj2), null));
                break;
            }
            u8 = s5.u(i7, i8 + 5, obj, obj2);
        }
        return null;
    }

    public final k v(int i7, int i8, Object obj) {
        k v5;
        int E = 1 << t6.a.E(i7, i8);
        if (h(E)) {
            int f9 = f(E);
            if (r6.k.a(obj, this.f5765d[f9])) {
                Object[] objArr = this.f5765d;
                if (objArr.length != 2) {
                    return new k(this.f5762a ^ E, this.f5763b, t6.a.l(objArr, f9), null);
                }
                return null;
            }
            return this;
        }
        if (i(E)) {
            int t2 = t(E);
            k s5 = s(t2);
            if (i8 == 30) {
                w6.b n8 = v1.g.n(v1.g.o(0, s5.f5765d.length), 2);
                int i9 = n8.f9521f;
                int i10 = n8.f9522g;
                int i11 = n8.f9523h;
                if ((i11 > 0 && i9 <= i10) || (i11 < 0 && i10 <= i9)) {
                    while (!r6.k.a(obj, s5.f5765d[i9])) {
                        if (i9 != i10) {
                            i9 += i11;
                        }
                    }
                    Object[] objArr2 = s5.f5765d;
                    v5 = objArr2.length == 2 ? null : new k(0, 0, t6.a.l(objArr2, i9), null);
                }
                v5 = s5;
                break;
            }
            v5 = s5.v(i7, i8 + 5, obj);
            if (v5 == null) {
                Object[] objArr3 = this.f5765d;
                if (objArr3.length != 1) {
                    return new k(this.f5762a, E ^ this.f5763b, t6.a.m(objArr3, t2), null);
                }
                return null;
            }
            if (s5 != v5) {
                return w(t2, E, v5);
            }
        }
        return this;
    }

    public final k w(int i7, int i8, k kVar) {
        Object[] objArr = kVar.f5765d;
        if (objArr.length != 2 || kVar.f5763b != 0) {
            Object[] objArr2 = this.f5765d;
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length);
            r6.k.e(copyOf, "copyOf(this, newSize)");
            copyOf[i7] = kVar;
            return new k(this.f5762a, this.f5763b, copyOf, null);
        }
        if (this.f5765d.length == 1) {
            kVar.f5762a = this.f5763b;
            return kVar;
        }
        int f9 = f(i8);
        Object[] objArr3 = this.f5765d;
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        Object[] copyOf2 = Arrays.copyOf(objArr3, objArr3.length + 1);
        r6.k.e(copyOf2, "copyOf(this, newSize)");
        e6.k.X(copyOf2, copyOf2, i7 + 2, i7 + 1, objArr3.length);
        e6.k.X(copyOf2, copyOf2, f9 + 2, f9, i7);
        copyOf2[f9] = obj;
        copyOf2[f9 + 1] = obj2;
        return new k(this.f5762a ^ i8, i8 ^ this.f5763b, copyOf2, null);
    }

    public final Object x(int i7) {
        return this.f5765d[i7 + 1];
    }
}
