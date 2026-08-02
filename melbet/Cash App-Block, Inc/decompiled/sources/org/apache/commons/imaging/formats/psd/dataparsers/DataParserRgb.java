package org.apache.commons.imaging.formats.psd.dataparsers;

import org.apache.commons.imaging.formats.psd.PsdImageContents;

/* loaded from: classes9.dex */
public class DataParserRgb extends DataParser {
    @Override // org.apache.commons.imaging.formats.psd.dataparsers.DataParser
    public int getBasicChannelsCount() {
        return 3;
    }

    @Override // org.apache.commons.imaging.formats.psd.dataparsers.DataParser
    public int getRGB(int[][][] iArr, int i, int i2, PsdImageContents psdImageContents) {
        return ((iArr[0][i2][i] & 255) << 16) | (-16777216) | ((iArr[1][i2][i] & 255) << 8) | (iArr[2][i2][i] & 255);
    }
}
