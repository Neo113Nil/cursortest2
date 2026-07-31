package ru.rustore.sdk.pay.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.pay.callback.PurchaseEventListener;
import ru.rustore.sdk.pay.internal.ne;

/* loaded from: classes3.dex */
public final class uc extends kotlin.jvm.internal.s implements Function1<ne, Unit> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PurchaseEventListener f45094a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uc(PurchaseEventListener purchaseEventListener) {
        super(1);
        this.f45094a = purchaseEventListener;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ne event = (ne) obj;
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof ne.c) {
            ne.c cVar = (ne.c) event;
            this.f45094a.onPurchaseCreated(cVar.f44693a, cVar.f44694b);
        } else if (event instanceof ne.e) {
            ne.e eVar = (ne.e) event;
            this.f45094a.onPaymentStarted(eVar.f44697a, eVar.f44698b);
        } else if (event instanceof ne.b) {
            ne.b bVar = (ne.b) event;
            this.f45094a.onPaymentCompleted(bVar.f44691a, bVar.f44692b);
        } else if (event instanceof ne.d) {
            ne.d dVar = (ne.d) event;
            this.f45094a.onPaymentFailed(dVar.f44695a, dVar.f44696b);
        } else if (event instanceof ne.a) {
            this.f45094a.onPurchaseCancelled(((ne.a) event).f44690a, null);
        }
        return Unit.f41027a;
    }
}
