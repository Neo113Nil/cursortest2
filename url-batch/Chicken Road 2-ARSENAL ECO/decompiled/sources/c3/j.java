package c3;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import l5.AbstractC0506j;
import o5.C0571k;
import p5.EnumC0580a;
import q5.AbstractC0607c;
import u0.AbstractC0676f;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public final a6.d f3790a;

    /* renamed from: b, reason: collision with root package name */
    public final V5.g f3791b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f3792c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public N4.d f3793d;

    public j(a6.d dVar, V5.g gVar) {
        this.f3790a = dVar;
        this.f3791b = gVar;
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
    public static Object a(j jVar, AbstractC0607c abstractC0607c) {
        g gVar;
        int i7;
        if (abstractC0607c instanceof g) {
            gVar = (g) abstractC0607c;
            int i8 = gVar.f3781h;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                gVar.f3781h = i8 - Integer.MIN_VALUE;
                Object obj = gVar.f3779f;
                Object obj2 = EnumC0580a.f5697f;
                i7 = gVar.f3781h;
                if (i7 != 0) {
                    AbstractC0676f.w(obj);
                    gVar.f3781h = 1;
                    obj = jVar.c(gVar);
                } else {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC0676f.w(obj);
                        return obj;
                    }
                    AbstractC0676f.w(obj);
                }
                R4.n nVar = ((N4.d) obj).f1760i.f1753f;
                gVar.f3781h = 2;
                C0571k c0571k = new C0571k(AbstractC0676f.m(gVar));
                O4.c c7 = nVar.f2128f.f2110d.c();
                c7.c(10L, TimeUnit.SECONDS);
                c0571k.resumeWith(c7);
                Object a7 = c0571k.a();
                return a7 != obj2 ? obj2 : a7;
            }
        }
        gVar = new g(jVar, abstractC0607c);
        Object obj3 = gVar.f3779f;
        Object obj22 = EnumC0580a.f5697f;
        i7 = gVar.f3781h;
        if (i7 != 0) {
        }
        R4.n nVar2 = ((N4.d) obj3).f1760i.f1753f;
        gVar.f3781h = 2;
        C0571k c0571k2 = new C0571k(AbstractC0676f.m(gVar));
        O4.c c72 = nVar2.f2128f.f2110d.c();
        c72.c(10L, TimeUnit.SECONDS);
        c0571k2.resumeWith(c72);
        Object a72 = c0571k2.a();
        if (a72 != obj22) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00e4 A[LOOP:0: B:14:0x00de->B:16:0x00e4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object b(j jVar, AbstractC0607c abstractC0607c) {
        h hVar;
        int i7;
        List enabledFeatureFlags;
        if (abstractC0607c instanceof h) {
            hVar = (h) abstractC0607c;
            int i8 = hVar.f3785i;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                hVar.f3785i = i8 - Integer.MIN_VALUE;
                Object obj = hVar.f3783g;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                i7 = hVar.f3785i;
                if (i7 != 0) {
                    AbstractC0676f.w(obj);
                    hVar.f3782f = jVar;
                    hVar.f3785i = 1;
                    obj = jVar.c(hVar);
                    if (obj == enumC0580a) {
                        return enumC0580a;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jVar = hVar.f3782f;
                    AbstractC0676f.w(obj);
                }
                b4.e a7 = ((N4.d) obj).f1760i.f1753f.a("loggerBuilder").build().a();
                V5.g gVar = jVar.f3791b;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                UUID randomUUID = UUID.randomUUID();
                kotlin.jvm.internal.i.d(randomUUID, "randomUUID(...)");
                String uuid = randomUUID.toString();
                kotlin.jvm.internal.i.d(uuid, "toString(...)");
                linkedHashMap.put("log.record.uid", uuid);
                f fVar = (f) gVar.f2734g;
                A3.c.U(linkedHashMap, "ossdk.app_id", fVar.getAppId());
                A3.c.U(linkedHashMap, "ossdk.onesignal_id", fVar.getOnesignalId());
                A3.c.U(linkedHashMap, "ossdk.push_subscription_id", fVar.getPushSubscriptionId());
                linkedHashMap.put("app.state", fVar.getAppState());
                linkedHashMap.put("process.uptime", String.valueOf(fVar.getProcessUptime()));
                linkedHashMap.put("thread.name", fVar.getCurrentThreadName());
                enabledFeatureFlags = fVar.getEnabledFeatureFlags();
                if (!enabledFeatureFlags.isEmpty()) {
                    linkedHashMap.put("ossdk.feature_flags", AbstractC0506j.I(AbstractC0506j.N(enabledFeatureFlags), ",", null, null, null, 62));
                }
                Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
                kotlin.jvm.internal.i.d(unmodifiableMap, "unmodifiableMap(...)");
                for (Map.Entry entry : unmodifiableMap.entrySet()) {
                    String str = (String) entry.getKey();
                    a7.d(a4.e.a(V3.b.f2707f, str), (String) entry.getValue());
                }
                return a7;
            }
        }
        hVar = new h(jVar, abstractC0607c);
        Object obj2 = hVar.f3783g;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = hVar.f3785i;
        if (i7 != 0) {
        }
        b4.e a72 = ((N4.d) obj2).f1760i.f1753f.a("loggerBuilder").build().a();
        V5.g gVar2 = jVar.f3791b;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        UUID randomUUID2 = UUID.randomUUID();
        kotlin.jvm.internal.i.d(randomUUID2, "randomUUID(...)");
        String uuid2 = randomUUID2.toString();
        kotlin.jvm.internal.i.d(uuid2, "toString(...)");
        linkedHashMap2.put("log.record.uid", uuid2);
        f fVar2 = (f) gVar2.f2734g;
        A3.c.U(linkedHashMap2, "ossdk.app_id", fVar2.getAppId());
        A3.c.U(linkedHashMap2, "ossdk.onesignal_id", fVar2.getOnesignalId());
        A3.c.U(linkedHashMap2, "ossdk.push_subscription_id", fVar2.getPushSubscriptionId());
        linkedHashMap2.put("app.state", fVar2.getAppState());
        linkedHashMap2.put("process.uptime", String.valueOf(fVar2.getProcessUptime()));
        linkedHashMap2.put("thread.name", fVar2.getCurrentThreadName());
        enabledFeatureFlags = fVar2.getEnabledFeatureFlags();
        if (!enabledFeatureFlags.isEmpty()) {
        }
        Map unmodifiableMap2 = Collections.unmodifiableMap(linkedHashMap2);
        kotlin.jvm.internal.i.d(unmodifiableMap2, "unmodifiableMap(...)");
        while (r8.hasNext()) {
        }
        return a72;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0047 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(AbstractC0607c abstractC0607c) {
        i iVar;
        int i7;
        j jVar;
        if (abstractC0607c instanceof i) {
            iVar = (i) abstractC0607c;
            int i8 = iVar.f3789i;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                iVar.f3789i = i8 - Integer.MIN_VALUE;
                Object obj = iVar.f3787g;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                i7 = iVar.f3789i;
                if (i7 != 0) {
                    AbstractC0676f.w(obj);
                    a6.d dVar = this.f3790a;
                    iVar.f3786f = this;
                    iVar.f3789i = 1;
                    obj = dVar.e(iVar);
                    if (obj == enumC0580a) {
                        return enumC0580a;
                    }
                    jVar = this;
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jVar = iVar.f3786f;
                    AbstractC0676f.w(obj);
                }
                Map map = (Map) obj;
                synchronized (jVar.f3792c) {
                    N4.d dVar2 = jVar.f3793d;
                    if (dVar2 != null) {
                        return dVar2;
                    }
                    N4.d d7 = jVar.d(map);
                    jVar.f3793d = d7;
                    return d7;
                }
            }
        }
        iVar = new i(this, abstractC0607c);
        Object obj2 = iVar.f3787g;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = iVar.f3789i;
        if (i7 != 0) {
        }
        Map map2 = (Map) obj2;
        synchronized (jVar.f3792c) {
        }
    }

    public abstract N4.d d(Map map);
}
