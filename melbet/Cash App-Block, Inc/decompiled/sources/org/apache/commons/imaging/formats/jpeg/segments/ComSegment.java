package org.apache.commons.imaging.formats.jpeg.segments;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

/* loaded from: classes9.dex */
public class ComSegment extends GenericSegment {
    public ComSegment(int i, byte[] bArr) {
        super(i, bArr);
    }

    public byte[] getComment() {
        return getSegmentData();
    }

    @Override // org.apache.commons.imaging.formats.jpeg.segments.Segment
    public String getDescription() {
        String str;
        try {
            str = getSegmentDataAsString("UTF-8");
        } catch (UnsupportedEncodingException unused) {
            str = "";
        }
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("COM (", str, ")");
    }

    public ComSegment(int i, int i2, InputStream inputStream) {
        super(i, i2, inputStream);
    }
}
