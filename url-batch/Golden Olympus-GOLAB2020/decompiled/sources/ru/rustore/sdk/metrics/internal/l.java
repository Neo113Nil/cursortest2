package ru.rustore.sdk.metrics.internal;

import kotlin.jvm.functions.Function0;
import ru.rustore.sdk.metrics.MetricsEvent;

/* loaded from: classes3.dex */
public final class l extends kotlin.jvm.internal.s implements Function0<String> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MetricsEvent f43719a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(MetricsEvent metricsEvent) {
        super(0);
        this.f43719a = metricsEvent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "MetricsClient enqueue " + this.f43719a;
    }
}
