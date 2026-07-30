package okio.internal;

import com.google.common.primitives.UnsignedBytes;
import java.util.Arrays;
import kotlin.collections.k;
import kotlin.jvm.internal.s;
import kotlin.text.t;
import okio.ByteString;
import okio.b1;
import okio.c1;
import okio.d1;
import y5.w;

/* loaded from: classes5.dex */
public abstract class e {
    private static final char[] HEX_DIGIT_CHARS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: Access modifiers changed from: private */
    public static final int codePointIndexToCharIndex(byte[] bArr, int i8) {
        byte b8;
        int i9;
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        loop0: while (i10 < length) {
            byte b9 = bArr[i10];
            if (b9 >= 0) {
                int i13 = i12 + 1;
                if (i12 == i8) {
                    return i11;
                }
                if ((b9 != 10 && b9 != 13 && ((b9 >= 0 && b9 <= 31) || (Byte.MAX_VALUE <= b9 && b9 <= 159))) || b9 == 65533) {
                    return -1;
                }
                i11 += b9 < 65536 ? 1 : 2;
                i10++;
                while (true) {
                    i12 = i13;
                    if (i10 < length && (b8 = bArr[i10]) >= 0) {
                        i10++;
                        i13 = i12 + 1;
                        if (i12 == i8) {
                            return i11;
                        }
                        if ((b8 == 10 || b8 == 13 || ((b8 < 0 || b8 > 31) && (Byte.MAX_VALUE > b8 || b8 > 159))) && b8 != 65533) {
                            i11 += b8 < 65536 ? 1 : 2;
                        }
                    }
                }
            } else if ((b9 >> 5) == -2) {
                int i14 = i10 + 1;
                if (length <= i14) {
                    if (i12 == i8) {
                        return i11;
                    }
                    return -1;
                }
                byte b10 = bArr[i14];
                if ((b10 & 192) != 128) {
                    if (i12 == i8) {
                        return i11;
                    }
                    return -1;
                }
                int i15 = (b9 << 6) ^ (b10 ^ UnsignedBytes.MAX_POWER_OF_TWO);
                if (i15 < 128) {
                    if (i12 == i8) {
                        return i11;
                    }
                    return -1;
                }
                int i16 = i12 + 1;
                if (i12 == i8) {
                    return i11;
                }
                if ((i15 != 10 && i15 != 13 && ((i15 >= 0 && i15 <= 31) || (127 <= i15 && i15 <= 159))) || i15 == 65533) {
                    return -1;
                }
                i11 += i15 < 65536 ? 1 : 2;
                w wVar = w.INSTANCE;
                i10 += 2;
                i12 = i16;
            } else {
                if ((b9 >> 4) == -2) {
                    int i17 = i10 + 2;
                    if (length <= i17) {
                        if (i12 == i8) {
                            return i11;
                        }
                        return -1;
                    }
                    byte b11 = bArr[i10 + 1];
                    if ((b11 & 192) != 128) {
                        if (i12 == i8) {
                            return i11;
                        }
                        return -1;
                    }
                    byte b12 = bArr[i17];
                    if ((b12 & 192) != 128) {
                        if (i12 == i8) {
                            return i11;
                        }
                        return -1;
                    }
                    int i18 = (b9 << 12) ^ ((b12 ^ UnsignedBytes.MAX_POWER_OF_TWO) ^ (b11 << 6));
                    if (i18 < 2048) {
                        if (i12 == i8) {
                            return i11;
                        }
                        return -1;
                    }
                    if (55296 <= i18 && i18 <= 57343) {
                        if (i12 == i8) {
                            return i11;
                        }
                        return -1;
                    }
                    i9 = i12 + 1;
                    if (i12 == i8) {
                        return i11;
                    }
                    if ((i18 != 10 && i18 != 13 && ((i18 >= 0 && i18 <= 31) || (127 <= i18 && i18 <= 159))) || i18 == 65533) {
                        return -1;
                    }
                    i11 += i18 < 65536 ? 1 : 2;
                    w wVar2 = w.INSTANCE;
                    i10 += 3;
                } else {
                    if ((b9 >> 3) != -2) {
                        if (i12 == i8) {
                            return i11;
                        }
                        return -1;
                    }
                    int i19 = i10 + 3;
                    if (length <= i19) {
                        if (i12 == i8) {
                            return i11;
                        }
                        return -1;
                    }
                    byte b13 = bArr[i10 + 1];
                    if ((b13 & 192) != 128) {
                        if (i12 == i8) {
                            return i11;
                        }
                        return -1;
                    }
                    byte b14 = bArr[i10 + 2];
                    if ((b14 & 192) != 128) {
                        if (i12 == i8) {
                            return i11;
                        }
                        return -1;
                    }
                    byte b15 = bArr[i19];
                    if ((b15 & 192) != 128) {
                        if (i12 == i8) {
                            return i11;
                        }
                        return -1;
                    }
                    int i20 = (b9 << 18) ^ (((b15 ^ UnsignedBytes.MAX_POWER_OF_TWO) ^ (b14 << 6)) ^ (b13 << 12));
                    if (i20 > 1114111) {
                        if (i12 == i8) {
                            return i11;
                        }
                        return -1;
                    }
                    if (55296 <= i20 && i20 <= 57343) {
                        if (i12 == i8) {
                            return i11;
                        }
                        return -1;
                    }
                    if (i20 < 65536) {
                        if (i12 == i8) {
                            return i11;
                        }
                        return -1;
                    }
                    i9 = i12 + 1;
                    if (i12 == i8) {
                        return i11;
                    }
                    if ((i20 != 10 && i20 != 13 && ((i20 >= 0 && i20 <= 31) || (127 <= i20 && i20 <= 159))) || i20 == 65533) {
                        return -1;
                    }
                    i11 += i20 < 65536 ? 1 : 2;
                    w wVar3 = w.INSTANCE;
                    i10 += 4;
                }
                i12 = i9;
            }
        }
        return i11;
    }

    public static final String commonBase64(ByteString byteString) {
        s.checkNotNullParameter(byteString, "<this>");
        return b1.encodeBase64$default(byteString.getData$okio(), null, 1, null);
    }

    public static final String commonBase64Url(ByteString byteString) {
        s.checkNotNullParameter(byteString, "<this>");
        return b1.encodeBase64(byteString.getData$okio(), b1.getBASE64_URL_SAFE());
    }

    public static final int commonCompareTo(ByteString byteString, ByteString other) {
        s.checkNotNullParameter(byteString, "<this>");
        s.checkNotNullParameter(other, "other");
        int size = byteString.size();
        int size2 = other.size();
        int min = Math.min(size, size2);
        for (int i8 = 0; i8 < min; i8++) {
            int i9 = byteString.getByte(i8) & 255;
            int i10 = other.getByte(i8) & 255;
            if (i9 != i10) {
                return i9 < i10 ? -1 : 1;
            }
        }
        if (size == size2) {
            return 0;
        }
        return size < size2 ? -1 : 1;
    }

    public static final void commonCopyInto(ByteString byteString, int i8, byte[] target, int i9, int i10) {
        s.checkNotNullParameter(byteString, "<this>");
        s.checkNotNullParameter(target, "target");
        k.copyInto(byteString.getData$okio(), target, i9, i8, i10 + i8);
    }

    public static final ByteString commonDecodeBase64(String str) {
        s.checkNotNullParameter(str, "<this>");
        byte[] decodeBase64ToArray = b1.decodeBase64ToArray(str);
        if (decodeBase64ToArray != null) {
            return new ByteString(decodeBase64ToArray);
        }
        return null;
    }

    public static final ByteString commonDecodeHex(String str) {
        s.checkNotNullParameter(str, "<this>");
        int i8 = 0;
        if (!(str.length() % 2 == 0)) {
            throw new IllegalArgumentException(s.stringPlus("Unexpected hex string: ", str).toString());
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        int i9 = length - 1;
        if (i9 >= 0) {
            while (true) {
                int i10 = i8 + 1;
                int i11 = i8 * 2;
                bArr[i8] = (byte) ((decodeHexDigit(str.charAt(i11)) << 4) + decodeHexDigit(str.charAt(i11 + 1)));
                if (i10 > i9) {
                    break;
                }
                i8 = i10;
            }
        }
        return new ByteString(bArr);
    }

    public static final ByteString commonEncodeUtf8(String str) {
        s.checkNotNullParameter(str, "<this>");
        ByteString byteString = new ByteString(c1.asUtf8ToByteArray(str));
        byteString.setUtf8$okio(str);
        return byteString;
    }

    public static final boolean commonEndsWith(ByteString byteString, ByteString suffix) {
        s.checkNotNullParameter(byteString, "<this>");
        s.checkNotNullParameter(suffix, "suffix");
        return byteString.rangeEquals(byteString.size() - suffix.size(), suffix, 0, suffix.size());
    }

    public static final boolean commonEquals(ByteString byteString, Object obj) {
        s.checkNotNullParameter(byteString, "<this>");
        if (obj == byteString) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString2 = (ByteString) obj;
            if (byteString2.size() == byteString.getData$okio().length && byteString2.rangeEquals(0, byteString.getData$okio(), 0, byteString.getData$okio().length)) {
                return true;
            }
        }
        return false;
    }

    public static final byte commonGetByte(ByteString byteString, int i8) {
        s.checkNotNullParameter(byteString, "<this>");
        return byteString.getData$okio()[i8];
    }

    public static final int commonGetSize(ByteString byteString) {
        s.checkNotNullParameter(byteString, "<this>");
        return byteString.getData$okio().length;
    }

    public static final int commonHashCode(ByteString byteString) {
        s.checkNotNullParameter(byteString, "<this>");
        int hashCode$okio = byteString.getHashCode$okio();
        if (hashCode$okio != 0) {
            return hashCode$okio;
        }
        int hashCode = Arrays.hashCode(byteString.getData$okio());
        byteString.setHashCode$okio(hashCode);
        return hashCode;
    }

    public static final String commonHex(ByteString byteString) {
        String concatToString;
        s.checkNotNullParameter(byteString, "<this>");
        char[] cArr = new char[byteString.getData$okio().length * 2];
        byte[] data$okio = byteString.getData$okio();
        int length = data$okio.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            byte b8 = data$okio[i8];
            i8++;
            int i10 = i9 + 1;
            cArr[i9] = getHEX_DIGIT_CHARS()[(b8 >> 4) & 15];
            i9 += 2;
            cArr[i10] = getHEX_DIGIT_CHARS()[b8 & 15];
        }
        concatToString = t.concatToString(cArr);
        return concatToString;
    }

    public static final int commonIndexOf(ByteString byteString, byte[] other, int i8) {
        s.checkNotNullParameter(byteString, "<this>");
        s.checkNotNullParameter(other, "other");
        int length = byteString.getData$okio().length - other.length;
        int max = Math.max(i8, 0);
        if (max > length) {
            return -1;
        }
        while (true) {
            int i9 = max + 1;
            if (d1.arrayRangeEquals(byteString.getData$okio(), max, other, 0, other.length)) {
                return max;
            }
            if (max == length) {
                return -1;
            }
            max = i9;
        }
    }

    public static final byte[] commonInternalArray(ByteString byteString) {
        s.checkNotNullParameter(byteString, "<this>");
        return byteString.getData$okio();
    }

    public static final int commonLastIndexOf(ByteString byteString, ByteString other, int i8) {
        s.checkNotNullParameter(byteString, "<this>");
        s.checkNotNullParameter(other, "other");
        return byteString.lastIndexOf(other.internalArray$okio(), i8);
    }

    public static final ByteString commonOf(byte[] data) {
        s.checkNotNullParameter(data, "data");
        byte[] copyOf = Arrays.copyOf(data, data.length);
        s.checkNotNullExpressionValue(copyOf, "java.util.Arrays.copyOf(this, size)");
        return new ByteString(copyOf);
    }

    public static final boolean commonRangeEquals(ByteString byteString, int i8, ByteString other, int i9, int i10) {
        s.checkNotNullParameter(byteString, "<this>");
        s.checkNotNullParameter(other, "other");
        return other.rangeEquals(i9, byteString.getData$okio(), i8, i10);
    }

    public static final boolean commonStartsWith(ByteString byteString, ByteString prefix) {
        s.checkNotNullParameter(byteString, "<this>");
        s.checkNotNullParameter(prefix, "prefix");
        return byteString.rangeEquals(0, prefix, 0, prefix.size());
    }

    public static final ByteString commonSubstring(ByteString byteString, int i8, int i9) {
        s.checkNotNullParameter(byteString, "<this>");
        int resolveDefaultParameter = d1.resolveDefaultParameter(byteString, i9);
        if (!(i8 >= 0)) {
            throw new IllegalArgumentException("beginIndex < 0".toString());
        }
        if (resolveDefaultParameter <= byteString.getData$okio().length) {
            if (resolveDefaultParameter - i8 >= 0) {
                return (i8 == 0 && resolveDefaultParameter == byteString.getData$okio().length) ? byteString : new ByteString(k.copyOfRange(byteString.getData$okio(), i8, resolveDefaultParameter));
            }
            throw new IllegalArgumentException("endIndex < beginIndex".toString());
        }
        throw new IllegalArgumentException(("endIndex > length(" + byteString.getData$okio().length + ')').toString());
    }

    public static final ByteString commonToAsciiLowercase(ByteString byteString) {
        byte b8;
        s.checkNotNullParameter(byteString, "<this>");
        for (int i8 = 0; i8 < byteString.getData$okio().length; i8++) {
            byte b9 = byteString.getData$okio()[i8];
            byte b10 = (byte) 65;
            if (b9 >= b10 && b9 <= (b8 = (byte) 90)) {
                byte[] data$okio = byteString.getData$okio();
                byte[] copyOf = Arrays.copyOf(data$okio, data$okio.length);
                s.checkNotNullExpressionValue(copyOf, "java.util.Arrays.copyOf(this, size)");
                copyOf[i8] = (byte) (b9 + 32);
                for (int i9 = i8 + 1; i9 < copyOf.length; i9++) {
                    byte b11 = copyOf[i9];
                    if (b11 >= b10 && b11 <= b8) {
                        copyOf[i9] = (byte) (b11 + 32);
                    }
                }
                return new ByteString(copyOf);
            }
        }
        return byteString;
    }

    public static final ByteString commonToAsciiUppercase(ByteString byteString) {
        byte b8;
        s.checkNotNullParameter(byteString, "<this>");
        for (int i8 = 0; i8 < byteString.getData$okio().length; i8++) {
            byte b9 = byteString.getData$okio()[i8];
            byte b10 = (byte) 97;
            if (b9 >= b10 && b9 <= (b8 = (byte) 122)) {
                byte[] data$okio = byteString.getData$okio();
                byte[] copyOf = Arrays.copyOf(data$okio, data$okio.length);
                s.checkNotNullExpressionValue(copyOf, "java.util.Arrays.copyOf(this, size)");
                copyOf[i8] = (byte) (b9 - 32);
                for (int i9 = i8 + 1; i9 < copyOf.length; i9++) {
                    byte b11 = copyOf[i9];
                    if (b11 >= b10 && b11 <= b8) {
                        copyOf[i9] = (byte) (b11 - 32);
                    }
                }
                return new ByteString(copyOf);
            }
        }
        return byteString;
    }

    public static final byte[] commonToByteArray(ByteString byteString) {
        s.checkNotNullParameter(byteString, "<this>");
        byte[] data$okio = byteString.getData$okio();
        byte[] copyOf = Arrays.copyOf(data$okio, data$okio.length);
        s.checkNotNullExpressionValue(copyOf, "java.util.Arrays.copyOf(this, size)");
        return copyOf;
    }

    public static final ByteString commonToByteString(byte[] bArr, int i8, int i9) {
        s.checkNotNullParameter(bArr, "<this>");
        d1.checkOffsetAndCount(bArr.length, i8, i9);
        return new ByteString(k.copyOfRange(bArr, i8, i9 + i8));
    }

    public static final String commonToString(ByteString byteString) {
        String replace$default;
        String replace$default2;
        String replace$default3;
        ByteString byteString2 = byteString;
        s.checkNotNullParameter(byteString2, "<this>");
        if (byteString.getData$okio().length == 0) {
            return "[size=0]";
        }
        int codePointIndexToCharIndex = codePointIndexToCharIndex(byteString.getData$okio(), 64);
        if (codePointIndexToCharIndex != -1) {
            String utf8 = byteString.utf8();
            if (utf8 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String substring = utf8.substring(0, codePointIndexToCharIndex);
            s.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            replace$default = t.replace$default(substring, "\\", "\\\\", false, 4, (Object) null);
            replace$default2 = t.replace$default(replace$default, "\n", "\\n", false, 4, (Object) null);
            replace$default3 = t.replace$default(replace$default2, "\r", "\\r", false, 4, (Object) null);
            if (codePointIndexToCharIndex >= utf8.length()) {
                return "[text=" + replace$default3 + ']';
            }
            return "[size=" + byteString.getData$okio().length + " text=" + replace$default3 + "…]";
        }
        if (byteString.getData$okio().length <= 64) {
            return "[hex=" + byteString.hex() + ']';
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[size=");
        sb.append(byteString.getData$okio().length);
        sb.append(" hex=");
        int resolveDefaultParameter = d1.resolveDefaultParameter(byteString2, 64);
        if (!(resolveDefaultParameter <= byteString.getData$okio().length)) {
            throw new IllegalArgumentException(("endIndex > length(" + byteString.getData$okio().length + ')').toString());
        }
        if (!(resolveDefaultParameter >= 0)) {
            throw new IllegalArgumentException("endIndex < beginIndex".toString());
        }
        if (resolveDefaultParameter != byteString.getData$okio().length) {
            byteString2 = new ByteString(k.copyOfRange(byteString.getData$okio(), 0, resolveDefaultParameter));
        }
        sb.append(byteString2.hex());
        sb.append("…]");
        return sb.toString();
    }

    public static final String commonUtf8(ByteString byteString) {
        s.checkNotNullParameter(byteString, "<this>");
        String utf8$okio = byteString.getUtf8$okio();
        if (utf8$okio != null) {
            return utf8$okio;
        }
        String utf8String = c1.toUtf8String(byteString.internalArray$okio());
        byteString.setUtf8$okio(utf8String);
        return utf8String;
    }

    public static final void commonWrite(ByteString byteString, okio.c buffer, int i8, int i9) {
        s.checkNotNullParameter(byteString, "<this>");
        s.checkNotNullParameter(buffer, "buffer");
        buffer.write(byteString.getData$okio(), i8, i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int decodeHexDigit(char c8) {
        if ('0' <= c8 && c8 <= '9') {
            return c8 - '0';
        }
        if ('a' <= c8 && c8 <= 'f') {
            return c8 - 'W';
        }
        if ('A' > c8 || c8 > 'F') {
            throw new IllegalArgumentException(s.stringPlus("Unexpected hex digit: ", Character.valueOf(c8)));
        }
        return c8 - '7';
    }

    public static final char[] getHEX_DIGIT_CHARS() {
        return HEX_DIGIT_CHARS;
    }

    public static /* synthetic */ void getHEX_DIGIT_CHARS$annotations() {
    }

    public static final boolean commonEndsWith(ByteString byteString, byte[] suffix) {
        s.checkNotNullParameter(byteString, "<this>");
        s.checkNotNullParameter(suffix, "suffix");
        return byteString.rangeEquals(byteString.size() - suffix.length, suffix, 0, suffix.length);
    }

    public static final int commonLastIndexOf(ByteString byteString, byte[] other, int i8) {
        s.checkNotNullParameter(byteString, "<this>");
        s.checkNotNullParameter(other, "other");
        int min = Math.min(d1.resolveDefaultParameter(byteString, i8), byteString.getData$okio().length - other.length);
        if (min < 0) {
            return -1;
        }
        while (true) {
            int i9 = min - 1;
            if (d1.arrayRangeEquals(byteString.getData$okio(), min, other, 0, other.length)) {
                return min;
            }
            if (i9 < 0) {
                return -1;
            }
            min = i9;
        }
    }

    public static final boolean commonRangeEquals(ByteString byteString, int i8, byte[] other, int i9, int i10) {
        s.checkNotNullParameter(byteString, "<this>");
        s.checkNotNullParameter(other, "other");
        return i8 >= 0 && i8 <= byteString.getData$okio().length - i10 && i9 >= 0 && i9 <= other.length - i10 && d1.arrayRangeEquals(byteString.getData$okio(), i8, other, i9, i10);
    }

    public static final boolean commonStartsWith(ByteString byteString, byte[] prefix) {
        s.checkNotNullParameter(byteString, "<this>");
        s.checkNotNullParameter(prefix, "prefix");
        return byteString.rangeEquals(0, prefix, 0, prefix.length);
    }
}
