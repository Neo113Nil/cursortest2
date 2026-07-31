package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class h5 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final mf f44217a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final pe f44218b;

    public h5(@NotNull mf repository, @NotNull pe purchaseEventRepository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(purchaseEventRepository, "purchaseEventRepository");
        this.f44217a = repository;
        this.f44218b = purchaseEventRepository;
    }
}
