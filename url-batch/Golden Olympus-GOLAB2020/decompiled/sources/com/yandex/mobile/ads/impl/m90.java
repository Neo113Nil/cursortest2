package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.vy1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class m90 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f28950a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final vu1 f28951b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C2286v2 f28952c;

    public m90(@NotNull Context context, @NotNull um2 sdkEnvironmentModule, @NotNull C2286v2 adConfiguration) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        this.f28950a = context;
        this.f28951b = sdkEnvironmentModule;
        this.f28952c = adConfiguration;
    }

    @NotNull
    public final l90 a(@NotNull p90 listener, @NotNull C1918f7 adRequestData, @Nullable aa0 aa0Var) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(adRequestData, "adRequestData");
        Context context = this.f28950a;
        vu1 vu1Var = this.f28951b;
        C2286v2 c2286v2 = this.f28952c;
        l90 l90Var = new l90(context, vu1Var, c2286v2, listener, adRequestData, aa0Var, new rt1(c2286v2), new i71(c2286v2), new m91(context, vu1Var, c2286v2, new C2105n4()), new yf0());
        l90Var.a(adRequestData.a());
        l90Var.a((vy1) new gb0(-1, 0, vy1.a.f33823d));
        return l90Var;
    }
}
