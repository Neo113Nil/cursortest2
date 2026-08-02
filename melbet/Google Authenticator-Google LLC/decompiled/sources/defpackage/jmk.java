package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jmk {
    public static final jmk a = new jmk(0, new int[0], new Object[0], false);
    public int b;
    public int[] c;
    public Object[] d;
    public int e;
    private boolean f;

    public jmk(int i, int[] iArr, Object[] objArr, boolean z) {
        this.e = -1;
        this.b = i;
        this.c = iArr;
        this.d = objArr;
        this.f = z;
    }

    public final int a() {
        int R;
        int i = this.e;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.b; i3++) {
            int i4 = this.c[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 == 0) {
                R = jjz.R(i5, ((Long) this.d[i3]).longValue());
            } else if (i6 == 1) {
                ((Long) this.d[i3]).longValue();
                R = ((352 - (Integer.numberOfLeadingZeros(i5 << 3) * 9)) >>> 6) + 8;
            } else if (i6 == 2) {
                R = jjz.E(i5, (jjq) this.d[i3]);
            } else if (i6 == 3) {
                int numberOfLeadingZeros = (352 - (Integer.numberOfLeadingZeros(i5 << 3) * 9)) >>> 6;
                R = numberOfLeadingZeros + numberOfLeadingZeros + ((jmk) this.d[i3]).a();
            } else {
                if (i6 != 5) {
                    throw new IllegalStateException(new jlc());
                }
                ((Integer) this.d[i3]).intValue();
                R = ((352 - (Integer.numberOfLeadingZeros(i5 << 3) * 9)) >>> 6) + 4;
            }
            i2 += R;
        }
        this.e = i2;
        return i2;
    }

    final void b() {
        if (!this.f) {
            throw new UnsupportedOperationException();
        }
    }

    public final void c(int i) {
        int[] iArr = this.c;
        if (i > iArr.length) {
            int i2 = this.b;
            int i3 = i2 + (i2 / 2);
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.c = Arrays.copyOf(iArr, i);
            this.d = Arrays.copyOf(this.d, i);
        }
    }

    public final void d() {
        if (this.f) {
            this.f = false;
        }
    }

    final void e(int i, Object obj) {
        b();
        c(this.b + 1);
        int[] iArr = this.c;
        int i2 = this.b;
        iArr[i2] = i;
        this.d[i2] = obj;
        this.b = i2 + 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof jmk)) {
            return false;
        }
        jmk jmkVar = (jmk) obj;
        int i = this.b;
        if (i == jmkVar.b) {
            int[] iArr = this.c;
            int[] iArr2 = jmkVar.c;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.d;
                    Object[] objArr2 = jmkVar.d;
                    int i3 = this.b;
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
        return false;
    }

    public final void f(ikk ikkVar) {
        if (this.b != 0) {
            for (int i = 0; i < this.b; i++) {
                int i2 = this.c[i];
                Object obj = this.d[i];
                int i3 = i2 >>> 3;
                int i4 = i2 & 7;
                if (i4 == 0) {
                    ikkVar.l(i3, ((Long) obj).longValue());
                } else if (i4 == 1) {
                    ikkVar.h(i3, ((Long) obj).longValue());
                } else if (i4 == 2) {
                    ikkVar.d(i3, (jjq) obj);
                } else if (i4 == 3) {
                    jjz jjzVar = (jjz) ikkVar.a;
                    jjzVar.t(i3, 3);
                    ((jmk) obj).f(ikkVar);
                    jjzVar.t(i3, 4);
                } else {
                    if (i4 != 5) {
                        throw new RuntimeException(new jlc());
                    }
                    ikkVar.g(i3, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final int hashCode() {
        int i = this.b;
        int i2 = i + 527;
        int[] iArr = this.c;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = ((i2 * 31) + i4) * 31;
        Object[] objArr = this.d;
        int i7 = this.b;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    public jmk() {
        this(0, new int[8], new Object[8], true);
    }
}
