package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class di {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final r f43971a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final n f43972b;

    public di(@NotNull r httpClient, @NotNull n deserializer) {
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        this.f43971a = httpClient;
        this.f43972b = deserializer;
    }
}
