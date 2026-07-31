package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rustore.sdk.pay.model.ConsoleApplicationId;

/* loaded from: classes3.dex */
public final class nb {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    public final ConsoleApplicationId f44685a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final e8 f44686b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final eb f44687c;

    public nb(@Nullable ConsoleApplicationId consoleApplicationId, @NotNull e8 requestFactory, @NotNull eb productCatalogGatewayHostProvider) {
        Intrinsics.checkNotNullParameter(requestFactory, "requestFactory");
        Intrinsics.checkNotNullParameter(productCatalogGatewayHostProvider, "productCatalogGatewayHostProvider");
        this.f44685a = consoleApplicationId;
        this.f44686b = requestFactory;
        this.f44687c = productCatalogGatewayHostProvider;
    }
}
