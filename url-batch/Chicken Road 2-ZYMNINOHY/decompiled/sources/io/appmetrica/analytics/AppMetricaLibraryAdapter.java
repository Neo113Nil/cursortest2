package io.appmetrica.analytics;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.ApiKeyUtils;
import io.appmetrica.analytics.impl.Bb;
import io.appmetrica.analytics.impl.C0471a0;
import io.appmetrica.analytics.impl.C0497b0;
import io.appmetrica.analytics.impl.C0501b4;
import io.appmetrica.analytics.impl.Cb;
import io.appmetrica.analytics.impl.F0;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;

/* loaded from: classes.dex */
public class AppMetricaLibraryAdapter {

    /* renamed from: a, reason: collision with root package name */
    private static F0 f9363a = new F0();

    public static void activate(Context context) {
        F0 f02 = f9363a;
        if (!f02.f10266a.f10095a.a(context).f12630a) {
            ImportantLogger.INSTANCE.info("[AppMetricaLibraryAdapterProxy]", "Activation failed due to context is null", new Object[0]);
            return;
        }
        Cb cb = f02.f10267b;
        Context applicationContext = context.getApplicationContext();
        cb.getClass();
        C0501b4.l().f11461g.a(applicationContext);
        C0501b4.l().b().a(applicationContext, AppMetricaLibraryAdapterConfig.newConfigBuilder().build());
    }

    public static void reportEvent(String str, String str2, String str3) {
        f9363a.a(str, str2, str3);
    }

    public static void setAdvIdentifiersTracking(boolean z) {
        F0 f02 = f9363a;
        if (f02.f10266a.f10097c.a((Void) null).f12630a) {
            f02.f10267b.getClass();
            ModulesFacade.setAdvIdentifiersTracking(z);
        }
    }

    public static void setProxy(F0 f02) {
        f9363a = f02;
    }

    public static void subscribeForAutoCollectedData(Context context, String str) {
        F0 f02 = f9363a;
        f02.getClass();
        ImportantLogger.INSTANCE.info("[AppMetricaLibraryAdapterProxy]", "Subscribe for auto-collected data with api key: " + ApiKeyUtils.createPartialApiKey(str), new Object[0]);
        Bb bb = f02.f10266a;
        if (bb.f10101g.a(str).f12630a && bb.f10095a.a(context).f12630a) {
            f02.f10267b.getClass();
            C0501b4.l().f11461g.a(context);
            C0497b0 b4 = C0501b4.l().b();
            b4.f11449c.a().executeDelayed(new C0471a0(b4, context), b4.f11450d);
            ModulesFacade.subscribeForAutoCollectedData(context, str);
        }
    }

    public static void activate(Context context, AppMetricaLibraryAdapterConfig appMetricaLibraryAdapterConfig) {
        F0 f02 = f9363a;
        Bb bb = f02.f10266a;
        if (bb.f10095a.a(context).f12630a && bb.f10096b.a(appMetricaLibraryAdapterConfig).f12630a) {
            Cb cb = f02.f10267b;
            Context applicationContext = context.getApplicationContext();
            cb.getClass();
            C0501b4.l().f11461g.a(applicationContext);
            C0501b4.l().b().a(applicationContext, appMetricaLibraryAdapterConfig);
            return;
        }
        ImportantLogger.INSTANCE.info("[AppMetricaLibraryAdapterProxy]", "Activation failed due to context is null or invalid config", new Object[0]);
    }
}
