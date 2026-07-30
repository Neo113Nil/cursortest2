package com.onesignal.user.internal.operations.impl.executors;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import r2.C0846a;

/* loaded from: classes.dex */
public final class g implements F2.d {
    public static final a Companion = new a(null);
    public static final String LOGIN_USER_FROM_SUBSCRIPTION_USER = "login-user-from-subscription";
    private final T3.b _identityModelStore;
    private final com.onesignal.core.internal.config.impl.c _identityVerificationService;
    private final com.onesignal.user.internal.properties.b _propertiesModelStore;
    private final P3.c _subscriptionBackend;

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
            return g.this.loginUser(null, this);
        }
    }

    public g(P3.c _subscriptionBackend, T3.b _identityModelStore, com.onesignal.user.internal.properties.b _propertiesModelStore, com.onesignal.core.internal.config.impl.c _identityVerificationService) {
        Intrinsics.checkNotNullParameter(_subscriptionBackend, "_subscriptionBackend");
        Intrinsics.checkNotNullParameter(_identityModelStore, "_identityModelStore");
        Intrinsics.checkNotNullParameter(_propertiesModelStore, "_propertiesModelStore");
        Intrinsics.checkNotNullParameter(_identityVerificationService, "_identityVerificationService");
        this._subscriptionBackend = _subscriptionBackend;
        this._identityModelStore = _identityModelStore;
        this._propertiesModelStore = _propertiesModelStore;
        this._identityVerificationService = _identityVerificationService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0071 A[Catch: a -> 0x0036, TryCatch #0 {a -> 0x0036, blocks: (B:11:0x0032, B:12:0x005f, B:16:0x0071, B:19:0x0097, B:21:0x00c2, B:22:0x00cd, B:24:0x00db, B:25:0x00e7, B:31:0x0044), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0097 A[Catch: a -> 0x0036, TryCatch #0 {a -> 0x0036, blocks: (B:11:0x0032, B:12:0x005f, B:16:0x0071, B:19:0x0097, B:21:0x00c2, B:22:0x00cd, B:24:0x00db, B:25:0x00e7, B:31:0x0044), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object loginUser(U3.e eVar, V5.b bVar) {
        b bVar2;
        int i2;
        g gVar;
        U3.e eVar2;
        String str;
        try {
            if (bVar instanceof b) {
                bVar2 = (b) bVar;
                int i5 = bVar2.label;
                if ((i5 & Integer.MIN_VALUE) != 0) {
                    bVar2.label = i5 - Integer.MIN_VALUE;
                    Object obj = bVar2.result;
                    W5.a aVar = W5.a.f2787d;
                    i2 = bVar2.label;
                    if (i2 != 0) {
                        V6.b.P(obj);
                        P3.c cVar = this._subscriptionBackend;
                        String appId = eVar.getAppId();
                        String subscriptionId = eVar.getSubscriptionId();
                        bVar2.L$0 = this;
                        bVar2.L$1 = eVar;
                        bVar2.label = 1;
                        obj = cVar.getIdentityFromSubscription(appId, subscriptionId, bVar2);
                        if (obj == aVar) {
                            return aVar;
                        }
                        gVar = this;
                        eVar2 = eVar;
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        eVar2 = (U3.e) bVar2.L$1;
                        gVar = (g) bVar2.L$0;
                        V6.b.P(obj);
                    }
                    String str2 = (String) ((Map) obj).get("onesignal_id");
                    str = str2 != null ? null : str2;
                    if (str != null) {
                        com.onesignal.debug.internal.logging.b.warn$default("Subscription " + eVar2.getSubscriptionId() + " has no onesignal_id!", null, 2, null);
                        return new F2.a(F2.b.FAIL_NORETRY, null, null, null, 14, null);
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put(eVar2.getOnesignalId(), str);
                    T3.a aVar2 = (T3.a) gVar._identityModelStore.getModel();
                    com.onesignal.user.internal.properties.a aVar3 = (com.onesignal.user.internal.properties.a) gVar._propertiesModelStore.getModel();
                    if (Intrinsics.a(aVar2.getOnesignalId(), eVar2.getOnesignalId())) {
                        com.onesignal.common.modeling.i.setStringProperty$default(aVar2, "onesignal_id", str, "HYDRATE", false, 8, null);
                    }
                    if (Intrinsics.a(aVar3.getOnesignalId(), eVar2.getOnesignalId())) {
                        com.onesignal.common.modeling.i.setStringProperty$default(aVar3, "onesignalId", str, "HYDRATE", false, 8, null);
                    }
                    return new F2.a(F2.b.SUCCESS, linkedHashMap, kotlin.collections.q.b(new U3.h(eVar2.getAppId(), str, eVar2.getExternalId())), null, 8, null);
                }
            }
            if (i2 != 0) {
            }
            String str22 = (String) ((Map) obj).get("onesignal_id");
            if (str22 != null) {
            }
            if (str != null) {
            }
        } catch (C0846a e7) {
            int i7 = h.$EnumSwitchMapping$0[com.onesignal.common.g.INSTANCE.getResponseStatusType(e7.getStatusCode()).ordinal()];
            return i7 != 1 ? i7 != 2 ? new F2.a(F2.b.FAIL_NORETRY, null, null, null, 14, null) : new F2.a(F2.b.FAIL_UNAUTHORIZED, null, null, null, 14, null) : new F2.a(F2.b.FAIL_RETRY, null, null, null, 14, null);
        }
        bVar2 = new b(bVar);
        Object obj2 = bVar2.result;
        W5.a aVar4 = W5.a.f2787d;
        i2 = bVar2.label;
    }

    @Override // F2.d
    public Object execute(List<? extends F2.g> list, V5.b bVar) {
        com.onesignal.debug.internal.logging.b.debug$default("LoginUserFromSubscriptionOperationExecutor(operation: " + list + ')', null, 2, null);
        if (this._identityVerificationService.getNewCodePathsRun() && c.shouldFailLoginUserFromSubscription(this._identityVerificationService.getIvBehaviorActive())) {
            com.onesignal.debug.internal.logging.b.warn$default("LoginUserFromSubscriptionOperation is not supported when identity verification is enabled. Dropping.", null, 2, null);
            return new F2.a(F2.b.FAIL_NORETRY, null, null, null, 14, null);
        }
        if (list.size() > 1) {
            throw new Exception("Only supports one operation! Attempted operations:\n" + list);
        }
        F2.g gVar = (F2.g) CollectionsKt.o(list);
        if (gVar instanceof U3.e) {
            return loginUser((U3.e) gVar, bVar);
        }
        throw new Exception("Unrecognized operation: " + gVar);
    }

    @Override // F2.d
    public List<String> getOperations() {
        return kotlin.collections.q.b(LOGIN_USER_FROM_SUBSCRIPTION_USER);
    }
}
