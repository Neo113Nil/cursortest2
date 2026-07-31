package ru.rustore.sdk.pay.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class eg extends kotlin.jvm.internal.s implements Function1<Unit, Unit> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hg f44039a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eg(hg hgVar) {
        super(1);
        this.f44039a = hgVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit it = (Unit) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        this.f44039a.b("Error occurred during payment by mobile phone account");
        return Unit.f41027a;
    }
}
