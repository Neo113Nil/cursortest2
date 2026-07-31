package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class j9 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final x8 f44369a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final g9 f44370b;

    public j9(@NotNull x8 dataSource, @NotNull g9 mapper) {
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f44369a = dataSource;
        this.f44370b = mapper;
    }
}
