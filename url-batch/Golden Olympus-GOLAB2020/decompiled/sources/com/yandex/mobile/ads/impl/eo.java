package com.yandex.mobile.ads.impl;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class eo {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap f25368a = new LinkedHashMap();

    public final void a(int i4, @NotNull Cdo clickConnector) {
        Intrinsics.checkNotNullParameter(clickConnector, "clickConnector");
        this.f25368a.put(Integer.valueOf(i4), clickConnector);
    }

    @NotNull
    public final LinkedHashMap a() {
        return this.f25368a;
    }
}
