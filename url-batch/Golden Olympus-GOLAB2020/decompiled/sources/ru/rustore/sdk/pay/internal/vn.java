package ru.rustore.sdk.pay.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class vn extends kotlin.jvm.internal.p implements Function1<Throwable, Unit> {
    public vn(xn xnVar) {
        super(1, xnVar, xn.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Throwable p02 = (Throwable) obj;
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((xn) this.receiver).a(p02);
        return Unit.f41027a;
    }
}
