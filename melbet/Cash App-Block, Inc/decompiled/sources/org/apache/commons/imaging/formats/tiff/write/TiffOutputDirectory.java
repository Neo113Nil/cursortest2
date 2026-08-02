package org.apache.commons.imaging.formats.tiff.write;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.imaging.ImageWriteException;
import org.apache.commons.imaging.common.BinaryOutputStream;
import org.apache.commons.imaging.common.RationalNumber;
import org.apache.commons.imaging.formats.tiff.JpegImageData;
import org.apache.commons.imaging.formats.tiff.TiffDirectory;
import org.apache.commons.imaging.formats.tiff.TiffElement;
import org.apache.commons.imaging.formats.tiff.TiffImageData;
import org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType;
import org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants;
import org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType;
import org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeAscii;
import org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeByte;
import org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeLong;
import org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeRational;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfo;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAsciiOrByte;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAsciiOrRational;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByteOrShort;
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
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLongOrRational;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrRational;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShorts;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoXpString;
import org.apache.commons.imaging.formats.tiff.write.TiffOutputItem;

/* loaded from: classes9.dex */
public final class TiffOutputDirectory extends TiffOutputItem {
    public static final Comparator<TiffOutputDirectory> COMPARATOR = new TiffOutputDirectory$$ExternalSyntheticLambda0(0);
    private final ByteOrder byteOrder;
    private final List<TiffOutputField> fields = new ArrayList();
    private JpegImageData jpegImageData;
    private TiffOutputDirectory nextDirectory;
    private TiffImageData tiffImageData;

    /* renamed from: type, reason: collision with root package name */
    public final int f1558type;

    public TiffOutputDirectory(int i, ByteOrder byteOrder) {
        this.f1558type = i;
        this.byteOrder = byteOrder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$sortFields$1(TiffOutputField tiffOutputField, TiffOutputField tiffOutputField2) {
        int i = tiffOutputField.tag;
        int i2 = tiffOutputField2.tag;
        return i != i2 ? i - i2 : tiffOutputField.getSortHint() - tiffOutputField2.getSortHint();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$static$0(TiffOutputDirectory tiffOutputDirectory, TiffOutputDirectory tiffOutputDirectory2) {
        int i = tiffOutputDirectory.f1558type;
        int i2 = tiffOutputDirectory2.f1558type;
        if (i < i2) {
            return -1;
        }
        return i > i2 ? 1 : 0;
    }

    private void removeFieldIfPresent(TagInfo tagInfo) {
        TiffOutputField findField = findField(tagInfo);
        if (findField != null) {
            this.fields.remove(findField);
        }
    }

    public void add(TagInfoBytes tagInfoBytes, byte... bArr) {
        int i = tagInfoBytes.length;
        if (i <= 0 || i == bArr.length) {
            add(new TiffOutputField(tagInfoBytes.tag, tagInfoBytes, FieldType.BYTE, bArr.length, tagInfoBytes.encodeValue(this.byteOrder, bArr)));
            return;
        }
        throw new ImageWriteException("Tag expects " + tagInfoBytes.length + " value(s), not " + bArr.length);
    }

    public String description() {
        return TiffDirectory.description(this.f1558type);
    }

    public TiffOutputField findField(int i) {
        for (TiffOutputField tiffOutputField : this.fields) {
            if (tiffOutputField.tag == i) {
                return tiffOutputField;
            }
        }
        return null;
    }

    public List<TiffOutputField> getFields() {
        return new ArrayList(this.fields);
    }

    @Override // org.apache.commons.imaging.formats.tiff.write.TiffOutputItem
    public String getItemDescription() {
        TiffDirectoryType exifDirectoryType = TiffDirectoryType.getExifDirectoryType(this.f1558type);
        StringBuilder sb = new StringBuilder("Directory: ");
        sb.append(exifDirectoryType.name);
        sb.append(" (");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.f1558type, ")", sb);
    }

    @Override // org.apache.commons.imaging.formats.tiff.write.TiffOutputItem
    public int getItemLength() {
        return (this.fields.size() * 12) + 6;
    }

    public List<TiffOutputItem> getOutputItems(TiffOutputSummary tiffOutputSummary) {
        TiffOutputField tiffOutputField;
        TagInfoLong tagInfoLong = TiffTagConstants.TIFF_TAG_JPEG_INTERCHANGE_FORMAT;
        removeFieldIfPresent(tagInfoLong);
        TagInfoLong tagInfoLong2 = TiffTagConstants.TIFF_TAG_JPEG_INTERCHANGE_FORMAT_LENGTH;
        removeFieldIfPresent(tagInfoLong2);
        ImageDataOffsets imageDataOffsets = null;
        if (this.jpegImageData != null) {
            FieldTypeLong fieldTypeLong = FieldType.LONG;
            tiffOutputField = new TiffOutputField(tagInfoLong, fieldTypeLong, 1, new byte[4]);
            add(tiffOutputField);
            add(new TiffOutputField(tagInfoLong2, fieldTypeLong, 1, fieldTypeLong.writeData(Integer.valueOf(this.jpegImageData.length), tiffOutputSummary.byteOrder)));
        } else {
            tiffOutputField = null;
        }
        TagInfo tagInfo = TiffTagConstants.TIFF_TAG_STRIP_OFFSETS;
        removeFieldIfPresent(tagInfo);
        TagInfoShortOrLong tagInfoShortOrLong = TiffTagConstants.TIFF_TAG_STRIP_BYTE_COUNTS;
        removeFieldIfPresent(tagInfoShortOrLong);
        TagInfoLongs tagInfoLongs = TiffTagConstants.TIFF_TAG_TILE_OFFSETS;
        removeFieldIfPresent(tagInfoLongs);
        TagInfoShortOrLong tagInfoShortOrLong2 = TiffTagConstants.TIFF_TAG_TILE_BYTE_COUNTS;
        removeFieldIfPresent(tagInfoShortOrLong2);
        TiffImageData tiffImageData = this.tiffImageData;
        if (tiffImageData != null) {
            if (!tiffImageData.stripsNotTiles()) {
                tagInfo = tagInfoLongs;
                tagInfoShortOrLong = tagInfoShortOrLong2;
            }
            TiffElement.DataElement[] imageData = this.tiffImageData.getImageData();
            int length = imageData.length;
            int[] iArr = new int[length];
            int length2 = imageData.length;
            int[] iArr2 = new int[length2];
            for (int i = 0; i < imageData.length; i++) {
                iArr2[i] = imageData[i].length;
            }
            FieldTypeLong fieldTypeLong2 = FieldType.LONG;
            TiffOutputField tiffOutputField2 = new TiffOutputField(tagInfo, fieldTypeLong2, length, fieldTypeLong2.writeData(iArr, tiffOutputSummary.byteOrder));
            add(tiffOutputField2);
            add(new TiffOutputField(tagInfoShortOrLong, fieldTypeLong2, length2, fieldTypeLong2.writeData(iArr2, tiffOutputSummary.byteOrder)));
            imageDataOffsets = new ImageDataOffsets(imageData, iArr, tiffOutputField2);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this);
        sortFields();
        for (TiffOutputField tiffOutputField3 : this.fields) {
            if (!tiffOutputField3.isLocalValue()) {
                arrayList.add(tiffOutputField3.getSeperateValue());
            }
        }
        if (imageDataOffsets != null) {
            Collections.addAll(arrayList, imageDataOffsets.outputItems);
            tiffOutputSummary.addTiffImageData(imageDataOffsets);
        }
        JpegImageData jpegImageData = this.jpegImageData;
        if (jpegImageData != null) {
            TiffOutputItem.Value value = new TiffOutputItem.Value("JPEG image data", jpegImageData.getData());
            arrayList.add(value);
            tiffOutputSummary.add(value, tiffOutputField);
        }
        return arrayList;
    }

    public JpegImageData getRawJpegImageData() {
        return this.jpegImageData;
    }

    public TiffImageData getRawTiffImageData() {
        return this.tiffImageData;
    }

    public void removeField(int i) {
        ArrayList arrayList = new ArrayList();
        for (TiffOutputField tiffOutputField : this.fields) {
            if (tiffOutputField.tag == i) {
                arrayList.add(tiffOutputField);
            }
        }
        this.fields.removeAll(arrayList);
    }

    public void setJpegImageData(JpegImageData jpegImageData) {
        this.jpegImageData = jpegImageData;
    }

    public void setNextDirectory(TiffOutputDirectory tiffOutputDirectory) {
        this.nextDirectory = tiffOutputDirectory;
    }

    public void setTiffImageData(TiffImageData tiffImageData) {
        this.tiffImageData = tiffImageData;
    }

    public void sortFields() {
        Collections.sort(this.fields, new TiffOutputDirectory$$ExternalSyntheticLambda0(3));
    }

    @Override // org.apache.commons.imaging.formats.tiff.write.TiffOutputItem
    public void writeItem(BinaryOutputStream binaryOutputStream) {
        binaryOutputStream.write2Bytes(this.fields.size());
        Iterator<TiffOutputField> it = this.fields.iterator();
        while (it.hasNext()) {
            it.next().writeField(binaryOutputStream);
        }
        TiffOutputDirectory tiffOutputDirectory = this.nextDirectory;
        long offset = tiffOutputDirectory != null ? tiffOutputDirectory.getOffset() : 0L;
        if (offset == -1) {
            binaryOutputStream.write4Bytes(0);
        } else {
            binaryOutputStream.write4Bytes((int) offset);
        }
    }

    public TiffOutputField findField(TagInfo tagInfo) {
        return findField(tagInfo.tag);
    }

    public void removeField(TagInfo tagInfo) {
        removeField(tagInfo.tag);
    }

    public void add(TagInfoByte tagInfoByte, byte b) {
        if (tagInfoByte.length == 1) {
            byte[] encodeValue = tagInfoByte.encodeValue(this.byteOrder, b);
            add(new TiffOutputField(tagInfoByte.tag, tagInfoByte, FieldType.BYTE, encodeValue.length, encodeValue));
        } else {
            throw new ImageWriteException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(tagInfoByte.length, " value(s), not 1", new StringBuilder("Tag expects ")));
        }
    }

    public void add(TagInfoAscii tagInfoAscii, String... strArr) {
        byte[] encodeValue = tagInfoAscii.encodeValue(this.byteOrder, strArr);
        int i = tagInfoAscii.length;
        if (i > 0 && i != encodeValue.length) {
            throw new ImageWriteException("Tag expects " + tagInfoAscii.length + " byte(s), not " + strArr.length);
        }
        add(new TiffOutputField(tagInfoAscii.tag, tagInfoAscii, FieldType.ASCII, encodeValue.length, encodeValue));
    }

    public void add(TagInfoShort tagInfoShort, short s) {
        if (tagInfoShort.length == 1) {
            add(new TiffOutputField(tagInfoShort.tag, tagInfoShort, FieldType.SHORT, 1, tagInfoShort.encodeValue(this.byteOrder, s)));
        } else {
            throw new ImageWriteException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(tagInfoShort.length, " value(s), not 1", new StringBuilder("Tag expects ")));
        }
    }

    public void add(TagInfoShorts tagInfoShorts, short... sArr) {
        int i = tagInfoShorts.length;
        if (i > 0 && i != sArr.length) {
            throw new ImageWriteException("Tag expects " + tagInfoShorts.length + " value(s), not " + sArr.length);
        }
        add(new TiffOutputField(tagInfoShorts.tag, tagInfoShorts, FieldType.SHORT, sArr.length, tagInfoShorts.encodeValue(this.byteOrder, sArr)));
    }

    public void add(TagInfoLong tagInfoLong, int i) {
        if (tagInfoLong.length == 1) {
            add(new TiffOutputField(tagInfoLong.tag, tagInfoLong, FieldType.LONG, 1, tagInfoLong.encodeValue(this.byteOrder, i)));
        } else {
            throw new ImageWriteException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(tagInfoLong.length, " value(s), not 1", new StringBuilder("Tag expects ")));
        }
    }

    public void add(TagInfoLongs tagInfoLongs, int... iArr) {
        int i = tagInfoLongs.length;
        if (i > 0 && i != iArr.length) {
            throw new ImageWriteException("Tag expects " + tagInfoLongs.length + " value(s), not " + iArr.length);
        }
        add(new TiffOutputField(tagInfoLongs.tag, tagInfoLongs, FieldType.LONG, iArr.length, tagInfoLongs.encodeValue(this.byteOrder, iArr)));
    }

    public void add(TagInfoRational tagInfoRational, RationalNumber rationalNumber) {
        if (tagInfoRational.length == 1) {
            add(new TiffOutputField(tagInfoRational.tag, tagInfoRational, FieldType.RATIONAL, 1, tagInfoRational.encodeValue(this.byteOrder, rationalNumber)));
        } else {
            throw new ImageWriteException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(tagInfoRational.length, " value(s), not 1", new StringBuilder("Tag expects ")));
        }
    }

    public void add(TagInfoRationals tagInfoRationals, RationalNumber... rationalNumberArr) {
        int i = tagInfoRationals.length;
        if (i > 0 && i != rationalNumberArr.length) {
            throw new ImageWriteException("Tag expects " + tagInfoRationals.length + " value(s), not " + rationalNumberArr.length);
        }
        add(new TiffOutputField(tagInfoRationals.tag, tagInfoRationals, FieldType.RATIONAL, rationalNumberArr.length, tagInfoRationals.encodeValue(this.byteOrder, rationalNumberArr)));
    }

    public void add(TagInfoSByte tagInfoSByte, byte b) {
        if (tagInfoSByte.length == 1) {
            add(new TiffOutputField(tagInfoSByte.tag, tagInfoSByte, FieldType.SBYTE, 1, tagInfoSByte.encodeValue(this.byteOrder, b)));
        } else {
            throw new ImageWriteException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(tagInfoSByte.length, " value(s), not 1", new StringBuilder("Tag expects ")));
        }
    }

    public void add(TagInfoSBytes tagInfoSBytes, byte... bArr) {
        int i = tagInfoSBytes.length;
        if (i > 0 && i != bArr.length) {
            throw new ImageWriteException("Tag expects " + tagInfoSBytes.length + " value(s), not " + bArr.length);
        }
        add(new TiffOutputField(tagInfoSBytes.tag, tagInfoSBytes, FieldType.SBYTE, bArr.length, tagInfoSBytes.encodeValue(this.byteOrder, bArr)));
    }

    public void add(TagInfoSShort tagInfoSShort, short s) {
        if (tagInfoSShort.length == 1) {
            add(new TiffOutputField(tagInfoSShort.tag, tagInfoSShort, FieldType.SSHORT, 1, tagInfoSShort.encodeValue(this.byteOrder, s)));
        } else {
            throw new ImageWriteException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(tagInfoSShort.length, " value(s), not 1", new StringBuilder("Tag expects ")));
        }
    }

    public void add(TagInfoSShorts tagInfoSShorts, short... sArr) {
        int i = tagInfoSShorts.length;
        if (i > 0 && i != sArr.length) {
            throw new ImageWriteException("Tag expects " + tagInfoSShorts.length + " value(s), not " + sArr.length);
        }
        add(new TiffOutputField(tagInfoSShorts.tag, tagInfoSShorts, FieldType.SSHORT, sArr.length, tagInfoSShorts.encodeValue(this.byteOrder, sArr)));
    }

    public void add(TagInfoSLong tagInfoSLong, int i) {
        if (tagInfoSLong.length == 1) {
            add(new TiffOutputField(tagInfoSLong.tag, tagInfoSLong, FieldType.SLONG, 1, tagInfoSLong.encodeValue(this.byteOrder, i)));
        } else {
            throw new ImageWriteException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(tagInfoSLong.length, " value(s), not 1", new StringBuilder("Tag expects ")));
        }
    }

    public void add(TagInfoSLongs tagInfoSLongs, int... iArr) {
        int i = tagInfoSLongs.length;
        if (i > 0 && i != iArr.length) {
            throw new ImageWriteException("Tag expects " + tagInfoSLongs.length + " value(s), not " + iArr.length);
        }
        add(new TiffOutputField(tagInfoSLongs.tag, tagInfoSLongs, FieldType.SLONG, iArr.length, tagInfoSLongs.encodeValue(this.byteOrder, iArr)));
    }

    public void add(TagInfoSRational tagInfoSRational, RationalNumber rationalNumber) {
        if (tagInfoSRational.length == 1) {
            add(new TiffOutputField(tagInfoSRational.tag, tagInfoSRational, FieldType.SRATIONAL, 1, tagInfoSRational.encodeValue(this.byteOrder, rationalNumber)));
        } else {
            throw new ImageWriteException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(tagInfoSRational.length, " value(s), not 1", new StringBuilder("Tag expects ")));
        }
    }

    public void add(TagInfoSRationals tagInfoSRationals, RationalNumber... rationalNumberArr) {
        int i = tagInfoSRationals.length;
        if (i > 0 && i != rationalNumberArr.length) {
            throw new ImageWriteException("Tag expects " + tagInfoSRationals.length + " value(s), not " + rationalNumberArr.length);
        }
        add(new TiffOutputField(tagInfoSRationals.tag, tagInfoSRationals, FieldType.SRATIONAL, rationalNumberArr.length, tagInfoSRationals.encodeValue(this.byteOrder, rationalNumberArr)));
    }

    public void add(TagInfoFloat tagInfoFloat, float f) {
        if (tagInfoFloat.length == 1) {
            add(new TiffOutputField(tagInfoFloat.tag, tagInfoFloat, FieldType.FLOAT, 1, tagInfoFloat.encodeValue(this.byteOrder, f)));
        } else {
            throw new ImageWriteException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(tagInfoFloat.length, " value(s), not 1", new StringBuilder("Tag expects ")));
        }
    }

    public void add(TagInfoFloats tagInfoFloats, float... fArr) {
        int i = tagInfoFloats.length;
        if (i > 0 && i != fArr.length) {
            throw new ImageWriteException("Tag expects " + tagInfoFloats.length + " value(s), not " + fArr.length);
        }
        add(new TiffOutputField(tagInfoFloats.tag, tagInfoFloats, FieldType.FLOAT, fArr.length, tagInfoFloats.encodeValue(this.byteOrder, fArr)));
    }

    public void add(TagInfoDouble tagInfoDouble, double d) {
        if (tagInfoDouble.length == 1) {
            add(new TiffOutputField(tagInfoDouble.tag, tagInfoDouble, FieldType.DOUBLE, 1, tagInfoDouble.encodeValue(this.byteOrder, d)));
        } else {
            throw new ImageWriteException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(tagInfoDouble.length, " value(s), not 1", new StringBuilder("Tag expects ")));
        }
    }

    public void add(TagInfoDoubles tagInfoDoubles, double... dArr) {
        int i = tagInfoDoubles.length;
        if (i > 0 && i != dArr.length) {
            throw new ImageWriteException("Tag expects " + tagInfoDoubles.length + " value(s), not " + dArr.length);
        }
        add(new TiffOutputField(tagInfoDoubles.tag, tagInfoDoubles, FieldType.DOUBLE, dArr.length, tagInfoDoubles.encodeValue(this.byteOrder, dArr)));
    }

    public void add(TagInfoByteOrShort tagInfoByteOrShort, byte... bArr) {
        int i = tagInfoByteOrShort.length;
        if (i > 0 && i != bArr.length) {
            throw new ImageWriteException("Tag expects " + tagInfoByteOrShort.length + " value(s), not " + bArr.length);
        }
        add(new TiffOutputField(tagInfoByteOrShort.tag, tagInfoByteOrShort, FieldType.BYTE, bArr.length, tagInfoByteOrShort.encodeValue(this.byteOrder, bArr)));
    }

    public void add(TagInfoByteOrShort tagInfoByteOrShort, short... sArr) {
        int i = tagInfoByteOrShort.length;
        if (i > 0 && i != sArr.length) {
            throw new ImageWriteException("Tag expects " + tagInfoByteOrShort.length + " value(s), not " + sArr.length);
        }
        add(new TiffOutputField(tagInfoByteOrShort.tag, tagInfoByteOrShort, FieldType.SHORT, sArr.length, tagInfoByteOrShort.encodeValue(this.byteOrder, sArr)));
    }

    public void add(TagInfoShortOrLong tagInfoShortOrLong, short... sArr) {
        int i = tagInfoShortOrLong.length;
        if (i > 0 && i != sArr.length) {
            throw new ImageWriteException("Tag expects " + tagInfoShortOrLong.length + " value(s), not " + sArr.length);
        }
        add(new TiffOutputField(tagInfoShortOrLong.tag, tagInfoShortOrLong, FieldType.SHORT, sArr.length, tagInfoShortOrLong.encodeValue(this.byteOrder, sArr)));
    }

    public void add(TagInfoShortOrLong tagInfoShortOrLong, int... iArr) {
        int i = tagInfoShortOrLong.length;
        if (i > 0 && i != iArr.length) {
            throw new ImageWriteException("Tag expects " + tagInfoShortOrLong.length + " value(s), not " + iArr.length);
        }
        add(new TiffOutputField(tagInfoShortOrLong.tag, tagInfoShortOrLong, FieldType.LONG, iArr.length, tagInfoShortOrLong.encodeValue(this.byteOrder, iArr)));
    }

    public void add(TagInfoShortOrLongOrRational tagInfoShortOrLongOrRational, short... sArr) {
        int i = tagInfoShortOrLongOrRational.length;
        if (i > 0 && i != sArr.length) {
            throw new ImageWriteException("Tag expects " + tagInfoShortOrLongOrRational.length + " value(s), not " + sArr.length);
        }
        add(new TiffOutputField(tagInfoShortOrLongOrRational.tag, tagInfoShortOrLongOrRational, FieldType.SHORT, sArr.length, tagInfoShortOrLongOrRational.encodeValue(this.byteOrder, sArr)));
    }

    public void add(TagInfoShortOrLongOrRational tagInfoShortOrLongOrRational, int... iArr) {
        int i = tagInfoShortOrLongOrRational.length;
        if (i > 0 && i != iArr.length) {
            throw new ImageWriteException("Tag expects " + tagInfoShortOrLongOrRational.length + " value(s), not " + iArr.length);
        }
        add(new TiffOutputField(tagInfoShortOrLongOrRational.tag, tagInfoShortOrLongOrRational, FieldType.LONG, iArr.length, tagInfoShortOrLongOrRational.encodeValue(this.byteOrder, iArr)));
    }

    public void add(TagInfoShortOrLongOrRational tagInfoShortOrLongOrRational, RationalNumber... rationalNumberArr) {
        int i = tagInfoShortOrLongOrRational.length;
        if (i > 0 && i != rationalNumberArr.length) {
            throw new ImageWriteException("Tag expects " + tagInfoShortOrLongOrRational.length + " value(s), not " + rationalNumberArr.length);
        }
        add(new TiffOutputField(tagInfoShortOrLongOrRational.tag, tagInfoShortOrLongOrRational, FieldType.RATIONAL, rationalNumberArr.length, tagInfoShortOrLongOrRational.encodeValue(this.byteOrder, rationalNumberArr)));
    }

    public void add(TagInfoShortOrRational tagInfoShortOrRational, short... sArr) {
        int i = tagInfoShortOrRational.length;
        if (i > 0 && i != sArr.length) {
            throw new ImageWriteException("Tag expects " + tagInfoShortOrRational.length + " value(s), not " + sArr.length);
        }
        add(new TiffOutputField(tagInfoShortOrRational.tag, tagInfoShortOrRational, FieldType.SHORT, sArr.length, tagInfoShortOrRational.encodeValue(this.byteOrder, sArr)));
    }

    public void add(TagInfoShortOrRational tagInfoShortOrRational, RationalNumber... rationalNumberArr) {
        int i = tagInfoShortOrRational.length;
        if (i > 0 && i != rationalNumberArr.length) {
            throw new ImageWriteException("Tag expects " + tagInfoShortOrRational.length + " value(s), not " + rationalNumberArr.length);
        }
        add(new TiffOutputField(tagInfoShortOrRational.tag, tagInfoShortOrRational, FieldType.RATIONAL, rationalNumberArr.length, tagInfoShortOrRational.encodeValue(this.byteOrder, rationalNumberArr)));
    }

    public void add(TagInfoGpsText tagInfoGpsText, String str) {
        byte[] encodeValue = tagInfoGpsText.encodeValue(FieldType.UNDEFINED, str, this.byteOrder);
        add(new TiffOutputField(tagInfoGpsText.tag, tagInfoGpsText, tagInfoGpsText.dataTypes.get(0), encodeValue.length, encodeValue));
    }

    public void add(TagInfoXpString tagInfoXpString, String str) {
        FieldTypeByte fieldTypeByte = FieldType.BYTE;
        byte[] encodeValue = tagInfoXpString.encodeValue(fieldTypeByte, str, this.byteOrder);
        add(new TiffOutputField(tagInfoXpString.tag, tagInfoXpString, fieldTypeByte, encodeValue.length, encodeValue));
    }

    public void add(TagInfoAsciiOrByte tagInfoAsciiOrByte, String... strArr) {
        FieldTypeAscii fieldTypeAscii = FieldType.ASCII;
        byte[] encodeValue = tagInfoAsciiOrByte.encodeValue(fieldTypeAscii, strArr, this.byteOrder);
        int i = tagInfoAsciiOrByte.length;
        if (i > 0 && i != encodeValue.length) {
            throw new ImageWriteException("Tag expects " + tagInfoAsciiOrByte.length + " byte(s), not " + strArr.length);
        }
        add(new TiffOutputField(tagInfoAsciiOrByte.tag, tagInfoAsciiOrByte, fieldTypeAscii, encodeValue.length, encodeValue));
    }

    public void add(TagInfoAsciiOrRational tagInfoAsciiOrRational, String... strArr) {
        FieldTypeAscii fieldTypeAscii = FieldType.ASCII;
        byte[] encodeValue = tagInfoAsciiOrRational.encodeValue(fieldTypeAscii, strArr, this.byteOrder);
        int i = tagInfoAsciiOrRational.length;
        if (i > 0 && i != encodeValue.length) {
            throw new ImageWriteException("Tag expects " + tagInfoAsciiOrRational.length + " byte(s), not " + strArr.length);
        }
        add(new TiffOutputField(tagInfoAsciiOrRational.tag, tagInfoAsciiOrRational, fieldTypeAscii, encodeValue.length, encodeValue));
    }

    public void add(TagInfoAsciiOrRational tagInfoAsciiOrRational, RationalNumber... rationalNumberArr) {
        int i = tagInfoAsciiOrRational.length;
        if (i > 0 && i != rationalNumberArr.length) {
            throw new ImageWriteException("Tag expects " + tagInfoAsciiOrRational.length + " value(s), not " + rationalNumberArr.length);
        }
        FieldTypeRational fieldTypeRational = FieldType.RATIONAL;
        byte[] encodeValue = tagInfoAsciiOrRational.encodeValue(fieldTypeRational, rationalNumberArr, this.byteOrder);
        add(new TiffOutputField(tagInfoAsciiOrRational.tag, tagInfoAsciiOrRational, fieldTypeRational, encodeValue.length, encodeValue));
    }

    public void add(TiffOutputField tiffOutputField) {
        this.fields.add(tiffOutputField);
    }
}
