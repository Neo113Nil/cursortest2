package org.apache.commons.imaging.formats.jpeg.segments;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.InputStream;
import java.io.PrintWriter;
import org.apache.commons.imaging.common.BinaryFunctions;

/* loaded from: classes9.dex */
public abstract class GenericSegment extends Segment {
    private final byte[] segmentData;

    public GenericSegment(int i, int i2, InputStream inputStream) {
        super(i, i2);
        this.segmentData = BinaryFunctions.readBytes("Segment Data", inputStream, i2, "Invalid Segment: insufficient data");
    }

    public void dump(PrintWriter printWriter, int i) {
        int i2;
        for (int i3 = 0; i3 < 50 && (i2 = i3 + i) < this.segmentData.length; i3++) {
            debugNumber(printWriter, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i2, "\t"), this.segmentData[i2], 1);
        }
    }

    public byte[] getSegmentData() {
        return (byte[]) this.segmentData.clone();
    }

    public String getSegmentDataAsString(String str) {
        return new String(this.segmentData, str);
    }

    public byte getSegmentData(int i) {
        return this.segmentData[i];
    }

    public GenericSegment(int i, byte[] bArr) {
        super(i, bArr.length);
        this.segmentData = (byte[]) bArr.clone();
    }

    @Override // org.apache.commons.imaging.formats.jpeg.segments.Segment
    public void dump(PrintWriter printWriter) {
        dump(printWriter, 0);
    }
}
