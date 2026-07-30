package com.google.zxing.aztec.encoder;

import com.google.zxing.common.BitArray;

/* loaded from: classes4.dex */
final class BinaryShiftToken extends Token {
    private final short binaryShiftByteCount;
    private final short binaryShiftStart;

    BinaryShiftToken(Token token, int i8, int i9) {
        super(token);
        this.binaryShiftStart = (short) i8;
        this.binaryShiftByteCount = (short) i9;
    }

    @Override // com.google.zxing.aztec.encoder.Token
    public void appendTo(BitArray bitArray, byte[] bArr) {
        int i8 = 0;
        while (true) {
            short s7 = this.binaryShiftByteCount;
            if (i8 >= s7) {
                return;
            }
            if (i8 == 0 || (i8 == 31 && s7 <= 62)) {
                bitArray.appendBits(31, 5);
                short s8 = this.binaryShiftByteCount;
                if (s8 > 62) {
                    bitArray.appendBits(s8 - 31, 16);
                } else if (i8 == 0) {
                    bitArray.appendBits(Math.min((int) s8, 31), 5);
                } else {
                    bitArray.appendBits(s8 - 31, 5);
                }
            }
            bitArray.appendBits(bArr[this.binaryShiftStart + i8], 8);
            i8++;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append((int) this.binaryShiftStart);
        sb.append("::");
        sb.append((this.binaryShiftStart + this.binaryShiftByteCount) - 1);
        sb.append('>');
        return sb.toString();
    }
}
