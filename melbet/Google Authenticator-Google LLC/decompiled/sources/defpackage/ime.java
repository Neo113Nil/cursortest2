package defpackage;

import java.nio.charset.StandardCharsets;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ime {
    protected static final int a(String str, byte[] bArr, int i, int i2) {
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        int length = bytes.length;
        if (length - i > i2) {
            throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
        }
        System.arraycopy(bytes, 0, bArr, i, length);
        return i + length;
    }

    public static int b(String str) {
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && str.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = str.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                try {
                    int length2 = str.length();
                    while (i2 < length2) {
                        char charAt2 = str.charAt(i2);
                        if (charAt2 < 2048) {
                            i += (127 - charAt2) >>> 31;
                        } else {
                            i += 2;
                            if (charAt2 >= 55296 && charAt2 <= 57343) {
                                if (Character.codePointAt(str, i2) < 65536) {
                                    throw new jmq(i2, length2);
                                }
                                i2++;
                            }
                        }
                        i2++;
                    }
                    i3 += i;
                } catch (jmq unused) {
                    return str.getBytes(StandardCharsets.UTF_8).length;
                }
            }
        }
        if (i3 >= length) {
            return i3;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i3 + 4294967296L));
    }
}
