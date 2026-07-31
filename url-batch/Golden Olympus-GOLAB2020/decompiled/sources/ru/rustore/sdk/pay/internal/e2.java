package ru.rustore.sdk.pay.internal;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.pay.internal.c2;
import ru.rustore.sdk.pay.model.InvoiceId;
import ru.rustore.sdk.pay.model.PackageName;
import ru.rustore.sdk.pay.model.PurchaseId;

/* loaded from: classes3.dex */
public final class e2 extends kotlin.jvm.internal.s implements Function1<List<? extends h1>, Unit> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h2 f43992a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(h2 h2Var) {
        super(1);
        this.f43992a = h2Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String value;
        List bankApps = (List) obj;
        Intrinsics.checkNotNullParameter(bankApps, "bankApps");
        h2 h2Var = this.f43992a;
        ArrayList installedBankApps = new ArrayList();
        for (Object obj2 : bankApps) {
            u5 u5Var = h2Var.f44199e;
            PackageName packageName = ((h1) obj2).f44193c;
            u5Var.getClass();
            Intrinsics.checkNotNullParameter(packageName, "packageName");
            u uVar = u5Var.f45081a;
            uVar.getClass();
            Intrinsics.checkNotNullParameter(packageName, "packageName");
            if (uVar.f45051a.a(packageName).f44947a) {
                installedBankApps.add(obj2);
            }
        }
        h2 h2Var2 = this.f43992a;
        q1 q1Var = h2Var2.f44205k;
        k a4 = h2.a(h2Var2);
        InvoiceId a5 = this.f43992a.a();
        PurchaseId purchaseId = this.f43992a.f44195a;
        q1Var.getClass();
        Intrinsics.checkNotNullParameter(installedBankApps, "installedBankApps");
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        String joinToString$default = CollectionsKt.joinToString$default(installedBankApps, "/", null, null, 0, null, p1.f44766a, 30, null);
        Map createMapBuilder = MapsKt.createMapBuilder();
        createMapBuilder.putAll(q1Var.f44807a.a());
        createMapBuilder.put("installed_banks", joinToString$default);
        if (a4 != null) {
        }
        if (a5 != null && (value = a5.getValue()) != null) {
        }
        createMapBuilder.put("purchaseId", purchaseId.getValue());
        createMapBuilder.put("installedAppsCount", String.valueOf(installedBankApps.size()));
        q1Var.f44808b.a("PaySheetPaymentSBP", MapsKt.build(createMapBuilder));
        this.f43992a.f44207m.setValue(installedBankApps.isEmpty() ? c2.b.f43896a : new c2.a(installedBankApps));
        return Unit.f41027a;
    }
}
