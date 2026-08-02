package org.apache.commons.imaging.formats.pnm;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.InputStream;
import org.apache.commons.imaging.ImageFormat;
import org.apache.commons.imaging.ImageFormats;
import org.apache.commons.imaging.ImageInfo;
import org.apache.commons.imaging.ImageReadException;

/* loaded from: classes9.dex */
class PpmFileInfo extends FileInfo {
    private final int bytesPerSample;
    private final int max;
    private final float scale;

    public PpmFileInfo(int i, int i2, boolean z, int i3) {
        super(i, i2, z);
        if (i3 <= 0) {
            throw new ImageReadException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i3, "PPM maxVal ", " is out of range [1;65535]"));
        }
        if (i3 <= 255) {
            this.scale = 255.0f;
            this.bytesPerSample = 1;
        } else {
            if (i3 > 65535) {
                throw new ImageReadException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i3, "PPM maxVal ", " is out of range [1;65535]"));
            }
            this.scale = 65535.0f;
            this.bytesPerSample = 2;
        }
        this.max = i3;
    }

    @Override // org.apache.commons.imaging.formats.pnm.FileInfo
    public int getBitDepth() {
        return this.max;
    }

    @Override // org.apache.commons.imaging.formats.pnm.FileInfo
    public ImageInfo.ColorType getColorType() {
        return ImageInfo.ColorType.RGB;
    }

    @Override // org.apache.commons.imaging.formats.pnm.FileInfo
    public ImageFormat getImageType() {
        return ImageFormats.PPM;
    }

    @Override // org.apache.commons.imaging.formats.pnm.FileInfo
    public String getImageTypeDescription() {
        return "PPM: portable pixmap file format";
    }

    @Override // org.apache.commons.imaging.formats.pnm.FileInfo
    public String getMIMEType() {
        return "image/x-portable-pixmap";
    }

    @Override // org.apache.commons.imaging.formats.pnm.FileInfo
    public int getNumComponents() {
        return 3;
    }

    @Override // org.apache.commons.imaging.formats.pnm.FileInfo
    public int getRGB(WhiteSpaceReader whiteSpaceReader) {
        int parseInt = Integer.parseInt(whiteSpaceReader.readtoWhiteSpace());
        int parseInt2 = Integer.parseInt(whiteSpaceReader.readtoWhiteSpace());
        int parseInt3 = Integer.parseInt(whiteSpaceReader.readtoWhiteSpace());
        int scaleSample = FileInfo.scaleSample(parseInt, this.scale, this.max);
        int scaleSample2 = FileInfo.scaleSample(parseInt2, this.scale, this.max);
        return (FileInfo.scaleSample(parseInt3, this.scale, this.max) & 255) | ((scaleSample & 255) << 16) | (-16777216) | ((scaleSample2 & 255) << 8);
    }

    @Override // org.apache.commons.imaging.formats.pnm.FileInfo
    public boolean hasAlpha() {
        return false;
    }

    @Override // org.apache.commons.imaging.formats.pnm.FileInfo
    public int getRGB(InputStream inputStream) {
        int readSample = FileInfo.readSample(inputStream, this.bytesPerSample);
        int readSample2 = FileInfo.readSample(inputStream, this.bytesPerSample);
        int readSample3 = FileInfo.readSample(inputStream, this.bytesPerSample);
        int scaleSample = FileInfo.scaleSample(readSample, this.scale, this.max);
        int scaleSample2 = FileInfo.scaleSample(readSample2, this.scale, this.max);
        return (FileInfo.scaleSample(readSample3, this.scale, this.max) & 255) | ((scaleSample & 255) << 16) | (-16777216) | ((scaleSample2 & 255) << 8);
    }
}
