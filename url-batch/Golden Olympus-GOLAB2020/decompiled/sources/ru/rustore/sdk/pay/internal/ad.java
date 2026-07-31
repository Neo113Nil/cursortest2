package ru.rustore.sdk.pay.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class ad extends kotlin.jvm.internal.p implements Function0<Unit> {
    public ad(ld ldVar) {
        super(0, ldVar, ld.class, "openOffer", "openOffer()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        jd jdVar = (jd) ((ld) this.receiver).f44514a.f45547o.getValue();
        jdVar.getClass();
        Intrinsics.checkNotNullParameter("https://money.mail.ru/img/cards_conditions.pdf", "url");
        jdVar.f44374a.a("https://money.mail.ru/img/cards_conditions.pdf");
        return Unit.f41027a;
    }
}
