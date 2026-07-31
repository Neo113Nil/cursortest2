package ru.rustore.sdk.pay.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.pay.internal.kd;

/* loaded from: classes3.dex */
public final class ud extends kotlin.jvm.internal.s implements Function1<Throwable, Unit> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ld f45095a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ud(ld ldVar) {
        super(1);
        this.f45095a = ldVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Throwable error = (Throwable) obj;
        Intrinsics.checkNotNullParameter(error, "error");
        kd value = this.f45095a.f44516c.getValue();
        if (value instanceof kd.a) {
            this.f45095a.a(error);
        } else if (value instanceof kd.b) {
            this.f45095a.b(error);
        }
        return Unit.f41027a;
    }
}
