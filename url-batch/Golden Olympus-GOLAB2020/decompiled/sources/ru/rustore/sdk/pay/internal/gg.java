package ru.rustore.sdk.pay.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.pay.internal.j7;
import ru.rustore.sdk.pay.model.PurchaseId;
import ru.rustore.sdk.reactive.core.Dispatchers;
import ru.rustore.sdk.reactive.single.Single;
import ru.rustore.sdk.reactive.single.SingleFlatMapKt;
import ru.rustore.sdk.reactive.single.SingleMapKt;
import ru.rustore.sdk.reactive.single.SingleObserveOnKt;
import ru.rustore.sdk.reactive.single.SingleSubscribeKt;
import ru.rustore.sdk.reactive.single.SingleSubscribeOnKt;

/* loaded from: classes3.dex */
public final class gg extends kotlin.jvm.internal.s implements Function1<Unit, Unit> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hg f44178a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PurchaseId f44179b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gg(hg hgVar, PurchaseId purchaseId) {
        super(1);
        this.f44178a = hgVar;
        this.f44179b = purchaseId;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit it = (Unit) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        hg hgVar = this.f44178a;
        PurchaseId purchaseId = this.f44179b;
        hgVar.f44268k.setValue(j7.b.f44364a);
        bi biVar = hgVar.f44263f;
        biVar.getClass();
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        gf gfVar = biVar.f43873a;
        gfVar.getClass();
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        ke keVar = gfVar.f44176a;
        keVar.getClass();
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        we weVar = keVar.f44476a;
        weVar.getClass();
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        Single from = Single.Companion.from(new se(purchaseId));
        Dispatchers dispatchers = Dispatchers.INSTANCE;
        hgVar.f44270m.add(SingleSubscribeKt.subscribe(SingleObserveOnKt.observeOn(SingleMapKt.map(SingleFlatMapKt.flatMap(SingleSubscribeOnKt.subscribeOn(from, dispatchers.getIo()), new ve(weVar.f45165a)), je.f44375a), dispatchers.getMain()), new dg(hgVar, purchaseId), new eg(hgVar)));
        return Unit.f41027a;
    }
}
