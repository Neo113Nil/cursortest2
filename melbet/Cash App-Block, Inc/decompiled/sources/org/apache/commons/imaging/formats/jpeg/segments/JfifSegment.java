package org.apache.commons.imaging.formats.jpeg.segments;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;
import org.apache.commons.imaging.common.BinaryConstant;
import org.apache.commons.imaging.common.BinaryFunctions;
import org.apache.commons.imaging.formats.jpeg.JpegConstants;

/* loaded from: classes9.dex */
public class JfifSegment extends Segment {
    public final int densityUnits;
    public final int jfifMajorVersion;
    public final int jfifMinorVersion;
    public final int thumbnailSize;
    public final int xDensity;
    public final int xThumbnail;
    public final int yDensity;
    public final int yThumbnail;

    public JfifSegment(int i, int i2, InputStream inputStream) {
        super(i, i2);
        BinaryConstant binaryConstant = JpegConstants.JFIF0_SIGNATURE;
        byte[] readBytes = BinaryFunctions.readBytes(inputStream, binaryConstant.size());
        if (!binaryConstant.equals(readBytes) && !JpegConstants.JFIF0_SIGNATURE_ALTERNATIVE.equals(readBytes)) {
            f$$ExternalSyntheticLambda0.m("Not a Valid JPEG File: missing JFIF string");
            throw null;
        }
        this.jfifMajorVersion = BinaryFunctions.readByte("JFIF_major_version", inputStream, "Not a Valid JPEG File");
        this.jfifMinorVersion = BinaryFunctions.readByte("JFIF_minor_version", inputStream, "Not a Valid JPEG File");
        this.densityUnits = BinaryFunctions.readByte("density_units", inputStream, "Not a Valid JPEG File");
        this.xDensity = BinaryFunctions.read2Bytes("x_density", inputStream, "Not a Valid JPEG File", getByteOrder());
        this.yDensity = BinaryFunctions.read2Bytes("y_density", inputStream, "Not a Valid JPEG File", getByteOrder());
        byte readByte = BinaryFunctions.readByte("x_thumbnail", inputStream, "Not a Valid JPEG File");
        this.xThumbnail = readByte;
        byte readByte2 = BinaryFunctions.readByte("y_thumbnail", inputStream, "Not a Valid JPEG File");
        this.yThumbnail = readByte2;
        int i3 = readByte * readByte2;
        this.thumbnailSize = i3;
        if (i3 > 0) {
            BinaryFunctions.skipBytes(inputStream, i3, "Not a Valid JPEG File: missing thumbnail");
        }
    }

    @Override // org.apache.commons.imaging.formats.jpeg.segments.Segment
    public String getDescription() {
        return "JFIF (" + getSegmentType() + ")";
    }

    public JfifSegment(int i, byte[] bArr) {
        this(i, bArr.length, new ByteArrayInputStream(bArr));
    }
}
