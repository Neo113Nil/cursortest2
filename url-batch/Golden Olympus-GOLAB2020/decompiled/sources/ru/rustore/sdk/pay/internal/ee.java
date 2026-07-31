package ru.rustore.sdk.pay.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.pay.internal.ua;
import ru.rustore.sdk.pay.model.InvoiceId;
import ru.rustore.sdk.pay.model.ProductType;
import ru.rustore.sdk.pay.model.PurchaseId;
import ru.rustore.sdk.pay.model.Url;

/* loaded from: classes3.dex */
public final class ee extends kotlin.jvm.internal.s implements Function1<i8, Unit> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ld f44035a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ProductType f44036b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InvoiceId f44037c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ PurchaseId f44038d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ee(ld ldVar, ProductType productType, InvoiceId invoiceId, PurchaseId purchaseId) {
        super(1);
        this.f44035a = ldVar;
        this.f44036b = productType;
        this.f44037c = invoiceId;
        this.f44038d = purchaseId;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        i8 purchaseWithNewCard = (i8) obj;
        Intrinsics.checkNotNullParameter(purchaseWithNewCard, "purchaseWithNewCard");
        ((xc) this.f44035a.f44514a.f45375A2.getValue()).a(purchaseWithNewCard.f44319d, j.a(this.f44036b), this.f44037c, this.f44038d);
        ((cn) this.f44035a.f44514a.f45480a2.getValue()).a(purchaseWithNewCard.f44319d);
        ((qk) this.f44035a.f44514a.f45464W2.getValue()).a(ua.b.f45090a);
        jd jdVar = (jd) this.f44035a.f44514a.f45547o.getValue();
        Url redirectUrl = purchaseWithNewCard.f44316a;
        jdVar.getClass();
        Intrinsics.checkNotNullParameter(redirectUrl, "redirectUrl");
        jdVar.f44374a.b(redirectUrl);
        return Unit.f41027a;
    }
}
