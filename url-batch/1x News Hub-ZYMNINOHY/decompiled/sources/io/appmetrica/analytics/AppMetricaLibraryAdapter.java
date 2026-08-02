package io.appmetrica.analytics;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.ApiKeyUtils;
import io.appmetrica.analytics.impl.C0349a0;
import io.appmetrica.analytics.impl.C0375b0;
import io.appmetrica.analytics.impl.C0585j4;
import io.appmetrica.analytics.impl.D0;
import io.appmetrica.analytics.impl.Ib;
import io.appmetrica.analytics.impl.Jb;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;

/* loaded from: classes.dex */
public class AppMetricaLibraryAdapter {

    /* renamed from: a, reason: collision with root package name */
    private static D0 f5132a = new D0();

    public static void activate(Context context) {
        D0 d02 = f5132a;
        if (!d02.f5873a.f6143a.a(context).f8327a) {
            ImportantLogger.INSTANCE.info("[AppMetricaLibraryAdapterProxy]", "Activation failed due to context is null", new Object[0]);
            return;
        }
        Jb jb = d02.f5874b;
        Context applicationContext = context.getApplicationContext();
        jb.getClass();
        C0585j4.l().f7597g.a(applicationContext);
        C0585j4.l().b().a(applicationContext, AppMetricaLibraryAdapterConfig.newConfigBuilder().build());
    }

    public static void reportEvent(String str, String str2, String str3) {
        f5132a.a(str, str2, str3);
    }

    public static void setAdvIdentifiersTracking(boolean z) {
        D0 d02 = f5132a;
        if (d02.f5873a.f6145c.a((Void) null).f8327a) {
            d02.f5874b.getClass();
            ModulesFacade.setAdvIdentifiersTracking(z);
        }
    }

    public static void setProxy(D0 d02) {
        f5132a = d02;
    }

    public static void subscribeForAutoCollectedData(Context context, String str) {
        D0 d02 = f5132a;
        d02.getClass();
        ImportantLogger.INSTANCE.info("[AppMetricaLibraryAdapterProxy]", "Subscribe for auto-collected data with api key: " + ApiKeyUtils.createPartialApiKey(str), new Object[0]);
        Ib ib = d02.f5873a;
        if (ib.f6148g.a(str).f8327a && ib.f6143a.a(context).f8327a) {
            d02.f5874b.getClass();
            C0585j4.l().f7597g.a(context);
            C0375b0 b3 = C0585j4.l().b();
            b3.f7054c.a().executeDelayed(new C0349a0(b3, context), b3.f7055d);
            ModulesFacade.subscribeForAutoCollectedData(context, str);
        }
    }

    public static void activate(Context context, AppMetricaLibraryAdapterConfig appMetricaLibraryAdapterConfig) {
        D0 d02 = f5132a;
        Ib ib = d02.f5873a;
        if (ib.f6143a.a(context).f8327a && ib.f6144b.a(appMetricaLibraryAdapterConfig).f8327a) {
            Jb jb = d02.f5874b;
            Context applicationContext = context.getApplicationContext();
            jb.getClass();
            C0585j4.l().f7597g.a(applicationContext);
            C0585j4.l().b().a(applicationContext, appMetricaLibraryAdapterConfig);
            return;
        }
        ImportantLogger.INSTANCE.info("[AppMetricaLibraryAdapterProxy]", "Activation failed due to context is null or invalid config", new Object[0]);
    }
}
