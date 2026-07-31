package com.yandex.mobile.ads.impl;

import android.util.Base64;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.yandex.mobile.ads.impl.a11;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class zp1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final a11 f35654a;

    static {
        int i4 = a11.f23122d;
        f35654a = a11.a.a();
    }

    public static final void a(long j4, @NotNull op1<?> request, @Nullable lc1 lc1Var) {
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(request, "request");
        byte[] b4 = request.b();
        String str3 = null;
        if (b4 != null) {
            try {
                str = StringsKt.t(b4);
            } catch (Exception unused) {
                str = "UNKNOWN_CONTENT";
            }
        } else {
            str = null;
        }
        byte[] bArr = lc1Var.f28506b;
        if (bArr != null) {
            if (request instanceof aj0) {
                str3 = "IMAGE_CONTENT";
            } else {
                try {
                    byte[] decode = Base64.decode(bArr, 0);
                    Intrinsics.checkNotNullExpressionValue(decode, "decode(...)");
                    str3 = StringsKt.t(decode);
                } catch (IllegalArgumentException unused2) {
                    str3 = StringsKt.t(bArr);
                } catch (Exception unused3) {
                    str2 = "UNKNOWN_CONTENT";
                }
            }
        }
        str2 = str3;
        a11 a11Var = f35654a;
        int f4 = request.f();
        String str4 = f4 == 0 ? com.ironsource.jn.f16864a : f4 == 1 ? com.ironsource.jn.f16865b : f4 == 2 ? "PUT" : f4 == 3 ? "DELETE" : f4 == 4 ? "HEAD" : f4 == 5 ? "OPTIONS" : f4 == 6 ? "TRACE" : f4 == 7 ? "PATCH" : GrsBaseInfo.CountryCodeSource.UNKNOWN;
        String l4 = request.l();
        Intrinsics.checkNotNullExpressionValue(l4, "getUrl(...)");
        a11Var.a(j4, str4, l4, request.e(), str, Integer.valueOf(lc1Var.f28505a), lc1Var.f28507c, str2);
    }
}
