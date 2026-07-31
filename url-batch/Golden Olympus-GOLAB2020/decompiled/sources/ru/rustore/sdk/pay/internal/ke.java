package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ke {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final we f44476a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final me f44477b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final af f44478c;

    public ke(@NotNull we httpClient, @NotNull me purchaseDtoDeserializer, @NotNull af purchaseListDtoDeserializer) {
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        Intrinsics.checkNotNullParameter(purchaseDtoDeserializer, "purchaseDtoDeserializer");
        Intrinsics.checkNotNullParameter(purchaseListDtoDeserializer, "purchaseListDtoDeserializer");
        this.f44476a = httpClient;
        this.f44477b = purchaseDtoDeserializer;
        this.f44478c = purchaseListDtoDeserializer;
    }
}
