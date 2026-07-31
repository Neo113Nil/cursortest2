package ru.rustore.sdk.metrics;

import android.content.Context;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.metrics.internal.m;
import ru.rustore.sdk.metrics.internal.n;
import ru.rustore.sdk.metrics.internal.w0;
import ru.rustore.sdk.reactive.single.Single;
import ru.rustore.sdk.reactive.single.SingleSubscribeOnKt;

@Metadata
/* loaded from: classes3.dex */
public final class MetricsClient {
    public static final Companion Companion = new Companion(null);
    private final n metricsClientController;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final MetricsClient getInstance(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return w0.f43775c.a(context).f43778b;
        }

        private Companion() {
        }
    }

    public MetricsClient(n metricsClientController) {
        Intrinsics.checkNotNullParameter(metricsClientController, "metricsClientController");
        this.metricsClientController = metricsClientController;
    }

    public final Single<Unit> send(MetricsEvent metricsEvent) {
        Intrinsics.checkNotNullParameter(metricsEvent, "metricsEvent");
        n nVar = this.metricsClientController;
        nVar.getClass();
        Intrinsics.checkNotNullParameter(metricsEvent, "metricsEvent");
        return SingleSubscribeOnKt.subscribeOn(Single.Companion.from(new m(nVar, metricsEvent)), nVar.f43726d);
    }
}
