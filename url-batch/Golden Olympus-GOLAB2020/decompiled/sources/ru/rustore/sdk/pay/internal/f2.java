package ru.rustore.sdk.pay.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class f2 extends kotlin.jvm.internal.s implements Function1<Throwable, Unit> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h2 f44053a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(h2 h2Var) {
        super(1);
        this.f44053a = h2Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Throwable error = (Throwable) obj;
        Intrinsics.checkNotNullParameter(error, "error");
        this.f44053a.a(error);
        return Unit.f41027a;
    }
}
