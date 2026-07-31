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
public final class ce extends kotlin.jvm.internal.s implements Function1<h8, Unit> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ld f43911a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ProductType f43912b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InvoiceId f43913c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ PurchaseId f43914d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ce(ld ldVar, ProductType productType, InvoiceId invoiceId, PurchaseId purchaseId) {
        super(1);
        this.f43911a = ldVar;
        this.f43912b = productType;
        this.f43913c = invoiceId;
        this.f43914d = purchaseId;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        h8 purchaseWithMobilePhone = (h8) obj;
        Intrinsics.checkNotNullParameter(purchaseWithMobilePhone, "purchaseWithMobilePhone");
        ((xc) this.f43911a.f44514a.f45375A2.getValue()).a(purchaseWithMobilePhone.f44224d, j.a(this.f43912b), this.f43913c, this.f43914d);
        ((cn) this.f43911a.f44514a.f45480a2.getValue()).a(purchaseWithMobilePhone.f44224d);
        ((qk) this.f43911a.f44514a.f45464W2.getValue()).a(ua.a.f45089a);
        jd jdVar = (jd) this.f43911a.f44514a.f45547o.getValue();
        Url redirectUrl = purchaseWithMobilePhone.f44221a;
        jdVar.getClass();
        Intrinsics.checkNotNullParameter(redirectUrl, "redirectUrl");
        jdVar.f44374a.a(redirectUrl);
        return Unit.f41027a;
    }
}
