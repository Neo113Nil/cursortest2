package ru.rustore.sdk.pay.internal;

import java.util.Map;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.pay.internal.h3;
import ru.rustore.sdk.pay.internal.kd;
import ru.rustore.sdk.pay.model.InvoiceId;

/* loaded from: classes3.dex */
public final class fe extends kotlin.jvm.internal.s implements Function1<Throwable, Unit> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ld f44124a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kd.a f44125b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InvoiceId f44126c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fe(ld ldVar, kd.a aVar, InvoiceId invoiceId) {
        super(1);
        this.f44124a = ldVar;
        this.f44125b = aVar;
        this.f44126c = invoiceId;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Throwable error = (Throwable) obj;
        Intrinsics.checkNotNullParameter(error, "error");
        this.f44124a.f44516c.setValue(this.f44125b);
        this.f44124a.f44518e.emit(h3.b.f44211a);
        xc xcVar = (xc) this.f44124a.f44514a.f45375A2.getValue();
        k analyticsProductType = k.APPLICATION;
        InvoiceId invoiceId = this.f44126c;
        String message = error.getMessage();
        xcVar.getClass();
        Intrinsics.checkNotNullParameter(analyticsProductType, "analyticsProductType");
        Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
        Map createMapBuilder = MapsKt.createMapBuilder();
        createMapBuilder.putAll(xcVar.f45222a.a());
        createMapBuilder.put("rustore_payment", "1");
        createMapBuilder.put("invoiceId", invoiceId.getValue());
        if (message == null) {
            message = "";
        }
        createMapBuilder.put("error_message", message);
        xcVar.f45223b.a("paySheetCouponSheet.error", MapsKt.build(createMapBuilder));
        return Unit.f41027a;
    }
}
