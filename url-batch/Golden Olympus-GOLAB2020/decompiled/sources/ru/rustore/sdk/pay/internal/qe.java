package ru.rustore.sdk.pay.internal;

import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import ru.rustore.sdk.pay.internal.ki;
import ru.rustore.sdk.pay.model.PurchaseId;

/* loaded from: classes3.dex */
public final class qe extends kotlin.jvm.internal.s implements Function0<ki.a> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PurchaseId f44827a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qe(PurchaseId purchaseId) {
        super(0);
        this.f44827a = purchaseId;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new ki.a("api/v1/purchases/" + this.f44827a.getValue(), MapsKt.emptyMap());
    }
}
