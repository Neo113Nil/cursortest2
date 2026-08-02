package org.apache.commons.imaging.formats.jpeg.xmp;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.imaging.ImageWriteException;
import org.apache.commons.imaging.common.BinaryFileParser;
import org.apache.commons.imaging.common.BinaryFunctions;
import org.apache.commons.imaging.common.ByteConversions;
import org.apache.commons.imaging.common.bytesource.ByteSource;
import org.apache.commons.imaging.formats.jpeg.JpegConstants;
import org.apache.commons.imaging.formats.jpeg.JpegUtils;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcParser;
import org.apache.commons.imaging.formats.jpeg.xmp.JpegRewriter;
import org.apache.commons.imaging.palette.ColorGroup$$ExternalSyntheticBUOutline0;

/* loaded from: classes9.dex */
public class JpegRewriter extends BinaryFileParser {
    private static final SegmentFilter EXIF_SEGMENT_FILTER;
    private static final ByteOrder JPEG_BYTE_ORDER = ByteOrder.BIG_ENDIAN;
    private static final SegmentFilter PHOTOSHOP_APP13_SEGMENT_FILTER;
    private static final SegmentFilter XMP_SEGMENT_FILTER;

    public static abstract class JFIFPiece {
        public String toString() {
            return "[" + getClass().getName() + "]";
        }

        public abstract void write(OutputStream outputStream);
    }

    public static class JFIFPieceImageData extends JFIFPiece {
        private final byte[] imageData;
        private final byte[] markerBytes;

        public JFIFPieceImageData(byte[] bArr, byte[] bArr2) {
            this.markerBytes = bArr;
            this.imageData = bArr2;
        }

        @Override // org.apache.commons.imaging.formats.jpeg.xmp.JpegRewriter.JFIFPiece
        public void write(OutputStream outputStream) {
            outputStream.write(this.markerBytes);
            outputStream.write(this.imageData);
        }
    }

    public static class JFIFPieces {
        public final List<JFIFPiece> pieces;
        public final List<JFIFPiece> segmentPieces;

        public JFIFPieces(List<JFIFPiece> list, List<JFIFPiece> list2) {
            this.pieces = list;
            this.segmentPieces = list2;
        }
    }

    public static class JpegSegmentOverflowException extends ImageWriteException {
        private static final long serialVersionUID = -1062145751550646846L;

        public JpegSegmentOverflowException(String str) {
            super(str);
        }
    }

    public interface SegmentFilter {
        boolean filter(JFIFPieceSegment jFIFPieceSegment);
    }

    static {
        final int i = 0;
        EXIF_SEGMENT_FILTER = new SegmentFilter() { // from class: org.apache.commons.imaging.formats.jpeg.xmp.JpegRewriter$$ExternalSyntheticLambda0
            @Override // org.apache.commons.imaging.formats.jpeg.xmp.JpegRewriter.SegmentFilter
            public final boolean filter(JpegRewriter.JFIFPieceSegment jFIFPieceSegment) {
                boolean isExifSegment;
                boolean isXmpSegment;
                boolean isPhotoshopApp13Segment;
                switch (i) {
                    case 0:
                        isExifSegment = jFIFPieceSegment.isExifSegment();
                        return isExifSegment;
                    case 1:
                        isXmpSegment = jFIFPieceSegment.isXmpSegment();
                        return isXmpSegment;
                    default:
                        isPhotoshopApp13Segment = jFIFPieceSegment.isPhotoshopApp13Segment();
                        return isPhotoshopApp13Segment;
                }
            }
        };
        final int i2 = 1;
        XMP_SEGMENT_FILTER = new SegmentFilter() { // from class: org.apache.commons.imaging.formats.jpeg.xmp.JpegRewriter$$ExternalSyntheticLambda0
            @Override // org.apache.commons.imaging.formats.jpeg.xmp.JpegRewriter.SegmentFilter
            public final boolean filter(JpegRewriter.JFIFPieceSegment jFIFPieceSegment) {
                boolean isExifSegment;
                boolean isXmpSegment;
                boolean isPhotoshopApp13Segment;
                switch (i2) {
                    case 0:
                        isExifSegment = jFIFPieceSegment.isExifSegment();
                        return isExifSegment;
                    case 1:
                        isXmpSegment = jFIFPieceSegment.isXmpSegment();
                        return isXmpSegment;
                    default:
                        isPhotoshopApp13Segment = jFIFPieceSegment.isPhotoshopApp13Segment();
                        return isPhotoshopApp13Segment;
                }
            }
        };
        final int i3 = 2;
        PHOTOSHOP_APP13_SEGMENT_FILTER = new SegmentFilter() { // from class: org.apache.commons.imaging.formats.jpeg.xmp.JpegRewriter$$ExternalSyntheticLambda0
            @Override // org.apache.commons.imaging.formats.jpeg.xmp.JpegRewriter.SegmentFilter
            public final boolean filter(JpegRewriter.JFIFPieceSegment jFIFPieceSegment) {
                boolean isExifSegment;
                boolean isXmpSegment;
                boolean isPhotoshopApp13Segment;
                switch (i3) {
                    case 0:
                        isExifSegment = jFIFPieceSegment.isExifSegment();
                        return isExifSegment;
                    case 1:
                        isXmpSegment = jFIFPieceSegment.isXmpSegment();
                        return isXmpSegment;
                    default:
                        isPhotoshopApp13Segment = jFIFPieceSegment.isPhotoshopApp13Segment();
                        return isPhotoshopApp13Segment;
                }
            }
        };
    }

    public JpegRewriter() {
        setByteOrder(JPEG_BYTE_ORDER);
    }

    public JFIFPieces analyzeJFIF(ByteSource byteSource) {
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        new JpegUtils().traverseJFIF(byteSource, new JpegUtils.Visitor() { // from class: org.apache.commons.imaging.formats.jpeg.xmp.JpegRewriter.1
            @Override // org.apache.commons.imaging.formats.jpeg.JpegUtils.Visitor
            public boolean beginSOS() {
                return true;
            }

            @Override // org.apache.commons.imaging.formats.jpeg.JpegUtils.Visitor
            public void visitSOS(int i, byte[] bArr, byte[] bArr2) {
                arrayList.add(new JFIFPieceImageData(bArr, bArr2));
            }

            @Override // org.apache.commons.imaging.formats.jpeg.JpegUtils.Visitor
            public boolean visitSegment(int i, byte[] bArr, int i2, byte[] bArr2, byte[] bArr3) {
                JFIFPieceSegment jFIFPieceSegment = new JFIFPieceSegment(i, bArr, bArr2, bArr3);
                arrayList.add(jFIFPieceSegment);
                arrayList2.add(jFIFPieceSegment);
                return true;
            }
        });
        return new JFIFPieces(arrayList, arrayList2);
    }

    public <T extends JFIFPiece> List<T> filterSegments(List<T> list, SegmentFilter segmentFilter, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            if (t instanceof JFIFPieceSegment) {
                if (segmentFilter.filter((JFIFPieceSegment) t) ^ (!z)) {
                    arrayList.add(t);
                }
            } else if (!z) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    public <T extends JFIFPiece> List<T> findPhotoshopApp13Segments(List<T> list) {
        return filterSegments(list, PHOTOSHOP_APP13_SEGMENT_FILTER, true);
    }

    public <T extends JFIFPiece, U extends JFIFPiece> List<JFIFPiece> insertAfterLastAppSegments(List<T> list, List<U> list2) {
        int i = -1;
        for (int i2 = 0; i2 < list.size(); i2++) {
            T t = list.get(i2);
            if ((t instanceof JFIFPieceSegment) && ((JFIFPieceSegment) t).isAppSegment()) {
                i = i2;
            }
        }
        ArrayList arrayList = new ArrayList(list);
        if (i != -1) {
            arrayList.addAll(i + 1, list2);
            return arrayList;
        }
        if (list.isEmpty()) {
            ColorGroup$$ExternalSyntheticBUOutline0.m("JPEG file has no APP segments.");
            return null;
        }
        arrayList.addAll(1, list2);
        return arrayList;
    }

    public <T extends JFIFPiece, U extends JFIFPiece> List<JFIFPiece> insertBeforeFirstAppSegments(List<T> list, List<U> list2) {
        int i = -1;
        for (int i2 = 0; i2 < list.size(); i2++) {
            T t = list.get(i2);
            if ((t instanceof JFIFPieceSegment) && ((JFIFPieceSegment) t).isAppSegment() && i == -1) {
                i = i2;
            }
        }
        ArrayList arrayList = new ArrayList(list);
        if (i != -1) {
            arrayList.addAll(i, list2);
            return arrayList;
        }
        ColorGroup$$ExternalSyntheticBUOutline0.m("JPEG file has no APP segments.");
        return null;
    }

    public <T extends JFIFPiece> List<T> removeExifSegments(List<T> list) {
        return filterSegments(list, EXIF_SEGMENT_FILTER);
    }

    public <T extends JFIFPiece> List<T> removePhotoshopApp13Segments(List<T> list) {
        return filterSegments(list, PHOTOSHOP_APP13_SEGMENT_FILTER);
    }

    public <T extends JFIFPiece> List<T> removeXmpSegments(List<T> list) {
        return filterSegments(list, XMP_SEGMENT_FILTER);
    }

    public void writeSegments(OutputStream outputStream, List<? extends JFIFPiece> list) {
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        try {
            JpegConstants.SOI.writeTo(dataOutputStream);
            Iterator<? extends JFIFPiece> it = list.iterator();
            while (it.hasNext()) {
                it.next().write(dataOutputStream);
            }
            dataOutputStream.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    public static class JFIFPieceSegment extends JFIFPiece {
        public final int marker;
        private final byte[] markerBytes;
        private final byte[] segmentData;
        private final byte[] segmentLengthBytes;

        public JFIFPieceSegment(int i, byte[] bArr) {
            this(i, ByteConversions.toBytes((short) i, JpegRewriter.JPEG_BYTE_ORDER), ByteConversions.toBytes((short) (bArr.length + 2), JpegRewriter.JPEG_BYTE_ORDER), bArr);
        }

        public byte[] getSegmentData() {
            return (byte[]) this.segmentData.clone();
        }

        public boolean isApp1Segment() {
            return this.marker == 65505;
        }

        public boolean isAppSegment() {
            int i = this.marker;
            return i >= 65504 && i <= 65519;
        }

        public boolean isExifSegment() {
            return this.marker == 65505 && BinaryFunctions.startsWith(this.segmentData, JpegConstants.EXIF_IDENTIFIER_CODE);
        }

        public boolean isPhotoshopApp13Segment() {
            return this.marker == 65517 && new IptcParser().isPhotoshopJpegSegment(this.segmentData);
        }

        public boolean isXmpSegment() {
            return this.marker == 65505 && BinaryFunctions.startsWith(this.segmentData, JpegConstants.XMP_IDENTIFIER);
        }

        @Override // org.apache.commons.imaging.formats.jpeg.xmp.JpegRewriter.JFIFPiece
        public String toString() {
            return "[" + getClass().getName() + " (0x" + Integer.toHexString(this.marker) + ")]";
        }

        @Override // org.apache.commons.imaging.formats.jpeg.xmp.JpegRewriter.JFIFPiece
        public void write(OutputStream outputStream) {
            outputStream.write(this.markerBytes);
            outputStream.write(this.segmentLengthBytes);
            outputStream.write(this.segmentData);
        }

        public JFIFPieceSegment(int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
            this.marker = i;
            this.markerBytes = bArr;
            this.segmentLengthBytes = bArr2;
            this.segmentData = (byte[]) bArr3.clone();
        }
    }

    public <T extends JFIFPiece> List<T> filterSegments(List<T> list, SegmentFilter segmentFilter) {
        return filterSegments(list, segmentFilter, false);
    }
}
