package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class zh2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<C2308w1> f35605a;

    public zh2(@NotNull String version, @NotNull ArrayList adBreaks, @NotNull ArrayList extensions) {
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(adBreaks, "adBreaks");
        Intrinsics.checkNotNullParameter(extensions, "extensions");
        this.f35605a = adBreaks;
    }

    @NotNull
    public final List<C2308w1> a() {
        return this.f35605a;
    }
}
