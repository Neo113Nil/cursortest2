package org.apache.commons.imaging.formats.png.transparencyfilters;

import java.io.ByteArrayInputStream;
import org.apache.commons.imaging.common.BinaryFunctions;

/* loaded from: classes9.dex */
public class TransparencyFilterGrayscale extends TransparencyFilter {
    private final int transparentColor;

    public TransparencyFilterGrayscale(byte[] bArr) {
        super(bArr);
        this.transparentColor = BinaryFunctions.read2Bytes("transparentColor", new ByteArrayInputStream(bArr), "tRNS: Missing transparentColor", getByteOrder());
    }

    @Override // org.apache.commons.imaging.formats.png.transparencyfilters.TransparencyFilter
    public int filter(int i, int i2) {
        if (i2 != this.transparentColor) {
            return i;
        }
        return 0;
    }
}
