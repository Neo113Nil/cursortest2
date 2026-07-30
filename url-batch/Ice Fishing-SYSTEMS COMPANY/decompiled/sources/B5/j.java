package B5;

import g1.C4523c;
import g1.C4524d;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import r7.AbstractC4979j;
import v7.C5140k;
import w7.EnumC5179a;
import x7.AbstractC5219c;

/* loaded from: classes2.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public final C4524d f346a;

    /* renamed from: b, reason: collision with root package name */
    public final C4523c f347b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f348c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public T6.d f349d;

    public j(C4524d c4524d, C4523c c4523c) {
        this.f346a = c4524d;
        this.f347b = c4523c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003f, code lost:
    
        if (r6 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object a(j jVar, AbstractC5219c abstractC5219c) {
        g gVar;
        int i;
        if (abstractC5219c instanceof g) {
            gVar = (g) abstractC5219c;
            int i4 = gVar.f337v;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                gVar.f337v = i4 - Integer.MIN_VALUE;
                Object obj = gVar.f335n;
                Object obj2 = EnumC5179a.f41704n;
                i = gVar.f337v;
                if (i != 0) {
                    com.bumptech.glide.f.r(obj);
                    gVar.f337v = 1;
                    obj = jVar.c(gVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.bumptech.glide.f.r(obj);
                        return obj;
                    }
                    com.bumptech.glide.f.r(obj);
                }
                X6.n nVar = ((T6.d) obj).f3124w.f3117n;
                gVar.f337v = 2;
                C5140k c5140k = new C5140k(w8.a.f(gVar));
                U6.c M8 = nVar.f3872n.f3854d.M();
                M8.c(10L, TimeUnit.SECONDS);
                c5140k.resumeWith(M8);
                Object a9 = c5140k.a();
                return a9 != obj2 ? obj2 : a9;
            }
        }
        gVar = new g(jVar, abstractC5219c);
        Object obj3 = gVar.f335n;
        Object obj22 = EnumC5179a.f41704n;
        i = gVar.f337v;
        if (i != 0) {
        }
        X6.n nVar2 = ((T6.d) obj3).f3124w.f3117n;
        gVar.f337v = 2;
        C5140k c5140k2 = new C5140k(w8.a.f(gVar));
        U6.c M82 = nVar2.f3872n.f3854d.M();
        M82.c(10L, TimeUnit.SECONDS);
        c5140k2.resumeWith(M82);
        Object a92 = c5140k2.a();
        if (a92 != obj22) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00e4 A[LOOP:0: B:14:0x00de->B:16:0x00e4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object b(j jVar, AbstractC5219c abstractC5219c) {
        h hVar;
        int i;
        List enabledFeatureFlags;
        if (abstractC5219c instanceof h) {
            hVar = (h) abstractC5219c;
            int i4 = hVar.f341w;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                hVar.f341w = i4 - Integer.MIN_VALUE;
                Object obj = hVar.f339u;
                EnumC5179a enumC5179a = EnumC5179a.f41704n;
                i = hVar.f341w;
                if (i != 0) {
                    com.bumptech.glide.f.r(obj);
                    hVar.f338n = jVar;
                    hVar.f341w = 1;
                    obj = jVar.c(hVar);
                    if (obj == enumC5179a) {
                        return enumC5179a;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jVar = hVar.f338n;
                    com.bumptech.glide.f.r(obj);
                }
                h6.e a9 = ((T6.d) obj).f3124w.f3117n.a("loggerBuilder").build().a();
                C4523c c4523c = jVar.f347b;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                UUID randomUUID = UUID.randomUUID();
                kotlin.jvm.internal.h.d(randomUUID, "randomUUID(...)");
                String uuid = randomUUID.toString();
                kotlin.jvm.internal.h.d(uuid, "toString(...)");
                linkedHashMap.put("log.record.uid", uuid);
                f fVar = (f) c4523c.f37856u;
                Z5.c.m(linkedHashMap, "ossdk.app_id", fVar.getAppId());
                Z5.c.m(linkedHashMap, "ossdk.onesignal_id", fVar.getOnesignalId());
                Z5.c.m(linkedHashMap, "ossdk.push_subscription_id", fVar.getPushSubscriptionId());
                linkedHashMap.put("app.state", fVar.getAppState());
                linkedHashMap.put("process.uptime", String.valueOf(fVar.getProcessUptime()));
                linkedHashMap.put("thread.name", fVar.getCurrentThreadName());
                enabledFeatureFlags = fVar.getEnabledFeatureFlags();
                if (!enabledFeatureFlags.isEmpty()) {
                    linkedHashMap.put("ossdk.feature_flags", AbstractC4979j.K(AbstractC4979j.P(enabledFeatureFlags), ",", null, null, null, 62));
                }
                Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
                kotlin.jvm.internal.h.d(unmodifiableMap, "unmodifiableMap(...)");
                for (Map.Entry entry : unmodifiableMap.entrySet()) {
                    String str = (String) entry.getKey();
                    a9.e(g6.e.a(b6.b.f5560n, str), (String) entry.getValue());
                }
                return a9;
            }
        }
        hVar = new h(jVar, abstractC5219c);
        Object obj2 = hVar.f339u;
        EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
        i = hVar.f341w;
        if (i != 0) {
        }
        h6.e a92 = ((T6.d) obj2).f3124w.f3117n.a("loggerBuilder").build().a();
        C4523c c4523c2 = jVar.f347b;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        UUID randomUUID2 = UUID.randomUUID();
        kotlin.jvm.internal.h.d(randomUUID2, "randomUUID(...)");
        String uuid2 = randomUUID2.toString();
        kotlin.jvm.internal.h.d(uuid2, "toString(...)");
        linkedHashMap2.put("log.record.uid", uuid2);
        f fVar2 = (f) c4523c2.f37856u;
        Z5.c.m(linkedHashMap2, "ossdk.app_id", fVar2.getAppId());
        Z5.c.m(linkedHashMap2, "ossdk.onesignal_id", fVar2.getOnesignalId());
        Z5.c.m(linkedHashMap2, "ossdk.push_subscription_id", fVar2.getPushSubscriptionId());
        linkedHashMap2.put("app.state", fVar2.getAppState());
        linkedHashMap2.put("process.uptime", String.valueOf(fVar2.getProcessUptime()));
        linkedHashMap2.put("thread.name", fVar2.getCurrentThreadName());
        enabledFeatureFlags = fVar2.getEnabledFeatureFlags();
        if (!enabledFeatureFlags.isEmpty()) {
        }
        Map unmodifiableMap2 = Collections.unmodifiableMap(linkedHashMap2);
        kotlin.jvm.internal.h.d(unmodifiableMap2, "unmodifiableMap(...)");
        while (r8.hasNext()) {
        }
        return a92;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0047 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(AbstractC5219c abstractC5219c) {
        i iVar;
        int i;
        j jVar;
        if (abstractC5219c instanceof i) {
            iVar = (i) abstractC5219c;
            int i4 = iVar.f345w;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                iVar.f345w = i4 - Integer.MIN_VALUE;
                Object obj = iVar.f343u;
                EnumC5179a enumC5179a = EnumC5179a.f41704n;
                i = iVar.f345w;
                if (i != 0) {
                    com.bumptech.glide.f.r(obj);
                    C4524d c4524d = this.f346a;
                    iVar.f342n = this;
                    iVar.f345w = 1;
                    obj = c4524d.F(iVar);
                    if (obj == enumC5179a) {
                        return enumC5179a;
                    }
                    jVar = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jVar = iVar.f342n;
                    com.bumptech.glide.f.r(obj);
                }
                Map map = (Map) obj;
                synchronized (jVar.f348c) {
                    T6.d dVar = jVar.f349d;
                    if (dVar != null) {
                        return dVar;
                    }
                    T6.d d2 = jVar.d(map);
                    jVar.f349d = d2;
                    return d2;
                }
            }
        }
        iVar = new i(this, abstractC5219c);
        Object obj2 = iVar.f343u;
        EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
        i = iVar.f345w;
        if (i != 0) {
        }
        Map map2 = (Map) obj2;
        synchronized (jVar.f348c) {
        }
    }

    public abstract T6.d d(Map map);
}
