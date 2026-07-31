package ru.rustore.sdk.pay.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class uj extends kotlin.jvm.internal.s implements Function1<z4, Unit> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vj f45105a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uj(vj vjVar) {
        super(1);
        this.f45105a = vjVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        z4 discount = (z4) obj;
        Intrinsics.checkNotNullParameter(discount, "discount");
        d5 d5Var = this.f45105a.f45140b;
        d5Var.getClass();
        Intrinsics.checkNotNullParameter(discount, "discount");
        p2 p2Var = d5Var.f43956a;
        p2Var.getClass();
        Intrinsics.checkNotNullParameter(discount, "discount");
        p2Var.f44767a.emit(discount);
        return Unit.f41027a;
    }
}
