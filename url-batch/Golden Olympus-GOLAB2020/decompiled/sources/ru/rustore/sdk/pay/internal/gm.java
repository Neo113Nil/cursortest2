package ru.rustore.sdk.pay.internal;

import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import ru.rustore.sdk.pay.internal.ki;
import ru.rustore.sdk.pay.model.PurchaseId;

/* loaded from: classes3.dex */
public final class gm extends kotlin.jvm.internal.s implements Function0<ki.b> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PurchaseId f44188a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gm(PurchaseId purchaseId) {
        super(0);
        this.f44188a = purchaseId;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new ki.b("api/v1/purchases/" + this.f44188a.getValue() + "/cancellation", MapsKt.emptyMap(), null);
    }
}
