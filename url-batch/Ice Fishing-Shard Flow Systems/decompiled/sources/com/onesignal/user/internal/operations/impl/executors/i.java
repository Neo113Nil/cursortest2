package com.onesignal.user.internal.operations.impl.executors;

import android.os.Build;
import com.onesignal.common.AndroidUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.RandomAccess;
import kotlin.Pair;
import kotlin.collections.A;
import kotlin.collections.CollectionsKt;
import kotlin.collections.H;
import kotlin.collections.I;
import kotlin.collections.K;
import kotlin.collections.s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o2.C0800b;
import p2.EnumC0826a;
import r2.C0846a;

/* loaded from: classes.dex */
public final class i implements F2.d {
    public static final a Companion = new a(null);
    public static final String LOGIN_USER = "login-user";
    private final v2.f _application;
    private final com.onesignal.core.internal.config.c _configModelStore;
    private final q2.c _consistencyManager;
    private final A2.c _deviceService;
    private final T3.b _identityModelStore;
    private final d _identityOperationExecutor;
    private final com.onesignal.core.internal.config.impl.c _identityVerificationService;
    private final com.onesignal.user.internal.jwt.c _jwtTokenStore;
    private final D2.a _languageContext;
    private final com.onesignal.user.internal.properties.b _propertiesModelStore;
    private final Y3.e _subscriptionsModelStore;
    private final P3.d _userBackend;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends X5.c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public b(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return i.this.createUser(null, null, this);
        }
    }

    public static final class c extends X5.c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public c(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return i.this.loginUser(null, null, this);
        }
    }

    public i(d _identityOperationExecutor, v2.f _application, A2.c _deviceService, P3.d _userBackend, T3.b _identityModelStore, com.onesignal.user.internal.properties.b _propertiesModelStore, Y3.e _subscriptionsModelStore, com.onesignal.core.internal.config.c _configModelStore, D2.a _languageContext, com.onesignal.user.internal.jwt.c _jwtTokenStore, com.onesignal.core.internal.config.impl.c _identityVerificationService, q2.c _consistencyManager) {
        Intrinsics.checkNotNullParameter(_identityOperationExecutor, "_identityOperationExecutor");
        Intrinsics.checkNotNullParameter(_application, "_application");
        Intrinsics.checkNotNullParameter(_deviceService, "_deviceService");
        Intrinsics.checkNotNullParameter(_userBackend, "_userBackend");
        Intrinsics.checkNotNullParameter(_identityModelStore, "_identityModelStore");
        Intrinsics.checkNotNullParameter(_propertiesModelStore, "_propertiesModelStore");
        Intrinsics.checkNotNullParameter(_subscriptionsModelStore, "_subscriptionsModelStore");
        Intrinsics.checkNotNullParameter(_configModelStore, "_configModelStore");
        Intrinsics.checkNotNullParameter(_languageContext, "_languageContext");
        Intrinsics.checkNotNullParameter(_jwtTokenStore, "_jwtTokenStore");
        Intrinsics.checkNotNullParameter(_identityVerificationService, "_identityVerificationService");
        Intrinsics.checkNotNullParameter(_consistencyManager, "_consistencyManager");
        this._identityOperationExecutor = _identityOperationExecutor;
        this._application = _application;
        this._deviceService = _deviceService;
        this._userBackend = _userBackend;
        this._identityModelStore = _identityModelStore;
        this._propertiesModelStore = _propertiesModelStore;
        this._subscriptionsModelStore = _subscriptionsModelStore;
        this._configModelStore = _configModelStore;
        this._languageContext = _languageContext;
        this._jwtTokenStore = _jwtTokenStore;
        this._identityVerificationService = _identityVerificationService;
        this._consistencyManager = _consistencyManager;
    }

    private final Map<String, P3.h> createSubscriptionsFromOperation(U3.p pVar, Map<String, P3.h> map) {
        LinkedHashMap j = I.j(map);
        if (!j.containsKey(pVar.getSubscriptionId())) {
            j.put(pVar.getSubscriptionId(), new P3.h(pVar.getSubscriptionId(), null, null, null, null, null, null, null, null, null, null, null, 4094, null));
            return j;
        }
        String subscriptionId = pVar.getSubscriptionId();
        String subscriptionId2 = pVar.getSubscriptionId();
        P3.h hVar = map.get(pVar.getSubscriptionId());
        Intrinsics.b(hVar);
        P3.j type = hVar.getType();
        P3.h hVar2 = map.get(pVar.getSubscriptionId());
        Intrinsics.b(hVar2);
        String token = hVar2.getToken();
        P3.h hVar3 = map.get(pVar.getSubscriptionId());
        Intrinsics.b(hVar3);
        Boolean enabled = hVar3.getEnabled();
        P3.h hVar4 = map.get(pVar.getSubscriptionId());
        Intrinsics.b(hVar4);
        Integer notificationTypes = hVar4.getNotificationTypes();
        P3.h hVar5 = map.get(pVar.getSubscriptionId());
        Intrinsics.b(hVar5);
        String sdk = hVar5.getSdk();
        P3.h hVar6 = map.get(pVar.getSubscriptionId());
        Intrinsics.b(hVar6);
        String deviceModel = hVar6.getDeviceModel();
        P3.h hVar7 = map.get(pVar.getSubscriptionId());
        Intrinsics.b(hVar7);
        String deviceOS = hVar7.getDeviceOS();
        P3.h hVar8 = map.get(pVar.getSubscriptionId());
        Intrinsics.b(hVar8);
        Boolean rooted = hVar8.getRooted();
        P3.h hVar9 = map.get(pVar.getSubscriptionId());
        Intrinsics.b(hVar9);
        Integer netType = hVar9.getNetType();
        P3.h hVar10 = map.get(pVar.getSubscriptionId());
        Intrinsics.b(hVar10);
        String carrier = hVar10.getCarrier();
        P3.h hVar11 = map.get(pVar.getSubscriptionId());
        Intrinsics.b(hVar11);
        j.put(subscriptionId, new P3.h(subscriptionId2, type, token, enabled, notificationTypes, sdk, deviceModel, deviceOS, rooted, netType, carrier, hVar11.getAppVersion()));
        return j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x02f9 A[Catch: a -> 0x0044, TryCatch #0 {a -> 0x0044, blocks: (B:13:0x003e, B:16:0x02f3, B:18:0x02f9, B:19:0x030f, B:27:0x005f, B:29:0x0141, B:31:0x017d, B:32:0x018f, B:34:0x019d, B:35:0x01b0, B:36:0x01bc, B:38:0x01c2, B:39:0x01cc, B:41:0x01d2, B:46:0x01ea, B:48:0x01ee, B:49:0x01f2, B:51:0x01f8, B:53:0x0211, B:55:0x0217, B:58:0x0221, B:66:0x0226, B:67:0x022a, B:69:0x0230, B:73:0x0247, B:78:0x024c, B:80:0x026a, B:81:0x0279, B:83:0x0287, B:86:0x02b7, B:87:0x029d, B:92:0x02c2, B:94:0x02cb, B:96:0x02d1, B:136:0x00f9, B:137:0x011a, B:139:0x0120, B:141:0x012e), top: B:8:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x017d A[Catch: a -> 0x0044, TryCatch #0 {a -> 0x0044, blocks: (B:13:0x003e, B:16:0x02f3, B:18:0x02f9, B:19:0x030f, B:27:0x005f, B:29:0x0141, B:31:0x017d, B:32:0x018f, B:34:0x019d, B:35:0x01b0, B:36:0x01bc, B:38:0x01c2, B:39:0x01cc, B:41:0x01d2, B:46:0x01ea, B:48:0x01ee, B:49:0x01f2, B:51:0x01f8, B:53:0x0211, B:55:0x0217, B:58:0x0221, B:66:0x0226, B:67:0x022a, B:69:0x0230, B:73:0x0247, B:78:0x024c, B:80:0x026a, B:81:0x0279, B:83:0x0287, B:86:0x02b7, B:87:0x029d, B:92:0x02c2, B:94:0x02cb, B:96:0x02d1, B:136:0x00f9, B:137:0x011a, B:139:0x0120, B:141:0x012e), top: B:8:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x019d A[Catch: a -> 0x0044, TryCatch #0 {a -> 0x0044, blocks: (B:13:0x003e, B:16:0x02f3, B:18:0x02f9, B:19:0x030f, B:27:0x005f, B:29:0x0141, B:31:0x017d, B:32:0x018f, B:34:0x019d, B:35:0x01b0, B:36:0x01bc, B:38:0x01c2, B:39:0x01cc, B:41:0x01d2, B:46:0x01ea, B:48:0x01ee, B:49:0x01f2, B:51:0x01f8, B:53:0x0211, B:55:0x0217, B:58:0x0221, B:66:0x0226, B:67:0x022a, B:69:0x0230, B:73:0x0247, B:78:0x024c, B:80:0x026a, B:81:0x0279, B:83:0x0287, B:86:0x02b7, B:87:0x029d, B:92:0x02c2, B:94:0x02cb, B:96:0x02d1, B:136:0x00f9, B:137:0x011a, B:139:0x0120, B:141:0x012e), top: B:8:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01c2 A[Catch: a -> 0x0044, TryCatch #0 {a -> 0x0044, blocks: (B:13:0x003e, B:16:0x02f3, B:18:0x02f9, B:19:0x030f, B:27:0x005f, B:29:0x0141, B:31:0x017d, B:32:0x018f, B:34:0x019d, B:35:0x01b0, B:36:0x01bc, B:38:0x01c2, B:39:0x01cc, B:41:0x01d2, B:46:0x01ea, B:48:0x01ee, B:49:0x01f2, B:51:0x01f8, B:53:0x0211, B:55:0x0217, B:58:0x0221, B:66:0x0226, B:67:0x022a, B:69:0x0230, B:73:0x0247, B:78:0x024c, B:80:0x026a, B:81:0x0279, B:83:0x0287, B:86:0x02b7, B:87:0x029d, B:92:0x02c2, B:94:0x02cb, B:96:0x02d1, B:136:0x00f9, B:137:0x011a, B:139:0x0120, B:141:0x012e), top: B:8:0x0028 }] */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createUser(U3.f fVar, List<? extends F2.g> list, V5.b bVar) {
        b bVar2;
        int i2;
        Map<String, String> map;
        List<Pair> k7;
        Object createUser;
        i iVar;
        LinkedHashMap linkedHashMap;
        T3.a aVar;
        com.onesignal.user.internal.properties.a aVar2;
        String str;
        String str2;
        List list2;
        LinkedHashMap linkedHashMap2;
        C0800b rywData;
        U3.f fVar2;
        Map<String, String> map2;
        LinkedHashMap linkedHashMap3;
        String str3;
        Object obj;
        P3.h hVar;
        P3.h hVar2;
        String token;
        U3.f fVar3 = fVar;
        try {
            if (bVar instanceof b) {
                bVar2 = (b) bVar;
                int i5 = bVar2.label;
                if ((i5 & Integer.MIN_VALUE) != 0) {
                    bVar2.label = i5 - Integer.MIN_VALUE;
                    b bVar3 = bVar2;
                    Object obj2 = bVar3.result;
                    W5.a aVar3 = W5.a.f2787d;
                    i2 = bVar3.label;
                    if (i2 != 0) {
                        V6.b.P(obj2);
                        Map<String, String> c7 = I.c();
                        Map<String, P3.h> c8 = I.c();
                        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                        linkedHashMap4.put("timezone_id", com.onesignal.common.l.INSTANCE.getTimeZoneId());
                        linkedHashMap4.put("language", this._languageContext.getLanguage());
                        if (fVar3.getExternalId() != null) {
                            c7 = I.j(c7);
                            String externalId = fVar3.getExternalId();
                            Intrinsics.b(externalId);
                            c7.put("external_id", externalId);
                        }
                        map = c7;
                        for (F2.g gVar : list) {
                            if (gVar instanceof U3.a) {
                                c8 = createSubscriptionsFromOperation((U3.a) gVar, c8);
                            } else if (gVar instanceof U3.p) {
                                c8 = createSubscriptionsFromOperation((U3.p) gVar, c8);
                            } else if (gVar instanceof U3.q) {
                                c8 = createSubscriptionsFromOperation((U3.q) gVar, c8);
                            } else {
                                if (!(gVar instanceof U3.c)) {
                                    throw new Exception("Unrecognized operation: " + gVar);
                                }
                                c8 = createSubscriptionsFromOperation((U3.c) gVar, c8);
                            }
                        }
                        k7 = K.k(c8);
                        String resolveJwt = com.onesignal.user.internal.operations.impl.executors.c.resolveJwt(fVar3, this._jwtTokenStore, this._identityVerificationService);
                        P3.d dVar = this._userBackend;
                        String appId = fVar3.getAppId();
                        ArrayList arrayList = new ArrayList(s.g(k7, 10));
                        Iterator it = k7.iterator();
                        while (it.hasNext()) {
                            arrayList.add((P3.h) ((Pair) it.next()).f6113e);
                        }
                        bVar3.L$0 = this;
                        bVar3.L$1 = fVar3;
                        bVar3.L$2 = map;
                        bVar3.L$3 = k7;
                        bVar3.label = 1;
                        createUser = dVar.createUser(appId, map, arrayList, linkedHashMap4, resolveJwt, bVar3);
                        if (createUser == aVar3) {
                            return aVar3;
                        }
                        iVar = this;
                    } else {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            str3 = (String) bVar3.L$3;
                            ?? r32 = (Map) bVar3.L$2;
                            map2 = (Map) bVar3.L$1;
                            fVar2 = (U3.f) bVar3.L$0;
                            V6.b.P(obj2);
                            list2 = null;
                            linkedHashMap3 = r32;
                            str2 = str3;
                            linkedHashMap2 = linkedHashMap3;
                            map = map2;
                            fVar3 = fVar2;
                            return new F2.a(F2.b.SUCCESS, linkedHashMap2, map.isEmpty() ? kotlin.collections.q.b(new U3.h(fVar3.getAppId(), str2, fVar3.getExternalId())) : list2, null, 8, null);
                        }
                        List list3 = (List) bVar3.L$3;
                        Map<String, String> map3 = (Map) bVar3.L$2;
                        U3.f fVar4 = (U3.f) bVar3.L$1;
                        i iVar2 = (i) bVar3.L$0;
                        V6.b.P(obj2);
                        k7 = list3;
                        fVar3 = fVar4;
                        iVar = iVar2;
                        map = map3;
                        createUser = obj2;
                    }
                    P3.a aVar4 = (P3.a) createUser;
                    linkedHashMap = new LinkedHashMap();
                    String str4 = aVar4.getIdentities().get("onesignal_id");
                    Intrinsics.b(str4);
                    String str5 = str4;
                    linkedHashMap.put(fVar3.getOnesignalId(), str5);
                    aVar = (T3.a) iVar._identityModelStore.getModel();
                    aVar2 = (com.onesignal.user.internal.properties.a) iVar._propertiesModelStore.getModel();
                    if (Intrinsics.a(aVar.getOnesignalId(), fVar3.getOnesignalId())) {
                        str = str5;
                    } else {
                        str = str5;
                        com.onesignal.common.modeling.i.setStringProperty$default(aVar, "onesignal_id", str, "HYDRATE", false, 8, null);
                    }
                    if (Intrinsics.a(aVar2.getOnesignalId(), fVar3.getOnesignalId())) {
                        str2 = str;
                    } else {
                        com.onesignal.common.modeling.i.setStringProperty$default(aVar2, "onesignalId", str, "HYDRATE", false, 8, null);
                        str2 = str;
                    }
                    LinkedHashSet B7 = CollectionsKt.B(aVar4.getSubscriptions());
                    for (Pair pair : k7) {
                        Iterator it2 = B7.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it2.next();
                            if (Intrinsics.a(((P3.h) obj).getId(), pair.f6112d)) {
                                break;
                            }
                        }
                        P3.h hVar3 = (P3.h) obj;
                        if (hVar3 == null) {
                            Iterator it3 = B7.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    hVar2 = 0;
                                    break;
                                }
                                hVar2 = it3.next();
                                P3.h hVar4 = (P3.h) hVar2;
                                if (Intrinsics.a(hVar4.getToken(), ((P3.h) pair.f6113e).getToken()) && (token = hVar4.getToken()) != null && !StringsKt.z(token)) {
                                    break;
                                }
                            }
                            hVar3 = hVar2;
                        }
                        if (hVar3 == null) {
                            Iterator it4 = B7.iterator();
                            while (true) {
                                if (!it4.hasNext()) {
                                    hVar = null;
                                    break;
                                }
                                ?? next = it4.next();
                                if (((P3.h) next).getType() == ((P3.h) pair.f6113e).getType()) {
                                    hVar = next;
                                    break;
                                }
                            }
                            hVar3 = hVar;
                        }
                        if (hVar3 != null) {
                            Object obj3 = pair.f6112d;
                            String id = hVar3.getId();
                            Intrinsics.b(id);
                            linkedHashMap.put(obj3, id);
                            if (Intrinsics.a(((com.onesignal.core.internal.config.b) iVar._configModelStore.getModel()).getPushSubscriptionId(), obj3)) {
                                ((com.onesignal.core.internal.config.b) iVar._configModelStore.getModel()).setPushSubscriptionId(hVar3.getId());
                            }
                            Y3.d dVar2 = (Y3.d) iVar._subscriptionsModelStore.get((String) obj3);
                            if (dVar2 != null) {
                                String id2 = hVar3.getId();
                                Intrinsics.b(id2);
                                com.onesignal.common.modeling.i.setStringProperty$default(dVar2, "id", id2, "HYDRATE", false, 8, null);
                            }
                        } else {
                            com.onesignal.debug.internal.logging.b.error$default("LoginUserOperationExecutor.createUser response is missing subscription data for " + ((String) pair.f6112d), null, 2, null);
                        }
                        kotlin.jvm.internal.I.a(B7);
                        B7.remove(hVar3);
                    }
                    list2 = null;
                    if (iVar._identityVerificationService.getNewCodePathsRun() || (rywData = aVar4.getRywData()) == null) {
                        linkedHashMap2 = linkedHashMap;
                        return new F2.a(F2.b.SUCCESS, linkedHashMap2, map.isEmpty() ? kotlin.collections.q.b(new U3.h(fVar3.getAppId(), str2, fVar3.getExternalId())) : list2, null, 8, null);
                    }
                    q2.c cVar = iVar._consistencyManager;
                    EnumC0826a enumC0826a = EnumC0826a.USER;
                    bVar3.L$0 = fVar3;
                    bVar3.L$1 = map;
                    bVar3.L$2 = linkedHashMap;
                    bVar3.L$3 = str2;
                    bVar3.label = 2;
                    if (cVar.setRywData(str2, enumC0826a, rywData, bVar3) != aVar3) {
                        fVar2 = fVar3;
                        map2 = map;
                        linkedHashMap3 = linkedHashMap;
                        str3 = str2;
                        str2 = str3;
                        linkedHashMap2 = linkedHashMap3;
                        map = map2;
                        fVar3 = fVar2;
                        return new F2.a(F2.b.SUCCESS, linkedHashMap2, map.isEmpty() ? kotlin.collections.q.b(new U3.h(fVar3.getAppId(), str2, fVar3.getExternalId())) : list2, null, 8, null);
                    }
                    return aVar3;
                }
            }
            if (i2 != 0) {
            }
            P3.a aVar42 = (P3.a) createUser;
            linkedHashMap = new LinkedHashMap();
            String str42 = aVar42.getIdentities().get("onesignal_id");
            Intrinsics.b(str42);
            String str52 = str42;
            linkedHashMap.put(fVar3.getOnesignalId(), str52);
            aVar = (T3.a) iVar._identityModelStore.getModel();
            aVar2 = (com.onesignal.user.internal.properties.a) iVar._propertiesModelStore.getModel();
            if (Intrinsics.a(aVar.getOnesignalId(), fVar3.getOnesignalId())) {
            }
            if (Intrinsics.a(aVar2.getOnesignalId(), fVar3.getOnesignalId())) {
            }
            LinkedHashSet B72 = CollectionsKt.B(aVar42.getSubscriptions());
            while (r2.hasNext()) {
            }
            list2 = null;
            if (iVar._identityVerificationService.getNewCodePathsRun()) {
            }
            linkedHashMap2 = linkedHashMap;
            return new F2.a(F2.b.SUCCESS, linkedHashMap2, map.isEmpty() ? kotlin.collections.q.b(new U3.h(fVar3.getAppId(), str2, fVar3.getExternalId())) : list2, null, 8, null);
        } catch (C0846a e7) {
            int i7 = j.$EnumSwitchMapping$1[com.onesignal.common.g.INSTANCE.getResponseStatusType(e7.getStatusCode()).ordinal()];
            return i7 != 1 ? i7 != 2 ? new F2.a(F2.b.FAIL_PAUSE_OPREPO, null, null, null, 14, null) : new F2.a(F2.b.FAIL_UNAUTHORIZED, null, null, e7.getRetryAfterSeconds(), 6, null) : new F2.a(F2.b.FAIL_RETRY, null, null, e7.getRetryAfterSeconds(), 6, null);
        }
        bVar2 = new b(bVar);
        b bVar32 = bVar2;
        Object obj22 = bVar32.result;
        W5.a aVar32 = W5.a.f2787d;
        i2 = bVar32.label;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object loginUser(U3.f fVar, List<? extends F2.g> list, V5.b bVar) {
        c cVar;
        int i2;
        i iVar;
        int i5;
        String str;
        U3.f fVar2 = fVar;
        List<? extends F2.g> list2 = list;
        if (bVar instanceof c) {
            cVar = (c) bVar;
            int i7 = cVar.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                cVar.label = i7 - Integer.MIN_VALUE;
                Object obj = cVar.result;
                W5.a aVar = W5.a.f2787d;
                i2 = cVar.label;
                if (i2 != 0) {
                    V6.b.P(obj);
                    if (list2 == null || !list2.isEmpty()) {
                        for (F2.g gVar : list2) {
                            if ((gVar instanceof U3.a) || (gVar instanceof U3.p)) {
                                break;
                            }
                        }
                    }
                    if (fVar2.getExternalId() == null) {
                        return new F2.a(F2.b.FAIL_NORETRY, null, null, null, 14, null);
                    }
                    if (fVar2.getExistingOnesignalId() == null || fVar2.getExternalId() == null || this._identityVerificationService.getIvBehaviorActive()) {
                        cVar.label = 1;
                        Object createUser = createUser(fVar2, list2, cVar);
                        if (createUser != aVar) {
                            return createUser;
                        }
                    } else {
                        d dVar = this._identityOperationExecutor;
                        String appId = fVar2.getAppId();
                        String existingOnesignalId = fVar2.getExistingOnesignalId();
                        Intrinsics.b(existingOnesignalId);
                        String externalId = fVar2.getExternalId();
                        String externalId2 = fVar2.getExternalId();
                        Intrinsics.b(externalId2);
                        List<? extends F2.g> b7 = kotlin.collections.q.b(new U3.i(appId, existingOnesignalId, externalId, "external_id", externalId2));
                        cVar.L$0 = this;
                        cVar.L$1 = fVar2;
                        cVar.L$2 = list2;
                        cVar.label = 2;
                        obj = dVar.execute(b7, cVar);
                        if (obj != aVar) {
                            iVar = this;
                        }
                    }
                    return aVar;
                }
                if (i2 == 1) {
                    V6.b.P(obj);
                    return obj;
                }
                if (i2 != 2) {
                    if (i2 == 3) {
                        V6.b.P(obj);
                        return obj;
                    }
                    if (i2 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    V6.b.P(obj);
                    return obj;
                }
                List<? extends F2.g> list3 = (List) cVar.L$2;
                U3.f fVar3 = (U3.f) cVar.L$1;
                iVar = (i) cVar.L$0;
                V6.b.P(obj);
                list2 = list3;
                fVar2 = fVar3;
                F2.a aVar2 = (F2.a) obj;
                i5 = j.$EnumSwitchMapping$0[aVar2.getResult().ordinal()];
                if (i5 != 1) {
                    String existingOnesignalId2 = fVar2.getExistingOnesignalId();
                    Intrinsics.b(existingOnesignalId2);
                    if (Intrinsics.a(((T3.a) iVar._identityModelStore.getModel()).getOnesignalId(), fVar2.getOnesignalId())) {
                        str = existingOnesignalId2;
                        com.onesignal.common.modeling.i.setStringProperty$default(iVar._identityModelStore.getModel(), "onesignal_id", str, "HYDRATE", false, 8, null);
                    } else {
                        str = existingOnesignalId2;
                    }
                    if (Intrinsics.a(((com.onesignal.user.internal.properties.a) iVar._propertiesModelStore.getModel()).getOnesignalId(), fVar2.getOnesignalId())) {
                        String str2 = str;
                        com.onesignal.common.modeling.i.setStringProperty$default(iVar._propertiesModelStore.getModel(), "onesignalId", str2, "HYDRATE", false, 8, null);
                        str = str2;
                    }
                    return new F2.a(F2.b.SUCCESS_STARTING_ONLY, H.b(new Pair(fVar2.getOnesignalId(), str)), null, null, 12, null);
                }
                if (i5 == 2) {
                    com.onesignal.debug.internal.logging.b.debug$default("LoginUserOperationExecutor now handling 409 response with \"code\": \"user-2\" by switching to user with \"external_id\": \"" + fVar2.getExternalId() + '\"', null, 2, null);
                    cVar.L$0 = null;
                    cVar.L$1 = null;
                    cVar.L$2 = null;
                    cVar.label = 3;
                    Object createUser2 = iVar.createUser(fVar2, list2, cVar);
                    if (createUser2 != aVar) {
                        return createUser2;
                    }
                } else {
                    if (i5 != 3) {
                        return new F2.a(aVar2.getResult(), null, null, null, 14, null);
                    }
                    com.onesignal.debug.internal.logging.b.error$default("LoginUserOperationExecutor encountered error. Attempt to recover by switching to user with \"external_id\": \"" + fVar2.getExternalId() + '\"', null, 2, null);
                    cVar.L$0 = null;
                    cVar.L$1 = null;
                    cVar.L$2 = null;
                    cVar.label = 4;
                    Object createUser3 = iVar.createUser(fVar2, list2, cVar);
                    if (createUser3 != aVar) {
                        return createUser3;
                    }
                }
                return aVar;
            }
        }
        cVar = new c(bVar);
        Object obj2 = cVar.result;
        W5.a aVar3 = W5.a.f2787d;
        i2 = cVar.label;
        if (i2 != 0) {
        }
        F2.a aVar22 = (F2.a) obj2;
        i5 = j.$EnumSwitchMapping$0[aVar22.getResult().ordinal()];
        if (i5 != 1) {
        }
    }

    @Override // F2.d
    public Object execute(List<? extends F2.g> list, V5.b bVar) {
        List<? extends F2.g> list2;
        com.onesignal.debug.internal.logging.b.debug$default("LoginUserOperationExecutor(operation: " + list + ')', null, 2, null);
        F2.g gVar = (F2.g) CollectionsKt.o(list);
        if (!(gVar instanceof U3.f)) {
            throw new Exception("Unrecognized operation: " + gVar);
        }
        U3.f fVar = (U3.f) gVar;
        Intrinsics.checkNotNullParameter(list, "<this>");
        int size = list.size() - 1;
        if (size <= 0) {
            list2 = A.f6115d;
        } else if (size == 1) {
            Intrinsics.checkNotNullParameter(list, "<this>");
            list2 = kotlin.collections.q.b(CollectionsKt.t(list));
        } else {
            ArrayList arrayList = new ArrayList(size);
            if (list instanceof RandomAccess) {
                int size2 = list.size();
                for (int i2 = 1; i2 < size2; i2++) {
                    arrayList.add(list.get(i2));
                }
            } else {
                ListIterator<? extends F2.g> listIterator = list.listIterator(1);
                while (listIterator.hasNext()) {
                    arrayList.add(listIterator.next());
                }
            }
            list2 = arrayList;
        }
        return loginUser(fVar, list2, bVar);
    }

    @Override // F2.d
    public List<String> getOperations() {
        return kotlin.collections.q.b(LOGIN_USER);
    }

    private final Map<String, P3.h> createSubscriptionsFromOperation(U3.a aVar, Map<String, P3.h> map) {
        P3.j jVar;
        LinkedHashMap j = I.j(map);
        int i2 = j.$EnumSwitchMapping$2[aVar.getType().ordinal()];
        if (i2 == 1) {
            jVar = P3.j.SMS;
        } else if (i2 != 2) {
            jVar = P3.j.Companion.fromDeviceType(this._deviceService.getDeviceType());
        } else {
            jVar = P3.j.EMAIL;
        }
        P3.j jVar2 = jVar;
        String subscriptionId = !com.onesignal.common.d.INSTANCE.isLocalId(aVar.getSubscriptionId()) ? aVar.getSubscriptionId() : null;
        String subscriptionId2 = aVar.getSubscriptionId();
        String address = aVar.getAddress();
        Boolean valueOf = Boolean.valueOf(aVar.getEnabled());
        Integer valueOf2 = Integer.valueOf(aVar.getStatus().getValue());
        String sdkVersion = com.onesignal.common.h.INSTANCE.getSdkVersion();
        String str = Build.MODEL;
        String str2 = Build.VERSION.RELEASE;
        Boolean valueOf3 = Boolean.valueOf(com.onesignal.common.k.INSTANCE.isRooted());
        com.onesignal.common.c cVar = com.onesignal.common.c.INSTANCE;
        j.put(subscriptionId2, new P3.h(subscriptionId, jVar2, address, valueOf, valueOf2, sdkVersion, str, str2, valueOf3, cVar.getNetType(this._application.getAppContext()), cVar.getCarrierName(this._application.getAppContext()), AndroidUtils.INSTANCE.getAppVersion(this._application.getAppContext())));
        return j;
    }

    private final Map<String, P3.h> createSubscriptionsFromOperation(U3.q qVar, Map<String, P3.h> map) {
        LinkedHashMap j = I.j(map);
        if (j.containsKey(qVar.getSubscriptionId())) {
            String subscriptionId = qVar.getSubscriptionId();
            P3.h hVar = map.get(qVar.getSubscriptionId());
            Intrinsics.b(hVar);
            String id = hVar.getId();
            P3.h hVar2 = map.get(qVar.getSubscriptionId());
            Intrinsics.b(hVar2);
            P3.j type = hVar2.getType();
            String address = qVar.getAddress();
            Boolean valueOf = Boolean.valueOf(qVar.getEnabled());
            Integer valueOf2 = Integer.valueOf(qVar.getStatus().getValue());
            P3.h hVar3 = map.get(qVar.getSubscriptionId());
            Intrinsics.b(hVar3);
            String sdk = hVar3.getSdk();
            P3.h hVar4 = map.get(qVar.getSubscriptionId());
            Intrinsics.b(hVar4);
            String deviceModel = hVar4.getDeviceModel();
            P3.h hVar5 = map.get(qVar.getSubscriptionId());
            Intrinsics.b(hVar5);
            String deviceOS = hVar5.getDeviceOS();
            P3.h hVar6 = map.get(qVar.getSubscriptionId());
            Intrinsics.b(hVar6);
            Boolean rooted = hVar6.getRooted();
            P3.h hVar7 = map.get(qVar.getSubscriptionId());
            Intrinsics.b(hVar7);
            Integer netType = hVar7.getNetType();
            P3.h hVar8 = map.get(qVar.getSubscriptionId());
            Intrinsics.b(hVar8);
            String carrier = hVar8.getCarrier();
            P3.h hVar9 = map.get(qVar.getSubscriptionId());
            Intrinsics.b(hVar9);
            j.put(subscriptionId, new P3.h(id, type, address, valueOf, valueOf2, sdk, deviceModel, deviceOS, rooted, netType, carrier, hVar9.getAppVersion()));
        }
        return j;
    }

    private final Map<String, P3.h> createSubscriptionsFromOperation(U3.c cVar, Map<String, P3.h> map) {
        LinkedHashMap j = I.j(map);
        j.remove(cVar.getSubscriptionId());
        return j;
    }
}
