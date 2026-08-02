package org.apache.commons.imaging.formats.png.transparencyfilters;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import org.apache.commons.imaging.ImageReadException;

/* loaded from: classes9.dex */
public class TransparencyFilterIndexedColor extends TransparencyFilter {
    public TransparencyFilterIndexedColor(byte[] bArr) {
        super(bArr);
    }

    @Override // org.apache.commons.imaging.formats.png.transparencyfilters.TransparencyFilter
    public int filter(int i, int i2) {
        int length = getLength();
        if (i2 >= length) {
            return i;
        }
        if (i2 < 0 || i2 > length) {
            throw new ImageReadException(Recorder$$ExternalSyntheticOutline2.m("TransparencyFilterIndexedColor index: ", i2, length, ", bytes.length: "));
        }
        return ((getByte(i2) & 255) << 24) | (i & 16777215);
    }
}
