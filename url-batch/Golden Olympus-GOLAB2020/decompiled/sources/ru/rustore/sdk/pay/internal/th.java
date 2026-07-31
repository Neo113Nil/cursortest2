package ru.rustore.sdk.pay.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class th extends kotlin.jvm.internal.s implements Function1<Unit, Unit> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wh f45043a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public th(wh whVar) {
        super(1);
        this.f45043a = whVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit it = (Unit) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        this.f45043a.a("Error occurred during payment by card");
        return Unit.f41027a;
    }
}
