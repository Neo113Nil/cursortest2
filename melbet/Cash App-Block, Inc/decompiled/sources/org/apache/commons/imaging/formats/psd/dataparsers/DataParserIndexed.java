package org.apache.commons.imaging.formats.psd.dataparsers;

import org.apache.commons.imaging.formats.psd.PsdImageContents;

/* loaded from: classes9.dex */
public class DataParserIndexed extends DataParser {
    private final int[] colorTable = new int[256];

    public DataParserIndexed(byte[] bArr) {
        for (int i = 0; i < 256; i++) {
            this.colorTable[i] = ((bArr[i] & 255) << 16) | (-16777216) | ((bArr[i + 256] & 255) << 8) | (bArr[i + 512] & 255);
        }
    }

    @Override // org.apache.commons.imaging.formats.psd.dataparsers.DataParser
    public int getBasicChannelsCount() {
        return 1;
    }

    @Override // org.apache.commons.imaging.formats.psd.dataparsers.DataParser
    public int getRGB(int[][][] iArr, int i, int i2, PsdImageContents psdImageContents) {
        return this.colorTable[iArr[0][i2][i] & 255];
    }
}
