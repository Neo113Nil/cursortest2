package com.google.zxing.aztec.encoder;

import com.google.zxing.common.BitArray;

/* loaded from: classes4.dex */
abstract class Token {
    static final Token EMPTY = new SimpleToken(null, 0, 0);
    private final Token previous;

    Token(Token token) {
        this.previous = token;
    }

    final Token add(int i8, int i9) {
        return new SimpleToken(this, i8, i9);
    }

    final Token addBinaryShift(int i8, int i9) {
        return new BinaryShiftToken(this, i8, i9);
    }

    abstract void appendTo(BitArray bitArray, byte[] bArr);

    final Token getPrevious() {
        return this.previous;
    }
}
