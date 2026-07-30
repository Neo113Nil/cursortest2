package androidx.emoji2.text.flatbuffer;

import androidx.emoji2.text.flatbuffer.Utf8;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class Utf8Safe extends Utf8 {

    static class UnpairedSurrogateException extends IllegalArgumentException {
        UnpairedSurrogateException(int i8, int i9) {
            super("Unpaired surrogate at index " + i8 + " of " + i9);
        }
    }

    private static int computeEncodedLength(CharSequence charSequence) {
        int length = charSequence.length();
        int i8 = 0;
        while (i8 < length && charSequence.charAt(i8) < 128) {
            i8++;
        }
        int i9 = length;
        while (true) {
            if (i8 < length) {
                char charAt = charSequence.charAt(i8);
                if (charAt >= 2048) {
                    i9 += encodedLengthGeneral(charSequence, i8);
                    break;
                }
                i9 += (127 - charAt) >>> 31;
                i8++;
            } else {
                break;
            }
        }
        if (i9 >= length) {
            return i9;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i9 + 4294967296L));
    }

    public static String decodeUtf8Array(byte[] bArr, int i8, int i9) {
        if ((i8 | i9 | ((bArr.length - i8) - i9)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i8), Integer.valueOf(i9)));
        }
        int i10 = i8 + i9;
        char[] cArr = new char[i9];
        int i11 = 0;
        while (i8 < i10) {
            byte b8 = bArr[i8];
            if (!Utf8.DecodeUtil.isOneByte(b8)) {
                break;
            }
            i8++;
            Utf8.DecodeUtil.handleOneByte(b8, cArr, i11);
            i11++;
        }
        int i12 = i11;
        while (i8 < i10) {
            int i13 = i8 + 1;
            byte b9 = bArr[i8];
            if (Utf8.DecodeUtil.isOneByte(b9)) {
                int i14 = i12 + 1;
                Utf8.DecodeUtil.handleOneByte(b9, cArr, i12);
                while (i13 < i10) {
                    byte b10 = bArr[i13];
                    if (!Utf8.DecodeUtil.isOneByte(b10)) {
                        break;
                    }
                    i13++;
                    Utf8.DecodeUtil.handleOneByte(b10, cArr, i14);
                    i14++;
                }
                i12 = i14;
                i8 = i13;
            } else if (Utf8.DecodeUtil.isTwoBytes(b9)) {
                if (i13 >= i10) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                i8 += 2;
                Utf8.DecodeUtil.handleTwoBytes(b9, bArr[i13], cArr, i12);
                i12++;
            } else if (Utf8.DecodeUtil.isThreeBytes(b9)) {
                if (i13 >= i10 - 1) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                int i15 = i8 + 2;
                i8 += 3;
                Utf8.DecodeUtil.handleThreeBytes(b9, bArr[i13], bArr[i15], cArr, i12);
                i12++;
            } else {
                if (i13 >= i10 - 2) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                byte b11 = bArr[i13];
                int i16 = i8 + 3;
                byte b12 = bArr[i8 + 2];
                i8 += 4;
                Utf8.DecodeUtil.handleFourBytes(b9, b11, b12, bArr[i16], cArr, i12);
                i12 += 2;
            }
        }
        return new String(cArr, 0, i12);
    }

    public static String decodeUtf8Buffer(ByteBuffer byteBuffer, int i8, int i9) {
        if ((i8 | i9 | ((byteBuffer.limit() - i8) - i9)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i8), Integer.valueOf(i9)));
        }
        int i10 = i8 + i9;
        char[] cArr = new char[i9];
        int i11 = 0;
        while (i8 < i10) {
            byte b8 = byteBuffer.get(i8);
            if (!Utf8.DecodeUtil.isOneByte(b8)) {
                break;
            }
            i8++;
            Utf8.DecodeUtil.handleOneByte(b8, cArr, i11);
            i11++;
        }
        int i12 = i11;
        while (i8 < i10) {
            int i13 = i8 + 1;
            byte b9 = byteBuffer.get(i8);
            if (Utf8.DecodeUtil.isOneByte(b9)) {
                int i14 = i12 + 1;
                Utf8.DecodeUtil.handleOneByte(b9, cArr, i12);
                while (i13 < i10) {
                    byte b10 = byteBuffer.get(i13);
                    if (!Utf8.DecodeUtil.isOneByte(b10)) {
                        break;
                    }
                    i13++;
                    Utf8.DecodeUtil.handleOneByte(b10, cArr, i14);
                    i14++;
                }
                i12 = i14;
                i8 = i13;
            } else if (Utf8.DecodeUtil.isTwoBytes(b9)) {
                if (i13 >= i10) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                i8 += 2;
                Utf8.DecodeUtil.handleTwoBytes(b9, byteBuffer.get(i13), cArr, i12);
                i12++;
            } else if (Utf8.DecodeUtil.isThreeBytes(b9)) {
                if (i13 >= i10 - 1) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                int i15 = i8 + 2;
                i8 += 3;
                Utf8.DecodeUtil.handleThreeBytes(b9, byteBuffer.get(i13), byteBuffer.get(i15), cArr, i12);
                i12++;
            } else {
                if (i13 >= i10 - 2) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                byte b11 = byteBuffer.get(i13);
                int i16 = i8 + 3;
                byte b12 = byteBuffer.get(i8 + 2);
                i8 += 4;
                Utf8.DecodeUtil.handleFourBytes(b9, b11, b12, byteBuffer.get(i16), cArr, i12);
                i12 += 2;
            }
        }
        return new String(cArr, 0, i12);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
    
        return r9 + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int encodeUtf8Array(CharSequence charSequence, byte[] bArr, int i8, int i9) {
        int i10;
        int i11;
        char charAt;
        int length = charSequence.length();
        int i12 = i9 + i8;
        int i13 = 0;
        while (i13 < length && (i11 = i13 + i8) < i12 && (charAt = charSequence.charAt(i13)) < 128) {
            bArr[i11] = (byte) charAt;
            i13++;
        }
        int i14 = i8 + i13;
        while (i13 < length) {
            char charAt2 = charSequence.charAt(i13);
            if (charAt2 < 128 && i14 < i12) {
                bArr[i14] = (byte) charAt2;
                i14++;
            } else if (charAt2 < 2048 && i14 <= i12 - 2) {
                int i15 = i14 + 1;
                bArr[i14] = (byte) ((charAt2 >>> 6) | 960);
                i14 += 2;
                bArr[i15] = (byte) ((charAt2 & '?') | 128);
            } else {
                if ((charAt2 >= 55296 && 57343 >= charAt2) || i14 > i12 - 3) {
                    if (i14 > i12 - 4) {
                        if (55296 <= charAt2 && charAt2 <= 57343 && ((i10 = i13 + 1) == charSequence.length() || !Character.isSurrogatePair(charAt2, charSequence.charAt(i10)))) {
                            throw new UnpairedSurrogateException(i13, length);
                        }
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + i14);
                    }
                    int i16 = i13 + 1;
                    if (i16 != charSequence.length()) {
                        char charAt3 = charSequence.charAt(i16);
                        if (Character.isSurrogatePair(charAt2, charAt3)) {
                            int codePoint = Character.toCodePoint(charAt2, charAt3);
                            bArr[i14] = (byte) ((codePoint >>> 18) | 240);
                            bArr[i14 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                            int i17 = i14 + 3;
                            bArr[i14 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i14 += 4;
                            bArr[i17] = (byte) ((codePoint & 63) | 128);
                            i13 = i16;
                        } else {
                            i13 = i16;
                        }
                    }
                    throw new UnpairedSurrogateException(i13 - 1, length);
                }
                bArr[i14] = (byte) ((charAt2 >>> '\f') | 480);
                int i18 = i14 + 2;
                bArr[i14 + 1] = (byte) (((charAt2 >>> 6) & 63) | 128);
                i14 += 3;
                bArr[i18] = (byte) ((charAt2 & '?') | 128);
            }
            i13++;
        }
        return i14;
    }

    private static void encodeUtf8Buffer(CharSequence charSequence, ByteBuffer byteBuffer) {
        int i8;
        int length = charSequence.length();
        int position = byteBuffer.position();
        int i9 = 0;
        while (i9 < length) {
            try {
                char charAt = charSequence.charAt(i9);
                if (charAt >= 128) {
                    break;
                }
                byteBuffer.put(position + i9, (byte) charAt);
                i9++;
            } catch (IndexOutOfBoundsException unused) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i9) + " at index " + (byteBuffer.position() + Math.max(i9, (position - byteBuffer.position()) + 1)));
            }
        }
        if (i9 == length) {
            byteBuffer.position(position + i9);
            return;
        }
        position += i9;
        while (i9 < length) {
            char charAt2 = charSequence.charAt(i9);
            if (charAt2 < 128) {
                byteBuffer.put(position, (byte) charAt2);
            } else if (charAt2 < 2048) {
                int i10 = position + 1;
                try {
                    byteBuffer.put(position, (byte) ((charAt2 >>> 6) | PsExtractor.AUDIO_STREAM));
                    byteBuffer.put(i10, (byte) ((charAt2 & '?') | 128));
                    position = i10;
                } catch (IndexOutOfBoundsException unused2) {
                    position = i10;
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i9) + " at index " + (byteBuffer.position() + Math.max(i9, (position - byteBuffer.position()) + 1)));
                }
            } else {
                if (charAt2 >= 55296 && 57343 >= charAt2) {
                    int i11 = i9 + 1;
                    if (i11 != length) {
                        try {
                            char charAt3 = charSequence.charAt(i11);
                            if (Character.isSurrogatePair(charAt2, charAt3)) {
                                int codePoint = Character.toCodePoint(charAt2, charAt3);
                                int i12 = position + 1;
                                try {
                                    byteBuffer.put(position, (byte) ((codePoint >>> 18) | 240));
                                    i8 = position + 2;
                                } catch (IndexOutOfBoundsException unused3) {
                                    position = i12;
                                    i9 = i11;
                                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i9) + " at index " + (byteBuffer.position() + Math.max(i9, (position - byteBuffer.position()) + 1)));
                                }
                                try {
                                    byteBuffer.put(i12, (byte) (((codePoint >>> 12) & 63) | 128));
                                    position += 3;
                                    byteBuffer.put(i8, (byte) (((codePoint >>> 6) & 63) | 128));
                                    byteBuffer.put(position, (byte) ((codePoint & 63) | 128));
                                    i9 = i11;
                                } catch (IndexOutOfBoundsException unused4) {
                                    i9 = i11;
                                    position = i8;
                                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i9) + " at index " + (byteBuffer.position() + Math.max(i9, (position - byteBuffer.position()) + 1)));
                                }
                            } else {
                                i9 = i11;
                            }
                        } catch (IndexOutOfBoundsException unused5) {
                        }
                    }
                    throw new UnpairedSurrogateException(i9, length);
                }
                int i13 = position + 1;
                byteBuffer.put(position, (byte) ((charAt2 >>> '\f') | 224));
                position += 2;
                byteBuffer.put(i13, (byte) (((charAt2 >>> 6) & 63) | 128));
                byteBuffer.put(position, (byte) ((charAt2 & '?') | 128));
            }
            i9++;
            position++;
        }
        byteBuffer.position(position);
    }

    private static int encodedLengthGeneral(CharSequence charSequence, int i8) {
        int length = charSequence.length();
        int i9 = 0;
        while (i8 < length) {
            char charAt = charSequence.charAt(i8);
            if (charAt < 2048) {
                i9 += (127 - charAt) >>> 31;
            } else {
                i9 += 2;
                if (55296 <= charAt && charAt <= 57343) {
                    if (Character.codePointAt(charSequence, i8) < 65536) {
                        throw new UnpairedSurrogateException(i8, length);
                    }
                    i8++;
                }
            }
            i8++;
        }
        return i9;
    }

    @Override // androidx.emoji2.text.flatbuffer.Utf8
    public String decodeUtf8(ByteBuffer byteBuffer, int i8, int i9) {
        return byteBuffer.hasArray() ? decodeUtf8Array(byteBuffer.array(), byteBuffer.arrayOffset() + i8, i9) : decodeUtf8Buffer(byteBuffer, i8, i9);
    }

    @Override // androidx.emoji2.text.flatbuffer.Utf8
    public void encodeUtf8(CharSequence charSequence, ByteBuffer byteBuffer) {
        if (!byteBuffer.hasArray()) {
            encodeUtf8Buffer(charSequence, byteBuffer);
        } else {
            int arrayOffset = byteBuffer.arrayOffset();
            byteBuffer.position(encodeUtf8Array(charSequence, byteBuffer.array(), byteBuffer.position() + arrayOffset, byteBuffer.remaining()) - arrayOffset);
        }
    }

    @Override // androidx.emoji2.text.flatbuffer.Utf8
    public int encodedLength(CharSequence charSequence) {
        return computeEncodedLength(charSequence);
    }
}
