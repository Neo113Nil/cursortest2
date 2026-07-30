package com.google.zxing.common;

import java.util.Arrays;
import okhttp3.internal.ws.WebSocketProtocol;

/* loaded from: classes4.dex */
public final class BitArray implements Cloneable {
    private int[] bits;
    private int size;

    public BitArray() {
        this.size = 0;
        this.bits = new int[1];
    }

    private void ensureCapacity(int i8) {
        if (i8 > (this.bits.length << 5)) {
            int[] makeArray = makeArray(i8);
            int[] iArr = this.bits;
            System.arraycopy(iArr, 0, makeArray, 0, iArr.length);
            this.bits = makeArray;
        }
    }

    private static int[] makeArray(int i8) {
        return new int[(i8 + 31) / 32];
    }

    public void appendBit(boolean z7) {
        ensureCapacity(this.size + 1);
        if (z7) {
            int[] iArr = this.bits;
            int i8 = this.size;
            int i9 = i8 / 32;
            iArr[i9] = (1 << (i8 & 31)) | iArr[i9];
        }
        this.size++;
    }

    public void appendBitArray(BitArray bitArray) {
        int i8 = bitArray.size;
        ensureCapacity(this.size + i8);
        for (int i9 = 0; i9 < i8; i9++) {
            appendBit(bitArray.get(i9));
        }
    }

    public void appendBits(int i8, int i9) {
        if (i9 < 0 || i9 > 32) {
            throw new IllegalArgumentException("Num bits must be between 0 and 32");
        }
        ensureCapacity(this.size + i9);
        while (i9 > 0) {
            boolean z7 = true;
            if (((i8 >> (i9 - 1)) & 1) != 1) {
                z7 = false;
            }
            appendBit(z7);
            i9--;
        }
    }

    public void clear() {
        int length = this.bits.length;
        for (int i8 = 0; i8 < length; i8++) {
            this.bits[i8] = 0;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BitArray)) {
            return false;
        }
        BitArray bitArray = (BitArray) obj;
        return this.size == bitArray.size && Arrays.equals(this.bits, bitArray.bits);
    }

    public void flip(int i8) {
        int[] iArr = this.bits;
        int i9 = i8 / 32;
        iArr[i9] = (1 << (i8 & 31)) ^ iArr[i9];
    }

    public boolean get(int i8) {
        return ((1 << (i8 & 31)) & this.bits[i8 / 32]) != 0;
    }

    public int[] getBitArray() {
        return this.bits;
    }

    public int getNextSet(int i8) {
        int i9 = this.size;
        if (i8 >= i9) {
            return i9;
        }
        int i10 = i8 / 32;
        int i11 = (~((1 << (i8 & 31)) - 1)) & this.bits[i10];
        while (i11 == 0) {
            i10++;
            int[] iArr = this.bits;
            if (i10 == iArr.length) {
                return this.size;
            }
            i11 = iArr[i10];
        }
        int numberOfTrailingZeros = (i10 << 5) + Integer.numberOfTrailingZeros(i11);
        int i12 = this.size;
        return numberOfTrailingZeros > i12 ? i12 : numberOfTrailingZeros;
    }

    public int getNextUnset(int i8) {
        int i9 = this.size;
        if (i8 >= i9) {
            return i9;
        }
        int i10 = i8 / 32;
        int i11 = (~((1 << (i8 & 31)) - 1)) & (~this.bits[i10]);
        while (i11 == 0) {
            i10++;
            int[] iArr = this.bits;
            if (i10 == iArr.length) {
                return this.size;
            }
            i11 = ~iArr[i10];
        }
        int numberOfTrailingZeros = (i10 << 5) + Integer.numberOfTrailingZeros(i11);
        int i12 = this.size;
        return numberOfTrailingZeros > i12 ? i12 : numberOfTrailingZeros;
    }

    public int getSize() {
        return this.size;
    }

    public int getSizeInBytes() {
        return (this.size + 7) / 8;
    }

    public int hashCode() {
        return (this.size * 31) + Arrays.hashCode(this.bits);
    }

    public boolean isRange(int i8, int i9, boolean z7) {
        if (i9 < i8 || i8 < 0 || i9 > this.size) {
            throw new IllegalArgumentException();
        }
        if (i9 == i8) {
            return true;
        }
        int i10 = i9 - 1;
        int i11 = i8 / 32;
        int i12 = i10 / 32;
        int i13 = i11;
        while (i13 <= i12) {
            int i14 = (2 << (i13 >= i12 ? 31 & i10 : 31)) - (1 << (i13 > i11 ? 0 : i8 & 31));
            int i15 = this.bits[i13] & i14;
            if (!z7) {
                i14 = 0;
            }
            if (i15 != i14) {
                return false;
            }
            i13++;
        }
        return true;
    }

    public void reverse() {
        int[] iArr = new int[this.bits.length];
        int i8 = (this.size - 1) / 32;
        int i9 = i8 + 1;
        for (int i10 = 0; i10 < i9; i10++) {
            long j8 = this.bits[i10];
            long j9 = ((j8 & 1431655765) << 1) | ((j8 >> 1) & 1431655765);
            long j10 = ((j9 & 858993459) << 2) | ((j9 >> 2) & 858993459);
            long j11 = ((j10 & 252645135) << 4) | ((j10 >> 4) & 252645135);
            long j12 = ((j11 & 16711935) << 8) | ((j11 >> 8) & 16711935);
            iArr[i8 - i10] = (int) (((j12 & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 16) | ((j12 >> 16) & WebSocketProtocol.PAYLOAD_SHORT_MAX));
        }
        int i11 = this.size;
        int i12 = i9 << 5;
        if (i11 != i12) {
            int i13 = i12 - i11;
            int i14 = iArr[0] >>> i13;
            for (int i15 = 1; i15 < i9; i15++) {
                int i16 = iArr[i15];
                iArr[i15 - 1] = i14 | (i16 << (32 - i13));
                i14 = i16 >>> i13;
            }
            iArr[i8] = i14;
        }
        this.bits = iArr;
    }

    public void set(int i8) {
        int[] iArr = this.bits;
        int i9 = i8 / 32;
        iArr[i9] = (1 << (i8 & 31)) | iArr[i9];
    }

    public void setBulk(int i8, int i9) {
        this.bits[i8 / 32] = i9;
    }

    public void setRange(int i8, int i9) {
        if (i9 < i8 || i8 < 0 || i9 > this.size) {
            throw new IllegalArgumentException();
        }
        if (i9 == i8) {
            return;
        }
        int i10 = i9 - 1;
        int i11 = i8 / 32;
        int i12 = i10 / 32;
        int i13 = i11;
        while (i13 <= i12) {
            int i14 = 31;
            int i15 = i13 > i11 ? 0 : i8 & 31;
            if (i13 >= i12) {
                i14 = 31 & i10;
            }
            int i16 = (2 << i14) - (1 << i15);
            int[] iArr = this.bits;
            iArr[i13] = i16 | iArr[i13];
            i13++;
        }
    }

    public void toBytes(int i8, byte[] bArr, int i9, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = 0;
            for (int i13 = 0; i13 < 8; i13++) {
                if (get(i8)) {
                    i12 |= 1 << (7 - i13);
                }
                i8++;
            }
            bArr[i9 + i11] = (byte) i12;
        }
    }

    public String toString() {
        int i8 = this.size;
        StringBuilder sb = new StringBuilder(i8 + (i8 / 8) + 1);
        for (int i9 = 0; i9 < this.size; i9++) {
            if ((i9 & 7) == 0) {
                sb.append(' ');
            }
            sb.append(get(i9) ? 'X' : '.');
        }
        return sb.toString();
    }

    public void xor(BitArray bitArray) {
        if (this.size != bitArray.size) {
            throw new IllegalArgumentException("Sizes don't match");
        }
        int i8 = 0;
        while (true) {
            int[] iArr = this.bits;
            if (i8 >= iArr.length) {
                return;
            }
            iArr[i8] = iArr[i8] ^ bitArray.bits[i8];
            i8++;
        }
    }

    public BitArray(int i8) {
        this.size = i8;
        this.bits = makeArray(i8);
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public BitArray m163clone() {
        return new BitArray((int[]) this.bits.clone(), this.size);
    }

    BitArray(int[] iArr, int i8) {
        this.bits = iArr;
        this.size = i8;
    }
}
