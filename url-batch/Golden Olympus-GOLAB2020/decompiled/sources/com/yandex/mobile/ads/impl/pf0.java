package com.yandex.mobile.ads.impl;

import com.ironsource.b9;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.net.IDN;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.Locale;
import kotlin.KotlinVersion;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okio.C3372e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class pf0 {
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00e1, code lost:
    
        return r17;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final InetAddress a(int i4, int i5, String str) {
        InetAddress inetAddress;
        int i6;
        String str2;
        int i7;
        byte[] bArr = new byte[16];
        int i8 = i4;
        int i9 = 0;
        int i10 = -1;
        int i11 = -1;
        while (true) {
            if (i8 >= i5) {
                inetAddress = null;
                break;
            }
            if (i9 != 16) {
                int i12 = i8 + 2;
                if (i12 <= i5) {
                    inetAddress = null;
                    i6 = 255;
                    if (StringsKt.J(str, "::", i8, false, 4, null)) {
                        if (i10 != -1) {
                            return null;
                        }
                        i9 += 2;
                        if (i12 == i5) {
                            i10 = i9;
                            break;
                        }
                        str2 = str;
                        i10 = i9;
                        i11 = i12;
                        int i13 = 0;
                        i8 = i11;
                        while (i8 < i5) {
                            int a4 = v82.a(str2.charAt(i8));
                            if (a4 == -1) {
                                break;
                            }
                            i13 = (i13 << 4) + a4;
                            i8++;
                        }
                        i7 = i8 - i11;
                        if (i7 == 0 || i7 > 4) {
                            break;
                        }
                        int i14 = i9 + 1;
                        bArr[i9] = (byte) ((i13 >>> 8) & i6);
                        i9 += 2;
                        bArr[i14] = (byte) (i13 & KotlinVersion.MAX_COMPONENT_VALUE);
                    }
                } else {
                    inetAddress = null;
                    i6 = 255;
                }
                if (i9 != 0) {
                    if (!StringsKt.J(str, StringUtils.PROCESS_POSTFIX_DELIMITER, i8, false, 4, null)) {
                        if (StringsKt.J(str, ".", i8, false, 4, null)) {
                            int i15 = i9 - 2;
                            int i16 = i15;
                            loop2: while (true) {
                                if (i11 < i5) {
                                    if (i16 == 16) {
                                        break;
                                    }
                                    if (i16 != i15) {
                                        if (str.charAt(i11) != '.') {
                                            break;
                                        }
                                        i11++;
                                    }
                                    int i17 = 0;
                                    int i18 = i11;
                                    while (i18 < i5) {
                                        char charAt = str.charAt(i18);
                                        if (Intrinsics.compare((int) charAt, 48) < 0 || Intrinsics.compare((int) charAt, 57) > 0) {
                                            break;
                                        }
                                        if ((i17 == 0 && i11 != i18) || ((i17 * 10) + charAt) - 48 > i6) {
                                            break loop2;
                                        }
                                        i18++;
                                    }
                                    if (i18 - i11 == 0) {
                                        break;
                                    }
                                    bArr[i16] = (byte) i17;
                                    i11 = i18;
                                    i16++;
                                } else if (i16 == i9 + 2) {
                                    i9 += 2;
                                }
                            }
                        }
                        return inetAddress;
                    }
                    i8++;
                }
                str2 = str;
                i11 = i8;
                int i132 = 0;
                i8 = i11;
                while (i8 < i5) {
                }
                i7 = i8 - i11;
                if (i7 == 0) {
                    break;
                }
                break;
            }
            return null;
        }
        if (i9 != 16) {
            if (i10 == -1) {
                return inetAddress;
            }
            int i19 = i9 - i10;
            System.arraycopy(bArr, i10, bArr, 16 - i19, i19);
            Arrays.fill(bArr, i10, (16 - i9) + i10, (byte) 0);
        }
        return InetAddress.getByAddress(bArr);
    }

    @Nullable
    public static final String a(@NotNull String str) {
        InetAddress a4;
        Intrinsics.checkNotNullParameter(str, "<this>");
        int i4 = -1;
        if (StringsKt.P(str, StringUtils.PROCESS_POSTFIX_DELIMITER, false, 2, null)) {
            if (StringsKt.K(str, b9.i.f15550d, false, 2, null) && StringsKt.v(str, b9.i.f15552e, false, 2, null)) {
                a4 = a(1, str.length() - 1, str);
            } else {
                a4 = a(0, str.length(), str);
            }
            if (a4 == null) {
                return null;
            }
            byte[] address = a4.getAddress();
            if (address.length == 16) {
                Intrinsics.checkNotNull(address);
                int i5 = 0;
                int i6 = 0;
                while (i5 < address.length) {
                    int i7 = i5;
                    while (i7 < 16 && address[i7] == 0 && address[i7 + 1] == 0) {
                        i7 += 2;
                    }
                    int i8 = i7 - i5;
                    if (i8 > i6 && i8 >= 4) {
                        i4 = i5;
                        i6 = i8;
                    }
                    i5 = i7 + 2;
                }
                C3372e c3372e = new C3372e();
                while (r2 < address.length) {
                    if (r2 == i4) {
                        c3372e.w(58);
                        r2 += i6;
                        if (r2 == 16) {
                            c3372e.w(58);
                        }
                    } else {
                        if (r2 > 0) {
                            c3372e.w(58);
                        }
                        byte b4 = address[r2];
                        byte[] bArr = v82.f33550a;
                        c3372e.G(((b4 & 255) << 8) | (address[r2 + 1] & 255));
                        r2 += 2;
                    }
                }
                return c3372e.i0();
            }
            if (address.length == 4) {
                return a4.getHostAddress();
            }
            throw new AssertionError("Invalid IPv6 address: '" + str + "'");
        }
        try {
            String ascii = IDN.toASCII(str);
            Intrinsics.checkNotNullExpressionValue(ascii, "toASCII(...)");
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = ascii.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            if (lowerCase.length() == 0) {
                return null;
            }
            int length = lowerCase.length();
            while (r2 < length) {
                char charAt = lowerCase.charAt(r2);
                r2 = (Intrinsics.compare((int) charAt, 31) > 0 && Intrinsics.compare((int) charAt, 127) < 0 && StringsKt.b0(" #%/:?@[\\]", charAt, 0, false, 6, null) == -1) ? r2 + 1 : 0;
                return null;
            }
            return lowerCase;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
