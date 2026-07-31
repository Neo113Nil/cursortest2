package ru.rustore.sdk.metrics.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.metrics.internal.w0;

/* loaded from: classes3.dex */
public final class k extends kotlin.jvm.internal.s implements Function1<Unit, Unit> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f43718a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(n nVar) {
        super(1);
        this.f43718a = nVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit it = (Unit) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        w0.b bVar = this.f43718a.f43727e;
        j messageBuilder = j.f43715a;
        Intrinsics.checkNotNullParameter(messageBuilder, "messageBuilder");
        return Unit.f41027a;
    }
}
