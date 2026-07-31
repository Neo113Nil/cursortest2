package io.appmetrica.analytics.impl;

import android.location.Location;
import android.os.Bundle;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.AdvIdentifiersResult;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.AppMetricaLibraryAdapterConfig;
import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.StartupParamsCallback;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public interface Xa extends InterfaceC2544cd, V6, InterfaceC2856ob {
    @Override // io.appmetrica.analytics.impl.InterfaceC2856ob
    @NonNull
    /* synthetic */ InterfaceC2830nb a();

    @Override // io.appmetrica.analytics.impl.V6
    /* synthetic */ void a(int i4, @NonNull Bundle bundle);

    @Override // io.appmetrica.analytics.impl.InterfaceC2544cd
    /* synthetic */ void a(Location location);

    void a(@NonNull AppMetricaLibraryAdapterConfig appMetricaLibraryAdapterConfig);

    void a(DeferredDeeplinkListener deferredDeeplinkListener);

    void a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener);

    void a(@NonNull ReporterConfig reporterConfig);

    void a(@NonNull StartupParamsCallback startupParamsCallback, @NonNull List<String> list);

    @Override // io.appmetrica.analytics.impl.InterfaceC2544cd
    /* synthetic */ void a(String str, String str2);

    @Override // io.appmetrica.analytics.impl.InterfaceC2544cd
    /* synthetic */ void a(boolean z4);

    void b(@NonNull AppMetricaConfig appMetricaConfig);

    @Override // io.appmetrica.analytics.impl.InterfaceC2544cd
    /* synthetic */ void b(boolean z4);

    @NonNull
    InterfaceC2804mb c(@NonNull ReporterConfig reporterConfig);

    @Override // io.appmetrica.analytics.impl.InterfaceC2544cd
    /* synthetic */ void clearAppEnvironment();

    @NonNull
    C2958sa d();

    String e();

    Map<String, String> g();

    @NonNull
    AdvIdentifiersResult h();

    Ec i();

    @Override // io.appmetrica.analytics.impl.InterfaceC2544cd
    /* synthetic */ void putAppEnvironmentValue(String str, String str2);

    @Override // io.appmetrica.analytics.impl.InterfaceC2544cd
    /* synthetic */ void setDataSendingEnabled(boolean z4);

    @Override // io.appmetrica.analytics.impl.InterfaceC2544cd
    /* synthetic */ void setUserProfileID(String str);
}
