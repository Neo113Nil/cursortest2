package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class wz {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f34343a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2286v2 f34344b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C2360y7<?> f34345c;

    public wz(@NotNull Context context, @NotNull C2360y7 adResponse, @NotNull C2286v2 adConfiguration) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        this.f34343a = context;
        this.f34344b = adConfiguration;
        this.f34345c = adResponse;
    }

    @NotNull
    public final y60 a() {
        return new g60(this.f34343a, this.f34345c, this.f34344b).a();
    }
}
