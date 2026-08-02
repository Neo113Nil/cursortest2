package org.apache.commons.imaging.formats.psd.dataparsers;

import org.apache.commons.imaging.formats.psd.PsdImageContents;

/* loaded from: classes9.dex */
public class DataParserGrayscale extends DataParser {
    @Override // org.apache.commons.imaging.formats.psd.dataparsers.DataParser
    public int getBasicChannelsCount() {
        return 1;
    }

    @Override // org.apache.commons.imaging.formats.psd.dataparsers.DataParser
    public int getRGB(int[][][] iArr, int i, int i2, PsdImageContents psdImageContents) {
        int i3 = iArr[0][i2][i] & 255;
        return i3 | (i3 << 16) | (-16777216) | (i3 << 8);
    }
}
