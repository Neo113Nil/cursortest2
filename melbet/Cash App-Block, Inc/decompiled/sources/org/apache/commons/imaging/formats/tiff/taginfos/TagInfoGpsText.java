package org.apache.commons.imaging.formats.tiff.taginfos;

import java.io.UnsupportedEncodingException;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;
import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.ImageWriteException;
import org.apache.commons.imaging.common.BinaryFunctions;
import org.apache.commons.imaging.formats.tiff.TiffField;
import org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType;
import org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType;
import org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeAscii;
import org.apache.commons.imaging.internal.Debug;

/* loaded from: classes9.dex */
public final class TagInfoGpsText extends TagInfo {
    private static final TextEncoding[] TEXT_ENCODINGS;
    private static final TextEncoding TEXT_ENCODING_ASCII;
    private static final TextEncoding TEXT_ENCODING_JIS;
    private static final TextEncoding TEXT_ENCODING_UNDEFINED;
    private static final TextEncoding TEXT_ENCODING_UNICODE_BE;
    private static final TextEncoding TEXT_ENCODING_UNICODE_LE;

    public static final class TextEncoding {
        public final String encodingName;
        final byte[] prefix;

        public TextEncoding(byte[] bArr, String str) {
            this.prefix = bArr;
            this.encodingName = str;
        }
    }

    static {
        TextEncoding textEncoding = new TextEncoding(new byte[]{65, 83, 67, 73, 73, 0, 0, 0}, "US-ASCII");
        TEXT_ENCODING_ASCII = textEncoding;
        TextEncoding textEncoding2 = new TextEncoding(new byte[]{74, 73, 83, 0, 0, 0, 0, 0}, "JIS");
        TEXT_ENCODING_JIS = textEncoding2;
        TextEncoding textEncoding3 = new TextEncoding(new byte[]{85, 78, 73, 67, 79, 68, 69, 0}, "UTF-16LE");
        TEXT_ENCODING_UNICODE_LE = textEncoding3;
        TextEncoding textEncoding4 = new TextEncoding(new byte[]{85, 78, 73, 67, 79, 68, 69, 0}, "UTF-16BE");
        TEXT_ENCODING_UNICODE_BE = textEncoding4;
        TextEncoding textEncoding5 = new TextEncoding(new byte[]{0, 0, 0, 0, 0, 0, 0, 0}, "ISO-8859-1");
        TEXT_ENCODING_UNDEFINED = textEncoding5;
        TEXT_ENCODINGS = new TextEncoding[]{textEncoding, textEncoding2, textEncoding3, textEncoding4, textEncoding5};
    }

    public TagInfoGpsText(String str, int i, TiffDirectoryType tiffDirectoryType) {
        super(str, i, FieldType.UNDEFINED, -1, tiffDirectoryType);
    }

    @Override // org.apache.commons.imaging.formats.tiff.taginfos.TagInfo
    public byte[] encodeValue(FieldType fieldType, Object obj, ByteOrder byteOrder) {
        if (!(obj instanceof String)) {
            throw new ImageWriteException("GPS text value not String", obj);
        }
        String str = (String) obj;
        try {
            TextEncoding textEncoding = TEXT_ENCODING_ASCII;
            byte[] bytes = str.getBytes(textEncoding.encodingName);
            if (new String(bytes, textEncoding.encodingName).equals(str)) {
                int length = bytes.length;
                byte[] bArr = textEncoding.prefix;
                byte[] bArr2 = new byte[length + bArr.length];
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                System.arraycopy(bytes, 0, bArr2, textEncoding.prefix.length, bytes.length);
                return bArr2;
            }
            TextEncoding textEncoding2 = byteOrder == ByteOrder.BIG_ENDIAN ? TEXT_ENCODING_UNICODE_BE : TEXT_ENCODING_UNICODE_LE;
            byte[] bytes2 = str.getBytes(textEncoding2.encodingName);
            int length2 = bytes2.length;
            byte[] bArr3 = textEncoding2.prefix;
            byte[] bArr4 = new byte[length2 + bArr3.length];
            System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
            System.arraycopy(bytes2, 0, bArr4, textEncoding2.prefix.length, bytes2.length);
            return bArr4;
        } catch (UnsupportedEncodingException e) {
            throw new ImageWriteException(e.getMessage(), (Throwable) e);
        }
    }

    @Override // org.apache.commons.imaging.formats.tiff.taginfos.TagInfo
    public String getValue(TiffField tiffField) {
        FieldType fieldType = tiffField.getFieldType();
        FieldTypeAscii fieldTypeAscii = FieldType.ASCII;
        if (fieldType == fieldTypeAscii) {
            Object value = fieldTypeAscii.getValue(tiffField);
            if (value instanceof String) {
                return (String) value;
            }
            if (value instanceof String[]) {
                return ((String[]) value)[0];
            }
            f$$ExternalSyntheticLambda0.m("Unexpected ASCII type decoded");
            return null;
        }
        if (tiffField.getFieldType() != FieldType.UNDEFINED && tiffField.getFieldType() != FieldType.BYTE) {
            Debug.debug("entry.type: " + tiffField.getFieldType());
            Debug.debug("entry.directoryType: " + tiffField.getDirectoryType());
            Debug.debug("entry.type: " + tiffField.getDescriptionWithoutValue());
            Debug.debug("entry.type: " + tiffField.getFieldType());
            f$$ExternalSyntheticLambda0.m("GPS text field not encoded as bytes.");
            return null;
        }
        byte[] byteArrayValue = tiffField.getByteArrayValue();
        if (byteArrayValue.length < 8) {
            return new String(byteArrayValue, StandardCharsets.US_ASCII);
        }
        for (TextEncoding textEncoding : TEXT_ENCODINGS) {
            byte[] bArr = textEncoding.prefix;
            if (BinaryFunctions.compareBytes(byteArrayValue, 0, bArr, 0, bArr.length)) {
                try {
                    byte[] bArr2 = textEncoding.prefix;
                    String str = new String(byteArrayValue, bArr2.length, byteArrayValue.length - bArr2.length, textEncoding.encodingName);
                    byte[] bytes = str.getBytes(textEncoding.encodingName);
                    if (BinaryFunctions.compareBytes(byteArrayValue, textEncoding.prefix.length, bytes, 0, bytes.length)) {
                        return str;
                    }
                } catch (UnsupportedEncodingException e) {
                    throw new ImageReadException(e.getMessage(), e);
                }
            }
        }
        return new String(byteArrayValue, StandardCharsets.US_ASCII);
    }

    @Override // org.apache.commons.imaging.formats.tiff.taginfos.TagInfo
    public boolean isText() {
        return true;
    }
}
