package androidx.datastore.preferences.protobuf;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: f, reason: collision with root package name */
    public static final d0 f4626f = new d0(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    public int f4627a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f4628b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f4629c;

    /* renamed from: d, reason: collision with root package name */
    public int f4630d = -1;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4631e;

    public d0(int i4, int[] iArr, Object[] objArr, boolean z) {
        this.f4627a = i4;
        this.f4628b = iArr;
        this.f4629c = objArr;
        this.f4631e = z;
    }

    public final void a(int i4) {
        int[] iArr = this.f4628b;
        if (i4 > iArr.length) {
            int i5 = this.f4627a;
            int i6 = (i5 / 2) + i5;
            if (i6 >= i4) {
                i4 = i6;
            }
            if (i4 < 8) {
                i4 = 8;
            }
            this.f4628b = Arrays.copyOf(iArr, i4);
            this.f4629c = Arrays.copyOf(this.f4629c, i4);
        }
    }

    public final int b() {
        int a02;
        int c02;
        int a03;
        int i4 = this.f4630d;
        if (i4 != -1) {
            return i4;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.f4627a; i6++) {
            int i7 = this.f4628b[i6];
            int i8 = i7 >>> 3;
            int i9 = i7 & 7;
            if (i9 != 0) {
                if (i9 == 1) {
                    ((Long) this.f4629c[i6]).getClass();
                    a03 = C0180m.a0(i8) + 8;
                } else if (i9 == 2) {
                    a03 = C0180m.Y(i8, (C0174g) this.f4629c[i6]);
                } else if (i9 == 3) {
                    a02 = C0180m.a0(i8) * 2;
                    c02 = ((d0) this.f4629c[i6]).b();
                } else {
                    if (i9 != 5) {
                        throw new IllegalStateException(A.b());
                    }
                    ((Integer) this.f4629c[i6]).getClass();
                    a03 = C0180m.a0(i8) + 4;
                }
                i5 = a03 + i5;
            } else {
                long longValue = ((Long) this.f4629c[i6]).longValue();
                a02 = C0180m.a0(i8);
                c02 = C0180m.c0(longValue);
            }
            i5 = c02 + a02 + i5;
        }
        this.f4630d = i5;
        return i5;
    }

    public final void c(int i4, Object obj) {
        if (!this.f4631e) {
            throw new UnsupportedOperationException();
        }
        a(this.f4627a + 1);
        int[] iArr = this.f4628b;
        int i5 = this.f4627a;
        iArr[i5] = i4;
        this.f4629c[i5] = obj;
        this.f4627a = i5 + 1;
    }

    public final void d(F f4) {
        if (this.f4627a == 0) {
            return;
        }
        f4.getClass();
        C0180m c0180m = (C0180m) f4.f4562a;
        for (int i4 = 0; i4 < this.f4627a; i4++) {
            int i5 = this.f4628b[i4];
            Object obj = this.f4629c[i4];
            int i6 = i5 >>> 3;
            int i7 = i5 & 7;
            if (i7 == 0) {
                c0180m.w0(i6, ((Long) obj).longValue());
            } else if (i7 == 1) {
                c0180m.m0(i6, ((Long) obj).longValue());
            } else if (i7 == 2) {
                c0180m.i0(i6, (C0174g) obj);
            } else if (i7 == 3) {
                c0180m.t0(i6, 3);
                ((d0) obj).d(f4);
                c0180m.t0(i6, 4);
            } else {
                if (i7 != 5) {
                    throw new RuntimeException(A.b());
                }
                c0180m.k0(i6, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        int i4 = this.f4627a;
        if (i4 == d0Var.f4627a) {
            int[] iArr = this.f4628b;
            int[] iArr2 = d0Var.f4628b;
            int i5 = 0;
            while (true) {
                if (i5 >= i4) {
                    Object[] objArr = this.f4629c;
                    Object[] objArr2 = d0Var.f4629c;
                    int i6 = this.f4627a;
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
        int i4 = this.f4627a;
        int i5 = (527 + i4) * 31;
        int[] iArr = this.f4628b;
        int i6 = 17;
        int i7 = 17;
        for (int i8 = 0; i8 < i4; i8++) {
            i7 = (i7 * 31) + iArr[i8];
        }
        int i9 = (i5 + i7) * 31;
        Object[] objArr = this.f4629c;
        int i10 = this.f4627a;
        for (int i11 = 0; i11 < i10; i11++) {
            i6 = (i6 * 31) + objArr[i11].hashCode();
        }
        return i9 + i6;
    }
}
