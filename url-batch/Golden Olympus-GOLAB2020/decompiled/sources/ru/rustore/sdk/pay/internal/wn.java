package ru.rustore.sdk.pay.internal;

import java.util.Map;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class wn extends kotlin.jvm.internal.s implements Function1<Unit, Unit> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xn f45195a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wn(xn xnVar) {
        super(1);
        this.f45195a = xnVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit it = (Unit) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        pn pnVar = this.f45195a.f45246g;
        m mVar = pnVar.f44803b;
        Map createMapBuilder = MapsKt.createMapBuilder();
        createMapBuilder.putAll(pnVar.f44802a.a());
        createMapBuilder.put("rustore_payment", "3");
        mVar.a("payAuthSuccess", MapsKt.build(createMapBuilder));
        li liVar = this.f45195a.f45243d.f45050a;
        liVar.getClass();
        fd fdVar = new fd();
        liVar.a(fdVar, new oi(fdVar));
        return Unit.f41027a;
    }
}
