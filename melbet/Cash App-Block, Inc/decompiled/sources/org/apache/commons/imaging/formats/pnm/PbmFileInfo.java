package org.apache.commons.imaging.formats.pnm;

import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.InputStream;
import org.apache.commons.imaging.ImageFormat;
import org.apache.commons.imaging.ImageFormats;
import org.apache.commons.imaging.ImageInfo;

/* loaded from: classes9.dex */
class PbmFileInfo extends FileInfo {
    private int bitcache;
    private int bitsInCache;

    public PbmFileInfo(int i, int i2, boolean z) {
        super(i, i2, z);
    }

    @Override // org.apache.commons.imaging.formats.pnm.FileInfo
    public int getBitDepth() {
        return 1;
    }

    @Override // org.apache.commons.imaging.formats.pnm.FileInfo
    public ImageInfo.ColorType getColorType() {
        return ImageInfo.ColorType.BW;
    }

    @Override // org.apache.commons.imaging.formats.pnm.FileInfo
    public ImageFormat getImageType() {
        return ImageFormats.PBM;
    }

    @Override // org.apache.commons.imaging.formats.pnm.FileInfo
    public String getImageTypeDescription() {
        return "PBM: portable bitmap fileformat";
    }

    @Override // org.apache.commons.imaging.formats.pnm.FileInfo
    public String getMIMEType() {
        return "image/x-portable-bitmap";
    }

    @Override // org.apache.commons.imaging.formats.pnm.FileInfo
    public int getNumComponents() {
        return 1;
    }

    @Override // org.apache.commons.imaging.formats.pnm.FileInfo
    public int getRGB(InputStream inputStream) {
        if (this.bitsInCache < 1) {
            int read = inputStream.read();
            if (read < 0) {
                a$$ExternalSyntheticBUOutline0.m$4("PBM: Unexpected EOF");
                return 0;
            }
            this.bitcache = read & 255;
            this.bitsInCache += 8;
        }
        int i = this.bitcache;
        int i2 = (i >> 7) & 1;
        this.bitcache = i << 1;
        this.bitsInCache--;
        if (i2 == 0) {
            return -1;
        }
        if (i2 == 1) {
            return -16777216;
        }
        a$$ExternalSyntheticBUOutline0.m$4(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i2, "PBM: bad bit: "));
        return 0;
    }

    @Override // org.apache.commons.imaging.formats.pnm.FileInfo
    public boolean hasAlpha() {
        return false;
    }

    @Override // org.apache.commons.imaging.formats.pnm.FileInfo
    public void newline() {
        this.bitcache = 0;
        this.bitsInCache = 0;
    }

    @Override // org.apache.commons.imaging.formats.pnm.FileInfo
    public int getRGB(WhiteSpaceReader whiteSpaceReader) {
        int parseInt = Integer.parseInt(whiteSpaceReader.readtoWhiteSpace());
        if (parseInt == 0) {
            return -16777216;
        }
        if (parseInt == 1) {
            return -1;
        }
        a$$ExternalSyntheticBUOutline0.m$4(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(parseInt, "PBM: bad bit: "));
        return 0;
    }
}
