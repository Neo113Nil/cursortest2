package com.onesignal.user.internal.operations.impl.executors;

import d2.C0317a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k5.C0477g;
import l5.AbstractC0506j;
import n3.C0543a;
import n3.C0550h;
import n3.EnumC0552j;
import n3.InterfaceC0546d;
import o3.InterfaceC0559a;
import o5.InterfaceC0564d;
import p5.EnumC0580a;
import q5.AbstractC0607c;
import r3.C0617a;
import u0.AbstractC0676f;
import u3.C0692a;
import w3.f;

/* loaded from: classes.dex */
public final class l implements d2.d {
    public static final a Companion = new a(null);
    public static final String REFRESH_USER = "refresh-user";
    private final InterfaceC0559a _buildUserService;
    private final com.onesignal.core.internal.config.c _configModelStore;
    private final r3.b _identityModelStore;
    private final com.onesignal.core.internal.config.impl.c _identityVerificationService;
    private final com.onesignal.user.internal.jwt.c _jwtTokenStore;
    private final C0692a _newRecordState;
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
        int label;
        /* synthetic */ Object result;

        public b(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return l.this.getUser(null, this);
        }
    }

    public l(InterfaceC0546d _userBackend, r3.b _identityModelStore, com.onesignal.user.internal.properties.b _propertiesModelStore, w3.e _subscriptionsModelStore, com.onesignal.core.internal.config.c _configModelStore, InterfaceC0559a _buildUserService, C0692a _newRecordState, com.onesignal.user.internal.jwt.c _jwtTokenStore, com.onesignal.core.internal.config.impl.c _identityVerificationService) {
        kotlin.jvm.internal.i.e(_userBackend, "_userBackend");
        kotlin.jvm.internal.i.e(_identityModelStore, "_identityModelStore");
        kotlin.jvm.internal.i.e(_propertiesModelStore, "_propertiesModelStore");
        kotlin.jvm.internal.i.e(_subscriptionsModelStore, "_subscriptionsModelStore");
        kotlin.jvm.internal.i.e(_configModelStore, "_configModelStore");
        kotlin.jvm.internal.i.e(_buildUserService, "_buildUserService");
        kotlin.jvm.internal.i.e(_newRecordState, "_newRecordState");
        kotlin.jvm.internal.i.e(_jwtTokenStore, "_jwtTokenStore");
        kotlin.jvm.internal.i.e(_identityVerificationService, "_identityVerificationService");
        this._userBackend = _userBackend;
        this._identityModelStore = _identityModelStore;
        this._propertiesModelStore = _propertiesModelStore;
        this._subscriptionsModelStore = _subscriptionsModelStore;
        this._configModelStore = _configModelStore;
        this._buildUserService = _buildUserService;
        this._newRecordState = _newRecordState;
        this._jwtTokenStore = _jwtTokenStore;
        this._identityVerificationService = _identityVerificationService;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final s3.q buildPushSelfHealOperationForStuckSubscription(s3.h hVar, C0550h c0550h, String str) {
        boolean z5;
        w3.d dVar = (w3.d) this._subscriptionsModelStore.get(str);
        if (dVar != null && dVar.getType() == w3.g.PUSH) {
            C0477g subscriptionEnabledAndStatus = t3.c.Companion.getSubscriptionEnabledAndStatus(dVar);
            boolean booleanValue = ((Boolean) subscriptionEnabledAndStatus.f5198f).booleanValue();
            w3.f fVar = (w3.f) subscriptionEnabledAndStatus.f5199g;
            if (kotlin.jvm.internal.i.a(c0550h.getEnabled(), Boolean.TRUE)) {
                Integer notificationTypes = c0550h.getNotificationTypes();
                if ((notificationTypes != null ? notificationTypes.intValue() : 0) > 0) {
                    z5 = true;
                    if ((booleanValue || z5) ? false : true) {
                        com.onesignal.debug.internal.logging.b.info$default("RefreshUserOperationExecutor: push subscription " + str + " diverged from server (server enabled=" + c0550h.getEnabled() + " notificationTypes=" + c0550h.getNotificationTypes() + "; local opted-in and SUBSCRIBED). Enqueuing follow-up update-subscription op to re-assert local truth via PATCH /subscriptions/{id}.", null, 2, null);
                        return new s3.q(hVar.getAppId(), hVar.getOnesignalId(), ((C0617a) this._identityModelStore.getModel()).getExternalId(), str, dVar.getType(), booleanValue, dVar.getAddress(), fVar);
                    }
                }
            }
            z5 = false;
            if ((booleanValue || z5) ? false : true) {
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008c A[Catch: a -> 0x003a, TryCatch #1 {a -> 0x003a, blocks: (B:12:0x0036, B:13:0x0074, B:15:0x008c, B:18:0x009d, B:19:0x00ae, B:21:0x00b4, B:23:0x00c6, B:25:0x00dc, B:26:0x00e7, B:28:0x00f1, B:29:0x00fc, B:31:0x0106, B:32:0x0116, B:34:0x011c, B:37:0x0128, B:42:0x013b, B:43:0x015e, B:45:0x0164, B:49:0x0183, B:51:0x018e, B:53:0x019c, B:55:0x01a2, B:56:0x01a4, B:59:0x01ba, B:60:0x01c2, B:62:0x01cd, B:65:0x01d8, B:68:0x01e3, B:71:0x01ee, B:74:0x01f9, B:77:0x0204, B:91:0x020f, B:80:0x0214, B:85:0x0220, B:94:0x01bd, B:95:0x01c0, B:96:0x0195, B:99:0x0228, B:101:0x0232, B:102:0x0235, B:104:0x0248, B:105:0x0251), top: B:11:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009d A[Catch: a -> 0x003a, TryCatch #1 {a -> 0x003a, blocks: (B:12:0x0036, B:13:0x0074, B:15:0x008c, B:18:0x009d, B:19:0x00ae, B:21:0x00b4, B:23:0x00c6, B:25:0x00dc, B:26:0x00e7, B:28:0x00f1, B:29:0x00fc, B:31:0x0106, B:32:0x0116, B:34:0x011c, B:37:0x0128, B:42:0x013b, B:43:0x015e, B:45:0x0164, B:49:0x0183, B:51:0x018e, B:53:0x019c, B:55:0x01a2, B:56:0x01a4, B:59:0x01ba, B:60:0x01c2, B:62:0x01cd, B:65:0x01d8, B:68:0x01e3, B:71:0x01ee, B:74:0x01f9, B:77:0x0204, B:91:0x020f, B:80:0x0214, B:85:0x0220, B:94:0x01bd, B:95:0x01c0, B:96:0x0195, B:99:0x0228, B:101:0x0232, B:102:0x0235, B:104:0x0248, B:105:0x0251), top: B:11:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getUser(s3.h hVar, InterfaceC0564d interfaceC0564d) {
        b bVar;
        int i7;
        l lVar;
        int i8;
        w3.d dVar;
        s3.h hVar2 = hVar;
        if (interfaceC0564d instanceof b) {
            bVar = (b) interfaceC0564d;
            int i9 = bVar.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                bVar.label = i9 - Integer.MIN_VALUE;
                b bVar2 = bVar;
                Object obj = bVar2.result;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                i7 = bVar2.label;
                if (i7 != 0) {
                    AbstractC0676f.w(obj);
                    f resolveBackendParams = c.resolveBackendParams(hVar2, hVar2.getOnesignalId(), this._jwtTokenStore, this._identityVerificationService);
                    try {
                        InterfaceC0546d interfaceC0546d = this._userBackend;
                        String appId = hVar2.getAppId();
                        String aliasLabel = resolveBackendParams.getAliasLabel();
                        String aliasValue = resolveBackendParams.getAliasValue();
                        String jwt = resolveBackendParams.getJwt();
                        bVar2.L$0 = this;
                        bVar2.L$1 = hVar2;
                        bVar2.label = 1;
                        obj = interfaceC0546d.getUser(appId, aliasLabel, aliasValue, jwt, bVar2);
                        if (obj == enumC0580a) {
                            return enumC0580a;
                        }
                        lVar = this;
                    } catch (P1.a e4) {
                        e = e4;
                        lVar = this;
                        i8 = m.$EnumSwitchMapping$1[com.onesignal.common.g.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                        if (i8 != 1) {
                            return new C0317a(d2.b.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                        }
                        if (i8 == 2) {
                            return new C0317a(d2.b.FAIL_UNAUTHORIZED, null, null, e.getRetryAfterSeconds(), 6, null);
                        }
                        if (i8 != 3) {
                            return new C0317a(d2.b.FAIL_NORETRY, null, null, null, 14, null);
                        }
                        if (e.getStatusCode() == 404 && lVar._newRecordState.isInMissingRetryWindow(hVar2.getOnesignalId())) {
                            return new C0317a(d2.b.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                        }
                        List<d2.g> rebuildOperationsIfCurrentUser = lVar._buildUserService.getRebuildOperationsIfCurrentUser(hVar2.getAppId(), hVar2.getOnesignalId());
                        return rebuildOperationsIfCurrentUser == null ? new C0317a(d2.b.FAIL_NORETRY, null, null, null, 14, null) : new C0317a(d2.b.FAIL_RETRY, null, rebuildOperationsIfCurrentUser, e.getRetryAfterSeconds(), 2, null);
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    hVar2 = (s3.h) bVar2.L$1;
                    lVar = (l) bVar2.L$0;
                    try {
                        AbstractC0676f.w(obj);
                    } catch (P1.a e7) {
                        e = e7;
                        i8 = m.$EnumSwitchMapping$1[com.onesignal.common.g.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                        if (i8 != 1) {
                        }
                    }
                }
                C0543a c0543a = (C0543a) obj;
                if (kotlin.jvm.internal.i.a(hVar2.getOnesignalId(), ((C0617a) lVar._identityModelStore.getModel()).getOnesignalId())) {
                    return new C0317a(d2.b.SUCCESS, null, null, null, 14, null);
                }
                C0617a c0617a = new C0617a();
                for (Map.Entry<String, String> entry : c0543a.getIdentities().entrySet()) {
                    c0617a.put((C0617a) entry.getKey(), entry.getValue());
                }
                com.onesignal.user.internal.properties.a aVar = new com.onesignal.user.internal.properties.a();
                aVar.setOnesignalId(hVar2.getOnesignalId());
                if (c0543a.getProperties().getCountry() != null) {
                    aVar.setCountry(c0543a.getProperties().getCountry());
                }
                if (c0543a.getProperties().getLanguage() != null) {
                    aVar.setLanguage(c0543a.getProperties().getLanguage());
                }
                if (c0543a.getProperties().getTags() != null) {
                    for (Map.Entry<String, String> entry2 : c0543a.getProperties().getTags().entrySet()) {
                        if (entry2.getValue() != null) {
                            com.onesignal.common.modeling.h tags = aVar.getTags();
                            String key = entry2.getKey();
                            String value = entry2.getValue();
                            kotlin.jvm.internal.i.b(value);
                            tags.put((com.onesignal.common.modeling.h) key, value);
                        }
                    }
                }
                aVar.setTimezone(com.onesignal.common.l.INSTANCE.getTimeZoneId());
                String pushSubscriptionId = ((com.onesignal.core.internal.config.b) lVar._configModelStore.getModel()).getPushSubscriptionId();
                ArrayList arrayList = new ArrayList();
                s3.q qVar = null;
                for (C0550h c0550h : c0543a.getSubscriptions()) {
                    w3.d dVar2 = new w3.d();
                    String id = c0550h.getId();
                    kotlin.jvm.internal.i.b(id);
                    dVar2.setId(id);
                    String token = c0550h.getToken();
                    if (token == null) {
                        token = "";
                    }
                    dVar2.setAddress(token);
                    f.a aVar2 = w3.f.Companion;
                    Integer notificationTypes = c0550h.getNotificationTypes();
                    w3.f fromInt = aVar2.fromInt(notificationTypes != null ? notificationTypes.intValue() : w3.f.SUBSCRIBED.getValue());
                    if (fromInt == null) {
                        fromInt = w3.f.SUBSCRIBED;
                    }
                    dVar2.setStatus(fromInt);
                    EnumC0552j type = c0550h.getType();
                    kotlin.jvm.internal.i.b(type);
                    int i10 = m.$EnumSwitchMapping$0[type.ordinal()];
                    dVar2.setType(i10 != 1 ? i10 != 2 ? w3.g.PUSH : w3.g.SMS : w3.g.EMAIL);
                    dVar2.setOptedIn((dVar2.getStatus() == w3.f.UNSUBSCRIBE || dVar2.getStatus() == w3.f.DISABLED_FROM_REST_API_DEFAULT_REASON) ? false : true);
                    String sdk = c0550h.getSdk();
                    if (sdk == null) {
                        sdk = "";
                    }
                    dVar2.setSdk(sdk);
                    String deviceOS = c0550h.getDeviceOS();
                    if (deviceOS == null) {
                        deviceOS = "";
                    }
                    dVar2.setDeviceOS(deviceOS);
                    String carrier = c0550h.getCarrier();
                    if (carrier == null) {
                        carrier = "";
                    }
                    dVar2.setCarrier(carrier);
                    String appVersion = c0550h.getAppVersion();
                    if (appVersion == null) {
                        appVersion = "";
                    }
                    dVar2.setAppVersion(appVersion);
                    if (dVar2.getType() != w3.g.PUSH) {
                        arrayList.add(dVar2);
                    } else if (kotlin.jvm.internal.i.a(c0550h.getId(), pushSubscriptionId) && qVar == null) {
                        qVar = lVar.buildPushSelfHealOperationForStuckSubscription(hVar2, c0550h, pushSubscriptionId);
                    }
                }
                if (pushSubscriptionId != null && (dVar = (w3.d) lVar._subscriptionsModelStore.get(pushSubscriptionId)) != null) {
                    arrayList.add(dVar);
                }
                lVar._identityModelStore.replace(c0617a, "HYDRATE");
                lVar._propertiesModelStore.replace(aVar, "HYDRATE");
                lVar._subscriptionsModelStore.replaceAll(arrayList, "HYDRATE");
                return new C0317a(d2.b.SUCCESS, null, qVar != null ? AbstractC0676f.n(qVar) : null, null, 10, null);
            }
        }
        bVar = new b(interfaceC0564d);
        b bVar22 = bVar;
        Object obj2 = bVar22.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = bVar22.label;
        if (i7 != 0) {
        }
        C0543a c0543a2 = (C0543a) obj2;
        if (kotlin.jvm.internal.i.a(hVar2.getOnesignalId(), ((C0617a) lVar._identityModelStore.getModel()).getOnesignalId())) {
        }
    }

    @Override // d2.d
    public Object execute(List<? extends d2.g> list, InterfaceC0564d interfaceC0564d) {
        com.onesignal.debug.internal.logging.b.log(i2.c.DEBUG, "RefreshUserOperationExecutor(operation: " + list + ')');
        if (list == null || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (!(((d2.g) it.next()) instanceof s3.h)) {
                    throw new Exception("Unrecognized operation(s)! Attempted operations:\n" + list);
                }
            }
        }
        d2.g gVar = (d2.g) AbstractC0506j.E(list);
        if (gVar instanceof s3.h) {
            return getUser((s3.h) gVar, interfaceC0564d);
        }
        throw new Exception("Unrecognized operation: " + gVar);
    }

    @Override // d2.d
    public List<String> getOperations() {
        return AbstractC0676f.n(REFRESH_USER);
    }
}
