package ru.rustore.sdk.pay.internal;

import android.content.Context;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.analytics.AnalyticsEventProvider;
import ru.rustore.sdk.core.util.RuStoreUtils;
import ru.rustore.sdk.metrics.MetricsClient;
import ru.rustore.sdk.metrics.MetricsEvent;
import ru.rustore.sdk.reactive.core.Dispatchers;
import ru.rustore.sdk.reactive.single.Single;
import ru.rustore.sdk.reactive.single.SingleOnErrorReturnKt;
import ru.rustore.sdk.reactive.single.SingleSubscribeKt;
import ru.rustore.sdk.reactive.single.SingleSubscribeOnKt;

/* loaded from: classes3.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final AnalyticsEventProvider f44610a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final ui f44611b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final MetricsClient f44612c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public final Context f44613d;

    public static final class a extends kotlin.jvm.internal.s implements Function1<Throwable, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f44614a = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Throwable it = (Throwable) obj;
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.f41027a;
        }
    }

    public static final class b extends kotlin.jvm.internal.s implements Function1<Unit, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f44615a = new b();

        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Unit it = (Unit) obj;
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.f41027a;
        }
    }

    public m(@NotNull AnalyticsEventProvider analyticsEventProvider, @NotNull ui ruStoreStatusProvider, @NotNull MetricsClient metricsClient, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(analyticsEventProvider, "analyticsEventProvider");
        Intrinsics.checkNotNullParameter(ruStoreStatusProvider, "ruStoreStatusProvider");
        Intrinsics.checkNotNullParameter(metricsClient, "metricsClient");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f44610a = analyticsEventProvider;
        this.f44611b = ruStoreStatusProvider;
        this.f44612c = metricsClient;
        this.f44613d = context;
    }

    public final void a(@NotNull String eventName, @NotNull Map<String, String> parameters) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        SingleSubscribeKt.subscribe$default(SingleOnErrorReturnKt.onErrorReturn(SingleSubscribeOnKt.subscribeOn(RuStoreUtils.INSTANCE.isRuStoreInstalled(this.f44611b.f45104a) ? Single.Companion.from(new l(this, eventName, parameters)) : this.f44612c.send(new MetricsEvent(eventName, parameters)), Dispatchers.INSTANCE.getIo()), a.f44614a), null, b.f44615a, 1, null);
    }
}
