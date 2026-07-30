package okhttp3.internal;

import java.net.IDN;
import java.net.InetAddress;
import java.util.Locale;
import kotlin.jvm.internal.s;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.t;
import okio.c;

/* loaded from: classes5.dex */
public final class HostnamesKt {
    private static final boolean containsInvalidHostnameAsciiCodes(String str) {
        int length = str.length();
        int i8 = 0;
        while (i8 < length) {
            int i9 = i8 + 1;
            char charAt = str.charAt(i8);
            if (s.compare((int) charAt, 31) <= 0 || s.compare((int) charAt, 127) >= 0 || StringsKt__StringsKt.indexOf$default((CharSequence) " #%/:?@[\\]", charAt, 0, false, 6, (Object) null) != -1) {
                return true;
            }
            i8 = i9;
        }
        return false;
    }

    private static final boolean decodeIpv4Suffix(String str, int i8, int i9, byte[] bArr, int i10) {
        int i11 = i10;
        while (i8 < i9) {
            if (i11 == bArr.length) {
                return false;
            }
            if (i11 != i10) {
                if (str.charAt(i8) != '.') {
                    return false;
                }
                i8++;
            }
            int i12 = i8;
            int i13 = 0;
            while (i12 < i9) {
                char charAt = str.charAt(i12);
                if (s.compare((int) charAt, 48) < 0 || s.compare((int) charAt, 57) > 0) {
                    break;
                }
                if ((i13 == 0 && i8 != i12) || (i13 = ((i13 * 10) + charAt) - 48) > 255) {
                    return false;
                }
                i12++;
            }
            if (i12 - i8 == 0) {
                return false;
            }
            bArr[i11] = (byte) i13;
            i11++;
            i8 = i12;
        }
        return i11 == i10 + 4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0097, code lost:
    
        if (r13 == 16) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0099, code lost:
    
        if (r14 != (-1)) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009b, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009c, code lost:
    
        r0 = r13 - r14;
        java.lang.System.arraycopy(r9, r14, r9, 16 - r0, r0);
        java.util.Arrays.fill(r9, r14, (16 - r13) + r14, (byte) 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ad, code lost:
    
        return java.net.InetAddress.getByAddress(r9);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final InetAddress decodeIpv6(String str, int i8, int i9) {
        int i10;
        byte[] bArr = new byte[16];
        int i11 = i8;
        int i12 = 0;
        int i13 = -1;
        int i14 = -1;
        while (true) {
            if (i11 < i9) {
                if (i12 != 16) {
                    int i15 = i11 + 2;
                    if (i15 <= i9 && t.startsWith$default(str, "::", i11, false, 4, null)) {
                        if (i13 == -1) {
                            i12 += 2;
                            if (i15 != i9) {
                                i14 = i15;
                                i13 = i12;
                                i11 = i14;
                                int i16 = 0;
                                while (i11 < i9) {
                                }
                                i10 = i11 - i14;
                                if (i10 == 0) {
                                    break;
                                }
                                break;
                            }
                            i13 = i12;
                            break;
                        }
                        return null;
                    }
                    if (i12 != 0) {
                        if (t.startsWith$default(str, ":", i11, false, 4, null)) {
                            i11++;
                        } else {
                            if (!t.startsWith$default(str, ".", i11, false, 4, null) || !decodeIpv4Suffix(str, i14, i9, bArr, i12 - 2)) {
                                return null;
                            }
                            i12 += 2;
                        }
                    }
                    i14 = i11;
                    i11 = i14;
                    int i162 = 0;
                    while (i11 < i9) {
                        int parseHexDigit = Util.parseHexDigit(str.charAt(i11));
                        if (parseHexDigit == -1) {
                            break;
                        }
                        i162 = (i162 << 4) + parseHexDigit;
                        i11++;
                    }
                    i10 = i11 - i14;
                    if (i10 == 0 || i10 > 4) {
                        break;
                    }
                    int i17 = i12 + 1;
                    bArr[i12] = (byte) ((i162 >>> 8) & 255);
                    i12 += 2;
                    bArr[i17] = (byte) (i162 & 255);
                } else {
                    return null;
                }
            } else {
                break;
            }
        }
        return null;
    }

    private static final String inet6AddressToAscii(byte[] bArr) {
        int i8 = -1;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i10 < bArr.length) {
            int i12 = i10;
            while (i12 < 16 && bArr[i12] == 0 && bArr[i12 + 1] == 0) {
                i12 += 2;
            }
            int i13 = i12 - i10;
            if (i13 > i11 && i13 >= 4) {
                i8 = i10;
                i11 = i13;
            }
            i10 = i12 + 2;
        }
        c cVar = new c();
        while (i9 < bArr.length) {
            if (i9 == i8) {
                cVar.writeByte(58);
                i9 += i11;
                if (i9 == 16) {
                    cVar.writeByte(58);
                }
            } else {
                if (i9 > 0) {
                    cVar.writeByte(58);
                }
                cVar.writeHexadecimalUnsignedLong((Util.and(bArr[i9], 255) << 8) | Util.and(bArr[i9 + 1], 255));
                i9 += 2;
            }
        }
        return cVar.readUtf8();
    }

    public static final String toCanonicalHost(String str) {
        boolean contains$default;
        s.checkNotNullParameter(str, "<this>");
        contains$default = StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) ":", false, 2, (Object) null);
        if (!contains$default) {
            try {
                String ascii = IDN.toASCII(str);
                s.checkNotNullExpressionValue(ascii, "toASCII(host)");
                Locale US = Locale.US;
                s.checkNotNullExpressionValue(US, "US");
                String lowerCase = ascii.toLowerCase(US);
                s.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (lowerCase.length() == 0) {
                    return null;
                }
                if (containsInvalidHostnameAsciiCodes(lowerCase)) {
                    return null;
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress decodeIpv6 = (t.startsWith$default(str, "[", false, 2, null) && t.endsWith$default(str, "]", false, 2, null)) ? decodeIpv6(str, 1, str.length() - 1) : decodeIpv6(str, 0, str.length());
        if (decodeIpv6 == null) {
            return null;
        }
        byte[] address = decodeIpv6.getAddress();
        if (address.length == 16) {
            s.checkNotNullExpressionValue(address, "address");
            return inet6AddressToAscii(address);
        }
        if (address.length == 4) {
            return decodeIpv6.getHostAddress();
        }
        throw new AssertionError("Invalid IPv6 address: '" + str + '\'');
    }
}
