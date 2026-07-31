package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class hb {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final nb f44231a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final jb f44232b;

    public hb(@NotNull nb httpClient, @NotNull jb deserializer) {
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        this.f44231a = httpClient;
        this.f44232b = deserializer;
    }
}
