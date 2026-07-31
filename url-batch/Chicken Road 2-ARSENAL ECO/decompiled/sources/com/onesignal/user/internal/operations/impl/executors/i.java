package com.onesignal.user.internal.operations.impl.executors;

import android.os.Build;
import b2.InterfaceC0265a;
import com.onesignal.common.AndroidUtils;
import d2.C0317a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;
import k5.C0477g;
import kotlin.jvm.internal.v;
import l5.AbstractC0506j;
import l5.AbstractC0508l;
import l5.C0512p;
import l5.t;
import n3.C0543a;
import n3.C0550h;
import n3.EnumC0552j;
import n3.InterfaceC0546d;
import o5.InterfaceC0564d;
import p5.EnumC0580a;
import q5.AbstractC0607c;
import r3.C0617a;
import u0.AbstractC0676f;

/* loaded from: classes.dex */
public final class i implements d2.d {
    public static final a Companion = new a(null);
    public static final String LOGIN_USER = "login-user";
    private final T1.f _application;
    private final com.onesignal.core.internal.config.c _configModelStore;
    private final O1.c _consistencyManager;
    private final Y1.c _deviceService;
    private final r3.b _identityModelStore;
    private final d _identityOperationExecutor;
    private final com.onesignal.core.internal.config.impl.c _identityVerificationService;
    private final com.onesignal.user.internal.jwt.c _jwtTokenStore;
    private final InterfaceC0265a _languageContext;
    private final com.onesignal.user.internal.properties.b _propertiesModelStore;
    private final w3.e _subscriptionsModelStore;
    private final InterfaceC0546d _userBackend;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends AbstractC0607c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public b(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return i.this.createUser(null, null, this);
        }
    }

    public static final class c extends AbstractC0607c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public c(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return i.this.loginUser(null, null, this);
        }
    }

    public i(d _identityOperationExecutor, T1.f _application, Y1.c _deviceService, InterfaceC0546d _userBackend, r3.b _identityModelStore, com.onesignal.user.internal.properties.b _propertiesModelStore, w3.e _subscriptionsModelStore, com.onesignal.core.internal.config.c _configModelStore, InterfaceC0265a _languageContext, com.onesignal.user.internal.jwt.c _jwtTokenStore, com.onesignal.core.internal.config.impl.c _identityVerificationService, O1.c _consistencyManager) {
        kotlin.jvm.internal.i.e(_identityOperationExecutor, "_identityOperationExecutor");
        kotlin.jvm.internal.i.e(_application, "_application");
        kotlin.jvm.internal.i.e(_deviceService, "_deviceService");
        kotlin.jvm.internal.i.e(_userBackend, "_userBackend");
        kotlin.jvm.internal.i.e(_identityModelStore, "_identityModelStore");
        kotlin.jvm.internal.i.e(_propertiesModelStore, "_propertiesModelStore");
        kotlin.jvm.internal.i.e(_subscriptionsModelStore, "_subscriptionsModelStore");
        kotlin.jvm.internal.i.e(_configModelStore, "_configModelStore");
        kotlin.jvm.internal.i.e(_languageContext, "_languageContext");
        kotlin.jvm.internal.i.e(_jwtTokenStore, "_jwtTokenStore");
        kotlin.jvm.internal.i.e(_identityVerificationService, "_identityVerificationService");
        kotlin.jvm.internal.i.e(_consistencyManager, "_consistencyManager");
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

    private final Map<String, C0550h> createSubscriptionsFromOperation(s3.p pVar, Map<String, C0550h> map) {
        LinkedHashMap v02 = t.v0(map);
        if (!v02.containsKey(pVar.getSubscriptionId())) {
            v02.put(pVar.getSubscriptionId(), new C0550h(pVar.getSubscriptionId(), null, null, null, null, null, null, null, null, null, null, null, 4094, null));
            return v02;
        }
        String subscriptionId = pVar.getSubscriptionId();
        String subscriptionId2 = pVar.getSubscriptionId();
        C0550h c0550h = map.get(pVar.getSubscriptionId());
        kotlin.jvm.internal.i.b(c0550h);
        EnumC0552j type = c0550h.getType();
        C0550h c0550h2 = map.get(pVar.getSubscriptionId());
        kotlin.jvm.internal.i.b(c0550h2);
        String token = c0550h2.getToken();
        C0550h c0550h3 = map.get(pVar.getSubscriptionId());
        kotlin.jvm.internal.i.b(c0550h3);
        Boolean enabled = c0550h3.getEnabled();
        C0550h c0550h4 = map.get(pVar.getSubscriptionId());
        kotlin.jvm.internal.i.b(c0550h4);
        Integer notificationTypes = c0550h4.getNotificationTypes();
        C0550h c0550h5 = map.get(pVar.getSubscriptionId());
        kotlin.jvm.internal.i.b(c0550h5);
        String sdk = c0550h5.getSdk();
        C0550h c0550h6 = map.get(pVar.getSubscriptionId());
        kotlin.jvm.internal.i.b(c0550h6);
        String deviceModel = c0550h6.getDeviceModel();
        C0550h c0550h7 = map.get(pVar.getSubscriptionId());
        kotlin.jvm.internal.i.b(c0550h7);
        String deviceOS = c0550h7.getDeviceOS();
        C0550h c0550h8 = map.get(pVar.getSubscriptionId());
        kotlin.jvm.internal.i.b(c0550h8);
        Boolean rooted = c0550h8.getRooted();
        C0550h c0550h9 = map.get(pVar.getSubscriptionId());
        kotlin.jvm.internal.i.b(c0550h9);
        Integer netType = c0550h9.getNetType();
        C0550h c0550h10 = map.get(pVar.getSubscriptionId());
        kotlin.jvm.internal.i.b(c0550h10);
        String carrier = c0550h10.getCarrier();
        C0550h c0550h11 = map.get(pVar.getSubscriptionId());
        kotlin.jvm.internal.i.b(c0550h11);
        v02.put(subscriptionId, new C0550h(subscriptionId2, type, token, enabled, notificationTypes, sdk, deviceModel, deviceOS, rooted, netType, carrier, c0550h11.getAppVersion()));
        return v02;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x02f5 A[Catch: a -> 0x0044, TryCatch #0 {a -> 0x0044, blocks: (B:13:0x003e, B:16:0x02ef, B:18:0x02f5, B:19:0x030b, B:27:0x005f, B:29:0x013d, B:31:0x0179, B:32:0x018b, B:34:0x0199, B:35:0x01ac, B:36:0x01b8, B:38:0x01be, B:39:0x01c8, B:41:0x01ce, B:46:0x01e6, B:48:0x01ea, B:49:0x01ee, B:51:0x01f4, B:53:0x020d, B:55:0x0213, B:58:0x021d, B:66:0x0222, B:67:0x0226, B:69:0x022c, B:73:0x0243, B:78:0x0248, B:80:0x0266, B:81:0x0275, B:83:0x0283, B:86:0x02b3, B:87:0x0299, B:92:0x02be, B:94:0x02c7, B:96:0x02cd, B:136:0x00f5, B:137:0x0116, B:139:0x011c, B:141:0x012a), top: B:8:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0179 A[Catch: a -> 0x0044, TryCatch #0 {a -> 0x0044, blocks: (B:13:0x003e, B:16:0x02ef, B:18:0x02f5, B:19:0x030b, B:27:0x005f, B:29:0x013d, B:31:0x0179, B:32:0x018b, B:34:0x0199, B:35:0x01ac, B:36:0x01b8, B:38:0x01be, B:39:0x01c8, B:41:0x01ce, B:46:0x01e6, B:48:0x01ea, B:49:0x01ee, B:51:0x01f4, B:53:0x020d, B:55:0x0213, B:58:0x021d, B:66:0x0222, B:67:0x0226, B:69:0x022c, B:73:0x0243, B:78:0x0248, B:80:0x0266, B:81:0x0275, B:83:0x0283, B:86:0x02b3, B:87:0x0299, B:92:0x02be, B:94:0x02c7, B:96:0x02cd, B:136:0x00f5, B:137:0x0116, B:139:0x011c, B:141:0x012a), top: B:8:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0199 A[Catch: a -> 0x0044, TryCatch #0 {a -> 0x0044, blocks: (B:13:0x003e, B:16:0x02ef, B:18:0x02f5, B:19:0x030b, B:27:0x005f, B:29:0x013d, B:31:0x0179, B:32:0x018b, B:34:0x0199, B:35:0x01ac, B:36:0x01b8, B:38:0x01be, B:39:0x01c8, B:41:0x01ce, B:46:0x01e6, B:48:0x01ea, B:49:0x01ee, B:51:0x01f4, B:53:0x020d, B:55:0x0213, B:58:0x021d, B:66:0x0222, B:67:0x0226, B:69:0x022c, B:73:0x0243, B:78:0x0248, B:80:0x0266, B:81:0x0275, B:83:0x0283, B:86:0x02b3, B:87:0x0299, B:92:0x02be, B:94:0x02c7, B:96:0x02cd, B:136:0x00f5, B:137:0x0116, B:139:0x011c, B:141:0x012a), top: B:8:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01be A[Catch: a -> 0x0044, TryCatch #0 {a -> 0x0044, blocks: (B:13:0x003e, B:16:0x02ef, B:18:0x02f5, B:19:0x030b, B:27:0x005f, B:29:0x013d, B:31:0x0179, B:32:0x018b, B:34:0x0199, B:35:0x01ac, B:36:0x01b8, B:38:0x01be, B:39:0x01c8, B:41:0x01ce, B:46:0x01e6, B:48:0x01ea, B:49:0x01ee, B:51:0x01f4, B:53:0x020d, B:55:0x0213, B:58:0x021d, B:66:0x0222, B:67:0x0226, B:69:0x022c, B:73:0x0243, B:78:0x0248, B:80:0x0266, B:81:0x0275, B:83:0x0283, B:86:0x02b3, B:87:0x0299, B:92:0x02be, B:94:0x02c7, B:96:0x02cd, B:136:0x00f5, B:137:0x0116, B:139:0x011c, B:141:0x012a), top: B:8:0x0028 }] */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createUser(s3.f fVar, List<? extends d2.g> list, InterfaceC0564d interfaceC0564d) {
        b bVar;
        int i7;
        Map<String, C0550h> map;
        List<C0477g> s02;
        Object createUser;
        i iVar;
        LinkedHashMap linkedHashMap;
        C0617a c0617a;
        com.onesignal.user.internal.properties.a aVar;
        String str;
        String str2;
        List list2;
        LinkedHashMap linkedHashMap2;
        M1.b rywData;
        s3.f fVar2;
        Map<String, C0550h> map2;
        LinkedHashMap linkedHashMap3;
        String str3;
        Object obj;
        C0550h c0550h;
        C0550h c0550h2;
        String token;
        s3.f fVar3 = fVar;
        try {
            if (interfaceC0564d instanceof b) {
                bVar = (b) interfaceC0564d;
                int i8 = bVar.label;
                if ((i8 & Integer.MIN_VALUE) != 0) {
                    bVar.label = i8 - Integer.MIN_VALUE;
                    b bVar2 = bVar;
                    Object obj2 = bVar2.result;
                    EnumC0580a enumC0580a = EnumC0580a.f5697f;
                    i7 = bVar2.label;
                    if (i7 != 0) {
                        AbstractC0676f.w(obj2);
                        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                        linkedHashMap4.put("timezone_id", com.onesignal.common.l.INSTANCE.getTimeZoneId());
                        linkedHashMap4.put("language", this._languageContext.getLanguage());
                        String externalId = fVar3.getExternalId();
                        Map<String, C0550h> map3 = l5.q.f5304f;
                        if (externalId != null) {
                            LinkedHashMap v02 = t.v0(map3);
                            String externalId2 = fVar3.getExternalId();
                            kotlin.jvm.internal.i.b(externalId2);
                            v02.put("external_id", externalId2);
                            map = v02;
                        } else {
                            map = map3;
                        }
                        for (d2.g gVar : list) {
                            if (gVar instanceof s3.a) {
                                map3 = createSubscriptionsFromOperation((s3.a) gVar, map3);
                            } else if (gVar instanceof s3.p) {
                                map3 = createSubscriptionsFromOperation((s3.p) gVar, map3);
                            } else if (gVar instanceof s3.q) {
                                map3 = createSubscriptionsFromOperation((s3.q) gVar, map3);
                            } else {
                                if (!(gVar instanceof s3.c)) {
                                    throw new Exception("Unrecognized operation: " + gVar);
                                }
                                map3 = createSubscriptionsFromOperation((s3.c) gVar, map3);
                            }
                        }
                        s02 = t.s0(map3);
                        String resolveJwt = com.onesignal.user.internal.operations.impl.executors.c.resolveJwt(fVar3, this._jwtTokenStore, this._identityVerificationService);
                        InterfaceC0546d interfaceC0546d = this._userBackend;
                        String appId = fVar3.getAppId();
                        ArrayList arrayList = new ArrayList(AbstractC0508l.C(s02, 10));
                        Iterator it = s02.iterator();
                        while (it.hasNext()) {
                            arrayList.add((C0550h) ((C0477g) it.next()).f5199g);
                        }
                        bVar2.L$0 = this;
                        bVar2.L$1 = fVar3;
                        bVar2.L$2 = map;
                        bVar2.L$3 = s02;
                        bVar2.label = 1;
                        createUser = interfaceC0546d.createUser(appId, map, arrayList, linkedHashMap4, resolveJwt, bVar2);
                        if (createUser == enumC0580a) {
                            return enumC0580a;
                        }
                        iVar = this;
                    } else {
                        if (i7 != 1) {
                            if (i7 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            str3 = (String) bVar2.L$3;
                            ?? r32 = (Map) bVar2.L$2;
                            map2 = (Map) bVar2.L$1;
                            fVar2 = (s3.f) bVar2.L$0;
                            AbstractC0676f.w(obj2);
                            list2 = null;
                            linkedHashMap3 = r32;
                            str2 = str3;
                            linkedHashMap2 = linkedHashMap3;
                            map = map2;
                            fVar3 = fVar2;
                            return new C0317a(d2.b.SUCCESS, linkedHashMap2, map.isEmpty() ? AbstractC0676f.n(new s3.h(fVar3.getAppId(), str2, fVar3.getExternalId())) : list2, null, 8, null);
                        }
                        List list3 = (List) bVar2.L$3;
                        Map<String, C0550h> map4 = (Map) bVar2.L$2;
                        s3.f fVar4 = (s3.f) bVar2.L$1;
                        i iVar2 = (i) bVar2.L$0;
                        AbstractC0676f.w(obj2);
                        s02 = list3;
                        fVar3 = fVar4;
                        iVar = iVar2;
                        map = map4;
                        createUser = obj2;
                    }
                    C0543a c0543a = (C0543a) createUser;
                    linkedHashMap = new LinkedHashMap();
                    String str4 = c0543a.getIdentities().get("onesignal_id");
                    kotlin.jvm.internal.i.b(str4);
                    String str5 = str4;
                    linkedHashMap.put(fVar3.getOnesignalId(), str5);
                    c0617a = (C0617a) iVar._identityModelStore.getModel();
                    aVar = (com.onesignal.user.internal.properties.a) iVar._propertiesModelStore.getModel();
                    if (kotlin.jvm.internal.i.a(c0617a.getOnesignalId(), fVar3.getOnesignalId())) {
                        str = str5;
                    } else {
                        str = str5;
                        com.onesignal.common.modeling.i.setStringProperty$default(c0617a, "onesignal_id", str, "HYDRATE", false, 8, null);
                    }
                    if (kotlin.jvm.internal.i.a(aVar.getOnesignalId(), fVar3.getOnesignalId())) {
                        str2 = str;
                    } else {
                        com.onesignal.common.modeling.i.setStringProperty$default(aVar, "onesignalId", str, "HYDRATE", false, 8, null);
                        str2 = str;
                    }
                    Set S3 = AbstractC0506j.S(c0543a.getSubscriptions());
                    for (C0477g c0477g : s02) {
                        Iterator it2 = S3.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it2.next();
                            if (kotlin.jvm.internal.i.a(((C0550h) obj).getId(), c0477g.f5198f)) {
                                break;
                            }
                        }
                        C0550h c0550h3 = (C0550h) obj;
                        if (c0550h3 == null) {
                            Iterator it3 = S3.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    c0550h2 = 0;
                                    break;
                                }
                                c0550h2 = it3.next();
                                C0550h c0550h4 = (C0550h) c0550h2;
                                if (kotlin.jvm.internal.i.a(c0550h4.getToken(), ((C0550h) c0477g.f5199g).getToken()) && (token = c0550h4.getToken()) != null && !F5.j.T(token)) {
                                    break;
                                }
                            }
                            c0550h3 = c0550h2;
                        }
                        if (c0550h3 == null) {
                            Iterator it4 = S3.iterator();
                            while (true) {
                                if (!it4.hasNext()) {
                                    c0550h = null;
                                    break;
                                }
                                ?? next = it4.next();
                                if (((C0550h) next).getType() == ((C0550h) c0477g.f5199g).getType()) {
                                    c0550h = next;
                                    break;
                                }
                            }
                            c0550h3 = c0550h;
                        }
                        if (c0550h3 != null) {
                            Object obj3 = c0477g.f5198f;
                            String id = c0550h3.getId();
                            kotlin.jvm.internal.i.b(id);
                            linkedHashMap.put(obj3, id);
                            if (kotlin.jvm.internal.i.a(((com.onesignal.core.internal.config.b) iVar._configModelStore.getModel()).getPushSubscriptionId(), obj3)) {
                                ((com.onesignal.core.internal.config.b) iVar._configModelStore.getModel()).setPushSubscriptionId(c0550h3.getId());
                            }
                            w3.d dVar = (w3.d) iVar._subscriptionsModelStore.get((String) obj3);
                            if (dVar != null) {
                                String id2 = c0550h3.getId();
                                kotlin.jvm.internal.i.b(id2);
                                com.onesignal.common.modeling.i.setStringProperty$default(dVar, "id", id2, "HYDRATE", false, 8, null);
                            }
                        } else {
                            com.onesignal.debug.internal.logging.b.error$default("LoginUserOperationExecutor.createUser response is missing subscription data for " + ((String) c0477g.f5198f), null, 2, null);
                        }
                        v.a(S3);
                        S3.remove(c0550h3);
                    }
                    list2 = null;
                    if (iVar._identityVerificationService.getNewCodePathsRun() || (rywData = c0543a.getRywData()) == null) {
                        linkedHashMap2 = linkedHashMap;
                        return new C0317a(d2.b.SUCCESS, linkedHashMap2, map.isEmpty() ? AbstractC0676f.n(new s3.h(fVar3.getAppId(), str2, fVar3.getExternalId())) : list2, null, 8, null);
                    }
                    O1.c cVar = iVar._consistencyManager;
                    N1.a aVar2 = N1.a.USER;
                    bVar2.L$0 = fVar3;
                    bVar2.L$1 = map;
                    bVar2.L$2 = linkedHashMap;
                    bVar2.L$3 = str2;
                    bVar2.label = 2;
                    if (cVar.setRywData(str2, aVar2, rywData, bVar2) != enumC0580a) {
                        fVar2 = fVar3;
                        map2 = map;
                        linkedHashMap3 = linkedHashMap;
                        str3 = str2;
                        str2 = str3;
                        linkedHashMap2 = linkedHashMap3;
                        map = map2;
                        fVar3 = fVar2;
                        return new C0317a(d2.b.SUCCESS, linkedHashMap2, map.isEmpty() ? AbstractC0676f.n(new s3.h(fVar3.getAppId(), str2, fVar3.getExternalId())) : list2, null, 8, null);
                    }
                    return enumC0580a;
                }
            }
            if (i7 != 0) {
            }
            C0543a c0543a2 = (C0543a) createUser;
            linkedHashMap = new LinkedHashMap();
            String str42 = c0543a2.getIdentities().get("onesignal_id");
            kotlin.jvm.internal.i.b(str42);
            String str52 = str42;
            linkedHashMap.put(fVar3.getOnesignalId(), str52);
            c0617a = (C0617a) iVar._identityModelStore.getModel();
            aVar = (com.onesignal.user.internal.properties.a) iVar._propertiesModelStore.getModel();
            if (kotlin.jvm.internal.i.a(c0617a.getOnesignalId(), fVar3.getOnesignalId())) {
            }
            if (kotlin.jvm.internal.i.a(aVar.getOnesignalId(), fVar3.getOnesignalId())) {
            }
            Set S32 = AbstractC0506j.S(c0543a2.getSubscriptions());
            while (r2.hasNext()) {
            }
            list2 = null;
            if (iVar._identityVerificationService.getNewCodePathsRun()) {
            }
            linkedHashMap2 = linkedHashMap;
            return new C0317a(d2.b.SUCCESS, linkedHashMap2, map.isEmpty() ? AbstractC0676f.n(new s3.h(fVar3.getAppId(), str2, fVar3.getExternalId())) : list2, null, 8, null);
        } catch (P1.a e4) {
            int i9 = j.$EnumSwitchMapping$1[com.onesignal.common.g.INSTANCE.getResponseStatusType(e4.getStatusCode()).ordinal()];
            return i9 != 1 ? i9 != 2 ? new C0317a(d2.b.FAIL_PAUSE_OPREPO, null, null, null, 14, null) : new C0317a(d2.b.FAIL_UNAUTHORIZED, null, null, e4.getRetryAfterSeconds(), 6, null) : new C0317a(d2.b.FAIL_RETRY, null, null, e4.getRetryAfterSeconds(), 6, null);
        }
        bVar = new b(interfaceC0564d);
        b bVar22 = bVar;
        Object obj22 = bVar22.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = bVar22.label;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object loginUser(s3.f fVar, List<? extends d2.g> list, InterfaceC0564d interfaceC0564d) {
        c cVar;
        int i7;
        i iVar;
        int i8;
        String str;
        s3.f fVar2 = fVar;
        List<? extends d2.g> list2 = list;
        if (interfaceC0564d instanceof c) {
            cVar = (c) interfaceC0564d;
            int i9 = cVar.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                cVar.label = i9 - Integer.MIN_VALUE;
                Object obj = cVar.result;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                i7 = cVar.label;
                if (i7 != 0) {
                    AbstractC0676f.w(obj);
                    if (list2 == null || !list2.isEmpty()) {
                        for (d2.g gVar : list2) {
                            if ((gVar instanceof s3.a) || (gVar instanceof s3.p)) {
                                break;
                            }
                        }
                    }
                    if (fVar2.getExternalId() == null) {
                        return new C0317a(d2.b.FAIL_NORETRY, null, null, null, 14, null);
                    }
                    if (fVar2.getExistingOnesignalId() == null || fVar2.getExternalId() == null || this._identityVerificationService.getIvBehaviorActive()) {
                        cVar.label = 1;
                        Object createUser = createUser(fVar2, list2, cVar);
                        if (createUser != enumC0580a) {
                            return createUser;
                        }
                    } else {
                        d dVar = this._identityOperationExecutor;
                        String appId = fVar2.getAppId();
                        String existingOnesignalId = fVar2.getExistingOnesignalId();
                        kotlin.jvm.internal.i.b(existingOnesignalId);
                        String externalId = fVar2.getExternalId();
                        String externalId2 = fVar2.getExternalId();
                        kotlin.jvm.internal.i.b(externalId2);
                        List<? extends d2.g> n7 = AbstractC0676f.n(new s3.i(appId, existingOnesignalId, externalId, "external_id", externalId2));
                        cVar.L$0 = this;
                        cVar.L$1 = fVar2;
                        cVar.L$2 = list2;
                        cVar.label = 2;
                        obj = dVar.execute(n7, cVar);
                        if (obj != enumC0580a) {
                            iVar = this;
                        }
                    }
                    return enumC0580a;
                }
                if (i7 == 1) {
                    AbstractC0676f.w(obj);
                    return obj;
                }
                if (i7 != 2) {
                    if (i7 == 3) {
                        AbstractC0676f.w(obj);
                        return obj;
                    }
                    if (i7 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0676f.w(obj);
                    return obj;
                }
                List<? extends d2.g> list3 = (List) cVar.L$2;
                s3.f fVar3 = (s3.f) cVar.L$1;
                iVar = (i) cVar.L$0;
                AbstractC0676f.w(obj);
                list2 = list3;
                fVar2 = fVar3;
                C0317a c0317a = (C0317a) obj;
                i8 = j.$EnumSwitchMapping$0[c0317a.getResult().ordinal()];
                if (i8 != 1) {
                    String existingOnesignalId2 = fVar2.getExistingOnesignalId();
                    kotlin.jvm.internal.i.b(existingOnesignalId2);
                    if (kotlin.jvm.internal.i.a(((C0617a) iVar._identityModelStore.getModel()).getOnesignalId(), fVar2.getOnesignalId())) {
                        str = existingOnesignalId2;
                        com.onesignal.common.modeling.i.setStringProperty$default(iVar._identityModelStore.getModel(), "onesignal_id", str, "HYDRATE", false, 8, null);
                    } else {
                        str = existingOnesignalId2;
                    }
                    if (kotlin.jvm.internal.i.a(((com.onesignal.user.internal.properties.a) iVar._propertiesModelStore.getModel()).getOnesignalId(), fVar2.getOnesignalId())) {
                        String str2 = str;
                        com.onesignal.common.modeling.i.setStringProperty$default(iVar._propertiesModelStore.getModel(), "onesignalId", str2, "HYDRATE", false, 8, null);
                        str = str2;
                    }
                    return new C0317a(d2.b.SUCCESS_STARTING_ONLY, t.q0(new C0477g(fVar2.getOnesignalId(), str)), null, null, 12, null);
                }
                if (i8 == 2) {
                    com.onesignal.debug.internal.logging.b.debug$default("LoginUserOperationExecutor now handling 409 response with \"code\": \"user-2\" by switching to user with \"external_id\": \"" + fVar2.getExternalId() + '\"', null, 2, null);
                    cVar.L$0 = null;
                    cVar.L$1 = null;
                    cVar.L$2 = null;
                    cVar.label = 3;
                    Object createUser2 = iVar.createUser(fVar2, list2, cVar);
                    if (createUser2 != enumC0580a) {
                        return createUser2;
                    }
                } else {
                    if (i8 != 3) {
                        return new C0317a(c0317a.getResult(), null, null, null, 14, null);
                    }
                    com.onesignal.debug.internal.logging.b.error$default("LoginUserOperationExecutor encountered error. Attempt to recover by switching to user with \"external_id\": \"" + fVar2.getExternalId() + '\"', null, 2, null);
                    cVar.L$0 = null;
                    cVar.L$1 = null;
                    cVar.L$2 = null;
                    cVar.label = 4;
                    Object createUser3 = iVar.createUser(fVar2, list2, cVar);
                    if (createUser3 != enumC0580a) {
                        return createUser3;
                    }
                }
                return enumC0580a;
            }
        }
        cVar = new c(interfaceC0564d);
        Object obj2 = cVar.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = cVar.label;
        if (i7 != 0) {
        }
        C0317a c0317a2 = (C0317a) obj2;
        i8 = j.$EnumSwitchMapping$0[c0317a2.getResult().ordinal()];
        if (i8 != 1) {
        }
    }

    @Override // d2.d
    public Object execute(List<? extends d2.g> list, InterfaceC0564d interfaceC0564d) {
        List<? extends d2.g> list2;
        com.onesignal.debug.internal.logging.b.debug$default("LoginUserOperationExecutor(operation: " + list + ')', null, 2, null);
        d2.g gVar = (d2.g) AbstractC0506j.E(list);
        if (!(gVar instanceof s3.f)) {
            throw new Exception("Unrecognized operation: " + gVar);
        }
        s3.f fVar = (s3.f) gVar;
        int size = list.size() - 1;
        if (size <= 0) {
            list2 = C0512p.f5303f;
        } else if (size == 1) {
            list2 = AbstractC0676f.n(AbstractC0506j.J(list));
        } else {
            ArrayList arrayList = new ArrayList(size);
            if (list instanceof RandomAccess) {
                int size2 = list.size();
                for (int i7 = 1; i7 < size2; i7++) {
                    arrayList.add(list.get(i7));
                }
            } else {
                ListIterator<? extends d2.g> listIterator = list.listIterator(1);
                while (listIterator.hasNext()) {
                    arrayList.add(listIterator.next());
                }
            }
            list2 = arrayList;
        }
        return loginUser(fVar, list2, interfaceC0564d);
    }

    @Override // d2.d
    public List<String> getOperations() {
        return AbstractC0676f.n(LOGIN_USER);
    }

    private final Map<String, C0550h> createSubscriptionsFromOperation(s3.a aVar, Map<String, C0550h> map) {
        EnumC0552j enumC0552j;
        LinkedHashMap v02 = t.v0(map);
        int i7 = j.$EnumSwitchMapping$2[aVar.getType().ordinal()];
        if (i7 == 1) {
            enumC0552j = EnumC0552j.SMS;
        } else if (i7 != 2) {
            enumC0552j = EnumC0552j.Companion.fromDeviceType(this._deviceService.getDeviceType());
        } else {
            enumC0552j = EnumC0552j.EMAIL;
        }
        EnumC0552j enumC0552j2 = enumC0552j;
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
        v02.put(subscriptionId2, new C0550h(subscriptionId, enumC0552j2, address, valueOf, valueOf2, sdkVersion, str, str2, valueOf3, cVar.getNetType(this._application.getAppContext()), cVar.getCarrierName(this._application.getAppContext()), AndroidUtils.INSTANCE.getAppVersion(this._application.getAppContext())));
        return v02;
    }

    private final Map<String, C0550h> createSubscriptionsFromOperation(s3.q qVar, Map<String, C0550h> map) {
        LinkedHashMap v02 = t.v0(map);
        if (v02.containsKey(qVar.getSubscriptionId())) {
            String subscriptionId = qVar.getSubscriptionId();
            C0550h c0550h = map.get(qVar.getSubscriptionId());
            kotlin.jvm.internal.i.b(c0550h);
            String id = c0550h.getId();
            C0550h c0550h2 = map.get(qVar.getSubscriptionId());
            kotlin.jvm.internal.i.b(c0550h2);
            EnumC0552j type = c0550h2.getType();
            String address = qVar.getAddress();
            Boolean valueOf = Boolean.valueOf(qVar.getEnabled());
            Integer valueOf2 = Integer.valueOf(qVar.getStatus().getValue());
            C0550h c0550h3 = map.get(qVar.getSubscriptionId());
            kotlin.jvm.internal.i.b(c0550h3);
            String sdk = c0550h3.getSdk();
            C0550h c0550h4 = map.get(qVar.getSubscriptionId());
            kotlin.jvm.internal.i.b(c0550h4);
            String deviceModel = c0550h4.getDeviceModel();
            C0550h c0550h5 = map.get(qVar.getSubscriptionId());
            kotlin.jvm.internal.i.b(c0550h5);
            String deviceOS = c0550h5.getDeviceOS();
            C0550h c0550h6 = map.get(qVar.getSubscriptionId());
            kotlin.jvm.internal.i.b(c0550h6);
            Boolean rooted = c0550h6.getRooted();
            C0550h c0550h7 = map.get(qVar.getSubscriptionId());
            kotlin.jvm.internal.i.b(c0550h7);
            Integer netType = c0550h7.getNetType();
            C0550h c0550h8 = map.get(qVar.getSubscriptionId());
            kotlin.jvm.internal.i.b(c0550h8);
            String carrier = c0550h8.getCarrier();
            C0550h c0550h9 = map.get(qVar.getSubscriptionId());
            kotlin.jvm.internal.i.b(c0550h9);
            v02.put(subscriptionId, new C0550h(id, type, address, valueOf, valueOf2, sdk, deviceModel, deviceOS, rooted, netType, carrier, c0550h9.getAppVersion()));
        }
        return v02;
    }

    private final Map<String, C0550h> createSubscriptionsFromOperation(s3.c cVar, Map<String, C0550h> map) {
        LinkedHashMap v02 = t.v0(map);
        v02.remove(cVar.getSubscriptionId());
        return v02;
    }
}
