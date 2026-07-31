package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ta {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final r8 f45038a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final r9 f45039b;

    public ta(@NotNull r8 dataSource, @NotNull r9 mapper) {
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f45038a = dataSource;
        this.f45039b = mapper;
    }
}
