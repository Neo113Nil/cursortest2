package R4;

import G0.F;
import G0.P;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;

/* loaded from: classes.dex */
public final class f extends P {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2681c;

    public f(F f3, boolean z) {
        super(f3);
        this.f2681c = z;
    }

    @Override // G0.P
    public final void e(byte b6) {
        if (this.f2681c) {
            k(String.valueOf(b6 & 255));
        } else {
            i(String.valueOf(b6 & 255));
        }
    }

    @Override // G0.P
    public final void g(int i2) {
        if (this.f2681c) {
            k(Long.toString(4294967295L & i2, 10));
        } else {
            i(Long.toString(4294967295L & i2, 10));
        }
    }

    @Override // G0.P
    public final void h(long j2) {
        boolean z = this.f2681c;
        int i2 = 63;
        String str = CommonUrlParts.Values.FALSE_INTEGER;
        if (z) {
            if (j2 != 0) {
                if (j2 > 0) {
                    str = Long.toString(j2, 10);
                } else {
                    char[] cArr = new char[64];
                    long j6 = (j2 >>> 1) / 5;
                    long j7 = 10;
                    cArr[63] = Character.forDigit((int) (j2 - (j6 * j7)), 10);
                    while (j6 > 0) {
                        i2--;
                        cArr[i2] = Character.forDigit((int) (j6 % j7), 10);
                        j6 /= j7;
                    }
                    str = new String(cArr, i2, 64 - i2);
                }
            }
            k(str);
            return;
        }
        if (j2 != 0) {
            if (j2 > 0) {
                str = Long.toString(j2, 10);
            } else {
                char[] cArr2 = new char[64];
                long j8 = (j2 >>> 1) / 5;
                long j9 = 10;
                cArr2[63] = Character.forDigit((int) (j2 - (j8 * j9)), 10);
                while (j8 > 0) {
                    i2--;
                    cArr2[i2] = Character.forDigit((int) (j8 % j9), 10);
                    j8 /= j9;
                }
                str = new String(cArr2, i2, 64 - i2);
            }
        }
        i(str);
    }

    @Override // G0.P
    public final void j(short s2) {
        if (this.f2681c) {
            k(String.valueOf(s2 & 65535));
        } else {
            i(String.valueOf(s2 & 65535));
        }
    }
}
