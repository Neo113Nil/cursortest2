package defpackage;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.c;
import kotlin.ranges.d;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class uz2 {
    public static final uz2 e = new uz2(0, 0, new Object[0], null);
    public int a;
    public int b;
    public final nm1 c;
    public Object[] d;

    public uz2(int i, int i2, Object[] objArr, nm1 nm1Var) {
        this.a = i;
        this.b = i2;
        this.c = nm1Var;
        this.d = objArr;
    }

    public static uz2 j(int i, Object obj, Object obj2, int i2, Object obj3, Object obj4, int i3, nm1 nm1Var) {
        if (i3 > 30) {
            return new uz2(0, 0, new Object[]{obj, obj2, obj3, obj4}, nm1Var);
        }
        int j = hl2.j(i, i3);
        int j2 = hl2.j(i2, i3);
        if (j != j2) {
            return new uz2((1 << j) | (1 << j2), 0, j < j2 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, nm1Var);
        }
        return new uz2(0, 1 << j, new Object[]{j(i, obj, obj2, i2, obj3, obj4, i3 + 5, nm1Var)}, nm1Var);
    }

    public final Object[] a(int i, int i2, int i3, Object obj, Object obj2, int i4, nm1 nm1Var) {
        Object obj3 = this.d[i];
        uz2 j = j(obj3 != null ? obj3.hashCode() : 0, obj3, x(i), i3, obj, obj2, i4 + 5, nm1Var);
        int t = t(i2);
        int i5 = t + 1;
        Object[] objArr = this.d;
        Object[] objArr2 = new Object[objArr.length - 1];
        ni.i(0, i, 6, objArr, objArr2);
        ni.e(i, i + 2, i5, objArr, objArr2);
        objArr2[t - 1] = j;
        ni.e(t, i5, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public final int b() {
        if (this.b == 0) {
            return this.d.length / 2;
        }
        int bitCount = Integer.bitCount(this.a);
        int length = this.d.length;
        for (int i = bitCount * 2; i < length; i++) {
            bitCount += s(i).b();
        }
        return bitCount;
    }

    public final boolean c(Object obj) {
        c e2 = d.e(d.f(0, this.d.length), 2);
        int i = e2.m;
        int i2 = e2.n;
        int i3 = e2.o;
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (!Intrinsics.b(obj, this.d[i])) {
                if (i != i2) {
                    i += i3;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(int i, int i2, Object obj) {
        int j = 1 << hl2.j(i, i2);
        if (h(j)) {
            return Intrinsics.b(obj, this.d[f(j)]);
        }
        if (!i(j)) {
            return false;
        }
        uz2 s = s(t(j));
        return i2 == 30 ? s.c(obj) : s.d(i, i2 + 5, obj);
    }

    public final boolean e(uz2 uz2Var) {
        if (this == uz2Var) {
            return true;
        }
        if (this.b == uz2Var.b && this.a == uz2Var.a) {
            int length = this.d.length;
            for (int i = 0; i < length; i++) {
                if (this.d[i] == uz2Var.d[i]) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f(int i) {
        return Integer.bitCount(this.a & (i - 1)) * 2;
    }

    public final Object g(int i, int i2, Object obj) {
        int j = 1 << hl2.j(i, i2);
        if (h(j)) {
            int f = f(j);
            if (Intrinsics.b(obj, this.d[f])) {
                return x(f);
            }
            return null;
        }
        if (!i(j)) {
            return null;
        }
        uz2 s = s(t(j));
        if (i2 != 30) {
            return s.g(i, i2 + 5, obj);
        }
        c e2 = d.e(d.f(0, s.d.length), 2);
        int i3 = e2.m;
        int i4 = e2.n;
        int i5 = e2.o;
        if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
            return null;
        }
        while (!Intrinsics.b(obj, s.d[i3])) {
            if (i3 == i4) {
                return null;
            }
            i3 += i5;
        }
        return s.x(i3);
    }

    public final boolean h(int i) {
        return (this.a & i) != 0;
    }

    public final boolean i(int i) {
        return (this.b & i) != 0;
    }

    public final uz2 k(int i, u02 u02Var) {
        u02Var.i(u02Var.q - 1);
        u02Var.o = x(i);
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.c != u02Var.m) {
            return new uz2(0, 0, hl2.c(i, objArr), u02Var.m);
        }
        this.d = hl2.c(i, objArr);
        return this;
    }

    public final uz2 l(int i, Object obj, Object obj2, int i2, u02 u02Var) {
        u02 u02Var2;
        uz2 l;
        int j = 1 << hl2.j(i, i2);
        boolean h = h(j);
        nm1 nm1Var = this.c;
        if (h) {
            int f = f(j);
            if (!Intrinsics.b(obj, this.d[f])) {
                u02Var.i(u02Var.q + 1);
                nm1 nm1Var2 = u02Var.m;
                if (nm1Var != nm1Var2) {
                    return new uz2(this.a ^ j, this.b | j, a(f, j, i, obj, obj2, i2, nm1Var2), nm1Var2);
                }
                this.d = a(f, j, i, obj, obj2, i2, nm1Var2);
                this.a ^= j;
                this.b |= j;
                return this;
            }
            u02Var.o = x(f);
            if (x(f) == obj2) {
                return this;
            }
            if (nm1Var == u02Var.m) {
                this.d[f + 1] = obj2;
                return this;
            }
            u02Var.p++;
            Object[] objArr = this.d;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            copyOf[f + 1] = obj2;
            return new uz2(this.a, this.b, copyOf, u02Var.m);
        }
        if (!i(j)) {
            u02Var.i(u02Var.q + 1);
            nm1 nm1Var3 = u02Var.m;
            int f2 = f(j);
            Object[] objArr2 = this.d;
            if (nm1Var != nm1Var3) {
                return new uz2(this.a | j, this.b, hl2.b(objArr2, f2, obj, obj2), nm1Var3);
            }
            this.d = hl2.b(objArr2, f2, obj, obj2);
            this.a |= j;
            return this;
        }
        int t = t(j);
        uz2 s = s(t);
        if (i2 == 30) {
            c e2 = d.e(d.f(0, s.d.length), 2);
            int i3 = e2.m;
            int i4 = e2.n;
            int i5 = e2.o;
            if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                while (!Intrinsics.b(obj, s.d[i3])) {
                    if (i3 != i4) {
                        i3 += i5;
                    }
                }
                u02Var.o = s.x(i3);
                if (s.c == u02Var.m) {
                    s.d[i3 + 1] = obj2;
                    l = s;
                } else {
                    u02Var.p++;
                    Object[] objArr3 = s.d;
                    Object[] copyOf2 = Arrays.copyOf(objArr3, objArr3.length);
                    copyOf2[i3 + 1] = obj2;
                    l = new uz2(0, 0, copyOf2, u02Var.m);
                }
                u02Var2 = u02Var;
            }
            u02Var.i(u02Var.q + 1);
            l = new uz2(0, 0, hl2.b(s.d, 0, obj, obj2), u02Var.m);
            u02Var2 = u02Var;
        } else {
            u02Var2 = u02Var;
            l = s.l(i, obj, obj2, i2 + 5, u02Var2);
        }
        return s == l ? this : r(t, l, u02Var2.m);
    }

    public final uz2 m(uz2 uz2Var, int i, ba0 ba0Var, u02 u02Var) {
        Object[] objArr;
        uz2 j;
        if (this == uz2Var) {
            ba0Var.a += b();
            return this;
        }
        int i2 = 0;
        if (i > 30) {
            nm1 nm1Var = u02Var.m;
            int i3 = uz2Var.b;
            Object[] objArr2 = this.d;
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length + uz2Var.d.length);
            int length = this.d.length;
            c e2 = d.e(d.f(0, uz2Var.d.length), 2);
            int i4 = e2.m;
            int i5 = e2.n;
            int i6 = e2.o;
            if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                while (true) {
                    if (c(uz2Var.d[i4])) {
                        ba0Var.a++;
                    } else {
                        Object[] objArr3 = uz2Var.d;
                        copyOf[length] = objArr3[i4];
                        copyOf[length + 1] = objArr3[i4 + 1];
                        length += 2;
                    }
                    if (i4 == i5) {
                        break;
                    }
                    i4 += i6;
                }
            }
            if (length != this.d.length) {
                return length == uz2Var.d.length ? uz2Var : length == copyOf.length ? new uz2(0, 0, copyOf, nm1Var) : new uz2(0, 0, Arrays.copyOf(copyOf, length), nm1Var);
            }
        } else {
            int i7 = this.b | uz2Var.b;
            int i8 = this.a;
            int i9 = uz2Var.a;
            int i10 = (i8 ^ i9) & (~i7);
            int i11 = i8 & i9;
            int i12 = i10;
            while (i11 != 0) {
                int lowestOneBit = Integer.lowestOneBit(i11);
                if (Intrinsics.b(this.d[f(lowestOneBit)], uz2Var.d[uz2Var.f(lowestOneBit)])) {
                    i12 |= lowestOneBit;
                } else {
                    i7 |= lowestOneBit;
                }
                i11 ^= lowestOneBit;
            }
            if ((i7 & i12) != 0) {
                v32.b("Check failed.");
            }
            uz2 uz2Var2 = (Intrinsics.b(this.c, u02Var.m) && this.a == i12 && this.b == i7) ? this : new uz2(i12, i7, new Object[Integer.bitCount(i7) + (Integer.bitCount(i12) * 2)], null);
            int i13 = i7;
            int i14 = 0;
            while (i13 != 0) {
                int lowestOneBit2 = Integer.lowestOneBit(i13);
                Object[] objArr4 = uz2Var2.d;
                int length2 = (objArr4.length - 1) - i14;
                if (i(lowestOneBit2)) {
                    j = s(t(lowestOneBit2));
                    if (uz2Var.i(lowestOneBit2)) {
                        j = j.m(uz2Var.s(uz2Var.t(lowestOneBit2)), i + 5, ba0Var, u02Var);
                        objArr = objArr4;
                    } else if (uz2Var.h(lowestOneBit2)) {
                        int f = uz2Var.f(lowestOneBit2);
                        Object obj = uz2Var.d[f];
                        Object x = uz2Var.x(f);
                        int i15 = u02Var.q;
                        objArr = objArr4;
                        j = j.l(obj != null ? obj.hashCode() : i2, obj, x, i + 5, u02Var);
                        if (u02Var.q == i15) {
                            ba0Var.a++;
                        }
                    } else {
                        objArr = objArr4;
                    }
                } else {
                    objArr = objArr4;
                    if (uz2Var.i(lowestOneBit2)) {
                        uz2 s = uz2Var.s(uz2Var.t(lowestOneBit2));
                        if (h(lowestOneBit2)) {
                            int f2 = f(lowestOneBit2);
                            Object obj2 = this.d[f2];
                            int i16 = i + 5;
                            if (s.d(obj2 != null ? obj2.hashCode() : 0, i16, obj2)) {
                                ba0Var.a++;
                            } else {
                                j = s.l(obj2 != null ? obj2.hashCode() : 0, obj2, x(f2), i16, u02Var);
                            }
                        }
                        j = s;
                    } else {
                        int f3 = f(lowestOneBit2);
                        Object obj3 = this.d[f3];
                        Object x2 = x(f3);
                        int f4 = uz2Var.f(lowestOneBit2);
                        Object obj4 = uz2Var.d[f4];
                        j = j(obj3 != null ? obj3.hashCode() : 0, obj3, x2, obj4 != null ? obj4.hashCode() : 0, obj4, uz2Var.x(f4), i + 5, u02Var.m);
                    }
                }
                objArr[length2] = j;
                i14++;
                i13 ^= lowestOneBit2;
                i2 = 0;
            }
            int i17 = 0;
            while (i12 != 0) {
                int lowestOneBit3 = Integer.lowestOneBit(i12);
                int i18 = i17 * 2;
                if (uz2Var.h(lowestOneBit3)) {
                    int f5 = uz2Var.f(lowestOneBit3);
                    Object[] objArr5 = uz2Var2.d;
                    objArr5[i18] = uz2Var.d[f5];
                    objArr5[i18 + 1] = uz2Var.x(f5);
                    if (h(lowestOneBit3)) {
                        ba0Var.a++;
                    }
                } else {
                    int f6 = f(lowestOneBit3);
                    Object[] objArr6 = uz2Var2.d;
                    objArr6[i18] = this.d[f6];
                    objArr6[i18 + 1] = x(f6);
                }
                i17++;
                i12 ^= lowestOneBit3;
            }
            if (!e(uz2Var2)) {
                return uz2Var.e(uz2Var2) ? uz2Var : uz2Var2;
            }
        }
        return this;
    }

    public final uz2 n(int i, Object obj, int i2, u02 u02Var) {
        uz2 n;
        int j = 1 << hl2.j(i, i2);
        if (h(j)) {
            int f = f(j);
            if (Intrinsics.b(obj, this.d[f])) {
                return p(f, j, u02Var);
            }
        } else if (i(j)) {
            int t = t(j);
            uz2 s = s(t);
            if (i2 == 30) {
                c e2 = d.e(d.f(0, s.d.length), 2);
                int i3 = e2.m;
                int i4 = e2.n;
                int i5 = e2.o;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (!Intrinsics.b(obj, s.d[i3])) {
                        if (i3 != i4) {
                            i3 += i5;
                        }
                    }
                    n = s.k(i3, u02Var);
                }
                n = s;
                break;
            }
            n = s.n(i, obj, i2 + 5, u02Var);
            return q(s, n, t, j, u02Var.m);
        }
        return this;
    }

    public final uz2 o(int i, Object obj, Object obj2, int i2, u02 u02Var) {
        u02 u02Var2;
        uz2 o;
        int j = 1 << hl2.j(i, i2);
        if (h(j)) {
            int f = f(j);
            return (Intrinsics.b(obj, this.d[f]) && Intrinsics.b(obj2, x(f))) ? p(f, j, u02Var) : this;
        }
        if (!i(j)) {
            return this;
        }
        int t = t(j);
        uz2 s = s(t);
        if (i2 == 30) {
            c e2 = d.e(d.f(0, s.d.length), 2);
            int i3 = e2.m;
            int i4 = e2.n;
            int i5 = e2.o;
            if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                while (true) {
                    if (!Intrinsics.b(obj, s.d[i3]) || !Intrinsics.b(obj2, s.x(i3))) {
                        if (i3 == i4) {
                            break;
                        }
                        i3 += i5;
                    } else {
                        o = s.k(i3, u02Var);
                        break;
                    }
                }
                u02Var2 = u02Var;
            }
            o = s;
            u02Var2 = u02Var;
        } else {
            u02Var2 = u02Var;
            o = s.o(i, obj, obj2, i2 + 5, u02Var2);
        }
        return q(s, o, t, j, u02Var2.m);
    }

    public final uz2 p(int i, int i2, u02 u02Var) {
        u02Var.i(u02Var.q - 1);
        u02Var.o = x(i);
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.c != u02Var.m) {
            return new uz2(i2 ^ this.a, this.b, hl2.c(i, objArr), u02Var.m);
        }
        this.d = hl2.c(i, objArr);
        this.a ^= i2;
        return this;
    }

    public final uz2 q(uz2 uz2Var, uz2 uz2Var2, int i, int i2, nm1 nm1Var) {
        nm1 nm1Var2 = this.c;
        if (uz2Var2 != null) {
            return (nm1Var2 == nm1Var || uz2Var != uz2Var2) ? r(i, uz2Var2, nm1Var) : this;
        }
        Object[] objArr = this.d;
        if (objArr.length == 1) {
            return null;
        }
        if (nm1Var2 != nm1Var) {
            return new uz2(this.a, this.b ^ i2, hl2.d(i, objArr), nm1Var);
        }
        this.d = hl2.d(i, objArr);
        this.b ^= i2;
        return this;
    }

    public final uz2 r(int i, uz2 uz2Var, nm1 nm1Var) {
        Object[] objArr = this.d;
        if (objArr.length == 1 && uz2Var.d.length == 2 && uz2Var.b == 0) {
            uz2Var.a = this.b;
            return uz2Var;
        }
        if (this.c == nm1Var) {
            objArr[i] = uz2Var;
            return this;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        copyOf[i] = uz2Var;
        return new uz2(this.a, this.b, copyOf, nm1Var);
    }

    public final uz2 s(int i) {
        Object obj = this.d[i];
        obj.getClass();
        return (uz2) obj;
    }

    public final int t(int i) {
        return (this.d.length - 1) - Integer.bitCount(this.b & (i - 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c6, code lost:
    
        if (r13 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d2, code lost:
    
        r13.b = w(r11, r4, (defpackage.uz2) r13.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00dc, code lost:
    
        return r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00cf, code lost:
    
        if (r13 == null) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final r5 u(int i, int i2, Object obj, Object obj2) {
        r5 u;
        int i3 = 1;
        int j = 1 << hl2.j(i, i2);
        int i4 = 0;
        if (h(j)) {
            int f = f(j);
            if (!Intrinsics.b(obj, this.d[f])) {
                return new r5(i3, new uz2(this.a ^ j, this.b | j, a(f, j, i, obj, obj2, i2, null), null));
            }
            if (x(f) != obj2) {
                Object[] objArr = this.d;
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                copyOf[f + 1] = obj2;
                return new r5(i4, new uz2(this.a, this.b, copyOf, null));
            }
        } else {
            if (!i(j)) {
                return new r5(i3, new uz2(this.a | j, this.b, hl2.b(this.d, f(j), obj, obj2), null));
            }
            int t = t(j);
            uz2 s = s(t);
            if (i2 == 30) {
                c e2 = d.e(d.f(0, s.d.length), 2);
                int i5 = e2.m;
                int i6 = e2.n;
                int i7 = e2.o;
                if ((i7 > 0 && i5 <= i6) || (i7 < 0 && i6 <= i5)) {
                    while (!Intrinsics.b(obj, s.d[i5])) {
                        if (i5 != i6) {
                            i5 += i7;
                        }
                    }
                    if (obj2 == s.x(i5)) {
                        u = null;
                    } else {
                        Object[] objArr2 = s.d;
                        Object[] copyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                        copyOf2[i5 + 1] = obj2;
                        u = new r5(i4, new uz2(0, 0, copyOf2, null));
                    }
                }
                u = new r5(i3, new uz2(0, 0, hl2.b(s.d, 0, obj, obj2), null));
                break;
            }
            u = s.u(i, i2 + 5, obj, obj2);
        }
        return null;
    }

    public final uz2 v(int i, int i2, Object obj) {
        uz2 v;
        int j = 1 << hl2.j(i, i2);
        if (h(j)) {
            int f = f(j);
            if (!Intrinsics.b(obj, this.d[f])) {
                return this;
            }
            Object[] objArr = this.d;
            if (objArr.length != 2) {
                return new uz2(this.a ^ j, this.b, hl2.c(f, objArr), null);
            }
        } else {
            if (!i(j)) {
                return this;
            }
            int t = t(j);
            uz2 s = s(t);
            if (i2 == 30) {
                c e2 = d.e(d.f(0, s.d.length), 2);
                int i3 = e2.m;
                int i4 = e2.n;
                int i5 = e2.o;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (!Intrinsics.b(obj, s.d[i3])) {
                        if (i3 != i4) {
                            i3 += i5;
                        }
                    }
                    Object[] objArr2 = s.d;
                    v = objArr2.length == 2 ? null : new uz2(0, 0, hl2.c(i3, objArr2), null);
                }
                v = s;
                break;
            }
            v = s.v(i, i2 + 5, obj);
            if (v != null) {
                return s != v ? w(t, j, v) : this;
            }
            Object[] objArr3 = this.d;
            if (objArr3.length != 1) {
                return new uz2(this.a, this.b ^ j, hl2.d(t, objArr3), null);
            }
        }
        return null;
    }

    public final uz2 w(int i, int i2, uz2 uz2Var) {
        Object[] objArr = uz2Var.d;
        if (objArr.length != 2 || uz2Var.b != 0) {
            Object[] objArr2 = this.d;
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length);
            copyOf[i] = uz2Var;
            return new uz2(this.a, this.b, copyOf, null);
        }
        if (this.d.length == 1) {
            uz2Var.a = this.b;
            return uz2Var;
        }
        int f = f(i2);
        Object[] objArr3 = this.d;
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        Object[] copyOf2 = Arrays.copyOf(objArr3, objArr3.length + 1);
        ni.e(i + 2, i + 1, objArr3.length, copyOf2, copyOf2);
        ni.e(f + 2, f, i, copyOf2, copyOf2);
        copyOf2[f] = obj;
        copyOf2[f + 1] = obj2;
        return new uz2(this.a ^ i2, this.b ^ i2, copyOf2, null);
    }

    public final Object x(int i) {
        return this.d[i + 1];
    }
}
