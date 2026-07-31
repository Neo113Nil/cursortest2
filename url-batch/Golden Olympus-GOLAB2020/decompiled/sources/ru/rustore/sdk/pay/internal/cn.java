package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.pay.model.PurchaseType;

/* loaded from: classes3.dex */
public final class cn {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final bc f43940a;

    public cn(@NotNull bc repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f43940a = repository;
    }

    public final void a(@NotNull PurchaseType purchaseType) {
        Intrinsics.checkNotNullParameter(purchaseType, "purchaseType");
        qb qbVar = this.f43940a.f43860b.f44876a;
        if (qbVar != null) {
            qb productPurchase = qb.a(qbVar, purchaseType, null, 239);
            bc bcVar = this.f43940a;
            bcVar.getClass();
            Intrinsics.checkNotNullParameter(productPurchase, "productPurchase");
            r2 r2Var = bcVar.f43860b;
            r2Var.getClass();
            Intrinsics.checkNotNullParameter(productPurchase, "productPurchase");
            r2Var.f44876a = productPurchase;
        }
    }
}
