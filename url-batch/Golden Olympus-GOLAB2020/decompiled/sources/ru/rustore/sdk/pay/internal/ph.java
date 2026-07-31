package ru.rustore.sdk.pay.internal;

import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.pay.model.AppUserEmail;

/* loaded from: classes3.dex */
public final class ph extends kotlin.jvm.internal.s implements Function1<Unit, Unit> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qh f44785a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppUserEmail f44786b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ph(qh qhVar, AppUserEmail appUserEmail) {
        super(1);
        this.f44785a = qhVar;
        this.f44786b = appUserEmail;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit it = (Unit) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        mh mhVar = this.f44785a.f44844d;
        AppUserEmail appUserEmail = this.f44786b;
        mhVar.getClass();
        Intrinsics.checkNotNullParameter(appUserEmail, "appUserEmail");
        li liVar = mhVar.f44646a;
        liVar.getClass();
        Intrinsics.checkNotNullParameter(appUserEmail, "appUserEmail");
        int i4 = pl.f44790d;
        String emailValue = appUserEmail.getValue();
        Intrinsics.checkNotNullParameter(emailValue, "emailValue");
        pl plVar = new pl();
        plVar.setArguments(androidx.core.os.d.a(TuplesKt.to("emailValue", emailValue)));
        liVar.a(plVar, new si(liVar, plVar));
        return Unit.f41027a;
    }
}
