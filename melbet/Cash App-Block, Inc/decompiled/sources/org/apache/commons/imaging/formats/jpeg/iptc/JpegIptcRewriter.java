package org.apache.commons.imaging.formats.jpeg.iptc;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;
import org.apache.commons.imaging.common.bytesource.ByteSource;
import org.apache.commons.imaging.common.bytesource.ByteSourceArray;
import org.apache.commons.imaging.common.bytesource.ByteSourceFile;
import org.apache.commons.imaging.common.bytesource.ByteSourceInputStream;
import org.apache.commons.imaging.formats.jpeg.JpegConstants;
import org.apache.commons.imaging.formats.jpeg.xmp.JpegRewriter;

/* loaded from: classes9.dex */
public class JpegIptcRewriter extends JpegRewriter {
    public void removeIPTC(ByteSource byteSource, OutputStream outputStream, boolean z) {
        List<JpegRewriter.JFIFPiece> list = analyzeJFIF(byteSource).pieces;
        List findPhotoshopApp13Segments = findPhotoshopApp13Segments(list);
        if (findPhotoshopApp13Segments.size() > 1) {
            f$$ExternalSyntheticLambda0.m("Image contains more than one Photoshop App13 segment.");
            return;
        }
        List<? extends JpegRewriter.JFIFPiece> removePhotoshopApp13Segments = removePhotoshopApp13Segments(list);
        if (!z && findPhotoshopApp13Segments.size() == 1) {
            JpegRewriter.JFIFPieceSegment jFIFPieceSegment = (JpegRewriter.JFIFPieceSegment) findPhotoshopApp13Segments.get(0);
            removePhotoshopApp13Segments.add(list.indexOf(jFIFPieceSegment), new JpegRewriter.JFIFPieceSegment(jFIFPieceSegment.marker, new IptcParser().writePhotoshopApp13Segment(new PhotoshopApp13Data(new ArrayList(), new IptcParser().parsePhotoshopSegment(jFIFPieceSegment.getSegmentData(), new HashMap()).getNonIptcBlocks()))));
        }
        writeSegments(outputStream, removePhotoshopApp13Segments);
    }

    public void writeIPTC(ByteSource byteSource, OutputStream outputStream, PhotoshopApp13Data photoshopApp13Data) {
        List<JpegRewriter.JFIFPiece> list = analyzeJFIF(byteSource).pieces;
        if (findPhotoshopApp13Segments(list).size() > 1) {
            f$$ExternalSyntheticLambda0.m("Image contains more than one Photoshop App13 segment.");
            return;
        }
        List removePhotoshopApp13Segments = removePhotoshopApp13Segments(list);
        List<IptcBlock> nonIptcBlocks = photoshopApp13Data.getNonIptcBlocks();
        nonIptcBlocks.add(new IptcBlock(IptcConstants.IMAGE_RESOURCE_BLOCK_IPTC_DATA, new byte[0], new IptcParser().writeIPTCBlock(photoshopApp13Data.getRecords())));
        writeSegments(outputStream, insertAfterLastAppSegments(removePhotoshopApp13Segments, Arrays.asList(new JpegRewriter.JFIFPieceSegment(JpegConstants.JPEG_APP13_MARKER, new IptcParser().writePhotoshopApp13Segment(new PhotoshopApp13Data(photoshopApp13Data.getRecords(), nonIptcBlocks))))));
    }

    public void writeIPTC(InputStream inputStream, OutputStream outputStream, PhotoshopApp13Data photoshopApp13Data) {
        writeIPTC(new ByteSourceInputStream(inputStream, null), outputStream, photoshopApp13Data);
    }

    public void removeIPTC(File file, OutputStream outputStream, boolean z) {
        removeIPTC(new ByteSourceFile(file), outputStream, z);
    }

    public void writeIPTC(File file, OutputStream outputStream, PhotoshopApp13Data photoshopApp13Data) {
        writeIPTC(new ByteSourceFile(file), outputStream, photoshopApp13Data);
    }

    public void removeIPTC(byte[] bArr, OutputStream outputStream) {
        removeIPTC(bArr, outputStream, false);
    }

    public void writeIPTC(byte[] bArr, OutputStream outputStream, PhotoshopApp13Data photoshopApp13Data) {
        writeIPTC(new ByteSourceArray(bArr), outputStream, photoshopApp13Data);
    }

    public void removeIPTC(byte[] bArr, OutputStream outputStream, boolean z) {
        removeIPTC(new ByteSourceArray(bArr), outputStream, z);
    }

    public void removeIPTC(InputStream inputStream, OutputStream outputStream) {
        removeIPTC(inputStream, outputStream, false);
    }

    public void removeIPTC(InputStream inputStream, OutputStream outputStream, boolean z) {
        removeIPTC(new ByteSourceInputStream(inputStream, null), outputStream, z);
    }

    public void removeIPTC(ByteSource byteSource, OutputStream outputStream) {
        removeIPTC(byteSource, outputStream, false);
    }

    public void removeIPTC(File file, OutputStream outputStream) {
        removeIPTC(file, outputStream, false);
    }
}
