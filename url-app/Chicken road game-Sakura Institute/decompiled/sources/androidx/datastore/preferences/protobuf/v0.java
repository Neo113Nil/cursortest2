package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public abstract class v0 {

    /* renamed from: a, reason: collision with root package name */
    public static final e0 f5408a;

    static {
        f5408a = (s0.f5402e && s0.f5401d && !AbstractC0438c.a()) ? new t0(1) : new t0(0);
    }

    public static int a(byte[] bArr, int i2, int i4) {
        byte b4 = bArr[i2 - 1];
        int i5 = i4 - i2;
        if (i5 == 0) {
            if (b4 > -12) {
                b4 = -1;
            }
            return b4;
        }
        if (i5 == 1) {
            return c(b4, bArr[i2]);
        }
        if (i5 == 2) {
            return d(b4, bArr[i2], bArr[i2 + 1]);
        }
        throw new AssertionError();
    }

    public static int b(String str) {
        int length = str.length();
        int i2 = 0;
        int i4 = 0;
        while (i4 < length && str.charAt(i4) < 128) {
            i4++;
        }
        int i5 = length;
        while (true) {
            if (i4 >= length) {
                break;
            }
            char charAt = str.charAt(i4);
            if (charAt < 2048) {
                i5 += (127 - charAt) >>> 31;
                i4++;
            } else {
                int length2 = str.length();
                while (i4 < length2) {
                    char charAt2 = str.charAt(i4);
                    if (charAt2 < 2048) {
                        i2 += (127 - charAt2) >>> 31;
                    } else {
                        i2 += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(str, i4) < 65536) {
                                throw new u0(i4, length2);
                            }
                            i4++;
                        }
                    }
                    i4++;
                }
                i5 += i2;
            }
        }
        if (i5 >= length) {
            return i5;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i5 + 4294967296L));
    }

    public static int c(int i2, int i4) {
        if (i2 > -12 || i4 > -65) {
            return -1;
        }
        return i2 ^ (i4 << 8);
    }

    public static int d(int i2, int i4, int i5) {
        if (i2 > -12 || i4 > -65 || i5 > -65) {
            return -1;
        }
        return (i2 ^ (i4 << 8)) ^ (i5 << 16);
    }
}
