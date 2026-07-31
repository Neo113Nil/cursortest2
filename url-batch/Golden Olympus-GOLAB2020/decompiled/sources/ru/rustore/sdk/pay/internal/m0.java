package ru.rustore.sdk.pay.internal;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.pay.model.AmountLabel;
import ru.rustore.sdk.pay.model.Description;
import ru.rustore.sdk.pay.model.InvoiceId;
import ru.rustore.sdk.pay.model.Price;
import ru.rustore.sdk.pay.model.PurchaseId;
import ru.rustore.sdk.pay.model.Url;

/* loaded from: classes3.dex */
public final class m0 extends kotlin.jvm.internal.s implements Function1<g0, f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o0 f44616a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(o0 o0Var) {
        super(1);
        this.f44616a = o0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        g0 dto = (g0) obj;
        Intrinsics.checkNotNullParameter(dto, "dto");
        l0 l0Var = this.f44616a.f44716c;
        l0Var.getClass();
        Intrinsics.checkNotNullParameter(dto, "dto");
        PurchaseId purchaseId = new PurchaseId(dto.f44140a);
        InvoiceId invoiceId = new InvoiceId(dto.f44141b);
        p0 p0Var = l0Var.f44499a;
        String str = dto.f44145f;
        p0Var.getClass();
        return new f0(purchaseId, invoiceId, p0.a(str), l0Var.f44500b.a(dto.f44147h), new e0(new Url(dto.f44149j.f44728c), new Description(dto.f44149j.f44727b), new AmountLabel(dto.f44144e), new Price(dto.f44143d), new Price(dto.f44143d)));
    }
}
