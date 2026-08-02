package com.google.android.gms.internal.play_billing;

import E.AbstractC0005f;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class W0 {

    /* renamed from: f, reason: collision with root package name */
    public static final W0 f5922f = new W0(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    public int f5923a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f5924b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f5925c;

    /* renamed from: d, reason: collision with root package name */
    public int f5926d = -1;

    /* renamed from: e, reason: collision with root package name */
    public boolean f5927e;

    public W0(int i4, int[] iArr, Object[] objArr, boolean z) {
        this.f5923a = i4;
        this.f5924b = iArr;
        this.f5925c = objArr;
        this.f5927e = z;
    }

    public static W0 b() {
        return new W0(0, new int[8], new Object[8], true);
    }

    public final int a() {
        int W4;
        int X4;
        int W5;
        int i4 = this.f5926d;
        if (i4 != -1) {
            return i4;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.f5923a; i6++) {
            int i7 = this.f5924b[i6];
            int i8 = i7 >>> 3;
            int i9 = i7 & 7;
            if (i9 != 0) {
                if (i9 == 1) {
                    ((Long) this.f5925c[i6]).getClass();
                    W5 = C0338o0.W(i8 << 3) + 8;
                } else if (i9 == 2) {
                    int i10 = i8 << 3;
                    C0336n0 c0336n0 = (C0336n0) this.f5925c[i6];
                    int W6 = C0338o0.W(i10);
                    int d4 = c0336n0.d();
                    i5 = AbstractC0005f.e(d4, d4, W6, i5);
                } else if (i9 == 3) {
                    int W7 = C0338o0.W(i8 << 3);
                    W4 = W7 + W7;
                    X4 = ((W0) this.f5925c[i6]).a();
                } else {
                    if (i9 != 5) {
                        throw new IllegalStateException(new C0());
                    }
                    ((Integer) this.f5925c[i6]).getClass();
                    W5 = C0338o0.W(i8 << 3) + 4;
                }
                i5 = W5 + i5;
            } else {
                int i11 = i8 << 3;
                long longValue = ((Long) this.f5925c[i6]).longValue();
                W4 = C0338o0.W(i11);
                X4 = C0338o0.X(longValue);
            }
            i5 = X4 + W4 + i5;
        }
        this.f5926d = i5;
        return i5;
    }

    public final void c(int i4, Object obj) {
        if (!this.f5927e) {
            throw new UnsupportedOperationException();
        }
        e(this.f5923a + 1);
        int[] iArr = this.f5924b;
        int i5 = this.f5923a;
        iArr[i5] = i4;
        this.f5925c[i5] = obj;
        this.f5923a = i5 + 1;
    }

    public final void d(H0 h02) {
        if (this.f5923a != 0) {
            for (int i4 = 0; i4 < this.f5923a; i4++) {
                int i5 = this.f5924b[i4];
                Object obj = this.f5925c[i4];
                int i6 = i5 & 7;
                int i7 = i5 >>> 3;
                if (i6 == 0) {
                    ((C0338o0) h02.f5850a).k0(i7, ((Long) obj).longValue());
                } else if (i6 == 1) {
                    ((C0338o0) h02.f5850a).c0(i7, ((Long) obj).longValue());
                } else if (i6 == 2) {
                    ((C0338o0) h02.f5850a).Z(i7, (C0336n0) obj);
                } else if (i6 == 3) {
                    ((C0338o0) h02.f5850a).h0(i7, 3);
                    ((W0) obj).d(h02);
                    ((C0338o0) h02.f5850a).h0(i7, 4);
                } else {
                    if (i6 != 5) {
                        throw new RuntimeException(new C0());
                    }
                    ((C0338o0) h02.f5850a).a0(i7, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final void e(int i4) {
        int[] iArr = this.f5924b;
        if (i4 > iArr.length) {
            int i5 = this.f5923a;
            int i6 = (i5 / 2) + i5;
            if (i6 >= i4) {
                i4 = i6;
            }
            if (i4 < 8) {
                i4 = 8;
            }
            this.f5924b = Arrays.copyOf(iArr, i4);
            this.f5925c = Arrays.copyOf(this.f5925c, i4);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof W0)) {
            return false;
        }
        W0 w02 = (W0) obj;
        int i4 = this.f5923a;
        if (i4 == w02.f5923a) {
            int[] iArr = this.f5924b;
            int[] iArr2 = w02.f5924b;
            int i5 = 0;
            while (true) {
                if (i5 >= i4) {
                    Object[] objArr = this.f5925c;
                    Object[] objArr2 = w02.f5925c;
                    int i6 = this.f5923a;
                    for (int i7 = 0; i7 < i6; i7++) {
                        if (objArr[i7].equals(objArr2[i7])) {
                        }
                    }
                    return true;
                }
                if (iArr[i5] != iArr2[i5]) {
                    break;
                }
                i5++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i4 = this.f5923a;
        int i5 = i4 + 527;
        int[] iArr = this.f5924b;
        int i6 = 17;
        int i7 = 17;
        for (int i8 = 0; i8 < i4; i8++) {
            i7 = (i7 * 31) + iArr[i8];
        }
        int i9 = ((i5 * 31) + i7) * 31;
        Object[] objArr = this.f5925c;
        int i10 = this.f5923a;
        for (int i11 = 0; i11 < i10; i11++) {
            i6 = (i6 * 31) + objArr[i11].hashCode();
        }
        return i9 + i6;
    }
}
