package org.apache.commons.imaging.formats.tiff;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.awt.image.BufferedImage;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;
import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.common.ByteConversions;
import org.apache.commons.imaging.common.RationalNumber;
import org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryConstants;
import org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants;
import org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfo;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoBytes;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDouble;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDoubles;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoFloat;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoFloats;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoGpsText;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLong;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRational;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRationals;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSByte;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSBytes;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSLong;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSLongs;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRational;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSShort;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSShorts;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLong;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShorts;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoXpString;
import org.bouncycastle.asn1.cmc.GetCert$$ExternalSyntheticOutline0;

/* loaded from: classes9.dex */
public class TiffDirectory extends TiffElement {
    public final List<TiffField> entries;
    private final ByteOrder headerByteOrder;
    private JpegImageData jpegImageData;
    public final long nextDirectoryOffset;
    private TiffImageData tiffImageData;

    /* renamed from: type, reason: collision with root package name */
    public final int f1555type;

    public static final class ImageDataElement extends TiffElement {
        public ImageDataElement(long j, int i) {
            super(j, i);
        }

        @Override // org.apache.commons.imaging.formats.tiff.TiffElement
        public String getElementDescription() {
            return "ImageDataElement";
        }
    }

    public TiffDirectory(int i, List<TiffField> list, long j, long j2, ByteOrder byteOrder) {
        super(j, (list.size() * 12) + 6);
        this.f1555type = i;
        this.entries = Collections.unmodifiableList(list);
        this.nextDirectoryOffset = j2;
        this.headerByteOrder = byteOrder;
    }

    public static String description(int i) {
        switch (i) {
            case TiffDirectoryConstants.DIRECTORY_TYPE_INTEROPERABILITY /* -4 */:
                return "Interoperability";
            case TiffDirectoryConstants.DIRECTORY_TYPE_GPS /* -3 */:
                return "Gps";
            case TiffDirectoryConstants.DIRECTORY_TYPE_EXIF /* -2 */:
                return "Exif";
            case -1:
                return "Unknown";
            case 0:
                return "Root";
            case 1:
                return "Sub";
            case 2:
                return "Thumbnail";
            default:
                return "Bad Type";
        }
    }

    private List<ImageDataElement> getRawImageDataElements(TiffField tiffField, TiffField tiffField2) {
        int[] intArrayValue = tiffField.getIntArrayValue();
        int[] intArrayValue2 = tiffField2.getIntArrayValue();
        if (intArrayValue.length != intArrayValue2.length) {
            StringBuilder sb = new StringBuilder("offsets.length(");
            sb.append(intArrayValue.length);
            sb.append(") != byteCounts.length(");
            throw new ImageReadException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(intArrayValue2.length, ")", sb));
        }
        ArrayList arrayList = new ArrayList(intArrayValue.length);
        for (int i = 0; i < intArrayValue.length; i++) {
            arrayList.add(new ImageDataElement(intArrayValue[i], intArrayValue2[i]));
        }
        return arrayList;
    }

    public void dump() {
        Iterator<TiffField> it = this.entries.iterator();
        while (it.hasNext()) {
            it.next().dump();
        }
    }

    public TiffField findField(TagInfo tagInfo, boolean z) {
        List<TiffField> list = this.entries;
        if (list == null) {
            return null;
        }
        for (TiffField tiffField : list) {
            if (tiffField.getTag() == tagInfo.tag) {
                return tiffField;
            }
        }
        if (!z) {
            return null;
        }
        throw new ImageReadException("Missing expected field: " + tagInfo.getDescription());
    }

    public List<TiffField> getDirectoryEntries() {
        return new ArrayList(this.entries);
    }

    @Override // org.apache.commons.imaging.formats.tiff.TiffElement
    public String getElementDescription() {
        long j = this.offset + 2;
        StringBuilder sb = new StringBuilder();
        for (TiffField tiffField : this.entries) {
            sb.append(String.format("\t[%d]: %s (%d, 0x%x), %s, %d: %s%n", Long.valueOf(j), tiffField.getTagInfo().name, Integer.valueOf(tiffField.getTag()), Integer.valueOf(tiffField.getTag()), tiffField.getFieldType().getName(), Integer.valueOf(tiffField.getBytesLength()), tiffField.getValueDescription()));
            j += 12;
        }
        return sb.toString();
    }

    public short getFieldValue(TagInfoShort tagInfoShort) {
        TiffField findField = findField(tagInfoShort);
        if (findField == null) {
            throw new ImageReadException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder("Required field \""), tagInfoShort.name, "\" is missing"));
        }
        if (!tagInfoShort.dataTypes.contains(findField.getFieldType())) {
            throw new ImageReadException(GetCert$$ExternalSyntheticOutline0.m(new StringBuilder("Required field \""), tagInfoShort.name, "\" has incorrect type ", findField));
        }
        if (findField.getCount() == 1) {
            return tagInfoShort.getValue(findField.getByteOrder(), findField.getByteArrayValue());
        }
        throw new ImageReadException("Field \"" + tagInfoShort.name + "\" has wrong count " + findField.getCount());
    }

    public TiffRasterData getFloatingPointRasterData(Map<String, Object> map) {
        return new TiffImageParser().getFloatingPointRasterData(this, this.headerByteOrder, map);
    }

    public JpegImageData getJpegImageData() {
        return this.jpegImageData;
    }

    public ImageDataElement getJpegRawImageDataElement() {
        TiffField findField = findField(TiffTagConstants.TIFF_TAG_JPEG_INTERCHANGE_FORMAT);
        TiffField findField2 = findField(TiffTagConstants.TIFF_TAG_JPEG_INTERCHANGE_FORMAT_LENGTH);
        if (findField == null || findField2 == null) {
            f$$ExternalSyntheticLambda0.m("Couldn't find image data.");
            return null;
        }
        return new ImageDataElement(findField.getIntArrayValue()[0], findField2.getIntArrayValue()[0]);
    }

    public String getSingleFieldValue(TagInfoAscii tagInfoAscii) {
        String[] fieldValue = getFieldValue(tagInfoAscii, true);
        if (fieldValue.length == 1) {
            return fieldValue[0];
        }
        throw new ImageReadException("Field \"" + tagInfoAscii.name + "\" has incorrect length " + fieldValue.length);
    }

    public BufferedImage getTiffImage() {
        if (this.tiffImageData == null) {
            return null;
        }
        return new TiffImageParser().getBufferedImage(this, this.headerByteOrder, null);
    }

    public TiffImageData getTiffImageData() {
        return this.tiffImageData;
    }

    public List<ImageDataElement> getTiffRawImageDataElements() {
        TiffField findField = findField(TiffTagConstants.TIFF_TAG_TILE_OFFSETS);
        TiffField findField2 = findField(TiffTagConstants.TIFF_TAG_TILE_BYTE_COUNTS);
        TiffField findField3 = findField(TiffTagConstants.TIFF_TAG_STRIP_OFFSETS);
        TiffField findField4 = findField(TiffTagConstants.TIFF_TAG_STRIP_BYTE_COUNTS);
        if (findField != null && findField2 != null) {
            return getRawImageDataElements(findField, findField2);
        }
        if (findField3 != null && findField4 != null) {
            return getRawImageDataElements(findField3, findField4);
        }
        f$$ExternalSyntheticLambda0.m("Couldn't find image data.");
        return null;
    }

    public boolean hasJpegImageData() {
        return findField(TiffTagConstants.TIFF_TAG_JPEG_INTERCHANGE_FORMAT) != null;
    }

    public boolean hasTiffFloatingPointRasterData() {
        short[] fieldValue;
        return hasTiffImageData() && (fieldValue = getFieldValue(TiffTagConstants.TIFF_TAG_SAMPLE_FORMAT, false)) != null && fieldValue.length > 0 && fieldValue[0] == 3;
    }

    public boolean hasTiffImageData() {
        return (findField(TiffTagConstants.TIFF_TAG_TILE_OFFSETS) == null && findField(TiffTagConstants.TIFF_TAG_STRIP_OFFSETS) == null) ? false : true;
    }

    public boolean imageDataInStrips() {
        TiffField findField = findField(TiffTagConstants.TIFF_TAG_TILE_OFFSETS);
        TiffField findField2 = findField(TiffTagConstants.TIFF_TAG_TILE_BYTE_COUNTS);
        TiffField findField3 = findField(TiffTagConstants.TIFF_TAG_STRIP_OFFSETS);
        TiffField findField4 = findField(TiffTagConstants.TIFF_TAG_STRIP_BYTE_COUNTS);
        if (findField != null && findField2 != null) {
            return false;
        }
        if (findField3 != null && findField4 != null) {
            return true;
        }
        f$$ExternalSyntheticLambda0.m("Couldn't find image data.");
        return false;
    }

    public void setJpegImageData(JpegImageData jpegImageData) {
        this.jpegImageData = jpegImageData;
    }

    public void setTiffImageData(TiffImageData tiffImageData) {
        this.tiffImageData = tiffImageData;
    }

    public BufferedImage getTiffImage(Map<String, Object> map) {
        if (this.tiffImageData == null) {
            return null;
        }
        return new TiffImageParser().getBufferedImage(this, this.headerByteOrder, map);
    }

    public BufferedImage getTiffImage(ByteOrder byteOrder) {
        return getTiffImage(byteOrder, null);
    }

    public BufferedImage getTiffImage(ByteOrder byteOrder, Map<String, Object> map) {
        if (this.tiffImageData == null) {
            return null;
        }
        return new TiffImageParser().getBufferedImage(this, byteOrder, map);
    }

    public String description() {
        return description(this.f1555type);
    }

    public int getSingleFieldValue(TagInfoShortOrLong tagInfoShortOrLong) {
        int[] fieldValue = getFieldValue(tagInfoShortOrLong, true);
        if (fieldValue.length == 1) {
            return fieldValue[0];
        }
        throw new ImageReadException("Field \"" + tagInfoShortOrLong.name + "\" has incorrect length " + fieldValue.length);
    }

    public TiffField findField(TagInfo tagInfo) {
        return findField(tagInfo, false);
    }

    public byte getFieldValue(TagInfoByte tagInfoByte) {
        TiffField findField = findField(tagInfoByte);
        if (findField != null) {
            if (!tagInfoByte.dataTypes.contains(findField.getFieldType())) {
                throw new ImageReadException(GetCert$$ExternalSyntheticOutline0.m(new StringBuilder("Required field \""), tagInfoByte.name, "\" has incorrect type ", findField));
            }
            if (findField.getCount() == 1) {
                return findField.getByteArrayValue()[0];
            }
            throw new ImageReadException("Field \"" + tagInfoByte.name + "\" has wrong count " + findField.getCount());
        }
        throw new ImageReadException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder("Required field \""), tagInfoByte.name, "\" is missing"));
    }

    public byte[] getFieldValue(TagInfoBytes tagInfoBytes, boolean z) {
        TiffField findField = findField(tagInfoBytes);
        if (findField == null) {
            if (z) {
                throw new ImageReadException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder("Required field \""), tagInfoBytes.name, "\" is missing"));
            }
            return null;
        }
        if (tagInfoBytes.dataTypes.contains(findField.getFieldType())) {
            return findField.getByteArrayValue();
        }
        if (z) {
            throw new ImageReadException(GetCert$$ExternalSyntheticOutline0.m(new StringBuilder("Required field \""), tagInfoBytes.name, "\" has incorrect type ", findField));
        }
        return null;
    }

    public String[] getFieldValue(TagInfoAscii tagInfoAscii, boolean z) {
        TiffField findField = findField(tagInfoAscii);
        if (findField == null) {
            if (z) {
                throw new ImageReadException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder("Required field \""), tagInfoAscii.name, "\" is missing"));
            }
            return null;
        }
        if (tagInfoAscii.dataTypes.contains(findField.getFieldType())) {
            return tagInfoAscii.getValue(findField.getByteOrder(), findField.getByteArrayValue());
        }
        if (z) {
            throw new ImageReadException(GetCert$$ExternalSyntheticOutline0.m(new StringBuilder("Required field \""), tagInfoAscii.name, "\" has incorrect type ", findField));
        }
        return null;
    }

    public Object getFieldValue(TagInfo tagInfo) {
        TiffField findField = findField(tagInfo);
        if (findField == null) {
            return null;
        }
        return findField.getValue();
    }

    public short[] getFieldValue(TagInfoShorts tagInfoShorts, boolean z) {
        TiffField findField = findField(tagInfoShorts);
        if (findField == null) {
            if (z) {
                throw new ImageReadException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder("Required field \""), tagInfoShorts.name, "\" is missing"));
            }
            return null;
        }
        if (tagInfoShorts.dataTypes.contains(findField.getFieldType())) {
            return tagInfoShorts.getValue(findField.getByteOrder(), findField.getByteArrayValue());
        }
        if (z) {
            throw new ImageReadException(GetCert$$ExternalSyntheticOutline0.m(new StringBuilder("Required field \""), tagInfoShorts.name, "\" has incorrect type ", findField));
        }
        return null;
    }

    public int getFieldValue(TagInfoLong tagInfoLong) {
        TiffField findField = findField(tagInfoLong);
        if (findField != null) {
            if (!tagInfoLong.dataTypes.contains(findField.getFieldType())) {
                throw new ImageReadException(GetCert$$ExternalSyntheticOutline0.m(new StringBuilder("Required field \""), tagInfoLong.name, "\" has incorrect type ", findField));
            }
            if (findField.getCount() == 1) {
                return tagInfoLong.getValue(findField.getByteOrder(), findField.getByteArrayValue());
            }
            throw new ImageReadException("Field \"" + tagInfoLong.name + "\" has wrong count " + findField.getCount());
        }
        throw new ImageReadException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder("Required field \""), tagInfoLong.name, "\" is missing"));
    }

    public int[] getFieldValue(TagInfoLongs tagInfoLongs, boolean z) {
        TiffField findField = findField(tagInfoLongs);
        if (findField == null) {
            if (z) {
                throw new ImageReadException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder("Required field \""), tagInfoLongs.name, "\" is missing"));
            }
            return null;
        }
        if (tagInfoLongs.dataTypes.contains(findField.getFieldType())) {
            return tagInfoLongs.getValue(findField.getByteOrder(), findField.getByteArrayValue());
        }
        if (z) {
            throw new ImageReadException(GetCert$$ExternalSyntheticOutline0.m(new StringBuilder("Required field \""), tagInfoLongs.name, "\" has incorrect type ", findField));
        }
        return null;
    }

    public int[] getFieldValue(TagInfoShortOrLong tagInfoShortOrLong, boolean z) {
        TiffField findField = findField(tagInfoShortOrLong);
        if (findField == null) {
            if (z) {
                throw new ImageReadException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder("Required field \""), tagInfoShortOrLong.name, "\" is missing"));
            }
            return null;
        }
        if (!tagInfoShortOrLong.dataTypes.contains(findField.getFieldType())) {
            if (z) {
                throw new ImageReadException(GetCert$$ExternalSyntheticOutline0.m(new StringBuilder("Required field \""), tagInfoShortOrLong.name, "\" has incorrect type ", findField));
            }
            return null;
        }
        byte[] byteArrayValue = findField.getByteArrayValue();
        if (findField.getFieldType() == FieldType.SHORT) {
            return ByteConversions.toUInt16s(byteArrayValue, findField.getByteOrder());
        }
        return ByteConversions.toInts(byteArrayValue, findField.getByteOrder());
    }

    public RationalNumber getFieldValue(TagInfoRational tagInfoRational) {
        TiffField findField = findField(tagInfoRational);
        if (findField != null) {
            if (!tagInfoRational.dataTypes.contains(findField.getFieldType())) {
                throw new ImageReadException(GetCert$$ExternalSyntheticOutline0.m(new StringBuilder("Required field \""), tagInfoRational.name, "\" has incorrect type ", findField));
            }
            if (findField.getCount() == 1) {
                return tagInfoRational.getValue(findField.getByteOrder(), findField.getByteArrayValue());
            }
            throw new ImageReadException("Field \"" + tagInfoRational.name + "\" has wrong count " + findField.getCount());
        }
        throw new ImageReadException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder("Required field \""), tagInfoRational.name, "\" is missing"));
    }

    public RationalNumber[] getFieldValue(TagInfoRationals tagInfoRationals, boolean z) {
        TiffField findField = findField(tagInfoRationals);
        if (findField == null) {
            if (z) {
                throw new ImageReadException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder("Required field \""), tagInfoRationals.name, "\" is missing"));
            }
            return null;
        }
        if (tagInfoRationals.dataTypes.contains(findField.getFieldType())) {
            return tagInfoRationals.getValue(findField.getByteOrder(), findField.getByteArrayValue());
        }
        if (z) {
            throw new ImageReadException(GetCert$$ExternalSyntheticOutline0.m(new StringBuilder("Required field \""), tagInfoRationals.name, "\" has incorrect type ", findField));
        }
        return null;
    }

    public byte getFieldValue(TagInfoSByte tagInfoSByte) {
        TiffField findField = findField(tagInfoSByte);
        if (findField != null) {
            if (!tagInfoSByte.dataTypes.contains(findField.getFieldType())) {
                throw new ImageReadException(GetCert$$ExternalSyntheticOutline0.m(new StringBuilder("Required field \""), tagInfoSByte.name, "\" has incorrect type ", findField));
            }
            if (findField.getCount() == 1) {
                return findField.getByteArrayValue()[0];
            }
            throw new ImageReadException("Field \"" + tagInfoSByte.name + "\" has wrong count " + findField.getCount());
        }
        throw new ImageReadException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder("Required field \""), tagInfoSByte.name, "\" is missing"));
    }

    public byte[] getFieldValue(TagInfoSBytes tagInfoSBytes, boolean z) {
        TiffField findField = findField(tagInfoSBytes);
        if (findField == null) {
            if (z) {
                throw new ImageReadException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder("Required field \""), tagInfoSBytes.name, "\" is missing"));
            }
            return null;
        }
        if (tagInfoSBytes.dataTypes.contains(findField.getFieldType())) {
            return findField.getByteArrayValue();
        }
        if (z) {
            throw new ImageReadException(GetCert$$ExternalSyntheticOutline0.m(new StringBuilder("Required field \""), tagInfoSBytes.name, "\" has incorrect type ", findField));
        }
        return null;
    }

    public short getFieldValue(TagInfoSShort tagInfoSShort) {
        TiffField findField = findField(tagInfoSShort);
        if (findField != null) {
            if (!tagInfoSShort.dataTypes.contains(findField.getFieldType())) {
                throw new ImageReadException(GetCert$$ExternalSyntheticOutline0.m(new StringBuilder("Required field \""), tagInfoSShort.name, "\" has incorrect type ", findField));
            }
            if (findField.getCount() == 1) {
                return tagInfoSShort.getValue(findField.getByteOrder(), findField.getByteArrayValue());
            }
            throw new ImageReadException("Field \"" + tagInfoSShort.name + "\" has wrong count " + findField.getCount());
        }
        throw new ImageReadException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder("Required field \""), tagInfoSShort.name, "\" is missing"));
    }

    public short[] getFieldValue(TagInfoSShorts tagInfoSShorts, boolean z) {
        TiffField findField = findField(tagInfoSShorts);
        if (findField == null) {
            if (z) {
                throw new ImageReadException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder("Required field \""), tagInfoSShorts.name, "\" is missing"));
            }
            return null;
        }
        if (tagInfoSShorts.dataTypes.contains(findField.getFieldType())) {
            return tagInfoSShorts.getValue(findField.getByteOrder(), findField.getByteArrayValue());
        }
        if (z) {
            throw new ImageReadException(GetCert$$ExternalSyntheticOutline0.m(new StringBuilder("Required field \""), tagInfoSShorts.name, "\" has incorrect type ", findField));
        }
        return null;
    }

    public int getFieldValue(TagInfoSLong tagInfoSLong) {
        TiffField findField = findField(tagInfoSLong);
        if (findField != null) {
            if (!tagInfoSLong.dataTypes.contains(findField.getFieldType())) {
                throw new ImageReadException(GetCert$$ExternalSyntheticOutline0.m(new StringBuilder("Required field \""), tagInfoSLong.name, "\" has incorrect type ", findField));
            }
            if (findField.getCount() == 1) {
                return tagInfoSLong.getValue(findField.getByteOrder(), findField.getByteArrayValue());
            }
            throw new ImageReadException("Field \"" + tagInfoSLong.name + "\" has wrong count " + findField.getCount());
        }
        throw new ImageReadException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder("Required field \""), tagInfoSLong.name, "\" is missing"));
    }

    public int[] getFieldValue(TagInfoSLongs tagInfoSLongs, boolean z) {
        TiffField findField = findField(tagInfoSLongs);
        if (findField == null) {
            if (z) {
                throw new ImageReadException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder("Required field \""), tagInfoSLongs.name, "\" is missing"));
            }
            return null;
        }
        if (tagInfoSLongs.dataTypes.contains(findField.getFieldType())) {
            return tagInfoSLongs.getValue(findField.getByteOrder(), findField.getByteArrayValue());
        }
        if (z) {
            throw new ImageReadException(GetCert$$ExternalSyntheticOutline0.m(new StringBuilder("Required field \""), tagInfoSLongs.name, "\" has incorrect type ", findField));
        }
        return null;
    }

    public RationalNumber getFieldValue(TagInfoSRational tagInfoSRational) {
        TiffField findField = findField(tagInfoSRational);
        if (findField != null) {
            if (!tagInfoSRational.dataTypes.contains(findField.getFieldType())) {
                throw new ImageReadException(GetCert$$ExternalSyntheticOutline0.m(new StringBuilder("Required field \""), tagInfoSRational.name, "\" has incorrect type ", findField));
            }
            if (findField.getCount() == 1) {
                return tagInfoSRational.getValue(findField.getByteOrder(), findField.getByteArrayValue());
            }
            throw new ImageReadException("Field \"" + tagInfoSRational.name + "\" has wrong count " + findField.getCount());
        }
        throw new ImageReadException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder("Required field \""), tagInfoSRational.name, "\" is missing"));
    }

    public RationalNumber[] getFieldValue(TagInfoSRationals tagInfoSRationals, boolean z) {
        TiffField findField = findField(tagInfoSRationals);
        if (findField == null) {
            if (z) {
                throw new ImageReadException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder("Required field \""), tagInfoSRationals.name, "\" is missing"));
            }
            return null;
        }
        if (tagInfoSRationals.dataTypes.contains(findField.getFieldType())) {
            return tagInfoSRationals.getValue(findField.getByteOrder(), findField.getByteArrayValue());
        }
        if (z) {
            throw new ImageReadException(GetCert$$ExternalSyntheticOutline0.m(new StringBuilder("Required field \""), tagInfoSRationals.name, "\" has incorrect type ", findField));
        }
        return null;
    }

    public float getFieldValue(TagInfoFloat tagInfoFloat) {
        TiffField findField = findField(tagInfoFloat);
        if (findField != null) {
            if (!tagInfoFloat.dataTypes.contains(findField.getFieldType())) {
                throw new ImageReadException(GetCert$$ExternalSyntheticOutline0.m(new StringBuilder("Required field \""), tagInfoFloat.name, "\" has incorrect type ", findField));
            }
            if (findField.getCount() == 1) {
                return tagInfoFloat.getValue(findField.getByteOrder(), findField.getByteArrayValue());
            }
            throw new ImageReadException("Field \"" + tagInfoFloat.name + "\" has wrong count " + findField.getCount());
        }
        throw new ImageReadException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder("Required field \""), tagInfoFloat.name, "\" is missing"));
    }

    public float[] getFieldValue(TagInfoFloats tagInfoFloats, boolean z) {
        TiffField findField = findField(tagInfoFloats);
        if (findField == null) {
            if (z) {
                throw new ImageReadException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder("Required field \""), tagInfoFloats.name, "\" is missing"));
            }
            return null;
        }
        if (tagInfoFloats.dataTypes.contains(findField.getFieldType())) {
            return tagInfoFloats.getValue(findField.getByteOrder(), findField.getByteArrayValue());
        }
        if (z) {
            throw new ImageReadException(GetCert$$ExternalSyntheticOutline0.m(new StringBuilder("Required field \""), tagInfoFloats.name, "\" has incorrect type ", findField));
        }
        return null;
    }

    public double getFieldValue(TagInfoDouble tagInfoDouble) {
        TiffField findField = findField(tagInfoDouble);
        if (findField != null) {
            if (!tagInfoDouble.dataTypes.contains(findField.getFieldType())) {
                throw new ImageReadException(GetCert$$ExternalSyntheticOutline0.m(new StringBuilder("Required field \""), tagInfoDouble.name, "\" has incorrect type ", findField));
            }
            if (findField.getCount() == 1) {
                return tagInfoDouble.getValue(findField.getByteOrder(), findField.getByteArrayValue());
            }
            throw new ImageReadException("Field \"" + tagInfoDouble.name + "\" has wrong count " + findField.getCount());
        }
        throw new ImageReadException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder("Required field \""), tagInfoDouble.name, "\" is missing"));
    }

    public double[] getFieldValue(TagInfoDoubles tagInfoDoubles, boolean z) {
        TiffField findField = findField(tagInfoDoubles);
        if (findField == null) {
            if (z) {
                throw new ImageReadException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder("Required field \""), tagInfoDoubles.name, "\" is missing"));
            }
            return null;
        }
        if (tagInfoDoubles.dataTypes.contains(findField.getFieldType())) {
            return tagInfoDoubles.getValue(findField.getByteOrder(), findField.getByteArrayValue());
        }
        if (z) {
            throw new ImageReadException(GetCert$$ExternalSyntheticOutline0.m(new StringBuilder("Required field \""), tagInfoDoubles.name, "\" has incorrect type ", findField));
        }
        return null;
    }

    public String getFieldValue(TagInfoGpsText tagInfoGpsText, boolean z) {
        TiffField findField = findField(tagInfoGpsText);
        if (findField != null) {
            return tagInfoGpsText.getValue(findField);
        }
        if (z) {
            throw new ImageReadException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder("Required field \""), tagInfoGpsText.name, "\" is missing"));
        }
        return null;
    }

    public String getFieldValue(TagInfoXpString tagInfoXpString, boolean z) {
        TiffField findField = findField(tagInfoXpString);
        if (findField != null) {
            return tagInfoXpString.getValue(findField);
        }
        if (z) {
            throw new ImageReadException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder("Required field \""), tagInfoXpString.name, "\" is missing"));
        }
        return null;
    }
}
