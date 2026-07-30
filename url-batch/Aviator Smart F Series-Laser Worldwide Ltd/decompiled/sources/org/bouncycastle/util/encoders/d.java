package org.bouncycastle.util.encoders;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import org.bouncycastle.util.Strings;

/* loaded from: classes5.dex */
public class d {
    private static final e encoder = new e();

    public static int decode(String str, OutputStream outputStream) {
        return encoder.decode(str, outputStream);
    }

    public static byte[] decodeStrict(String str) {
        try {
            return encoder.decodeStrict(str, 0, str.length());
        } catch (Exception e8) {
            throw new DecoderException("exception decoding Hex string: " + e8.getMessage(), e8);
        }
    }

    public static int encode(byte[] bArr, int i8, int i9, OutputStream outputStream) {
        return encoder.encode(bArr, i8, i9, outputStream);
    }

    public static String toHexString(byte[] bArr) {
        return toHexString(bArr, 0, bArr.length);
    }

    public static byte[] decode(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            encoder.decode(str, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e8) {
            throw new DecoderException("exception decoding Hex string: " + e8.getMessage(), e8);
        }
    }

    public static byte[] decodeStrict(String str, int i8, int i9) {
        try {
            return encoder.decodeStrict(str, i8, i9);
        } catch (Exception e8) {
            throw new DecoderException("exception decoding Hex string: " + e8.getMessage(), e8);
        }
    }

    public static int encode(byte[] bArr, OutputStream outputStream) {
        return encoder.encode(bArr, 0, bArr.length, outputStream);
    }

    public static String toHexString(byte[] bArr, int i8, int i9) {
        return Strings.fromByteArray(encode(bArr, i8, i9));
    }

    public static byte[] decode(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            encoder.decode(bArr, 0, bArr.length, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e8) {
            throw new DecoderException("exception decoding Hex data: " + e8.getMessage(), e8);
        }
    }

    public static byte[] encode(byte[] bArr) {
        return encode(bArr, 0, bArr.length);
    }

    public static byte[] encode(byte[] bArr, int i8, int i9) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            encoder.encode(bArr, i8, i9, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e8) {
            throw new EncoderException("exception encoding Hex string: " + e8.getMessage(), e8);
        }
    }
}
