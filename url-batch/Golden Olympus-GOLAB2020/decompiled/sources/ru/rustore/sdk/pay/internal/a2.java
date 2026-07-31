package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class a2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final s1 f43793a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final l1 f43794b;

    public a2(@NotNull s1 dataSource, @NotNull l1 mapper) {
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f43793a = dataSource;
        this.f43794b = mapper;
    }
}
