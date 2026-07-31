package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class z2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final pm f45309a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final y7 f45310b;

    public z2(@NotNull pm repository, @NotNull y7 logger) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f45309a = repository;
        this.f45310b = logger;
    }
}
