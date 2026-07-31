package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class vt {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final yr1 f33740a;

    public vt(@NotNull Context context, @NotNull yr1 adLoadController) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adLoadController, "adLoadController");
        this.f33740a = adLoadController;
        C2054l0.a(context);
    }

    public final void a() {
        this.f33740a.a();
    }

    public final void a(@NotNull C1918f7 adRequestData) {
        Intrinsics.checkNotNullParameter(adRequestData, "adRequestData");
        this.f33740a.a(adRequestData);
    }

    public final void a(@Nullable tm2 tm2Var) {
        this.f33740a.a(tm2Var);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public vt(@NotNull Context context, @NotNull um2 sdkEnvironmentModule) {
        this(context, zr1.a(context, sdkEnvironmentModule));
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
    }
}
