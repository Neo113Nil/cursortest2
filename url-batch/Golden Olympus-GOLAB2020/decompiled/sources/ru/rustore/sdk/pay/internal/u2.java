package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class u2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final pm f45069a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final y7 f45070b;

    public u2(@NotNull pm repository, @NotNull y7 logger) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f45069a = repository;
        this.f45070b = logger;
    }
}
