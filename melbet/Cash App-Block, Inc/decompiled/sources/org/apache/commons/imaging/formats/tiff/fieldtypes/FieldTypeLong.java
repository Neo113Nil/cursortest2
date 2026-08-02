package org.apache.commons.imaging.formats.tiff.fieldtypes;

import java.nio.ByteOrder;
import org.apache.commons.imaging.ImageWriteException;
import org.apache.commons.imaging.common.ByteConversions;
import org.apache.commons.imaging.formats.tiff.TiffField;

/* loaded from: classes9.dex */
public class FieldTypeLong extends FieldType {
    public FieldTypeLong(int i, String str) {
        super(i, str, 4);
    }

    @Override // org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType
    public Object getValue(TiffField tiffField) {
        byte[] byteArrayValue = tiffField.getByteArrayValue();
        return tiffField.getCount() == 1 ? Integer.valueOf(ByteConversions.toInt(byteArrayValue, tiffField.getByteOrder())) : ByteConversions.toInts(byteArrayValue, tiffField.getByteOrder());
    }

    @Override // org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType
    public byte[] writeData(Object obj, ByteOrder byteOrder) {
        if (obj instanceof Integer) {
            return ByteConversions.toBytes(((Integer) obj).intValue(), byteOrder);
        }
        if (obj instanceof int[]) {
            return ByteConversions.toBytes((int[]) obj, byteOrder);
        }
        if (!(obj instanceof Integer[])) {
            throw new ImageWriteException("Invalid data", obj);
        }
        Integer[] numArr = (Integer[]) obj;
        int length = numArr.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = numArr[i].intValue();
        }
        return ByteConversions.toBytes(iArr, byteOrder);
    }
}
