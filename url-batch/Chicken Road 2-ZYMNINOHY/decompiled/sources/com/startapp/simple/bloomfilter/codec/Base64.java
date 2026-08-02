package com.startapp.simple.bloomfilter.codec;

import com.startapp.simple.bloomfilter.codec.BaseNCodec;
import kotlin.KotlinVersion;
import x.AbstractC1514c;

/* loaded from: classes.dex */
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
    private static final byte[] DECODE_TABLE = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, 62, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51};

    public Base64() {
        this(0);
    }

    public static byte[] decodeBase64(String str) {
        return new Base64().decode(str);
    }

    public static byte[] encodeBase64(byte[] bArr, boolean z) {
        return encodeBase64(bArr, z, false);
    }

    public static String encodeBase64String(byte[] bArr) {
        return StringUtils.newStringUtf8(encodeBase64(bArr, false));
    }

    @Override // com.startapp.simple.bloomfilter.codec.BaseNCodec
    public void decode(byte[] bArr, int i4, int i5, BaseNCodec.Context context) {
        byte b4;
        if (context.eof) {
            return;
        }
        if (i5 < 0) {
            context.eof = true;
        }
        int i6 = 0;
        while (true) {
            if (i6 >= i5) {
                break;
            }
            byte[] ensureBufferSize = ensureBufferSize(this.decodeSize, context);
            int i7 = i4 + 1;
            byte b5 = bArr[i4];
            if (b5 == 61) {
                context.eof = true;
                break;
            }
            if (b5 >= 0) {
                byte[] bArr2 = DECODE_TABLE;
                if (b5 < bArr2.length && (b4 = bArr2[b5]) >= 0) {
                    int i8 = (context.modulus + 1) % 4;
                    context.modulus = i8;
                    int i9 = (context.ibitWorkArea << 6) + b4;
                    context.ibitWorkArea = i9;
                    if (i8 == 0) {
                        int i10 = context.pos;
                        int i11 = i10 + 1;
                        context.pos = i11;
                        ensureBufferSize[i10] = (byte) ((i9 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
                        int i12 = i10 + 2;
                        context.pos = i12;
                        ensureBufferSize[i11] = (byte) ((i9 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                        context.pos = i10 + 3;
                        ensureBufferSize[i12] = (byte) (i9 & KotlinVersion.MAX_COMPONENT_VALUE);
                    }
                }
            }
            i6++;
            i4 = i7;
        }
        if (!context.eof || context.modulus == 0) {
            return;
        }
        byte[] ensureBufferSize2 = ensureBufferSize(this.decodeSize, context);
        int i13 = context.modulus;
        if (i13 != 1) {
            if (i13 == 2) {
                int i14 = context.ibitWorkArea >> 4;
                context.ibitWorkArea = i14;
                int i15 = context.pos;
                context.pos = i15 + 1;
                ensureBufferSize2[i15] = (byte) (i14 & KotlinVersion.MAX_COMPONENT_VALUE);
                return;
            }
            if (i13 != 3) {
                throw new IllegalStateException("Impossible modulus " + context.modulus);
            }
            int i16 = context.ibitWorkArea;
            int i17 = i16 >> 2;
            context.ibitWorkArea = i17;
            int i18 = context.pos;
            int i19 = i18 + 1;
            context.pos = i19;
            ensureBufferSize2[i18] = (byte) ((i16 >> 10) & KotlinVersion.MAX_COMPONENT_VALUE);
            context.pos = i18 + 2;
            ensureBufferSize2[i19] = (byte) (i17 & KotlinVersion.MAX_COMPONENT_VALUE);
        }
    }

    @Override // com.startapp.simple.bloomfilter.codec.BaseNCodec
    public void encode(byte[] bArr, int i4, int i5, BaseNCodec.Context context) {
        if (context.eof) {
            return;
        }
        if (i5 >= 0) {
            int i6 = 0;
            while (i6 < i5) {
                byte[] ensureBufferSize = ensureBufferSize(this.encodeSize, context);
                int i7 = (context.modulus + 1) % 3;
                context.modulus = i7;
                int i8 = i4 + 1;
                int i9 = bArr[i4];
                if (i9 < 0) {
                    i9 += 256;
                }
                int i10 = (context.ibitWorkArea << 8) + i9;
                context.ibitWorkArea = i10;
                if (i7 == 0) {
                    int i11 = context.pos;
                    int i12 = i11 + 1;
                    context.pos = i12;
                    byte[] bArr2 = this.encodeTable;
                    ensureBufferSize[i11] = bArr2[(i10 >> 18) & MASK_6BITS];
                    int i13 = i11 + 2;
                    context.pos = i13;
                    ensureBufferSize[i12] = bArr2[(i10 >> 12) & MASK_6BITS];
                    int i14 = i11 + 3;
                    context.pos = i14;
                    ensureBufferSize[i13] = bArr2[(i10 >> 6) & MASK_6BITS];
                    int i15 = i11 + 4;
                    context.pos = i15;
                    ensureBufferSize[i14] = bArr2[i10 & MASK_6BITS];
                    int i16 = context.currentLinePos + 4;
                    context.currentLinePos = i16;
                    int i17 = this.lineLength;
                    if (i17 > 0 && i17 <= i16) {
                        byte[] bArr3 = this.lineSeparator;
                        System.arraycopy(bArr3, 0, ensureBufferSize, i15, bArr3.length);
                        context.pos += this.lineSeparator.length;
                        context.currentLinePos = 0;
                    }
                }
                i6++;
                i4 = i8;
            }
            return;
        }
        context.eof = true;
        if (context.modulus == 0 && this.lineLength == 0) {
            return;
        }
        byte[] ensureBufferSize2 = ensureBufferSize(this.encodeSize, context);
        int i18 = context.pos;
        int i19 = context.modulus;
        if (i19 != 0) {
            if (i19 == 1) {
                int i20 = i18 + 1;
                context.pos = i20;
                byte[] bArr4 = this.encodeTable;
                int i21 = context.ibitWorkArea;
                ensureBufferSize2[i18] = bArr4[(i21 >> 2) & MASK_6BITS];
                int i22 = i18 + 2;
                context.pos = i22;
                ensureBufferSize2[i20] = bArr4[(i21 << 4) & MASK_6BITS];
                if (bArr4 == STANDARD_ENCODE_TABLE) {
                    int i23 = i18 + 3;
                    context.pos = i23;
                    ensureBufferSize2[i22] = 61;
                    context.pos = i18 + 4;
                    ensureBufferSize2[i23] = 61;
                }
            } else {
                if (i19 != 2) {
                    throw new IllegalStateException("Impossible modulus " + context.modulus);
                }
                int i24 = i18 + 1;
                context.pos = i24;
                byte[] bArr5 = this.encodeTable;
                int i25 = context.ibitWorkArea;
                ensureBufferSize2[i18] = bArr5[(i25 >> 10) & MASK_6BITS];
                int i26 = i18 + 2;
                context.pos = i26;
                ensureBufferSize2[i24] = bArr5[(i25 >> 4) & MASK_6BITS];
                int i27 = i18 + 3;
                context.pos = i27;
                ensureBufferSize2[i26] = bArr5[(i25 << 2) & MASK_6BITS];
                if (bArr5 == STANDARD_ENCODE_TABLE) {
                    context.pos = i18 + 4;
                    ensureBufferSize2[i27] = 61;
                }
            }
        }
        int i28 = context.currentLinePos;
        int i29 = context.pos;
        int i30 = (i29 - i18) + i28;
        context.currentLinePos = i30;
        if (this.lineLength <= 0 || i30 <= 0) {
            return;
        }
        byte[] bArr6 = this.lineSeparator;
        System.arraycopy(bArr6, 0, ensureBufferSize2, i29, bArr6.length);
        context.pos += this.lineSeparator.length;
    }

    @Override // com.startapp.simple.bloomfilter.codec.BaseNCodec
    public boolean isInAlphabet(byte b4) {
        if (b4 < 0) {
            return false;
        }
        byte[] bArr = this.decodeTable;
        return b4 < bArr.length && bArr[b4] != -1;
    }

    public Base64(boolean z) {
        this(76, CHUNK_SEPARATOR, z);
    }

    public static byte[] encodeBase64(byte[] bArr, boolean z, boolean z4) {
        return encodeBase64(bArr, z, z4, Integer.MAX_VALUE);
    }

    public Base64(int i4) {
        this(i4, CHUNK_SEPARATOR);
    }

    public static byte[] encodeBase64(byte[] bArr, boolean z, boolean z4, int i4) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        Base64 base64 = z ? new Base64(z4) : new Base64(0, CHUNK_SEPARATOR, z4);
        long encodedLength = base64.getEncodedLength(bArr);
        if (encodedLength <= i4) {
            return base64.encode(bArr);
        }
        throw new IllegalArgumentException("Input array too big, the output array would be bigger (" + encodedLength + ") than the specified maximum size of " + i4);
    }

    public Base64(int i4, byte[] bArr) {
        this(i4, bArr, false);
    }

    public Base64(int i4, byte[] bArr, boolean z) {
        super(3, 4, i4, bArr == null ? 0 : bArr.length);
        this.decodeTable = DECODE_TABLE;
        if (bArr != null) {
            if (containsAlphabetOrPad(bArr)) {
                throw new IllegalArgumentException(AbstractC1514c.a("lineSeparator must not contain base64 characters: [", StringUtils.newStringUtf8(bArr), "]"));
            }
            if (i4 > 0) {
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
}
