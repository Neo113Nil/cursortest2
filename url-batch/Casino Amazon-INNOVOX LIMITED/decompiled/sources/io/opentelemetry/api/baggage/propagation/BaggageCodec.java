package io.opentelemetry.api.baggage.propagation;

import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* loaded from: classes3.dex */
class BaggageCodec {
    private static final byte ESCAPE_CHAR = 37;
    private static final int RADIX = 16;

    private BaggageCodec() {
    }

    private static byte[] decode(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        while (i < bArr.length) {
            byte b = bArr[i];
            if (b == 37) {
                int i2 = i + 1;
                if (i2 >= bArr.length) {
                    return byteArrayOutputStream.toByteArray();
                }
                int digit16 = digit16(bArr[i2]);
                i += 2;
                if (i >= bArr.length) {
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write((char) ((digit16 << 4) + digit16(bArr[i])));
            } else {
                byteArrayOutputStream.write(b);
            }
            i++;
        }
        return byteArrayOutputStream.toByteArray();
    }

    static String decode(String str, Charset charset) {
        return new String(decode(str.getBytes(StandardCharsets.US_ASCII)), charset);
    }

    private static int digit16(byte b) {
        int digit = Character.digit((char) b, 16);
        if (digit != -1) {
            return digit;
        }
        throw new IllegalArgumentException("Invalid URL encoding: not a valid digit (radix 16): " + ((int) b));
    }
}
