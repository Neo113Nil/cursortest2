package defpackage;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.a;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class oj1 {
    public static final oj1 e = new oj1(0, 0, new Object[0], null);
    public int a;
    public int b;
    public final j41 c;
    public Object[] d;

    public oj1(int i, int i2, Object[] objArr, j41 j41Var) {
        this.a = i;
        this.b = i2;
        this.c = j41Var;
        this.d = objArr;
    }

    public static oj1 j(int i, Object obj, Object obj2, int i2, Object obj3, Object obj4, int i3, j41 j41Var) {
        if (i3 > 30) {
            return new oj1(0, 0, new Object[]{obj, obj2, obj3, obj4}, j41Var);
        }
        int p = xa0.p(i, i3);
        int p2 = xa0.p(i2, i3);
        if (p != p2) {
            return new oj1((1 << p) | (1 << p2), 0, p < p2 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, j41Var);
        }
        return new oj1(0, 1 << p, new Object[]{j(i, obj, obj2, i2, obj3, obj4, i3 + 5, j41Var)}, j41Var);
    }

    public final Object[] a(int i, int i2, int i3, Object obj, Object obj2, int i4, j41 j41Var) {
        Object obj3 = this.d[i];
        oj1 j = j(obj3 != null ? obj3.hashCode() : 0, obj3, x(i), i3, obj, obj2, i4 + 5, j41Var);
        int t = t(i2);
        int i5 = t + 1;
        Object[] objArr = this.d;
        Object[] objArr2 = new Object[objArr.length - 1];
        w9.e(objArr, objArr2, 0, i, 6);
        w9.c(objArr, objArr2, i, i + 2, i5);
        objArr2[t - 1] = j;
        w9.c(objArr, objArr2, t, i5, objArr.length);
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
        a f = b11.f(b11.g(0, this.d.length));
        int i = f.d;
        int i2 = f.e;
        int i3 = f.g;
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (!Intrinsics.a(obj, this.d[i])) {
                if (i != i2) {
                    i += i3;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(int i, int i2, Object obj) {
        int p = 1 << xa0.p(i, i2);
        if (h(p)) {
            return Intrinsics.a(obj, this.d[f(p)]);
        }
        if (!i(p)) {
            return false;
        }
        oj1 s = s(t(p));
        return i2 == 30 ? s.c(obj) : s.d(i, i2 + 5, obj);
    }

    public final boolean e(oj1 oj1Var) {
        if (this == oj1Var) {
            return true;
        }
        if (this.b == oj1Var.b && this.a == oj1Var.a) {
            int length = this.d.length;
            for (int i = 0; i < length; i++) {
                if (this.d[i] == oj1Var.d[i]) {
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
        int p = 1 << xa0.p(i, i2);
        if (h(p)) {
            int f = f(p);
            if (Intrinsics.a(obj, this.d[f])) {
                return x(f);
            }
            return null;
        }
        if (!i(p)) {
            return null;
        }
        oj1 s = s(t(p));
        if (i2 != 30) {
            return s.g(i, i2 + 5, obj);
        }
        a f2 = b11.f(b11.g(0, s.d.length));
        int i3 = f2.d;
        int i4 = f2.e;
        int i5 = f2.g;
        if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
            return null;
        }
        while (!Intrinsics.a(obj, s.d[i3])) {
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

    public final oj1 k(int i, jw0 jw0Var) {
        jw0Var.i(jw0Var.i - 1);
        jw0Var.g = x(i);
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.c != jw0Var.d) {
            return new oj1(0, 0, xa0.f(i, objArr), jw0Var.d);
        }
        this.d = xa0.f(i, objArr);
        return this;
    }

    public final oj1 l(int i, Object obj, Object obj2, int i2, jw0 jw0Var) {
        jw0 jw0Var2;
        oj1 l;
        int p = 1 << xa0.p(i, i2);
        boolean h = h(p);
        j41 j41Var = this.c;
        if (h) {
            int f = f(p);
            if (!Intrinsics.a(obj, this.d[f])) {
                jw0Var.i(jw0Var.i + 1);
                j41 j41Var2 = jw0Var.d;
                if (j41Var != j41Var2) {
                    return new oj1(this.a ^ p, this.b | p, a(f, p, i, obj, obj2, i2, j41Var2), j41Var2);
                }
                this.d = a(f, p, i, obj, obj2, i2, j41Var2);
                this.a ^= p;
                this.b |= p;
                return this;
            }
            jw0Var.g = x(f);
            if (x(f) == obj2) {
                return this;
            }
            if (j41Var == jw0Var.d) {
                this.d[f + 1] = obj2;
                return this;
            }
            jw0Var.h++;
            Object[] objArr = this.d;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            copyOf[f + 1] = obj2;
            return new oj1(this.a, this.b, copyOf, jw0Var.d);
        }
        if (!i(p)) {
            jw0Var.i(jw0Var.i + 1);
            j41 j41Var3 = jw0Var.d;
            int f2 = f(p);
            Object[] objArr2 = this.d;
            if (j41Var != j41Var3) {
                return new oj1(this.a | p, this.b, xa0.e(objArr2, f2, obj, obj2), j41Var3);
            }
            this.d = xa0.e(objArr2, f2, obj, obj2);
            this.a |= p;
            return this;
        }
        int t = t(p);
        oj1 s = s(t);
        if (i2 == 30) {
            a f3 = b11.f(b11.g(0, s.d.length));
            int i3 = f3.d;
            int i4 = f3.e;
            int i5 = f3.g;
            if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                while (!Intrinsics.a(obj, s.d[i3])) {
                    if (i3 != i4) {
                        i3 += i5;
                    }
                }
                jw0Var.g = s.x(i3);
                if (s.c == jw0Var.d) {
                    s.d[i3 + 1] = obj2;
                    l = s;
                } else {
                    jw0Var.h++;
                    Object[] objArr3 = s.d;
                    Object[] copyOf2 = Arrays.copyOf(objArr3, objArr3.length);
                    copyOf2[i3 + 1] = obj2;
                    l = new oj1(0, 0, copyOf2, jw0Var.d);
                }
                jw0Var2 = jw0Var;
            }
            jw0Var.i(jw0Var.i + 1);
            l = new oj1(0, 0, xa0.e(s.d, 0, obj, obj2), jw0Var.d);
            jw0Var2 = jw0Var;
        } else {
            jw0Var2 = jw0Var;
            l = s.l(i, obj, obj2, i2 + 5, jw0Var2);
        }
        return s == l ? this : r(t, l, jw0Var2.d);
    }

    public final oj1 m(oj1 oj1Var, int i, mr mrVar, jw0 jw0Var) {
        Object[] objArr;
        oj1 j;
        if (this == oj1Var) {
            mrVar.a += b();
            return this;
        }
        int i2 = 0;
        if (i > 30) {
            j41 j41Var = jw0Var.d;
            int i3 = oj1Var.b;
            Object[] objArr2 = this.d;
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length + oj1Var.d.length);
            int length = this.d.length;
            a f = b11.f(b11.g(0, oj1Var.d.length));
            int i4 = f.d;
            int i5 = f.e;
            int i6 = f.g;
            if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                while (true) {
                    if (c(oj1Var.d[i4])) {
                        mrVar.a++;
                    } else {
                        Object[] objArr3 = oj1Var.d;
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
                return length == oj1Var.d.length ? oj1Var : length == copyOf.length ? new oj1(0, 0, copyOf, j41Var) : new oj1(0, 0, Arrays.copyOf(copyOf, length), j41Var);
            }
        } else {
            int i7 = this.b | oj1Var.b;
            int i8 = this.a;
            int i9 = oj1Var.a;
            int i10 = (i8 ^ i9) & (~i7);
            int i11 = i8 & i9;
            int i12 = i10;
            while (i11 != 0) {
                int lowestOneBit = Integer.lowestOneBit(i11);
                if (Intrinsics.a(this.d[f(lowestOneBit)], oj1Var.d[oj1Var.f(lowestOneBit)])) {
                    i12 |= lowestOneBit;
                } else {
                    i7 |= lowestOneBit;
                }
                i11 ^= lowestOneBit;
            }
            if ((i7 & i12) != 0) {
                cy0.b("Check failed.");
            }
            oj1 oj1Var2 = (Intrinsics.a(this.c, jw0Var.d) && this.a == i12 && this.b == i7) ? this : new oj1(i12, i7, new Object[Integer.bitCount(i7) + (Integer.bitCount(i12) * 2)], null);
            int i13 = i7;
            int i14 = 0;
            while (i13 != 0) {
                int lowestOneBit2 = Integer.lowestOneBit(i13);
                Object[] objArr4 = oj1Var2.d;
                int length2 = (objArr4.length - 1) - i14;
                if (i(lowestOneBit2)) {
                    j = s(t(lowestOneBit2));
                    if (oj1Var.i(lowestOneBit2)) {
                        j = j.m(oj1Var.s(oj1Var.t(lowestOneBit2)), i + 5, mrVar, jw0Var);
                        objArr = objArr4;
                    } else if (oj1Var.h(lowestOneBit2)) {
                        int f2 = oj1Var.f(lowestOneBit2);
                        Object obj = oj1Var.d[f2];
                        Object x = oj1Var.x(f2);
                        int i15 = jw0Var.i;
                        objArr = objArr4;
                        j = j.l(obj != null ? obj.hashCode() : i2, obj, x, i + 5, jw0Var);
                        if (jw0Var.i == i15) {
                            mrVar.a++;
                        }
                    } else {
                        objArr = objArr4;
                    }
                } else {
                    objArr = objArr4;
                    if (oj1Var.i(lowestOneBit2)) {
                        oj1 s = oj1Var.s(oj1Var.t(lowestOneBit2));
                        if (h(lowestOneBit2)) {
                            int f3 = f(lowestOneBit2);
                            Object obj2 = this.d[f3];
                            int i16 = i + 5;
                            if (s.d(obj2 != null ? obj2.hashCode() : 0, i16, obj2)) {
                                mrVar.a++;
                            } else {
                                j = s.l(obj2 != null ? obj2.hashCode() : 0, obj2, x(f3), i16, jw0Var);
                            }
                        }
                        j = s;
                    } else {
                        int f4 = f(lowestOneBit2);
                        Object obj3 = this.d[f4];
                        Object x2 = x(f4);
                        int f5 = oj1Var.f(lowestOneBit2);
                        Object obj4 = oj1Var.d[f5];
                        j = j(obj3 != null ? obj3.hashCode() : 0, obj3, x2, obj4 != null ? obj4.hashCode() : 0, obj4, oj1Var.x(f5), i + 5, jw0Var.d);
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
                if (oj1Var.h(lowestOneBit3)) {
                    int f6 = oj1Var.f(lowestOneBit3);
                    Object[] objArr5 = oj1Var2.d;
                    objArr5[i18] = oj1Var.d[f6];
                    objArr5[i18 + 1] = oj1Var.x(f6);
                    if (h(lowestOneBit3)) {
                        mrVar.a++;
                    }
                } else {
                    int f7 = f(lowestOneBit3);
                    Object[] objArr6 = oj1Var2.d;
                    objArr6[i18] = this.d[f7];
                    objArr6[i18 + 1] = x(f7);
                }
                i17++;
                i12 ^= lowestOneBit3;
            }
            if (!e(oj1Var2)) {
                return oj1Var.e(oj1Var2) ? oj1Var : oj1Var2;
            }
        }
        return this;
    }

    public final oj1 n(int i, Object obj, int i2, jw0 jw0Var) {
        oj1 n;
        int p = 1 << xa0.p(i, i2);
        if (h(p)) {
            int f = f(p);
            if (Intrinsics.a(obj, this.d[f])) {
                return p(f, p, jw0Var);
            }
        } else if (i(p)) {
            int t = t(p);
            oj1 s = s(t);
            if (i2 == 30) {
                a f2 = b11.f(b11.g(0, s.d.length));
                int i3 = f2.d;
                int i4 = f2.e;
                int i5 = f2.g;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (!Intrinsics.a(obj, s.d[i3])) {
                        if (i3 != i4) {
                            i3 += i5;
                        }
                    }
                    n = s.k(i3, jw0Var);
                }
                n = s;
                break;
            }
            n = s.n(i, obj, i2 + 5, jw0Var);
            return q(s, n, t, p, jw0Var.d);
        }
        return this;
    }

    public final oj1 o(int i, Object obj, Object obj2, int i2, jw0 jw0Var) {
        jw0 jw0Var2;
        oj1 o;
        int p = 1 << xa0.p(i, i2);
        if (h(p)) {
            int f = f(p);
            return (Intrinsics.a(obj, this.d[f]) && Intrinsics.a(obj2, x(f))) ? p(f, p, jw0Var) : this;
        }
        if (!i(p)) {
            return this;
        }
        int t = t(p);
        oj1 s = s(t);
        if (i2 == 30) {
            a f2 = b11.f(b11.g(0, s.d.length));
            int i3 = f2.d;
            int i4 = f2.e;
            int i5 = f2.g;
            if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                while (true) {
                    if (!Intrinsics.a(obj, s.d[i3]) || !Intrinsics.a(obj2, s.x(i3))) {
                        if (i3 == i4) {
                            break;
                        }
                        i3 += i5;
                    } else {
                        o = s.k(i3, jw0Var);
                        break;
                    }
                }
            }
            o = s;
            jw0Var2 = jw0Var;
        } else {
            jw0Var2 = jw0Var;
            o = s.o(i, obj, obj2, i2 + 5, jw0Var2);
        }
        return q(s, o, t, p, jw0Var2.d);
    }

    public final oj1 p(int i, int i2, jw0 jw0Var) {
        jw0Var.i(jw0Var.i - 1);
        jw0Var.g = x(i);
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.c != jw0Var.d) {
            return new oj1(i2 ^ this.a, this.b, xa0.f(i, objArr), jw0Var.d);
        }
        this.d = xa0.f(i, objArr);
        this.a ^= i2;
        return this;
    }

    public final oj1 q(oj1 oj1Var, oj1 oj1Var2, int i, int i2, j41 j41Var) {
        j41 j41Var2 = this.c;
        if (oj1Var2 != null) {
            return (j41Var2 == j41Var || oj1Var != oj1Var2) ? r(i, oj1Var2, j41Var) : this;
        }
        Object[] objArr = this.d;
        if (objArr.length == 1) {
            return null;
        }
        if (j41Var2 != j41Var) {
            return new oj1(this.a, this.b ^ i2, xa0.g(i, objArr), j41Var);
        }
        this.d = xa0.g(i, objArr);
        this.b ^= i2;
        return this;
    }

    public final oj1 r(int i, oj1 oj1Var, j41 j41Var) {
        Object[] objArr = this.d;
        if (objArr.length == 1 && oj1Var.d.length == 2 && oj1Var.b == 0) {
            oj1Var.a = this.b;
            return oj1Var;
        }
        if (this.c == j41Var) {
            objArr[i] = oj1Var;
            return this;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        copyOf[i] = oj1Var;
        return new oj1(this.a, this.b, copyOf, j41Var);
    }

    public final oj1 s(int i) {
        Object obj = this.d[i];
        obj.getClass();
        return (oj1) obj;
    }

    public final int t(int i) {
        return (this.d.length - 1) - Integer.bitCount(this.b & (i - 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c5, code lost:
    
        if (r13 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d1, code lost:
    
        r13.e = w(r11, r4, (defpackage.oj1) r13.e);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00db, code lost:
    
        return r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ce, code lost:
    
        if (r13 == null) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final jj u(int i, int i2, Object obj, Object obj2) {
        jj u;
        int i3 = 1;
        int p = 1 << xa0.p(i, i2);
        int i4 = 0;
        if (h(p)) {
            int f = f(p);
            if (!Intrinsics.a(obj, this.d[f])) {
                return new jj(i3, new oj1(this.a ^ p, this.b | p, a(f, p, i, obj, obj2, i2, null), null));
            }
            if (x(f) != obj2) {
                Object[] objArr = this.d;
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                copyOf[f + 1] = obj2;
                return new jj(i4, new oj1(this.a, this.b, copyOf, null));
            }
        } else {
            if (!i(p)) {
                return new jj(i3, new oj1(this.a | p, this.b, xa0.e(this.d, f(p), obj, obj2), null));
            }
            int t = t(p);
            oj1 s = s(t);
            if (i2 == 30) {
                a f2 = b11.f(b11.g(0, s.d.length));
                int i5 = f2.d;
                int i6 = f2.e;
                int i7 = f2.g;
                if ((i7 > 0 && i5 <= i6) || (i7 < 0 && i6 <= i5)) {
                    while (!Intrinsics.a(obj, s.d[i5])) {
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
                        u = new jj(i4, new oj1(0, 0, copyOf2, null));
                    }
                }
                u = new jj(i3, new oj1(0, 0, xa0.e(s.d, 0, obj, obj2), null));
                break;
            }
            u = s.u(i, i2 + 5, obj, obj2);
        }
        return null;
    }

    public final oj1 v(int i, int i2, Object obj) {
        oj1 v;
        int p = 1 << xa0.p(i, i2);
        if (h(p)) {
            int f = f(p);
            if (!Intrinsics.a(obj, this.d[f])) {
                return this;
            }
            Object[] objArr = this.d;
            if (objArr.length != 2) {
                return new oj1(this.a ^ p, this.b, xa0.f(f, objArr), null);
            }
        } else {
            if (!i(p)) {
                return this;
            }
            int t = t(p);
            oj1 s = s(t);
            if (i2 == 30) {
                a f2 = b11.f(b11.g(0, s.d.length));
                int i3 = f2.d;
                int i4 = f2.e;
                int i5 = f2.g;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (!Intrinsics.a(obj, s.d[i3])) {
                        if (i3 != i4) {
                            i3 += i5;
                        }
                    }
                    Object[] objArr2 = s.d;
                    v = objArr2.length == 2 ? null : new oj1(0, 0, xa0.f(i3, objArr2), null);
                }
                v = s;
                break;
            }
            v = s.v(i, i2 + 5, obj);
            if (v != null) {
                return s != v ? w(t, p, v) : this;
            }
            Object[] objArr3 = this.d;
            if (objArr3.length != 1) {
                return new oj1(this.a, this.b ^ p, xa0.g(t, objArr3), null);
            }
        }
        return null;
    }

    public final oj1 w(int i, int i2, oj1 oj1Var) {
        Object[] objArr = oj1Var.d;
        if (objArr.length != 2 || oj1Var.b != 0) {
            Object[] objArr2 = this.d;
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length);
            copyOf[i] = oj1Var;
            return new oj1(this.a, this.b, copyOf, null);
        }
        if (this.d.length == 1) {
            oj1Var.a = this.b;
            return oj1Var;
        }
        int f = f(i2);
        Object[] objArr3 = this.d;
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        Object[] copyOf2 = Arrays.copyOf(objArr3, objArr3.length + 1);
        w9.c(copyOf2, copyOf2, i + 2, i + 1, objArr3.length);
        w9.c(copyOf2, copyOf2, f + 2, f, i);
        copyOf2[f] = obj;
        copyOf2[f + 1] = obj2;
        return new oj1(this.a ^ i2, this.b ^ i2, copyOf2, null);
    }

    public final Object x(int i) {
        return this.d[i + 1];
    }
}
