package com.google.zxing.aztec.encoder;

import com.google.zxing.common.BitArray;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes4.dex */
final class State {
    static final State INITIAL_STATE = new State(Token.EMPTY, 0, 0, 0);
    private final int binaryShiftByteCount;
    private final int bitCount;
    private final int mode;
    private final Token token;

    private State(Token token, int i8, int i9, int i10) {
        this.token = token;
        this.mode = i8;
        this.binaryShiftByteCount = i9;
        this.bitCount = i10;
    }

    State addBinaryShiftChar(int i8) {
        Token token = this.token;
        int i9 = this.mode;
        int i10 = this.bitCount;
        if (i9 == 4 || i9 == 2) {
            int i11 = HighLevelEncoder.LATCH_TABLE[i9][0];
            int i12 = 65535 & i11;
            int i13 = i11 >> 16;
            token = token.add(i12, i13);
            i10 += i13;
            i9 = 0;
        }
        int i14 = this.binaryShiftByteCount;
        State state = new State(token, i9, i14 + 1, i10 + ((i14 == 0 || i14 == 31) ? 18 : i14 == 62 ? 9 : 8));
        return state.binaryShiftByteCount == 2078 ? state.endBinaryShift(i8 + 1) : state;
    }

    State endBinaryShift(int i8) {
        int i9 = this.binaryShiftByteCount;
        return i9 == 0 ? this : new State(this.token.addBinaryShift(i8 - i9, i9), this.mode, 0, this.bitCount);
    }

    int getBinaryShiftByteCount() {
        return this.binaryShiftByteCount;
    }

    int getBitCount() {
        return this.bitCount;
    }

    int getMode() {
        return this.mode;
    }

    Token getToken() {
        return this.token;
    }

    boolean isBetterThanOrEqualTo(State state) {
        int i8;
        int i9 = this.bitCount + (HighLevelEncoder.LATCH_TABLE[this.mode][state.mode] >> 16);
        int i10 = state.binaryShiftByteCount;
        if (i10 > 0 && ((i8 = this.binaryShiftByteCount) == 0 || i8 > i10)) {
            i9 += 10;
        }
        return i9 <= state.bitCount;
    }

    State latchAndAppend(int i8, int i9) {
        int i10 = this.bitCount;
        Token token = this.token;
        int i11 = this.mode;
        if (i8 != i11) {
            int i12 = HighLevelEncoder.LATCH_TABLE[i11][i8];
            int i13 = 65535 & i12;
            int i14 = i12 >> 16;
            token = token.add(i13, i14);
            i10 += i14;
        }
        int i15 = i8 == 2 ? 4 : 5;
        return new State(token.add(i9, i15), i8, 0, i10 + i15);
    }

    State shiftAndAppend(int i8, int i9) {
        Token token = this.token;
        int i10 = this.mode;
        int i11 = i10 == 2 ? 4 : 5;
        return new State(token.add(HighLevelEncoder.SHIFT_TABLE[i10][i8], i11).add(i9, 5), this.mode, 0, this.bitCount + i11 + 5);
    }

    BitArray toBitArray(byte[] bArr) {
        LinkedList linkedList = new LinkedList();
        for (Token token = endBinaryShift(bArr.length).token; token != null; token = token.getPrevious()) {
            linkedList.addFirst(token);
        }
        BitArray bitArray = new BitArray();
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            ((Token) it.next()).appendTo(bitArray, bArr);
        }
        return bitArray;
    }

    public String toString() {
        return String.format("%s bits=%d bytes=%d", HighLevelEncoder.MODE_NAMES[this.mode], Integer.valueOf(this.bitCount), Integer.valueOf(this.binaryShiftByteCount));
    }
}
