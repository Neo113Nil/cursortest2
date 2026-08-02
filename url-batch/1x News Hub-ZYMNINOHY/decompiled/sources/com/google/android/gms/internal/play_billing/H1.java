package com.google.android.gms.internal.play_billing;

import E1.AbstractC0033i;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class H1 {
    public static final H1 f = new H1(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    public int f2739a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f2740b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f2741c;

    /* renamed from: d, reason: collision with root package name */
    public int f2742d = -1;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2743e;

    public H1(int i3, int[] iArr, Object[] objArr, boolean z) {
        this.f2739a = i3;
        this.f2740b = iArr;
        this.f2741c = objArr;
        this.f2743e = z;
    }

    public static H1 b() {
        return new H1(0, new int[8], new Object[8], true);
    }

    public final int a() {
        int d02;
        int N2;
        int d03;
        int i3 = this.f2742d;
        if (i3 != -1) {
            return i3;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.f2739a; i5++) {
            int i6 = this.f2740b[i5];
            int i7 = i6 >>> 3;
            int i8 = i6 & 7;
            if (i8 != 0) {
                if (i8 == 1) {
                    ((Long) this.f2741c[i5]).getClass();
                    d03 = Z0.d0(i7 << 3) + 8;
                } else if (i8 == 2) {
                    int i9 = i7 << 3;
                    Y0 y02 = (Y0) this.f2741c[i5];
                    int d04 = Z0.d0(i9);
                    int d3 = y02.d();
                    i4 = AbstractC0033i.f(d3, d3, d04, i4);
                } else if (i8 == 3) {
                    int d05 = Z0.d0(i7 << 3);
                    d02 = d05 + d05;
                    N2 = ((H1) this.f2741c[i5]).a();
                } else {
                    if (i8 != 5) {
                        throw new IllegalStateException(new C0243m1());
                    }
                    ((Integer) this.f2741c[i5]).getClass();
                    d03 = Z0.d0(i7 << 3) + 4;
                }
                i4 = d03 + i4;
            } else {
                int i10 = i7 << 3;
                long longValue = ((Long) this.f2741c[i5]).longValue();
                d02 = Z0.d0(i10);
                N2 = Z0.N(longValue);
            }
            i4 = N2 + d02 + i4;
        }
        this.f2742d = i4;
        return i4;
    }

    public final void c(int i3, Object obj) {
        if (!this.f2743e) {
            throw new UnsupportedOperationException();
        }
        e(this.f2739a + 1);
        int[] iArr = this.f2740b;
        int i4 = this.f2739a;
        iArr[i4] = i3;
        this.f2741c[i4] = obj;
        this.f2739a = i4 + 1;
    }

    public final void d(C0257r1 c0257r1) {
        if (this.f2739a != 0) {
            for (int i3 = 0; i3 < this.f2739a; i3++) {
                int i4 = this.f2740b[i3];
                Object obj = this.f2741c[i3];
                int i5 = i4 & 7;
                int i6 = i4 >>> 3;
                if (i5 == 0) {
                    ((Z0) c0257r1.f2915a).a0(i6, ((Long) obj).longValue());
                } else if (i5 == 1) {
                    ((Z0) c0257r1.f2915a).S(i6, ((Long) obj).longValue());
                } else if (i5 == 2) {
                    ((Z0) c0257r1.f2915a).P(i6, (Y0) obj);
                } else if (i5 == 3) {
                    ((Z0) c0257r1.f2915a).X(i6, 3);
                    ((H1) obj).d(c0257r1);
                    ((Z0) c0257r1.f2915a).X(i6, 4);
                } else {
                    if (i5 != 5) {
                        throw new RuntimeException(new C0243m1());
                    }
                    ((Z0) c0257r1.f2915a).Q(i6, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final void e(int i3) {
        int[] iArr = this.f2740b;
        if (i3 > iArr.length) {
            int i4 = this.f2739a;
            int i5 = (i4 / 2) + i4;
            if (i5 >= i3) {
                i3 = i5;
            }
            if (i3 < 8) {
                i3 = 8;
            }
            this.f2740b = Arrays.copyOf(iArr, i3);
            this.f2741c = Arrays.copyOf(this.f2741c, i3);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof H1)) {
            return false;
        }
        H1 h12 = (H1) obj;
        int i3 = this.f2739a;
        if (i3 == h12.f2739a) {
            int[] iArr = this.f2740b;
            int[] iArr2 = h12.f2740b;
            int i4 = 0;
            while (true) {
                if (i4 >= i3) {
                    Object[] objArr = this.f2741c;
                    Object[] objArr2 = h12.f2741c;
                    int i5 = this.f2739a;
                    for (int i6 = 0; i6 < i5; i6++) {
                        if (objArr[i6].equals(objArr2[i6])) {
                        }
                    }
                    return true;
                }
                if (iArr[i4] != iArr2[i4]) {
                    break;
                }
                i4++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i3 = this.f2739a;
        int i4 = i3 + 527;
        int[] iArr = this.f2740b;
        int i5 = 17;
        int i6 = 17;
        for (int i7 = 0; i7 < i3; i7++) {
            i6 = (i6 * 31) + iArr[i7];
        }
        int i8 = ((i4 * 31) + i6) * 31;
        Object[] objArr = this.f2741c;
        int i9 = this.f2739a;
        for (int i10 = 0; i10 < i9; i10++) {
            i5 = (i5 * 31) + objArr[i10].hashCode();
        }
        return i8 + i5;
    }
}
