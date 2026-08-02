package defpackage;

import java.math.RoundingMode;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hps {
    public final char[] a;
    final int b;
    final int c;
    final int d;
    final int e;
    public final byte[] f;
    private final String g;
    private final boolean[] h;
    private final boolean i;

    /* JADX WARN: Removed duplicated region for block: B:16:0x0065 A[LOOP:0: B:14:0x0061->B:16:0x0065, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private hps(String str, char[] cArr, byte[] bArr) {
        int numberOfLeadingZeros;
        int i;
        this.g = str;
        cArr.getClass();
        this.a = cArr;
        try {
            int length = cArr.length;
            RoundingMode roundingMode = RoundingMode.UNNECESSARY;
            if (length <= 0) {
                throw new IllegalArgumentException("x (0) must be > 0");
            }
            switch (hro.a[roundingMode.ordinal()]) {
                case 1:
                    hoq.k(((length + (-1)) & length) == 0);
                case 2:
                case 3:
                    numberOfLeadingZeros = 31 - Integer.numberOfLeadingZeros(length);
                    this.c = numberOfLeadingZeros;
                    int numberOfTrailingZeros = Integer.numberOfTrailingZeros(numberOfLeadingZeros);
                    int i2 = 1 << (3 - numberOfTrailingZeros);
                    this.d = i2;
                    this.e = numberOfLeadingZeros >> numberOfTrailingZeros;
                    this.b = length - 1;
                    this.f = bArr;
                    boolean[] zArr = new boolean[i2];
                    for (i = 0; i < this.e; i++) {
                        zArr[hoq.l(i * 8, this.c, RoundingMode.CEILING)] = true;
                    }
                    this.h = zArr;
                    this.i = false;
                    return;
                case 4:
                case 5:
                    numberOfLeadingZeros = 32 - Integer.numberOfLeadingZeros(length - 1);
                    this.c = numberOfLeadingZeros;
                    int numberOfTrailingZeros2 = Integer.numberOfTrailingZeros(numberOfLeadingZeros);
                    int i22 = 1 << (3 - numberOfTrailingZeros2);
                    this.d = i22;
                    this.e = numberOfLeadingZeros >> numberOfTrailingZeros2;
                    this.b = length - 1;
                    this.f = bArr;
                    boolean[] zArr2 = new boolean[i22];
                    while (i < this.e) {
                    }
                    this.h = zArr2;
                    this.i = false;
                    return;
                case 6:
                case 7:
                case 8:
                    int numberOfLeadingZeros2 = Integer.numberOfLeadingZeros(length);
                    numberOfLeadingZeros = (31 - numberOfLeadingZeros2) + ((((-1257966797) >>> numberOfLeadingZeros2) - length) >>> 31);
                    this.c = numberOfLeadingZeros;
                    int numberOfTrailingZeros22 = Integer.numberOfTrailingZeros(numberOfLeadingZeros);
                    int i222 = 1 << (3 - numberOfTrailingZeros22);
                    this.d = i222;
                    this.e = numberOfLeadingZeros >> numberOfTrailingZeros22;
                    this.b = length - 1;
                    this.f = bArr;
                    boolean[] zArr22 = new boolean[i222];
                    while (i < this.e) {
                    }
                    this.h = zArr22;
                    this.i = false;
                    return;
                default:
                    throw new AssertionError();
            }
        } catch (ArithmeticException e) {
            throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e);
        }
    }

    final char a(int i) {
        return this.a[i];
    }

    final int b(char c) {
        if (c > 127) {
            throw new hpv("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c))));
        }
        byte b = this.f[c];
        if (b != -1) {
            return b;
        }
        if (c <= ' ' || c == 127) {
            throw new hpv("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c))));
        }
        throw new hpv("Unrecognized character: " + c);
    }

    final boolean c(int i) {
        return this.h[i % this.d];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hps) {
            hps hpsVar = (hps) obj;
            boolean z = hpsVar.i;
            if (Arrays.equals(this.a, hpsVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a) + 1237;
    }

    public final String toString() {
        return this.g;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public hps(String str, char[] cArr) {
        this(str, cArr, r1);
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i = 0; i < cArr.length; i++) {
            char c = cArr[i];
            boolean z = true;
            hoq.z(c < 128, "Non-ASCII character: %s", c);
            if (bArr[c] != -1) {
                z = false;
            }
            hoq.z(z, "Duplicate character: %s", c);
            bArr[c] = (byte) i;
        }
    }
}
