package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class vj {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final f4 f45139a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final d5 f45140b;

    public vj(@NotNull f4 couponSelectionRepository, @NotNull d5 discountRepository) {
        Intrinsics.checkNotNullParameter(couponSelectionRepository, "couponSelectionRepository");
        Intrinsics.checkNotNullParameter(discountRepository, "discountRepository");
        this.f45139a = couponSelectionRepository;
        this.f45140b = discountRepository;
    }
}
