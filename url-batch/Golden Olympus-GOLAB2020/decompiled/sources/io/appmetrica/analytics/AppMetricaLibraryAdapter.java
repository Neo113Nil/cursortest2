package io.appmetrica.analytics;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.A0;
import io.appmetrica.analytics.impl.C3082x4;
import io.appmetrica.analytics.impl.Wb;
import io.appmetrica.analytics.impl.Xb;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;

/* loaded from: classes3.dex */
public class AppMetricaLibraryAdapter {

    /* renamed from: a, reason: collision with root package name */
    private static A0 f36812a = new A0();

    public static void activate(@NonNull Context context) {
        A0 a02 = f36812a;
        if (!a02.f37145a.f38462a.a(context).f39527a) {
            ImportantLogger.INSTANCE.info("[AppMetricaLibraryAdapterProxy]", "Activation failed due to context is null", new Object[0]);
            return;
        }
        Xb xb = a02.f37146b;
        Context applicationContext = context.getApplicationContext();
        xb.getClass();
        C3082x4.l().f40122g.a(applicationContext);
        C3082x4.l().b().a(applicationContext, AppMetricaLibraryAdapterConfig.newConfigBuilder().build());
    }

    public static void reportEvent(@NonNull String str, @NonNull String str2, @NonNull String str3) {
        f36812a.a(str, str2, str3);
    }

    public static void setAdvIdentifiersTracking(boolean z4) {
        A0 a02 = f36812a;
        if (a02.f37145a.f38464c.a((Void) null).f39527a) {
            a02.f37146b.getClass();
            ModulesFacade.setAdvIdentifiersTracking(z4);
        }
    }

    public static void setProxy(@NonNull A0 a02) {
        f36812a = a02;
    }

    public static void activate(@NonNull Context context, @NonNull AppMetricaLibraryAdapterConfig appMetricaLibraryAdapterConfig) {
        A0 a02 = f36812a;
        Wb wb = a02.f37145a;
        if (wb.f38462a.a(context).f39527a && wb.f38463b.a(appMetricaLibraryAdapterConfig).f39527a) {
            Xb xb = a02.f37146b;
            Context applicationContext = context.getApplicationContext();
            xb.getClass();
            C3082x4.l().f40122g.a(applicationContext);
            C3082x4.l().b().a(applicationContext, appMetricaLibraryAdapterConfig);
            return;
        }
        ImportantLogger.INSTANCE.info("[AppMetricaLibraryAdapterProxy]", "Activation failed due to context is null or invalid config", new Object[0]);
    }
}
