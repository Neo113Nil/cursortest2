package org.apache.commons.imaging.formats.jpeg.exif;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.InputStream;
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
import org.apache.commons.imaging.common.bytesource.ByteSourceArray;
import org.apache.commons.imaging.common.bytesource.ByteSourceFile;
import org.apache.commons.imaging.common.bytesource.ByteSourceInputStream;
import org.apache.commons.imaging.formats.jpeg.JpegConstants;
import org.apache.commons.imaging.formats.jpeg.JpegUtils;
import org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase;
import org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossless;
import org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossy;
import org.apache.commons.imaging.formats.tiff.write.TiffOutputSet;

/* loaded from: classes9.dex */
public class ExifRewriter extends BinaryFileParser {

    public static class ExifOverflowException extends ImageWriteException {
        private static final long serialVersionUID = 1401484357224931218L;

        public ExifOverflowException(String str) {
            super(str);
        }
    }

    public static abstract class JFIFPiece {
        private JFIFPiece() {
        }

        public abstract void write(OutputStream outputStream);
    }

    public static class JFIFPieceImageData extends JFIFPiece {
        public final byte[] imageData;
        public final byte[] markerBytes;

        public JFIFPieceImageData(byte[] bArr, byte[] bArr2) {
            super();
            this.markerBytes = bArr;
            this.imageData = bArr2;
        }

        @Override // org.apache.commons.imaging.formats.jpeg.exif.ExifRewriter.JFIFPiece
        public void write(OutputStream outputStream) {
            outputStream.write(this.markerBytes);
            outputStream.write(this.imageData);
        }
    }

    public static class JFIFPieceSegment extends JFIFPiece {
        public final int marker;
        public final byte[] markerBytes;
        public final byte[] markerLengthBytes;
        public final byte[] segmentData;

        public JFIFPieceSegment(int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
            super();
            this.marker = i;
            this.markerBytes = bArr;
            this.markerLengthBytes = bArr2;
            this.segmentData = bArr3;
        }

        @Override // org.apache.commons.imaging.formats.jpeg.exif.ExifRewriter.JFIFPiece
        public void write(OutputStream outputStream) {
            outputStream.write(this.markerBytes);
            outputStream.write(this.markerLengthBytes);
            outputStream.write(this.segmentData);
        }
    }

    public static class JFIFPieceSegmentExif extends JFIFPieceSegment {
        public JFIFPieceSegmentExif(int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
            super(i, bArr, bArr2, bArr3);
        }
    }

    public static class JFIFPieces {
        public final List<JFIFPiece> exifPieces;
        public final List<JFIFPiece> pieces;

        public JFIFPieces(List<JFIFPiece> list, List<JFIFPiece> list2) {
            this.pieces = list;
            this.exifPieces = list2;
        }
    }

    public ExifRewriter(ByteOrder byteOrder) {
        setByteOrder(byteOrder);
    }

    private JFIFPieces analyzeJFIF(ByteSource byteSource) {
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        new JpegUtils().traverseJFIF(byteSource, new JpegUtils.Visitor() { // from class: org.apache.commons.imaging.formats.jpeg.exif.ExifRewriter.1
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
                if (i != 65505) {
                    arrayList.add(new JFIFPieceSegment(i, bArr, bArr2, bArr3));
                    return true;
                }
                if (!BinaryFunctions.startsWith(bArr3, JpegConstants.EXIF_IDENTIFIER_CODE)) {
                    arrayList.add(new JFIFPieceSegment(i, bArr, bArr2, bArr3));
                    return true;
                }
                JFIFPieceSegmentExif jFIFPieceSegmentExif = new JFIFPieceSegmentExif(i, bArr, bArr2, bArr3);
                arrayList.add(jFIFPieceSegmentExif);
                arrayList2.add(jFIFPieceSegmentExif);
                return true;
            }
        });
        return new JFIFPieces(arrayList, arrayList2);
    }

    private byte[] writeExifSegment(TiffImageWriterBase tiffImageWriterBase, TiffOutputSet tiffOutputSet, boolean z) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (z) {
            JpegConstants.EXIF_IDENTIFIER_CODE.writeTo(byteArrayOutputStream);
            byteArrayOutputStream.write(0);
            byteArrayOutputStream.write(0);
        }
        tiffImageWriterBase.write(byteArrayOutputStream, tiffOutputSet);
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0076, code lost:
    
        r11 = r12.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x007e, code lost:
    
        if (r11.hasNext() == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0080, code lost:
    
        r12 = r11.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0088, code lost:
    
        if ((r12 instanceof org.apache.commons.imaging.formats.jpeg.exif.ExifRewriter.JFIFPieceSegmentExif) == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00c8, code lost:
    
        r12.write(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008a, code lost:
    
        if (r3 == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008d, code lost:
    
        if (r13 != null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008f, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0091, code lost:
    
        r12 = org.apache.commons.imaging.common.ByteConversions.toBytes((short) -31, getByteOrder());
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009a, code lost:
    
        if (r13.length > 65535) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009c, code lost:
    
        r1 = org.apache.commons.imaging.common.ByteConversions.toBytes((short) (r13.length + 2), getByteOrder());
        r0.write(r12);
        r0.write(r1);
        r0.write(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c7, code lost:
    
        throw new org.apache.commons.imaging.formats.jpeg.exif.ExifRewriter.ExifOverflowException("APP1 Segment is too long: " + r13.length);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00cc, code lost:
    
        r0.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00cf, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void writeSegmentsReplacingExif(OutputStream outputStream, List<JFIFPiece> list, byte[] bArr) {
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        try {
            JpegConstants.SOI.writeTo(dataOutputStream);
            Iterator<JFIFPiece> it = list.iterator();
            while (true) {
                boolean z = false;
                if (it.hasNext()) {
                    if (it.next() instanceof JFIFPieceSegmentExif) {
                        break;
                    }
                } else if (bArr != null) {
                    byte[] bytes = ByteConversions.toBytes((short) -31, getByteOrder());
                    if (bArr.length > 65535) {
                        throw new ExifOverflowException("APP1 Segment is too long: " + bArr.length);
                    }
                    list.add(((JFIFPieceSegment) list.get(0)).marker == 65504 ? 1 : 0, new JFIFPieceSegmentExif(JpegConstants.JPEG_APP1_MARKER, bytes, ByteConversions.toBytes((short) (bArr.length + 2), getByteOrder()), bArr));
                }
            }
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

    public void removeExifMetadata(ByteSource byteSource, OutputStream outputStream) {
        writeSegmentsReplacingExif(outputStream, analyzeJFIF(byteSource).pieces, null);
    }

    public void updateExifMetadataLossless(ByteSource byteSource, OutputStream outputStream, TiffOutputSet tiffOutputSet) {
        TiffImageWriterBase tiffImageWriterLossy;
        JFIFPieces analyzeJFIF = analyzeJFIF(byteSource);
        List<JFIFPiece> list = analyzeJFIF.pieces;
        if (analyzeJFIF.exifPieces.isEmpty()) {
            tiffImageWriterLossy = new TiffImageWriterLossy(tiffOutputSet.byteOrder);
        } else {
            tiffImageWriterLossy = new TiffImageWriterLossless(tiffOutputSet.byteOrder, BinaryFunctions.remainingBytes("trimmed exif bytes", ((JFIFPieceSegment) analyzeJFIF.exifPieces.get(0)).segmentData, 6));
        }
        writeSegmentsReplacingExif(outputStream, list, writeExifSegment(tiffImageWriterLossy, tiffOutputSet, true));
    }

    public void updateExifMetadataLossy(ByteSource byteSource, OutputStream outputStream, TiffOutputSet tiffOutputSet) {
        writeSegmentsReplacingExif(outputStream, analyzeJFIF(byteSource).pieces, writeExifSegment(new TiffImageWriterLossy(tiffOutputSet.byteOrder), tiffOutputSet, true));
    }

    public ExifRewriter() {
        this(ByteOrder.BIG_ENDIAN);
    }

    public void removeExifMetadata(byte[] bArr, OutputStream outputStream) {
        removeExifMetadata(new ByteSourceArray(bArr), outputStream);
    }

    public void removeExifMetadata(InputStream inputStream, OutputStream outputStream) {
        removeExifMetadata(new ByteSourceInputStream(inputStream, null), outputStream);
    }

    public void removeExifMetadata(File file, OutputStream outputStream) {
        removeExifMetadata(new ByteSourceFile(file), outputStream);
    }

    public void updateExifMetadataLossy(InputStream inputStream, OutputStream outputStream, TiffOutputSet tiffOutputSet) {
        updateExifMetadataLossy(new ByteSourceInputStream(inputStream, null), outputStream, tiffOutputSet);
    }

    public void updateExifMetadataLossy(File file, OutputStream outputStream, TiffOutputSet tiffOutputSet) {
        updateExifMetadataLossy(new ByteSourceFile(file), outputStream, tiffOutputSet);
    }

    public void updateExifMetadataLossy(byte[] bArr, OutputStream outputStream, TiffOutputSet tiffOutputSet) {
        updateExifMetadataLossy(new ByteSourceArray(bArr), outputStream, tiffOutputSet);
    }

    public void updateExifMetadataLossless(byte[] bArr, OutputStream outputStream, TiffOutputSet tiffOutputSet) {
        updateExifMetadataLossless(new ByteSourceArray(bArr), outputStream, tiffOutputSet);
    }

    public void updateExifMetadataLossless(InputStream inputStream, OutputStream outputStream, TiffOutputSet tiffOutputSet) {
        updateExifMetadataLossless(new ByteSourceInputStream(inputStream, null), outputStream, tiffOutputSet);
    }

    public void updateExifMetadataLossless(File file, OutputStream outputStream, TiffOutputSet tiffOutputSet) {
        updateExifMetadataLossless(new ByteSourceFile(file), outputStream, tiffOutputSet);
    }
}
