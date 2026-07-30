package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class jp3 {
    public static final jp3 f = new jp3(0, new int[0], new Object[0], false);
    public int a;
    public int[] b;
    public Object[] c;
    public int d = -1;
    public boolean e;

    public jp3(int i, int[] iArr, Object[] objArr, boolean z) {
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }

    public static jp3 a() {
        return new jp3(0, new int[8], new Object[8], true);
    }

    public final void b(ot2 ot2Var) {
        if (this.a != 0) {
            for (int i = 0; i < this.a; i++) {
                int i2 = this.b[i];
                Object obj = this.c[i];
                int i3 = i2 & 7;
                int i4 = i2 >>> 3;
                if (i3 == 0) {
                    ((lm3) ot2Var.n).g(((Long) obj).longValue(), i4);
                } else if (i3 == 1) {
                    ((lm3) ot2Var.n).h(((Long) obj).longValue(), i4);
                } else if (i3 == 2) {
                    lm3 lm3Var = (lm3) ot2Var.n;
                    lm3Var.l((i4 << 3) | 2);
                    lm3Var.i((im3) obj);
                } else if (i3 == 3) {
                    ((lm3) ot2Var.n).c(i4, 3);
                    ((jp3) obj).b(ot2Var);
                    ((lm3) ot2Var.n).c(i4, 4);
                } else {
                    if (i3 != 5) {
                        throw new RuntimeException(new tn3());
                    }
                    ((lm3) ot2Var.n).f(i4, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final int c() {
        int r;
        int a;
        int r2;
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.a; i3++) {
            int i4 = this.b[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 != 0) {
                if (i6 == 1) {
                    ((Long) this.c[i3]).getClass();
                    r2 = lm3.r(i5 << 3) + 8;
                } else if (i6 == 2) {
                    int i7 = i5 << 3;
                    im3 im3Var = (im3) this.c[i3];
                    int r3 = lm3.r(i7);
                    int c = im3Var.c();
                    i2 = in1.g(c, c, r3, i2);
                } else if (i6 == 3) {
                    int r4 = lm3.r(i5 << 3);
                    r = r4 + r4;
                    a = ((jp3) this.c[i3]).c();
                } else {
                    if (i6 != 5) {
                        throw new IllegalStateException(new tn3());
                    }
                    ((Integer) this.c[i3]).getClass();
                    r2 = lm3.r(i5 << 3) + 4;
                }
                i2 = r2 + i2;
            } else {
                int i8 = i5 << 3;
                long longValue = ((Long) this.c[i3]).longValue();
                r = lm3.r(i8);
                a = lm3.a(longValue);
            }
            i2 = a + r + i2;
        }
        this.d = i2;
        return i2;
    }

    public final void d(int i, Object obj) {
        if (!this.e) {
            throw new UnsupportedOperationException();
        }
        e(this.a + 1);
        int[] iArr = this.b;
        int i2 = this.a;
        iArr[i2] = i;
        this.c[i2] = obj;
        this.a = i2 + 1;
    }

    public final void e(int i) {
        int[] iArr = this.b;
        if (i > iArr.length) {
            int i2 = this.a;
            int i3 = (i2 / 2) + i2;
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.b = Arrays.copyOf(iArr, i);
            this.c = Arrays.copyOf(this.c, i);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof jp3)) {
            jp3 jp3Var = (jp3) obj;
            int i = this.a;
            if (i == jp3Var.a) {
                int[] iArr = this.b;
                int[] iArr2 = jp3Var.b;
                int i2 = 0;
                while (true) {
                    if (i2 >= i) {
                        Object[] objArr = this.c;
                        Object[] objArr2 = jp3Var.c;
                        int i3 = this.a;
                        for (int i4 = 0; i4 < i3; i4++) {
                            if (objArr[i4].equals(objArr2[i4])) {
                            }
                        }
                        return true;
                    }
                    if (iArr[i2] != iArr2[i2]) {
                        break;
                    }
                    i2++;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        int i2 = i + 527;
        int[] iArr = this.b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = ((i2 * 31) + i4) * 31;
        Object[] objArr = this.c;
        int i7 = this.a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }
}
