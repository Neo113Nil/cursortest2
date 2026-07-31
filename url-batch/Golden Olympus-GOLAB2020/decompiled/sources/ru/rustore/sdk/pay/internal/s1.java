package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class s1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final y1 f44950a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final t1 f44951b;

    public s1(@NotNull y1 httpClient, @NotNull t1 deserializer) {
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        this.f44950a = httpClient;
        this.f44951b = deserializer;
    }
}
