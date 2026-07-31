package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.div.core.DivConfiguration;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class tz1 {
    @NotNull
    public static DivConfiguration a(@NotNull Context context, @NotNull sz1 divExtensionHandler, @NotNull k20 clickHandler) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(divExtensionHandler, "divExtensionHandler");
        Intrinsics.checkNotNullParameter(clickHandler, "clickHandler");
        y10 y10Var = new y10(context);
        DivConfiguration build = new DivConfiguration.Builder(y10Var).divCustomContainerViewAdapter(new m10(new o10(), new s10(), new r10(), new n10(), new t10(), new p10())).typefaceProvider(new b30(context)).extension(divExtensionHandler).extension(new l20(clickHandler)).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }
}
