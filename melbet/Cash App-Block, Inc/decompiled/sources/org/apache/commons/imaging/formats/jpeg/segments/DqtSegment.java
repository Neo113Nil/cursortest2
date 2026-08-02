package org.apache.commons.imaging.formats.jpeg.segments;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.common.BinaryFunctions;

/* loaded from: classes9.dex */
public class DqtSegment extends Segment {
    public final List<QuantizationTable> quantizationTables;

    public static class QuantizationTable {
        public final int destinationIdentifier;
        private final int[] elements;
        public final int precision;

        public QuantizationTable(int i, int i2, int[] iArr) {
            this.precision = i;
            this.destinationIdentifier = i2;
            this.elements = iArr;
        }

        public int[] getElements() {
            return this.elements;
        }
    }

    public DqtSegment(int i, int i2, InputStream inputStream) {
        super(i, i2);
        this.quantizationTables = new ArrayList();
        while (i2 > 0) {
            byte readByte = BinaryFunctions.readByte("QuantizationTablePrecisionAndDestination", inputStream, "Not a Valid JPEG File");
            i2--;
            int i3 = (readByte >> 4) & 15;
            int i4 = readByte & 15;
            int[] iArr = new int[64];
            for (int i5 = 0; i5 < 64; i5++) {
                if (i3 == 0) {
                    iArr[i5] = BinaryFunctions.readByte("QuantizationTableElement", inputStream, "Not a Valid JPEG File") & 255;
                    i2--;
                } else {
                    if (i3 != 1) {
                        throw new ImageReadException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i3, "Quantization table precision '", "' is invalid"));
                    }
                    iArr[i5] = BinaryFunctions.read2Bytes("QuantizationTableElement", inputStream, "Not a Valid JPEG File", getByteOrder());
                    i2 -= 2;
                }
            }
            this.quantizationTables.add(new QuantizationTable(i3, i4, iArr));
        }
    }

    @Override // org.apache.commons.imaging.formats.jpeg.segments.Segment
    public String getDescription() {
        return "DQT (" + getSegmentType() + ")";
    }

    public DqtSegment(int i, byte[] bArr) {
        this(i, bArr.length, new ByteArrayInputStream(bArr));
    }
}
