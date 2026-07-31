package io.appmetrica.analytics;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.Ad;
import io.appmetrica.analytics.impl.Ai;
import io.appmetrica.analytics.impl.Bd;
import io.appmetrica.analytics.impl.C2974t0;
import io.appmetrica.analytics.impl.C3065wd;
import io.appmetrica.analytics.impl.C3117yd;
import io.appmetrica.analytics.impl.C3143zd;
import io.appmetrica.analytics.impl.Cd;
import io.appmetrica.analytics.impl.Dd;

/* loaded from: classes3.dex */
public final class ModulesFacade {
    public static final int EXTERNAL_ATTRIBUTION_ADJUST = 2;
    public static final int EXTERNAL_ATTRIBUTION_AIRBRIDGE = 5;
    public static final int EXTERNAL_ATTRIBUTION_APPSFLYER = 1;
    public static final int EXTERNAL_ATTRIBUTION_KOCHAVA = 3;
    public static final int EXTERNAL_ATTRIBUTION_SINGULAR = 6;
    public static final int EXTERNAL_ATTRIBUTION_TENJIN = 4;

    /* renamed from: a, reason: collision with root package name */
    private static Dd f36835a = new Dd();

    @NonNull
    public static IModuleReporter getModuleReporter(@NonNull Context context, @NonNull String str) {
        Dd dd = f36835a;
        C3065wd c3065wd = dd.f37361b;
        c3065wd.f40077b.a(context);
        c3065wd.f40079d.a(str);
        dd.f37362c.f37831a.a(context.getApplicationContext().getApplicationContext());
        return Ai.f37187a.a(context.getApplicationContext(), str);
    }

    public static boolean isActivatedForApp() {
        boolean z4;
        Dd dd = f36835a;
        dd.f37361b.getClass();
        dd.f37362c.getClass();
        dd.f37360a.getClass();
        synchronized (C2974t0.class) {
            z4 = C2974t0.f39821f;
        }
        return z4;
    }

    public static void reportAdRevenue(@NonNull AdRevenue adRevenue) {
        reportAdRevenue(adRevenue, Boolean.TRUE);
    }

    public static void reportEvent(@NonNull ModuleEvent moduleEvent) {
        Dd dd = f36835a;
        dd.f37361b.f40076a.a(null);
        dd.f37362c.getClass();
        dd.f37363d.execute(new C3143zd(dd, moduleEvent));
    }

    public static void reportExternalAttribution(int i4, @NonNull String str) {
        Dd dd = f36835a;
        dd.f37361b.getClass();
        dd.f37362c.getClass();
        dd.f37363d.execute(new Ad(dd, i4, str));
    }

    public static void sendEventsBuffer() {
        Dd dd = f36835a;
        dd.f37361b.getClass();
        dd.f37362c.getClass();
        AppMetrica.sendEventsBuffer();
    }

    public static void setAdvIdentifiersTracking(boolean z4) {
        Dd dd = f36835a;
        dd.f37361b.getClass();
        dd.f37362c.getClass();
        dd.f37363d.execute(new Bd(dd, z4));
    }

    public static void setProxy(@NonNull Dd dd) {
        f36835a = dd;
    }

    public static void setSessionExtra(@NonNull String str, byte[] bArr) {
        Dd dd = f36835a;
        dd.f37361b.f40078c.a(str);
        dd.f37362c.getClass();
        dd.f37363d.execute(new Cd(dd, str, bArr));
    }

    public static void reportAdRevenue(@NonNull AdRevenue adRevenue, @NonNull Boolean bool) {
        Dd dd = f36835a;
        boolean booleanValue = bool.booleanValue();
        dd.f37361b.getClass();
        dd.f37362c.getClass();
        dd.f37363d.execute(new C3117yd(dd, adRevenue, booleanValue));
    }
}
