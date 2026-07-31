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
public final class ge extends kotlin.jvm.internal.s implements Function1<Throwable, Unit> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ld f44172a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kd.b f44173b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f44174c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InvoiceId f44175d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ge(ld ldVar, kd.b bVar, k kVar, InvoiceId invoiceId) {
        super(1);
        this.f44172a = ldVar;
        this.f44173b = bVar;
        this.f44174c = kVar;
        this.f44175d = invoiceId;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Throwable error = (Throwable) obj;
        Intrinsics.checkNotNullParameter(error, "error");
        this.f44172a.f44516c.setValue(this.f44173b);
        this.f44172a.f44518e.emit(h3.b.f44211a);
        xc xcVar = (xc) this.f44172a.f44514a.f45375A2.getValue();
        k analyticsProductType = this.f44174c;
        InvoiceId invoiceId = this.f44175d;
        String message = error.getMessage();
        xcVar.getClass();
        Intrinsics.checkNotNullParameter(analyticsProductType, "analyticsProductType");
        Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
        Map createMapBuilder = MapsKt.createMapBuilder();
        createMapBuilder.putAll(xcVar.f45222a.a());
        wc.a(createMapBuilder, "rustore_payment", analyticsProductType.f44406a, invoiceId, "invoiceId");
        if (message == null) {
            message = "";
        }
        createMapBuilder.put("error_message", message);
        xcVar.f45223b.a("paySheetCouponSheet.error", MapsKt.build(createMapBuilder));
        return Unit.f41027a;
    }
}
