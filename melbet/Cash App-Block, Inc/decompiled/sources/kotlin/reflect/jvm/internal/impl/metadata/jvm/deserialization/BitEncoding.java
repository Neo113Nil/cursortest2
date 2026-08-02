package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

/* loaded from: classes9.dex */
public class BitEncoding {
    public static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str = (i == 1 || i == 3 || i == 6 || i == 8 || i == 10 || i == 12 || i == 14) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 1 || i == 3 || i == 6 || i == 8 || i == 10 || i == 12 || i == 14) ? 2 : 3];
        if (i == 1 || i == 3 || i == 6 || i == 8 || i == 10 || i == 12 || i == 14) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/BitEncoding";
        } else {
            objArr[0] = "data";
        }
        if (i == 1) {
            objArr[1] = "encodeBytes";
        } else if (i == 3) {
            objArr[1] = "encode8to7";
        } else if (i == 6) {
            objArr[1] = "splitBytesToStringArray";
        } else if (i == 8) {
            objArr[1] = "decodeBytes";
        } else if (i == 10) {
            objArr[1] = "dropMarker";
        } else if (i == 12) {
            objArr[1] = "combineStringArrayIntoBytes";
        } else if (i != 14) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/BitEncoding";
        } else {
            objArr[1] = "decode7to8";
        }
        switch (i) {
            case 1:
            case 3:
            case 6:
            case 8:
            case 10:
            case 12:
            case 14:
                break;
            case 2:
                objArr[2] = "encode8to7";
                break;
            case 4:
                objArr[2] = "addModuloByte";
                break;
            case 5:
                objArr[2] = "splitBytesToStringArray";
                break;
            case 7:
                objArr[2] = "decodeBytes";
                break;
            case 9:
                objArr[2] = "dropMarker";
                break;
            case 11:
                objArr[2] = "combineStringArrayIntoBytes";
                break;
            case 13:
                objArr[2] = "decode7to8";
                break;
            default:
                objArr[2] = "encodeBytes";
                break;
        }
        String format2 = String.format(str, objArr);
        if (i != 1 && i != 3 && i != 6 && i != 8 && i != 10 && i != 12 && i != 14) {
            throw new IllegalArgumentException(format2);
        }
        throw new IllegalStateException(format2);
    }

    static {
        String str;
        try {
            str = System.getProperty("kotlin.jvm.serialization.use8to7");
        } catch (SecurityException unused) {
            str = null;
        }
        "true".equals(str);
    }

    public static byte[] decodeBytes(String[] strArr) {
        if (strArr == null) {
            $$$reportNull$$$0(7);
            throw null;
        }
        if (strArr.length > 0 && !strArr[0].isEmpty()) {
            char charAt = strArr[0].charAt(0);
            if (charAt == 0) {
                String[] strArr2 = (String[]) strArr.clone();
                strArr2[0] = strArr2[0].substring(1);
                byte[] stringsToBytes = UtfEncodingKt.stringsToBytes(strArr2);
                if (stringsToBytes != null) {
                    return stringsToBytes;
                }
                $$$reportNull$$$0(8);
                throw null;
            }
            if (charAt == 65535) {
                strArr = (String[]) strArr.clone();
                strArr[0] = strArr[0].substring(1);
            }
        }
        int i = 0;
        for (String str : strArr) {
            i += str.length();
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        for (String str2 : strArr) {
            int length = str2.length();
            int i3 = 0;
            while (i3 < length) {
                bArr[i2] = (byte) str2.charAt(i3);
                i3++;
                i2++;
            }
        }
        for (int i4 = 0; i4 < i; i4++) {
            bArr[i4] = (byte) ((bArr[i4] + Byte.MAX_VALUE) & 127);
        }
        int i5 = (i * 7) / 8;
        byte[] bArr2 = new byte[i5];
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < i5; i8++) {
            int i9 = i6 + 1;
            int i10 = i7 + 1;
            bArr2[i8] = (byte) (((bArr[i6] & 255) >>> i7) + ((bArr[i9] & ((1 << i10) - 1)) << (7 - i7)));
            if (i7 == 6) {
                i6 += 2;
                i7 = 0;
            } else {
                i6 = i9;
                i7 = i10;
            }
        }
        return bArr2;
    }
}
