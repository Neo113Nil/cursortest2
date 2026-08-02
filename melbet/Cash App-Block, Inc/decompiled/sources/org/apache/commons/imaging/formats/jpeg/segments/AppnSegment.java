package org.apache.commons.imaging.formats.jpeg.segments;

import java.io.InputStream;

/* loaded from: classes9.dex */
public class AppnSegment extends GenericSegment {
    public AppnSegment(int i, int i2, InputStream inputStream) {
        super(i, i2, inputStream);
    }

    @Override // org.apache.commons.imaging.formats.jpeg.segments.Segment
    public String getDescription() {
        return "APPN (APP" + (this.marker - 65504) + ") (" + getSegmentType() + ")";
    }
}
