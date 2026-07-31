package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ff0;
import com.yandex.mobile.ads.impl.pp1;
import com.yandex.mobile.ads.impl.sp1;
import java.net.URL;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class yd1 {
    @NotNull
    public final pp1 a(@NotNull op1<?> request, @NotNull Map<String, String> additionalHeaders) {
        d01 d01Var;
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(additionalHeaders, "additionalHeaders");
        URL a4 = uc1.a(request, null);
        Map<String, String> e4 = request.e();
        Intrinsics.checkNotNullExpressionValue(e4, "getHeaders(...)");
        Map mutableMap = MapsKt.toMutableMap(MapsKt.plus(additionalHeaders, e4));
        if (!mutableMap.containsKey(com.ironsource.cc.f15718K)) {
            mutableMap.put(com.ironsource.cc.f15718K, "application/x-www-form-urlencoded; charset=UTF-8");
        }
        ff0 a5 = ff0.b.a(mutableMap);
        d01.f24376c.getClass();
        Intrinsics.checkNotNullParameter(request, "request");
        if (request.f() == -1) {
            d01Var = d01.f24377d;
        } else {
            switch (request.f()) {
                case 0:
                    d01Var = d01.f24377d;
                    break;
                case 1:
                    d01Var = d01.f24378e;
                    break;
                case 2:
                    d01Var = d01.f24379f;
                    break;
                case 3:
                    d01Var = d01.f24380g;
                    break;
                case 4:
                    d01Var = d01.f24381h;
                    break;
                case 5:
                    d01Var = d01.f24382i;
                    break;
                case 6:
                    d01Var = d01.f24383j;
                    break;
                case 7:
                    d01Var = d01.f24384k;
                    break;
                default:
                    throw new IllegalStateException("Unknown method type.");
            }
        }
        byte[] b4 = request.b();
        return new pp1.a().a(a4).a(a5).a(d01Var.a(), b4 != null ? sp1.a.a(b4) : null).a();
    }
}
