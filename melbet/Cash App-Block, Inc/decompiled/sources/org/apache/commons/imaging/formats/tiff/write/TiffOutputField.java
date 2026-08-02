package org.apache.commons.imaging.formats.tiff.write;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import java.nio.ByteOrder;
import java.util.Arrays;
import org.apache.commons.imaging.ImageWriteException;
import org.apache.commons.imaging.common.BinaryOutputStream;
import org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType;
import org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeLong;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfo;
import org.apache.commons.imaging.formats.tiff.write.TiffOutputItem;
import org.apache.commons.imaging.palette.ColorGroup$$ExternalSyntheticBUOutline0;

/* loaded from: classes9.dex */
public class TiffOutputField {
    private static final String NEWLINE = System.getProperty("line.separator");
    private byte[] bytes;
    public final int count;
    public final FieldType fieldType;
    private final TiffOutputItem.Value separateValueItem;
    private int sortHint;
    public final int tag;
    public final TagInfo tagInfo;

    public TiffOutputField(int i, TagInfo tagInfo, FieldType fieldType, int i2, byte[] bArr) {
        this.sortHint = -1;
        this.tag = i;
        this.tagInfo = tagInfo;
        this.fieldType = fieldType;
        this.count = i2;
        this.bytes = bArr;
        if (isLocalValue()) {
            this.separateValueItem = null;
            return;
        }
        this.separateValueItem = new TiffOutputItem.Value("Field Separate value (" + tagInfo.getDescription() + ")", bArr);
    }

    public static TiffOutputField createOffsetField(TagInfo tagInfo, ByteOrder byteOrder) {
        FieldTypeLong fieldTypeLong = FieldType.LONG;
        return new TiffOutputField(tagInfo, fieldTypeLong, 1, fieldTypeLong.writeData(0, byteOrder));
    }

    public boolean bytesEqual(byte[] bArr) {
        return Arrays.equals(this.bytes, bArr);
    }

    public TiffOutputItem getSeperateValue() {
        return this.separateValueItem;
    }

    public int getSortHint() {
        return this.sortHint;
    }

    public final boolean isLocalValue() {
        return this.bytes.length <= 4;
    }

    public void setData(byte[] bArr) {
        if (this.bytes.length != bArr.length) {
            ColorGroup$$ExternalSyntheticBUOutline0.m("Cannot change size of value.");
            return;
        }
        this.bytes = bArr;
        TiffOutputItem.Value value = this.separateValueItem;
        if (value != null) {
            value.updateValue(bArr);
        }
    }

    public void setSortHint(int i) {
        this.sortHint = i;
    }

    public String toString(String str) {
        if (str == null) {
            str = "";
        }
        StringBuilder m = Boxes$$ExternalSyntheticOutline1.m(str);
        m.append(this.tagInfo);
        String str2 = NEWLINE;
        m.append(str2);
        m.append(str);
        m.append("count: ");
        m.append(this.count);
        m.append(str2);
        m.append(str);
        m.append(this.fieldType);
        m.append(str2);
        return m.toString();
    }

    public void writeField(BinaryOutputStream binaryOutputStream) {
        binaryOutputStream.write2Bytes(this.tag);
        binaryOutputStream.write2Bytes(this.fieldType.getType());
        binaryOutputStream.write4Bytes(this.count);
        boolean isLocalValue = isLocalValue();
        TiffOutputItem.Value value = this.separateValueItem;
        if (!isLocalValue) {
            if (value != null) {
                binaryOutputStream.write4Bytes((int) value.getOffset());
                return;
            } else {
                ColorGroup$$ExternalSyntheticBUOutline0.m("Missing separate value item.");
                return;
            }
        }
        if (value != null) {
            ColorGroup$$ExternalSyntheticBUOutline0.m("Unexpected separate value item.");
            return;
        }
        byte[] bArr = this.bytes;
        if (bArr.length > 4) {
            throw new ImageWriteException("Local value has invalid length: " + this.bytes.length);
        }
        binaryOutputStream.write(bArr);
        int length = 4 - this.bytes.length;
        for (int i = 0; i < length; i++) {
            binaryOutputStream.write(0);
        }
    }

    public String toString() {
        return toString(null);
    }

    public TiffOutputField(TagInfo tagInfo, FieldType fieldType, int i, byte[] bArr) {
        this(tagInfo.tag, tagInfo, fieldType, i, bArr);
    }
}
