package ru.rustore.sdk.pay.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.pay.internal.ua;
import ru.rustore.sdk.pay.model.Url;

/* loaded from: classes3.dex */
public final class ae extends kotlin.jvm.internal.s implements Function1<i8, Unit> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ld f43808a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ae(ld ldVar) {
        super(1);
        this.f43808a = ldVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        i8 purchaseWithNewCard = (i8) obj;
        Intrinsics.checkNotNullParameter(purchaseWithNewCard, "purchaseWithNewCard");
        ((zm) this.f43808a.f44514a.f45475Z1.getValue()).a(purchaseWithNewCard.f44319d);
        ((qk) this.f43808a.f44514a.f45464W2.getValue()).a(ua.b.f45090a);
        jd jdVar = (jd) this.f43808a.f44514a.f45547o.getValue();
        Url redirectUrl = purchaseWithNewCard.f44316a;
        jdVar.getClass();
        Intrinsics.checkNotNullParameter(redirectUrl, "redirectUrl");
        jdVar.f44374a.b(redirectUrl);
        return Unit.f41027a;
    }
}
