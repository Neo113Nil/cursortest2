package okhttp3.internal.url;

import kotlin.text.StringsKt;
import okhttp3.internal._UtilCommonKt;
import okio.Buffer;
import org.slf4j.Marker;

/* loaded from: classes3.dex */
public abstract class _UrlKt {
    public static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static String canonicalize$default(int i, int i2, int i3, String str, String str2, boolean z) {
        int i4 = (i3 & 1) != 0 ? 0 : i;
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        int i5 = i2;
        boolean z2 = (i3 & 8) != 0 ? false : z;
        boolean z3 = (i3 & 16) == 0;
        boolean z4 = (i3 & 32) == 0;
        boolean z5 = (i3 & 64) == 0;
        str.getClass();
        return canonicalizeWithCharset$default(str, i4, i5, str2, z2, z3, z4, z5, 128);
    }

    public static String canonicalizeWithCharset$default(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, int i3) {
        boolean z5;
        boolean z6 = false;
        int i4 = (i3 & 1) != 0 ? 0 : i;
        int length = (i3 & 2) != 0 ? str.length() : i2;
        boolean z7 = (i3 & 8) != 0 ? false : z;
        boolean z8 = (i3 & 16) != 0 ? false : z2;
        boolean z9 = (i3 & 64) != 0 ? false : z4;
        str.getClass();
        int i5 = i4;
        while (i5 < length) {
            int codePointAt = str.codePointAt(i5);
            int i6 = 128;
            int i7 = 32;
            if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && !z9) || StringsKt.contains((CharSequence) str2, (char) codePointAt, false) || ((codePointAt == 37 && (!z7 || (z8 && !isPercentEncoded(i5, length, str)))) || (codePointAt == 43 && z3)))) {
                Buffer buffer = new Buffer();
                buffer.m4338writeUtf8(i4, i5, str);
                Buffer buffer2 = null;
                while (i5 < length) {
                    int codePointAt2 = str.codePointAt(i5);
                    if (z7 && (codePointAt2 == 9 || codePointAt2 == 10 || codePointAt2 == 12 || codePointAt2 == 13)) {
                        z5 = z6;
                    } else {
                        String str3 = Marker.ANY_NON_NULL_MARKER;
                        if (codePointAt2 == i7 && str2 == " !\"#$&'()+,/:;<=>?@[\\]^`{|}~") {
                            buffer.m4339writeUtf8(Marker.ANY_NON_NULL_MARKER);
                        } else if (codePointAt2 == 43 && z3) {
                            if (!z7) {
                                str3 = "%2B";
                            }
                            buffer.m4339writeUtf8(str3);
                        } else {
                            if (codePointAt2 < i7 || codePointAt2 == 127 || (codePointAt2 >= i6 && !z9)) {
                                z5 = false;
                            } else {
                                z5 = false;
                                if (!StringsKt.contains((CharSequence) str2, (char) codePointAt2, false) && (codePointAt2 != 37 || (z7 && (!z8 || isPercentEncoded(i5, length, str))))) {
                                    buffer.writeUtf8CodePoint(codePointAt2);
                                }
                            }
                            if (buffer2 == null) {
                                buffer2 = new Buffer();
                            }
                            buffer2.writeUtf8CodePoint(codePointAt2);
                            while (!buffer2.exhausted()) {
                                byte readByte = buffer2.readByte();
                                buffer.m4335writeByte(37);
                                char[] cArr = HEX_DIGITS;
                                buffer.m4335writeByte((int) cArr[((readByte & 255) >> 4) & 15]);
                                buffer.m4335writeByte((int) cArr[readByte & 15]);
                            }
                        }
                        z5 = false;
                    }
                    i5 += Character.charCount(codePointAt2);
                    z6 = z5;
                    i6 = 128;
                    i7 = 32;
                }
                return buffer.readUtf8();
            }
            i5 += Character.charCount(codePointAt);
        }
        return str.substring(i4, length);
    }

    public static final boolean isPercentEncoded(int i, int i2, String str) {
        str.getClass();
        int i3 = i + 2;
        return i3 < i2 && str.charAt(i) == '%' && _UtilCommonKt.parseHexDigit(str.charAt(i + 1)) != -1 && _UtilCommonKt.parseHexDigit(str.charAt(i3)) != -1;
    }

    public static String percentDecode$default(int i, int i2, int i3, String str) {
        int i4;
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        boolean z = (i3 & 4) == 0;
        str.getClass();
        int i5 = i;
        while (i5 < i2) {
            char charAt = str.charAt(i5);
            if (charAt == '%' || (charAt == '+' && z)) {
                Buffer buffer = new Buffer();
                buffer.m4338writeUtf8(i, i5, str);
                while (i5 < i2) {
                    int codePointAt = str.codePointAt(i5);
                    if (codePointAt != 37 || (i4 = i5 + 2) >= i2) {
                        if (codePointAt == 43 && z) {
                            buffer.m4335writeByte(32);
                            i5++;
                        }
                        buffer.writeUtf8CodePoint(codePointAt);
                        i5 += Character.charCount(codePointAt);
                    } else {
                        int parseHexDigit = _UtilCommonKt.parseHexDigit(str.charAt(i5 + 1));
                        int parseHexDigit2 = _UtilCommonKt.parseHexDigit(str.charAt(i4));
                        if (parseHexDigit != -1 && parseHexDigit2 != -1) {
                            buffer.m4335writeByte((parseHexDigit << 4) + parseHexDigit2);
                            i5 = Character.charCount(codePointAt) + i4;
                        }
                        buffer.writeUtf8CodePoint(codePointAt);
                        i5 += Character.charCount(codePointAt);
                    }
                }
                return buffer.readUtf8();
            }
            i5++;
        }
        return str.substring(i, i2);
    }
}
