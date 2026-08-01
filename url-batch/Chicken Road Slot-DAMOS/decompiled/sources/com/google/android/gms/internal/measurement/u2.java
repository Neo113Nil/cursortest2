package com.google.android.gms.internal.measurement;

import java.util.Arrays;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class u2 {

    /* renamed from: f, reason: collision with root package name */
    public static final u2 f2837f = new u2(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    public int f2838a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f2839b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f2840c;

    /* renamed from: d, reason: collision with root package name */
    public int f2841d = -1;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2842e;

    public u2(int i3, int[] iArr, Object[] objArr, boolean z10) {
        this.f2838a = i3;
        this.f2839b = iArr;
        this.f2840c = objArr;
        this.f2842e = z10;
    }

    public static u2 a() {
        return new u2(0, new int[8], new Object[8], true);
    }

    public final void b(v5 v5Var) {
        b1 b1Var = (b1) v5Var.f2870e;
        if (this.f2838a != 0) {
            for (int i3 = 0; i3 < this.f2838a; i3++) {
                int i10 = this.f2839b[i3];
                Object obj = this.f2840c[i3];
                int i11 = i10 & 7;
                int i12 = i10 >>> 3;
                if (i11 == 0) {
                    b1Var.h(i12, ((Long) obj).longValue());
                } else if (i11 == 1) {
                    b1Var.i(i12, ((Long) obj).longValue());
                } else if (i11 == 2) {
                    b1Var.l(i12, (v0) obj);
                } else if (i11 == 3) {
                    b1Var.d(i12, 3);
                    ((u2) obj).b(v5Var);
                    b1Var.d(i12, 4);
                } else {
                    if (i11 != 5) {
                        throw new RuntimeException(new u1());
                    }
                    b1Var.g(i12, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final int c() {
        int a9;
        int b10;
        int a10;
        int i3 = this.f2841d;
        if (i3 != -1) {
            return i3;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.f2838a; i11++) {
            int i12 = this.f2839b[i11];
            int i13 = i12 >>> 3;
            int i14 = i12 & 7;
            if (i14 != 0) {
                if (i14 == 1) {
                    ((Long) this.f2840c[i11]).getClass();
                    a10 = b1.a(i13 << 3) + 8;
                } else if (i14 == 2) {
                    int i15 = i13 << 3;
                    v0 v0Var = (v0) this.f2840c[i11];
                    int a11 = b1.a(i15);
                    int c10 = v0Var.c();
                    i10 = v4.a.e(c10, c10, a11, i10);
                } else if (i14 == 3) {
                    int a12 = b1.a(i13 << 3);
                    a9 = a12 + a12;
                    b10 = ((u2) this.f2840c[i11]).c();
                } else {
                    if (i14 != 5) {
                        throw new IllegalStateException(new u1());
                    }
                    ((Integer) this.f2840c[i11]).getClass();
                    a10 = b1.a(i13 << 3) + 4;
                }
                i10 = a10 + i10;
            } else {
                int i16 = i13 << 3;
                long longValue = ((Long) this.f2840c[i11]).longValue();
                a9 = b1.a(i16);
                b10 = b1.b(longValue);
            }
            i10 = b10 + a9 + i10;
        }
        this.f2841d = i10;
        return i10;
    }

    public final void d(int i3, Object obj) {
        if (!this.f2842e) {
            a2.r.a();
            return;
        }
        e(this.f2838a + 1);
        int[] iArr = this.f2839b;
        int i10 = this.f2838a;
        iArr[i10] = i3;
        this.f2840c[i10] = obj;
        this.f2838a = i10 + 1;
    }

    public final void e(int i3) {
        int[] iArr = this.f2839b;
        if (i3 > iArr.length) {
            int i10 = this.f2838a;
            int i11 = (i10 / 2) + i10;
            if (i11 >= i3) {
                i3 = i11;
            }
            if (i3 < 8) {
                i3 = 8;
            }
            this.f2839b = Arrays.copyOf(iArr, i3);
            this.f2840c = Arrays.copyOf(this.f2840c, i3);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof u2)) {
            u2 u2Var = (u2) obj;
            int i3 = this.f2838a;
            if (i3 == u2Var.f2838a) {
                int[] iArr = this.f2839b;
                int[] iArr2 = u2Var.f2839b;
                int i10 = 0;
                while (true) {
                    if (i10 >= i3) {
                        Object[] objArr = this.f2840c;
                        Object[] objArr2 = u2Var.f2840c;
                        int i11 = this.f2838a;
                        for (int i12 = 0; i12 < i11; i12++) {
                            if (objArr[i12].equals(objArr2[i12])) {
                            }
                        }
                        return true;
                    }
                    if (iArr[i10] != iArr2[i10]) {
                        break;
                    }
                    i10++;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i3 = this.f2838a;
        int i10 = i3 + 527;
        int[] iArr = this.f2839b;
        int i11 = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i3; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = ((i10 * 31) + i12) * 31;
        Object[] objArr = this.f2840c;
        int i15 = this.f2838a;
        for (int i16 = 0; i16 < i15; i16++) {
            i11 = (i11 * 31) + objArr[i16].hashCode();
        }
        return i14 + i11;
    }
}
