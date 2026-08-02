package org.apache.commons.imaging.formats.png.transparencyfilters;

import org.apache.commons.imaging.common.BinaryFileParser;

/* loaded from: classes9.dex */
public abstract class TransparencyFilter extends BinaryFileParser {
    private final byte[] bytes;

    public TransparencyFilter(byte[] bArr) {
        this.bytes = (byte[]) bArr.clone();
    }

    public abstract int filter(int i, int i2);

    public byte getByte(int i) {
        return this.bytes[i];
    }

    public int getLength() {
        return this.bytes.length;
    }
}
