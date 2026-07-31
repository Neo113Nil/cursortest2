package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class x8 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final e9 f45210a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final z8 f45211b;

    public x8(@NotNull e9 httpClient, @NotNull z8 deserializer) {
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        this.f45210a = httpClient;
        this.f45211b = deserializer;
    }
}
