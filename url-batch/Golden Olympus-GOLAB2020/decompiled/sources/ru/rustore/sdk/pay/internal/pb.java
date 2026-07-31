package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class pb {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final fc f44780a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final el f44781b;

    public pb(@NotNull fc productTypeMapper, @NotNull el subscriptionInfoMapper) {
        Intrinsics.checkNotNullParameter(productTypeMapper, "productTypeMapper");
        Intrinsics.checkNotNullParameter(subscriptionInfoMapper, "subscriptionInfoMapper");
        this.f44780a = productTypeMapper;
        this.f44781b = subscriptionInfoMapper;
    }
}
