package com.startapp.simple.bloomfilter.codec;

import com.startapp.simple.bloomfilter.codec.BaseNCodec;
import okio.Utf8;

/* loaded from: classes3.dex */
public class Base64 extends BaseNCodec {
    private static final int BITS_PER_ENCODED_BYTE = 6;
    private static final int BYTES_PER_ENCODED_BLOCK = 4;
    private static final int BYTES_PER_UNENCODED_BLOCK = 3;
    private static final int MASK_6BITS = 63;
    private final int decodeSize;
    private final byte[] decodeTable;
    private final int encodeSize;
    private final byte[] encodeTable;
    private final byte[] lineSeparator;
    static final byte[] CHUNK_SEPARATOR = {13, 10};
    private static final byte[] STANDARD_ENCODE_TABLE = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
    private static final byte[] URL_SAFE_ENCODE_TABLE = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};
    private static final byte[] DECODE_TABLE = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, 62, -1, Utf8.REPLACEMENT_BYTE, 52, 53, 54, 55, 56, 57, 58, 59, 60, kotlin.io.encoding.Base64.padSymbol, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, Utf8.REPLACEMENT_BYTE, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51};

    public Base64() {
        this(0);
    }

    public Base64(boolean z) {
        this(76, CHUNK_SEPARATOR, z);
    }

    public Base64(int i) {
        this(i, CHUNK_SEPARATOR);
    }

    public Base64(int i, byte[] bArr) {
        this(i, bArr, false);
    }

    public Base64(int i, byte[] bArr, boolean z) {
        super(3, 4, i, bArr == null ? 0 : bArr.length);
        this.decodeTable = DECODE_TABLE;
        if (bArr != null) {
            if (containsAlphabetOrPad(bArr)) {
                throw new IllegalArgumentException("lineSeparator must not contain base64 characters: [" + StringUtils.newStringUtf8(bArr) + "]");
            }
            if (i > 0) {
                this.encodeSize = bArr.length + 4;
                byte[] bArr2 = new byte[bArr.length];
                this.lineSeparator = bArr2;
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            } else {
                this.encodeSize = 4;
                this.lineSeparator = null;
            }
        } else {
            this.encodeSize = 4;
            this.lineSeparator = null;
        }
        this.decodeSize = this.encodeSize - 1;
        this.encodeTable = z ? URL_SAFE_ENCODE_TABLE : STANDARD_ENCODE_TABLE;
    }

    @Override // com.startapp.simple.bloomfilter.codec.BaseNCodec
    void encode(byte[] bArr, int i, int i2, BaseNCodec.Context context) {
        if (context.eof) {
            return;
        }
        if (i2 >= 0) {
            int i3 = 0;
            while (i3 < i2) {
                byte[] ensureBufferSize = ensureBufferSize(this.encodeSize, context);
                context.modulus = (context.modulus + 1) % 3;
                int i4 = i + 1;
                int i5 = bArr[i];
                if (i5 < 0) {
                    i5 += 256;
                }
                context.ibitWorkArea = (context.ibitWorkArea << 8) + i5;
                if (context.modulus == 0) {
                    int i6 = context.pos;
                    context.pos = i6 + 1;
                    ensureBufferSize[i6] = this.encodeTable[(context.ibitWorkArea >> 18) & 63];
                    int i7 = context.pos;
                    context.pos = i7 + 1;
                    ensureBufferSize[i7] = this.encodeTable[(context.ibitWorkArea >> 12) & 63];
                    int i8 = context.pos;
                    context.pos = i8 + 1;
                    ensureBufferSize[i8] = this.encodeTable[(context.ibitWorkArea >> 6) & 63];
                    int i9 = context.pos;
                    context.pos = i9 + 1;
                    ensureBufferSize[i9] = this.encodeTable[context.ibitWorkArea & 63];
                    context.currentLinePos += 4;
                    if (this.lineLength > 0 && this.lineLength <= context.currentLinePos) {
                        System.arraycopy(this.lineSeparator, 0, ensureBufferSize, context.pos, this.lineSeparator.length);
                        context.pos += this.lineSeparator.length;
                        context.currentLinePos = 0;
                    }
                }
                i3++;
                i = i4;
            }
            return;
        }
        context.eof = true;
        if (context.modulus == 0 && this.lineLength == 0) {
            return;
        }
        byte[] ensureBufferSize2 = ensureBufferSize(this.encodeSize, context);
        int i10 = context.pos;
        int i11 = context.modulus;
        if (i11 != 0) {
            if (i11 == 1) {
                int i12 = context.pos;
                context.pos = i12 + 1;
                ensureBufferSize2[i12] = this.encodeTable[(context.ibitWorkArea >> 2) & 63];
                int i13 = context.pos;
                context.pos = i13 + 1;
                ensureBufferSize2[i13] = this.encodeTable[(context.ibitWorkArea << 4) & 63];
                if (this.encodeTable == STANDARD_ENCODE_TABLE) {
                    int i14 = context.pos;
                    context.pos = i14 + 1;
                    ensureBufferSize2[i14] = kotlin.io.encoding.Base64.padSymbol;
                    int i15 = context.pos;
                    context.pos = i15 + 1;
                    ensureBufferSize2[i15] = kotlin.io.encoding.Base64.padSymbol;
                }
            } else if (i11 == 2) {
                int i16 = context.pos;
                context.pos = i16 + 1;
                ensureBufferSize2[i16] = this.encodeTable[(context.ibitWorkArea >> 10) & 63];
                int i17 = context.pos;
                context.pos = i17 + 1;
                ensureBufferSize2[i17] = this.encodeTable[(context.ibitWorkArea >> 4) & 63];
                int i18 = context.pos;
                context.pos = i18 + 1;
                ensureBufferSize2[i18] = this.encodeTable[(context.ibitWorkArea << 2) & 63];
                if (this.encodeTable == STANDARD_ENCODE_TABLE) {
                    int i19 = context.pos;
                    context.pos = i19 + 1;
                    ensureBufferSize2[i19] = kotlin.io.encoding.Base64.padSymbol;
                }
            } else {
                throw new IllegalStateException("Impossible modulus " + context.modulus);
            }
        }
        context.currentLinePos += context.pos - i10;
        if (this.lineLength <= 0 || context.currentLinePos <= 0) {
            return;
        }
        System.arraycopy(this.lineSeparator, 0, ensureBufferSize2, context.pos, this.lineSeparator.length);
        context.pos += this.lineSeparator.length;
    }

    @Override // com.startapp.simple.bloomfilter.codec.BaseNCodec
    void decode(byte[] bArr, int i, int i2, BaseNCodec.Context context) {
        byte b;
        if (context.eof) {
            return;
        }
        if (i2 < 0) {
            context.eof = true;
        }
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            byte[] ensureBufferSize = ensureBufferSize(this.decodeSize, context);
            int i4 = i + 1;
            byte b2 = bArr[i];
            if (b2 == 61) {
                context.eof = true;
                break;
            }
            if (b2 >= 0) {
                byte[] bArr2 = DECODE_TABLE;
                if (b2 < bArr2.length && (b = bArr2[b2]) >= 0) {
                    context.modulus = (context.modulus + 1) % 4;
                    context.ibitWorkArea = (context.ibitWorkArea << 6) + b;
                    if (context.modulus == 0) {
                        int i5 = context.pos;
                        context.pos = i5 + 1;
                        ensureBufferSize[i5] = (byte) ((context.ibitWorkArea >> 16) & 255);
                        int i6 = context.pos;
                        context.pos = i6 + 1;
                        ensureBufferSize[i6] = (byte) ((context.ibitWorkArea >> 8) & 255);
                        int i7 = context.pos;
                        context.pos = i7 + 1;
                        ensureBufferSize[i7] = (byte) (context.ibitWorkArea & 255);
                    }
                }
            }
            i3++;
            i = i4;
        }
        if (!context.eof || context.modulus == 0) {
            return;
        }
        byte[] ensureBufferSize2 = ensureBufferSize(this.decodeSize, context);
        int i8 = context.modulus;
        if (i8 != 1) {
            if (i8 == 2) {
                context.ibitWorkArea >>= 4;
                int i9 = context.pos;
                context.pos = i9 + 1;
                ensureBufferSize2[i9] = (byte) (context.ibitWorkArea & 255);
                return;
            }
            if (i8 == 3) {
                context.ibitWorkArea >>= 2;
                int i10 = context.pos;
                context.pos = i10 + 1;
                ensureBufferSize2[i10] = (byte) ((context.ibitWorkArea >> 8) & 255);
                int i11 = context.pos;
                context.pos = i11 + 1;
                ensureBufferSize2[i11] = (byte) (context.ibitWorkArea & 255);
                return;
            }
            throw new IllegalStateException("Impossible modulus " + context.modulus);
        }
    }

    public static String encodeBase64String(byte[] bArr) {
        return StringUtils.newStringUtf8(encodeBase64(bArr, false));
    }

    public static byte[] encodeBase64(byte[] bArr, boolean z) {
        return encodeBase64(bArr, z, false);
    }

    public static byte[] encodeBase64(byte[] bArr, boolean z, boolean z2) {
        return encodeBase64(bArr, z, z2, Integer.MAX_VALUE);
    }

    public static byte[] encodeBase64(byte[] bArr, boolean z, boolean z2, int i) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        Base64 base64 = z ? new Base64(z2) : new Base64(0, CHUNK_SEPARATOR, z2);
        long encodedLength = base64.getEncodedLength(bArr);
        if (encodedLength > i) {
            throw new IllegalArgumentException("Input array too big, the output array would be bigger (" + encodedLength + ") than the specified maximum size of " + i);
        }
        return base64.encode(bArr);
    }

    public static byte[] decodeBase64(String str) {
        return new Base64().decode(str);
    }

    @Override // com.startapp.simple.bloomfilter.codec.BaseNCodec
    protected boolean isInAlphabet(byte b) {
        if (b < 0) {
            return false;
        }
        byte[] bArr = this.decodeTable;
        return b < bArr.length && bArr[b] != -1;
    }
}
