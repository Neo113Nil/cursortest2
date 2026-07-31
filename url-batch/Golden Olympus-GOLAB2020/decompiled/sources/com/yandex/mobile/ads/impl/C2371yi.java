package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.yi, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2371yi {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2286v2 f35145a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f35146b;

    public C2371yi(@NotNull Context context, @NotNull C2286v2 adConfiguration) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        this.f35145a = adConfiguration;
        this.f35146b = context.getApplicationContext();
    }

    @NotNull
    public final C2348xi a(@NotNull C2360y7<String> adResponse, @NotNull vy1 configurationSizeInfo) {
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(configurationSizeInfo, "configurationSizeInfo");
        Context appContext = this.f35146b;
        Intrinsics.checkNotNullExpressionValue(appContext, "appContext");
        return new C2348xi(appContext, adResponse, this.f35145a, configurationSizeInfo);
    }
}
