package defpackage;

import java.util.ArrayList;
import java.util.UUID;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gsv {
    public static boolean a = true;
    private static final WeakHashMap b = new WeakHashMap();
    private static final WeakHashMap c = new WeakHashMap();

    public static void a() {
        a = false;
    }

    public static void b(Throwable th) {
        WeakHashMap weakHashMap = c;
        synchronized (weakHashMap) {
            weakHashMap.put(th, true);
        }
    }

    public static void c(Throwable th) {
        Throwable th2;
        guq b2;
        if (a) {
            WeakHashMap weakHashMap = c;
            synchronized (weakHashMap) {
                th2 = th;
                while (th2 != null) {
                    try {
                        if (weakHashMap.containsKey(th2)) {
                            break;
                        } else {
                            th2 = th2.getCause();
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                weakHashMap.put(th, Boolean.valueOf(th2 != null));
            }
            if (th2 == null && d(th) == null && (b2 = gta.b()) != null) {
                ArrayList arrayList = new ArrayList();
                for (b2 = gta.b(); b2 != null; b2 = b2.a()) {
                    arrayList.add(b2);
                }
                UUID f = ((guq) arrayList.get(0)).f();
                if (f == null) {
                    throw new NullPointerException("Null rootTraceId");
                }
                long l = ((guq) arrayList.get(0)).l();
                heg d = hel.d(arrayList.size());
                heg d2 = hel.d(arrayList.size());
                for (guq guqVar : hnu.F(arrayList)) {
                    d2.h(guqVar.c());
                    d.h(guqVar.j());
                }
                WeakHashMap weakHashMap2 = b;
                synchronized (weakHashMap2) {
                    hel g = d2.g();
                    if (g == null) {
                        throw new NullPointerException("Null spansNames");
                    }
                    hel g2 = d.g();
                    if (g2 == null) {
                        throw new NullPointerException("Null extras");
                    }
                    weakHashMap2.put(th, new gvi(g, g2, f, l));
                }
            }
        }
    }

    public static brn d(Throwable th) {
        hoq.I(a, "Trace uncaught exception is disabled.");
        WeakHashMap weakHashMap = b;
        synchronized (weakHashMap) {
            Throwable th2 = th;
            while (th2 != null) {
                try {
                    if (weakHashMap.containsKey(th2)) {
                        break;
                    }
                    th2 = th2.getCause();
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            if (th2 == null) {
                return null;
            }
            gvi gviVar = (gvi) weakHashMap.get(th2);
            weakHashMap.put(th, gviVar);
            return new brn(gviVar, (byte[]) null);
        }
    }
}
