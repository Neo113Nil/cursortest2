package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class oc {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final e8 f44730a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final kc f44731b;

    public oc(@NotNull e8 requestFactory, @NotNull kc publicKeyHostProvider) {
        Intrinsics.checkNotNullParameter(requestFactory, "requestFactory");
        Intrinsics.checkNotNullParameter(publicKeyHostProvider, "publicKeyHostProvider");
        this.f44730a = requestFactory;
        this.f44731b = publicKeyHostProvider;
    }
}
