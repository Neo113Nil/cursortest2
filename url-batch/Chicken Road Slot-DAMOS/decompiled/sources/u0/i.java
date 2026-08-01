package u0;

import com.google.android.gms.internal.measurement.bf;
import java.util.Arrays;
import kotlin.collections.v;
import kotlin.jvm.internal.Intrinsics;
import n0.n1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: e, reason: collision with root package name */
    public static final i f9590e = new i(0, 0, new Object[0], null);

    /* renamed from: a, reason: collision with root package name */
    public int f9591a;

    /* renamed from: b, reason: collision with root package name */
    public int f9592b;

    /* renamed from: c, reason: collision with root package name */
    public final w0.b f9593c;

    /* renamed from: d, reason: collision with root package name */
    public Object[] f9594d;

    public i(int i3, int i10, Object[] objArr, w0.b bVar) {
        this.f9591a = i3;
        this.f9592b = i10;
        this.f9593c = bVar;
        this.f9594d = objArr;
    }

    public static i j(int i3, Object obj, Object obj2, int i10, Object obj3, Object obj4, int i11, w0.b bVar) {
        if (i11 > 30) {
            return new i(0, 0, new Object[]{obj, obj2, obj3, obj4}, bVar);
        }
        int E = g8.b.E(i3, i11);
        int E2 = g8.b.E(i10, i11);
        if (E != E2) {
            return new i((1 << E) | (1 << E2), 0, E < E2 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, bVar);
        }
        return new i(0, 1 << E, new Object[]{j(i3, obj, obj2, i10, obj3, obj4, i11 + 5, bVar)}, bVar);
    }

    public final Object[] a(int i3, int i10, int i11, Object obj, Object obj2, int i12, w0.b bVar) {
        Object obj3 = this.f9594d[i3];
        i j = j(obj3 != null ? obj3.hashCode() : 0, obj3, x(i3), i11, obj, obj2, i12 + 5, bVar);
        int t6 = t(i10);
        int i13 = t6 + 1;
        Object[] objArr = this.f9594d;
        Object[] objArr2 = new Object[objArr.length - 1];
        v.g(0, i3, 6, objArr, objArr2);
        v.d(i3, i3 + 2, i13, objArr, objArr2);
        objArr2[t6 - 1] = j;
        v.d(t6, i13, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public final int b() {
        if (this.f9592b == 0) {
            return this.f9594d.length / 2;
        }
        int bitCount = Integer.bitCount(this.f9591a);
        int length = this.f9594d.length;
        for (int i3 = bitCount * 2; i3 < length; i3++) {
            bitCount += s(i3).b();
        }
        return bitCount;
    }

    public final boolean c(Object obj) {
        kotlin.ranges.a e2 = be.f.e(be.f.f(0, this.f9594d.length));
        int i3 = e2.f5599d;
        int i10 = e2.f5600e;
        int i11 = e2.f5601i;
        if ((i11 > 0 && i3 <= i10) || (i11 < 0 && i10 <= i3)) {
            while (!Intrinsics.a(obj, this.f9594d[i3])) {
                if (i3 != i10) {
                    i3 += i11;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(int i3, int i10, Object obj) {
        int E = 1 << g8.b.E(i3, i10);
        if (h(E)) {
            return Intrinsics.a(obj, this.f9594d[f(E)]);
        }
        if (!i(E)) {
            return false;
        }
        i s3 = s(t(E));
        return i10 == 30 ? s3.c(obj) : s3.d(i3, i10 + 5, obj);
    }

    public final boolean e(i iVar) {
        if (this == iVar) {
            return true;
        }
        if (this.f9592b == iVar.f9592b && this.f9591a == iVar.f9591a) {
            int length = this.f9594d.length;
            for (int i3 = 0; i3 < length; i3++) {
                if (this.f9594d[i3] == iVar.f9594d[i3]) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f(int i3) {
        return Integer.bitCount((i3 - 1) & this.f9591a) * 2;
    }

    public final Object g(int i3, int i10, Object obj) {
        int E = 1 << g8.b.E(i3, i10);
        if (h(E)) {
            int f3 = f(E);
            if (Intrinsics.a(obj, this.f9594d[f3])) {
                return x(f3);
            }
            return null;
        }
        if (!i(E)) {
            return null;
        }
        i s3 = s(t(E));
        if (i10 != 30) {
            return s3.g(i3, i10 + 5, obj);
        }
        kotlin.ranges.a e2 = be.f.e(be.f.f(0, s3.f9594d.length));
        int i11 = e2.f5599d;
        int i12 = e2.f5600e;
        int i13 = e2.f5601i;
        if ((i13 <= 0 || i11 > i12) && (i13 >= 0 || i12 > i11)) {
            return null;
        }
        while (!Intrinsics.a(obj, s3.f9594d[i11])) {
            if (i11 == i12) {
                return null;
            }
            i11 += i13;
        }
        return s3.x(i11);
    }

    public final boolean h(int i3) {
        return (i3 & this.f9591a) != 0;
    }

    public final boolean i(int i3) {
        return (i3 & this.f9592b) != 0;
    }

    public final i k(int i3, x0.g gVar) {
        gVar.i(gVar.f10232s - 1);
        gVar.f10230i = x(i3);
        Object[] objArr = this.f9594d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f9593c != gVar.f10228d) {
            return new i(0, 0, g8.b.m(i3, objArr), gVar.f10228d);
        }
        this.f9594d = g8.b.m(i3, objArr);
        return this;
    }

    public final i l(int i3, Object obj, Object obj2, int i10, x0.g gVar) {
        x0.g gVar2;
        i l10;
        int E = 1 << g8.b.E(i3, i10);
        boolean h10 = h(E);
        w0.b bVar = this.f9593c;
        if (h10) {
            int f3 = f(E);
            if (!Intrinsics.a(obj, this.f9594d[f3])) {
                gVar.i(gVar.f10232s + 1);
                w0.b bVar2 = gVar.f10228d;
                if (bVar != bVar2) {
                    return new i(this.f9591a ^ E, this.f9592b | E, a(f3, E, i3, obj, obj2, i10, bVar2), bVar2);
                }
                this.f9594d = a(f3, E, i3, obj, obj2, i10, bVar2);
                this.f9591a ^= E;
                this.f9592b |= E;
                return this;
            }
            gVar.f10230i = x(f3);
            if (x(f3) == obj2) {
                return this;
            }
            if (bVar == gVar.f10228d) {
                this.f9594d[f3 + 1] = obj2;
                return this;
            }
            gVar.f10231r++;
            Object[] objArr = this.f9594d;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            copyOf[f3 + 1] = obj2;
            return new i(this.f9591a, this.f9592b, copyOf, gVar.f10228d);
        }
        if (!i(E)) {
            gVar.i(gVar.f10232s + 1);
            w0.b bVar3 = gVar.f10228d;
            int f10 = f(E);
            Object[] objArr2 = this.f9594d;
            if (bVar != bVar3) {
                return new i(this.f9591a | E, this.f9592b, g8.b.l(objArr2, f10, obj, obj2), bVar3);
            }
            this.f9594d = g8.b.l(objArr2, f10, obj, obj2);
            this.f9591a |= E;
            return this;
        }
        int t6 = t(E);
        i s3 = s(t6);
        if (i10 == 30) {
            kotlin.ranges.a e2 = be.f.e(be.f.f(0, s3.f9594d.length));
            int i11 = e2.f5599d;
            int i12 = e2.f5600e;
            int i13 = e2.f5601i;
            if ((i13 > 0 && i11 <= i12) || (i13 < 0 && i12 <= i11)) {
                while (!Intrinsics.a(obj, s3.f9594d[i11])) {
                    if (i11 != i12) {
                        i11 += i13;
                    }
                }
                gVar.f10230i = s3.x(i11);
                if (s3.f9593c == gVar.f10228d) {
                    s3.f9594d[i11 + 1] = obj2;
                    l10 = s3;
                } else {
                    gVar.f10231r++;
                    Object[] objArr3 = s3.f9594d;
                    Object[] copyOf2 = Arrays.copyOf(objArr3, objArr3.length);
                    copyOf2[i11 + 1] = obj2;
                    l10 = new i(0, 0, copyOf2, gVar.f10228d);
                }
                gVar2 = gVar;
            }
            gVar.i(gVar.f10232s + 1);
            l10 = new i(0, 0, g8.b.l(s3.f9594d, 0, obj, obj2), gVar.f10228d);
            gVar2 = gVar;
        } else {
            gVar2 = gVar;
            l10 = s3.l(i3, obj, obj2, i10 + 5, gVar2);
        }
        return s3 == l10 ? this : r(t6, l10, gVar2.f10228d);
    }

    public final i m(i iVar, int i3, w0.a aVar, x0.g gVar) {
        Object[] objArr;
        i j;
        if (this == iVar) {
            aVar.f10001a += b();
            return this;
        }
        int i10 = 0;
        if (i3 > 30) {
            w0.b bVar = gVar.f10228d;
            int i11 = iVar.f9592b;
            Object[] objArr2 = this.f9594d;
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length + iVar.f9594d.length);
            int length = this.f9594d.length;
            kotlin.ranges.a e2 = be.f.e(be.f.f(0, iVar.f9594d.length));
            int i12 = e2.f5599d;
            int i13 = e2.f5600e;
            int i14 = e2.f5601i;
            if ((i14 > 0 && i12 <= i13) || (i14 < 0 && i13 <= i12)) {
                while (true) {
                    if (c(iVar.f9594d[i12])) {
                        aVar.f10001a++;
                    } else {
                        Object[] objArr3 = iVar.f9594d;
                        copyOf[length] = objArr3[i12];
                        copyOf[length + 1] = objArr3[i12 + 1];
                        length += 2;
                    }
                    if (i12 == i13) {
                        break;
                    }
                    i12 += i14;
                }
            }
            if (length != this.f9594d.length) {
                return length == iVar.f9594d.length ? iVar : length == copyOf.length ? new i(0, 0, copyOf, bVar) : new i(0, 0, Arrays.copyOf(copyOf, length), bVar);
            }
        } else {
            int i15 = this.f9592b | iVar.f9592b;
            int i16 = this.f9591a;
            int i17 = iVar.f9591a;
            int i18 = (i16 ^ i17) & (~i15);
            int i19 = i16 & i17;
            int i20 = i18;
            while (i19 != 0) {
                int lowestOneBit = Integer.lowestOneBit(i19);
                if (Intrinsics.a(this.f9594d[f(lowestOneBit)], iVar.f9594d[iVar.f(lowestOneBit)])) {
                    i20 |= lowestOneBit;
                } else {
                    i15 |= lowestOneBit;
                }
                i19 ^= lowestOneBit;
            }
            if ((i15 & i20) != 0) {
                n1.b("Check failed.");
            }
            i iVar2 = (Intrinsics.a(this.f9593c, gVar.f10228d) && this.f9591a == i20 && this.f9592b == i15) ? this : new i(i20, i15, new Object[Integer.bitCount(i15) + (Integer.bitCount(i20) * 2)], null);
            int i21 = i15;
            int i22 = 0;
            while (i21 != 0) {
                int lowestOneBit2 = Integer.lowestOneBit(i21);
                Object[] objArr4 = iVar2.f9594d;
                int length2 = (objArr4.length - 1) - i22;
                if (i(lowestOneBit2)) {
                    j = s(t(lowestOneBit2));
                    if (iVar.i(lowestOneBit2)) {
                        j = j.m(iVar.s(iVar.t(lowestOneBit2)), i3 + 5, aVar, gVar);
                        objArr = objArr4;
                    } else if (iVar.h(lowestOneBit2)) {
                        int f3 = iVar.f(lowestOneBit2);
                        Object obj = iVar.f9594d[f3];
                        Object x10 = iVar.x(f3);
                        int i23 = gVar.f10232s;
                        objArr = objArr4;
                        j = j.l(obj != null ? obj.hashCode() : i10, obj, x10, i3 + 5, gVar);
                        if (gVar.f10232s == i23) {
                            aVar.f10001a++;
                        }
                    } else {
                        objArr = objArr4;
                    }
                } else {
                    objArr = objArr4;
                    if (iVar.i(lowestOneBit2)) {
                        i s3 = iVar.s(iVar.t(lowestOneBit2));
                        if (h(lowestOneBit2)) {
                            int f10 = f(lowestOneBit2);
                            Object obj2 = this.f9594d[f10];
                            int i24 = i3 + 5;
                            if (s3.d(obj2 != null ? obj2.hashCode() : 0, i24, obj2)) {
                                aVar.f10001a++;
                            } else {
                                j = s3.l(obj2 != null ? obj2.hashCode() : 0, obj2, x(f10), i24, gVar);
                            }
                        }
                        j = s3;
                    } else {
                        int f11 = f(lowestOneBit2);
                        Object obj3 = this.f9594d[f11];
                        Object x11 = x(f11);
                        int f12 = iVar.f(lowestOneBit2);
                        Object obj4 = iVar.f9594d[f12];
                        j = j(obj3 != null ? obj3.hashCode() : 0, obj3, x11, obj4 != null ? obj4.hashCode() : 0, obj4, iVar.x(f12), i3 + 5, gVar.f10228d);
                    }
                }
                objArr[length2] = j;
                i22++;
                i21 ^= lowestOneBit2;
                i10 = 0;
            }
            int i25 = 0;
            while (i20 != 0) {
                int lowestOneBit3 = Integer.lowestOneBit(i20);
                int i26 = i25 * 2;
                if (iVar.h(lowestOneBit3)) {
                    int f13 = iVar.f(lowestOneBit3);
                    Object[] objArr5 = iVar2.f9594d;
                    objArr5[i26] = iVar.f9594d[f13];
                    objArr5[i26 + 1] = iVar.x(f13);
                    if (h(lowestOneBit3)) {
                        aVar.f10001a++;
                    }
                } else {
                    int f14 = f(lowestOneBit3);
                    Object[] objArr6 = iVar2.f9594d;
                    objArr6[i26] = this.f9594d[f14];
                    objArr6[i26 + 1] = x(f14);
                }
                i25++;
                i20 ^= lowestOneBit3;
            }
            if (!e(iVar2)) {
                return iVar.e(iVar2) ? iVar : iVar2;
            }
        }
        return this;
    }

    public final i n(int i3, Object obj, int i10, x0.g gVar) {
        i n10;
        int E = 1 << g8.b.E(i3, i10);
        if (h(E)) {
            int f3 = f(E);
            if (Intrinsics.a(obj, this.f9594d[f3])) {
                return p(f3, E, gVar);
            }
        } else if (i(E)) {
            int t6 = t(E);
            i s3 = s(t6);
            if (i10 == 30) {
                kotlin.ranges.a e2 = be.f.e(be.f.f(0, s3.f9594d.length));
                int i11 = e2.f5599d;
                int i12 = e2.f5600e;
                int i13 = e2.f5601i;
                if ((i13 > 0 && i11 <= i12) || (i13 < 0 && i12 <= i11)) {
                    while (!Intrinsics.a(obj, s3.f9594d[i11])) {
                        if (i11 != i12) {
                            i11 += i13;
                        }
                    }
                    n10 = s3.k(i11, gVar);
                }
                n10 = s3;
                break;
            }
            n10 = s3.n(i3, obj, i10 + 5, gVar);
            return q(s3, n10, t6, E, gVar.f10228d);
        }
        return this;
    }

    public final i o(int i3, Object obj, Object obj2, int i10, x0.g gVar) {
        i iVar;
        i o6;
        int E = 1 << g8.b.E(i3, i10);
        if (h(E)) {
            int f3 = f(E);
            if (Intrinsics.a(obj, this.f9594d[f3]) && Intrinsics.a(obj2, x(f3))) {
                return p(f3, E, gVar);
            }
        } else if (i(E)) {
            int t6 = t(E);
            i s3 = s(t6);
            if (i10 == 30) {
                kotlin.ranges.a e2 = be.f.e(be.f.f(0, s3.f9594d.length));
                int i11 = e2.f5599d;
                int i12 = e2.f5600e;
                int i13 = e2.f5601i;
                if ((i13 > 0 && i11 <= i12) || (i13 < 0 && i12 <= i11)) {
                    while (true) {
                        if (!Intrinsics.a(obj, s3.f9594d[i11]) || !Intrinsics.a(obj2, s3.x(i11))) {
                            if (i11 == i12) {
                                break;
                            }
                            i11 += i13;
                        } else {
                            o6 = s3.k(i11, gVar);
                            break;
                        }
                    }
                }
                o6 = s3;
                iVar = s3;
            } else {
                iVar = s3;
                o6 = iVar.o(i3, obj, obj2, i10 + 5, gVar);
            }
            return q(iVar, o6, t6, E, gVar.f10228d);
        }
        return this;
    }

    public final i p(int i3, int i10, x0.g gVar) {
        gVar.i(gVar.f10232s - 1);
        gVar.f10230i = x(i3);
        Object[] objArr = this.f9594d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f9593c != gVar.f10228d) {
            return new i(i10 ^ this.f9591a, this.f9592b, g8.b.m(i3, objArr), gVar.f10228d);
        }
        this.f9594d = g8.b.m(i3, objArr);
        this.f9591a ^= i10;
        return this;
    }

    public final i q(i iVar, i iVar2, int i3, int i10, w0.b bVar) {
        w0.b bVar2 = this.f9593c;
        if (iVar2 != null) {
            return (bVar2 == bVar || iVar != iVar2) ? r(i3, iVar2, bVar) : this;
        }
        Object[] objArr = this.f9594d;
        if (objArr.length == 1) {
            return null;
        }
        if (bVar2 != bVar) {
            return new i(this.f9591a, i10 ^ this.f9592b, g8.b.n(i3, objArr), bVar);
        }
        this.f9594d = g8.b.n(i3, objArr);
        this.f9592b ^= i10;
        return this;
    }

    public final i r(int i3, i iVar, w0.b bVar) {
        Object[] objArr = this.f9594d;
        if (objArr.length == 1 && iVar.f9594d.length == 2 && iVar.f9592b == 0) {
            iVar.f9591a = this.f9592b;
            return iVar;
        }
        if (this.f9593c == bVar) {
            objArr[i3] = iVar;
            return this;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        copyOf[i3] = iVar;
        return new i(this.f9591a, this.f9592b, copyOf, bVar);
    }

    public final i s(int i3) {
        Object obj = this.f9594d[i3];
        obj.getClass();
        return (i) obj;
    }

    public final int t(int i3) {
        return (this.f9594d.length - 1) - Integer.bitCount((i3 - 1) & this.f9592b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c6, code lost:
    
        if (r14 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d2, code lost:
    
        r14.f2175e = w(r12, r4, (u0.i) r14.f2175e);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00dc, code lost:
    
        return r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00cf, code lost:
    
        if (r14 == null) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final bf u(int i3, int i10, Object obj, Object obj2) {
        bf u2;
        int i11 = 1;
        int E = 1 << g8.b.E(i3, i10);
        int i12 = 0;
        if (h(E)) {
            int f3 = f(E);
            if (!Intrinsics.a(obj, this.f9594d[f3])) {
                return new bf(i11, new i(this.f9591a ^ E, this.f9592b | E, a(f3, E, i3, obj, obj2, i10, null), null));
            }
            if (x(f3) != obj2) {
                Object[] objArr = this.f9594d;
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                copyOf[f3 + 1] = obj2;
                return new bf(i12, new i(this.f9591a, this.f9592b, copyOf, null));
            }
        } else {
            if (!i(E)) {
                return new bf(i11, new i(this.f9591a | E, this.f9592b, g8.b.l(this.f9594d, f(E), obj, obj2), null));
            }
            int t6 = t(E);
            i s3 = s(t6);
            if (i10 == 30) {
                kotlin.ranges.a e2 = be.f.e(be.f.f(0, s3.f9594d.length));
                int i13 = e2.f5599d;
                int i14 = e2.f5600e;
                int i15 = e2.f5601i;
                if ((i15 > 0 && i13 <= i14) || (i15 < 0 && i14 <= i13)) {
                    while (!Intrinsics.a(obj, s3.f9594d[i13])) {
                        if (i13 != i14) {
                            i13 += i15;
                        }
                    }
                    if (obj2 == s3.x(i13)) {
                        u2 = null;
                    } else {
                        Object[] objArr2 = s3.f9594d;
                        Object[] copyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                        copyOf2[i13 + 1] = obj2;
                        u2 = new bf(i12, new i(0, 0, copyOf2, null));
                    }
                }
                u2 = new bf(i11, new i(0, 0, g8.b.l(s3.f9594d, 0, obj, obj2), null));
                break;
            }
            u2 = s3.u(i3, i10 + 5, obj, obj2);
        }
        return null;
    }

    public final i v(int i3, int i10, Object obj) {
        i v10;
        int E = 1 << g8.b.E(i3, i10);
        if (h(E)) {
            int f3 = f(E);
            if (Intrinsics.a(obj, this.f9594d[f3])) {
                Object[] objArr = this.f9594d;
                if (objArr.length != 2) {
                    return new i(this.f9591a ^ E, this.f9592b, g8.b.m(f3, objArr), null);
                }
                return null;
            }
            return this;
        }
        if (i(E)) {
            int t6 = t(E);
            i s3 = s(t6);
            if (i10 == 30) {
                kotlin.ranges.a e2 = be.f.e(be.f.f(0, s3.f9594d.length));
                int i11 = e2.f5599d;
                int i12 = e2.f5600e;
                int i13 = e2.f5601i;
                if ((i13 > 0 && i11 <= i12) || (i13 < 0 && i12 <= i11)) {
                    while (!Intrinsics.a(obj, s3.f9594d[i11])) {
                        if (i11 != i12) {
                            i11 += i13;
                        }
                    }
                    Object[] objArr2 = s3.f9594d;
                    v10 = objArr2.length == 2 ? null : new i(0, 0, g8.b.m(i11, objArr2), null);
                }
                v10 = s3;
                break;
            }
            v10 = s3.v(i3, i10 + 5, obj);
            if (v10 == null) {
                Object[] objArr3 = this.f9594d;
                if (objArr3.length != 1) {
                    return new i(this.f9591a, E ^ this.f9592b, g8.b.n(t6, objArr3), null);
                }
                return null;
            }
            if (s3 != v10) {
                return w(t6, E, v10);
            }
        }
        return this;
    }

    public final i w(int i3, int i10, i iVar) {
        Object[] objArr = iVar.f9594d;
        if (objArr.length != 2 || iVar.f9592b != 0) {
            Object[] objArr2 = this.f9594d;
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length);
            copyOf[i3] = iVar;
            return new i(this.f9591a, this.f9592b, copyOf, null);
        }
        if (this.f9594d.length == 1) {
            iVar.f9591a = this.f9592b;
            return iVar;
        }
        int f3 = f(i10);
        Object[] objArr3 = this.f9594d;
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        Object[] copyOf2 = Arrays.copyOf(objArr3, objArr3.length + 1);
        v.d(i3 + 2, i3 + 1, objArr3.length, copyOf2, copyOf2);
        v.d(f3 + 2, f3, i3, copyOf2, copyOf2);
        copyOf2[f3] = obj;
        copyOf2[f3 + 1] = obj2;
        return new i(this.f9591a ^ i10, i10 ^ this.f9592b, copyOf2, null);
    }

    public final Object x(int i3) {
        return this.f9594d[i3 + 1];
    }
}
