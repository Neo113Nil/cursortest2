package com.facebook.ads.internal.o;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static Map<String, Long> f5259a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    private static Map<String, Long> f5260b = new ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    private static Map<String, String> f5261c = new ConcurrentHashMap();

    private static long a(String str, com.facebook.ads.internal.protocol.c cVar) {
        if (f5259a.containsKey(str)) {
            return f5259a.get(str).longValue();
        }
        switch (cVar) {
            case BANNER:
                return 15000L;
            case INTERSTITIAL:
            case NATIVE:
            default:
                return -1000L;
        }
    }

    public static void a(long j, b bVar) {
        f5259a.put(d(bVar), Long.valueOf(j));
    }

    public static void a(String str, b bVar) {
        f5261c.put(d(bVar), str);
    }

    public static boolean a(b bVar) {
        String d2 = d(bVar);
        if (f5260b.containsKey(d2)) {
            return System.currentTimeMillis() - f5260b.get(d2).longValue() < a(d2, bVar.b());
        }
        return false;
    }

    public static void b(b bVar) {
        f5260b.put(d(bVar), Long.valueOf(System.currentTimeMillis()));
    }

    public static String c(b bVar) {
        return f5261c.get(d(bVar));
    }

    private static String d(b bVar) {
        Object[] objArr = new Object[6];
        objArr[0] = bVar.a();
        objArr[1] = bVar.b();
        objArr[2] = bVar.f5265c;
        objArr[3] = Integer.valueOf(bVar.c() == null ? 0 : bVar.c().a());
        objArr[4] = Integer.valueOf(bVar.c() != null ? bVar.c().b() : 0);
        objArr[5] = Integer.valueOf(bVar.d());
        return String.format("%s:%s:%s:%d:%d:%d", objArr);
    }
}
