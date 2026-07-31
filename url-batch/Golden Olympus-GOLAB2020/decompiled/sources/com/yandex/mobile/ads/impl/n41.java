package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class n41 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2286v2 f29432a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2360y7<?> f29433b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Context f29434c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private m71 f29435d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ n41(Context context, C2286v2 c2286v2, C2360y7 c2360y7) {
        this(context, c2286v2, c2360y7, r0);
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
    }

    @NotNull
    public final po a(@NotNull String assetName, @NotNull String clickType) {
        Intrinsics.checkNotNullParameter(assetName, "assetName");
        Intrinsics.checkNotNullParameter(clickType, "clickType");
        return new po(this.f29434c, this.f29433b, this.f29432a, new o41(assetName, clickType, this.f29435d));
    }

    public n41(@NotNull Context context, @NotNull C2286v2 adConfiguration, @NotNull C2360y7<?> adResponse, @NotNull Context appContext) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        this.f29432a = adConfiguration;
        this.f29433b = adResponse;
        this.f29434c = appContext;
    }

    public final void a(@Nullable m71 m71Var) {
        this.f29435d = m71Var;
    }
}
