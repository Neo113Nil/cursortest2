package com.ironsource.b.h;

import android.content.Context;
import android.text.TextUtils;
import com.aiming.mdt.utils.Constants;
import com.ironsource.b.e.k;
import com.ironsource.b.e.l;
import com.ironsource.b.e.m;
import java.util.Calendar;
import java.util.TimeZone;

/* compiled from: CappingManager.java */
/* loaded from: classes2.dex */
public class a {

    /* compiled from: CappingManager.java */
    /* renamed from: com.ironsource.b.h.a$a, reason: collision with other inner class name */
    public enum EnumC0373a {
        CAPPED_PER_DELIVERY,
        CAPPED_PER_COUNT,
        CAPPED_PER_PACE,
        NOT_CAPPED
    }

    public static synchronized void a(Context context, com.ironsource.b.e.h hVar) {
        synchronized (a.class) {
            if (context == null || hVar == null) {
                return;
            }
            l c2 = hVar.c();
            if (c2 == null) {
                return;
            }
            a(context, Constants.ADTYPE_INTERSTITIAL, hVar.b(), c2);
        }
    }

    public static synchronized void a(Context context, k kVar) {
        synchronized (a.class) {
            if (context == null || kVar == null) {
                return;
            }
            l e = kVar.e();
            if (e == null) {
                return;
            }
            a(context, "Rewarded Video", kVar.b(), e);
        }
    }

    public static synchronized void a(Context context, com.ironsource.b.e.e eVar) {
        synchronized (a.class) {
            if (context == null || eVar == null) {
                return;
            }
            l c2 = eVar.c();
            if (c2 == null) {
                return;
            }
            a(context, Constants.ADTYPE_BANNER, eVar.b(), c2);
        }
    }

    public static synchronized EnumC0373a b(Context context, com.ironsource.b.e.h hVar) {
        synchronized (a.class) {
            if (context != null && hVar != null) {
                if (hVar.c() != null) {
                    return a(context, Constants.ADTYPE_INTERSTITIAL, hVar.b());
                }
            }
            return EnumC0373a.NOT_CAPPED;
        }
    }

    public static synchronized EnumC0373a b(Context context, k kVar) {
        synchronized (a.class) {
            if (context != null && kVar != null) {
                if (kVar.e() != null) {
                    return a(context, "Rewarded Video", kVar.b());
                }
            }
            return EnumC0373a.NOT_CAPPED;
        }
    }

    public static synchronized void c(Context context, com.ironsource.b.e.h hVar) {
        synchronized (a.class) {
            if (hVar != null) {
                b(context, Constants.ADTYPE_INTERSTITIAL, hVar.b());
            }
        }
    }

    public static synchronized void c(Context context, k kVar) {
        synchronized (a.class) {
            if (kVar != null) {
                b(context, "Rewarded Video", kVar.b());
            }
        }
    }

    public static synchronized void a(Context context, String str) {
        synchronized (a.class) {
            if (!TextUtils.isEmpty(str)) {
                b(context, Constants.ADTYPE_BANNER, str);
            }
        }
    }

    private static String a(String str, String str2, String str3) {
        return str + "_" + str2 + "_" + str3;
    }

    private static EnumC0373a a(Context context, String str, String str2) {
        long currentTimeMillis = System.currentTimeMillis();
        if (!g.b(context, a(str, "CappingManager.IS_DELIVERY_ENABLED", str2), true)) {
            return EnumC0373a.CAPPED_PER_DELIVERY;
        }
        if (g.b(context, a(str, "CappingManager.IS_PACING_ENABLED", str2), false)) {
            if (currentTimeMillis - g.b(context, a(str, "CappingManager.TIME_OF_THE_PREVIOUS_SHOW", str2), 0L) < g.b(context, a(str, "CappingManager.SECONDS_BETWEEN_SHOWS", str2), 0) * 1000) {
                return EnumC0373a.CAPPED_PER_PACE;
            }
        }
        if (g.b(context, a(str, "CappingManager.IS_CAPPING_ENABLED", str2), false)) {
            int b2 = g.b(context, a(str, "CappingManager.MAX_NUMBER_OF_SHOWS", str2), 0);
            String a2 = a(str, "CappingManager.CURRENT_NUMBER_OF_SHOWS", str2);
            int b3 = g.b(context, a2, 0);
            String a3 = a(str, "CappingManager.CAPPING_TIME_THRESHOLD", str2);
            if (currentTimeMillis >= g.b(context, a3, 0L)) {
                g.a(context, a2, 0);
                g.a(context, a3, 0L);
            } else if (b3 >= b2) {
                return EnumC0373a.CAPPED_PER_COUNT;
            }
        }
        return EnumC0373a.NOT_CAPPED;
    }

    private static void b(Context context, String str, String str2) {
        int i = 0;
        if (g.b(context, a(str, "CappingManager.IS_PACING_ENABLED", str2), false)) {
            g.a(context, a(str, "CappingManager.TIME_OF_THE_PREVIOUS_SHOW", str2), System.currentTimeMillis());
        }
        if (g.b(context, a(str, "CappingManager.IS_CAPPING_ENABLED", str2), false)) {
            g.b(context, a(str, "CappingManager.MAX_NUMBER_OF_SHOWS", str2), 0);
            String a2 = a(str, "CappingManager.CURRENT_NUMBER_OF_SHOWS", str2);
            int b2 = g.b(context, a2, 0);
            if (b2 == 0) {
                String f = g.f(context, a(str, "CappingManager.CAPPING_TYPE", str2), m.PER_DAY.toString());
                m mVar = null;
                m[] values = m.values();
                int length = values.length;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    m mVar2 = values[i];
                    if (mVar2.f6818c.equals(f)) {
                        mVar = mVar2;
                        break;
                    }
                    i++;
                }
                g.a(context, a(str, "CappingManager.CAPPING_TIME_THRESHOLD", str2), a(mVar));
            }
            g.a(context, a2, b2 + 1);
        }
    }

    private static long a(m mVar) {
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        switch (mVar) {
            case PER_DAY:
                calendar.set(14, 0);
                calendar.set(13, 0);
                calendar.set(12, 0);
                calendar.set(11, 0);
                calendar.add(6, 1);
                break;
            case PER_HOUR:
                calendar.set(14, 0);
                calendar.set(13, 0);
                calendar.set(12, 0);
                calendar.add(11, 1);
                break;
        }
        return calendar.getTimeInMillis();
    }

    private static void a(Context context, String str, String str2, l lVar) {
        boolean a2 = lVar.a();
        g.a(context, a(str, "CappingManager.IS_DELIVERY_ENABLED", str2), a2);
        if (a2) {
            boolean b2 = lVar.b();
            g.a(context, a(str, "CappingManager.IS_CAPPING_ENABLED", str2), b2);
            if (b2) {
                g.a(context, a(str, "CappingManager.MAX_NUMBER_OF_SHOWS", str2), lVar.e());
                g.e(context, a(str, "CappingManager.CAPPING_TYPE", str2), lVar.d().toString());
            }
            boolean c2 = lVar.c();
            g.a(context, a(str, "CappingManager.IS_PACING_ENABLED", str2), c2);
            if (c2) {
                g.a(context, a(str, "CappingManager.SECONDS_BETWEEN_SHOWS", str2), lVar.f());
            }
        }
    }
}
