package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class p7 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final b4 f44777a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final w3 f44778b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final c3 f44779c;

    public p7(@NotNull b4 httpClient, @NotNull w3 selectionDeserializer, @NotNull c3 cancelSelectionDeserializer) {
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        Intrinsics.checkNotNullParameter(selectionDeserializer, "selectionDeserializer");
        Intrinsics.checkNotNullParameter(cancelSelectionDeserializer, "cancelSelectionDeserializer");
        this.f44777a = httpClient;
        this.f44778b = selectionDeserializer;
        this.f44779c = cancelSelectionDeserializer;
    }
}
