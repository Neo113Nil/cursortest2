package org.apache.commons.imaging.formats.png.chunks;

import org.apache.commons.imaging.formats.png.PngText;

/* loaded from: classes9.dex */
public abstract class PngTextChunk extends PngChunk {
    public PngTextChunk(int i, int i2, int i3, byte[] bArr) {
        super(i, i2, i3, bArr);
    }

    public abstract PngText getContents();

    public abstract String getKeyword();

    public abstract String getText();
}
