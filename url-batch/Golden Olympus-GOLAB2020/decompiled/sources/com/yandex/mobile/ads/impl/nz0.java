package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.yy0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class nz0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final mz0 f29812a;

    public nz0(@NotNull mz0 networksDataProvider) {
        Intrinsics.checkNotNullParameter(networksDataProvider, "networksDataProvider");
        this.f29812a = networksDataProvider;
    }

    @NotNull
    public final ArrayList a() {
        int i4 = yy0.f35386e;
        return this.f29812a.a(yy0.a.a());
    }
}
