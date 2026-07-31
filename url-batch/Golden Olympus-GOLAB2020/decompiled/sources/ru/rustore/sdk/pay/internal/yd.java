package ru.rustore.sdk.pay.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.pay.internal.ua;
import ru.rustore.sdk.pay.model.Url;

/* loaded from: classes3.dex */
public final class yd extends kotlin.jvm.internal.s implements Function1<h8, Unit> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ld f45268a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yd(ld ldVar) {
        super(1);
        this.f45268a = ldVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        h8 purchaseWithMobilePhone = (h8) obj;
        Intrinsics.checkNotNullParameter(purchaseWithMobilePhone, "purchaseWithMobilePhone");
        ((zm) this.f45268a.f44514a.f45475Z1.getValue()).a(purchaseWithMobilePhone.f44224d);
        ((qk) this.f45268a.f44514a.f45464W2.getValue()).a(ua.a.f45089a);
        jd jdVar = (jd) this.f45268a.f44514a.f45547o.getValue();
        Url redirectUrl = purchaseWithMobilePhone.f44221a;
        jdVar.getClass();
        Intrinsics.checkNotNullParameter(redirectUrl, "redirectUrl");
        jdVar.f44374a.a(redirectUrl);
        return Unit.f41027a;
    }
}
