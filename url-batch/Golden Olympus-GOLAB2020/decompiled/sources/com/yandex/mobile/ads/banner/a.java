package com.yandex.mobile.ads.banner;

import com.yandex.mobile.ads.impl.ms;
import com.yandex.mobile.ads.impl.vy1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class a {
    @NotNull
    public static final ms a(@NotNull BannerAdSize adSize) {
        Intrinsics.checkNotNullParameter(adSize, "adSize");
        vy1 a4 = adSize.a();
        Intrinsics.checkNotNullExpressionValue(a4, "getSizeInfo(...)");
        return new ms(a4);
    }
}
