package ru.rustore.sdk.pay.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class zd extends kotlin.jvm.internal.p implements Function1<Throwable, Unit> {
    public zd(ld ldVar) {
        super(1, ldVar, ld.class, "handleApplicationPurchaseError", "handleApplicationPurchaseError(Ljava/lang/Throwable;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Throwable p02 = (Throwable) obj;
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((ld) this.receiver).a(p02);
        return Unit.f41027a;
    }
}
