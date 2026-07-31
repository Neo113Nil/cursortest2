package ru.rustore.sdk.pay.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.pay.internal.cf;
import ru.rustore.sdk.pay.model.RuStorePaymentException;

/* loaded from: classes3.dex */
public final class qg extends kotlin.jvm.internal.s implements Function1<cf, Unit> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rg f44839a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hf f44840b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qg(rg rgVar, hf hfVar) {
        super(1);
        this.f44839a = rgVar;
        this.f44840b = hfVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        cf purchasePaymentResult = (cf) obj;
        Intrinsics.checkNotNullParameter(purchasePaymentResult, "purchasePaymentResult");
        if (Intrinsics.areEqual(purchasePaymentResult, cf.b.f43916a)) {
            mg mgVar = (mg) this.f44839a.f44920a.f45471Y1.getValue();
            hf result = this.f44840b;
            mgVar.getClass();
            Intrinsics.checkNotNullParameter(result, "result");
            mgVar.f44645a.a(result, false);
        } else if (Intrinsics.areEqual(purchasePaymentResult, cf.a.f43915a)) {
            this.f44839a.a((RuStorePaymentException) new RuStorePaymentException.RuStorePaymentCommonException("Error occurred during payment by saved card", null, 2, null));
        }
        return Unit.f41027a;
    }
}
