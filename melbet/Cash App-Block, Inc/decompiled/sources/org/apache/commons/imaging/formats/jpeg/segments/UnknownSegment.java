package org.apache.commons.imaging.formats.jpeg.segments;

import java.io.InputStream;

/* loaded from: classes9.dex */
public class UnknownSegment extends GenericSegment {
    public UnknownSegment(int i, int i2, InputStream inputStream) {
        super(i, i2, inputStream);
    }

    @Override // org.apache.commons.imaging.formats.jpeg.segments.Segment
    public String getDescription() {
        return "Unknown (" + getSegmentType() + ")";
    }

    public UnknownSegment(int i, byte[] bArr) {
        super(i, bArr);
    }
}
