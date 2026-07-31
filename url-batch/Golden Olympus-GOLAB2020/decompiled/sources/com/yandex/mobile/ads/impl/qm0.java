package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class qm0 {
    @NotNull
    public static pm0 a(@NotNull Context context, @NotNull ob2 videoAdInfo) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        return new pm0(new om0(context, videoAdInfo, new iu(), new o12(context, videoAdInfo), new zy(context)).a());
    }
}
