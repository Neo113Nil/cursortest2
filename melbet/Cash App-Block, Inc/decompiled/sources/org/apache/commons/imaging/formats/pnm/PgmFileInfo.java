package org.apache.commons.imaging.formats.pnm;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.InputStream;
import org.apache.commons.imaging.ImageFormat;
import org.apache.commons.imaging.ImageFormats;
import org.apache.commons.imaging.ImageInfo;
import org.apache.commons.imaging.ImageReadException;

/* loaded from: classes9.dex */
class PgmFileInfo extends FileInfo {
    private final int bytesPerSample;
    private final int max;
    private final float scale;

    public PgmFileInfo(int i, int i2, boolean z, int i3) {
        super(i, i2, z);
        if (i3 <= 0) {
            throw new ImageReadException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i3, "PGM maxVal ", " is out of range [1;65535]"));
        }
        if (i3 <= 255) {
            this.scale = 255.0f;
            this.bytesPerSample = 1;
        } else {
            if (i3 > 65535) {
                throw new ImageReadException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i3, "PGM maxVal ", " is out of range [1;65535]"));
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
        return ImageInfo.ColorType.GRAYSCALE;
    }

    @Override // org.apache.commons.imaging.formats.pnm.FileInfo
    public ImageFormat getImageType() {
        return ImageFormats.PGM;
    }

    @Override // org.apache.commons.imaging.formats.pnm.FileInfo
    public String getImageTypeDescription() {
        return "PGM: portable graymap file format";
    }

    @Override // org.apache.commons.imaging.formats.pnm.FileInfo
    public String getMIMEType() {
        return "image/x-portable-graymap";
    }

    @Override // org.apache.commons.imaging.formats.pnm.FileInfo
    public int getNumComponents() {
        return 1;
    }

    @Override // org.apache.commons.imaging.formats.pnm.FileInfo
    public int getRGB(WhiteSpaceReader whiteSpaceReader) {
        int scaleSample = FileInfo.scaleSample(Integer.parseInt(whiteSpaceReader.readtoWhiteSpace()), this.scale, this.max) & 255;
        return scaleSample | (scaleSample << 16) | (-16777216) | (scaleSample << 8);
    }

    @Override // org.apache.commons.imaging.formats.pnm.FileInfo
    public boolean hasAlpha() {
        return false;
    }

    @Override // org.apache.commons.imaging.formats.pnm.FileInfo
    public int getRGB(InputStream inputStream) {
        int scaleSample = FileInfo.scaleSample(FileInfo.readSample(inputStream, this.bytesPerSample), this.scale, this.max) & 255;
        return scaleSample | (scaleSample << 16) | (-16777216) | (scaleSample << 8);
    }
}
