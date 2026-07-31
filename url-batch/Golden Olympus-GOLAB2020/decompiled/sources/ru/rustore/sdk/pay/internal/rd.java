package ru.rustore.sdk.pay.internal;

import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.pay.internal.a;
import ru.rustore.sdk.pay.internal.g;
import ru.rustore.sdk.pay.internal.ld;
import ru.rustore.sdk.pay.internal.ne;
import ru.rustore.sdk.pay.model.InvoiceId;
import ru.rustore.sdk.pay.model.PurchaseId;
import ru.rustore.sdk.reactive.single.Single;
import ru.rustore.sdk.reactive.single.SingleMapKt;

/* loaded from: classes3.dex */
public final class rd extends kotlin.jvm.internal.s implements Function1<qb, Single<ld.a>> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ld f44914a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a.b f44915b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rd(ld ldVar, a.b bVar) {
        super(1);
        this.f44914a = ldVar;
        this.f44915b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        qb productPurchase = (qb) obj;
        Intrinsics.checkNotNullParameter(productPurchase, "productPurchase");
        ld ldVar = this.f44914a;
        g purchaseType = this.f44915b.f43789b;
        k analyticsProductType = j.a(productPurchase.f44821f);
        InvoiceId invoiceId = productPurchase.f44819d;
        PurchaseId purchaseId = productPurchase.f44818c;
        xc xcVar = (xc) ldVar.f44514a.f45375A2.getValue();
        xcVar.getClass();
        Intrinsics.checkNotNullParameter(analyticsProductType, "analyticsProductType");
        Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        Intrinsics.checkNotNullParameter(purchaseType, "purchaseType");
        Map createMapBuilder = MapsKt.createMapBuilder();
        createMapBuilder.putAll(xcVar.f45222a.a());
        if (purchaseType instanceof g.a.C0257a) {
            str = "3";
        } else if (purchaseType instanceof g.a.b) {
            str = "4";
        } else {
            if (!(purchaseType instanceof f)) {
                throw new W1.m();
            }
            str = "2";
        }
        createMapBuilder.put("purchase_type", str);
        wc.a(createMapBuilder, "rustore_payment", analyticsProductType.f44406a, invoiceId, "invoiceId");
        createMapBuilder.put("purchaseId", purchaseId.getValue());
        xcVar.f45223b.a("paySheet.purchaseProduct", MapsKt.build(createMapBuilder));
        ld ldVar2 = this.f44914a;
        ne.c event = new ne.c(productPurchase.f44818c, productPurchase.f44819d);
        pe peVar = (pe) ldVar2.f44514a.f45589w1.getValue();
        peVar.getClass();
        Intrinsics.checkNotNullParameter(event, "event");
        oe oeVar = peVar.f44782a;
        oeVar.getClass();
        Intrinsics.checkNotNullParameter(event, "event");
        oeVar.f44732a.emit(event);
        return SingleMapKt.map(((x5) this.f44914a.f44514a.f45550o2.getValue()).a(productPurchase.f44818c), new qd(this.f44914a, productPurchase));
    }
}
