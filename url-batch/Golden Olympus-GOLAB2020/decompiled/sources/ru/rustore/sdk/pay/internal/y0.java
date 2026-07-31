package ru.rustore.sdk.pay.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.reactive.single.SingleEmitter;

/* loaded from: classes3.dex */
public final class y0 extends kotlin.jvm.internal.s implements Function1<String, Unit> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SingleEmitter<String> f45250a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(SingleEmitter<String> singleEmitter) {
        super(1);
        this.f45250a = singleEmitter;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String paymentInfo = (String) obj;
        Intrinsics.checkNotNullParameter(paymentInfo, "paymentInfo");
        this.f45250a.success(paymentInfo);
        return Unit.f41027a;
    }
}
