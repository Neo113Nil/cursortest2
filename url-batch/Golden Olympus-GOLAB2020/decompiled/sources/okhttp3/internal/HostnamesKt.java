package okhttp3.internal;

import com.ironsource.b9;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.net.IDN;
import java.net.InetAddress;
import java.util.Locale;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okio.C3372e;

@Metadata
/* loaded from: classes3.dex */
public final class HostnamesKt {
    private static final boolean a(String str) {
        int length = str.length();
        for (int i4 = 0; i4 < length; i4++) {
            char charAt = str.charAt(i4);
            if (Intrinsics.compare((int) charAt, 31) <= 0 || Intrinsics.compare((int) charAt, 127) >= 0 || StringsKt.b0(" #%/:?@[\\]", charAt, 0, false, 6, null) != -1) {
                return true;
            }
        }
        return false;
    }

    private static final boolean b(String str, int i4, int i5, byte[] bArr, int i6) {
        int i7 = i6;
        while (i4 < i5) {
            if (i7 == bArr.length) {
                return false;
            }
            if (i7 != i6) {
                if (str.charAt(i4) != '.') {
                    return false;
                }
                i4++;
            }
            int i8 = i4;
            int i9 = 0;
            while (i8 < i5) {
                char charAt = str.charAt(i8);
                if (Intrinsics.compare((int) charAt, 48) < 0 || Intrinsics.compare((int) charAt, 57) > 0) {
                    break;
                }
                if ((i9 == 0 && i4 != i8) || (i9 = ((i9 * 10) + charAt) - 48) > 255) {
                    return false;
                }
                i8++;
            }
            if (i8 - i4 == 0) {
                return false;
            }
            bArr[i7] = (byte) i9;
            i7++;
            i4 = i8;
        }
        return i7 == i6 + 4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0091, code lost:
    
        if (r11 == 16) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0093, code lost:
    
        if (r12 != (-1)) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0095, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0096, code lost:
    
        r0 = r11 - r12;
        java.lang.System.arraycopy(r8, r12, r8, 16 - r0, r0);
        java.util.Arrays.fill(r8, r12, (16 - r11) + r12, (byte) 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a6, code lost:
    
        return java.net.InetAddress.getByAddress(r8);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final InetAddress c(String str, int i4, int i5) {
        String str2;
        int i6;
        byte[] bArr = new byte[16];
        int i7 = i4;
        int i8 = 0;
        int i9 = -1;
        int i10 = -1;
        while (true) {
            if (i7 < i5) {
                if (i8 != 16) {
                    int i11 = i7 + 2;
                    if (i11 <= i5 && StringsKt.J(str, "::", i7, false, 4, null)) {
                        if (i9 == -1) {
                            i8 += 2;
                            if (i11 != i5) {
                                str2 = str;
                                i9 = i8;
                                i10 = i11;
                                int i12 = 0;
                                i7 = i10;
                                while (i7 < i5) {
                                }
                                i6 = i7 - i10;
                                if (i6 == 0) {
                                    break;
                                }
                                break;
                            }
                            i9 = i8;
                            break;
                        }
                        return null;
                    }
                    if (i8 != 0) {
                        if (StringsKt.J(str, StringUtils.PROCESS_POSTFIX_DELIMITER, i7, false, 4, null)) {
                            i7++;
                        } else {
                            if (!StringsKt.J(str, ".", i7, false, 4, null) || !b(str, i10, i5, bArr, i8 - 2)) {
                                return null;
                            }
                            i8 += 2;
                        }
                    }
                    str2 = str;
                    i10 = i7;
                    int i122 = 0;
                    i7 = i10;
                    while (i7 < i5) {
                        int H3 = Util.H(str2.charAt(i7));
                        if (H3 == -1) {
                            break;
                        }
                        i122 = (i122 << 4) + H3;
                        i7++;
                    }
                    i6 = i7 - i10;
                    if (i6 == 0 || i6 > 4) {
                        break;
                    }
                    int i13 = i8 + 1;
                    bArr[i8] = (byte) ((i122 >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                    i8 += 2;
                    bArr[i13] = (byte) (i122 & KotlinVersion.MAX_COMPONENT_VALUE);
                } else {
                    return null;
                }
            } else {
                break;
            }
        }
        return null;
    }

    private static final String d(byte[] bArr) {
        int i4 = -1;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i6 < bArr.length) {
            int i8 = i6;
            while (i8 < 16 && bArr[i8] == 0 && bArr[i8 + 1] == 0) {
                i8 += 2;
            }
            int i9 = i8 - i6;
            if (i9 > i7 && i9 >= 4) {
                i4 = i6;
                i7 = i9;
            }
            i6 = i8 + 2;
        }
        C3372e c3372e = new C3372e();
        while (i5 < bArr.length) {
            if (i5 == i4) {
                c3372e.w(58);
                i5 += i7;
                if (i5 == 16) {
                    c3372e.w(58);
                }
            } else {
                if (i5 > 0) {
                    c3372e.w(58);
                }
                c3372e.G((Util.d(bArr[i5], KotlinVersion.MAX_COMPONENT_VALUE) << 8) | Util.d(bArr[i5 + 1], KotlinVersion.MAX_COMPONENT_VALUE));
                i5 += 2;
            }
        }
        return c3372e.i0();
    }

    public static final String e(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (!StringsKt.P(str, StringUtils.PROCESS_POSTFIX_DELIMITER, false, 2, null)) {
            try {
                String ascii = IDN.toASCII(str);
                Intrinsics.checkNotNullExpressionValue(ascii, "toASCII(host)");
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                String lowerCase = ascii.toLowerCase(US);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (lowerCase.length() == 0) {
                    return null;
                }
                if (a(lowerCase)) {
                    return null;
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress c4 = (StringsKt.K(str, b9.i.f15550d, false, 2, null) && StringsKt.v(str, b9.i.f15552e, false, 2, null)) ? c(str, 1, str.length() - 1) : c(str, 0, str.length());
        if (c4 == null) {
            return null;
        }
        byte[] address = c4.getAddress();
        if (address.length == 16) {
            Intrinsics.checkNotNullExpressionValue(address, "address");
            return d(address);
        }
        if (address.length == 4) {
            return c4.getHostAddress();
        }
        throw new AssertionError("Invalid IPv6 address: '" + str + '\'');
    }
}
