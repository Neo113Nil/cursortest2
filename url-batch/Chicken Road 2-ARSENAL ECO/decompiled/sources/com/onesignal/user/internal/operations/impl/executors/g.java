package com.onesignal.user.internal.operations.impl.executors;

import d2.C0317a;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import l5.AbstractC0506j;
import n3.InterfaceC0545c;
import o5.InterfaceC0564d;
import p5.EnumC0580a;
import q5.AbstractC0607c;
import r3.C0617a;
import u0.AbstractC0676f;

/* loaded from: classes.dex */
public final class g implements d2.d {
    public static final a Companion = new a(null);
    public static final String LOGIN_USER_FROM_SUBSCRIPTION_USER = "login-user-from-subscription";
    private final r3.b _identityModelStore;
    private final com.onesignal.core.internal.config.impl.c _identityVerificationService;
    private final com.onesignal.user.internal.properties.b _propertiesModelStore;
    private final InterfaceC0545c _subscriptionBackend;

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
            return g.this.loginUser(null, this);
        }
    }

    public g(InterfaceC0545c _subscriptionBackend, r3.b _identityModelStore, com.onesignal.user.internal.properties.b _propertiesModelStore, com.onesignal.core.internal.config.impl.c _identityVerificationService) {
        kotlin.jvm.internal.i.e(_subscriptionBackend, "_subscriptionBackend");
        kotlin.jvm.internal.i.e(_identityModelStore, "_identityModelStore");
        kotlin.jvm.internal.i.e(_propertiesModelStore, "_propertiesModelStore");
        kotlin.jvm.internal.i.e(_identityVerificationService, "_identityVerificationService");
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
    public final Object loginUser(s3.e eVar, InterfaceC0564d interfaceC0564d) {
        b bVar;
        int i7;
        g gVar;
        s3.e eVar2;
        String str;
        try {
            if (interfaceC0564d instanceof b) {
                bVar = (b) interfaceC0564d;
                int i8 = bVar.label;
                if ((i8 & Integer.MIN_VALUE) != 0) {
                    bVar.label = i8 - Integer.MIN_VALUE;
                    Object obj = bVar.result;
                    EnumC0580a enumC0580a = EnumC0580a.f5697f;
                    i7 = bVar.label;
                    if (i7 != 0) {
                        AbstractC0676f.w(obj);
                        InterfaceC0545c interfaceC0545c = this._subscriptionBackend;
                        String appId = eVar.getAppId();
                        String subscriptionId = eVar.getSubscriptionId();
                        bVar.L$0 = this;
                        bVar.L$1 = eVar;
                        bVar.label = 1;
                        obj = interfaceC0545c.getIdentityFromSubscription(appId, subscriptionId, bVar);
                        if (obj == enumC0580a) {
                            return enumC0580a;
                        }
                        gVar = this;
                        eVar2 = eVar;
                    } else {
                        if (i7 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        eVar2 = (s3.e) bVar.L$1;
                        gVar = (g) bVar.L$0;
                        AbstractC0676f.w(obj);
                    }
                    String str2 = (String) ((Map) obj).get("onesignal_id");
                    str = str2 != null ? null : str2;
                    if (str != null) {
                        com.onesignal.debug.internal.logging.b.warn$default("Subscription " + eVar2.getSubscriptionId() + " has no onesignal_id!", null, 2, null);
                        return new C0317a(d2.b.FAIL_NORETRY, null, null, null, 14, null);
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put(eVar2.getOnesignalId(), str);
                    C0617a c0617a = (C0617a) gVar._identityModelStore.getModel();
                    com.onesignal.user.internal.properties.a aVar = (com.onesignal.user.internal.properties.a) gVar._propertiesModelStore.getModel();
                    if (kotlin.jvm.internal.i.a(c0617a.getOnesignalId(), eVar2.getOnesignalId())) {
                        com.onesignal.common.modeling.i.setStringProperty$default(c0617a, "onesignal_id", str, "HYDRATE", false, 8, null);
                    }
                    if (kotlin.jvm.internal.i.a(aVar.getOnesignalId(), eVar2.getOnesignalId())) {
                        com.onesignal.common.modeling.i.setStringProperty$default(aVar, "onesignalId", str, "HYDRATE", false, 8, null);
                    }
                    return new C0317a(d2.b.SUCCESS, linkedHashMap, AbstractC0676f.n(new s3.h(eVar2.getAppId(), str, eVar2.getExternalId())), null, 8, null);
                }
            }
            if (i7 != 0) {
            }
            String str22 = (String) ((Map) obj).get("onesignal_id");
            if (str22 != null) {
            }
            if (str != null) {
            }
        } catch (P1.a e4) {
            int i9 = h.$EnumSwitchMapping$0[com.onesignal.common.g.INSTANCE.getResponseStatusType(e4.getStatusCode()).ordinal()];
            return i9 != 1 ? i9 != 2 ? new C0317a(d2.b.FAIL_NORETRY, null, null, null, 14, null) : new C0317a(d2.b.FAIL_UNAUTHORIZED, null, null, null, 14, null) : new C0317a(d2.b.FAIL_RETRY, null, null, null, 14, null);
        }
        bVar = new b(interfaceC0564d);
        Object obj2 = bVar.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = bVar.label;
    }

    @Override // d2.d
    public Object execute(List<? extends d2.g> list, InterfaceC0564d interfaceC0564d) {
        com.onesignal.debug.internal.logging.b.debug$default("LoginUserFromSubscriptionOperationExecutor(operation: " + list + ')', null, 2, null);
        if (this._identityVerificationService.getNewCodePathsRun() && c.shouldFailLoginUserFromSubscription(this._identityVerificationService.getIvBehaviorActive())) {
            com.onesignal.debug.internal.logging.b.warn$default("LoginUserFromSubscriptionOperation is not supported when identity verification is enabled. Dropping.", null, 2, null);
            return new C0317a(d2.b.FAIL_NORETRY, null, null, null, 14, null);
        }
        if (list.size() > 1) {
            throw new Exception("Only supports one operation! Attempted operations:\n" + list);
        }
        d2.g gVar = (d2.g) AbstractC0506j.E(list);
        if (gVar instanceof s3.e) {
            return loginUser((s3.e) gVar, interfaceC0564d);
        }
        throw new Exception("Unrecognized operation: " + gVar);
    }

    @Override // d2.d
    public List<String> getOperations() {
        return AbstractC0676f.n(LOGIN_USER_FROM_SUBSCRIPTION_USER);
    }
}
