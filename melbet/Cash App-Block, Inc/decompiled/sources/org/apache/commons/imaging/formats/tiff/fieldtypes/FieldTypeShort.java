package org.apache.commons.imaging.formats.tiff.fieldtypes;

import java.nio.ByteOrder;
import org.apache.commons.imaging.ImageWriteException;
import org.apache.commons.imaging.common.ByteConversions;
import org.apache.commons.imaging.formats.tiff.TiffField;

/* loaded from: classes9.dex */
public class FieldTypeShort extends FieldType {
    public FieldTypeShort(int i, String str) {
        super(i, str, 2);
    }

    @Override // org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType
    public Object getValue(TiffField tiffField) {
        byte[] byteArrayValue = tiffField.getByteArrayValue();
        return tiffField.getCount() == 1 ? Short.valueOf(ByteConversions.toShort(byteArrayValue, tiffField.getByteOrder())) : ByteConversions.toShorts(byteArrayValue, tiffField.getByteOrder());
    }

    @Override // org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType
    public byte[] writeData(Object obj, ByteOrder byteOrder) {
        if (obj instanceof Short) {
            return ByteConversions.toBytes(((Short) obj).shortValue(), byteOrder);
        }
        if (obj instanceof short[]) {
            return ByteConversions.toBytes((short[]) obj, byteOrder);
        }
        if (!(obj instanceof Short[])) {
            throw new ImageWriteException("Invalid data", obj);
        }
        Short[] shArr = (Short[]) obj;
        int length = shArr.length;
        short[] sArr = new short[length];
        for (int i = 0; i < length; i++) {
            sArr[i] = shArr[i].shortValue();
        }
        return ByteConversions.toBytes(sArr, byteOrder);
    }
}
