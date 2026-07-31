package com.yandex.mobile.ads.impl;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.huawei.hms.support.api.entity.core.JosStatusCodes;
import com.ironsource.InterfaceC1490j3;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.yandex.mobile.ads.impl.yb0;
import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class d40 {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f24412a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f24413b = {-1, JosStatusCodes.RTN_CODE_COMMON_ERROR, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f24414c = {64, InterfaceC1490j3.d.b.f16818j, UserVerificationMethods.USER_VERIFY_PATTERN, 192, 224, UserVerificationMethods.USER_VERIFY_HANDPRINT, 384, 448, UserVerificationMethods.USER_VERIFY_NONE, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, com.ironsource.mediationsdk.metadata.a.f17688n, IronSourceConstants.IS_AD_UNIT_CAPPED, 2560, 2688, 2816, 2823, 2944, 3072, 3840, Base64Utils.IO_BUFFER_SIZE, 6144, 7680};

    public static yb0 a(byte[] bArr, String str, String str2) {
        rf1 rf1Var;
        if (bArr[0] == Byte.MAX_VALUE) {
            rf1Var = new rf1(bArr.length, bArr);
        } else {
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            byte b4 = copyOf[0];
            if (b4 == -2 || b4 == -1) {
                for (int i4 = 0; i4 < copyOf.length - 1; i4 += 2) {
                    byte b5 = copyOf[i4];
                    int i5 = i4 + 1;
                    copyOf[i4] = copyOf[i5];
                    copyOf[i5] = b5;
                }
            }
            rf1Var = new rf1(copyOf.length, copyOf);
            if (copyOf[0] == 31) {
                rf1 rf1Var2 = new rf1(copyOf.length, copyOf);
                while (rf1Var2.b() >= 16) {
                    rf1Var2.d(2);
                    rf1Var.a(rf1Var2.b(14));
                }
            }
            rf1Var.a(copyOf.length, copyOf);
        }
        rf1Var.d(60);
        int i6 = f24412a[rf1Var.b(6)];
        int i7 = f24413b[rf1Var.b(4)];
        int b6 = rf1Var.b(5);
        int i8 = b6 < 29 ? (f24414c[b6] * 1000) / 2 : -1;
        rf1Var.d(10);
        return new yb0.a().b(str).e("audio/vnd.dts").b(i8).c(i6 + (rf1Var.b(2) > 0 ? 1 : 0)).l(i7).a((u30) null).d(str2).a();
    }
}
