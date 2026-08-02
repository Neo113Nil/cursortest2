package org.apache.commons.imaging.common.mylzw;

import java.io.InputStream;

/* loaded from: classes9.dex */
public class BitsToByteInputStream extends InputStream {
    private final int desiredDepth;
    private final MyBitInputStream is;

    public BitsToByteInputStream(MyBitInputStream myBitInputStream, int i) {
        this.is = myBitInputStream;
        this.desiredDepth = i;
    }

    @Override // java.io.InputStream
    public int read() {
        return readBits(8);
    }

    public int readBits(int i) {
        int readBits = this.is.readBits(i);
        int i2 = this.desiredDepth;
        return i < i2 ? readBits << (i2 - i) : i > i2 ? readBits >> (i - i2) : readBits;
    }

    public int[] readBitsArray(int i, int i2) {
        int[] iArr = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            iArr[i3] = readBits(i);
        }
        return iArr;
    }
}
