package io.opentelemetry.api.internal;

import java.util.Arrays;

/* loaded from: classes4.dex */
public abstract class OtelEncodingUtils {
    public static final char[] ENCODING;
    public static final boolean[] VALID_HEX;

    static {
        char[] cArr = new char[512];
        for (int i = 0; i < 256; i++) {
            cArr[i] = "0123456789abcdef".charAt(i >>> 4);
            cArr[i | 256] = "0123456789abcdef".charAt(i & 15);
        }
        ENCODING = cArr;
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i2 = 0; i2 < 16; i2++) {
            bArr["0123456789abcdef".charAt(i2)] = (byte) i2;
        }
        boolean[] zArr = new boolean[65535];
        int i3 = 0;
        while (i3 < 65535) {
            zArr[i3] = (48 <= i3 && i3 <= 57) || (97 <= i3 && i3 <= 102);
            i3++;
        }
        VALID_HEX = zArr;
    }
}
