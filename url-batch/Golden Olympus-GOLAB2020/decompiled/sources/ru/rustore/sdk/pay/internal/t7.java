package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class t7 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final wb f45036a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final sb f45037b;

    public t7(@NotNull wb httpClient, @NotNull sb deserializer) {
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        this.f45036a = httpClient;
        this.f45037b = deserializer;
    }
}
