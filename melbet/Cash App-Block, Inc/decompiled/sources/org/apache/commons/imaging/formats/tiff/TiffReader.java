package org.apache.commons.imaging.formats.tiff;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;
import org.apache.commons.imaging.FormatCompliance;
import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.ImagingConstants;
import org.apache.commons.imaging.common.BinaryFileParser;
import org.apache.commons.imaging.common.BinaryFunctions;
import org.apache.commons.imaging.common.ByteConversions;
import org.apache.commons.imaging.common.bytesource.ByteSource;
import org.apache.commons.imaging.common.bytesource.ByteSourceFile;
import org.apache.commons.imaging.formats.tiff.TiffDirectory;
import org.apache.commons.imaging.formats.tiff.TiffImageData;
import org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants;
import org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants;
import org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLong;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes9.dex */
public class TiffReader extends BinaryFileParser {
    private final boolean strict;

    public static class FirstDirectoryCollector extends Collector {
        private final boolean readImageData;

        public FirstDirectoryCollector(boolean z) {
            this.readImageData = z;
        }

        @Override // org.apache.commons.imaging.formats.tiff.TiffReader.Collector, org.apache.commons.imaging.formats.tiff.TiffReader.Listener
        public boolean addDirectory(TiffDirectory tiffDirectory) {
            super.addDirectory(tiffDirectory);
            return false;
        }

        @Override // org.apache.commons.imaging.formats.tiff.TiffReader.Collector, org.apache.commons.imaging.formats.tiff.TiffReader.Listener
        public boolean readImageData() {
            return this.readImageData;
        }
    }

    public interface Listener {
        boolean addDirectory(TiffDirectory tiffDirectory);

        boolean addField(TiffField tiffField);

        boolean readImageData();

        boolean readOffsetDirectories();

        boolean setTiffHeader(TiffHeader tiffHeader);
    }

    public TiffReader(boolean z) {
        this.strict = z;
    }

    private JpegImageData getJpegRawImageData(ByteSource byteSource, TiffDirectory tiffDirectory) {
        TiffDirectory.ImageDataElement jpegRawImageDataElement = tiffDirectory.getJpegRawImageDataElement();
        long j = jpegRawImageDataElement.offset;
        int i = jpegRawImageDataElement.length;
        if (i + j > byteSource.getLength()) {
            i = (int) (byteSource.getLength() - j);
        }
        byte[] block = byteSource.getBlock(j, i);
        if (!this.strict || (i >= 2 && (((block[block.length - 2] & 255) << 8) | (block[block.length - 1] & 255)) == 65497)) {
            return new JpegImageData(j, i, block);
        }
        f$$ExternalSyntheticLambda0.m("JPEG EOI marker could not be found at expected location");
        return null;
    }

    private ByteOrder getTiffByteOrder(int i) {
        if (i == 73) {
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (i == 77) {
            return ByteOrder.BIG_ENDIAN;
        }
        throw new ImageReadException("Invalid TIFF byte order " + (i & 255));
    }

    private TiffImageData getTiffRawImageData(ByteSource byteSource, TiffDirectory tiffDirectory) {
        int intValue;
        List<TiffDirectory.ImageDataElement> tiffRawImageDataElements = tiffDirectory.getTiffRawImageDataElements();
        TiffImageData.Data[] dataArr = new TiffImageData.Data[tiffRawImageDataElements.size()];
        int i = 0;
        if (byteSource instanceof ByteSourceFile) {
            ByteSourceFile byteSourceFile = (ByteSourceFile) byteSource;
            while (i < tiffRawImageDataElements.size()) {
                TiffDirectory.ImageDataElement imageDataElement = tiffRawImageDataElements.get(i);
                dataArr[i] = new TiffImageData.ByteSourceData(imageDataElement.offset, imageDataElement.length, byteSourceFile);
                i++;
            }
        } else {
            while (i < tiffRawImageDataElements.size()) {
                TiffDirectory.ImageDataElement imageDataElement2 = tiffRawImageDataElements.get(i);
                dataArr[i] = new TiffImageData.Data(imageDataElement2.offset, imageDataElement2.length, byteSource.getBlock(imageDataElement2.offset, imageDataElement2.length));
                i++;
            }
        }
        if (tiffDirectory.imageDataInStrips()) {
            TiffField findField = tiffDirectory.findField(TiffTagConstants.TIFF_TAG_ROWS_PER_STRIP);
            if (findField != null) {
                intValue = findField.getIntValue();
            } else {
                TiffField findField2 = tiffDirectory.findField(TiffTagConstants.TIFF_TAG_IMAGE_LENGTH);
                intValue = findField2 != null ? findField2.getIntValue() : Integer.MAX_VALUE;
            }
            return new TiffImageData.Strips(dataArr, intValue);
        }
        TiffField findField3 = tiffDirectory.findField(TiffTagConstants.TIFF_TAG_TILE_WIDTH);
        if (findField3 == null) {
            f$$ExternalSyntheticLambda0.m("Can't find tile width field.");
            return null;
        }
        int intValue2 = findField3.getIntValue();
        TiffField findField4 = tiffDirectory.findField(TiffTagConstants.TIFF_TAG_TILE_LENGTH);
        if (findField4 != null) {
            return new TiffImageData.Tiles(dataArr, intValue2, findField4.getIntValue());
        }
        f$$ExternalSyntheticLambda0.m("Can't find tile length field.");
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0101, code lost:
    
        if (r14 != null) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01a6 A[Catch: all -> 0x00b1, TryCatch #0 {all -> 0x00b1, blocks: (B:7:0x0023, B:14:0x0032, B:16:0x003a, B:20:0x0049, B:24:0x0089, B:25:0x008d, B:29:0x009e, B:32:0x00a9, B:33:0x00e7, B:40:0x00b5, B:45:0x00ba, B:46:0x00e4, B:53:0x0115, B:55:0x0137, B:57:0x013d, B:58:0x0144, B:60:0x014a, B:61:0x0151, B:65:0x015a, B:67:0x0160, B:70:0x0175, B:76:0x017d, B:79:0x0188, B:82:0x0191, B:84:0x01a6, B:74:0x01ac, B:89:0x019f, B:93:0x01aa, B:102:0x01b7, B:104:0x01bd, B:109:0x01cf, B:113:0x01d8), top: B:6:0x0023, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ac A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean readDirectory(ByteSource byteSource, long j, int i, FormatCompliance formatCompliance, Listener listener, boolean z, List<Number> list) {
        TiffDirectory tiffDirectory;
        int i2;
        TiffField tiffField;
        boolean z2;
        int i3;
        List<Number> list2;
        Listener listener2;
        byte[] bArr;
        ByteSource byteSource2 = byteSource;
        Listener listener3 = listener;
        List<Number> list3 = list;
        if (list3.contains(Long.valueOf(j))) {
            return false;
        }
        list3.add(Long.valueOf(j));
        InputStream inputStream = byteSource2.getInputStream();
        try {
            if (j < byteSource2.getLength()) {
                BinaryFunctions.skipBytes(inputStream, j);
                ArrayList arrayList = new ArrayList();
                try {
                    int read2Bytes = BinaryFunctions.read2Bytes("DirectoryEntryCount", inputStream, "Not a Valid TIFF File", getByteOrder());
                    int i4 = 0;
                    while (i4 < read2Bytes) {
                        int read2Bytes2 = BinaryFunctions.read2Bytes("Tag", inputStream, "Not a Valid TIFF File", getByteOrder());
                        int read2Bytes3 = BinaryFunctions.read2Bytes("Type", inputStream, "Not a Valid TIFF File", getByteOrder());
                        int i5 = read2Bytes;
                        int i6 = i4;
                        long read4Bytes = BinaryFunctions.read4Bytes("Count", inputStream, "Not a Valid TIFF File", getByteOrder()) & BodyPartID.bodyIdMax;
                        byte[] readBytes = BinaryFunctions.readBytes("Offset", inputStream, 4, "Not a Valid TIFF File");
                        long j2 = ByteConversions.toInt(readBytes, getByteOrder()) & BodyPartID.bodyIdMax;
                        if (read2Bytes2 != 0) {
                            try {
                                FieldType fieldType = FieldType.getFieldType(read2Bytes3);
                                long size = fieldType.getSize() * read4Bytes;
                                if (size > 4) {
                                    if (j2 >= 0 && j2 + size <= byteSource2.getLength()) {
                                        bArr = byteSource2.getBlock(j2, (int) size);
                                    }
                                    if (this.strict) {
                                        throw new IOException("Attempt to read byte range starting from " + j2 + " of length " + size + " which is outside the file's size of " + byteSource2.getLength());
                                    }
                                } else {
                                    bArr = readBytes;
                                }
                                TiffField tiffField2 = new TiffField(read2Bytes2, i, fieldType, read4Bytes, j2, bArr, getByteOrder(), i6);
                                arrayList.add(tiffField2);
                                if (!listener3.addField(tiffField2)) {
                                }
                            } catch (ImageReadException unused) {
                                continue;
                            }
                        }
                        i4 = i6 + 1;
                        read2Bytes = i5;
                    }
                    tiffDirectory = new TiffDirectory(i, arrayList, j, BinaryFunctions.read4Bytes("nextDirectoryOffset", inputStream, "Not a Valid TIFF File", getByteOrder()) & BodyPartID.bodyIdMax, getByteOrder());
                    if (listener3.readImageData()) {
                        if (tiffDirectory.hasTiffImageData()) {
                            tiffDirectory.setTiffImageData(getTiffRawImageData(byteSource2, tiffDirectory));
                        }
                        if (tiffDirectory.hasJpegImageData()) {
                            tiffDirectory.setJpegImageData(getJpegRawImageData(byteSource2, tiffDirectory));
                        }
                    }
                } catch (IOException e) {
                    if (this.strict) {
                        throw e;
                    }
                    if (inputStream != null) {
                    }
                }
                if (listener3.addDirectory(tiffDirectory)) {
                    if (listener3.readOffsetDirectories()) {
                        TagInfoLong[] tagInfoLongArr = {ExifTagConstants.EXIF_TAG_EXIF_OFFSET, ExifTagConstants.EXIF_TAG_GPSINFO, ExifTagConstants.EXIF_TAG_INTEROP_OFFSET};
                        int[] iArr = {-2, -3, -4};
                        int i7 = 0;
                        while (i7 < 3) {
                            TiffField findField = tiffDirectory.findField(tagInfoLongArr[i7]);
                            if (findField != null) {
                                try {
                                    i3 = i7;
                                    try {
                                        list2 = list3;
                                        tiffField = findField;
                                        listener2 = listener3;
                                        i2 = i3;
                                    } catch (ImageReadException e2) {
                                        e = e2;
                                        i2 = i3;
                                        tiffField = findField;
                                    }
                                } catch (ImageReadException e3) {
                                    e = e3;
                                    i2 = i7;
                                    tiffField = findField;
                                }
                                try {
                                    z2 = readDirectory(byteSource2, tiffDirectory.getFieldValue(r0), iArr[i3], formatCompliance, listener2, true, list2);
                                } catch (ImageReadException e4) {
                                    e = e4;
                                    if (this.strict) {
                                        throw e;
                                    }
                                    z2 = false;
                                    if (z2) {
                                    }
                                    i7 = i2 + 1;
                                    byteSource2 = byteSource;
                                    listener3 = listener;
                                    list3 = list;
                                }
                                if (z2) {
                                    arrayList.remove(tiffField);
                                }
                            } else {
                                i2 = i7;
                            }
                            i7 = i2 + 1;
                            byteSource2 = byteSource;
                            listener3 = listener;
                            list3 = list;
                        }
                    }
                    if (!z) {
                        long j3 = tiffDirectory.nextDirectoryOffset;
                        if (j3 > 0) {
                            readDirectory(byteSource, j3, i + 1, formatCompliance, listener, list);
                        }
                    }
                    if (inputStream != null) {
                        inputStream.close();
                    }
                } else if (inputStream != null) {
                    inputStream.close();
                }
            } else if (inputStream != null) {
                inputStream.close();
                return true;
            }
            return true;
        } finally {
        }
    }

    private TiffHeader readTiffHeader(InputStream inputStream) {
        byte readByte = BinaryFunctions.readByte("BYTE_ORDER_1", inputStream, "Not a Valid TIFF File");
        byte readByte2 = BinaryFunctions.readByte("BYTE_ORDER_2", inputStream, "Not a Valid TIFF File");
        if (readByte != readByte2) {
            throw new ImageReadException(Recorder$$ExternalSyntheticOutline2.m((int) readByte, (int) readByte2, "Byte Order bytes don't match (", ", ", ")."));
        }
        ByteOrder tiffByteOrder = getTiffByteOrder(readByte);
        setByteOrder(tiffByteOrder);
        int read2Bytes = BinaryFunctions.read2Bytes("tiffVersion", inputStream, "Not a Valid TIFF File", getByteOrder());
        if (read2Bytes != 42) {
            throw new ImageReadException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(read2Bytes, "Unknown Tiff Version: "));
        }
        long read4Bytes = BinaryFunctions.read4Bytes("offsetToFirstIFD", inputStream, "Not a Valid TIFF File", getByteOrder()) & BodyPartID.bodyIdMax;
        BinaryFunctions.skipBytes(inputStream, read4Bytes - 8, "Not a Valid TIFF File: couldn't find IFDs");
        return new TiffHeader(tiffByteOrder, read2Bytes, read4Bytes);
    }

    public void read(ByteSource byteSource, Map<String, Object> map, FormatCompliance formatCompliance, Listener listener) {
        readDirectories(byteSource, formatCompliance, listener);
    }

    public TiffContents readContents(ByteSource byteSource, Map<String, Object> map, FormatCompliance formatCompliance) {
        Collector collector = new Collector(map);
        read(byteSource, map, formatCompliance, collector);
        return collector.getContents();
    }

    public TiffContents readDirectories(ByteSource byteSource, boolean z, FormatCompliance formatCompliance) {
        Collector collector = new Collector(Collections.singletonMap(ImagingConstants.PARAM_KEY_READ_THUMBNAILS, Boolean.valueOf(z)));
        readDirectories(byteSource, formatCompliance, collector);
        TiffContents contents = collector.getContents();
        if (!contents.directories.isEmpty()) {
            return contents;
        }
        f$$ExternalSyntheticLambda0.m("Image did not contain any directories.");
        return null;
    }

    public TiffContents readFirstDirectory(ByteSource byteSource, Map<String, Object> map, boolean z, FormatCompliance formatCompliance) {
        FirstDirectoryCollector firstDirectoryCollector = new FirstDirectoryCollector(z);
        read(byteSource, map, formatCompliance, firstDirectoryCollector);
        TiffContents contents = firstDirectoryCollector.getContents();
        if (!contents.directories.isEmpty()) {
            return contents;
        }
        f$$ExternalSyntheticLambda0.m("Image did not contain any directories.");
        return null;
    }

    private void readDirectories(ByteSource byteSource, FormatCompliance formatCompliance, Listener listener) {
        TiffHeader readTiffHeader = readTiffHeader(byteSource);
        if (listener.setTiffHeader(readTiffHeader)) {
            readDirectory(byteSource, readTiffHeader.offsetToFirstIFD, 0, formatCompliance, listener, new ArrayList());
        }
    }

    public static class Collector implements Listener {
        private final List<TiffDirectory> directories;
        private final List<TiffField> fields;
        private final boolean readThumbnails;
        private TiffHeader tiffHeader;

        public Collector(Map<String, Object> map) {
            this.directories = new ArrayList();
            this.fields = new ArrayList();
            this.readThumbnails = (map == null || !map.containsKey(ImagingConstants.PARAM_KEY_READ_THUMBNAILS)) ? true : Boolean.TRUE.equals(map.get(ImagingConstants.PARAM_KEY_READ_THUMBNAILS));
        }

        @Override // org.apache.commons.imaging.formats.tiff.TiffReader.Listener
        public boolean addDirectory(TiffDirectory tiffDirectory) {
            this.directories.add(tiffDirectory);
            return true;
        }

        @Override // org.apache.commons.imaging.formats.tiff.TiffReader.Listener
        public boolean addField(TiffField tiffField) {
            this.fields.add(tiffField);
            return true;
        }

        public TiffContents getContents() {
            return new TiffContents(this.tiffHeader, this.directories, this.fields);
        }

        @Override // org.apache.commons.imaging.formats.tiff.TiffReader.Listener
        public boolean readImageData() {
            return this.readThumbnails;
        }

        @Override // org.apache.commons.imaging.formats.tiff.TiffReader.Listener
        public boolean readOffsetDirectories() {
            return true;
        }

        @Override // org.apache.commons.imaging.formats.tiff.TiffReader.Listener
        public boolean setTiffHeader(TiffHeader tiffHeader) {
            this.tiffHeader = tiffHeader;
            return true;
        }

        public Collector() {
            this(null);
        }
    }

    private TiffHeader readTiffHeader(ByteSource byteSource) {
        InputStream inputStream = byteSource.getInputStream();
        try {
            TiffHeader readTiffHeader = readTiffHeader(inputStream);
            if (inputStream != null) {
                inputStream.close();
            }
            return readTiffHeader;
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

    private boolean readDirectory(ByteSource byteSource, long j, int i, FormatCompliance formatCompliance, Listener listener, List<Number> list) {
        return readDirectory(byteSource, j, i, formatCompliance, listener, false, list);
    }
}
