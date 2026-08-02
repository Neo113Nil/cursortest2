package org.apache.commons.imaging.formats.tiff.taginfos;

import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;
import org.apache.commons.imaging.ImageWriteException;
import org.apache.commons.imaging.formats.tiff.TiffField;
import org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType;
import org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType;

/* loaded from: classes9.dex */
public class TagInfoXpString extends TagInfo {
    public TagInfoXpString(String str, int i, TiffDirectoryType tiffDirectoryType) {
        super(str, i, FieldType.BYTE, -1, tiffDirectoryType);
    }

    @Override // org.apache.commons.imaging.formats.tiff.taginfos.TagInfo
    public byte[] encodeValue(FieldType fieldType, Object obj, ByteOrder byteOrder) {
        if (!(obj instanceof String)) {
            throw new ImageWriteException("Text value not String", obj);
        }
        byte[] bytes = ((String) obj).getBytes(StandardCharsets.UTF_16LE);
        byte[] bArr = new byte[bytes.length + 2];
        System.arraycopy(bytes, 0, bArr, 0, bytes.length);
        return bArr;
    }

    @Override // org.apache.commons.imaging.formats.tiff.taginfos.TagInfo
    public String getValue(TiffField tiffField) {
        if (tiffField.getFieldType() == FieldType.BYTE) {
            byte[] byteArrayValue = tiffField.getByteArrayValue();
            return new String(byteArrayValue, 0, (byteArrayValue.length >= 2 && byteArrayValue[byteArrayValue.length + (-1)] == 0 && byteArrayValue[byteArrayValue.length - 2] == 0) ? byteArrayValue.length - 2 : byteArrayValue.length, StandardCharsets.UTF_16LE);
        }
        f$$ExternalSyntheticLambda0.m("Text field not encoded as bytes.");
        return null;
    }
}
