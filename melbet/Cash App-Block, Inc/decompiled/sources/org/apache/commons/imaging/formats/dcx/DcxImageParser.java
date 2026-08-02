package org.apache.commons.imaging.formats.dcx;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.imaging.ImageFormat;
import org.apache.commons.imaging.ImageFormats;
import org.apache.commons.imaging.ImageInfo;
import org.apache.commons.imaging.ImageParser;
import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.ImageWriteException;
import org.apache.commons.imaging.ImagingConstants;
import org.apache.commons.imaging.PixelDensity;
import org.apache.commons.imaging.common.BinaryFunctions;
import org.apache.commons.imaging.common.BinaryOutputStream;
import org.apache.commons.imaging.common.ImageMetadata;
import org.apache.commons.imaging.common.bytesource.ByteSource;
import org.apache.commons.imaging.common.bytesource.ByteSourceInputStream;
import org.apache.commons.imaging.formats.pcx.PcxConstants;
import org.apache.commons.imaging.formats.pcx.PcxImageParser;
import org.apache.commons.imaging.palette.ColorGroup$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes9.dex */
public class DcxImageParser extends ImageParser {
    private static final String DEFAULT_EXTENSION = ".dcx";
    private static final String[] ACCEPTED_EXTENSIONS = {DEFAULT_EXTENSION};

    public static class DcxHeader {
        public static final int DCX_ID = 987654321;
        public final int id;
        public final long[] pageTable;

        public DcxHeader(int i, long[] jArr) {
            this.id = i;
            this.pageTable = jArr;
        }

        public void dump(PrintWriter printWriter) {
            printWriter.println("DcxHeader");
            printWriter.println("Id: 0x" + Integer.toHexString(this.id));
            printWriter.println("Pages: " + this.pageTable.length);
            printWriter.println();
        }
    }

    public DcxImageParser() {
        super.setByteOrder(ByteOrder.LITTLE_ENDIAN);
    }

    private DcxHeader readDcxHeader(ByteSource byteSource) {
        InputStream inputStream = byteSource.getInputStream();
        try {
            int read4Bytes = BinaryFunctions.read4Bytes("Id", inputStream, "Not a Valid DCX File", getByteOrder());
            ArrayList arrayList = new ArrayList(1024);
            for (int i = 0; i < 1024; i++) {
                long read4Bytes2 = BinaryFunctions.read4Bytes("PageTable", inputStream, "Not a Valid DCX File", getByteOrder()) & BodyPartID.bodyIdMax;
                if (read4Bytes2 == 0) {
                    break;
                }
                arrayList.add(Long.valueOf(read4Bytes2));
            }
            if (read4Bytes != 987654321) {
                throw new ImageReadException("Not a Valid DCX File: file id incorrect");
            }
            if (arrayList.size() == 1024) {
                throw new ImageReadException("DCX page table not terminated by zero entry");
            }
            Object[] array2 = arrayList.toArray();
            long[] jArr = new long[array2.length];
            for (int i2 = 0; i2 < array2.length; i2++) {
                jArr[i2] = ((Long) array2[i2]).longValue();
            }
            DcxHeader dcxHeader = new DcxHeader(read4Bytes, jArr);
            if (inputStream != null) {
                inputStream.close();
            }
            return dcxHeader;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    @Override // org.apache.commons.imaging.ImageParser
    public boolean dumpImageFile(PrintWriter printWriter, ByteSource byteSource) {
        readDcxHeader(byteSource).dump(printWriter);
        return true;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public String[] getAcceptedExtensions() {
        return ACCEPTED_EXTENSIONS;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public ImageFormat[] getAcceptedTypes() {
        return new ImageFormat[]{ImageFormats.DCX};
    }

    @Override // org.apache.commons.imaging.ImageParser
    public List<BufferedImage> getAllBufferedImages(ByteSource byteSource) {
        DcxHeader readDcxHeader = readDcxHeader(byteSource);
        ArrayList arrayList = new ArrayList();
        PcxImageParser pcxImageParser = new PcxImageParser();
        for (long j : readDcxHeader.pageTable) {
            InputStream inputStream = byteSource.getInputStream(j);
            try {
                arrayList.add(pcxImageParser.getBufferedImage(new ByteSourceInputStream(inputStream, null), new HashMap()));
                if (inputStream != null) {
                    inputStream.close();
                }
            } finally {
            }
        }
        return arrayList;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public final BufferedImage getBufferedImage(ByteSource byteSource, Map<String, Object> map) {
        List<BufferedImage> allBufferedImages = getAllBufferedImages(byteSource);
        if (allBufferedImages.isEmpty()) {
            return null;
        }
        return allBufferedImages.get(0);
    }

    @Override // org.apache.commons.imaging.ImageParser
    public String getDefaultExtension() {
        return DEFAULT_EXTENSION;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public byte[] getICCProfileBytes(ByteSource byteSource, Map<String, Object> map) {
        return null;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public ImageInfo getImageInfo(ByteSource byteSource, Map<String, Object> map) {
        return null;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public Dimension getImageSize(ByteSource byteSource, Map<String, Object> map) {
        return null;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public ImageMetadata getMetadata(ByteSource byteSource, Map<String, Object> map) {
        return null;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public String getName() {
        return "Dcx-Custom";
    }

    @Override // org.apache.commons.imaging.ImageParser
    public void writeImage(BufferedImage bufferedImage, OutputStream outputStream, Map<String, Object> map) {
        Object remove;
        HashMap hashMap = map == null ? new HashMap() : new HashMap(map);
        HashMap hashMap2 = new HashMap();
        if (hashMap.containsKey(ImagingConstants.PARAM_KEY_FORMAT)) {
            hashMap.remove(ImagingConstants.PARAM_KEY_FORMAT);
        }
        if (hashMap.containsKey(PcxConstants.PARAM_KEY_PCX_COMPRESSION)) {
            hashMap2.put(PcxConstants.PARAM_KEY_PCX_COMPRESSION, hashMap.remove(PcxConstants.PARAM_KEY_PCX_COMPRESSION));
        }
        if (hashMap.containsKey(ImagingConstants.PARAM_KEY_PIXEL_DENSITY) && (remove = hashMap.remove(ImagingConstants.PARAM_KEY_PIXEL_DENSITY)) != null) {
            if (!(remove instanceof PixelDensity)) {
                ColorGroup$$ExternalSyntheticBUOutline0.m("Invalid pixel density parameter");
                return;
            }
            hashMap2.put(ImagingConstants.PARAM_KEY_PIXEL_DENSITY, remove);
        }
        if (!hashMap.isEmpty()) {
            throw new ImageWriteException(Boxes$$ExternalSyntheticOutline1.m("Unknown parameter: ", hashMap.keySet().iterator().next()));
        }
        BinaryOutputStream binaryOutputStream = new BinaryOutputStream(outputStream, ByteOrder.LITTLE_ENDIAN);
        binaryOutputStream.write4Bytes(DcxHeader.DCX_ID);
        binaryOutputStream.write4Bytes(4100);
        for (int i = 0; i < 1023; i++) {
            binaryOutputStream.write4Bytes(0);
        }
        new PcxImageParser().writeImage(bufferedImage, binaryOutputStream, hashMap2);
    }
}
