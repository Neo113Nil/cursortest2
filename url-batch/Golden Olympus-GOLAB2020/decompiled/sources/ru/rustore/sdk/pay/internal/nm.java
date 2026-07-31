package ru.rustore.sdk.pay.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class nm extends kotlin.jvm.internal.s implements Function1<qb, Unit> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pm f44713a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nm(pm pmVar) {
        super(1);
        this.f44713a = pmVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        qb productPurchase = (qb) obj;
        Intrinsics.checkNotNullParameter(productPurchase, "productPurchase");
        r2 r2Var = this.f44713a.f44799b;
        r2Var.getClass();
        Intrinsics.checkNotNullParameter(productPurchase, "productPurchase");
        r2Var.f44876a = productPurchase;
        return Unit.f41027a;
    }
}
