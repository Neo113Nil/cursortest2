package com.yandex.mobile.ads.impl;

import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class wr {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Map<String, vr> f34164a = MapsKt.mapOf(TuplesKt.to("html", vr.f33727b), TuplesKt.to("native", vr.f33728c));

    @Nullable
    public static vr a(@NotNull Map headers) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        return f34164a.get(cf0.a(headers, bh0.f23800u));
    }
}
