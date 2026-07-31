package ru.rustore.sdk.pay.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class m5 extends kotlin.jvm.internal.p implements Function1<Throwable, Unit> {
    public m5(n5 n5Var) {
        super(1, n5Var, n5.class, "handlePurchaseCheckingError", "handlePurchaseCheckingError(Ljava/lang/Throwable;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Throwable p02 = (Throwable) obj;
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((n5) this.receiver).a(p02);
        return Unit.f41027a;
    }
}
