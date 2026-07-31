package ru.rustore.sdk.pay.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class n0 extends kotlin.jvm.internal.s implements Function1<f0, Unit> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o0 f44666a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(o0 o0Var) {
        super(1);
        this.f44666a = o0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        f0 applicationPurchase = (f0) obj;
        Intrinsics.checkNotNullParameter(applicationPurchase, "applicationPurchase");
        o2 o2Var = this.f44666a.f44715b;
        o2Var.getClass();
        Intrinsics.checkNotNullParameter(applicationPurchase, "applicationPurchase");
        o2Var.f44719a = applicationPurchase;
        return Unit.f41027a;
    }
}
