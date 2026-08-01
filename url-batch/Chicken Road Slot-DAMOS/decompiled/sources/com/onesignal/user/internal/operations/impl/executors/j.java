package com.onesignal.user.internal.operations.impl.executors;

import a2.r;
import dd.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.i0;
import kotlin.collections.x;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class j implements na.d {
    public static final a Companion = new a(null);
    public static final String REFRESH_USER = "refresh-user";
    private final vc.a _buildUserService;
    private final com.onesignal.core.internal.config.b _configModelStore;
    private final yc.b _identityModelStore;
    private final bd.a _newRecordState;
    private final com.onesignal.user.internal.properties.b _propertiesModelStore;
    private final dd.e _subscriptionsModelStore;
    private final uc.d _userBackend;

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class b extends nd.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public b(ld.a aVar) {
            super(aVar);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return j.this.getUser(null, this);
        }
    }

    public j(uc.d dVar, yc.b bVar, com.onesignal.user.internal.properties.b bVar2, dd.e eVar, com.onesignal.core.internal.config.b bVar3, vc.a aVar, bd.a aVar2) {
        dVar.getClass();
        bVar.getClass();
        bVar2.getClass();
        eVar.getClass();
        bVar3.getClass();
        aVar.getClass();
        aVar2.getClass();
        this._userBackend = dVar;
        this._identityModelStore = bVar;
        this._propertiesModelStore = bVar2;
        this._subscriptionsModelStore = eVar;
        this._configModelStore = bVar3;
        this._buildUserService = aVar;
        this._newRecordState = aVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0078 A[Catch: a -> 0x0036, TryCatch #2 {a -> 0x0036, blocks: (B:11:0x0032, B:12:0x0060, B:14:0x0078, B:17:0x0086, B:18:0x0097, B:20:0x009d, B:22:0x00af, B:24:0x00c5, B:25:0x00d0, B:27:0x00da, B:28:0x00e5, B:30:0x00ef, B:31:0x00ff, B:33:0x0105, B:36:0x0111, B:41:0x0124, B:42:0x013a, B:44:0x0140, B:48:0x015e, B:50:0x0169, B:51:0x0174, B:53:0x017a, B:54:0x017c, B:57:0x0192, B:58:0x019a, B:60:0x01a5, B:63:0x01b0, B:66:0x01ba, B:69:0x01c4, B:72:0x01ce, B:75:0x01d9, B:78:0x01e4, B:84:0x0195, B:85:0x0198, B:86:0x016e, B:88:0x01e9, B:90:0x01f7, B:92:0x0201, B:93:0x0204), top: B:10:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0086 A[Catch: a -> 0x0036, TryCatch #2 {a -> 0x0036, blocks: (B:11:0x0032, B:12:0x0060, B:14:0x0078, B:17:0x0086, B:18:0x0097, B:20:0x009d, B:22:0x00af, B:24:0x00c5, B:25:0x00d0, B:27:0x00da, B:28:0x00e5, B:30:0x00ef, B:31:0x00ff, B:33:0x0105, B:36:0x0111, B:41:0x0124, B:42:0x013a, B:44:0x0140, B:48:0x015e, B:50:0x0169, B:51:0x0174, B:53:0x017a, B:54:0x017c, B:57:0x0192, B:58:0x019a, B:60:0x01a5, B:63:0x01b0, B:66:0x01ba, B:69:0x01c4, B:72:0x01ce, B:75:0x01d9, B:78:0x01e4, B:84:0x0195, B:85:0x0198, B:86:0x016e, B:88:0x01e9, B:90:0x01f7, B:92:0x0201, B:93:0x0204), top: B:10:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x023e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getUser(zc.h hVar, ld.a aVar) {
        b bVar;
        int i3;
        zc.h hVar2;
        j jVar;
        zc.h hVar3;
        int i10;
        dd.d dVar;
        if (aVar instanceof b) {
            bVar = (b) aVar;
            int i11 = bVar.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar.label = i11 - Integer.MIN_VALUE;
                Object obj = bVar.result;
                md.a aVar2 = md.a.f6622d;
                i3 = bVar.label;
                if (i3 != 0) {
                    cf.c.M(obj);
                    try {
                        uc.d dVar2 = this._userBackend;
                        String appId = hVar.getAppId();
                        String onesignalId = hVar.getOnesignalId();
                        bVar.L$0 = this;
                        hVar2 = hVar;
                        try {
                            bVar.L$1 = hVar2;
                            bVar.label = 1;
                            obj = dVar2.getUser(appId, "onesignal_id", onesignalId, bVar);
                            if (obj == aVar2) {
                                return aVar2;
                            }
                            jVar = this;
                            hVar3 = hVar2;
                        } catch (z9.a e2) {
                            e = e2;
                            jVar = this;
                            hVar3 = hVar2;
                            i10 = k.$EnumSwitchMapping$1[com.onesignal.common.g.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                            if (i10 != 1) {
                                return new na.a(na.b.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                            }
                            if (i10 == 2) {
                                return new na.a(na.b.FAIL_UNAUTHORIZED, null, null, e.getRetryAfterSeconds(), 6, null);
                            }
                            if (i10 != 3) {
                                return new na.a(na.b.FAIL_NORETRY, null, null, null, 14, null);
                            }
                            if (e.getStatusCode() == 404 && jVar._newRecordState.isInMissingRetryWindow(hVar3.getOnesignalId())) {
                                return new na.a(na.b.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                            }
                            List<na.g> rebuildOperationsIfCurrentUser = jVar._buildUserService.getRebuildOperationsIfCurrentUser(hVar3.getAppId(), hVar3.getOnesignalId());
                            return rebuildOperationsIfCurrentUser == null ? new na.a(na.b.FAIL_NORETRY, null, null, null, 14, null) : new na.a(na.b.FAIL_RETRY, null, rebuildOperationsIfCurrentUser, e.getRetryAfterSeconds(), 2, null);
                        }
                    } catch (z9.a e9) {
                        e = e9;
                        hVar2 = hVar;
                    }
                } else {
                    if (i3 != 1) {
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hVar3 = (zc.h) bVar.L$1;
                    jVar = (j) bVar.L$0;
                    try {
                        cf.c.M(obj);
                    } catch (z9.a e10) {
                        e = e10;
                        i10 = k.$EnumSwitchMapping$1[com.onesignal.common.g.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                        if (i10 != 1) {
                        }
                    }
                }
                uc.a aVar3 = (uc.a) obj;
                if (Intrinsics.a(hVar3.getOnesignalId(), ((yc.a) jVar._identityModelStore.getModel()).getOnesignalId())) {
                    return new na.a(na.b.SUCCESS, null, null, null, 14, null);
                }
                yc.a aVar4 = new yc.a();
                for (Map.Entry<String, String> entry : aVar3.getIdentities().entrySet()) {
                    aVar4.put((yc.a) entry.getKey(), entry.getValue());
                }
                com.onesignal.user.internal.properties.a aVar5 = new com.onesignal.user.internal.properties.a();
                aVar5.setOnesignalId(hVar3.getOnesignalId());
                if (aVar3.getProperties().getCountry() != null) {
                    aVar5.setCountry(aVar3.getProperties().getCountry());
                }
                if (aVar3.getProperties().getLanguage() != null) {
                    aVar5.setLanguage(aVar3.getProperties().getLanguage());
                }
                if (aVar3.getProperties().getTags() != null) {
                    for (Map.Entry<String, String> entry2 : aVar3.getProperties().getTags().entrySet()) {
                        if (entry2.getValue() != null) {
                            com.onesignal.common.modeling.h tags = aVar5.getTags();
                            String key = entry2.getKey();
                            String value = entry2.getValue();
                            value.getClass();
                            tags.put((com.onesignal.common.modeling.h) key, value);
                        }
                    }
                }
                aVar5.setTimezone(com.onesignal.common.l.INSTANCE.getTimeZoneId());
                ArrayList arrayList = new ArrayList();
                for (uc.h hVar4 : aVar3.getSubscriptions()) {
                    dd.d dVar3 = new dd.d();
                    String id2 = hVar4.getId();
                    id2.getClass();
                    dVar3.setId(id2);
                    String token = hVar4.getToken();
                    String str = "";
                    if (token == null) {
                        token = "";
                    }
                    dVar3.setAddress(token);
                    f.a aVar6 = dd.f.Companion;
                    Integer notificationTypes = hVar4.getNotificationTypes();
                    dd.f fromInt = aVar6.fromInt(notificationTypes != null ? notificationTypes.intValue() : dd.f.SUBSCRIBED.getValue());
                    if (fromInt == null) {
                        fromInt = dd.f.SUBSCRIBED;
                    }
                    dVar3.setStatus(fromInt);
                    uc.j type = hVar4.getType();
                    type.getClass();
                    int i12 = k.$EnumSwitchMapping$0[type.ordinal()];
                    dVar3.setType(i12 != 1 ? i12 != 2 ? dd.g.PUSH : dd.g.SMS : dd.g.EMAIL);
                    dVar3.setOptedIn((dVar3.getStatus() == dd.f.UNSUBSCRIBE || dVar3.getStatus() == dd.f.DISABLED_FROM_REST_API_DEFAULT_REASON) ? false : true);
                    String sdk = hVar4.getSdk();
                    if (sdk == null) {
                        sdk = "";
                    }
                    dVar3.setSdk(sdk);
                    String deviceOS = hVar4.getDeviceOS();
                    if (deviceOS == null) {
                        deviceOS = "";
                    }
                    dVar3.setDeviceOS(deviceOS);
                    String carrier = hVar4.getCarrier();
                    if (carrier == null) {
                        carrier = "";
                    }
                    dVar3.setCarrier(carrier);
                    String appVersion = hVar4.getAppVersion();
                    if (appVersion != null) {
                        str = appVersion;
                    }
                    dVar3.setAppVersion(str);
                    if (dVar3.getType() != dd.g.PUSH) {
                        arrayList.add(dVar3);
                    }
                }
                String pushSubscriptionId = ((com.onesignal.core.internal.config.a) jVar._configModelStore.getModel()).getPushSubscriptionId();
                if (pushSubscriptionId != null && (dVar = (dd.d) jVar._subscriptionsModelStore.get(pushSubscriptionId)) != null) {
                    arrayList.add(dVar);
                }
                jVar._identityModelStore.replace(aVar4, "HYDRATE");
                jVar._propertiesModelStore.replace(aVar5, "HYDRATE");
                jVar._subscriptionsModelStore.replaceAll(arrayList, "HYDRATE");
                return new na.a(na.b.SUCCESS, null, null, null, 14, null);
            }
        }
        bVar = new b(aVar);
        Object obj2 = bVar.result;
        md.a aVar22 = md.a.f6622d;
        i3 = bVar.label;
        if (i3 != 0) {
        }
        uc.a aVar32 = (uc.a) obj2;
        if (Intrinsics.a(hVar3.getOnesignalId(), ((yc.a) jVar._identityModelStore.getModel()).getOnesignalId())) {
        }
    }

    @Override // na.d
    public Object execute(List<? extends na.g> list, ld.a aVar) {
        com.onesignal.debug.internal.logging.b.log(ua.c.DEBUG, "RefreshUserOperationExecutor(operation: " + list + ')');
        if (list == null || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (!(((na.g) it.next()) instanceof zc.h)) {
                    r.i(list, "Unrecognized operation(s)! Attempted operations:\n");
                    return null;
                }
            }
        }
        na.g gVar = (na.g) CollectionsKt.x(list);
        if (gVar instanceof zc.h) {
            return getUser((zc.h) gVar, aVar);
        }
        r.i(gVar, "Unrecognized operation: ");
        return null;
    }

    @Override // na.d
    public List<String> getOperations() {
        return x.c(REFRESH_USER);
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
