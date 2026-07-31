package ru.rustore.sdk.pay.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class tl extends kotlin.jvm.internal.s implements Function1<Unit, Unit> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ul f45047a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tl(ul ulVar) {
        super(1);
        this.f45047a = ulVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit it = (Unit) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        s6 s6Var = this.f45047a.f45108a.f44854a.f44586b;
        if (s6Var != null) {
            s6Var.dismissAllowingStateLoss();
        }
        return Unit.f41027a;
    }
}
