package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class sf {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final we f45003a;

    public sf(@NotNull we httpClient, @NotNull tf deserializer) {
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        this.f45003a = httpClient;
    }
}
