package ru.rustore.sdk.pay.internal;

import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.pay.internal.ne;
import ru.rustore.sdk.reactive.single.Single;
import ru.rustore.sdk.reactive.single.SingleMapKt;

/* loaded from: classes3.dex */
public final class nd extends kotlin.jvm.internal.s implements Function1<f0, Single<Pair<? extends u8, ? extends f0>>> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ld f44689a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nd(ld ldVar) {
        super(1);
        this.f44689a = ldVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        f0 applicationPurchase = (f0) obj;
        Intrinsics.checkNotNullParameter(applicationPurchase, "applicationPurchase");
        ld ldVar = this.f44689a;
        ne.c event = new ne.c(applicationPurchase.f44047a, applicationPurchase.f44048b);
        pe peVar = (pe) ldVar.f44514a.f45589w1.getValue();
        peVar.getClass();
        Intrinsics.checkNotNullParameter(event, "event");
        oe oeVar = peVar.f44782a;
        oeVar.getClass();
        Intrinsics.checkNotNullParameter(event, "event");
        oeVar.f44732a.emit(event);
        return SingleMapKt.map(((x5) this.f44689a.f44514a.f45550o2.getValue()).a(applicationPurchase.f44047a), new md(applicationPurchase));
    }
}
