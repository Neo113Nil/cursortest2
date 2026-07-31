package ru.rustore.sdk.pay.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.pay.model.RuStorePaymentException;

/* loaded from: classes3.dex */
public final class pg extends kotlin.jvm.internal.s implements Function1<Throwable, Unit> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rg f44784a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pg(rg rgVar) {
        super(1);
        this.f44784a = rgVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Throwable error = (Throwable) obj;
        Intrinsics.checkNotNullParameter(error, "error");
        rg rgVar = this.f44784a;
        String localizedMessage = error.getLocalizedMessage();
        if (localizedMessage == null) {
            localizedMessage = "Error occurred during payment by saved card";
        }
        rgVar.a((RuStorePaymentException) new RuStorePaymentException.RuStorePaymentCommonException(localizedMessage, null, 2, null));
        return Unit.f41027a;
    }
}
