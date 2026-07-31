package ru.rustore.sdk.pay.internal;

import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.pay.internal.kd;
import ru.rustore.sdk.pay.internal.s9;
import ru.rustore.sdk.pay.model.ApplicationPurchaseStatus;
import ru.rustore.sdk.pay.model.InvoiceId;
import ru.rustore.sdk.pay.model.PurchaseId;

/* loaded from: classes3.dex */
public final /* synthetic */ class od extends kotlin.jvm.internal.p implements Function1<Pair<? extends u8, ? extends f0>, Unit> {
    public od(ld ldVar) {
        super(1, ldVar, ld.class, "proceedSuccessApplicationPurchase", "proceedSuccessApplicationPurchase(Lkotlin/Pair;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Pair p02 = (Pair) obj;
        Intrinsics.checkNotNullParameter(p02, "p0");
        ld ldVar = (ld) this.receiver;
        ldVar.getClass();
        u8 u8Var = (u8) p02.component1();
        f0 f0Var = (f0) p02.component2();
        s9 s9Var = u8Var.f45087b;
        if (s9Var == null) {
            s9Var = (s9) CollectionsKt.firstOrNull((List) u8Var.f45086a);
        }
        s9 s9Var2 = s9Var;
        um umVar = (um) ldVar.f44514a.f45476Z2.getValue();
        List<s9> list = u8Var.f45086a;
        umVar.getClass();
        List a4 = um.a(list, s9Var2);
        i4 i4Var = (i4) ldVar.f44514a.f45534l1.getValue();
        z4 z4Var = u8Var.f45088c;
        i4Var.getClass();
        ldVar.f44516c.emit(new kd.a(a4, i4.a(z4Var), ((db) ldVar.f44514a.f45539m1.getValue()).a(u8Var, f0Var.f44051e.f43984c), f0Var.f44049c == ApplicationPurchaseStatus.PROCESSING, f0Var, s9Var2, ((i6) ldVar.f44514a.f45416K2.getValue()).a().f45190a, !Intrinsics.areEqual(s9Var2, s9.a.f44973a)));
        xc xcVar = (xc) ldVar.f44514a.f45375A2.getValue();
        k analyticsProductType = k.APPLICATION;
        InvoiceId invoiceId = f0Var.f44048b;
        PurchaseId purchaseId = f0Var.f44047a;
        xcVar.getClass();
        Intrinsics.checkNotNullParameter(analyticsProductType, "analyticsProductType");
        Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        Map createMapBuilder = MapsKt.createMapBuilder();
        createMapBuilder.putAll(xcVar.f45222a.a());
        createMapBuilder.put("rustore_payment", "1");
        createMapBuilder.put("invoiceId", invoiceId.getValue());
        createMapBuilder.put("purchaseId", purchaseId.getValue());
        xcVar.f45223b.a("PaySheetLoaded", MapsKt.build(createMapBuilder));
        ldVar.c();
        return Unit.f41027a;
    }
}
