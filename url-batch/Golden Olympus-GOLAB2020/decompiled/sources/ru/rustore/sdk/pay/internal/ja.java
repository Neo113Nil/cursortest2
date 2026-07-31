package ru.rustore.sdk.pay.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.pay.internal.a;
import ru.rustore.sdk.pay.internal.ua;
import ru.rustore.sdk.pay.model.Url;

/* loaded from: classes3.dex */
public final class ja extends kotlin.jvm.internal.s implements Function1<h8, Unit> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f44371a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ka f44372b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ja(a aVar, ka kaVar) {
        super(1);
        this.f44371a = aVar;
        this.f44372b = kaVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        h8 paymentWithMobilePhone = (h8) obj;
        Intrinsics.checkNotNullParameter(paymentWithMobilePhone, "paymentWithMobilePhone");
        a aVar = this.f44371a;
        if (aVar instanceof a.C0255a) {
            ((zm) this.f44372b.f44434a.f45475Z1.getValue()).a(paymentWithMobilePhone.f44224d);
        } else if (aVar instanceof a.b) {
            ((cn) this.f44372b.f44434a.f45480a2.getValue()).a(paymentWithMobilePhone.f44224d);
        }
        ((qk) this.f44372b.f44434a.f45464W2.getValue()).a(ua.a.f45089a);
        ga gaVar = (ga) this.f44372b.f44434a.f45486b3.getValue();
        Url redirectUrl = paymentWithMobilePhone.f44221a;
        gaVar.getClass();
        Intrinsics.checkNotNullParameter(redirectUrl, "redirectUrl");
        gaVar.f44167a.a(redirectUrl);
        return Unit.f41027a;
    }
}
