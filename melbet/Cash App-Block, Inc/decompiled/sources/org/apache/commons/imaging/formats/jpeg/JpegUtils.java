package org.apache.commons.imaging.formats.jpeg;

import java.io.InputStream;
import java.nio.ByteOrder;
import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.common.BinaryFileParser;
import org.apache.commons.imaging.common.BinaryFunctions;
import org.apache.commons.imaging.common.ByteConversions;
import org.apache.commons.imaging.common.bytesource.ByteSource;
import org.apache.commons.imaging.internal.Debug;

/* loaded from: classes9.dex */
public class JpegUtils extends BinaryFileParser {

    public interface Visitor {
        boolean beginSOS();

        void visitSOS(int i, byte[] bArr, byte[] bArr2);

        boolean visitSegment(int i, byte[] bArr, int i2, byte[] bArr2, byte[] bArr3);
    }

    public JpegUtils() {
        setByteOrder(ByteOrder.BIG_ENDIAN);
    }

    public static String getMarkerName(int i) {
        if (i == 65501) {
            return "DRI_MARKER";
        }
        switch (i) {
            case JpegConstants.SOF0_MARKER /* 65472 */:
                return "SOF0_MARKER";
            case JpegConstants.SOF1_MARKER /* 65473 */:
                return "SOF1_MARKER";
            case JpegConstants.SOF2_MARKER /* 65474 */:
                return "SOF2_MARKER";
            case JpegConstants.SOF3_MARKER /* 65475 */:
                return "SOF3_MARKER";
            case JpegConstants.DHT_MARKER /* 65476 */:
                return "SOF4_MARKER";
            case JpegConstants.SOF5_MARKER /* 65477 */:
                return "SOF5_MARKER";
            case JpegConstants.SOF6_MARKER /* 65478 */:
                return "SOF6_MARKER";
            case JpegConstants.SOF7_MARKER /* 65479 */:
                return "SOF7_MARKER";
            case JpegConstants.SOF8_MARKER /* 65480 */:
                return "SOF8_MARKER";
            case JpegConstants.SOF9_MARKER /* 65481 */:
                return "SOF9_MARKER";
            case JpegConstants.SOF10_MARKER /* 65482 */:
                return "SOF10_MARKER";
            case JpegConstants.SOF11_MARKER /* 65483 */:
                return "SOF11_MARKER";
            case JpegConstants.DAC_MARKER /* 65484 */:
                return "DAC_MARKER";
            case JpegConstants.SOF13_MARKER /* 65485 */:
                return "SOF13_MARKER";
            case JpegConstants.SOF14_MARKER /* 65486 */:
                return "SOF14_MARKER";
            case JpegConstants.SOF15_MARKER /* 65487 */:
                return "SOF15_MARKER";
            case JpegConstants.RST0_MARKER /* 65488 */:
                return "RST0_MARKER";
            case JpegConstants.RST1_MARKER /* 65489 */:
                return "RST1_MARKER";
            case JpegConstants.RST2_MARKER /* 65490 */:
                return "RST2_MARKER";
            case JpegConstants.RST3_MARKER /* 65491 */:
                return "RST3_MARKER";
            case JpegConstants.RST4_MARKER /* 65492 */:
                return "RST4_MARKER";
            case JpegConstants.RST5_MARKER /* 65493 */:
                return "RST5_MARKER";
            case JpegConstants.RST6_MARKER /* 65494 */:
                return "RST6_MARKER";
            case JpegConstants.RST7_MARKER /* 65495 */:
                return "RST7_MARKER";
            default:
                switch (i) {
                    case JpegConstants.SOS_MARKER /* 65498 */:
                        return "SOS_MARKER";
                    case JpegConstants.DQT_MARKER /* 65499 */:
                        return "DQT_MARKER";
                    default:
                        switch (i) {
                            case 65504:
                                return "JFIF_MARKER";
                            case JpegConstants.JPEG_APP1_MARKER /* 65505 */:
                                return "JPEG_APP1_MARKER";
                            case JpegConstants.JPEG_APP2_MARKER /* 65506 */:
                                return "JPEG_APP2_MARKER";
                            default:
                                switch (i) {
                                    case JpegConstants.JPEG_APP13_MARKER /* 65517 */:
                                        return "JPEG_APP13_MARKER";
                                    case JpegConstants.JPEG_APP14_MARKER /* 65518 */:
                                        return "JPEG_APP14_MARKER";
                                    case JpegConstants.JPEG_APP15_MARKER /* 65519 */:
                                        return "JPEG_APP15_MARKER";
                                    default:
                                        return "Unknown";
                                }
                        }
                }
        }
    }

    public void dumpJFIF(ByteSource byteSource) {
        traverseJFIF(byteSource, new Visitor() { // from class: org.apache.commons.imaging.formats.jpeg.JpegUtils.1
            @Override // org.apache.commons.imaging.formats.jpeg.JpegUtils.Visitor
            public boolean beginSOS() {
                return true;
            }

            @Override // org.apache.commons.imaging.formats.jpeg.JpegUtils.Visitor
            public void visitSOS(int i, byte[] bArr, byte[] bArr2) {
                Debug.debug("SOS marker.  " + bArr2.length + " bytes of image data.");
                Debug.debug("");
            }

            @Override // org.apache.commons.imaging.formats.jpeg.JpegUtils.Visitor
            public boolean visitSegment(int i, byte[] bArr, int i2, byte[] bArr2, byte[] bArr3) {
                Debug.debug("Segment marker: " + Integer.toHexString(i) + " (" + JpegUtils.getMarkerName(i) + "), " + bArr3.length + " bytes of segment data.");
                return true;
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x003e, code lost:
    
        r4 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0078, code lost:
    
        if (r4.beginSOS() != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007a, code lost:
    
        if (r11 == null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007c, code lost:
    
        r11.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0080, code lost:
    
        r4.visitSOS(r5, r6, org.apache.commons.imaging.common.BinaryFunctions.getStreamBytes(r11));
        org.apache.commons.imaging.internal.Debug.debug(r2 + " markers");
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009b, code lost:
    
        if (r11 == null) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009d, code lost:
    
        r11.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a0, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void traverseJFIF(ByteSource byteSource, Visitor visitor) {
        byte readByte;
        byte b;
        InputStream inputStream = byteSource.getInputStream();
        try {
            BinaryFunctions.readAndVerifyBytes(inputStream, JpegConstants.SOI, "Not a Valid JPEG File: doesn't begin with 0xffd8");
            int i = 0;
            while (true) {
                byte[] bArr = new byte[2];
                while (true) {
                    bArr[0] = bArr[1];
                    readByte = BinaryFunctions.readByte("marker", inputStream, "Could not read marker");
                    bArr[1] = readByte;
                    b = bArr[0];
                    if ((b & 255) == 255 && (readByte & 255) != 255) {
                        break;
                    }
                }
                int i2 = (readByte & 255) | ((b & 255) << 8);
                if (i2 == 65497 || i2 == 65498) {
                    break;
                }
                byte[] readBytes = BinaryFunctions.readBytes("segmentLengthBytes", inputStream, 2, "segmentLengthBytes");
                int uInt16 = ByteConversions.toUInt16(readBytes, getByteOrder());
                if (uInt16 < 2) {
                    throw new ImageReadException("Invalid segment size");
                }
                Visitor visitor2 = visitor;
                if (!visitor2.visitSegment(i2, bArr, uInt16, readBytes, BinaryFunctions.readBytes("Segment Data", inputStream, uInt16 - 2, "Invalid Segment: insufficient data"))) {
                    if (inputStream != null) {
                        inputStream.close();
                        return;
                    }
                    return;
                }
                i++;
                visitor = visitor2;
            }
        } catch (Throwable th) {
            try {
                throw th;
            } finally {
            }
        }
    }
}
