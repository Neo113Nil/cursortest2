package com.google.zxing.datamatrix.decoder;

import com.google.zxing.datamatrix.decoder.Version;

/* loaded from: classes4.dex */
final class DataBlock {
    private final byte[] codewords;
    private final int numDataCodewords;

    private DataBlock(int i8, byte[] bArr) {
        this.numDataCodewords = i8;
        this.codewords = bArr;
    }

    static DataBlock[] getDataBlocks(byte[] bArr, Version version) {
        Version.ECBlocks eCBlocks = version.getECBlocks();
        Version.ECB[] eCBlocks2 = eCBlocks.getECBlocks();
        int i8 = 0;
        for (Version.ECB ecb : eCBlocks2) {
            i8 += ecb.getCount();
        }
        DataBlock[] dataBlockArr = new DataBlock[i8];
        int i9 = 0;
        for (Version.ECB ecb2 : eCBlocks2) {
            int i10 = 0;
            while (i10 < ecb2.getCount()) {
                int dataCodewords = ecb2.getDataCodewords();
                dataBlockArr[i9] = new DataBlock(dataCodewords, new byte[eCBlocks.getECCodewords() + dataCodewords]);
                i10++;
                i9++;
            }
        }
        int length = dataBlockArr[0].codewords.length - eCBlocks.getECCodewords();
        int i11 = length - 1;
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            int i14 = 0;
            while (i14 < i9) {
                dataBlockArr[i14].codewords[i13] = bArr[i12];
                i14++;
                i12++;
            }
        }
        boolean z7 = version.getVersionNumber() == 24;
        int i15 = z7 ? 8 : i9;
        int i16 = 0;
        while (i16 < i15) {
            dataBlockArr[i16].codewords[i11] = bArr[i12];
            i16++;
            i12++;
        }
        int length2 = dataBlockArr[0].codewords.length;
        while (length < length2) {
            int i17 = 0;
            while (i17 < i9) {
                int i18 = z7 ? (i17 + 8) % i9 : i17;
                dataBlockArr[i18].codewords[(!z7 || i18 <= 7) ? length : length - 1] = bArr[i12];
                i17++;
                i12++;
            }
            length++;
        }
        if (i12 == bArr.length) {
            return dataBlockArr;
        }
        throw new IllegalArgumentException();
    }

    byte[] getCodewords() {
        return this.codewords;
    }

    int getNumDataCodewords() {
        return this.numDataCodewords;
    }
}
