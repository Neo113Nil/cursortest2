package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gwd extends RuntimeException {
    public static final /* synthetic */ int a = 0;
    private static final Pattern b = Pattern.compile("[^A-Za-z0-9 $\\-_\\.\\(\\)<>\\u00a0\\u00a1-\\u1fff\\u2000-\\u200a\\u2010-\\u2027\\u202f\\u2030-\\ud7ff\\ue000-\\uffef\\u10000-\\u10ffff]+");

    public gwd(Throwable th, StackTraceElement[] stackTraceElementArr) {
        super("", th);
        setStackTrace(stackTraceElementArr);
    }

    public static hvi a(hvi hviVar, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        guq b2 = gta.b();
        hvi aK = hnu.aK(hviVar);
        hvi aQ = hnu.aQ(aK, j, timeUnit, scheduledExecutorService);
        return hso.g(aQ, TimeoutException.class, new evv(hviVar, aQ, b2, aK, 4), huf.a);
    }

    public static RuntimeException b(Thread thread) {
        gun gunVar;
        WeakHashMap weakHashMap = gta.c;
        synchronized (weakHashMap) {
            gunVar = (gun) weakHashMap.get(thread);
        }
        return new gwd(null, l(gunVar == null ? null : gunVar.c, null));
    }

    public static RuntimeException c() {
        return new gwd(null, l(gta.b(), null));
    }

    public static String d(String str) {
        return b.matcher(str).replaceAll("");
    }

    public static void e(Collection collection, StackTraceElement[] stackTraceElementArr) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            ((Throwable) it.next()).addSuppressed(new gwc(stackTraceElementArr));
        }
    }

    public static void f(her herVar) {
        gzp g;
        boolean z = gta.a;
        HashMap hashMap = new HashMap();
        WeakHashMap weakHashMap = gta.c;
        synchronized (weakHashMap) {
            for (Map.Entry entry : weakHashMap.entrySet()) {
                guq guqVar = ((gun) entry.getValue()).c;
                if (guqVar != null) {
                    hashMap.put((Thread) entry.getKey(), guqVar);
                }
            }
        }
        hfk hfkVar = new hfk();
        Iterator it = herVar.keySet().iterator();
        while (it.hasNext()) {
            hfkVar.c(((guq) it.next()).f());
        }
        hfm g2 = hfkVar.g();
        int i = Integer.MAX_VALUE;
        for (guq guqVar2 : herVar.keySet()) {
            if (guqVar2 instanceof gts) {
                gts gtsVar = (gts) guqVar2;
                if (gtsVar.b() < i) {
                    i = gtsVar.b();
                }
            }
        }
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry2 : hashMap.entrySet()) {
            Thread thread = (Thread) entry2.getKey();
            guq guqVar3 = (guq) entry2.getValue();
            if (thread != Thread.currentThread()) {
                if (g2.contains(guqVar3.f())) {
                    guq guqVar4 = guqVar3;
                    while (guqVar4 != null && (!(guqVar4 instanceof gts) || ((gts) guqVar4).b() >= i)) {
                        if (hashMap2.containsKey(guqVar4)) {
                            guqVar4 = (guq) hashMap2.get(guqVar4);
                            break;
                        } else if (herVar.containsKey(guqVar4)) {
                            break;
                        } else {
                            guqVar4 = guqVar4.a();
                        }
                    }
                    guqVar4 = null;
                    for (guq guqVar5 = guqVar3; guqVar5 != guqVar4 && !hashMap2.containsKey(guqVar5); guqVar5 = guqVar5.a()) {
                        hashMap2.put(guqVar5, guqVar4);
                    }
                    g = gzp.g(guqVar4);
                } else {
                    g = gyf.a;
                }
                if (g.f()) {
                    Throwable th = (Throwable) herVar.get(g.b());
                    dgx dgxVar = new dgx(thread, null);
                    dgxVar.addSuppressed(new gwd(null, l(guqVar3, ((guq) g.b()).a())));
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new StackTraceElement("tk_trace", d(dgxVar.getMessage()), null, 0));
                    Collections.addAll(arrayList, dgxVar.getStackTrace());
                    arrayList.toArray(new StackTraceElement[0]);
                    th.addSuppressed(dgxVar);
                }
            }
        }
    }

    public static void g(guq guqVar, Throwable th) {
        if (hoq.az(guqVar)) {
            f(her.j(guqVar, th));
        }
    }

    public static void h(her herVar) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hjr it = herVar.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            guq guqVar = (guq) entry.getKey();
            if (guqVar instanceof gts) {
                gvy gvyVar = (gvy) hashMap.get(((guq) entry.getKey()).f());
                if (gvyVar == null) {
                    gvyVar = ((gts) guqVar).a.b().c;
                    hashMap.put(guqVar.f(), gvyVar);
                }
                Map map = (Map) hashMap2.get(gvyVar);
                if (map == null) {
                    map = new HashMap();
                    hashMap2.put(gvyVar, map);
                }
                map.put(Integer.valueOf(((gts) guqVar).b()), (Throwable) entry.getValue());
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            gvy gvyVar2 = (gvy) entry2.getKey();
            int intValue = ((Integer) Collections.min(((Map) entry2.getValue()).keySet())).intValue();
            HashMap hashMap3 = new HashMap();
            ArrayList arrayList = new ArrayList();
            Iterator it2 = gvyVar2.e.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if ((((gtx) it2.next()).b & 32) == 0) {
                        break;
                    }
                } else {
                    arrayList.add(new StackTraceElement("tk_trace", "No unfinished spans when the app crashed:", null, 0));
                    break;
                }
            }
            gsk gskVar = gvyVar2.i;
            if (gskVar == null) {
                gskVar = gsk.a;
            }
            if ((gskVar.b & 1) != 0) {
                Locale locale = Locale.US;
                String str = ((gtx) gvyVar2.e.get(0)).c;
                gsk gskVar2 = gvyVar2.i;
                if (gskVar2 == null) {
                    gskVar2 = gsk.a;
                }
                gsj gsjVar = gskVar2.c;
                if (gsjVar == null) {
                    gsjVar = gsj.a;
                }
                arrayList.add(new StackTraceElement("tk_trace", d(String.format(locale, "Trace %s tried to log too many spans. %s spans dropped", str, Integer.valueOf(gsjVar.c))), null, 0));
            }
            if (arrayList.isEmpty()) {
                j(gvyVar2, (Map) entry2.getValue(), intValue, hashMap3);
            } else {
                e(((Map) entry2.getValue()).values(), (StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
            }
        }
    }

    public static void i(guq guqVar, Throwable th) {
        if (hoq.az(guqVar)) {
            h(her.j(guqVar, th));
        }
    }

    public static void j(gvy gvyVar, Map map, int i, Map map2) {
        int i2;
        int i3 = 0;
        for (gtx gtxVar : hnu.F(gvyVar.e)) {
            Integer num = null;
            if (i3 >= 10) {
                e(map.values(), new StackTraceElement[]{new StackTraceElement("tk_trace", "Suppressed exceptions exceeds the limit 10, additional unfinished spans will not be reported", null, 0)});
                return;
            }
            if ((gtxVar.b & 32) == 0 && !map2.containsKey(gtxVar)) {
                jkx jkxVar = gvyVar.e;
                Set keySet = map.keySet();
                boolean z = false;
                gtx gtxVar2 = gtxVar;
                while (!z) {
                    if (map2.containsKey(gtxVar2)) {
                        num = (Integer) map2.get(gtxVar2);
                    } else if (keySet.contains(Integer.valueOf(gtxVar2.d))) {
                        num = Integer.valueOf(gtxVar2.d);
                    } else {
                        int i4 = gtxVar2.e;
                        if (i4 >= i) {
                            gtxVar2 = (gtx) jkxVar.get(i4);
                        }
                    }
                    z = true;
                }
                boolean z2 = false;
                gtx gtxVar3 = gtxVar;
                while (!z2) {
                    if (!map2.containsKey(gtxVar3)) {
                        map2.put(gtxVar3, num);
                        if ((num == null || gtxVar3.e != num.intValue()) && (i2 = gtxVar3.e) >= 0) {
                            gtxVar3 = (gtx) jkxVar.get(i2);
                        }
                    }
                    z2 = true;
                }
                gzp g = gzp.g(num);
                if (g.f()) {
                    i3++;
                    Throwable th = (Throwable) map.get(g.b());
                    jkx jkxVar2 = gvyVar.e;
                    int intValue = ((Integer) g.b()).intValue();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(m(gtxVar));
                    while (gtxVar.d != intValue) {
                        gtxVar = (gtx) jkxVar2.get(gtxVar.e);
                        arrayList.add(m(gtxVar));
                    }
                    th.addSuppressed(new gwc((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0])));
                }
            }
        }
    }

    public static void k(Throwable th) {
        gsv.b(th);
        throw new gwd(th, l(gta.b(), null));
    }

    public static StackTraceElement[] l(guq guqVar, guq guqVar2) {
        ArrayList arrayList = new ArrayList();
        for (guq guqVar3 = guqVar; guqVar3 != guqVar2; guqVar3 = guqVar3.a()) {
            arrayList.add(new StackTraceElement("tk_trace", d(guqVar3.c()), null, 0));
        }
        if (guqVar instanceof gsr) {
            arrayList.add(new StackTraceElement("tk_trace", "Missing root trace", null, 0));
        }
        return (StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]);
    }

    private static StackTraceElement m(gtx gtxVar) {
        String str;
        if ((gtxVar.b & 32) != 0) {
            str = " " + gtxVar.h + " ms";
        } else {
            str = "(unfinished)";
        }
        return new StackTraceElement("tk_trace", d(String.valueOf(gtxVar.c).concat(str)), null, 0);
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return this;
    }
}
