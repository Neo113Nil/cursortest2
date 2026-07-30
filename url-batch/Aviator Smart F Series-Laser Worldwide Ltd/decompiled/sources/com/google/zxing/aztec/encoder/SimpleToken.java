package com.google.zxing.aztec.encoder;

import com.google.zxing.common.BitArray;

/* loaded from: classes4.dex */
final class SimpleToken extends Token {
    private final short bitCount;
    private final short value;

    SimpleToken(Token token, int i8, int i9) {
        super(token);
        this.value = (short) i8;
        this.bitCount = (short) i9;
    }

    @Override // com.google.zxing.aztec.encoder.Token
    void appendTo(BitArray bitArray, byte[] bArr) {
        bitArray.appendBits(this.value, this.bitCount);
    }

    public String toString() {
        short s7 = this.value;
        short s8 = this.bitCount;
        return "<" + Integer.toBinaryString((s7 & ((1 << s8) - 1)) | (1 << s8) | (1 << this.bitCount)).substring(1) + '>';
    }
}
