package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class kc1 {
    @NotNull
    public static final mi2 a(@NotNull C2286v2 adConfiguration, @NotNull pi2 volleyResponseBodyParser) {
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(volleyResponseBodyParser, "volleyResponseBodyParser");
        vq1 responseBodyParser = new vq1(volleyResponseBodyParser);
        ji2 ji2Var = new ji2();
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(responseBodyParser, "responseBodyParser");
        return new mi2(adConfiguration, volleyResponseBodyParser, responseBodyParser, ji2Var, new rc1(adConfiguration, responseBodyParser, new i80(), new ty0(), new pr1(), new wr(), new uf0(), new cs0(), new C1876dd(), new C2383z7()));
    }

    @NotNull
    public static final li2 a() {
        return new li2(new ji2(), new oc1());
    }
}
