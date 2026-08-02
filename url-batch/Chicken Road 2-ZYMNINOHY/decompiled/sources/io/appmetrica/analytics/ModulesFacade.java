package io.appmetrica.analytics;

import android.content.Context;
import io.appmetrica.analytics.impl.AbstractC0825ni;
import io.appmetrica.analytics.impl.C0613fd;
import io.appmetrica.analytics.impl.C0665hd;
import io.appmetrica.analytics.impl.C0691id;
import io.appmetrica.analytics.impl.C0716jd;
import io.appmetrica.analytics.impl.C0742kd;
import io.appmetrica.analytics.impl.C0768ld;
import io.appmetrica.analytics.impl.C0794md;
import io.appmetrica.analytics.impl.C0820nd;
import io.appmetrica.analytics.impl.C1118z0;

/* loaded from: classes.dex */
public final class ModulesFacade {
    public static final int EXTERNAL_ATTRIBUTION_ADJUST = 2;
    public static final int EXTERNAL_ATTRIBUTION_AIRBRIDGE = 5;
    public static final int EXTERNAL_ATTRIBUTION_APPSFLYER = 1;
    public static final int EXTERNAL_ATTRIBUTION_KOCHAVA = 3;
    public static final int EXTERNAL_ATTRIBUTION_SINGULAR = 6;
    public static final int EXTERNAL_ATTRIBUTION_TENJIN = 4;

    /* renamed from: a, reason: collision with root package name */
    private static C0820nd f9386a = new C0820nd();

    public static IModuleReporter getModuleReporter(Context context, String str) {
        C0820nd c0820nd = f9386a;
        C0613fd c0613fd = c0820nd.f12449b;
        c0613fd.f11836b.a(context);
        c0613fd.f11838d.a(str);
        c0820nd.f12450c.f12828a.a(context.getApplicationContext().getApplicationContext());
        return AbstractC0825ni.f12468a.a(context.getApplicationContext(), str);
    }

    public static boolean isActivatedForApp() {
        C0820nd c0820nd = f9386a;
        c0820nd.f12449b.getClass();
        c0820nd.f12450c.getClass();
        c0820nd.f12448a.getClass();
        return C1118z0.a();
    }

    public static void reportAdRevenue(AdRevenue adRevenue) {
        reportAdRevenue(adRevenue, Boolean.TRUE);
    }

    public static void reportEvent(ModuleEvent moduleEvent) {
        C0820nd c0820nd = f9386a;
        c0820nd.f12449b.f11835a.a(null);
        c0820nd.f12450c.getClass();
        c0820nd.f12451d.execute(new C0691id(c0820nd, moduleEvent));
    }

    public static void reportExternalAttribution(int i4, String str) {
        C0820nd c0820nd = f9386a;
        c0820nd.f12449b.getClass();
        c0820nd.f12450c.getClass();
        c0820nd.f12451d.execute(new C0716jd(c0820nd, i4, str));
    }

    public static void sendEventsBuffer() {
        C0820nd c0820nd = f9386a;
        c0820nd.f12449b.getClass();
        c0820nd.f12450c.getClass();
        AppMetrica.sendEventsBuffer();
    }

    public static void setAdvIdentifiersTracking(boolean z) {
        C0820nd c0820nd = f9386a;
        c0820nd.f12449b.getClass();
        c0820nd.f12450c.getClass();
        c0820nd.f12451d.execute(new C0742kd(c0820nd, z));
    }

    public static void setProxy(C0820nd c0820nd) {
        f9386a = c0820nd;
    }

    public static void setSessionExtra(String str, byte[] bArr) {
        C0820nd c0820nd = f9386a;
        c0820nd.f12449b.f11837c.a(str);
        c0820nd.f12450c.getClass();
        c0820nd.f12451d.execute(new C0768ld(c0820nd, str, bArr));
    }

    public static void subscribeForAutoCollectedData(Context context, String str) {
        C0820nd c0820nd = f9386a;
        C0613fd c0613fd = c0820nd.f12449b;
        c0613fd.f11836b.a(context);
        c0613fd.f11838d.a(str);
        c0820nd.f12450c.f12828a.a(context.getApplicationContext());
        c0820nd.f12451d.execute(new C0794md(str));
    }

    public static void reportAdRevenue(AdRevenue adRevenue, Boolean bool) {
        C0820nd c0820nd = f9386a;
        boolean booleanValue = bool.booleanValue();
        c0820nd.f12449b.getClass();
        c0820nd.f12450c.getClass();
        c0820nd.f12451d.execute(new C0665hd(c0820nd, adRevenue, booleanValue));
    }
}
