package com.google.zxing.aztec.encoder;

import com.google.zxing.common.BitArray;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes4.dex */
public final class HighLevelEncoder {
    private static final int[][] CHAR_MAP;
    static final int MODE_DIGIT = 2;
    static final int MODE_LOWER = 1;
    static final int MODE_MIXED = 3;
    static final int MODE_PUNCT = 4;
    static final int MODE_UPPER = 0;
    static final int[][] SHIFT_TABLE;
    private final byte[] text;
    static final String[] MODE_NAMES = {"UPPER", "LOWER", "DIGIT", "MIXED", "PUNCT"};
    static final int[][] LATCH_TABLE = {new int[]{0, 327708, 327710, 327709, 656318}, new int[]{590318, 0, 327710, 327709, 656318}, new int[]{262158, 590300, 0, 590301, 932798}, new int[]{327709, 327708, 656318, 0, 327710}, new int[]{327711, 656380, 656382, 656381, 0}};

    static {
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 5, 256);
        CHAR_MAP = iArr;
        iArr[0][32] = 1;
        for (int i8 = 65; i8 <= 90; i8++) {
            CHAR_MAP[0][i8] = i8 - 63;
        }
        CHAR_MAP[1][32] = 1;
        for (int i9 = 97; i9 <= 122; i9++) {
            CHAR_MAP[1][i9] = i9 - 95;
        }
        CHAR_MAP[2][32] = 1;
        for (int i10 = 48; i10 <= 57; i10++) {
            CHAR_MAP[2][i10] = i10 - 46;
        }
        int[] iArr2 = CHAR_MAP[2];
        iArr2[44] = 12;
        iArr2[46] = 13;
        int[] iArr3 = {0, 32, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 27, 28, 29, 30, 31, 64, 92, 94, 95, 96, 124, 126, 127};
        for (int i11 = 0; i11 < 28; i11++) {
            CHAR_MAP[3][iArr3[i11]] = i11;
        }
        int[] iArr4 = {0, 13, 0, 0, 0, 0, 33, 39, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 58, 59, 60, 61, 62, 63, 91, 93, 123, 125};
        for (int i12 = 0; i12 < 31; i12++) {
            int i13 = iArr4[i12];
            if (i13 > 0) {
                CHAR_MAP[4][i13] = i12;
            }
        }
        int[][] iArr5 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 6, 6);
        SHIFT_TABLE = iArr5;
        for (int[] iArr6 : iArr5) {
            Arrays.fill(iArr6, -1);
        }
        int[][] iArr7 = SHIFT_TABLE;
        iArr7[0][4] = 0;
        int[] iArr8 = iArr7[1];
        iArr8[4] = 0;
        iArr8[0] = 28;
        iArr7[3][4] = 0;
        int[] iArr9 = iArr7[2];
        iArr9[4] = 0;
        iArr9[0] = 15;
    }

    public HighLevelEncoder(byte[] bArr) {
        this.text = bArr;
    }

    private static Collection<State> simplifyStates(Iterable<State> iterable) {
        LinkedList linkedList = new LinkedList();
        for (State state : iterable) {
            Iterator it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    linkedList.add(state);
                    break;
                }
                State state2 = (State) it.next();
                if (state2.isBetterThanOrEqualTo(state)) {
                    break;
                }
                if (state.isBetterThanOrEqualTo(state2)) {
                    it.remove();
                }
            }
        }
        return linkedList;
    }

    private void updateStateForChar(State state, int i8, Collection<State> collection) {
        char c8 = (char) (this.text[i8] & 255);
        boolean z7 = CHAR_MAP[state.getMode()][c8] > 0;
        State state2 = null;
        for (int i9 = 0; i9 <= 4; i9++) {
            int i10 = CHAR_MAP[i9][c8];
            if (i10 > 0) {
                if (state2 == null) {
                    state2 = state.endBinaryShift(i8);
                }
                if (!z7 || i9 == state.getMode() || i9 == 2) {
                    collection.add(state2.latchAndAppend(i9, i10));
                }
                if (!z7 && SHIFT_TABLE[state.getMode()][i9] >= 0) {
                    collection.add(state2.shiftAndAppend(i9, i10));
                }
            }
        }
        if (state.getBinaryShiftByteCount() > 0 || CHAR_MAP[state.getMode()][c8] == 0) {
            collection.add(state.addBinaryShiftChar(i8));
        }
    }

    private static void updateStateForPair(State state, int i8, int i9, Collection<State> collection) {
        State endBinaryShift = state.endBinaryShift(i8);
        collection.add(endBinaryShift.latchAndAppend(4, i9));
        if (state.getMode() != 4) {
            collection.add(endBinaryShift.shiftAndAppend(4, i9));
        }
        if (i9 == 3 || i9 == 4) {
            collection.add(endBinaryShift.latchAndAppend(2, 16 - i9).latchAndAppend(2, 1));
        }
        if (state.getBinaryShiftByteCount() > 0) {
            collection.add(state.addBinaryShiftChar(i8).addBinaryShiftChar(i8 + 1));
        }
    }

    private Collection<State> updateStateListForChar(Iterable<State> iterable, int i8) {
        LinkedList linkedList = new LinkedList();
        Iterator<State> it = iterable.iterator();
        while (it.hasNext()) {
            updateStateForChar(it.next(), i8, linkedList);
        }
        return simplifyStates(linkedList);
    }

    private static Collection<State> updateStateListForPair(Iterable<State> iterable, int i8, int i9) {
        LinkedList linkedList = new LinkedList();
        Iterator<State> it = iterable.iterator();
        while (it.hasNext()) {
            updateStateForPair(it.next(), i8, i9, linkedList);
        }
        return simplifyStates(linkedList);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BitArray encode() {
        int i8;
        Collection<State> singletonList = Collections.singletonList(State.INITIAL_STATE);
        int i9 = 0;
        while (true) {
            byte[] bArr = this.text;
            if (i9 >= bArr.length) {
                return ((State) Collections.min(singletonList, new Comparator<State>() { // from class: com.google.zxing.aztec.encoder.HighLevelEncoder.1
                    @Override // java.util.Comparator
                    public int compare(State state, State state2) {
                        return state.getBitCount() - state2.getBitCount();
                    }
                })).toBitArray(this.text);
            }
            int i10 = i9 + 1;
            byte b8 = i10 < bArr.length ? bArr[i10] : (byte) 0;
            byte b9 = bArr[i9];
            if (b9 == 13) {
                if (b8 == 10) {
                    i8 = 2;
                    if (i8 <= 0) {
                    }
                    i9++;
                }
                i8 = 0;
                if (i8 <= 0) {
                }
                i9++;
            } else if (b9 == 44) {
                if (b8 == 32) {
                    i8 = 4;
                    if (i8 <= 0) {
                    }
                    i9++;
                }
                i8 = 0;
                if (i8 <= 0) {
                }
                i9++;
            } else if (b9 != 46) {
                if (b9 == 58 && b8 == 32) {
                    i8 = 5;
                    if (i8 <= 0) {
                        singletonList = updateStateListForPair(singletonList, i9, i8);
                        i9 = i10;
                    } else {
                        singletonList = updateStateListForChar(singletonList, i9);
                    }
                    i9++;
                }
                i8 = 0;
                if (i8 <= 0) {
                }
                i9++;
            } else {
                if (b8 == 32) {
                    i8 = 3;
                    if (i8 <= 0) {
                    }
                    i9++;
                }
                i8 = 0;
                if (i8 <= 0) {
                }
                i9++;
            }
        }
    }
}
