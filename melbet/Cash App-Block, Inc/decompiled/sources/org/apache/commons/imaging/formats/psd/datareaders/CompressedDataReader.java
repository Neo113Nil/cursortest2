package org.apache.commons.imaging.formats.psd.datareaders;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.nio.ByteOrder;
import org.apache.commons.imaging.common.BinaryFileParser;
import org.apache.commons.imaging.common.BinaryFunctions;
import org.apache.commons.imaging.common.PackBits;
import org.apache.commons.imaging.common.mylzw.BitsToByteInputStream;
import org.apache.commons.imaging.common.mylzw.MyBitInputStream;
import org.apache.commons.imaging.formats.psd.PsdHeaderInfo;
import org.apache.commons.imaging.formats.psd.PsdImageContents;
import org.apache.commons.imaging.formats.psd.dataparsers.DataParser;

/* loaded from: classes9.dex */
public class CompressedDataReader implements DataReader {
    private final DataParser dataParser;

    public CompressedDataReader(DataParser dataParser) {
        this.dataParser = dataParser;
    }

    @Override // org.apache.commons.imaging.formats.psd.datareaders.DataReader
    public void readData(InputStream inputStream, BufferedImage bufferedImage, PsdImageContents psdImageContents, BinaryFileParser binaryFileParser) {
        PsdHeaderInfo psdHeaderInfo = psdImageContents.header;
        int i = psdHeaderInfo.columns;
        int i2 = psdHeaderInfo.rows;
        int i3 = psdHeaderInfo.channels * i2;
        int[] iArr = new int[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            iArr[i4] = BinaryFunctions.read2Bytes(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i4, "scanline_bytecount[", "]"), inputStream, "PSD: bad Image Data", binaryFileParser.getByteOrder());
        }
        int i5 = psdHeaderInfo.depth;
        int basicChannelsCount = this.dataParser.getBasicChannelsCount();
        int[][][] iArr2 = (int[][][]) Array.newInstance((Class<?>) int[].class, basicChannelsCount, i2);
        for (int i6 = 0; i6 < basicChannelsCount; i6++) {
            for (int i7 = 0; i7 < i2; i7++) {
                BitsToByteInputStream bitsToByteInputStream = new BitsToByteInputStream(new MyBitInputStream(new ByteArrayInputStream(new PackBits().decompress(BinaryFunctions.readBytes("scanline", inputStream, iArr[(i6 * i2) + i7], "PSD: Missing Image Data"), i)), ByteOrder.BIG_ENDIAN), 8);
                try {
                    iArr2[i6][i7] = bitsToByteInputStream.readBitsArray(i5, i);
                    bitsToByteInputStream.close();
                } finally {
                }
            }
        }
        this.dataParser.parseData(iArr2, bufferedImage, psdImageContents);
    }
}
