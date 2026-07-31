package ru.rustore.sdk.metrics.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.metrics.internal.w0;

/* loaded from: classes3.dex */
public final class i extends kotlin.jvm.internal.s implements Function1<Throwable, Unit> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f43710a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(n nVar) {
        super(1);
        this.f43710a = nVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Throwable it = (Throwable) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        w0.b bVar = this.f43710a.f43727e;
        h messageBuilder = h.f43708a;
        Intrinsics.checkNotNullParameter(messageBuilder, "messageBuilder");
        return Unit.f41027a;
    }
}
