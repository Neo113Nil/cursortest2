package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.monetization.ads.mediation.base.initialize.MediatedAdapterInitializer;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class mx0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final jy0 f29298a;

    public mx0(@NotNull jy0 paramsParser) {
        Intrinsics.checkNotNullParameter(paramsParser, "paramsParser");
        this.f29298a = paramsParser;
    }

    @Nullable
    public final MediatedAdapterInitializer a(@NotNull Context context, @NotNull xy0 network, @NotNull vu1 sdkEnvironmentModule) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(network, "network");
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        gs a4 = this.f29298a.a(network);
        C2360y7 c2360y7 = null;
        if (a4 == null) {
            return null;
        }
        Object a5 = new kx0(new qx0(new C2286v2(a4, sdkEnvironmentModule), c2360y7)).a(context, network, (Class<Object>) com.monetization.ads.mediation.base.a.class);
        if (a5 instanceof MediatedAdapterInitializer) {
            return (MediatedAdapterInitializer) a5;
        }
        return null;
    }
}
