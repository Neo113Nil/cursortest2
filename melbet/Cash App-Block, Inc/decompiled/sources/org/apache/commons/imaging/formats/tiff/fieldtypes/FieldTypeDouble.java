package org.apache.commons.imaging.formats.tiff.fieldtypes;

import java.nio.ByteOrder;
import org.apache.commons.imaging.ImageWriteException;
import org.apache.commons.imaging.common.ByteConversions;
import org.apache.commons.imaging.formats.tiff.TiffField;

/* loaded from: classes9.dex */
public class FieldTypeDouble extends FieldType {
    public FieldTypeDouble(int i, String str) {
        super(i, str, 8);
    }

    @Override // org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType
    public Object getValue(TiffField tiffField) {
        byte[] byteArrayValue = tiffField.getByteArrayValue();
        return tiffField.getCount() == 1 ? Double.valueOf(ByteConversions.toDouble(byteArrayValue, tiffField.getByteOrder())) : ByteConversions.toDoubles(byteArrayValue, tiffField.getByteOrder());
    }

    @Override // org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType
    public byte[] writeData(Object obj, ByteOrder byteOrder) {
        if (obj instanceof Double) {
            return ByteConversions.toBytes(((Double) obj).doubleValue(), byteOrder);
        }
        if (obj instanceof double[]) {
            return ByteConversions.toBytes((double[]) obj, byteOrder);
        }
        if (!(obj instanceof Double[])) {
            throw new ImageWriteException("Invalid data", obj);
        }
        Double[] dArr = (Double[]) obj;
        int length = dArr.length;
        double[] dArr2 = new double[length];
        for (int i = 0; i < length; i++) {
            dArr2[i] = dArr[i].doubleValue();
        }
        return ByteConversions.toBytes(dArr2, byteOrder);
    }
}
