package com.google.android.gms.internal.play_billing;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class H1 {

    /* renamed from: f, reason: collision with root package name */
    public static final H1 f5055f = new H1(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    public int f5056a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f5057b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f5058c;

    /* renamed from: d, reason: collision with root package name */
    public int f5059d = -1;

    /* renamed from: e, reason: collision with root package name */
    public boolean f5060e;

    public H1(int i2, int[] iArr, Object[] objArr, boolean z) {
        this.f5056a = i2;
        this.f5057b = iArr;
        this.f5058c = objArr;
        this.f5060e = z;
    }

    public static H1 b() {
        return new H1(0, new int[8], new Object[8], true);
    }

    public final int a() {
        int n02;
        int V5;
        int n03;
        int i2 = this.f5059d;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i6 = 0; i6 < this.f5056a; i6++) {
            int i7 = this.f5057b[i6];
            int i8 = i7 >>> 3;
            int i9 = i7 & 7;
            if (i9 != 0) {
                if (i9 == 1) {
                    ((Long) this.f5058c[i6]).getClass();
                    n03 = Z0.n0(i8 << 3) + 8;
                } else if (i9 == 2) {
                    int i10 = i8 << 3;
                    Y0 y02 = (Y0) this.f5058c[i6];
                    int n04 = Z0.n0(i10);
                    int d6 = y02.d();
                    i3 = Z0.n0(d6) + d6 + n04 + i3;
                } else if (i9 == 3) {
                    int n05 = Z0.n0(i8 << 3);
                    n02 = n05 + n05;
                    V5 = ((H1) this.f5058c[i6]).a();
                } else {
                    if (i9 != 5) {
                        throw new IllegalStateException(new C0352m1());
                    }
                    ((Integer) this.f5058c[i6]).getClass();
                    n03 = Z0.n0(i8 << 3) + 4;
                }
                i3 = n03 + i3;
            } else {
                int i11 = i8 << 3;
                long longValue = ((Long) this.f5058c[i6]).longValue();
                n02 = Z0.n0(i11);
                V5 = Z0.V(longValue);
            }
            i3 = V5 + n02 + i3;
        }
        this.f5059d = i3;
        return i3;
    }

    public final void c(int i2, Object obj) {
        if (!this.f5060e) {
            throw new UnsupportedOperationException();
        }
        e(this.f5056a + 1);
        int[] iArr = this.f5057b;
        int i3 = this.f5056a;
        iArr[i3] = i2;
        this.f5058c[i3] = obj;
        this.f5056a = i3 + 1;
    }

    public final void d(C0366r1 c0366r1) {
        if (this.f5056a != 0) {
            for (int i2 = 0; i2 < this.f5056a; i2++) {
                int i3 = this.f5057b[i2];
                Object obj = this.f5058c[i2];
                int i6 = i3 & 7;
                int i7 = i3 >>> 3;
                if (i6 == 0) {
                    c0366r1.r(i7, ((Long) obj).longValue());
                } else if (i6 == 1) {
                    c0366r1.n(i7, ((Long) obj).longValue());
                } else if (i6 == 2) {
                    c0366r1.i(i7, (Y0) obj);
                } else if (i6 == 3) {
                    ((Z0) c0366r1.f5242a).f0(i7, 3);
                    ((H1) obj).d(c0366r1);
                    ((Z0) c0366r1.f5242a).f0(i7, 4);
                } else {
                    if (i6 != 5) {
                        throw new RuntimeException(new C0352m1());
                    }
                    c0366r1.m(i7, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final void e(int i2) {
        int[] iArr = this.f5057b;
        if (i2 > iArr.length) {
            int i3 = this.f5056a;
            int i6 = (i3 / 2) + i3;
            if (i6 >= i2) {
                i2 = i6;
            }
            if (i2 < 8) {
                i2 = 8;
            }
            this.f5057b = Arrays.copyOf(iArr, i2);
            this.f5058c = Arrays.copyOf(this.f5058c, i2);
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
        int i2 = this.f5056a;
        if (i2 == h12.f5056a) {
            int[] iArr = this.f5057b;
            int[] iArr2 = h12.f5057b;
            int i3 = 0;
            while (true) {
                if (i3 >= i2) {
                    Object[] objArr = this.f5058c;
                    Object[] objArr2 = h12.f5058c;
                    int i6 = this.f5056a;
                    for (int i7 = 0; i7 < i6; i7++) {
                        if (objArr[i7].equals(objArr2[i7])) {
                        }
                    }
                    return true;
                }
                if (iArr[i3] != iArr2[i3]) {
                    break;
                }
                i3++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = this.f5056a;
        int i3 = i2 + 527;
        int[] iArr = this.f5057b;
        int i6 = 17;
        int i7 = 17;
        for (int i8 = 0; i8 < i2; i8++) {
            i7 = (i7 * 31) + iArr[i8];
        }
        int i9 = ((i3 * 31) + i7) * 31;
        Object[] objArr = this.f5058c;
        int i10 = this.f5056a;
        for (int i11 = 0; i11 < i10; i11++) {
            i6 = (i6 * 31) + objArr[i11].hashCode();
        }
        return i9 + i6;
    }
}
