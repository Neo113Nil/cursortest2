package ru.rustore.sdk.pay.internal;

import java.util.Map;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.pay.internal.nh;
import ru.rustore.sdk.pay.model.AppUserEmail;
import ru.rustore.sdk.pay.model.InvoiceId;
import ru.rustore.sdk.pay.model.ProductType;
import ru.rustore.sdk.pay.model.PurchaseId;

/* loaded from: classes3.dex */
public final class oh extends kotlin.jvm.internal.s implements Function1<Throwable, Unit> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qh f44758a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppUserEmail f44759b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oh(qh qhVar, AppUserEmail appUserEmail) {
        super(1);
        this.f44758a = qhVar;
        this.f44759b = appUserEmail;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String value;
        ProductType productType;
        Throwable throwable = (Throwable) obj;
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        qh qhVar = this.f44758a;
        qb qbVar = qhVar.f44842b.f45261a.f43860b.f44876a;
        eh ehVar = qhVar.f44845e;
        k a4 = (qbVar == null || (productType = qbVar.f44821f) == null) ? null : j.a(productType);
        InvoiceId invoiceId = qbVar != null ? qbVar.f44819d : null;
        PurchaseId purchaseId = qhVar.f44841a;
        String errorType = j.a(throwable);
        String message = throwable.getMessage();
        ehVar.getClass();
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        Intrinsics.checkNotNullParameter(errorType, "errorType");
        Map createMapBuilder = MapsKt.createMapBuilder();
        createMapBuilder.putAll(ehVar.f44040a.a());
        createMapBuilder.put("error_type", errorType);
        if (a4 != null) {
        }
        if (invoiceId != null && (value = invoiceId.getValue()) != null) {
        }
        createMapBuilder.put("purchaseId", purchaseId.getValue());
        if (message == null) {
            message = "";
        }
        createMapBuilder.put("error_message", message);
        ehVar.f44041b.a("PaySheetGetReceiptSendError", MapsKt.build(createMapBuilder));
        this.f44758a.f44846f.setValue(new nh.b(this.f44759b));
        return Unit.f41027a;
    }
}
