package com.onesignal.user.internal.operations.impl.executors;

import H5.r;
import android.os.Build;
import com.onesignal.common.AndroidUtils;
import d2.C0317a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import k5.C0477g;
import l5.AbstractC0506j;
import l5.AbstractC0507k;
import l5.t;
import n3.C0550h;
import n3.EnumC0552j;
import n3.InterfaceC0545c;
import o3.InterfaceC0559a;
import o5.InterfaceC0564d;
import p5.EnumC0580a;
import q5.AbstractC0607c;
import u0.AbstractC0676f;
import u3.C0692a;

/* loaded from: classes.dex */
public final class n implements d2.d {
    public static final String CREATE_SUBSCRIPTION = "create-subscription";
    public static final a Companion = new a(null);
    public static final String DELETE_SUBSCRIPTION = "delete-subscription";
    public static final String TRANSFER_SUBSCRIPTION = "transfer-subscription";
    public static final String UPDATE_SUBSCRIPTION = "update-subscription";
    private final T1.f _applicationService;
    private final InterfaceC0559a _buildUserService;
    private final com.onesignal.core.internal.config.c _configModelStore;
    private final O1.c _consistencyManager;
    private final Y1.c _deviceService;
    private final com.onesignal.core.internal.config.impl.c _identityVerificationService;
    private final com.onesignal.user.internal.jwt.c _jwtTokenStore;
    private final C0692a _newRecordState;
    private final InterfaceC0545c _subscriptionBackend;
    private final w3.e _subscriptionModelStore;

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
        int label;
        /* synthetic */ Object result;

        public b(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return n.this.createSubscription(null, null, this);
        }
    }

    public static final class c extends AbstractC0607c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public c(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return n.this.deleteSubscription(null, this);
        }
    }

    public static final class d extends AbstractC0607c {
        int label;
        /* synthetic */ Object result;

        public d(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return n.this.transferSubscription(null, this);
        }
    }

    public static final class e extends AbstractC0607c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public e(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return n.this.updateSubscription(null, null, this);
        }
    }

    public n(InterfaceC0545c _subscriptionBackend, Y1.c _deviceService, T1.f _applicationService, w3.e _subscriptionModelStore, com.onesignal.core.internal.config.c _configModelStore, InterfaceC0559a _buildUserService, C0692a _newRecordState, O1.c _consistencyManager, com.onesignal.user.internal.jwt.c _jwtTokenStore, com.onesignal.core.internal.config.impl.c _identityVerificationService) {
        kotlin.jvm.internal.i.e(_subscriptionBackend, "_subscriptionBackend");
        kotlin.jvm.internal.i.e(_deviceService, "_deviceService");
        kotlin.jvm.internal.i.e(_applicationService, "_applicationService");
        kotlin.jvm.internal.i.e(_subscriptionModelStore, "_subscriptionModelStore");
        kotlin.jvm.internal.i.e(_configModelStore, "_configModelStore");
        kotlin.jvm.internal.i.e(_buildUserService, "_buildUserService");
        kotlin.jvm.internal.i.e(_newRecordState, "_newRecordState");
        kotlin.jvm.internal.i.e(_consistencyManager, "_consistencyManager");
        kotlin.jvm.internal.i.e(_jwtTokenStore, "_jwtTokenStore");
        kotlin.jvm.internal.i.e(_identityVerificationService, "_identityVerificationService");
        this._subscriptionBackend = _subscriptionBackend;
        this._deviceService = _deviceService;
        this._applicationService = _applicationService;
        this._subscriptionModelStore = _subscriptionModelStore;
        this._configModelStore = _configModelStore;
        this._buildUserService = _buildUserService;
        this._newRecordState = _newRecordState;
        this._consistencyManager = _consistencyManager;
        this._jwtTokenStore = _jwtTokenStore;
        this._identityVerificationService = _identityVerificationService;
    }

    private final EnumC0552j convert(w3.g gVar) {
        int i7 = o.$EnumSwitchMapping$1[gVar.ordinal()];
        return i7 != 1 ? i7 != 2 ? EnumC0552j.Companion.fromDeviceType(this._deviceService.getDeviceType()) : EnumC0552j.EMAIL : EnumC0552j.SMS;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01b2, code lost:
    
        if (r3.resolveConditionsWithID(M1.a.ID, r11) == r4) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01c4 A[Catch: a -> 0x01d0, TryCatch #0 {a -> 0x01d0, blocks: (B:17:0x01b5, B:19:0x01c4, B:20:0x01d3, B:22:0x01e9, B:23:0x01f4), top: B:16:0x01b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01e9 A[Catch: a -> 0x01d0, TryCatch #0 {a -> 0x01d0, blocks: (B:17:0x01b5, B:19:0x01c4, B:20:0x01d3, B:22:0x01e9, B:23:0x01f4), top: B:16:0x01b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x016b A[Catch: a -> 0x006b, TryCatch #2 {a -> 0x006b, blocks: (B:64:0x0066, B:65:0x0167, B:67:0x016b, B:69:0x017d, B:71:0x0187, B:76:0x01a2), top: B:63:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x017d A[Catch: a -> 0x006b, TryCatch #2 {a -> 0x006b, blocks: (B:64:0x0066, B:65:0x0167, B:67:0x016b, B:69:0x017d, B:71:0x0187, B:76:0x01a2), top: B:63:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createSubscription(s3.a aVar, List<? extends d2.g> list, InterfaceC0564d interfaceC0564d) {
        b bVar;
        int i7;
        d2.g gVar;
        String address;
        w3.f status;
        n nVar;
        n nVar2;
        C0477g c0477g;
        String str;
        String str2;
        n nVar3;
        w3.d dVar;
        s3.a aVar2 = aVar;
        if (interfaceC0564d instanceof b) {
            bVar = (b) interfaceC0564d;
            int i8 = bVar.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                bVar.label = i8 - Integer.MIN_VALUE;
                b bVar2 = bVar;
                Object obj = bVar2.result;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                i7 = bVar2.label;
                if (i7 == 0) {
                    if (i7 != 1) {
                        if (i7 == 2) {
                            str = (String) bVar2.L$2;
                            aVar2 = (s3.a) bVar2.L$1;
                            nVar = (n) bVar2.L$0;
                        } else {
                            if (i7 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            str = (String) bVar2.L$2;
                            aVar2 = (s3.a) bVar2.L$1;
                            nVar = (n) bVar2.L$0;
                        }
                        try {
                            AbstractC0676f.w(obj);
                            str2 = str;
                            nVar3 = nVar;
                            try {
                                dVar = (w3.d) nVar3._subscriptionModelStore.get(aVar2.getSubscriptionId());
                                if (dVar != null) {
                                    com.onesignal.common.modeling.i.setStringProperty$default(dVar, "id", str2, "HYDRATE", false, 8, null);
                                }
                                if (kotlin.jvm.internal.i.a(((com.onesignal.core.internal.config.b) nVar3._configModelStore.getModel()).getPushSubscriptionId(), aVar2.getSubscriptionId())) {
                                    ((com.onesignal.core.internal.config.b) nVar3._configModelStore.getModel()).setPushSubscriptionId(str2);
                                }
                                return new C0317a(d2.b.SUCCESS, t.q0(new C0477g(aVar2.getSubscriptionId(), str2)), null, null, 12, null);
                            } catch (P1.a e4) {
                                e = e4;
                                nVar = nVar3;
                            }
                        } catch (P1.a e7) {
                            e = e7;
                        }
                    } else {
                        aVar2 = (s3.a) bVar2.L$1;
                        nVar2 = (n) bVar2.L$0;
                        try {
                            AbstractC0676f.w(obj);
                        } catch (P1.a e8) {
                            e = e8;
                            nVar = nVar2;
                        }
                    }
                    int i9 = o.$EnumSwitchMapping$0[com.onesignal.common.g.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                    if (i9 == 1) {
                        return new C0317a(d2.b.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                    }
                    if (i9 == 2 || i9 == 3) {
                        return new C0317a(d2.b.FAIL_NORETRY, null, null, null, 14, null);
                    }
                    if (i9 == 4) {
                        return new C0317a(d2.b.FAIL_UNAUTHORIZED, null, null, e.getRetryAfterSeconds(), 6, null);
                    }
                    if (i9 != 5) {
                        throw new r();
                    }
                    if (e.getStatusCode() == 404 && nVar._newRecordState.isInMissingRetryWindow(aVar2.getOnesignalId())) {
                        return new C0317a(d2.b.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                    }
                    List<d2.g> rebuildOperationsIfCurrentUser = nVar._buildUserService.getRebuildOperationsIfCurrentUser(aVar2.getAppId(), aVar2.getOnesignalId());
                    return rebuildOperationsIfCurrentUser == null ? new C0317a(d2.b.FAIL_NORETRY, null, null, null, 14, null) : new C0317a(d2.b.FAIL_RETRY, null, rebuildOperationsIfCurrentUser, e.getRetryAfterSeconds(), 2, null);
                }
                AbstractC0676f.w(obj);
                if (list == null || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        if (((d2.g) it.next()) instanceof s3.c) {
                            return new C0317a(d2.b.SUCCESS, null, null, null, 14, null);
                        }
                    }
                }
                ListIterator<? extends d2.g> listIterator = list.listIterator(list.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        gVar = null;
                        break;
                    }
                    gVar = listIterator.previous();
                    if (gVar instanceof s3.q) {
                        break;
                    }
                }
                s3.q qVar = (s3.q) gVar;
                boolean enabled = qVar != null ? qVar.getEnabled() : aVar2.getEnabled();
                if (qVar == null || (address = qVar.getAddress()) == null) {
                    address = aVar2.getAddress();
                }
                String str3 = address;
                if (qVar == null || (status = qVar.getStatus()) == null) {
                    status = aVar2.getStatus();
                }
                try {
                    EnumC0552j convert = convert(aVar2.getType());
                    Boolean valueOf = Boolean.valueOf(enabled);
                    Integer num = new Integer(status.getValue());
                    String sdkVersion = com.onesignal.common.h.INSTANCE.getSdkVersion();
                    String str4 = Build.MODEL;
                    String str5 = Build.VERSION.RELEASE;
                    Boolean valueOf2 = Boolean.valueOf(com.onesignal.common.k.INSTANCE.isRooted());
                    com.onesignal.common.c cVar = com.onesignal.common.c.INSTANCE;
                    C0550h c0550h = new C0550h(null, convert, str3, valueOf, num, sdkVersion, str4, str5, valueOf2, cVar.getNetType(this._applicationService.getAppContext()), cVar.getCarrierName(this._applicationService.getAppContext()), AndroidUtils.INSTANCE.getAppVersion(this._applicationService.getAppContext()));
                    f resolveBackendParams = com.onesignal.user.internal.operations.impl.executors.c.resolveBackendParams(aVar2, aVar2.getOnesignalId(), this._jwtTokenStore, this._identityVerificationService);
                    InterfaceC0545c interfaceC0545c = this._subscriptionBackend;
                    String appId = aVar2.getAppId();
                    String aliasLabel = resolveBackendParams.getAliasLabel();
                    String aliasValue = resolveBackendParams.getAliasValue();
                    String jwt = resolveBackendParams.getJwt();
                    bVar2.L$0 = this;
                    bVar2.L$1 = aVar2;
                    bVar2.label = 1;
                    obj = interfaceC0545c.createSubscription(appId, aliasLabel, aliasValue, c0550h, jwt, bVar2);
                    if (obj != enumC0580a) {
                        nVar2 = this;
                    }
                    return enumC0580a;
                } catch (P1.a e9) {
                    e = e9;
                    nVar = this;
                }
                c0477g = (C0477g) obj;
                if (c0477g != null) {
                    return new C0317a(d2.b.SUCCESS, null, null, null, 14, null);
                }
                str = (String) c0477g.f5198f;
                M1.b bVar3 = (M1.b) c0477g.f5199g;
                if (bVar3 != null) {
                    O1.c cVar2 = nVar2._consistencyManager;
                    String onesignalId = aVar2.getOnesignalId();
                    N1.a aVar3 = N1.a.SUBSCRIPTION;
                    bVar2.L$0 = nVar2;
                    bVar2.L$1 = aVar2;
                    bVar2.L$2 = str;
                    bVar2.label = 2;
                    if (cVar2.setRywData(onesignalId, aVar3, bVar3, bVar2) == enumC0580a) {
                        return enumC0580a;
                    }
                    nVar = nVar2;
                } else {
                    O1.c cVar3 = nVar2._consistencyManager;
                    bVar2.L$0 = nVar2;
                    bVar2.L$1 = aVar2;
                    bVar2.L$2 = str;
                    bVar2.label = 3;
                }
                str2 = str;
                nVar3 = nVar;
                dVar = (w3.d) nVar3._subscriptionModelStore.get(aVar2.getSubscriptionId());
                if (dVar != null) {
                }
                if (kotlin.jvm.internal.i.a(((com.onesignal.core.internal.config.b) nVar3._configModelStore.getModel()).getPushSubscriptionId(), aVar2.getSubscriptionId())) {
                }
                return new C0317a(d2.b.SUCCESS, t.q0(new C0477g(aVar2.getSubscriptionId(), str2)), null, null, 12, null);
            }
        }
        bVar = new b(interfaceC0564d);
        b bVar22 = bVar;
        Object obj2 = bVar22.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = bVar22.label;
        if (i7 == 0) {
        }
        c0477g = (C0477g) obj2;
        if (c0477g != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object deleteSubscription(s3.c cVar, InterfaceC0564d interfaceC0564d) {
        c cVar2;
        int i7;
        P1.a aVar;
        n nVar;
        int i8;
        if (interfaceC0564d instanceof c) {
            cVar2 = (c) interfaceC0564d;
            int i9 = cVar2.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                cVar2.label = i9 - Integer.MIN_VALUE;
                Object obj = cVar2.result;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                i7 = cVar2.label;
                if (i7 != 0) {
                    AbstractC0676f.w(obj);
                    String resolveJwt = com.onesignal.user.internal.operations.impl.executors.c.resolveJwt(cVar, this._jwtTokenStore, this._identityVerificationService);
                    try {
                        InterfaceC0545c interfaceC0545c = this._subscriptionBackend;
                        String appId = cVar.getAppId();
                        String subscriptionId = cVar.getSubscriptionId();
                        cVar2.L$0 = this;
                        cVar2.L$1 = cVar;
                        cVar2.label = 1;
                        if (interfaceC0545c.deleteSubscription(appId, subscriptionId, resolveJwt, cVar2) == enumC0580a) {
                            return enumC0580a;
                        }
                        nVar = this;
                    } catch (P1.a e4) {
                        aVar = e4;
                        nVar = this;
                        i8 = o.$EnumSwitchMapping$0[com.onesignal.common.g.INSTANCE.getResponseStatusType(aVar.getStatusCode()).ordinal()];
                        if (i8 != 1) {
                        }
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    cVar = (s3.c) cVar2.L$1;
                    nVar = (n) cVar2.L$0;
                    try {
                        AbstractC0676f.w(obj);
                    } catch (P1.a e7) {
                        aVar = e7;
                        i8 = o.$EnumSwitchMapping$0[com.onesignal.common.g.INSTANCE.getResponseStatusType(aVar.getStatusCode()).ordinal()];
                        if (i8 != 1) {
                            return new C0317a(d2.b.FAIL_RETRY, null, null, aVar.getRetryAfterSeconds(), 6, null);
                        }
                        if (i8 == 4) {
                            return new C0317a(d2.b.FAIL_UNAUTHORIZED, null, null, aVar.getRetryAfterSeconds(), 6, null);
                        }
                        if (i8 != 5) {
                            return new C0317a(d2.b.FAIL_NORETRY, null, null, null, 14, null);
                        }
                        if (aVar.getStatusCode() == 404) {
                            List z5 = AbstractC0507k.z(cVar.getOnesignalId(), cVar.getSubscriptionId());
                            if (!z5.isEmpty()) {
                                Iterator it = z5.iterator();
                                while (it.hasNext()) {
                                    if (nVar._newRecordState.isInMissingRetryWindow((String) it.next())) {
                                        return new C0317a(d2.b.FAIL_RETRY, null, null, aVar.getRetryAfterSeconds(), 6, null);
                                    }
                                }
                            }
                        }
                        return new C0317a(d2.b.SUCCESS, null, null, null, 14, null);
                    }
                }
                nVar._subscriptionModelStore.remove(cVar.getSubscriptionId(), "HYDRATE");
                return new C0317a(d2.b.SUCCESS, null, null, null, 14, null);
            }
        }
        cVar2 = new c(interfaceC0564d);
        Object obj2 = cVar2.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = cVar2.label;
        if (i7 != 0) {
        }
        nVar._subscriptionModelStore.remove(cVar.getSubscriptionId(), "HYDRATE");
        return new C0317a(d2.b.SUCCESS, null, null, null, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object transferSubscription(s3.p pVar, InterfaceC0564d interfaceC0564d) {
        d dVar;
        int i7;
        try {
            if (interfaceC0564d instanceof d) {
                dVar = (d) interfaceC0564d;
                int i8 = dVar.label;
                if ((i8 & Integer.MIN_VALUE) != 0) {
                    dVar.label = i8 - Integer.MIN_VALUE;
                    d dVar2 = dVar;
                    Object obj = dVar2.result;
                    EnumC0580a enumC0580a = EnumC0580a.f5697f;
                    i7 = dVar2.label;
                    if (i7 != 0) {
                        AbstractC0676f.w(obj);
                        f resolveBackendParams = com.onesignal.user.internal.operations.impl.executors.c.resolveBackendParams(pVar, pVar.getOnesignalId(), this._jwtTokenStore, this._identityVerificationService);
                        InterfaceC0545c interfaceC0545c = this._subscriptionBackend;
                        String appId = pVar.getAppId();
                        String subscriptionId = pVar.getSubscriptionId();
                        String aliasLabel = resolveBackendParams.getAliasLabel();
                        String aliasValue = resolveBackendParams.getAliasValue();
                        String jwt = resolveBackendParams.getJwt();
                        dVar2.label = 1;
                        if (interfaceC0545c.transferSubscription(appId, subscriptionId, aliasLabel, aliasValue, jwt, dVar2) == enumC0580a) {
                            return enumC0580a;
                        }
                    } else {
                        if (i7 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC0676f.w(obj);
                    }
                    return new C0317a(d2.b.SUCCESS, null, null, null, 14, null);
                }
            }
            if (i7 != 0) {
            }
            return new C0317a(d2.b.SUCCESS, null, null, null, 14, null);
        } catch (P1.a e4) {
            int i9 = o.$EnumSwitchMapping$0[com.onesignal.common.g.INSTANCE.getResponseStatusType(e4.getStatusCode()).ordinal()];
            return i9 != 1 ? i9 != 4 ? new C0317a(d2.b.FAIL_NORETRY, null, null, null, 14, null) : new C0317a(d2.b.FAIL_UNAUTHORIZED, null, null, e4.getRetryAfterSeconds(), 6, null) : new C0317a(d2.b.FAIL_RETRY, null, null, e4.getRetryAfterSeconds(), 6, null);
        }
        dVar = new d(interfaceC0564d);
        d dVar22 = dVar;
        Object obj2 = dVar22.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = dVar22.label;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object updateExistingSubscriptionFromCreate(s3.a aVar, List<? extends d2.g> list, InterfaceC0564d interfaceC0564d) {
        d2.g gVar;
        String address;
        w3.f status;
        if (list == null || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((d2.g) it.next()) instanceof s3.c) {
                    return new C0317a(d2.b.SUCCESS, null, null, null, 14, null);
                }
            }
        }
        ListIterator<? extends d2.g> listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                gVar = null;
                break;
            }
            gVar = listIterator.previous();
            if (gVar instanceof s3.q) {
                break;
            }
        }
        s3.q qVar = (s3.q) gVar;
        String appId = aVar.getAppId();
        String onesignalId = aVar.getOnesignalId();
        String externalId = aVar.getExternalId();
        String subscriptionId = aVar.getSubscriptionId();
        w3.g type = aVar.getType();
        boolean enabled = qVar != null ? qVar.getEnabled() : aVar.getEnabled();
        if (qVar == null || (address = qVar.getAddress()) == null) {
            address = aVar.getAddress();
        }
        String str = address;
        if (qVar == null || (status = qVar.getStatus()) == null) {
            status = aVar.getStatus();
        }
        s3.q qVar2 = new s3.q(appId, onesignalId, externalId, subscriptionId, type, enabled, str, status);
        return updateSubscription(qVar2, AbstractC0676f.n(qVar2), interfaceC0564d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(3:(5:(1:(1:12)(2:54|55))(1:56)|13|14|15|16)(4:57|58|59|60)|20|(2:22|(2:24|(2:26|27)(8:28|(2:30|(3:32|(3:35|(3:37|38|39)(1:40)|33)|41))|42|(1:44)|45|(1:47)|48|49))(2:50|51))(2:52|53))(5:76|77|78|(1:80)|67)|61|62|(4:64|(2:66|67)|15|16)(1:68)))|84|6|7|(0)(0)|61|62|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x012c, code lost:
    
        if (r0.resolveConditionsWithID(M1.a.ID, r8) == r2) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0118, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0119, code lost:
    
        r3 = r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0101 A[Catch: a -> 0x0118, TryCatch #2 {a -> 0x0118, blocks: (B:62:0x00fc, B:64:0x0101, B:68:0x011c), top: B:61:0x00fc }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x011c A[Catch: a -> 0x0118, TRY_LEAVE, TryCatch #2 {a -> 0x0118, blocks: (B:62:0x00fc, B:64:0x0101, B:68:0x011c), top: B:61:0x00fc }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object updateSubscription(s3.q qVar, List<? extends d2.g> list, InterfaceC0564d interfaceC0564d) {
        e eVar;
        int i7;
        s3.q qVar2;
        n nVar;
        s3.q qVar3;
        Object updateSubscription;
        n nVar2;
        s3.q qVar4;
        M1.b bVar;
        int i8;
        if (interfaceC0564d instanceof e) {
            eVar = (e) interfaceC0564d;
            int i9 = eVar.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                eVar.label = i9 - Integer.MIN_VALUE;
                e eVar2 = eVar;
                Object obj = eVar2.result;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                i7 = eVar2.label;
                if (i7 == 0) {
                    if (i7 != 1) {
                        if (i7 == 2) {
                            qVar4 = (s3.q) eVar2.L$1;
                            nVar = (n) eVar2.L$0;
                        } else {
                            if (i7 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            qVar4 = (s3.q) eVar2.L$1;
                            nVar = (n) eVar2.L$0;
                        }
                        try {
                            AbstractC0676f.w(obj);
                            return new C0317a(d2.b.SUCCESS, null, null, null, 14, null);
                        } catch (P1.a e4) {
                            e = e4;
                        }
                    } else {
                        s3.q qVar5 = (s3.q) eVar2.L$2;
                        s3.q qVar6 = (s3.q) eVar2.L$1;
                        nVar2 = (n) eVar2.L$0;
                        try {
                            AbstractC0676f.w(obj);
                            qVar2 = qVar5;
                            updateSubscription = obj;
                            qVar3 = qVar6;
                        } catch (P1.a e7) {
                            e = e7;
                            qVar4 = qVar5;
                            nVar = nVar2;
                        }
                    }
                    i8 = o.$EnumSwitchMapping$0[com.onesignal.common.g.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                    if (i8 == 1) {
                        return new C0317a(d2.b.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                    }
                    if (i8 == 4) {
                        return new C0317a(d2.b.FAIL_UNAUTHORIZED, null, null, e.getRetryAfterSeconds(), 6, null);
                    }
                    if (i8 != 5) {
                        return new C0317a(d2.b.FAIL_NORETRY, null, null, null, 14, null);
                    }
                    if (e.getStatusCode() == 404) {
                        List z5 = AbstractC0507k.z(qVar4.getOnesignalId(), qVar4.getSubscriptionId());
                        if (!z5.isEmpty()) {
                            Iterator it = z5.iterator();
                            while (it.hasNext()) {
                                if (nVar._newRecordState.isInMissingRetryWindow((String) it.next())) {
                                    return new C0317a(d2.b.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                                }
                            }
                        }
                    }
                    String createLocalId = com.onesignal.common.d.INSTANCE.createLocalId();
                    String subscriptionId = qVar4.getSubscriptionId();
                    w3.d dVar = (w3.d) nVar._subscriptionModelStore.get(subscriptionId);
                    if (dVar != null) {
                        com.onesignal.common.modeling.i.setStringProperty$default(dVar, "id", createLocalId, "HYDRATE", false, 8, null);
                    }
                    if (kotlin.jvm.internal.i.a(((com.onesignal.core.internal.config.b) nVar._configModelStore.getModel()).getPushSubscriptionId(), subscriptionId)) {
                        ((com.onesignal.core.internal.config.b) nVar._configModelStore.getModel()).setPushSubscriptionId(createLocalId);
                    }
                    return new C0317a(d2.b.FAIL_NORETRY, null, AbstractC0676f.n(new s3.a(qVar4.getAppId(), qVar4.getOnesignalId(), qVar4.getExternalId(), createLocalId, qVar4.getType(), qVar4.getEnabled(), qVar4.getAddress(), qVar4.getStatus())), null, 10, null);
                }
                AbstractC0676f.w(obj);
                Object J3 = AbstractC0506j.J(list);
                kotlin.jvm.internal.i.c(J3, "null cannot be cast to non-null type com.onesignal.user.internal.operations.UpdateSubscriptionOperation");
                qVar2 = (s3.q) J3;
                try {
                    EnumC0552j convert = convert(qVar2.getType());
                    String address = qVar2.getAddress();
                    Boolean valueOf = Boolean.valueOf(qVar2.getEnabled());
                    Integer num = new Integer(qVar2.getStatus().getValue());
                    String sdkVersion = com.onesignal.common.h.INSTANCE.getSdkVersion();
                    String str = Build.MODEL;
                    String str2 = Build.VERSION.RELEASE;
                    Boolean valueOf2 = Boolean.valueOf(com.onesignal.common.k.INSTANCE.isRooted());
                    com.onesignal.common.c cVar = com.onesignal.common.c.INSTANCE;
                    C0550h c0550h = new C0550h(null, convert, address, valueOf, num, sdkVersion, str, str2, valueOf2, cVar.getNetType(this._applicationService.getAppContext()), cVar.getCarrierName(this._applicationService.getAppContext()), AndroidUtils.INSTANCE.getAppVersion(this._applicationService.getAppContext()));
                    String resolveJwt = com.onesignal.user.internal.operations.impl.executors.c.resolveJwt(qVar2, this._jwtTokenStore, this._identityVerificationService);
                    InterfaceC0545c interfaceC0545c = this._subscriptionBackend;
                    String appId = qVar2.getAppId();
                    String subscriptionId2 = qVar2.getSubscriptionId();
                    eVar2.L$0 = this;
                    qVar3 = qVar;
                    eVar2.L$1 = qVar3;
                    eVar2.L$2 = qVar2;
                    eVar2.label = 1;
                    updateSubscription = interfaceC0545c.updateSubscription(appId, subscriptionId2, c0550h, resolveJwt, eVar2);
                    if (updateSubscription != enumC0580a) {
                        nVar2 = this;
                    }
                    return enumC0580a;
                } catch (P1.a e8) {
                    e = e8;
                    nVar = this;
                    qVar4 = qVar2;
                    i8 = o.$EnumSwitchMapping$0[com.onesignal.common.g.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                    if (i8 == 1) {
                    }
                }
                bVar = (M1.b) updateSubscription;
                if (bVar == null) {
                    O1.c cVar2 = nVar2._consistencyManager;
                    String onesignalId = qVar3.getOnesignalId();
                    N1.a aVar = N1.a.SUBSCRIPTION;
                    eVar2.L$0 = nVar2;
                    eVar2.L$1 = qVar2;
                    eVar2.L$2 = null;
                    eVar2.label = 2;
                    if (cVar2.setRywData(onesignalId, aVar, bVar, eVar2) == enumC0580a) {
                        return enumC0580a;
                    }
                    return new C0317a(d2.b.SUCCESS, null, null, null, 14, null);
                }
                O1.c cVar3 = nVar2._consistencyManager;
                eVar2.L$0 = nVar2;
                eVar2.L$1 = qVar2;
                eVar2.L$2 = null;
                eVar2.label = 3;
            }
        }
        eVar = new e(interfaceC0564d);
        e eVar22 = eVar;
        Object obj2 = eVar22.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = eVar22.label;
        if (i7 == 0) {
        }
        bVar = (M1.b) updateSubscription;
        if (bVar == null) {
        }
    }

    @Override // d2.d
    public Object execute(List<? extends d2.g> list, InterfaceC0564d interfaceC0564d) {
        com.onesignal.debug.internal.logging.b.log(i2.c.DEBUG, "SubscriptionOperationExecutor(operations: " + list + ')');
        d2.g gVar = (d2.g) AbstractC0506j.E(list);
        if (gVar instanceof s3.a) {
            s3.a aVar = (s3.a) gVar;
            return !com.onesignal.common.d.INSTANCE.isLocalId(aVar.getSubscriptionId()) ? updateExistingSubscriptionFromCreate(aVar, list, interfaceC0564d) : createSubscription(aVar, list, interfaceC0564d);
        }
        if (!list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((d2.g) it.next()) instanceof s3.c) {
                    if (list.size() > 1) {
                        throw new Exception("Only supports one operation! Attempted operations:\n" + list);
                    }
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list) {
                        if (obj instanceof s3.c) {
                            arrayList.add(obj);
                        }
                    }
                    return deleteSubscription((s3.c) AbstractC0506j.E(arrayList), interfaceC0564d);
                }
            }
        }
        if (gVar instanceof s3.q) {
            return updateSubscription((s3.q) gVar, list, interfaceC0564d);
        }
        if (!(gVar instanceof s3.p)) {
            throw new Exception("Unrecognized operation: " + gVar);
        }
        if (list.size() <= 1) {
            return transferSubscription((s3.p) gVar, interfaceC0564d);
        }
        throw new Exception("TransferSubscriptionOperation only supports one operation! Attempted operations:\n" + list);
    }

    @Override // d2.d
    public List<String> getOperations() {
        return AbstractC0507k.z(CREATE_SUBSCRIPTION, UPDATE_SUBSCRIPTION, DELETE_SUBSCRIPTION, TRANSFER_SUBSCRIPTION);
    }
}
