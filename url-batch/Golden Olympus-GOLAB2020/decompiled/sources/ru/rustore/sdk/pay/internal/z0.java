package ru.rustore.sdk.pay.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.reactive.single.SingleEmitter;

/* loaded from: classes3.dex */
public final class z0 extends kotlin.jvm.internal.s implements Function1<Throwable, Unit> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SingleEmitter<String> f45307a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(SingleEmitter<String> singleEmitter) {
        super(1);
        this.f45307a = singleEmitter;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Throwable error = (Throwable) obj;
        Intrinsics.checkNotNullParameter(error, "error");
        this.f45307a.error(error);
        return Unit.f41027a;
    }
}
