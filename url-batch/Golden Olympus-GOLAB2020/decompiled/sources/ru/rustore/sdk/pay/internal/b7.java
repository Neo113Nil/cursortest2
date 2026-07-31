package ru.rustore.sdk.pay.internal;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.pay.model.PurchaseAvailabilityResult;

/* loaded from: classes3.dex */
public final class b7 extends kotlin.jvm.internal.s implements Function1<Throwable, PurchaseAvailabilityResult> {

    /* renamed from: a, reason: collision with root package name */
    public static final b7 f43858a = new b7();

    public b7() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Throwable it = (Throwable) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        return new PurchaseAvailabilityResult.Unavailable(it);
    }
}
