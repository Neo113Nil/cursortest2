package org.apache.commons.imaging.formats.png.chunks;

import java.io.ByteArrayInputStream;
import org.apache.commons.imaging.common.BinaryFileParser;

/* loaded from: classes9.dex */
public class PngChunk extends BinaryFileParser {
    public final boolean ancillary;
    private final byte[] bytes;
    public final int chunkType;
    public final int crc;
    public final boolean isPrivate;
    public final int length;
    private final boolean[] propertyBits = new boolean[4];
    public final boolean reserved;
    public final boolean safeToCopy;

    public PngChunk(int i, int i2, int i3, byte[] bArr) {
        this.length = i;
        this.chunkType = i2;
        this.crc = i3;
        this.bytes = (byte[]) bArr.clone();
        int i4 = 24;
        int i5 = 0;
        while (true) {
            boolean[] zArr = this.propertyBits;
            boolean z = true;
            if (i5 >= 4) {
                this.ancillary = zArr[0];
                this.isPrivate = zArr[1];
                this.reserved = zArr[2];
                this.safeToCopy = zArr[3];
                return;
            }
            int i6 = i2 >> i4;
            i4 -= 8;
            if ((i6 & 32) <= 0) {
                z = false;
            }
            zArr[i5] = z;
            i5++;
        }
    }

    public byte[] getBytes() {
        return (byte[]) this.bytes.clone();
    }

    public ByteArrayInputStream getDataStream() {
        return new ByteArrayInputStream(getBytes());
    }

    public boolean[] getPropertyBits() {
        return (boolean[]) this.propertyBits.clone();
    }
}
