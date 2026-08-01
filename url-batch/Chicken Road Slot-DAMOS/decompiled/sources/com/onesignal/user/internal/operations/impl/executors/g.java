package com.onesignal.user.internal.operations.impl.executors;

import a2.r;
import android.os.Build;
import com.onesignal.common.AndroidUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.i0;
import kotlin.collections.k0;
import kotlin.collections.o0;
import kotlin.collections.p0;
import kotlin.collections.r0;
import kotlin.collections.x;
import kotlin.collections.z;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import wd.g0;
import zc.p;
import zc.q;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class g implements na.d {
    public static final a Companion = new a(null);
    public static final String LOGIN_USER = "login-user";
    private final ea.f _application;
    private final com.onesignal.core.internal.config.b _configModelStore;
    private final ja.c _deviceService;
    private final yc.b _identityModelStore;
    private final com.onesignal.user.internal.operations.impl.executors.c _identityOperationExecutor;
    private final la.a _languageContext;
    private final com.onesignal.user.internal.properties.b _propertiesModelStore;
    private final dd.e _subscriptionsModelStore;
    private final uc.d _userBackend;

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class b extends nd.c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public b(ld.a aVar) {
            super(aVar);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return g.this.createUser(null, null, this);
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class c extends nd.c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public c(ld.a aVar) {
            super(aVar);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return g.this.loginUser(null, null, this);
        }
    }

    public g(com.onesignal.user.internal.operations.impl.executors.c cVar, ea.f fVar, ja.c cVar2, uc.d dVar, yc.b bVar, com.onesignal.user.internal.properties.b bVar2, dd.e eVar, com.onesignal.core.internal.config.b bVar3, la.a aVar) {
        cVar.getClass();
        fVar.getClass();
        cVar2.getClass();
        dVar.getClass();
        bVar.getClass();
        bVar2.getClass();
        eVar.getClass();
        bVar3.getClass();
        aVar.getClass();
        this._identityOperationExecutor = cVar;
        this._application = fVar;
        this._deviceService = cVar2;
        this._userBackend = dVar;
        this._identityModelStore = bVar;
        this._propertiesModelStore = bVar2;
        this._subscriptionsModelStore = eVar;
        this._configModelStore = bVar3;
        this._languageContext = aVar;
    }

    private final Map<String, uc.h> createSubscriptionsFromOperation(p pVar, Map<String, uc.h> map) {
        LinkedHashMap i3 = p0.i(map);
        if (!i3.containsKey(pVar.getSubscriptionId())) {
            i3.put(pVar.getSubscriptionId(), new uc.h(pVar.getSubscriptionId(), null, null, null, null, null, null, null, null, null, null, null, 4094, null));
            return i3;
        }
        String subscriptionId = pVar.getSubscriptionId();
        String subscriptionId2 = pVar.getSubscriptionId();
        uc.h hVar = map.get(pVar.getSubscriptionId());
        hVar.getClass();
        uc.j type = hVar.getType();
        uc.h hVar2 = map.get(pVar.getSubscriptionId());
        hVar2.getClass();
        String token = hVar2.getToken();
        uc.h hVar3 = map.get(pVar.getSubscriptionId());
        hVar3.getClass();
        Boolean enabled = hVar3.getEnabled();
        uc.h hVar4 = map.get(pVar.getSubscriptionId());
        hVar4.getClass();
        Integer notificationTypes = hVar4.getNotificationTypes();
        uc.h hVar5 = map.get(pVar.getSubscriptionId());
        hVar5.getClass();
        String sdk = hVar5.getSdk();
        uc.h hVar6 = map.get(pVar.getSubscriptionId());
        hVar6.getClass();
        String deviceModel = hVar6.getDeviceModel();
        uc.h hVar7 = map.get(pVar.getSubscriptionId());
        hVar7.getClass();
        String deviceOS = hVar7.getDeviceOS();
        uc.h hVar8 = map.get(pVar.getSubscriptionId());
        hVar8.getClass();
        Boolean rooted = hVar8.getRooted();
        uc.h hVar9 = map.get(pVar.getSubscriptionId());
        hVar9.getClass();
        Integer netType = hVar9.getNetType();
        uc.h hVar10 = map.get(pVar.getSubscriptionId());
        hVar10.getClass();
        String carrier = hVar10.getCarrier();
        uc.h hVar11 = map.get(pVar.getSubscriptionId());
        hVar11.getClass();
        i3.put(subscriptionId, new uc.h(subscriptionId2, type, token, enabled, notificationTypes, sdk, deviceModel, deviceOS, rooted, netType, carrier, hVar11.getAppVersion()));
        return i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x014a A[Catch: a -> 0x003f, TryCatch #0 {a -> 0x003f, blocks: (B:12:0x003a, B:13:0x010e, B:15:0x014a, B:16:0x015c, B:18:0x016a, B:19:0x017d, B:20:0x0189, B:22:0x0190, B:23:0x019a, B:25:0x01a0, B:29:0x01b5, B:31:0x01b9, B:32:0x01bd, B:34:0x01c3, B:36:0x01dc, B:38:0x01e2, B:41:0x01eb, B:49:0x01ef, B:50:0x01f3, B:52:0x01f9, B:56:0x0210, B:61:0x0215, B:63:0x0233, B:64:0x0242, B:66:0x024f, B:68:0x027c, B:70:0x0264, B:76:0x0286, B:78:0x028c, B:79:0x0299, B:120:0x00c9, B:121:0x00e2, B:123:0x00e8, B:125:0x00f6), top: B:8:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x016a A[Catch: a -> 0x003f, TryCatch #0 {a -> 0x003f, blocks: (B:12:0x003a, B:13:0x010e, B:15:0x014a, B:16:0x015c, B:18:0x016a, B:19:0x017d, B:20:0x0189, B:22:0x0190, B:23:0x019a, B:25:0x01a0, B:29:0x01b5, B:31:0x01b9, B:32:0x01bd, B:34:0x01c3, B:36:0x01dc, B:38:0x01e2, B:41:0x01eb, B:49:0x01ef, B:50:0x01f3, B:52:0x01f9, B:56:0x0210, B:61:0x0215, B:63:0x0233, B:64:0x0242, B:66:0x024f, B:68:0x027c, B:70:0x0264, B:76:0x0286, B:78:0x028c, B:79:0x0299, B:120:0x00c9, B:121:0x00e2, B:123:0x00e8, B:125:0x00f6), top: B:8:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0190 A[Catch: a -> 0x003f, TryCatch #0 {a -> 0x003f, blocks: (B:12:0x003a, B:13:0x010e, B:15:0x014a, B:16:0x015c, B:18:0x016a, B:19:0x017d, B:20:0x0189, B:22:0x0190, B:23:0x019a, B:25:0x01a0, B:29:0x01b5, B:31:0x01b9, B:32:0x01bd, B:34:0x01c3, B:36:0x01dc, B:38:0x01e2, B:41:0x01eb, B:49:0x01ef, B:50:0x01f3, B:52:0x01f9, B:56:0x0210, B:61:0x0215, B:63:0x0233, B:64:0x0242, B:66:0x024f, B:68:0x027c, B:70:0x0264, B:76:0x0286, B:78:0x028c, B:79:0x0299, B:120:0x00c9, B:121:0x00e2, B:123:0x00e8, B:125:0x00f6), top: B:8:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0286 A[EDGE_INSN: B:75:0x0286->B:76:0x0286 BREAK  A[LOOP:0: B:20:0x0189->B:68:0x027c], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x028c A[Catch: a -> 0x003f, TryCatch #0 {a -> 0x003f, blocks: (B:12:0x003a, B:13:0x010e, B:15:0x014a, B:16:0x015c, B:18:0x016a, B:19:0x017d, B:20:0x0189, B:22:0x0190, B:23:0x019a, B:25:0x01a0, B:29:0x01b5, B:31:0x01b9, B:32:0x01bd, B:34:0x01c3, B:36:0x01dc, B:38:0x01e2, B:41:0x01eb, B:49:0x01ef, B:50:0x01f3, B:52:0x01f9, B:56:0x0210, B:61:0x0215, B:63:0x0233, B:64:0x0242, B:66:0x024f, B:68:0x027c, B:70:0x0264, B:76:0x0286, B:78:0x028c, B:79:0x0299, B:120:0x00c9, B:121:0x00e2, B:123:0x00e8, B:125:0x00f6), top: B:8:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createUser(zc.f fVar, List<? extends na.g> list, ld.a aVar) {
        b bVar;
        int i3;
        Map<String, uc.h> map;
        List list2;
        Map<String, uc.h> map2;
        zc.f fVar2;
        g gVar;
        yc.a aVar2;
        com.onesignal.user.internal.properties.a aVar3;
        String str;
        String str2;
        LinkedHashSet S;
        Iterator it;
        Object obj;
        Object obj2;
        Object obj3;
        String token;
        try {
            if (aVar instanceof b) {
                bVar = (b) aVar;
                int i10 = bVar.label;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    bVar.label = i10 - Integer.MIN_VALUE;
                    b bVar2 = bVar;
                    Object obj4 = bVar2.result;
                    md.a aVar4 = md.a.f6622d;
                    i3 = bVar2.label;
                    if (i3 != 0) {
                        cf.c.M(obj4);
                        Map<String, uc.h> map3 = k0.f5575d;
                        map3.getClass();
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.put("timezone_id", com.onesignal.common.l.INSTANCE.getTimeZoneId());
                        linkedHashMap.put("language", this._languageContext.getLanguage());
                        if (fVar.getExternalId() != null) {
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap(map3);
                            String externalId = fVar.getExternalId();
                            externalId.getClass();
                            linkedHashMap2.put("external_id", externalId);
                            map = linkedHashMap2;
                        } else {
                            map = map3;
                        }
                        for (na.g gVar2 : list) {
                            if (gVar2 instanceof zc.a) {
                                map3 = createSubscriptionsFromOperation((zc.a) gVar2, map3);
                            } else if (gVar2 instanceof p) {
                                map3 = createSubscriptionsFromOperation((p) gVar2, map3);
                            } else if (gVar2 instanceof q) {
                                map3 = createSubscriptionsFromOperation((q) gVar2, map3);
                            } else {
                                if (!(gVar2 instanceof zc.c)) {
                                    r.i(gVar2, "Unrecognized operation: ");
                                    return null;
                                }
                                map3 = createSubscriptionsFromOperation((zc.c) gVar2, map3);
                            }
                        }
                        List j = r0.j(map3);
                        uc.d dVar = this._userBackend;
                        String appId = fVar.getAppId();
                        ArrayList arrayList = new ArrayList(z.j(j, 10));
                        Iterator it2 = j.iterator();
                        while (it2.hasNext()) {
                            arrayList.add((uc.h) ((Pair) it2.next()).f5553e);
                        }
                        bVar2.L$0 = this;
                        bVar2.L$1 = fVar;
                        bVar2.L$2 = map;
                        bVar2.L$3 = j;
                        bVar2.label = 1;
                        Object createUser = dVar.createUser(appId, map, arrayList, linkedHashMap, bVar2);
                        if (createUser == aVar4) {
                            return aVar4;
                        }
                        list2 = j;
                        obj4 = createUser;
                        map2 = map;
                        fVar2 = fVar;
                        gVar = this;
                    } else {
                        if (i3 != 1) {
                            i0.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        list2 = (List) bVar2.L$3;
                        map2 = (Map) bVar2.L$2;
                        fVar2 = (zc.f) bVar2.L$1;
                        gVar = (g) bVar2.L$0;
                        cf.c.M(obj4);
                    }
                    uc.a aVar5 = (uc.a) obj4;
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                    String str3 = aVar5.getIdentities().get("onesignal_id");
                    str3.getClass();
                    String str4 = str3;
                    linkedHashMap3.put(fVar2.getOnesignalId(), str4);
                    aVar2 = (yc.a) gVar._identityModelStore.getModel();
                    aVar3 = (com.onesignal.user.internal.properties.a) gVar._propertiesModelStore.getModel();
                    if (Intrinsics.a(aVar2.getOnesignalId(), fVar2.getOnesignalId())) {
                        str = str4;
                    } else {
                        str = str4;
                        com.onesignal.common.modeling.i.setStringProperty$default(aVar2, "onesignal_id", str, "HYDRATE", false, 8, null);
                    }
                    if (Intrinsics.a(aVar3.getOnesignalId(), fVar2.getOnesignalId())) {
                        str2 = str;
                    } else {
                        com.onesignal.common.modeling.i.setStringProperty$default(aVar3, "onesignalId", str, "HYDRATE", false, 8, null);
                        str2 = str;
                    }
                    S = CollectionsKt.S(aVar5.getSubscriptions());
                    it = list2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            break;
                        }
                        Pair pair = (Pair) it.next();
                        Iterator it3 = S.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it3.next();
                            if (Intrinsics.a(((uc.h) obj).getId(), pair.f5552d)) {
                                break;
                            }
                        }
                        uc.h hVar = (uc.h) obj;
                        if (hVar == null) {
                            Iterator it4 = S.iterator();
                            while (true) {
                                if (!it4.hasNext()) {
                                    obj3 = null;
                                    break;
                                }
                                obj3 = it4.next();
                                uc.h hVar2 = (uc.h) obj3;
                                if (Intrinsics.a(hVar2.getToken(), ((uc.h) pair.f5553e).getToken()) && (token = hVar2.getToken()) != null && !StringsKt.r(token)) {
                                    break;
                                }
                            }
                            hVar = (uc.h) obj3;
                        }
                        if (hVar == null) {
                            Iterator it5 = S.iterator();
                            while (true) {
                                if (!it5.hasNext()) {
                                    obj2 = null;
                                    break;
                                }
                                Object next = it5.next();
                                if (((uc.h) next).getType() == ((uc.h) pair.f5553e).getType()) {
                                    obj2 = next;
                                    break;
                                }
                            }
                            hVar = (uc.h) obj2;
                        }
                        if (hVar != null) {
                            Object obj5 = pair.f5552d;
                            String id2 = hVar.getId();
                            id2.getClass();
                            linkedHashMap3.put(obj5, id2);
                            if (Intrinsics.a(((com.onesignal.core.internal.config.a) gVar._configModelStore.getModel()).getPushSubscriptionId(), obj5)) {
                                ((com.onesignal.core.internal.config.a) gVar._configModelStore.getModel()).setPushSubscriptionId(hVar.getId());
                            }
                            dd.d dVar2 = (dd.d) gVar._subscriptionsModelStore.get((String) obj5);
                            if (dVar2 != null) {
                                String id3 = hVar.getId();
                                id3.getClass();
                                com.onesignal.common.modeling.i.setStringProperty$default(dVar2, "id", id3, "HYDRATE", false, 8, null);
                            }
                        } else {
                            com.onesignal.debug.internal.logging.b.error$default("LoginUserOperationExecutor.createUser response is missing subscription data for " + ((String) pair.f5552d), null, 2, null);
                        }
                        g0.a(S).remove(hVar);
                    }
                    return new na.a(na.b.SUCCESS, linkedHashMap3, map2.isEmpty() ? null : x.c(new zc.h(fVar2.getAppId(), str2)), null, 8, null);
                }
            }
            if (i3 != 0) {
            }
            uc.a aVar52 = (uc.a) obj4;
            LinkedHashMap linkedHashMap32 = new LinkedHashMap();
            String str32 = aVar52.getIdentities().get("onesignal_id");
            str32.getClass();
            String str42 = str32;
            linkedHashMap32.put(fVar2.getOnesignalId(), str42);
            aVar2 = (yc.a) gVar._identityModelStore.getModel();
            aVar3 = (com.onesignal.user.internal.properties.a) gVar._propertiesModelStore.getModel();
            if (Intrinsics.a(aVar2.getOnesignalId(), fVar2.getOnesignalId())) {
            }
            if (Intrinsics.a(aVar3.getOnesignalId(), fVar2.getOnesignalId())) {
            }
            S = CollectionsKt.S(aVar52.getSubscriptions());
            it = list2.iterator();
            while (true) {
                if (it.hasNext()) {
                }
                g0.a(S).remove(hVar);
            }
            return new na.a(na.b.SUCCESS, linkedHashMap32, map2.isEmpty() ? null : x.c(new zc.h(fVar2.getAppId(), str2)), null, 8, null);
        } catch (z9.a e2) {
            int i11 = h.$EnumSwitchMapping$1[com.onesignal.common.g.INSTANCE.getResponseStatusType(e2.getStatusCode()).ordinal()];
            return i11 != 1 ? i11 != 2 ? new na.a(na.b.FAIL_PAUSE_OPREPO, null, null, null, 14, null) : new na.a(na.b.FAIL_UNAUTHORIZED, null, null, e2.getRetryAfterSeconds(), 6, null) : new na.a(na.b.FAIL_RETRY, null, null, e2.getRetryAfterSeconds(), 6, null);
        }
        bVar = new b(aVar);
        b bVar22 = bVar;
        Object obj42 = bVar22.result;
        md.a aVar42 = md.a.f6622d;
        i3 = bVar22.label;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object loginUser(zc.f fVar, List<? extends na.g> list, ld.a aVar) {
        c cVar;
        int i3;
        g gVar;
        int i10;
        String str;
        zc.f fVar2 = fVar;
        List<? extends na.g> list2 = list;
        if (aVar instanceof c) {
            cVar = (c) aVar;
            int i11 = cVar.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cVar.label = i11 - Integer.MIN_VALUE;
                Object obj = cVar.result;
                md.a aVar2 = md.a.f6622d;
                i3 = cVar.label;
                if (i3 != 0) {
                    cf.c.M(obj);
                    if (list2 == null || !list2.isEmpty()) {
                        for (na.g gVar2 : list2) {
                            if ((gVar2 instanceof zc.a) || (gVar2 instanceof p)) {
                                break;
                            }
                        }
                    }
                    if (fVar2.getExternalId() == null) {
                        return new na.a(na.b.FAIL_NORETRY, null, null, null, 14, null);
                    }
                    if (fVar2.getExistingOnesignalId() == null || fVar2.getExternalId() == null) {
                        cVar.label = 1;
                        Object createUser = createUser(fVar2, list2, cVar);
                        if (createUser != aVar2) {
                            return createUser;
                        }
                    } else {
                        com.onesignal.user.internal.operations.impl.executors.c cVar2 = this._identityOperationExecutor;
                        String appId = fVar2.getAppId();
                        String existingOnesignalId = fVar2.getExistingOnesignalId();
                        existingOnesignalId.getClass();
                        String externalId = fVar2.getExternalId();
                        externalId.getClass();
                        List<? extends na.g> c10 = x.c(new zc.i(appId, existingOnesignalId, "external_id", externalId));
                        cVar.L$0 = this;
                        cVar.L$1 = fVar2;
                        cVar.L$2 = list2;
                        cVar.label = 2;
                        obj = cVar2.execute(c10, cVar);
                        if (obj != aVar2) {
                            gVar = this;
                        }
                    }
                    return aVar2;
                }
                if (i3 == 1) {
                    cf.c.M(obj);
                    return obj;
                }
                if (i3 != 2) {
                    if (i3 == 3) {
                        cf.c.M(obj);
                        return obj;
                    }
                    if (i3 == 4) {
                        cf.c.M(obj);
                        return obj;
                    }
                    i0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                List<? extends na.g> list3 = (List) cVar.L$2;
                zc.f fVar3 = (zc.f) cVar.L$1;
                gVar = (g) cVar.L$0;
                cf.c.M(obj);
                list2 = list3;
                fVar2 = fVar3;
                na.a aVar3 = (na.a) obj;
                i10 = h.$EnumSwitchMapping$0[aVar3.getResult().ordinal()];
                if (i10 != 1) {
                    String existingOnesignalId2 = fVar2.getExistingOnesignalId();
                    existingOnesignalId2.getClass();
                    if (Intrinsics.a(((yc.a) gVar._identityModelStore.getModel()).getOnesignalId(), fVar2.getOnesignalId())) {
                        str = existingOnesignalId2;
                        com.onesignal.common.modeling.i.setStringProperty$default(gVar._identityModelStore.getModel(), "onesignal_id", str, "HYDRATE", false, 8, null);
                    } else {
                        str = existingOnesignalId2;
                    }
                    if (Intrinsics.a(((com.onesignal.user.internal.properties.a) gVar._propertiesModelStore.getModel()).getOnesignalId(), fVar2.getOnesignalId())) {
                        String str2 = str;
                        com.onesignal.common.modeling.i.setStringProperty$default(gVar._propertiesModelStore.getModel(), "onesignalId", str2, "HYDRATE", false, 8, null);
                        str = str2;
                    }
                    return new na.a(na.b.SUCCESS_STARTING_ONLY, o0.b(new Pair(fVar2.getOnesignalId(), str)), null, null, 12, null);
                }
                if (i10 == 2) {
                    com.onesignal.debug.internal.logging.b.debug$default("LoginUserOperationExecutor now handling 409 response with \"code\": \"user-2\" by switching to user with \"external_id\": \"" + fVar2.getExternalId() + '\"', null, 2, null);
                    cVar.L$0 = null;
                    cVar.L$1 = null;
                    cVar.L$2 = null;
                    cVar.label = 3;
                    Object createUser2 = gVar.createUser(fVar2, list2, cVar);
                    if (createUser2 != aVar2) {
                        return createUser2;
                    }
                } else {
                    if (i10 != 3) {
                        return new na.a(aVar3.getResult(), null, null, null, 14, null);
                    }
                    com.onesignal.debug.internal.logging.b.error$default("LoginUserOperationExecutor encountered error. Attempt to recover by switching to user with \"external_id\": \"" + fVar2.getExternalId() + '\"', null, 2, null);
                    cVar.L$0 = null;
                    cVar.L$1 = null;
                    cVar.L$2 = null;
                    cVar.label = 4;
                    Object createUser3 = gVar.createUser(fVar2, list2, cVar);
                    if (createUser3 != aVar2) {
                        return createUser3;
                    }
                }
                return aVar2;
            }
        }
        cVar = new c(aVar);
        Object obj2 = cVar.result;
        md.a aVar22 = md.a.f6622d;
        i3 = cVar.label;
        if (i3 != 0) {
        }
        na.a aVar32 = (na.a) obj2;
        i10 = h.$EnumSwitchMapping$0[aVar32.getResult().ordinal()];
        if (i10 != 1) {
        }
    }

    @Override // na.d
    public Object execute(List<? extends na.g> list, ld.a aVar) {
        com.onesignal.debug.internal.logging.b.debug$default("LoginUserOperationExecutor(operation: " + list + ')', null, 2, null);
        na.g gVar = (na.g) CollectionsKt.x(list);
        if (gVar instanceof zc.f) {
            return loginUser((zc.f) gVar, CollectionsKt.v(list, 1), aVar);
        }
        r.i(gVar, "Unrecognized operation: ");
        return null;
    }

    @Override // na.d
    public List<String> getOperations() {
        return x.c(LOGIN_USER);
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private final Map<String, uc.h> createSubscriptionsFromOperation(zc.a aVar, Map<String, uc.h> map) {
        uc.j jVar;
        LinkedHashMap i3 = p0.i(map);
        int i10 = h.$EnumSwitchMapping$2[aVar.getType().ordinal()];
        if (i10 == 1) {
            jVar = uc.j.SMS;
        } else if (i10 != 2) {
            jVar = uc.j.Companion.fromDeviceType(this._deviceService.getDeviceType());
        } else {
            jVar = uc.j.EMAIL;
        }
        uc.j jVar2 = jVar;
        String subscriptionId = !com.onesignal.common.d.INSTANCE.isLocalId(aVar.getSubscriptionId()) ? aVar.getSubscriptionId() : null;
        String subscriptionId2 = aVar.getSubscriptionId();
        String address = aVar.getAddress();
        Boolean valueOf = Boolean.valueOf(aVar.getEnabled());
        Integer valueOf2 = Integer.valueOf(aVar.getStatus().getValue());
        String sdkVersion = com.onesignal.common.h.INSTANCE.getSdkVersion();
        String str = Build.MODEL;
        String str2 = Build.VERSION.RELEASE;
        Boolean valueOf3 = Boolean.valueOf(com.onesignal.common.j.INSTANCE.isRooted());
        com.onesignal.common.c cVar = com.onesignal.common.c.INSTANCE;
        i3.put(subscriptionId2, new uc.h(subscriptionId, jVar2, address, valueOf, valueOf2, sdkVersion, str, str2, valueOf3, cVar.getNetType(this._application.getAppContext()), cVar.getCarrierName(this._application.getAppContext()), AndroidUtils.INSTANCE.getAppVersion(this._application.getAppContext())));
        return i3;
    }

    private final Map<String, uc.h> createSubscriptionsFromOperation(q qVar, Map<String, uc.h> map) {
        LinkedHashMap i3 = p0.i(map);
        if (i3.containsKey(qVar.getSubscriptionId())) {
            String subscriptionId = qVar.getSubscriptionId();
            uc.h hVar = map.get(qVar.getSubscriptionId());
            hVar.getClass();
            String id2 = hVar.getId();
            uc.h hVar2 = map.get(qVar.getSubscriptionId());
            hVar2.getClass();
            uc.j type = hVar2.getType();
            String address = qVar.getAddress();
            Boolean valueOf = Boolean.valueOf(qVar.getEnabled());
            Integer valueOf2 = Integer.valueOf(qVar.getStatus().getValue());
            uc.h hVar3 = map.get(qVar.getSubscriptionId());
            hVar3.getClass();
            String sdk = hVar3.getSdk();
            uc.h hVar4 = map.get(qVar.getSubscriptionId());
            hVar4.getClass();
            String deviceModel = hVar4.getDeviceModel();
            uc.h hVar5 = map.get(qVar.getSubscriptionId());
            hVar5.getClass();
            String deviceOS = hVar5.getDeviceOS();
            uc.h hVar6 = map.get(qVar.getSubscriptionId());
            hVar6.getClass();
            Boolean rooted = hVar6.getRooted();
            uc.h hVar7 = map.get(qVar.getSubscriptionId());
            hVar7.getClass();
            Integer netType = hVar7.getNetType();
            uc.h hVar8 = map.get(qVar.getSubscriptionId());
            hVar8.getClass();
            String carrier = hVar8.getCarrier();
            uc.h hVar9 = map.get(qVar.getSubscriptionId());
            hVar9.getClass();
            i3.put(subscriptionId, new uc.h(id2, type, address, valueOf, valueOf2, sdk, deviceModel, deviceOS, rooted, netType, carrier, hVar9.getAppVersion()));
        }
        return i3;
    }

    private final Map<String, uc.h> createSubscriptionsFromOperation(zc.c cVar, Map<String, uc.h> map) {
        LinkedHashMap i3 = p0.i(map);
        i3.remove(cVar.getSubscriptionId());
        return i3;
    }
}
