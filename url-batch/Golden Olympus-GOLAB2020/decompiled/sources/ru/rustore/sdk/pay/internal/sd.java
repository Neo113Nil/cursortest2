package ru.rustore.sdk.pay.internal;

import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.pay.internal.kd;
import ru.rustore.sdk.pay.internal.ld;
import ru.rustore.sdk.pay.internal.s9;
import ru.rustore.sdk.pay.internal.ze;
import ru.rustore.sdk.pay.model.InvoiceId;
import ru.rustore.sdk.pay.model.ProductPurchaseStatus;
import ru.rustore.sdk.pay.model.PurchaseId;

/* loaded from: classes3.dex */
public final /* synthetic */ class sd extends kotlin.jvm.internal.p implements Function1<ld.a, Unit> {
    public sd(ld ldVar) {
        super(1, ldVar, ld.class, "proceedSuccessProductPurchase", "proceedSuccessProductPurchase(Lru/rustore/sdk/pay/internal/presentation/viewmodel/purchase/creation/PurchaseCreationViewModel$ContentStateProductData;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        kd dVar;
        ld.a p02 = (ld.a) obj;
        Intrinsics.checkNotNullParameter(p02, "p0");
        ld ldVar = (ld) this.receiver;
        ldVar.getClass();
        u8 u8Var = p02.f44520a;
        qb qbVar = p02.f44521b;
        boolean z4 = p02.f44522c;
        s9 s9Var = u8Var.f45087b;
        if (s9Var == null) {
            s9Var = (s9) CollectionsKt.firstOrNull((List) u8Var.f45086a);
        }
        s9 s9Var2 = s9Var;
        boolean z5 = s9Var2 instanceof s9.a;
        boolean z6 = z5 && !z4;
        boolean z7 = !z5 && z4;
        ze zeVar = qbVar.f44822g;
        if (zeVar instanceof ze.a) {
            um umVar = (um) ldVar.f44514a.f45476Z2.getValue();
            List<s9> list = u8Var.f45086a;
            umVar.getClass();
            List a4 = um.a(list, s9Var2);
            i4 i4Var = (i4) ldVar.f44514a.f45534l1.getValue();
            z4 z4Var = u8Var.f45088c;
            i4Var.getClass();
            h4 a5 = i4.a(z4Var);
            cb a6 = ((db) ldVar.f44514a.f45539m1.getValue()).a(u8Var, qbVar.f44822g.getAmountLabel());
            dVar = new kd.b(a4, a5, a6, ((ze.a) qbVar.f44822g).f45341d == ProductPurchaseStatus.PROCESSING, qbVar, s9Var2, ((i6) ldVar.f44514a.f45416K2.getValue()).a().f45190a, z7, !z4, z6, ((jn) ldVar.f44514a.f45559q1.getValue()).a());
            qbVar = qbVar;
        } else {
            boolean z8 = z6;
            if (!(zeVar instanceof ze.b)) {
                throw new W1.m();
            }
            um umVar2 = (um) ldVar.f44514a.f45476Z2.getValue();
            List<s9> list2 = u8Var.f45086a;
            umVar2.getClass();
            dVar = new kd.d(um.a(list2, s9Var2), qbVar, s9Var2, ((i6) ldVar.f44514a.f45416K2.getValue()).a().f45190a, z7, !z4, z8, ((nl) ldVar.f44514a.f45544n1.getValue()).a(((ze.b) qbVar.f44822g).f45352h), false, ((jn) ldVar.f44514a.f45559q1.getValue()).a());
        }
        ldVar.f44516c.emit(dVar);
        xc xcVar = (xc) ldVar.f44514a.f45375A2.getValue();
        k analyticsProductType = j.a(qbVar.f44821f);
        InvoiceId invoiceId = qbVar.f44819d;
        PurchaseId purchaseId = qbVar.f44818c;
        xcVar.getClass();
        Intrinsics.checkNotNullParameter(analyticsProductType, "analyticsProductType");
        Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        Map createMapBuilder = MapsKt.createMapBuilder();
        createMapBuilder.putAll(xcVar.f45222a.a());
        wc.a(createMapBuilder, "rustore_payment", analyticsProductType.f44406a, invoiceId, "invoiceId");
        createMapBuilder.put("purchaseId", purchaseId.getValue());
        xcVar.f45223b.a("PaySheetLoaded", MapsKt.build(createMapBuilder));
        ldVar.c();
        return Unit.f41027a;
    }
}
