package ru.rustore.sdk.pay.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.pay.internal.c2;
import ru.rustore.sdk.pay.internal.d;
import ru.rustore.sdk.pay.internal.ne;
import ru.rustore.sdk.pay.model.InvoiceId;
import ru.rustore.sdk.pay.model.PurchaseId;
import ru.rustore.sdk.pay.model.Url;
import ru.rustore.sdk.reactive.core.Dispatchers;
import ru.rustore.sdk.reactive.single.SingleFlatMapKt;
import ru.rustore.sdk.reactive.single.SingleMapKt;
import ru.rustore.sdk.reactive.single.SingleObserveOnKt;
import ru.rustore.sdk.reactive.single.SingleSubscribeKt;

/* loaded from: classes3.dex */
public final /* synthetic */ class v1 extends kotlin.jvm.internal.p implements Function1<h1, Unit> {
    public v1(h2 h2Var) {
        super(1, h2Var, h2.class, "selectBank", "selectBank(Lru/rustore/sdk/pay/internal/bank/domain/BankApp;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        h1 bankApp = (h1) obj;
        Intrinsics.checkNotNullParameter(bankApp, "p0");
        h2 h2Var = (h2) this.receiver;
        h2Var.getClass();
        Intrinsics.checkNotNullParameter(bankApp, "bankApp");
        h2Var.f44207m.setValue(c2.c.f43897a);
        InvoiceId a4 = h2Var.a();
        ch chVar = h2Var.f44200f;
        PurchaseId purchaseId = h2Var.f44195a;
        chVar.getClass();
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        e eVar = chVar.f43928c;
        d.b state = d.b.f43944a;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(state, "state");
        eVar.f43981a = state;
        if (a4 != null) {
            ne.e event = new ne.e(purchaseId, a4);
            pe peVar = chVar.f43929d;
            peVar.getClass();
            Intrinsics.checkNotNullParameter(event, "event");
            oe oeVar = peVar.f44782a;
            oeVar.getClass();
            Intrinsics.checkNotNullParameter(event, "event");
            oeVar.f44732a.emit(event);
        }
        ta taVar = chVar.f43926a;
        Url backUrl = chVar.f43927b.a();
        taVar.getClass();
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        Intrinsics.checkNotNullParameter(backUrl, "backUrl");
        r8 r8Var = taVar.f45038a;
        r8Var.getClass();
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        Intrinsics.checkNotNullParameter(backUrl, "backUrl");
        q9 q9Var = r8Var.f44894a;
        q9Var.getClass();
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        Intrinsics.checkNotNullParameter(backUrl, "backUrl");
        h2Var.f44209o.add(SingleSubscribeKt.subscribe(SingleObserveOnKt.observeOn(SingleMapKt.map(SingleMapKt.map(SingleMapKt.map(SingleFlatMapKt.flatMap(q9.a(q9Var, backUrl, null, null, null, null, "SBP", purchaseId, 30), new p9(q9Var.f44814a)), new q8(r8Var)), new sa(taVar.f45039b)), new bh(purchaseId, chVar)), Dispatchers.INSTANCE.getMain()), new f2(h2Var), new g2(h2Var, bankApp)));
        return Unit.f41027a;
    }
}
