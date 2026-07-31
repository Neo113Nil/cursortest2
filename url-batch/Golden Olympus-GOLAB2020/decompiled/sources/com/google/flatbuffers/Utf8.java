package com.google.flatbuffers;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public abstract class Utf8 {
    private static Utf8 DEFAULT;

    static class DecodeUtil {
        static void handleFourBytes(byte b4, byte b5, byte b6, byte b7, char[] cArr, int i4) {
            if (isNotTrailingByte(b5) || (((b4 << 28) + (b5 + 112)) >> 30) != 0 || isNotTrailingByte(b6) || isNotTrailingByte(b7)) {
                throw new IllegalArgumentException("Invalid UTF-8");
            }
            int trailingByteValue = ((b4 & 7) << 18) | (trailingByteValue(b5) << 12) | (trailingByteValue(b6) << 6) | trailingByteValue(b7);
            cArr[i4] = highSurrogate(trailingByteValue);
            cArr[i4 + 1] = lowSurrogate(trailingByteValue);
        }

        static void handleOneByte(byte b4, char[] cArr, int i4) {
            cArr[i4] = (char) b4;
        }

        static void handleThreeBytes(byte b4, byte b5, byte b6, char[] cArr, int i4) {
            if (isNotTrailingByte(b5) || ((b4 == -32 && b5 < -96) || ((b4 == -19 && b5 >= -96) || isNotTrailingByte(b6)))) {
                throw new IllegalArgumentException("Invalid UTF-8");
            }
            cArr[i4] = (char) (((b4 & 15) << 12) | (trailingByteValue(b5) << 6) | trailingByteValue(b6));
        }

        static void handleTwoBytes(byte b4, byte b5, char[] cArr, int i4) {
            if (b4 < -62) {
                throw new IllegalArgumentException("Invalid UTF-8: Illegal leading byte in 2 bytes utf");
            }
            if (isNotTrailingByte(b5)) {
                throw new IllegalArgumentException("Invalid UTF-8: Illegal trailing byte in 2 bytes utf");
            }
            cArr[i4] = (char) (((b4 & 31) << 6) | trailingByteValue(b5));
        }

        private static char highSurrogate(int i4) {
            return (char) ((i4 >>> 10) + 55232);
        }

        private static boolean isNotTrailingByte(byte b4) {
            return b4 > -65;
        }

        static boolean isOneByte(byte b4) {
            return b4 >= 0;
        }

        static boolean isThreeBytes(byte b4) {
            return b4 < -16;
        }

        static boolean isTwoBytes(byte b4) {
            return b4 < -32;
        }

        private static char lowSurrogate(int i4) {
            return (char) ((i4 & 1023) + 56320);
        }

        private static int trailingByteValue(byte b4) {
            return b4 & 63;
        }
    }

    public static Utf8 getDefault() {
        if (DEFAULT == null) {
            DEFAULT = new Utf8Safe();
        }
        return DEFAULT;
    }

    public abstract String decodeUtf8(ByteBuffer byteBuffer, int i4, int i5);

    public abstract void encodeUtf8(CharSequence charSequence, ByteBuffer byteBuffer);

    public abstract int encodedLength(CharSequence charSequence);
}
