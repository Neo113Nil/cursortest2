package ru.rustore.sdk.metrics.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.metrics.MetricsEvent;
import ru.rustore.sdk.metrics.internal.w0;
import ru.rustore.sdk.reactive.core.Dispatchers;
import ru.rustore.sdk.reactive.single.Single;
import ru.rustore.sdk.reactive.single.SingleSubscribeKt;
import ru.rustore.sdk.reactive.single.SingleSubscribeOnKt;

/* loaded from: classes3.dex */
public final class m extends kotlin.jvm.internal.s implements Function0<Unit> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f43720a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MetricsEvent f43721b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, MetricsEvent metricsEvent) {
        super(0);
        this.f43720a = nVar;
        this.f43721b = metricsEvent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        n nVar = this.f43720a;
        if (!nVar.f43728f) {
            SingleSubscribeKt.subscribe(SingleSubscribeOnKt.subscribeOn(Single.Companion.from(new g(nVar)), Dispatchers.INSTANCE.getIo()), new i(nVar), new k(nVar));
            nVar.f43725c.a();
            nVar.f43728f = true;
        }
        w0.b bVar = this.f43720a.f43727e;
        l messageBuilder = new l(this.f43721b);
        Intrinsics.checkNotNullParameter(messageBuilder, "messageBuilder");
        c cVar = this.f43720a.f43724b;
        MetricsEvent metricsEvent = this.f43721b;
        Intrinsics.checkNotNullParameter(metricsEvent, "metricsEvent");
        n0 n0Var = cVar.f43694a;
        Intrinsics.checkNotNullParameter(metricsEvent, "metricsEvent");
        m0 messageBuilder2 = new m0(metricsEvent);
        Intrinsics.checkNotNullParameter(messageBuilder2, "messageBuilder");
        n0Var.f43729a.a(n0Var.f43730b.a(metricsEvent));
        return Unit.f41027a;
    }
}
