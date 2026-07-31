package com.google.flatbuffers;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.flatbuffers.Utf8;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class Utf8Safe extends Utf8 {

    static class UnpairedSurrogateException extends IllegalArgumentException {
        UnpairedSurrogateException(int i4, int i5) {
            super("Unpaired surrogate at index " + i4 + " of " + i5);
        }
    }

    private static int computeEncodedLength(CharSequence charSequence) {
        int length = charSequence.length();
        int i4 = 0;
        while (i4 < length && charSequence.charAt(i4) < 128) {
            i4++;
        }
        int i5 = length;
        while (true) {
            if (i4 < length) {
                char charAt = charSequence.charAt(i4);
                if (charAt >= 2048) {
                    i5 += encodedLengthGeneral(charSequence, i4);
                    break;
                }
                i5 += (127 - charAt) >>> 31;
                i4++;
            } else {
                break;
            }
        }
        if (i5 >= length) {
            return i5;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i5 + 4294967296L));
    }

    public static String decodeUtf8Array(byte[] bArr, int i4, int i5) {
        if ((i4 | i5 | ((bArr.length - i4) - i5)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i4), Integer.valueOf(i5)));
        }
        int i6 = i4 + i5;
        char[] cArr = new char[i5];
        int i7 = 0;
        while (i4 < i6) {
            byte b4 = bArr[i4];
            if (!Utf8.DecodeUtil.isOneByte(b4)) {
                break;
            }
            i4++;
            Utf8.DecodeUtil.handleOneByte(b4, cArr, i7);
            i7++;
        }
        int i8 = i7;
        while (i4 < i6) {
            int i9 = i4 + 1;
            byte b5 = bArr[i4];
            if (Utf8.DecodeUtil.isOneByte(b5)) {
                int i10 = i8 + 1;
                Utf8.DecodeUtil.handleOneByte(b5, cArr, i8);
                int i11 = i9;
                while (i11 < i6) {
                    byte b6 = bArr[i11];
                    if (!Utf8.DecodeUtil.isOneByte(b6)) {
                        break;
                    }
                    i11++;
                    Utf8.DecodeUtil.handleOneByte(b6, cArr, i10);
                    i10++;
                }
                i8 = i10;
                i4 = i11;
            } else if (Utf8.DecodeUtil.isTwoBytes(b5)) {
                if (i9 >= i6) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                i4 += 2;
                Utf8.DecodeUtil.handleTwoBytes(b5, bArr[i9], cArr, i8);
                i8++;
            } else if (Utf8.DecodeUtil.isThreeBytes(b5)) {
                if (i9 >= i6 - 1) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                int i12 = i4 + 2;
                i4 += 3;
                Utf8.DecodeUtil.handleThreeBytes(b5, bArr[i9], bArr[i12], cArr, i8);
                i8++;
            } else {
                if (i9 >= i6 - 2) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                byte b7 = bArr[i9];
                int i13 = i4 + 3;
                byte b8 = bArr[i4 + 2];
                i4 += 4;
                Utf8.DecodeUtil.handleFourBytes(b5, b7, b8, bArr[i13], cArr, i8);
                i8 += 2;
            }
        }
        return new String(cArr, 0, i8);
    }

    public static String decodeUtf8Buffer(ByteBuffer byteBuffer, int i4, int i5) {
        if ((i4 | i5 | ((byteBuffer.limit() - i4) - i5)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i4), Integer.valueOf(i5)));
        }
        int i6 = i4 + i5;
        char[] cArr = new char[i5];
        int i7 = 0;
        while (i4 < i6) {
            byte b4 = byteBuffer.get(i4);
            if (!Utf8.DecodeUtil.isOneByte(b4)) {
                break;
            }
            i4++;
            Utf8.DecodeUtil.handleOneByte(b4, cArr, i7);
            i7++;
        }
        int i8 = i7;
        while (i4 < i6) {
            int i9 = i4 + 1;
            byte b5 = byteBuffer.get(i4);
            if (Utf8.DecodeUtil.isOneByte(b5)) {
                int i10 = i8 + 1;
                Utf8.DecodeUtil.handleOneByte(b5, cArr, i8);
                int i11 = i9;
                while (i11 < i6) {
                    byte b6 = byteBuffer.get(i11);
                    if (!Utf8.DecodeUtil.isOneByte(b6)) {
                        break;
                    }
                    i11++;
                    Utf8.DecodeUtil.handleOneByte(b6, cArr, i10);
                    i10++;
                }
                i8 = i10;
                i4 = i11;
            } else if (Utf8.DecodeUtil.isTwoBytes(b5)) {
                if (i9 >= i6) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                i4 += 2;
                Utf8.DecodeUtil.handleTwoBytes(b5, byteBuffer.get(i9), cArr, i8);
                i8++;
            } else if (Utf8.DecodeUtil.isThreeBytes(b5)) {
                if (i9 >= i6 - 1) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                int i12 = i4 + 2;
                i4 += 3;
                Utf8.DecodeUtil.handleThreeBytes(b5, byteBuffer.get(i9), byteBuffer.get(i12), cArr, i8);
                i8++;
            } else {
                if (i9 >= i6 - 2) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                byte b7 = byteBuffer.get(i9);
                int i13 = i4 + 3;
                byte b8 = byteBuffer.get(i4 + 2);
                i4 += 4;
                Utf8.DecodeUtil.handleFourBytes(b5, b7, b8, byteBuffer.get(i13), cArr, i8);
                i8 += 2;
            }
        }
        return new String(cArr, 0, i8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
    
        return r9 + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int encodeUtf8Array(CharSequence charSequence, byte[] bArr, int i4, int i5) {
        int i6;
        int i7;
        char charAt;
        int length = charSequence.length();
        int i8 = i5 + i4;
        int i9 = 0;
        while (i9 < length && (i7 = i9 + i4) < i8 && (charAt = charSequence.charAt(i9)) < 128) {
            bArr[i7] = (byte) charAt;
            i9++;
        }
        int i10 = i4 + i9;
        while (i9 < length) {
            char charAt2 = charSequence.charAt(i9);
            if (charAt2 < 128 && i10 < i8) {
                bArr[i10] = (byte) charAt2;
                i10++;
            } else if (charAt2 < 2048 && i10 <= i8 - 2) {
                int i11 = i10 + 1;
                bArr[i10] = (byte) ((charAt2 >>> 6) | 960);
                i10 += 2;
                bArr[i11] = (byte) ((charAt2 & '?') | UserVerificationMethods.USER_VERIFY_PATTERN);
            } else {
                if ((charAt2 >= 55296 && 57343 >= charAt2) || i10 > i8 - 3) {
                    if (i10 > i8 - 4) {
                        if (55296 <= charAt2 && charAt2 <= 57343 && ((i6 = i9 + 1) == charSequence.length() || !Character.isSurrogatePair(charAt2, charSequence.charAt(i6)))) {
                            throw new UnpairedSurrogateException(i9, length);
                        }
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + i10);
                    }
                    int i12 = i9 + 1;
                    if (i12 != charSequence.length()) {
                        char charAt3 = charSequence.charAt(i12);
                        if (Character.isSurrogatePair(charAt2, charAt3)) {
                            int codePoint = Character.toCodePoint(charAt2, charAt3);
                            bArr[i10] = (byte) ((codePoint >>> 18) | 240);
                            bArr[i10 + 1] = (byte) (((codePoint >>> 12) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN);
                            int i13 = i10 + 3;
                            bArr[i10 + 2] = (byte) (((codePoint >>> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN);
                            i10 += 4;
                            bArr[i13] = (byte) ((codePoint & 63) | UserVerificationMethods.USER_VERIFY_PATTERN);
                            i9 = i12;
                        } else {
                            i9 = i12;
                        }
                    }
                    throw new UnpairedSurrogateException(i9 - 1, length);
                }
                bArr[i10] = (byte) ((charAt2 >>> '\f') | 480);
                int i14 = i10 + 2;
                bArr[i10 + 1] = (byte) (((charAt2 >>> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN);
                i10 += 3;
                bArr[i14] = (byte) ((charAt2 & '?') | UserVerificationMethods.USER_VERIFY_PATTERN);
            }
            i9++;
        }
        return i10;
    }

    private static void encodeUtf8Buffer(CharSequence charSequence, ByteBuffer byteBuffer) {
        int i4;
        int length = charSequence.length();
        int position = byteBuffer.position();
        int i5 = 0;
        while (i5 < length) {
            try {
                char charAt = charSequence.charAt(i5);
                if (charAt >= 128) {
                    break;
                }
                byteBuffer.put(position + i5, (byte) charAt);
                i5++;
            } catch (IndexOutOfBoundsException unused) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i5) + " at index " + (byteBuffer.position() + Math.max(i5, (position - byteBuffer.position()) + 1)));
            }
        }
        if (i5 == length) {
            byteBuffer.position(position + i5);
            return;
        }
        position += i5;
        while (i5 < length) {
            char charAt2 = charSequence.charAt(i5);
            if (charAt2 < 128) {
                byteBuffer.put(position, (byte) charAt2);
            } else if (charAt2 < 2048) {
                int i6 = position + 1;
                try {
                    byteBuffer.put(position, (byte) ((charAt2 >>> 6) | 192));
                    byteBuffer.put(i6, (byte) ((charAt2 & '?') | UserVerificationMethods.USER_VERIFY_PATTERN));
                    position = i6;
                } catch (IndexOutOfBoundsException unused2) {
                    position = i6;
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i5) + " at index " + (byteBuffer.position() + Math.max(i5, (position - byteBuffer.position()) + 1)));
                }
            } else {
                if (charAt2 >= 55296 && 57343 >= charAt2) {
                    int i7 = i5 + 1;
                    if (i7 != length) {
                        try {
                            char charAt3 = charSequence.charAt(i7);
                            if (Character.isSurrogatePair(charAt2, charAt3)) {
                                int codePoint = Character.toCodePoint(charAt2, charAt3);
                                int i8 = position + 1;
                                try {
                                    byteBuffer.put(position, (byte) ((codePoint >>> 18) | 240));
                                    i4 = position + 2;
                                } catch (IndexOutOfBoundsException unused3) {
                                    position = i8;
                                    i5 = i7;
                                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i5) + " at index " + (byteBuffer.position() + Math.max(i5, (position - byteBuffer.position()) + 1)));
                                }
                                try {
                                    byteBuffer.put(i8, (byte) (((codePoint >>> 12) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                                    position += 3;
                                    byteBuffer.put(i4, (byte) (((codePoint >>> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                                    byteBuffer.put(position, (byte) ((codePoint & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                                    i5 = i7;
                                } catch (IndexOutOfBoundsException unused4) {
                                    i5 = i7;
                                    position = i4;
                                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i5) + " at index " + (byteBuffer.position() + Math.max(i5, (position - byteBuffer.position()) + 1)));
                                }
                            } else {
                                i5 = i7;
                            }
                        } catch (IndexOutOfBoundsException unused5) {
                        }
                    }
                    throw new UnpairedSurrogateException(i5, length);
                }
                int i9 = position + 1;
                byteBuffer.put(position, (byte) ((charAt2 >>> '\f') | 224));
                position += 2;
                byteBuffer.put(i9, (byte) (((charAt2 >>> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                byteBuffer.put(position, (byte) ((charAt2 & '?') | UserVerificationMethods.USER_VERIFY_PATTERN));
            }
            i5++;
            position++;
        }
        byteBuffer.position(position);
    }

    private static int encodedLengthGeneral(CharSequence charSequence, int i4) {
        int length = charSequence.length();
        int i5 = 0;
        while (i4 < length) {
            char charAt = charSequence.charAt(i4);
            if (charAt < 2048) {
                i5 += (127 - charAt) >>> 31;
            } else {
                i5 += 2;
                if (55296 <= charAt && charAt <= 57343) {
                    if (Character.codePointAt(charSequence, i4) < 65536) {
                        throw new UnpairedSurrogateException(i4, length);
                    }
                    i4++;
                }
            }
            i4++;
        }
        return i5;
    }

    @Override // com.google.flatbuffers.Utf8
    public String decodeUtf8(ByteBuffer byteBuffer, int i4, int i5) {
        return byteBuffer.hasArray() ? decodeUtf8Array(byteBuffer.array(), byteBuffer.arrayOffset() + i4, i5) : decodeUtf8Buffer(byteBuffer, i4, i5);
    }

    @Override // com.google.flatbuffers.Utf8
    public void encodeUtf8(CharSequence charSequence, ByteBuffer byteBuffer) {
        if (!byteBuffer.hasArray()) {
            encodeUtf8Buffer(charSequence, byteBuffer);
        } else {
            int arrayOffset = byteBuffer.arrayOffset();
            byteBuffer.position(encodeUtf8Array(charSequence, byteBuffer.array(), byteBuffer.position() + arrayOffset, byteBuffer.remaining()) - arrayOffset);
        }
    }

    @Override // com.google.flatbuffers.Utf8
    public int encodedLength(CharSequence charSequence) {
        return computeEncodedLength(charSequence);
    }
}
