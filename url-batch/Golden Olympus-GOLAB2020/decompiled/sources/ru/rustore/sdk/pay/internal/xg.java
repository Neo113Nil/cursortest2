package ru.rustore.sdk.pay.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class xg extends kotlin.jvm.internal.s implements Function1<Throwable, Unit> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zg f45229a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xg(zg zgVar) {
        super(1);
        this.f45229a = zgVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Throwable error = (Throwable) obj;
        Intrinsics.checkNotNullParameter(error, "error");
        this.f45229a.a(error);
        return Unit.f41027a;
    }
}
