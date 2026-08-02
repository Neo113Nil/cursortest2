package org.apache.commons.imaging.formats.psd.datareaders;

import java.awt.image.BufferedImage;
import java.io.InputStream;
import org.apache.commons.imaging.common.BinaryFileParser;
import org.apache.commons.imaging.formats.psd.PsdImageContents;

/* loaded from: classes9.dex */
public interface DataReader {
    void readData(InputStream inputStream, BufferedImage bufferedImage, PsdImageContents psdImageContents, BinaryFileParser binaryFileParser);
}
