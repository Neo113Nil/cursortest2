package com.onesignal.user.internal.operations.impl.executors;

import Y3.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import r2.C0846a;

/* loaded from: classes.dex */
public final class l implements F2.d {
    public static final a Companion = new a(null);
    public static final String REFRESH_USER = "refresh-user";
    private final Q3.a _buildUserService;
    private final com.onesignal.core.internal.config.c _configModelStore;
    private final T3.b _identityModelStore;
    private final com.onesignal.core.internal.config.impl.c _identityVerificationService;
    private final com.onesignal.user.internal.jwt.c _jwtTokenStore;
    private final W3.a _newRecordState;
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
        int label;
        /* synthetic */ Object result;

        public b(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return l.this.getUser(null, this);
        }
    }

    public l(P3.d _userBackend, T3.b _identityModelStore, com.onesignal.user.internal.properties.b _propertiesModelStore, Y3.e _subscriptionsModelStore, com.onesignal.core.internal.config.c _configModelStore, Q3.a _buildUserService, W3.a _newRecordState, com.onesignal.user.internal.jwt.c _jwtTokenStore, com.onesignal.core.internal.config.impl.c _identityVerificationService) {
        Intrinsics.checkNotNullParameter(_userBackend, "_userBackend");
        Intrinsics.checkNotNullParameter(_identityModelStore, "_identityModelStore");
        Intrinsics.checkNotNullParameter(_propertiesModelStore, "_propertiesModelStore");
        Intrinsics.checkNotNullParameter(_subscriptionsModelStore, "_subscriptionsModelStore");
        Intrinsics.checkNotNullParameter(_configModelStore, "_configModelStore");
        Intrinsics.checkNotNullParameter(_buildUserService, "_buildUserService");
        Intrinsics.checkNotNullParameter(_newRecordState, "_newRecordState");
        Intrinsics.checkNotNullParameter(_jwtTokenStore, "_jwtTokenStore");
        Intrinsics.checkNotNullParameter(_identityVerificationService, "_identityVerificationService");
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
    private final U3.q buildPushSelfHealOperationForStuckSubscription(U3.h hVar, P3.h hVar2, String str) {
        boolean z7;
        Y3.d dVar = (Y3.d) this._subscriptionsModelStore.get(str);
        if (dVar != null && dVar.getType() == Y3.g.PUSH) {
            Pair<Boolean, Y3.f> subscriptionEnabledAndStatus = V3.c.Companion.getSubscriptionEnabledAndStatus(dVar);
            boolean booleanValue = ((Boolean) subscriptionEnabledAndStatus.f6112d).booleanValue();
            Y3.f fVar = (Y3.f) subscriptionEnabledAndStatus.f6113e;
            if (Intrinsics.a(hVar2.getEnabled(), Boolean.TRUE)) {
                Integer notificationTypes = hVar2.getNotificationTypes();
                if ((notificationTypes != null ? notificationTypes.intValue() : 0) > 0) {
                    z7 = true;
                    if ((booleanValue || z7) ? false : true) {
                        com.onesignal.debug.internal.logging.b.info$default("RefreshUserOperationExecutor: push subscription " + str + " diverged from server (server enabled=" + hVar2.getEnabled() + " notificationTypes=" + hVar2.getNotificationTypes() + "; local opted-in and SUBSCRIBED). Enqueuing follow-up update-subscription op to re-assert local truth via PATCH /subscriptions/{id}.", null, 2, null);
                        return new U3.q(hVar.getAppId(), hVar.getOnesignalId(), ((T3.a) this._identityModelStore.getModel()).getExternalId(), str, dVar.getType(), booleanValue, dVar.getAddress(), fVar);
                    }
                }
            }
            z7 = false;
            if ((booleanValue || z7) ? false : true) {
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
    public final Object getUser(U3.h hVar, V5.b bVar) {
        b bVar2;
        int i2;
        l lVar;
        int i5;
        Y3.d dVar;
        U3.h hVar2 = hVar;
        if (bVar instanceof b) {
            bVar2 = (b) bVar;
            int i7 = bVar2.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                bVar2.label = i7 - Integer.MIN_VALUE;
                b bVar3 = bVar2;
                Object obj = bVar3.result;
                W5.a aVar = W5.a.f2787d;
                i2 = bVar3.label;
                if (i2 != 0) {
                    V6.b.P(obj);
                    f resolveBackendParams = c.resolveBackendParams(hVar2, hVar2.getOnesignalId(), this._jwtTokenStore, this._identityVerificationService);
                    try {
                        P3.d dVar2 = this._userBackend;
                        String appId = hVar2.getAppId();
                        String aliasLabel = resolveBackendParams.getAliasLabel();
                        String aliasValue = resolveBackendParams.getAliasValue();
                        String jwt = resolveBackendParams.getJwt();
                        bVar3.L$0 = this;
                        bVar3.L$1 = hVar2;
                        bVar3.label = 1;
                        obj = dVar2.getUser(appId, aliasLabel, aliasValue, jwt, bVar3);
                        if (obj == aVar) {
                            return aVar;
                        }
                        lVar = this;
                    } catch (C0846a e7) {
                        e = e7;
                        lVar = this;
                        i5 = m.$EnumSwitchMapping$1[com.onesignal.common.g.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                        if (i5 != 1) {
                            return new F2.a(F2.b.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                        }
                        if (i5 == 2) {
                            return new F2.a(F2.b.FAIL_UNAUTHORIZED, null, null, e.getRetryAfterSeconds(), 6, null);
                        }
                        if (i5 != 3) {
                            return new F2.a(F2.b.FAIL_NORETRY, null, null, null, 14, null);
                        }
                        if (e.getStatusCode() == 404 && lVar._newRecordState.isInMissingRetryWindow(hVar2.getOnesignalId())) {
                            return new F2.a(F2.b.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                        }
                        List<F2.g> rebuildOperationsIfCurrentUser = lVar._buildUserService.getRebuildOperationsIfCurrentUser(hVar2.getAppId(), hVar2.getOnesignalId());
                        return rebuildOperationsIfCurrentUser == null ? new F2.a(F2.b.FAIL_NORETRY, null, null, null, 14, null) : new F2.a(F2.b.FAIL_RETRY, null, rebuildOperationsIfCurrentUser, e.getRetryAfterSeconds(), 2, null);
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    hVar2 = (U3.h) bVar3.L$1;
                    lVar = (l) bVar3.L$0;
                    try {
                        V6.b.P(obj);
                    } catch (C0846a e8) {
                        e = e8;
                        i5 = m.$EnumSwitchMapping$1[com.onesignal.common.g.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                        if (i5 != 1) {
                        }
                    }
                }
                P3.a aVar2 = (P3.a) obj;
                if (Intrinsics.a(hVar2.getOnesignalId(), ((T3.a) lVar._identityModelStore.getModel()).getOnesignalId())) {
                    return new F2.a(F2.b.SUCCESS, null, null, null, 14, null);
                }
                T3.a aVar3 = new T3.a();
                for (Map.Entry<String, String> entry : aVar2.getIdentities().entrySet()) {
                    aVar3.put((T3.a) entry.getKey(), entry.getValue());
                }
                com.onesignal.user.internal.properties.a aVar4 = new com.onesignal.user.internal.properties.a();
                aVar4.setOnesignalId(hVar2.getOnesignalId());
                if (aVar2.getProperties().getCountry() != null) {
                    aVar4.setCountry(aVar2.getProperties().getCountry());
                }
                if (aVar2.getProperties().getLanguage() != null) {
                    aVar4.setLanguage(aVar2.getProperties().getLanguage());
                }
                if (aVar2.getProperties().getTags() != null) {
                    for (Map.Entry<String, String> entry2 : aVar2.getProperties().getTags().entrySet()) {
                        if (entry2.getValue() != null) {
                            com.onesignal.common.modeling.h tags = aVar4.getTags();
                            String key = entry2.getKey();
                            String value = entry2.getValue();
                            Intrinsics.b(value);
                            tags.put((com.onesignal.common.modeling.h) key, value);
                        }
                    }
                }
                aVar4.setTimezone(com.onesignal.common.l.INSTANCE.getTimeZoneId());
                String pushSubscriptionId = ((com.onesignal.core.internal.config.b) lVar._configModelStore.getModel()).getPushSubscriptionId();
                ArrayList arrayList = new ArrayList();
                U3.q qVar = null;
                for (P3.h hVar3 : aVar2.getSubscriptions()) {
                    Y3.d dVar3 = new Y3.d();
                    String id = hVar3.getId();
                    Intrinsics.b(id);
                    dVar3.setId(id);
                    String token = hVar3.getToken();
                    if (token == null) {
                        token = "";
                    }
                    dVar3.setAddress(token);
                    f.a aVar5 = Y3.f.Companion;
                    Integer notificationTypes = hVar3.getNotificationTypes();
                    Y3.f fromInt = aVar5.fromInt(notificationTypes != null ? notificationTypes.intValue() : Y3.f.SUBSCRIBED.getValue());
                    if (fromInt == null) {
                        fromInt = Y3.f.SUBSCRIBED;
                    }
                    dVar3.setStatus(fromInt);
                    P3.j type = hVar3.getType();
                    Intrinsics.b(type);
                    int i8 = m.$EnumSwitchMapping$0[type.ordinal()];
                    dVar3.setType(i8 != 1 ? i8 != 2 ? Y3.g.PUSH : Y3.g.SMS : Y3.g.EMAIL);
                    dVar3.setOptedIn((dVar3.getStatus() == Y3.f.UNSUBSCRIBE || dVar3.getStatus() == Y3.f.DISABLED_FROM_REST_API_DEFAULT_REASON) ? false : true);
                    String sdk = hVar3.getSdk();
                    if (sdk == null) {
                        sdk = "";
                    }
                    dVar3.setSdk(sdk);
                    String deviceOS = hVar3.getDeviceOS();
                    if (deviceOS == null) {
                        deviceOS = "";
                    }
                    dVar3.setDeviceOS(deviceOS);
                    String carrier = hVar3.getCarrier();
                    if (carrier == null) {
                        carrier = "";
                    }
                    dVar3.setCarrier(carrier);
                    String appVersion = hVar3.getAppVersion();
                    if (appVersion == null) {
                        appVersion = "";
                    }
                    dVar3.setAppVersion(appVersion);
                    if (dVar3.getType() != Y3.g.PUSH) {
                        arrayList.add(dVar3);
                    } else if (Intrinsics.a(hVar3.getId(), pushSubscriptionId) && qVar == null) {
                        qVar = lVar.buildPushSelfHealOperationForStuckSubscription(hVar2, hVar3, pushSubscriptionId);
                    }
                }
                if (pushSubscriptionId != null && (dVar = (Y3.d) lVar._subscriptionsModelStore.get(pushSubscriptionId)) != null) {
                    arrayList.add(dVar);
                }
                lVar._identityModelStore.replace(aVar3, "HYDRATE");
                lVar._propertiesModelStore.replace(aVar4, "HYDRATE");
                lVar._subscriptionsModelStore.replaceAll(arrayList, "HYDRATE");
                return new F2.a(F2.b.SUCCESS, null, qVar != null ? kotlin.collections.q.b(qVar) : null, null, 10, null);
            }
        }
        bVar2 = new b(bVar);
        b bVar32 = bVar2;
        Object obj2 = bVar32.result;
        W5.a aVar6 = W5.a.f2787d;
        i2 = bVar32.label;
        if (i2 != 0) {
        }
        P3.a aVar22 = (P3.a) obj2;
        if (Intrinsics.a(hVar2.getOnesignalId(), ((T3.a) lVar._identityModelStore.getModel()).getOnesignalId())) {
        }
    }

    @Override // F2.d
    public Object execute(List<? extends F2.g> list, V5.b bVar) {
        com.onesignal.debug.internal.logging.b.log(K2.c.DEBUG, "RefreshUserOperationExecutor(operation: " + list + ')');
        if (list == null || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (!(((F2.g) it.next()) instanceof U3.h)) {
                    throw new Exception("Unrecognized operation(s)! Attempted operations:\n" + list);
                }
            }
        }
        F2.g gVar = (F2.g) CollectionsKt.o(list);
        if (gVar instanceof U3.h) {
            return getUser((U3.h) gVar, bVar);
        }
        throw new Exception("Unrecognized operation: " + gVar);
    }

    @Override // F2.d
    public List<String> getOperations() {
        return kotlin.collections.q.b(REFRESH_USER);
    }
}
