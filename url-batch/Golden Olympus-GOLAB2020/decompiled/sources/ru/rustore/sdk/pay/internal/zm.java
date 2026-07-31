package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.pay.model.PurchaseType;

/* loaded from: classes3.dex */
public final class zm {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final o0 f45846a;

    public zm(@NotNull o0 repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f45846a = repository;
    }

    public final void a(@NotNull PurchaseType purchaseType) {
        Intrinsics.checkNotNullParameter(purchaseType, "purchaseType");
        f0 f0Var = this.f45846a.f44715b.f44719a;
        if (f0Var != null) {
            f0 applicationPurchase = f0.a(f0Var, purchaseType, null, 23);
            o0 o0Var = this.f45846a;
            o0Var.getClass();
            Intrinsics.checkNotNullParameter(applicationPurchase, "applicationPurchase");
            o2 o2Var = o0Var.f44715b;
            o2Var.getClass();
            Intrinsics.checkNotNullParameter(applicationPurchase, "applicationPurchase");
            o2Var.f44719a = applicationPurchase;
        }
    }
}
