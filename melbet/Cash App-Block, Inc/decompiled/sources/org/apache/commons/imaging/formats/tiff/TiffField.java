package org.apache.commons.imaging.formats.tiff;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.ByteOrder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.common.BinaryFunctions;
import org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants;
import org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfo;

/* loaded from: classes9.dex */
public class TiffField {
    private static final Logger LOGGER = Logger.getLogger(TiffField.class.getName());
    private final ByteOrder byteOrder;
    private final long count;
    private final int directoryType;
    private final FieldType fieldType;
    private final long offset;
    private final int sortHint;
    private final int tag;
    private final TagInfo tagInfo;
    private final byte[] value;

    public final class OversizeValueElement extends TiffElement {
        public OversizeValueElement(int i, int i2) {
            super(i, i2);
        }

        @Override // org.apache.commons.imaging.formats.tiff.TiffElement
        public String getElementDescription() {
            return "OversizeValueElement, tag: " + TiffField.this.getTagInfo().name + ", fieldType: " + TiffField.this.getFieldType().getName();
        }
    }

    public TiffField(int i, int i2, FieldType fieldType, long j, long j2, byte[] bArr, ByteOrder byteOrder, int i3) {
        this.tag = i;
        this.directoryType = i2;
        this.fieldType = fieldType;
        this.count = j;
        this.offset = j2;
        this.value = bArr;
        this.byteOrder = byteOrder;
        this.sortHint = i3;
        this.tagInfo = TiffTags.getTag(i2, i);
    }

    private String getValueDescription(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Number) {
            return obj.toString();
        }
        if (obj instanceof String) {
            return "'" + obj.toString().trim() + "'";
        }
        if (obj instanceof Date) {
            return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.ENGLISH).format((Date) obj);
        }
        int i = 0;
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            StringBuilder sb = new StringBuilder();
            while (true) {
                if (i >= objArr.length) {
                    break;
                }
                Object obj2 = objArr[i];
                if (i > 50) {
                    sb.append("... (");
                    sb.append(objArr.length);
                    sb.append(")");
                    break;
                }
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(obj2.toString());
                i++;
            }
            return sb.toString();
        }
        if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            StringBuilder sb2 = new StringBuilder();
            while (true) {
                if (i >= sArr.length) {
                    break;
                }
                short s = sArr[i];
                if (i > 50) {
                    sb2.append("... (");
                    sb2.append(sArr.length);
                    sb2.append(")");
                    break;
                }
                if (i > 0) {
                    sb2.append(", ");
                }
                sb2.append((int) s);
                i++;
            }
            return sb2.toString();
        }
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            StringBuilder sb3 = new StringBuilder();
            while (true) {
                if (i >= iArr.length) {
                    break;
                }
                int i2 = iArr[i];
                if (i > 50) {
                    sb3.append("... (");
                    sb3.append(iArr.length);
                    sb3.append(")");
                    break;
                }
                if (i > 0) {
                    sb3.append(", ");
                }
                sb3.append(i2);
                i++;
            }
            return sb3.toString();
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            StringBuilder sb4 = new StringBuilder();
            while (true) {
                if (i >= jArr.length) {
                    break;
                }
                long j = jArr[i];
                if (i > 50) {
                    sb4.append("... (");
                    sb4.append(jArr.length);
                    sb4.append(")");
                    break;
                }
                if (i > 0) {
                    sb4.append(", ");
                }
                sb4.append(j);
                i++;
            }
            return sb4.toString();
        }
        if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            StringBuilder sb5 = new StringBuilder();
            while (true) {
                if (i >= dArr.length) {
                    break;
                }
                double d = dArr[i];
                if (i > 50) {
                    sb5.append("... (");
                    sb5.append(dArr.length);
                    sb5.append(")");
                    break;
                }
                if (i > 0) {
                    sb5.append(", ");
                }
                sb5.append(d);
                i++;
            }
            return sb5.toString();
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            StringBuilder sb6 = new StringBuilder();
            while (true) {
                if (i >= bArr.length) {
                    break;
                }
                byte b = bArr[i];
                if (i > 50) {
                    sb6.append("... (");
                    sb6.append(bArr.length);
                    sb6.append(")");
                    break;
                }
                if (i > 0) {
                    sb6.append(", ");
                }
                sb6.append((int) b);
                i++;
            }
            return sb6.toString();
        }
        if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            StringBuilder sb7 = new StringBuilder();
            while (true) {
                if (i >= cArr.length) {
                    break;
                }
                char c = cArr[i];
                if (i > 50) {
                    sb7.append("... (");
                    sb7.append(cArr.length);
                    sb7.append(")");
                    break;
                }
                if (i > 0) {
                    sb7.append(", ");
                }
                sb7.append(c);
                i++;
            }
            return sb7.toString();
        }
        if (!(obj instanceof float[])) {
            return Boxes$$ExternalSyntheticOutline1.m(obj, "Unknown: ");
        }
        float[] fArr = (float[]) obj;
        StringBuilder sb8 = new StringBuilder();
        while (true) {
            if (i >= fArr.length) {
                break;
            }
            float f = fArr[i];
            if (i > 50) {
                sb8.append("... (");
                sb8.append(fArr.length);
                sb8.append(")");
                break;
            }
            if (i > 0) {
                sb8.append(", ");
            }
            sb8.append(f);
            i++;
        }
        return sb8.toString();
    }

    public void dump() {
        try {
            StringWriter stringWriter = new StringWriter();
            try {
                PrintWriter printWriter = new PrintWriter(stringWriter);
                try {
                    dump(printWriter);
                    printWriter.flush();
                    stringWriter.flush();
                    LOGGER.fine(stringWriter.toString());
                    printWriter.close();
                    stringWriter.close();
                } finally {
                }
            } finally {
            }
        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, e.getMessage(), (Throwable) e);
        }
    }

    public byte[] getByteArrayValue() {
        return BinaryFunctions.head(this.value, getBytesLength());
    }

    public ByteOrder getByteOrder() {
        return this.byteOrder;
    }

    public int getBytesLength() {
        return this.fieldType.getSize() * ((int) this.count);
    }

    public long getCount() {
        return this.count;
    }

    public String getDescriptionWithoutValue() {
        StringBuilder sb = new StringBuilder();
        sb.append(getTag());
        sb.append(" (0x");
        sb.append(Integer.toHexString(getTag()));
        sb.append(": ");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, getTagInfo().name, "): ");
    }

    public int getDirectoryType() {
        return this.directoryType;
    }

    public double[] getDoubleArrayValue() {
        Object value = getValue();
        int i = 0;
        if (value instanceof Number) {
            return new double[]{((Number) value).doubleValue()};
        }
        if (value instanceof Number[]) {
            Number[] numberArr = (Number[]) value;
            double[] dArr = new double[numberArr.length];
            while (i < numberArr.length) {
                dArr[i] = numberArr[i].doubleValue();
                i++;
            }
            return dArr;
        }
        if (value instanceof short[]) {
            short[] sArr = (short[]) value;
            double[] dArr2 = new double[sArr.length];
            while (i < sArr.length) {
                dArr2[i] = sArr[i];
                i++;
            }
            return dArr2;
        }
        if (value instanceof int[]) {
            int[] iArr = (int[]) value;
            double[] dArr3 = new double[iArr.length];
            while (i < iArr.length) {
                dArr3[i] = iArr[i];
                i++;
            }
            return dArr3;
        }
        if (value instanceof float[]) {
            float[] fArr = (float[]) value;
            double[] dArr4 = new double[fArr.length];
            while (i < fArr.length) {
                dArr4[i] = fArr[i];
                i++;
            }
            return dArr4;
        }
        if (value instanceof double[]) {
            double[] dArr5 = (double[]) value;
            double[] dArr6 = new double[dArr5.length];
            System.arraycopy(dArr5, 0, dArr6, 0, dArr5.length);
            return dArr6;
        }
        StringBuilder sb = new StringBuilder("Unknown value: ");
        sb.append(value);
        String description = getTagInfo().getDescription();
        sb.append(" for: ");
        sb.append(description);
        throw new ImageReadException(sb.toString());
    }

    public double getDoubleValue() {
        Object value = getValue();
        if (value != null) {
            return ((Number) value).doubleValue();
        }
        throw new ImageReadException("Missing value: " + getTagInfo().getDescription());
    }

    public FieldType getFieldType() {
        return this.fieldType;
    }

    public String getFieldTypeName() {
        return getFieldType().getName();
    }

    public int[] getIntArrayValue() {
        Object value = getValue();
        if (value instanceof Number) {
            return new int[]{((Number) value).intValue()};
        }
        int i = 0;
        if (value instanceof Number[]) {
            Number[] numberArr = (Number[]) value;
            int[] iArr = new int[numberArr.length];
            while (i < numberArr.length) {
                iArr[i] = numberArr[i].intValue();
                i++;
            }
            return iArr;
        }
        if (value instanceof short[]) {
            short[] sArr = (short[]) value;
            int[] iArr2 = new int[sArr.length];
            while (i < sArr.length) {
                iArr2[i] = 65535 & sArr[i];
                i++;
            }
            return iArr2;
        }
        if (value instanceof int[]) {
            int[] iArr3 = (int[]) value;
            int[] iArr4 = new int[iArr3.length];
            System.arraycopy(iArr3, 0, iArr4, 0, iArr3.length);
            return iArr4;
        }
        StringBuilder sb = new StringBuilder("Unknown value: ");
        sb.append(value);
        String description = getTagInfo().getDescription();
        sb.append(" for: ");
        sb.append(description);
        throw new ImageReadException(sb.toString());
    }

    public int getIntValue() {
        Object value = getValue();
        if (value != null) {
            return ((Number) value).intValue();
        }
        throw new ImageReadException("Missing value: " + getTagInfo().getDescription());
    }

    public int getIntValueOrArraySum() {
        Object value = getValue();
        if (value instanceof Number) {
            return ((Number) value).intValue();
        }
        int i = 0;
        if (value instanceof Number[]) {
            Number[] numberArr = (Number[]) value;
            int length = numberArr.length;
            int i2 = 0;
            while (i < length) {
                i2 += numberArr[i].intValue();
                i++;
            }
            return i2;
        }
        if (value instanceof short[]) {
            short[] sArr = (short[]) value;
            int length2 = sArr.length;
            int i3 = 0;
            while (i < length2) {
                i3 += sArr[i];
                i++;
            }
            return i3;
        }
        if (!(value instanceof int[])) {
            StringBuilder sb = new StringBuilder("Unknown value: ");
            sb.append(value);
            String description = getTagInfo().getDescription();
            sb.append(" for: ");
            sb.append(description);
            throw new ImageReadException(sb.toString());
        }
        int[] iArr = (int[]) value;
        int length3 = iArr.length;
        int i4 = 0;
        while (i < length3) {
            i4 += iArr[i];
            i++;
        }
        return i4;
    }

    public int getOffset() {
        return (int) this.offset;
    }

    public TiffElement getOversizeValueElement() {
        if (isLocalValue()) {
            return null;
        }
        return new OversizeValueElement(getOffset(), this.value.length);
    }

    public int getSortHint() {
        return this.sortHint;
    }

    public String getStringValue() {
        Object value = getValue();
        if (value == null) {
            return null;
        }
        if (value instanceof String) {
            return (String) value;
        }
        throw new ImageReadException("Expected String value(" + getTagInfo().getDescription() + "): " + value);
    }

    public int getTag() {
        return this.tag;
    }

    public TagInfo getTagInfo() {
        return this.tagInfo;
    }

    public String getTagName() {
        if (getTagInfo() != TiffTagConstants.TIFF_TAG_UNKNOWN) {
            return getTagInfo().name;
        }
        return getTagInfo().name + " (0x" + Integer.toHexString(getTag()) + ")";
    }

    public Object getValue() {
        return getTagInfo().getValue(this);
    }

    public boolean isLocalValue() {
        return this.count * ((long) this.fieldType.getSize()) <= 4;
    }

    public String toString() {
        return getTag() + " (0x" + Integer.toHexString(getTag()) + ": " + getTagInfo().name + "): " + getValueDescription() + " (" + getCount() + " " + getFieldType().getName() + ")";
    }

    public void dump(PrintWriter printWriter) {
        dump(printWriter, null);
    }

    public void dump(PrintWriter printWriter, String str) {
        if (str != null) {
            printWriter.print(str.concat(": "));
        }
        printWriter.println(toString());
        printWriter.flush();
    }

    public String getValueDescription() {
        try {
            return getValueDescription(getValue());
        } catch (ImageReadException e) {
            return "Invalid value: " + e.getMessage();
        }
    }
}
