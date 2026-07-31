package ru.rustore.sdk.pay.internal;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.pay.model.PurchaseAvailabilityResult;
import ru.rustore.sdk.pay.model.RuStorePaymentException;

/* loaded from: classes3.dex */
public final class a7 extends kotlin.jvm.internal.s implements Function1<ak, PurchaseAvailabilityResult> {

    /* renamed from: a, reason: collision with root package name */
    public static final a7 f43797a = new a7();

    public a7() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ak session = (ak) obj;
        Intrinsics.checkNotNullParameter(session, "session");
        return session.c().length() == 0 ? new PurchaseAvailabilityResult.Unavailable(new RuStorePaymentException.EmptyPaymentTokenException()) : PurchaseAvailabilityResult.Available.INSTANCE;
    }
}
