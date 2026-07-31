package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class xm {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final f4 f45238a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final d5 f45239b;

    public xm(@NotNull f4 couponSelectionRepository, @NotNull d5 discountRepository) {
        Intrinsics.checkNotNullParameter(couponSelectionRepository, "couponSelectionRepository");
        Intrinsics.checkNotNullParameter(discountRepository, "discountRepository");
        this.f45238a = couponSelectionRepository;
        this.f45239b = discountRepository;
    }
}
