package com.onesignal.user.internal.operations.impl.executors;

import a2.r;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.i0;
import kotlin.collections.x;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class e implements na.d {
    public static final a Companion = new a(null);
    public static final String LOGIN_USER_FROM_SUBSCRIPTION_USER = "login-user-from-subscription";
    private final yc.b _identityModelStore;
    private final com.onesignal.user.internal.properties.b _propertiesModelStore;
    private final uc.c _subscriptionBackend;

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
            return e.this.loginUser(null, this);
        }
    }

    public e(uc.c cVar, yc.b bVar, com.onesignal.user.internal.properties.b bVar2) {
        cVar.getClass();
        bVar.getClass();
        bVar2.getClass();
        this._subscriptionBackend = cVar;
        this._identityModelStore = bVar;
        this._propertiesModelStore = bVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c A[Catch: a -> 0x0036, TryCatch #0 {a -> 0x0036, blocks: (B:11:0x0032, B:12:0x005e, B:14:0x006c, B:17:0x0092, B:19:0x00bd, B:20:0x00c8, B:22:0x00d6, B:23:0x00e2, B:28:0x0043), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0092 A[Catch: a -> 0x0036, TryCatch #0 {a -> 0x0036, blocks: (B:11:0x0032, B:12:0x005e, B:14:0x006c, B:17:0x0092, B:19:0x00bd, B:20:0x00c8, B:22:0x00d6, B:23:0x00e2, B:28:0x0043), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object loginUser(zc.e eVar, ld.a aVar) {
        b bVar;
        int i3;
        e eVar2;
        zc.e eVar3;
        String str;
        try {
            if (aVar instanceof b) {
                bVar = (b) aVar;
                int i10 = bVar.label;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    bVar.label = i10 - Integer.MIN_VALUE;
                    Object obj = bVar.result;
                    md.a aVar2 = md.a.f6622d;
                    i3 = bVar.label;
                    if (i3 != 0) {
                        cf.c.M(obj);
                        uc.c cVar = this._subscriptionBackend;
                        String appId = eVar.getAppId();
                        String subscriptionId = eVar.getSubscriptionId();
                        bVar.L$0 = this;
                        bVar.L$1 = eVar;
                        bVar.label = 1;
                        obj = cVar.getIdentityFromSubscription(appId, subscriptionId, bVar);
                        if (obj == aVar2) {
                            return aVar2;
                        }
                        eVar2 = this;
                        eVar3 = eVar;
                    } else {
                        if (i3 != 1) {
                            i0.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        eVar3 = (zc.e) bVar.L$1;
                        eVar2 = (e) bVar.L$0;
                        cf.c.M(obj);
                    }
                    str = (String) ((Map) obj).getOrDefault("onesignal_id", null);
                    if (str != null) {
                        com.onesignal.debug.internal.logging.b.warn$default("Subscription " + eVar3.getSubscriptionId() + " has no onesignal_id!", null, 2, null);
                        return new na.a(na.b.FAIL_NORETRY, null, null, null, 14, null);
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put(eVar3.getOnesignalId(), str);
                    yc.a aVar3 = (yc.a) eVar2._identityModelStore.getModel();
                    com.onesignal.user.internal.properties.a aVar4 = (com.onesignal.user.internal.properties.a) eVar2._propertiesModelStore.getModel();
                    if (Intrinsics.a(aVar3.getOnesignalId(), eVar3.getOnesignalId())) {
                        com.onesignal.common.modeling.i.setStringProperty$default(aVar3, "onesignal_id", str, "HYDRATE", false, 8, null);
                    }
                    if (Intrinsics.a(aVar4.getOnesignalId(), eVar3.getOnesignalId())) {
                        com.onesignal.common.modeling.i.setStringProperty$default(aVar4, "onesignalId", str, "HYDRATE", false, 8, null);
                    }
                    return new na.a(na.b.SUCCESS, linkedHashMap, x.c(new zc.h(eVar3.getAppId(), str)), null, 8, null);
                }
            }
            if (i3 != 0) {
            }
            str = (String) ((Map) obj).getOrDefault("onesignal_id", null);
            if (str != null) {
            }
        } catch (z9.a e2) {
            int i11 = f.$EnumSwitchMapping$0[com.onesignal.common.g.INSTANCE.getResponseStatusType(e2.getStatusCode()).ordinal()];
            return i11 != 1 ? i11 != 2 ? new na.a(na.b.FAIL_NORETRY, null, null, null, 14, null) : new na.a(na.b.FAIL_UNAUTHORIZED, null, null, null, 14, null) : new na.a(na.b.FAIL_RETRY, null, null, null, 14, null);
        }
        bVar = new b(aVar);
        Object obj2 = bVar.result;
        md.a aVar22 = md.a.f6622d;
        i3 = bVar.label;
    }

    @Override // na.d
    public Object execute(List<? extends na.g> list, ld.a aVar) {
        com.onesignal.debug.internal.logging.b.debug$default("LoginUserFromSubscriptionOperationExecutor(operation: " + list + ')', null, 2, null);
        if (list.size() > 1) {
            r.i(list, "Only supports one operation! Attempted operations:\n");
            return null;
        }
        na.g gVar = (na.g) CollectionsKt.x(list);
        if (gVar instanceof zc.e) {
            return loginUser((zc.e) gVar, aVar);
        }
        r.i(gVar, "Unrecognized operation: ");
        return null;
    }

    @Override // na.d
    public List<String> getOperations() {
        return x.c(LOGIN_USER_FROM_SUBSCRIPTION_USER);
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
