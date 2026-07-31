package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class m7 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final k0 f44637a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final h0 f44638b;

    public m7(@NotNull k0 httpClient, @NotNull h0 deserializer) {
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        this.f44637a = httpClient;
        this.f44638b = deserializer;
    }
}
