package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ec {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final hb f44033a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final pb f44034b;

    public ec(@NotNull hb dataSource, @NotNull pb mapper) {
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f44033a = dataSource;
        this.f44034b = mapper;
    }
}
