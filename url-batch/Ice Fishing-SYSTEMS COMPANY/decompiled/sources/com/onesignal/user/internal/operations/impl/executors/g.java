package com.onesignal.user.internal.operations.impl.executors;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p4.C4860a;
import r7.AbstractC4979j;
import v7.InterfaceC5133d;
import w7.EnumC5179a;
import x7.AbstractC5219c;

/* loaded from: classes2.dex */
public final class g implements D4.d {
    public static final a Companion = new a(null);
    public static final String LOGIN_USER_FROM_SUBSCRIPTION_USER = "login-user-from-subscription";
    private final Q5.b _identityModelStore;
    private final com.onesignal.core.internal.config.impl.c _identityVerificationService;
    private final com.onesignal.user.internal.properties.b _propertiesModelStore;
    private final M5.c _subscriptionBackend;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends AbstractC5219c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public b(InterfaceC5133d interfaceC5133d) {
            super(interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return g.this.loginUser(null, this);
        }
    }

    public g(M5.c _subscriptionBackend, Q5.b _identityModelStore, com.onesignal.user.internal.properties.b _propertiesModelStore, com.onesignal.core.internal.config.impl.c _identityVerificationService) {
        kotlin.jvm.internal.h.e(_subscriptionBackend, "_subscriptionBackend");
        kotlin.jvm.internal.h.e(_identityModelStore, "_identityModelStore");
        kotlin.jvm.internal.h.e(_propertiesModelStore, "_propertiesModelStore");
        kotlin.jvm.internal.h.e(_identityVerificationService, "_identityVerificationService");
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
    public final Object loginUser(R5.e eVar, InterfaceC5133d interfaceC5133d) {
        b bVar;
        int i;
        g gVar;
        R5.e eVar2;
        String str;
        try {
            if (interfaceC5133d instanceof b) {
                bVar = (b) interfaceC5133d;
                int i4 = bVar.label;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    bVar.label = i4 - Integer.MIN_VALUE;
                    Object obj = bVar.result;
                    EnumC5179a enumC5179a = EnumC5179a.f41704n;
                    i = bVar.label;
                    if (i != 0) {
                        com.bumptech.glide.f.r(obj);
                        M5.c cVar = this._subscriptionBackend;
                        String appId = eVar.getAppId();
                        String subscriptionId = eVar.getSubscriptionId();
                        bVar.L$0 = this;
                        bVar.L$1 = eVar;
                        bVar.label = 1;
                        obj = cVar.getIdentityFromSubscription(appId, subscriptionId, bVar);
                        if (obj == enumC5179a) {
                            return enumC5179a;
                        }
                        gVar = this;
                        eVar2 = eVar;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        eVar2 = (R5.e) bVar.L$1;
                        gVar = (g) bVar.L$0;
                        com.bumptech.glide.f.r(obj);
                    }
                    String str2 = (String) ((Map) obj).get("onesignal_id");
                    str = str2 != null ? null : str2;
                    if (str != null) {
                        com.onesignal.debug.internal.logging.b.warn$default("Subscription " + eVar2.getSubscriptionId() + " has no onesignal_id!", null, 2, null);
                        return new D4.a(D4.b.FAIL_NORETRY, null, null, null, 14, null);
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put(eVar2.getOnesignalId(), str);
                    Q5.a aVar = (Q5.a) gVar._identityModelStore.getModel();
                    com.onesignal.user.internal.properties.a aVar2 = (com.onesignal.user.internal.properties.a) gVar._propertiesModelStore.getModel();
                    if (kotlin.jvm.internal.h.a(aVar.getOnesignalId(), eVar2.getOnesignalId())) {
                        com.onesignal.common.modeling.i.setStringProperty$default(aVar, "onesignal_id", str, "HYDRATE", false, 8, null);
                    }
                    if (kotlin.jvm.internal.h.a(aVar2.getOnesignalId(), eVar2.getOnesignalId())) {
                        com.onesignal.common.modeling.i.setStringProperty$default(aVar2, "onesignalId", str, "HYDRATE", false, 8, null);
                    }
                    return new D4.a(D4.b.SUCCESS, linkedHashMap, p8.g.k(new R5.h(eVar2.getAppId(), str, eVar2.getExternalId())), null, 8, null);
                }
            }
            if (i != 0) {
            }
            String str22 = (String) ((Map) obj).get("onesignal_id");
            if (str22 != null) {
            }
            if (str != null) {
            }
        } catch (C4860a e6) {
            int i9 = h.$EnumSwitchMapping$0[com.onesignal.common.g.INSTANCE.getResponseStatusType(e6.getStatusCode()).ordinal()];
            return i9 != 1 ? i9 != 2 ? new D4.a(D4.b.FAIL_NORETRY, null, null, null, 14, null) : new D4.a(D4.b.FAIL_UNAUTHORIZED, null, null, null, 14, null) : new D4.a(D4.b.FAIL_RETRY, null, null, null, 14, null);
        }
        bVar = new b(interfaceC5133d);
        Object obj2 = bVar.result;
        EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
        i = bVar.label;
    }

    @Override // D4.d
    public Object execute(List<? extends D4.g> list, InterfaceC5133d interfaceC5133d) {
        com.onesignal.debug.internal.logging.b.debug$default("LoginUserFromSubscriptionOperationExecutor(operation: " + list + ')', null, 2, null);
        if (this._identityVerificationService.getNewCodePathsRun() && c.shouldFailLoginUserFromSubscription(this._identityVerificationService.getIvBehaviorActive())) {
            com.onesignal.debug.internal.logging.b.warn$default("LoginUserFromSubscriptionOperation is not supported when identity verification is enabled. Dropping.", null, 2, null);
            return new D4.a(D4.b.FAIL_NORETRY, null, null, null, 14, null);
        }
        if (list.size() > 1) {
            throw new Exception("Only supports one operation! Attempted operations:\n" + list);
        }
        D4.g gVar = (D4.g) AbstractC4979j.G(list);
        if (gVar instanceof R5.e) {
            return loginUser((R5.e) gVar, interfaceC5133d);
        }
        throw new Exception("Unrecognized operation: " + gVar);
    }

    @Override // D4.d
    public List<String> getOperations() {
        return p8.g.k(LOGIN_USER_FROM_SUBSCRIPTION_USER);
    }
}
