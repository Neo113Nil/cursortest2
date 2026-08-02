package org.apache.commons.imaging.formats.jpeg.segments;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Map;
import org.apache.commons.imaging.formats.jpeg.JpegImageParser;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcParser;
import org.apache.commons.imaging.formats.jpeg.iptc.PhotoshopApp13Data;

/* loaded from: classes9.dex */
public class App13Segment extends AppnSegment {
    public App13Segment(JpegImageParser jpegImageParser, int i, byte[] bArr) {
        this(i, bArr.length, new ByteArrayInputStream(bArr));
    }

    public boolean isPhotoshopJpegSegment() {
        return new IptcParser().isPhotoshopJpegSegment(getSegmentData());
    }

    public PhotoshopApp13Data parsePhotoshopSegment(Map<String, Object> map) {
        if (isPhotoshopJpegSegment()) {
            return new IptcParser().parsePhotoshopSegment(getSegmentData(), map);
        }
        return null;
    }

    public App13Segment(int i, int i2, InputStream inputStream) {
        super(i, i2, inputStream);
    }
}
