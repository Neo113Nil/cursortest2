package ru.rustore.sdk.pay.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class d2 extends kotlin.jvm.internal.s implements Function1<Throwable, Unit> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h2 f43952a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(h2 h2Var) {
        super(1);
        this.f43952a = h2Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Throwable throwable = (Throwable) obj;
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        this.f43952a.a(throwable);
        return Unit.f41027a;
    }
}
