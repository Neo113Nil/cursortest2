package com.google.zxing.datamatrix.encoder;

import java.util.Arrays;

/* loaded from: classes4.dex */
public class DefaultPlacement {
    private final byte[] bits;
    private final CharSequence codewords;
    private final int numcols;
    private final int numrows;

    public DefaultPlacement(CharSequence charSequence, int i8, int i9) {
        this.codewords = charSequence;
        this.numcols = i8;
        this.numrows = i9;
        byte[] bArr = new byte[i8 * i9];
        this.bits = bArr;
        Arrays.fill(bArr, (byte) -1);
    }

    private void corner1(int i8) {
        module(this.numrows - 1, 0, i8, 1);
        module(this.numrows - 1, 1, i8, 2);
        module(this.numrows - 1, 2, i8, 3);
        module(0, this.numcols - 2, i8, 4);
        module(0, this.numcols - 1, i8, 5);
        module(1, this.numcols - 1, i8, 6);
        module(2, this.numcols - 1, i8, 7);
        module(3, this.numcols - 1, i8, 8);
    }

    private void corner2(int i8) {
        module(this.numrows - 3, 0, i8, 1);
        module(this.numrows - 2, 0, i8, 2);
        module(this.numrows - 1, 0, i8, 3);
        module(0, this.numcols - 4, i8, 4);
        module(0, this.numcols - 3, i8, 5);
        module(0, this.numcols - 2, i8, 6);
        module(0, this.numcols - 1, i8, 7);
        module(1, this.numcols - 1, i8, 8);
    }

    private void corner3(int i8) {
        module(this.numrows - 3, 0, i8, 1);
        module(this.numrows - 2, 0, i8, 2);
        module(this.numrows - 1, 0, i8, 3);
        module(0, this.numcols - 2, i8, 4);
        module(0, this.numcols - 1, i8, 5);
        module(1, this.numcols - 1, i8, 6);
        module(2, this.numcols - 1, i8, 7);
        module(3, this.numcols - 1, i8, 8);
    }

    private void corner4(int i8) {
        module(this.numrows - 1, 0, i8, 1);
        module(this.numrows - 1, this.numcols - 1, i8, 2);
        module(0, this.numcols - 3, i8, 3);
        module(0, this.numcols - 2, i8, 4);
        module(0, this.numcols - 1, i8, 5);
        module(1, this.numcols - 3, i8, 6);
        module(1, this.numcols - 2, i8, 7);
        module(1, this.numcols - 1, i8, 8);
    }

    private boolean hasBit(int i8, int i9) {
        return this.bits[(i9 * this.numcols) + i8] >= 0;
    }

    private void module(int i8, int i9, int i10, int i11) {
        if (i8 < 0) {
            int i12 = this.numrows;
            i8 += i12;
            i9 += 4 - ((i12 + 4) % 8);
        }
        if (i9 < 0) {
            int i13 = this.numcols;
            i9 += i13;
            i8 += 4 - ((i13 + 4) % 8);
        }
        setBit(i9, i8, (this.codewords.charAt(i10) & (1 << (8 - i11))) != 0);
    }

    private void setBit(int i8, int i9, boolean z7) {
        this.bits[(i9 * this.numcols) + i8] = z7 ? (byte) 1 : (byte) 0;
    }

    private void utah(int i8, int i9, int i10) {
        int i11 = i8 - 2;
        int i12 = i9 - 2;
        module(i11, i12, i10, 1);
        int i13 = i9 - 1;
        module(i11, i13, i10, 2);
        int i14 = i8 - 1;
        module(i14, i12, i10, 3);
        module(i14, i13, i10, 4);
        module(i14, i9, i10, 5);
        module(i8, i12, i10, 6);
        module(i8, i13, i10, 7);
        module(i8, i9, i10, 8);
    }

    public final boolean getBit(int i8, int i9) {
        return this.bits[(i9 * this.numcols) + i8] == 1;
    }

    final byte[] getBits() {
        return this.bits;
    }

    final int getNumcols() {
        return this.numcols;
    }

    final int getNumrows() {
        return this.numrows;
    }

    public final void place() {
        int i8;
        int i9;
        int i10 = 0;
        int i11 = 0;
        int i12 = 4;
        while (true) {
            if (i12 == this.numrows && i10 == 0) {
                corner1(i11);
                i11++;
            }
            if (i12 == this.numrows - 2 && i10 == 0 && this.numcols % 4 != 0) {
                corner2(i11);
                i11++;
            }
            if (i12 == this.numrows - 2 && i10 == 0 && this.numcols % 8 == 4) {
                corner3(i11);
                i11++;
            }
            if (i12 == this.numrows + 4 && i10 == 2 && this.numcols % 8 == 0) {
                corner4(i11);
                i11++;
            }
            while (true) {
                if (i12 < this.numrows && i10 >= 0 && !hasBit(i10, i12)) {
                    utah(i12, i10, i11);
                    i11++;
                }
                int i13 = i12 - 2;
                int i14 = i10 + 2;
                if (i13 < 0 || i14 >= this.numcols) {
                    break;
                }
                i12 = i13;
                i10 = i14;
            }
            int i15 = i12 - 1;
            int i16 = i10 + 5;
            while (true) {
                if (i15 >= 0 && i16 < this.numcols && !hasBit(i16, i15)) {
                    utah(i15, i16, i11);
                    i11++;
                }
                int i17 = i15 + 2;
                int i18 = i16 - 2;
                i8 = this.numrows;
                if (i17 >= i8 || i18 < 0) {
                    break;
                }
                i15 = i17;
                i16 = i18;
            }
            i12 = i15 + 5;
            i10 = i16 - 1;
            if (i12 >= i8 && i10 >= (i9 = this.numcols)) {
                break;
            }
        }
        if (hasBit(i9 - 1, i8 - 1)) {
            return;
        }
        setBit(this.numcols - 1, this.numrows - 1, true);
        setBit(this.numcols - 2, this.numrows - 2, true);
    }
}
