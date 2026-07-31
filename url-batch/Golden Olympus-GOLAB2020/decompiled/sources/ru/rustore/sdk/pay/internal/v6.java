package ru.rustore.sdk.pay.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class v6 extends kotlin.jvm.internal.s implements Function1<f0, Unit> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x6 f45121a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v6(x6 x6Var) {
        super(1);
        this.f45121a = x6Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        f0 f0Var = (f0) obj;
        ((r6) this.f45121a.f45209a.f45388D2.getValue()).a(k.APPLICATION, f0Var != null ? f0Var.f44048b : null, f0Var != null ? f0Var.f44047a : null);
        return Unit.f41027a;
    }
}
