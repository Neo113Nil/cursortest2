package org.apache.commons.imaging.formats.jpeg.xmp;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.imaging.common.bytesource.ByteSource;
import org.apache.commons.imaging.common.bytesource.ByteSourceArray;
import org.apache.commons.imaging.common.bytesource.ByteSourceFile;
import org.apache.commons.imaging.common.bytesource.ByteSourceInputStream;
import org.apache.commons.imaging.formats.jpeg.JpegConstants;
import org.apache.commons.imaging.formats.jpeg.xmp.JpegRewriter;

/* loaded from: classes9.dex */
public class JpegXmpRewriter extends JpegRewriter {
    private byte[] writeXmpSegment(byte[] bArr, int i, int i2) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        JpegConstants.XMP_IDENTIFIER.writeTo(byteArrayOutputStream);
        byteArrayOutputStream.write(bArr, i, i2);
        return byteArrayOutputStream.toByteArray();
    }

    public void removeXmpXml(ByteSource byteSource, OutputStream outputStream) {
        writeSegments(outputStream, removeXmpSegments(analyzeJFIF(byteSource).pieces));
    }

    public void updateXmpXml(ByteSource byteSource, OutputStream outputStream, String str) {
        List removeXmpSegments = removeXmpSegments(analyzeJFIF(byteSource).pieces);
        ArrayList arrayList = new ArrayList();
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        int i = 0;
        while (i < bytes.length) {
            int min = Math.min(bytes.length, 65535);
            arrayList.add(new JpegRewriter.JFIFPieceSegment(JpegConstants.JPEG_APP1_MARKER, writeXmpSegment(bytes, i, min)));
            i += min;
        }
        writeSegments(outputStream, insertAfterLastAppSegments(removeXmpSegments, arrayList));
    }

    public void removeXmpXml(byte[] bArr, OutputStream outputStream) {
        removeXmpXml(new ByteSourceArray(bArr), outputStream);
    }

    public void removeXmpXml(InputStream inputStream, OutputStream outputStream) {
        removeXmpXml(new ByteSourceInputStream(inputStream, null), outputStream);
    }

    public void removeXmpXml(File file, OutputStream outputStream) {
        removeXmpXml(new ByteSourceFile(file), outputStream);
    }

    public void updateXmpXml(InputStream inputStream, OutputStream outputStream, String str) {
        updateXmpXml(new ByteSourceInputStream(inputStream, null), outputStream, str);
    }

    public void updateXmpXml(File file, OutputStream outputStream, String str) {
        updateXmpXml(new ByteSourceFile(file), outputStream, str);
    }

    public void updateXmpXml(byte[] bArr, OutputStream outputStream, String str) {
        updateXmpXml(new ByteSourceArray(bArr), outputStream, str);
    }
}
