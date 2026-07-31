package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class co1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final a10 f24278a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Context f24279b;

    public /* synthetic */ co1(Context context) {
        this(context, new a10());
    }

    @NotNull
    public final nv0 a() {
        return z00.f35413d == this.f24278a.a(this.f24279b) ? new nv0(1920, 1080, 6800) : new nv0(854, 480, 1000);
    }

    public co1(@NotNull Context context, @NotNull a10 deviceTypeProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(deviceTypeProvider, "deviceTypeProvider");
        this.f24278a = deviceTypeProvider;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.f24279b = applicationContext;
    }
}
