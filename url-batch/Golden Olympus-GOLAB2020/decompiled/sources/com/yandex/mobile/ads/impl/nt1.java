package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class nt1 implements f51 {
    @Override // com.yandex.mobile.ads.impl.f51
    @NotNull
    public final e51 a(@NotNull Context context, @NotNull C2360y7 adResponse, @NotNull C2286v2 adConfiguration) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        return new e51(context, adConfiguration, adResponse);
    }
}
