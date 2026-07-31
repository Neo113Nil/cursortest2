package com.yandex.mobile.ads.impl;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class mg0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final mg0 f29049a = new mg0();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public static final okio.h f29050b = okio.h.f43270e.d("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final String[] f29051c = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final String[] f29052d = new String[64];

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private static final String[] f29053e;

    static {
        String[] strArr = new String[UserVerificationMethods.USER_VERIFY_HANDPRINT];
        for (int i4 = 0; i4 < 256; i4++) {
            String binaryString = Integer.toBinaryString(i4);
            Intrinsics.checkNotNullExpressionValue(binaryString, "toBinaryString(...)");
            strArr[i4] = StringsKt.F(v82.a("%8s", binaryString), ' ', '0', false, 4, null);
        }
        f29053e = strArr;
        String[] strArr2 = f29052d;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i5 = iArr[0];
        strArr2[i5 | 8] = strArr2[i5] + "|PADDED";
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i6 = 0; i6 < 3; i6++) {
            int i7 = iArr2[i6];
            int i8 = iArr[0];
            String[] strArr3 = f29052d;
            int i9 = i8 | i7;
            strArr3[i9] = strArr3[i8] + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + strArr3[i7];
            strArr3[i9 | 8] = strArr3[i8] + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + strArr3[i7] + "|PADDED";
        }
        int length = f29052d.length;
        for (int i10 = 0; i10 < length; i10++) {
            String[] strArr4 = f29052d;
            if (strArr4[i10] == null) {
                strArr4[i10] = f29053e[i10];
            }
        }
    }

    private mg0() {
    }

    @NotNull
    public static String a(int i4) {
        String[] strArr = f29051c;
        return i4 < strArr.length ? strArr[i4] : v82.a("0x%02x", Integer.valueOf(i4));
    }

    @NotNull
    public static String a(boolean z4, int i4, int i5, int i6, int i7) {
        String str;
        String str2;
        String a4 = a(i6);
        if (i7 == 0) {
            str = "";
        } else {
            if (i6 != 2 && i6 != 3) {
                if (i6 == 4 || i6 == 6) {
                    str = i7 == 1 ? "ACK" : f29053e[i7];
                } else if (i6 != 7 && i6 != 8) {
                    String[] strArr = f29052d;
                    if (i7 < strArr.length) {
                        str2 = strArr[i7];
                        Intrinsics.checkNotNull(str2);
                    } else {
                        str2 = f29053e[i7];
                    }
                    String str3 = str2;
                    str = (i6 != 5 || (i7 & 4) == 0) ? (i6 != 0 || (i7 & 32) == 0) ? str3 : StringsKt.G(str3, "PRIORITY", "COMPRESSED", false, 4, null) : StringsKt.G(str3, "HEADERS", "PUSH_PROMISE", false, 4, null);
                }
            }
            str = f29053e[i7];
        }
        return v82.a("%s 0x%08x %5d %-13s %s", z4 ? "<<" : ">>", Integer.valueOf(i4), Integer.valueOf(i5), a4, str);
    }
}
