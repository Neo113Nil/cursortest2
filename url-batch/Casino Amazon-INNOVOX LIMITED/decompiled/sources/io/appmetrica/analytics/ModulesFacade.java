package io.appmetrica.analytics;

import android.content.Context;
import io.appmetrica.analytics.impl.AbstractC0409oi;
import io.appmetrica.analytics.impl.C0200gd;
import io.appmetrica.analytics.impl.C0252id;
import io.appmetrica.analytics.impl.C0277jd;
import io.appmetrica.analytics.impl.C0303kd;
import io.appmetrica.analytics.impl.C0329ld;
import io.appmetrica.analytics.impl.C0354md;
import io.appmetrica.analytics.impl.C0379nd;
import io.appmetrica.analytics.impl.C0404od;
import io.appmetrica.analytics.impl.C0665z0;

/* loaded from: classes3.dex */
public final class ModulesFacade {
    public static final int EXTERNAL_ATTRIBUTION_ADJUST = 2;
    public static final int EXTERNAL_ATTRIBUTION_AIRBRIDGE = 5;
    public static final int EXTERNAL_ATTRIBUTION_APPSFLYER = 1;
    public static final int EXTERNAL_ATTRIBUTION_KOCHAVA = 3;
    public static final int EXTERNAL_ATTRIBUTION_SINGULAR = 6;
    public static final int EXTERNAL_ATTRIBUTION_TENJIN = 4;

    /* renamed from: a, reason: collision with root package name */
    private static C0404od f548a = new C0404od();

    public static IModuleReporter getModuleReporter(Context context, String str) {
        C0404od c0404od = f548a;
        C0200gd c0200gd = c0404od.b;
        c0200gd.b.a(context);
        c0200gd.d.a(str);
        c0404od.c.f1534a.a(context.getApplicationContext().getApplicationContext());
        return AbstractC0409oi.f1417a.a(context.getApplicationContext(), str);
    }

    public static boolean isActivatedForApp() {
        C0404od c0404od = f548a;
        c0404od.b.getClass();
        c0404od.c.getClass();
        c0404od.f1413a.getClass();
        return C0665z0.a();
    }

    public static void reportAdRevenue(AdRevenue adRevenue) {
        reportAdRevenue(adRevenue, Boolean.TRUE);
    }

    public static void reportEvent(ModuleEvent moduleEvent) {
        C0404od c0404od = f548a;
        c0404od.b.f1271a.a(null);
        c0404od.c.getClass();
        c0404od.d.execute(new C0277jd(c0404od, moduleEvent));
    }

    public static void reportExternalAttribution(int i, String str) {
        C0404od c0404od = f548a;
        c0404od.b.getClass();
        c0404od.c.getClass();
        c0404od.d.execute(new C0303kd(c0404od, i, str));
    }

    public static void sendEventsBuffer() {
        C0404od c0404od = f548a;
        c0404od.b.getClass();
        c0404od.c.getClass();
        AppMetrica.sendEventsBuffer();
    }

    public static void setAdvIdentifiersTracking(boolean z) {
        C0404od c0404od = f548a;
        c0404od.b.getClass();
        c0404od.c.getClass();
        c0404od.d.execute(new C0329ld(c0404od, z));
    }

    public static void setProxy(C0404od c0404od) {
        f548a = c0404od;
    }

    public static void setSessionExtra(String str, byte[] bArr) {
        C0404od c0404od = f548a;
        c0404od.b.c.a(str);
        c0404od.c.getClass();
        c0404od.d.execute(new C0354md(c0404od, str, bArr));
    }

    public static void subscribeForAutoCollectedData(Context context, String str) {
        C0404od c0404od = f548a;
        C0200gd c0200gd = c0404od.b;
        c0200gd.b.a(context);
        c0200gd.d.a(str);
        c0404od.c.f1534a.a(context.getApplicationContext());
        c0404od.d.execute(new C0379nd(str));
    }

    public static void reportAdRevenue(AdRevenue adRevenue, Boolean bool) {
        C0404od c0404od = f548a;
        boolean booleanValue = bool.booleanValue();
        c0404od.b.getClass();
        c0404od.c.getClass();
        c0404od.d.execute(new C0252id(c0404od, adRevenue, booleanValue));
    }
}
