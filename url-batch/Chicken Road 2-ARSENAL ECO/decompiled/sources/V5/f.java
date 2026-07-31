package V5;

import D3.B;

/* loaded from: classes.dex */
public final class f extends B {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2732c;

    public f(A.j jVar, boolean z5) {
        super(jVar);
        this.f2732c = z5;
    }

    @Override // D3.B
    public final void c(byte b7) {
        if (this.f2732c) {
            i(String.valueOf(b7 & 255));
        } else {
            g(String.valueOf(b7 & 255));
        }
    }

    @Override // D3.B
    public final void e(int i7) {
        if (this.f2732c) {
            i(Long.toString(i7 & 4294967295L, 10));
        } else {
            g(Long.toString(i7 & 4294967295L, 10));
        }
    }

    @Override // D3.B
    public final void f(long j4) {
        int i7 = 63;
        String str = "0";
        if (this.f2732c) {
            if (j4 != 0) {
                if (j4 > 0) {
                    str = Long.toString(j4, 10);
                } else {
                    char[] cArr = new char[64];
                    long j7 = (j4 >>> 1) / 5;
                    long j8 = 10;
                    cArr[63] = Character.forDigit((int) (j4 - (j7 * j8)), 10);
                    while (j7 > 0) {
                        i7--;
                        cArr[i7] = Character.forDigit((int) (j7 % j8), 10);
                        j7 /= j8;
                    }
                    str = new String(cArr, i7, 64 - i7);
                }
            }
            i(str);
            return;
        }
        if (j4 != 0) {
            if (j4 > 0) {
                str = Long.toString(j4, 10);
            } else {
                char[] cArr2 = new char[64];
                long j9 = (j4 >>> 1) / 5;
                long j10 = 10;
                cArr2[63] = Character.forDigit((int) (j4 - (j9 * j10)), 10);
                while (j9 > 0) {
                    i7--;
                    cArr2[i7] = Character.forDigit((int) (j9 % j10), 10);
                    j9 /= j10;
                }
                str = new String(cArr2, i7, 64 - i7);
            }
        }
        g(str);
    }

    @Override // D3.B
    public final void h(short s6) {
        if (this.f2732c) {
            i(String.valueOf(s6 & 65535));
        } else {
            g(String.valueOf(s6 & 65535));
        }
    }
}
