package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class r9 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final yf f44896a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final y7 f44897b;

    public r9(@NotNull yf purchaseTypeMapper, @NotNull y7 logger) {
        Intrinsics.checkNotNullParameter(purchaseTypeMapper, "purchaseTypeMapper");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f44896a = purchaseTypeMapper;
        this.f44897b = logger;
    }
}
