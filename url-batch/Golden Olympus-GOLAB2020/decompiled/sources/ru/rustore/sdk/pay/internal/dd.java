package ru.rustore.sdk.pay.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class dd extends kotlin.jvm.internal.p implements Function0<Unit> {
    public dd(ld ldVar) {
        super(0, ldVar, ld.class, "openTermsAndConditions", "openTermsAndConditions()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        jd jdVar = (jd) ((ld) this.receiver).f44514a.f45547o.getValue();
        jdVar.getClass();
        Intrinsics.checkNotNullParameter("https://www.rustore.ru/help/legal/concent", "url");
        jdVar.f44374a.a("https://www.rustore.ru/help/legal/concent");
        return Unit.f41027a;
    }
}
