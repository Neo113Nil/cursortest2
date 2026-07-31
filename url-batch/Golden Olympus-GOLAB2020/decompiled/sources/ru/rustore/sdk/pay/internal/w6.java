package ru.rustore.sdk.pay.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ru.rustore.sdk.pay.model.ProductType;

/* loaded from: classes3.dex */
public final class w6 extends kotlin.jvm.internal.s implements Function1<qb, Unit> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x6 f45155a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w6(x6 x6Var) {
        super(1);
        this.f45155a = x6Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ProductType productType;
        qb qbVar = (qb) obj;
        ((r6) this.f45155a.f45209a.f45388D2.getValue()).a((qbVar == null || (productType = qbVar.f44821f) == null) ? null : j.a(productType), qbVar != null ? qbVar.f44819d : null, qbVar != null ? qbVar.f44818c : null);
        return Unit.f41027a;
    }
}
