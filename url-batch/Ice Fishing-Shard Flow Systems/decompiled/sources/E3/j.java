package E3;

import a.AbstractC0169a;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import v5.C0977c;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public final B.f f683a;

    /* renamed from: b, reason: collision with root package name */
    public final l2.c f684b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f685c;

    /* renamed from: d, reason: collision with root package name */
    public u5.d f686d;

    public j(B.f osTopLevelFields, l2.c osPerEventFields) {
        Intrinsics.checkNotNullParameter(osTopLevelFields, "osTopLevelFields");
        Intrinsics.checkNotNullParameter(osPerEventFields, "osPerEventFields");
        this.f683a = osTopLevelFields;
        this.f684b = osPerEventFields;
        this.f685c = new Object();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x003f, code lost:
    
        if (r6 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0075 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object a(j jVar, X5.c cVar) {
        g frame;
        Object obj;
        int i2;
        Object a7;
        if (cVar instanceof g) {
            frame = (g) cVar;
            int i5 = frame.f674i;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                frame.f674i = i5 - Integer.MIN_VALUE;
                Object obj2 = frame.f672d;
                obj = W5.a.f2787d;
                i2 = frame.f674i;
                if (i2 != 0) {
                    V6.b.P(obj2);
                    frame.f674i = 1;
                    obj2 = jVar.c(frame);
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        V6.b.P(obj2);
                        return obj2;
                    }
                    V6.b.P(obj2);
                }
                y5.m mVar = ((u5.d) obj2).f8078l.f8071d;
                frame.f674i = 2;
                V5.e eVar = new V5.e(W5.d.b(frame));
                R5.l lVar = R5.n.f2421d;
                C0977c c7 = mVar.f8697d.f8681d.c();
                c7.c(10L, TimeUnit.SECONDS);
                eVar.resumeWith(c7);
                a7 = eVar.a();
                if (a7 == obj) {
                    Intrinsics.checkNotNullParameter(frame, "frame");
                }
                return a7 != obj ? obj : a7;
            }
        }
        frame = new g(jVar, cVar);
        Object obj22 = frame.f672d;
        obj = W5.a.f2787d;
        i2 = frame.f674i;
        if (i2 != 0) {
        }
        y5.m mVar2 = ((u5.d) obj22).f8078l.f8071d;
        frame.f674i = 2;
        V5.e eVar2 = new V5.e(W5.d.b(frame));
        R5.l lVar2 = R5.n.f2421d;
        C0977c c72 = mVar2.f8697d.f8681d.c();
        c72.c(10L, TimeUnit.SECONDS);
        eVar2.resumeWith(c72);
        a7 = eVar2.a();
        if (a7 == obj) {
        }
        if (a7 != obj) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00f3 A[LOOP:0: B:14:0x00ed->B:16:0x00f3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object b(j jVar, X5.c cVar) {
        h hVar;
        int i2;
        List enabledFeatureFlags;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i5 = hVar.f678l;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                hVar.f678l = i5 - Integer.MIN_VALUE;
                Object obj = hVar.f676e;
                W5.a aVar = W5.a.f2787d;
                i2 = hVar.f678l;
                if (i2 != 0) {
                    V6.b.P(obj);
                    hVar.f675d = jVar;
                    hVar.f678l = 1;
                    obj = jVar.c(hVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jVar = hVar.f675d;
                    V6.b.P(obj);
                }
                I4.e a7 = ((u5.d) obj).f8078l.f8071d.a("loggerBuilder").build().a();
                Intrinsics.checkNotNullExpressionValue(a7, "logRecordBuilder(...)");
                l2.c cVar2 = jVar.f684b;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                UUID randomUUID = UUID.randomUUID();
                Intrinsics.checkNotNullExpressionValue(randomUUID, "randomUUID(...)");
                String uuid = randomUUID.toString();
                Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
                linkedHashMap.put("log.record.uid", uuid);
                f fVar = (f) cVar2.f6269d;
                AbstractC0169a.w(linkedHashMap, "ossdk.app_id", fVar.getAppId());
                AbstractC0169a.w(linkedHashMap, "ossdk.onesignal_id", fVar.getOnesignalId());
                AbstractC0169a.w(linkedHashMap, "ossdk.push_subscription_id", fVar.getPushSubscriptionId());
                linkedHashMap.put("app.state", fVar.getAppState());
                linkedHashMap.put("process.uptime", String.valueOf(fVar.getProcessUptime()));
                linkedHashMap.put("thread.name", fVar.getCurrentThreadName());
                enabledFeatureFlags = fVar.getEnabledFeatureFlags();
                if (!enabledFeatureFlags.isEmpty()) {
                    linkedHashMap.put("ossdk.feature_flags", CollectionsKt.s(CollectionsKt.w(enabledFeatureFlags), ",", null, null, null, 62));
                }
                Map attributes = Collections.unmodifiableMap(linkedHashMap);
                Intrinsics.checkNotNullExpressionValue(attributes, "unmodifiableMap(...)");
                Intrinsics.checkNotNullParameter(a7, "<this>");
                Intrinsics.checkNotNullParameter(attributes, "attributes");
                for (Map.Entry entry : attributes.entrySet()) {
                    String str = (String) entry.getKey();
                    a7.f(H4.e.a(C4.e.f301d, str), (String) entry.getValue());
                }
                return a7;
            }
        }
        hVar = new h(jVar, cVar);
        Object obj2 = hVar.f676e;
        W5.a aVar2 = W5.a.f2787d;
        i2 = hVar.f678l;
        if (i2 != 0) {
        }
        I4.e a72 = ((u5.d) obj2).f8078l.f8071d.a("loggerBuilder").build().a();
        Intrinsics.checkNotNullExpressionValue(a72, "logRecordBuilder(...)");
        l2.c cVar22 = jVar.f684b;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        UUID randomUUID2 = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(randomUUID2, "randomUUID(...)");
        String uuid2 = randomUUID2.toString();
        Intrinsics.checkNotNullExpressionValue(uuid2, "toString(...)");
        linkedHashMap2.put("log.record.uid", uuid2);
        f fVar2 = (f) cVar22.f6269d;
        AbstractC0169a.w(linkedHashMap2, "ossdk.app_id", fVar2.getAppId());
        AbstractC0169a.w(linkedHashMap2, "ossdk.onesignal_id", fVar2.getOnesignalId());
        AbstractC0169a.w(linkedHashMap2, "ossdk.push_subscription_id", fVar2.getPushSubscriptionId());
        linkedHashMap2.put("app.state", fVar2.getAppState());
        linkedHashMap2.put("process.uptime", String.valueOf(fVar2.getProcessUptime()));
        linkedHashMap2.put("thread.name", fVar2.getCurrentThreadName());
        enabledFeatureFlags = fVar2.getEnabledFeatureFlags();
        if (!enabledFeatureFlags.isEmpty()) {
        }
        Map attributes2 = Collections.unmodifiableMap(linkedHashMap2);
        Intrinsics.checkNotNullExpressionValue(attributes2, "unmodifiableMap(...)");
        Intrinsics.checkNotNullParameter(a72, "<this>");
        Intrinsics.checkNotNullParameter(attributes2, "attributes");
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
    public final Object c(X5.c cVar) {
        i iVar;
        int i2;
        j jVar;
        if (cVar instanceof i) {
            iVar = (i) cVar;
            int i5 = iVar.f682l;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                iVar.f682l = i5 - Integer.MIN_VALUE;
                Object obj = iVar.f680e;
                W5.a aVar = W5.a.f2787d;
                i2 = iVar.f682l;
                if (i2 != 0) {
                    V6.b.P(obj);
                    B.f fVar = this.f683a;
                    iVar.f679d = this;
                    iVar.f682l = 1;
                    obj = fVar.j(iVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                    jVar = this;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jVar = iVar.f679d;
                    V6.b.P(obj);
                }
                Map map = (Map) obj;
                synchronized (jVar.f685c) {
                    u5.d dVar = jVar.f686d;
                    if (dVar != null) {
                        return dVar;
                    }
                    u5.d d7 = jVar.d(map);
                    jVar.f686d = d7;
                    return d7;
                }
            }
        }
        iVar = new i(this, cVar);
        Object obj2 = iVar.f680e;
        W5.a aVar2 = W5.a.f2787d;
        i2 = iVar.f682l;
        if (i2 != 0) {
        }
        Map map2 = (Map) obj2;
        synchronized (jVar.f685c) {
        }
    }

    public abstract u5.d d(Map map);
}
