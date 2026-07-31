package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class cm {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final jm f43937a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final sb f43938b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final ye f43939c;

    public cm(@NotNull jm httpClient, @NotNull sb productPurchaseDtoDeserializer, @NotNull ye purchaseIdDtoDeserializer) {
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        Intrinsics.checkNotNullParameter(productPurchaseDtoDeserializer, "productPurchaseDtoDeserializer");
        Intrinsics.checkNotNullParameter(purchaseIdDtoDeserializer, "purchaseIdDtoDeserializer");
        this.f43937a = httpClient;
        this.f43938b = productPurchaseDtoDeserializer;
        this.f43939c = purchaseIdDtoDeserializer;
    }
}
