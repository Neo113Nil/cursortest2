package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class jm {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final r0 f44398a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final y6 f44399b;

    public jm(@NotNull r0 requestFactory, @NotNull y6 installationIdProvider) {
        Intrinsics.checkNotNullParameter(requestFactory, "requestFactory");
        Intrinsics.checkNotNullParameter(installationIdProvider, "installationIdProvider");
        this.f44398a = requestFactory;
        this.f44399b = installationIdProvider;
    }
}
