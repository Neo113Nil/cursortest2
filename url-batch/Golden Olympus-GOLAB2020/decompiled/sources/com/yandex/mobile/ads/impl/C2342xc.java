package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ew1;
import io.appmetrica.analytics.AppMetricaLibraryAdapter;
import io.appmetrica.analytics.AppMetricaLibraryAdapterConfig;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.xc, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2342xc {

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final AtomicBoolean f34510d = new AtomicBoolean(false);

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2275ue f34511a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final us0 f34512b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ew1 f34513c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C2342xc() {
        this(r0, r1, ew1.a.a());
        C2275ue c2275ue = new C2275ue();
        us0 us0Var = new us0();
        int i4 = ew1.f25476l;
    }

    public final void a(@NotNull Context context) {
        Object m243constructorimpl;
        Intrinsics.checkNotNullParameter(context, "context");
        du1 a4 = this.f34513c.a(context);
        boolean z4 = a4 != null && a4.j();
        this.f34512b.getClass();
        if (us0.d(context) && !z4 && f34510d.compareAndSet(false, true)) {
            C1828bd configuration = this.f34511a.a(context);
            C2319wc.f33993a.getClass();
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            try {
                Result.Companion companion = Result.Companion;
                AppMetricaLibraryAdapterConfig build = AppMetricaLibraryAdapterConfig.newConfigBuilder().withAdvIdentifiersTracking(configuration.a()).build();
                Intrinsics.checkNotNullExpressionValue(build, "build(...)");
                AppMetricaLibraryAdapter.activate(context, build);
                m243constructorimpl = Result.m243constructorimpl(Unit.f41027a);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                m243constructorimpl = Result.m243constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.d(m243constructorimpl) != null) {
                ap0.b(new Object[0]);
            }
        }
    }

    public C2342xc(@NotNull C2275ue appMetricaPolicyConfigurator, @NotNull us0 manifestAnalyzer, @NotNull ew1 sdkSettings) {
        Intrinsics.checkNotNullParameter(appMetricaPolicyConfigurator, "appMetricaPolicyConfigurator");
        Intrinsics.checkNotNullParameter(manifestAnalyzer, "manifestAnalyzer");
        Intrinsics.checkNotNullParameter(sdkSettings, "sdkSettings");
        this.f34511a = appMetricaPolicyConfigurator;
        this.f34512b = manifestAnalyzer;
        this.f34513c = sdkSettings;
    }
}
