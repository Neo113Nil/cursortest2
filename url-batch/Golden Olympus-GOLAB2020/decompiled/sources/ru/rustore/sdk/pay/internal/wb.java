package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class wb {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final r0 f45162a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final y6 f45163b;

    public wb(@NotNull r0 requestFactory, @NotNull y6 installationIdProvider) {
        Intrinsics.checkNotNullParameter(requestFactory, "requestFactory");
        Intrinsics.checkNotNullParameter(installationIdProvider, "installationIdProvider");
        this.f45162a = requestFactory;
        this.f45163b = installationIdProvider;
    }
}
