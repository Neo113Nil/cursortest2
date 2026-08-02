package io.appmetrica.analytics;

import android.content.Context;
import io.appmetrica.analytics.impl.AbstractC0832si;
import io.appmetrica.analytics.impl.C0672md;
import io.appmetrica.analytics.impl.C0724od;
import io.appmetrica.analytics.impl.C0750pd;
import io.appmetrica.analytics.impl.C0776qd;
import io.appmetrica.analytics.impl.C0801rd;
import io.appmetrica.analytics.impl.C0827sd;
import io.appmetrica.analytics.impl.C0853td;
import io.appmetrica.analytics.impl.C0879ud;
import io.appmetrica.analytics.impl.C0944x0;

/* loaded from: classes.dex */
public final class ModulesFacade {
    public static final int EXTERNAL_ATTRIBUTION_ADJUST = 2;
    public static final int EXTERNAL_ATTRIBUTION_AIRBRIDGE = 5;
    public static final int EXTERNAL_ATTRIBUTION_APPSFLYER = 1;
    public static final int EXTERNAL_ATTRIBUTION_KOCHAVA = 3;
    public static final int EXTERNAL_ATTRIBUTION_SINGULAR = 6;
    public static final int EXTERNAL_ATTRIBUTION_TENJIN = 4;

    /* renamed from: a, reason: collision with root package name */
    private static C0879ud f5153a = new C0879ud();

    public static IModuleReporter getModuleReporter(Context context, String str) {
        C0879ud c0879ud = f5153a;
        C0672md c0672md = c0879ud.f8451b;
        c0672md.f7876b.a(context);
        c0672md.f7878d.a(str);
        c0879ud.f8452c.f5817a.a(context.getApplicationContext().getApplicationContext());
        return AbstractC0832si.f8319a.a(context.getApplicationContext(), str);
    }

    public static boolean isActivatedForApp() {
        C0879ud c0879ud = f5153a;
        c0879ud.f8451b.getClass();
        c0879ud.f8452c.getClass();
        c0879ud.f8450a.getClass();
        return C0944x0.a();
    }

    public static void reportAdRevenue(AdRevenue adRevenue) {
        reportAdRevenue(adRevenue, Boolean.TRUE);
    }

    public static void reportEvent(ModuleEvent moduleEvent) {
        C0879ud c0879ud = f5153a;
        c0879ud.f8451b.f7875a.a(null);
        c0879ud.f8452c.getClass();
        c0879ud.f8453d.execute(new C0750pd(c0879ud, moduleEvent));
    }

    public static void reportExternalAttribution(int i3, String str) {
        C0879ud c0879ud = f5153a;
        c0879ud.f8451b.getClass();
        c0879ud.f8452c.getClass();
        c0879ud.f8453d.execute(new C0776qd(c0879ud, i3, str));
    }

    public static void sendEventsBuffer() {
        C0879ud c0879ud = f5153a;
        c0879ud.f8451b.getClass();
        c0879ud.f8452c.getClass();
        AppMetrica.sendEventsBuffer();
    }

    public static void setAdvIdentifiersTracking(boolean z) {
        C0879ud c0879ud = f5153a;
        c0879ud.f8451b.getClass();
        c0879ud.f8452c.getClass();
        c0879ud.f8453d.execute(new C0801rd(c0879ud, z));
    }

    public static void setProxy(C0879ud c0879ud) {
        f5153a = c0879ud;
    }

    public static void setSessionExtra(String str, byte[] bArr) {
        C0879ud c0879ud = f5153a;
        c0879ud.f8451b.f7877c.a(str);
        c0879ud.f8452c.getClass();
        c0879ud.f8453d.execute(new C0827sd(c0879ud, str, bArr));
    }

    public static void subscribeForAutoCollectedData(Context context, String str) {
        C0879ud c0879ud = f5153a;
        C0672md c0672md = c0879ud.f8451b;
        c0672md.f7876b.a(context);
        c0672md.f7878d.a(str);
        c0879ud.f8452c.f5817a.a(context.getApplicationContext());
        c0879ud.f8453d.execute(new C0853td(str));
    }

    public static void reportAdRevenue(AdRevenue adRevenue, Boolean bool) {
        C0879ud c0879ud = f5153a;
        boolean booleanValue = bool.booleanValue();
        c0879ud.f8451b.getClass();
        c0879ud.f8452c.getClass();
        c0879ud.f8453d.execute(new C0724od(c0879ud, adRevenue, booleanValue));
    }
}
