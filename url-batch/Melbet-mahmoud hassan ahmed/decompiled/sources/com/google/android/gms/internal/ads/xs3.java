package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class xs3 {

    /* renamed from: f, reason: collision with root package name */
    private static final xs3 f14341f = new xs3(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    private int f14342a;

    /* renamed from: b, reason: collision with root package name */
    private int[] f14343b;

    /* renamed from: c, reason: collision with root package name */
    private Object[] f14344c;

    /* renamed from: d, reason: collision with root package name */
    private int f14345d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f14346e;

    private xs3() {
        this(0, new int[8], new Object[8], true);
    }

    private xs3(int i7, int[] iArr, Object[] objArr, boolean z6) {
        this.f14345d = -1;
        this.f14342a = i7;
        this.f14343b = iArr;
        this.f14344c = objArr;
        this.f14346e = z6;
    }

    public static xs3 c() {
        return f14341f;
    }

    static xs3 d(xs3 xs3Var, xs3 xs3Var2) {
        int i7 = xs3Var.f14342a + xs3Var2.f14342a;
        int[] copyOf = Arrays.copyOf(xs3Var.f14343b, i7);
        System.arraycopy(xs3Var2.f14343b, 0, copyOf, xs3Var.f14342a, xs3Var2.f14342a);
        Object[] copyOf2 = Arrays.copyOf(xs3Var.f14344c, i7);
        System.arraycopy(xs3Var2.f14344c, 0, copyOf2, xs3Var.f14342a, xs3Var2.f14342a);
        return new xs3(i7, copyOf, copyOf2, true);
    }

    static xs3 e() {
        return new xs3(0, new int[8], new Object[8], true);
    }

    public final int a() {
        int a7;
        int b7;
        int i7;
        int i8 = this.f14345d;
        if (i8 != -1) {
            return i8;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < this.f14342a; i10++) {
            int i11 = this.f14343b[i10];
            int i12 = i11 >>> 3;
            int i13 = i11 & 7;
            if (i13 != 0) {
                if (i13 == 1) {
                    ((Long) this.f14344c[i10]).longValue();
                    i7 = hp3.a(i12 << 3) + 8;
                } else if (i13 == 2) {
                    uo3 uo3Var = (uo3) this.f14344c[i10];
                    int a8 = hp3.a(i12 << 3);
                    int q7 = uo3Var.q();
                    i9 += a8 + hp3.a(q7) + q7;
                } else if (i13 == 3) {
                    int D = hp3.D(i12);
                    a7 = D + D;
                    b7 = ((xs3) this.f14344c[i10]).a();
                } else {
                    if (i13 != 5) {
                        throw new IllegalStateException(mq3.a());
                    }
                    ((Integer) this.f14344c[i10]).intValue();
                    i7 = hp3.a(i12 << 3) + 4;
                }
                i9 += i7;
            } else {
                long longValue = ((Long) this.f14344c[i10]).longValue();
                a7 = hp3.a(i12 << 3);
                b7 = hp3.b(longValue);
            }
            i7 = a7 + b7;
            i9 += i7;
        }
        this.f14345d = i9;
        return i9;
    }

    public final int b() {
        int i7 = this.f14345d;
        if (i7 != -1) {
            return i7;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < this.f14342a; i9++) {
            int i10 = this.f14343b[i9];
            uo3 uo3Var = (uo3) this.f14344c[i9];
            int a7 = hp3.a(8);
            int q7 = uo3Var.q();
            i8 += a7 + a7 + hp3.a(16) + hp3.a(i10 >>> 3) + hp3.a(24) + hp3.a(q7) + q7;
        }
        this.f14345d = i8;
        return i8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof xs3)) {
            return false;
        }
        xs3 xs3Var = (xs3) obj;
        int i7 = this.f14342a;
        if (i7 == xs3Var.f14342a) {
            int[] iArr = this.f14343b;
            int[] iArr2 = xs3Var.f14343b;
            int i8 = 0;
            while (true) {
                if (i8 >= i7) {
                    Object[] objArr = this.f14344c;
                    Object[] objArr2 = xs3Var.f14344c;
                    int i9 = this.f14342a;
                    for (int i10 = 0; i10 < i9; i10++) {
                        if (objArr[i10].equals(objArr2[i10])) {
                        }
                    }
                    return true;
                }
                if (iArr[i8] != iArr2[i8]) {
                    break;
                }
                i8++;
            }
        }
        return false;
    }

    public final void f() {
        this.f14346e = false;
    }

    final void g(StringBuilder sb, int i7) {
        for (int i8 = 0; i8 < this.f14342a; i8++) {
            mr3.b(sb, i7, String.valueOf(this.f14343b[i8] >>> 3), this.f14344c[i8]);
        }
    }

    final void h(int i7, Object obj) {
        if (!this.f14346e) {
            throw new UnsupportedOperationException();
        }
        int i8 = this.f14342a;
        int[] iArr = this.f14343b;
        if (i8 == iArr.length) {
            int i9 = i8 + (i8 < 4 ? 8 : i8 >> 1);
            this.f14343b = Arrays.copyOf(iArr, i9);
            this.f14344c = Arrays.copyOf(this.f14344c, i9);
        }
        int[] iArr2 = this.f14343b;
        int i10 = this.f14342a;
        iArr2[i10] = i7;
        this.f14344c[i10] = obj;
        this.f14342a = i10 + 1;
    }

    public final int hashCode() {
        int i7 = this.f14342a;
        int i8 = (i7 + 527) * 31;
        int[] iArr = this.f14343b;
        int i9 = 17;
        int i10 = 17;
        for (int i11 = 0; i11 < i7; i11++) {
            i10 = (i10 * 31) + iArr[i11];
        }
        int i12 = (i8 + i10) * 31;
        Object[] objArr = this.f14344c;
        int i13 = this.f14342a;
        for (int i14 = 0; i14 < i13; i14++) {
            i9 = (i9 * 31) + objArr[i14].hashCode();
        }
        return i12 + i9;
    }

    public final void i(ip3 ip3Var) {
        if (this.f14342a != 0) {
            for (int i7 = 0; i7 < this.f14342a; i7++) {
                int i8 = this.f14343b[i7];
                Object obj = this.f14344c[i7];
                int i9 = i8 >>> 3;
                int i10 = i8 & 7;
                if (i10 == 0) {
                    ip3Var.E(i9, ((Long) obj).longValue());
                } else if (i10 == 1) {
                    ip3Var.x(i9, ((Long) obj).longValue());
                } else if (i10 == 2) {
                    ip3Var.o(i9, (uo3) obj);
                } else if (i10 == 3) {
                    ip3Var.e(i9);
                    ((xs3) obj).i(ip3Var);
                    ip3Var.s(i9);
                } else {
                    if (i10 != 5) {
                        throw new RuntimeException(mq3.a());
                    }
                    ip3Var.v(i9, ((Integer) obj).intValue());
                }
            }
        }
    }
}
