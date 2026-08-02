package org.apache.commons.imaging.formats.jpeg.iptc;

import bo.app.ng$$ExternalSyntheticLambda0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.ImageWriteException;
import org.apache.commons.imaging.ImagingConstants;
import org.apache.commons.imaging.common.BinaryConstant;
import org.apache.commons.imaging.common.BinaryFileParser;
import org.apache.commons.imaging.common.BinaryFunctions;
import org.apache.commons.imaging.common.BinaryOutputStream;
import org.apache.commons.imaging.common.ByteConversions;
import org.apache.commons.imaging.formats.jpeg.JpegConstants;
import org.apache.commons.imaging.internal.Debug;
import org.apache.commons.imaging.palette.ColorGroup$$ExternalSyntheticBUOutline0;

/* loaded from: classes9.dex */
public class IptcParser extends BinaryFileParser {
    private static final Logger LOGGER = Logger.getLogger(IptcParser.class.getName());
    private static final ByteOrder APP13_BYTE_ORDER = ByteOrder.BIG_ENDIAN;
    private static final List<Integer> PHOTOSHOP_IGNORED_BLOCK_TYPE = Arrays.asList(1084, 1085, 1086, 1087);

    public IptcParser() {
        setByteOrder(ByteOrder.BIG_ENDIAN);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$writeIPTCBlock$0(IptcRecord iptcRecord, IptcRecord iptcRecord2) {
        return iptcRecord2.iptcType.getType() - iptcRecord.iptcType.getType();
    }

    public boolean isPhotoshopJpegSegment(byte[] bArr) {
        BinaryConstant binaryConstant = JpegConstants.PHOTOSHOP_IDENTIFICATION_STRING;
        if (!BinaryFunctions.startsWith(bArr, binaryConstant)) {
            return false;
        }
        int size = binaryConstant.size();
        return size + 4 <= bArr.length && ByteConversions.toInt(bArr, size, APP13_BYTE_ORDER) == JpegConstants.CONST_8BIM;
    }

    public List<IptcBlock> parseAllBlocks(byte[] bArr, boolean z) {
        byte[] bArr2;
        ArrayList arrayList = new ArrayList();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            BinaryConstant binaryConstant = JpegConstants.PHOTOSHOP_IDENTIFICATION_STRING;
            if (!binaryConstant.equals(BinaryFunctions.readBytes("", byteArrayInputStream, binaryConstant.size(), "App13 Segment missing identification string"))) {
                throw new ImageReadException("Not a Photoshop App13 Segment");
            }
            while (true) {
                try {
                    ByteOrder byteOrder = APP13_BYTE_ORDER;
                    int read4Bytes = BinaryFunctions.read4Bytes("", byteArrayInputStream, "Image Resource Block missing identification string", byteOrder);
                    int i = JpegConstants.CONST_8BIM;
                    if (read4Bytes != i) {
                        throw new ImageReadException("Invalid Image Resource Block Signature");
                    }
                    int read2Bytes = BinaryFunctions.read2Bytes("", byteArrayInputStream, "Image Resource Block missing type", byteOrder);
                    Debug.debug("blockType: " + read2Bytes + " (0x" + Integer.toHexString(read2Bytes) + ")");
                    if (PHOTOSHOP_IGNORED_BLOCK_TYPE.contains(Integer.valueOf(read2Bytes))) {
                        Debug.debug("Skipping blockType: " + read2Bytes + " (0x" + Integer.toHexString(read2Bytes) + ")");
                        BinaryFunctions.searchQuad(i, byteArrayInputStream);
                    } else {
                        byte readByte = BinaryFunctions.readByte("Name length", byteArrayInputStream, "Image Resource Block missing name length");
                        if (readByte > 0) {
                            Debug.debug("blockNameLength: " + ((int) readByte) + " (0x" + Integer.toHexString(readByte) + ")");
                        }
                        if (readByte == 0) {
                            BinaryFunctions.readByte("Block name bytes", byteArrayInputStream, "Image Resource Block has invalid name");
                            bArr2 = new byte[0];
                        } else {
                            try {
                                byte[] readBytes = BinaryFunctions.readBytes("", byteArrayInputStream, readByte, "Invalid Image Resource Block name");
                                if (readByte % 2 == 0) {
                                    BinaryFunctions.readByte("Padding byte", byteArrayInputStream, "Image Resource Block missing padding byte");
                                }
                                bArr2 = readBytes;
                            } catch (IOException e) {
                                if (z) {
                                    throw e;
                                }
                                byteArrayInputStream.close();
                                return arrayList;
                            }
                        }
                        int read4Bytes2 = BinaryFunctions.read4Bytes("", byteArrayInputStream, "Image Resource Block missing size", byteOrder);
                        Debug.debug("blockSize: " + read4Bytes2 + " (0x" + Integer.toHexString(read4Bytes2) + ")");
                        if (read4Bytes2 > bArr.length) {
                            throw new ImageReadException("Invalid Block Size : " + read4Bytes2 + " > " + bArr.length);
                        }
                        try {
                            arrayList.add(new IptcBlock(read2Bytes, bArr2, BinaryFunctions.readBytes("", byteArrayInputStream, read4Bytes2, "Invalid Image Resource Block data")));
                            if (read4Bytes2 % 2 != 0) {
                                BinaryFunctions.readByte("Padding byte", byteArrayInputStream, "Image Resource Block missing padding byte");
                            }
                        } catch (IOException e2) {
                            if (z) {
                                throw e2;
                            }
                            byteArrayInputStream.close();
                            return arrayList;
                        }
                    }
                } catch (IOException unused) {
                }
            }
        } finally {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00e4, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public List<IptcRecord> parseIPTCBlock(byte[] bArr) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (i2 >= bArr.length) {
                break;
            }
            int i3 = bArr[i] & 255;
            StringBuilder m2m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m2m(i3, "tagMarker: ", " (0x");
            m2m.append(Integer.toHexString(i3));
            m2m.append(")");
            Debug.debug(m2m.toString());
            if (i3 != 28) {
                Logger logger = LOGGER;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine("Unexpected record tag marker in IPTC data.");
                    return arrayList;
                }
            } else {
                int i4 = bArr[i2] & 255;
                StringBuilder m2m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m2m(i4, "recordNumber: ", " (0x");
                m2m2.append(Integer.toHexString(i4));
                m2m2.append(")");
                Debug.debug(m2m2.toString());
                int i5 = bArr[i + 2] & 255;
                StringBuilder m2m3 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m2m(i5, "recordType: ", " (0x");
                m2m3.append(Integer.toHexString(i5));
                m2m3.append(")");
                Debug.debug(m2m3.toString());
                int uInt16 = ByteConversions.toUInt16(bArr, i + 3, getByteOrder());
                int i6 = i + 5;
                boolean z = uInt16 > 32767;
                int i7 = uInt16 & IptcConstants.IPTC_NON_EXTENDED_RECORD_MAXIMUM_SIZE;
                if (z) {
                    Debug.debug("extendedDataset. dataFieldCountLength: " + i7);
                }
                if (z) {
                    break;
                }
                byte[] slice = BinaryFunctions.slice(bArr, i6, uInt16);
                i = i6 + uInt16;
                if (i4 == 2) {
                    if (i5 == 0) {
                        Logger logger2 = LOGGER;
                        if (logger2.isLoggable(Level.FINE)) {
                            logger2.fine("ignore record version record! " + arrayList.size());
                        }
                    } else {
                        arrayList.add(new IptcRecord(IptcTypeLookup.getIptcType(i5), new String(slice, StandardCharsets.ISO_8859_1)));
                    }
                }
            }
        }
    }

    public PhotoshopApp13Data parsePhotoshopSegment(byte[] bArr, boolean z) {
        ArrayList arrayList = new ArrayList();
        List<IptcBlock> parseAllBlocks = parseAllBlocks(bArr, z);
        for (IptcBlock iptcBlock : parseAllBlocks) {
            if (iptcBlock.isIPTCBlock()) {
                arrayList.addAll(parseIPTCBlock(iptcBlock.getBlockData()));
            }
        }
        return new PhotoshopApp13Data(arrayList, parseAllBlocks);
    }

    public byte[] writeIPTCBlock(List<IptcRecord> list) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        BinaryOutputStream binaryOutputStream = new BinaryOutputStream(byteArrayOutputStream, getByteOrder());
        try {
            binaryOutputStream.write(28);
            binaryOutputStream.write(2);
            binaryOutputStream.write(IptcTypes.RECORD_VERSION.f1551type);
            binaryOutputStream.write2Bytes(2);
            binaryOutputStream.write2Bytes(2);
            ArrayList arrayList = new ArrayList(list);
            Collections.sort(arrayList, new ng$$ExternalSyntheticLambda0(27));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                IptcRecord iptcRecord = (IptcRecord) it.next();
                if (iptcRecord.iptcType != IptcTypes.RECORD_VERSION) {
                    binaryOutputStream.write(28);
                    binaryOutputStream.write(2);
                    if (iptcRecord.iptcType.getType() < 0 || iptcRecord.iptcType.getType() > 255) {
                        throw new ImageWriteException("Invalid record type: " + iptcRecord.iptcType.getType());
                    }
                    binaryOutputStream.write(iptcRecord.iptcType.getType());
                    String value = iptcRecord.getValue();
                    Charset charset = StandardCharsets.ISO_8859_1;
                    byte[] bytes = value.getBytes(charset);
                    if (!new String(bytes, charset).equals(iptcRecord.getValue())) {
                        throw new ImageWriteException("Invalid record value, not ISO-8859-1");
                    }
                    binaryOutputStream.write2Bytes(bytes.length);
                    binaryOutputStream.write(bytes);
                }
            }
            binaryOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    binaryOutputStream.close();
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    public byte[] writePhotoshopApp13Segment(PhotoshopApp13Data photoshopApp13Data) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        BinaryOutputStream binaryOutputStream = new BinaryOutputStream(byteArrayOutputStream);
        JpegConstants.PHOTOSHOP_IDENTIFICATION_STRING.writeTo(binaryOutputStream);
        for (IptcBlock iptcBlock : photoshopApp13Data.getRawBlocks()) {
            binaryOutputStream.write4Bytes(JpegConstants.CONST_8BIM);
            if (iptcBlock.getBlockType() < 0 || iptcBlock.getBlockType() > 65535) {
                ColorGroup$$ExternalSyntheticBUOutline0.m("Invalid IPTC block type.");
                return null;
            }
            binaryOutputStream.write2Bytes(iptcBlock.getBlockType());
            byte[] blockNameBytes = iptcBlock.getBlockNameBytes();
            if (blockNameBytes.length > 255) {
                throw new ImageWriteException("IPTC block name is too long: " + blockNameBytes.length);
            }
            binaryOutputStream.write(blockNameBytes.length);
            binaryOutputStream.write(blockNameBytes);
            if (blockNameBytes.length % 2 == 0) {
                binaryOutputStream.write(0);
            }
            byte[] blockData = iptcBlock.getBlockData();
            if (blockData.length > 32767) {
                throw new ImageWriteException("IPTC block data is too long: " + blockData.length);
            }
            binaryOutputStream.write4Bytes(blockData.length);
            binaryOutputStream.write(blockData);
            if (blockData.length % 2 == 1) {
                binaryOutputStream.write(0);
            }
        }
        binaryOutputStream.flush();
        return byteArrayOutputStream.toByteArray();
    }

    public PhotoshopApp13Data parsePhotoshopSegment(byte[] bArr, Map<String, Object> map) {
        return parsePhotoshopSegment(bArr, map != null && Boolean.TRUE.equals(map.get(ImagingConstants.PARAM_KEY_STRICT)));
    }
}
