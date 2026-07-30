package com.onesignal.user.internal.operations.impl.executors;

import android.os.Build;
import com.onesignal.common.AndroidUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.H;
import kotlin.collections.r;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o2.C0800b;
import p2.EnumC0826a;
import r2.C0846a;

/* loaded from: classes.dex */
public final class n implements F2.d {
    public static final String CREATE_SUBSCRIPTION = "create-subscription";
    public static final a Companion = new a(null);
    public static final String DELETE_SUBSCRIPTION = "delete-subscription";
    public static final String TRANSFER_SUBSCRIPTION = "transfer-subscription";
    public static final String UPDATE_SUBSCRIPTION = "update-subscription";
    private final v2.f _applicationService;
    private final Q3.a _buildUserService;
    private final com.onesignal.core.internal.config.c _configModelStore;
    private final q2.c _consistencyManager;
    private final A2.c _deviceService;
    private final com.onesignal.core.internal.config.impl.c _identityVerificationService;
    private final com.onesignal.user.internal.jwt.c _jwtTokenStore;
    private final W3.a _newRecordState;
    private final P3.c _subscriptionBackend;
    private final Y3.e _subscriptionModelStore;

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
        int label;
        /* synthetic */ Object result;

        public b(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return n.this.createSubscription(null, null, this);
        }
    }

    public static final class c extends X5.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public c(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return n.this.deleteSubscription(null, this);
        }
    }

    public static final class d extends X5.c {
        int label;
        /* synthetic */ Object result;

        public d(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return n.this.transferSubscription(null, this);
        }
    }

    public static final class e extends X5.c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public e(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return n.this.updateSubscription(null, null, this);
        }
    }

    public n(P3.c _subscriptionBackend, A2.c _deviceService, v2.f _applicationService, Y3.e _subscriptionModelStore, com.onesignal.core.internal.config.c _configModelStore, Q3.a _buildUserService, W3.a _newRecordState, q2.c _consistencyManager, com.onesignal.user.internal.jwt.c _jwtTokenStore, com.onesignal.core.internal.config.impl.c _identityVerificationService) {
        Intrinsics.checkNotNullParameter(_subscriptionBackend, "_subscriptionBackend");
        Intrinsics.checkNotNullParameter(_deviceService, "_deviceService");
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        Intrinsics.checkNotNullParameter(_subscriptionModelStore, "_subscriptionModelStore");
        Intrinsics.checkNotNullParameter(_configModelStore, "_configModelStore");
        Intrinsics.checkNotNullParameter(_buildUserService, "_buildUserService");
        Intrinsics.checkNotNullParameter(_newRecordState, "_newRecordState");
        Intrinsics.checkNotNullParameter(_consistencyManager, "_consistencyManager");
        Intrinsics.checkNotNullParameter(_jwtTokenStore, "_jwtTokenStore");
        Intrinsics.checkNotNullParameter(_identityVerificationService, "_identityVerificationService");
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

    private final P3.j convert(Y3.g gVar) {
        int i2 = o.$EnumSwitchMapping$1[gVar.ordinal()];
        return i2 != 1 ? i2 != 2 ? P3.j.Companion.fromDeviceType(this._deviceService.getDeviceType()) : P3.j.EMAIL : P3.j.SMS;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01b2, code lost:
    
        if (r3.resolveConditionsWithID(o2.C0799a.ID, r11) == r4) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01c4 A[Catch: a -> 0x01d0, TryCatch #1 {a -> 0x01d0, blocks: (B:17:0x01b5, B:19:0x01c4, B:20:0x01d3, B:22:0x01e9, B:23:0x01f4), top: B:16:0x01b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01e9 A[Catch: a -> 0x01d0, TryCatch #1 {a -> 0x01d0, blocks: (B:17:0x01b5, B:19:0x01c4, B:20:0x01d3, B:22:0x01e9, B:23:0x01f4), top: B:16:0x01b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x016b A[Catch: a -> 0x006b, TryCatch #2 {a -> 0x006b, blocks: (B:64:0x0066, B:65:0x0167, B:67:0x016b, B:69:0x017d, B:71:0x0187, B:76:0x01a2), top: B:63:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x017d A[Catch: a -> 0x006b, TryCatch #2 {a -> 0x006b, blocks: (B:64:0x0066, B:65:0x0167, B:67:0x016b, B:69:0x017d, B:71:0x0187, B:76:0x01a2), top: B:63:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createSubscription(U3.a aVar, List<? extends F2.g> list, V5.b bVar) {
        b bVar2;
        int i2;
        F2.g gVar;
        String address;
        Y3.f status;
        n nVar;
        n nVar2;
        Pair pair;
        String str;
        String str2;
        n nVar3;
        Y3.d dVar;
        U3.a aVar2 = aVar;
        if (bVar instanceof b) {
            bVar2 = (b) bVar;
            int i5 = bVar2.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                bVar2.label = i5 - Integer.MIN_VALUE;
                b bVar3 = bVar2;
                Object obj = bVar3.result;
                W5.a aVar3 = W5.a.f2787d;
                i2 = bVar3.label;
                if (i2 == 0) {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            str = (String) bVar3.L$2;
                            aVar2 = (U3.a) bVar3.L$1;
                            nVar = (n) bVar3.L$0;
                        } else {
                            if (i2 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            str = (String) bVar3.L$2;
                            aVar2 = (U3.a) bVar3.L$1;
                            nVar = (n) bVar3.L$0;
                        }
                        try {
                            V6.b.P(obj);
                            str2 = str;
                            nVar3 = nVar;
                            try {
                                dVar = (Y3.d) nVar3._subscriptionModelStore.get(aVar2.getSubscriptionId());
                                if (dVar != null) {
                                    com.onesignal.common.modeling.i.setStringProperty$default(dVar, "id", str2, "HYDRATE", false, 8, null);
                                }
                                if (Intrinsics.a(((com.onesignal.core.internal.config.b) nVar3._configModelStore.getModel()).getPushSubscriptionId(), aVar2.getSubscriptionId())) {
                                    ((com.onesignal.core.internal.config.b) nVar3._configModelStore.getModel()).setPushSubscriptionId(str2);
                                }
                                return new F2.a(F2.b.SUCCESS, H.b(new Pair(aVar2.getSubscriptionId(), str2)), null, null, 12, null);
                            } catch (C0846a e7) {
                                e = e7;
                                nVar = nVar3;
                            }
                        } catch (C0846a e8) {
                            e = e8;
                        }
                    } else {
                        aVar2 = (U3.a) bVar3.L$1;
                        nVar2 = (n) bVar3.L$0;
                        try {
                            V6.b.P(obj);
                        } catch (C0846a e9) {
                            e = e9;
                            nVar = nVar2;
                        }
                    }
                    int i7 = o.$EnumSwitchMapping$0[com.onesignal.common.g.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                    if (i7 == 1) {
                        return new F2.a(F2.b.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                    }
                    if (i7 == 2 || i7 == 3) {
                        return new F2.a(F2.b.FAIL_NORETRY, null, null, null, 14, null);
                    }
                    if (i7 == 4) {
                        return new F2.a(F2.b.FAIL_UNAUTHORIZED, null, null, e.getRetryAfterSeconds(), 6, null);
                    }
                    if (i7 != 5) {
                        throw new R5.k();
                    }
                    if (e.getStatusCode() == 404 && nVar._newRecordState.isInMissingRetryWindow(aVar2.getOnesignalId())) {
                        return new F2.a(F2.b.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                    }
                    List<F2.g> rebuildOperationsIfCurrentUser = nVar._buildUserService.getRebuildOperationsIfCurrentUser(aVar2.getAppId(), aVar2.getOnesignalId());
                    return rebuildOperationsIfCurrentUser == null ? new F2.a(F2.b.FAIL_NORETRY, null, null, null, 14, null) : new F2.a(F2.b.FAIL_RETRY, null, rebuildOperationsIfCurrentUser, e.getRetryAfterSeconds(), 2, null);
                }
                V6.b.P(obj);
                if (list == null || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        if (((F2.g) it.next()) instanceof U3.c) {
                            return new F2.a(F2.b.SUCCESS, null, null, null, 14, null);
                        }
                    }
                }
                ListIterator<? extends F2.g> listIterator = list.listIterator(list.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        gVar = null;
                        break;
                    }
                    gVar = listIterator.previous();
                    if (gVar instanceof U3.q) {
                        break;
                    }
                }
                U3.q qVar = (U3.q) gVar;
                boolean enabled = qVar != null ? qVar.getEnabled() : aVar2.getEnabled();
                if (qVar == null || (address = qVar.getAddress()) == null) {
                    address = aVar2.getAddress();
                }
                String str3 = address;
                if (qVar == null || (status = qVar.getStatus()) == null) {
                    status = aVar2.getStatus();
                }
                try {
                    P3.j convert = convert(aVar2.getType());
                    Boolean valueOf = Boolean.valueOf(enabled);
                    Integer num = new Integer(status.getValue());
                    String sdkVersion = com.onesignal.common.h.INSTANCE.getSdkVersion();
                    String str4 = Build.MODEL;
                    String str5 = Build.VERSION.RELEASE;
                    Boolean valueOf2 = Boolean.valueOf(com.onesignal.common.k.INSTANCE.isRooted());
                    com.onesignal.common.c cVar = com.onesignal.common.c.INSTANCE;
                    P3.h hVar = new P3.h(null, convert, str3, valueOf, num, sdkVersion, str4, str5, valueOf2, cVar.getNetType(this._applicationService.getAppContext()), cVar.getCarrierName(this._applicationService.getAppContext()), AndroidUtils.INSTANCE.getAppVersion(this._applicationService.getAppContext()));
                    f resolveBackendParams = com.onesignal.user.internal.operations.impl.executors.c.resolveBackendParams(aVar2, aVar2.getOnesignalId(), this._jwtTokenStore, this._identityVerificationService);
                    P3.c cVar2 = this._subscriptionBackend;
                    String appId = aVar2.getAppId();
                    String aliasLabel = resolveBackendParams.getAliasLabel();
                    String aliasValue = resolveBackendParams.getAliasValue();
                    String jwt = resolveBackendParams.getJwt();
                    bVar3.L$0 = this;
                    bVar3.L$1 = aVar2;
                    bVar3.label = 1;
                    obj = cVar2.createSubscription(appId, aliasLabel, aliasValue, hVar, jwt, bVar3);
                    if (obj != aVar3) {
                        nVar2 = this;
                    }
                    return aVar3;
                } catch (C0846a e10) {
                    e = e10;
                    nVar = this;
                }
                pair = (Pair) obj;
                if (pair != null) {
                    return new F2.a(F2.b.SUCCESS, null, null, null, 14, null);
                }
                str = (String) pair.f6112d;
                C0800b c0800b = (C0800b) pair.f6113e;
                if (c0800b != null) {
                    q2.c cVar3 = nVar2._consistencyManager;
                    String onesignalId = aVar2.getOnesignalId();
                    EnumC0826a enumC0826a = EnumC0826a.SUBSCRIPTION;
                    bVar3.L$0 = nVar2;
                    bVar3.L$1 = aVar2;
                    bVar3.L$2 = str;
                    bVar3.label = 2;
                    if (cVar3.setRywData(onesignalId, enumC0826a, c0800b, bVar3) == aVar3) {
                        return aVar3;
                    }
                    nVar = nVar2;
                } else {
                    q2.c cVar4 = nVar2._consistencyManager;
                    bVar3.L$0 = nVar2;
                    bVar3.L$1 = aVar2;
                    bVar3.L$2 = str;
                    bVar3.label = 3;
                }
                str2 = str;
                nVar3 = nVar;
                dVar = (Y3.d) nVar3._subscriptionModelStore.get(aVar2.getSubscriptionId());
                if (dVar != null) {
                }
                if (Intrinsics.a(((com.onesignal.core.internal.config.b) nVar3._configModelStore.getModel()).getPushSubscriptionId(), aVar2.getSubscriptionId())) {
                }
                return new F2.a(F2.b.SUCCESS, H.b(new Pair(aVar2.getSubscriptionId(), str2)), null, null, 12, null);
            }
        }
        bVar2 = new b(bVar);
        b bVar32 = bVar2;
        Object obj2 = bVar32.result;
        W5.a aVar32 = W5.a.f2787d;
        i2 = bVar32.label;
        if (i2 == 0) {
        }
        pair = (Pair) obj2;
        if (pair != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object deleteSubscription(U3.c cVar, V5.b bVar) {
        c cVar2;
        int i2;
        C0846a c0846a;
        n nVar;
        int i5;
        List d7;
        if (bVar instanceof c) {
            cVar2 = (c) bVar;
            int i7 = cVar2.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                cVar2.label = i7 - Integer.MIN_VALUE;
                Object obj = cVar2.result;
                W5.a aVar = W5.a.f2787d;
                i2 = cVar2.label;
                if (i2 != 0) {
                    V6.b.P(obj);
                    String resolveJwt = com.onesignal.user.internal.operations.impl.executors.c.resolveJwt(cVar, this._jwtTokenStore, this._identityVerificationService);
                    try {
                        P3.c cVar3 = this._subscriptionBackend;
                        String appId = cVar.getAppId();
                        String subscriptionId = cVar.getSubscriptionId();
                        cVar2.L$0 = this;
                        cVar2.L$1 = cVar;
                        cVar2.label = 1;
                        if (cVar3.deleteSubscription(appId, subscriptionId, resolveJwt, cVar2) == aVar) {
                            return aVar;
                        }
                        nVar = this;
                    } catch (C0846a e7) {
                        c0846a = e7;
                        nVar = this;
                        i5 = o.$EnumSwitchMapping$0[com.onesignal.common.g.INSTANCE.getResponseStatusType(c0846a.getStatusCode()).ordinal()];
                        if (i5 != 1) {
                        }
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    cVar = (U3.c) cVar2.L$1;
                    nVar = (n) cVar2.L$0;
                    try {
                        V6.b.P(obj);
                    } catch (C0846a e8) {
                        c0846a = e8;
                        i5 = o.$EnumSwitchMapping$0[com.onesignal.common.g.INSTANCE.getResponseStatusType(c0846a.getStatusCode()).ordinal()];
                        if (i5 != 1) {
                            return new F2.a(F2.b.FAIL_RETRY, null, null, c0846a.getRetryAfterSeconds(), 6, null);
                        }
                        if (i5 == 4) {
                            return new F2.a(F2.b.FAIL_UNAUTHORIZED, null, null, c0846a.getRetryAfterSeconds(), 6, null);
                        }
                        if (i5 != 5) {
                            return new F2.a(F2.b.FAIL_NORETRY, null, null, null, 14, null);
                        }
                        if (c0846a.getStatusCode() == 404 && ((d7 = r.d(cVar.getOnesignalId(), cVar.getSubscriptionId())) == null || !d7.isEmpty())) {
                            Iterator it = d7.iterator();
                            while (it.hasNext()) {
                                if (nVar._newRecordState.isInMissingRetryWindow((String) it.next())) {
                                    return new F2.a(F2.b.FAIL_RETRY, null, null, c0846a.getRetryAfterSeconds(), 6, null);
                                }
                            }
                        }
                        return new F2.a(F2.b.SUCCESS, null, null, null, 14, null);
                    }
                }
                nVar._subscriptionModelStore.remove(cVar.getSubscriptionId(), "HYDRATE");
                return new F2.a(F2.b.SUCCESS, null, null, null, 14, null);
            }
        }
        cVar2 = new c(bVar);
        Object obj2 = cVar2.result;
        W5.a aVar2 = W5.a.f2787d;
        i2 = cVar2.label;
        if (i2 != 0) {
        }
        nVar._subscriptionModelStore.remove(cVar.getSubscriptionId(), "HYDRATE");
        return new F2.a(F2.b.SUCCESS, null, null, null, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object transferSubscription(U3.p pVar, V5.b bVar) {
        d dVar;
        int i2;
        try {
            if (bVar instanceof d) {
                dVar = (d) bVar;
                int i5 = dVar.label;
                if ((i5 & Integer.MIN_VALUE) != 0) {
                    dVar.label = i5 - Integer.MIN_VALUE;
                    d dVar2 = dVar;
                    Object obj = dVar2.result;
                    W5.a aVar = W5.a.f2787d;
                    i2 = dVar2.label;
                    if (i2 != 0) {
                        V6.b.P(obj);
                        f resolveBackendParams = com.onesignal.user.internal.operations.impl.executors.c.resolveBackendParams(pVar, pVar.getOnesignalId(), this._jwtTokenStore, this._identityVerificationService);
                        P3.c cVar = this._subscriptionBackend;
                        String appId = pVar.getAppId();
                        String subscriptionId = pVar.getSubscriptionId();
                        String aliasLabel = resolveBackendParams.getAliasLabel();
                        String aliasValue = resolveBackendParams.getAliasValue();
                        String jwt = resolveBackendParams.getJwt();
                        dVar2.label = 1;
                        if (cVar.transferSubscription(appId, subscriptionId, aliasLabel, aliasValue, jwt, dVar2) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        V6.b.P(obj);
                    }
                    return new F2.a(F2.b.SUCCESS, null, null, null, 14, null);
                }
            }
            if (i2 != 0) {
            }
            return new F2.a(F2.b.SUCCESS, null, null, null, 14, null);
        } catch (C0846a e7) {
            int i7 = o.$EnumSwitchMapping$0[com.onesignal.common.g.INSTANCE.getResponseStatusType(e7.getStatusCode()).ordinal()];
            return i7 != 1 ? i7 != 4 ? new F2.a(F2.b.FAIL_NORETRY, null, null, null, 14, null) : new F2.a(F2.b.FAIL_UNAUTHORIZED, null, null, e7.getRetryAfterSeconds(), 6, null) : new F2.a(F2.b.FAIL_RETRY, null, null, e7.getRetryAfterSeconds(), 6, null);
        }
        dVar = new d(bVar);
        d dVar22 = dVar;
        Object obj2 = dVar22.result;
        W5.a aVar2 = W5.a.f2787d;
        i2 = dVar22.label;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object updateExistingSubscriptionFromCreate(U3.a aVar, List<? extends F2.g> list, V5.b bVar) {
        F2.g gVar;
        String address;
        Y3.f status;
        if (list == null || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((F2.g) it.next()) instanceof U3.c) {
                    return new F2.a(F2.b.SUCCESS, null, null, null, 14, null);
                }
            }
        }
        ListIterator<? extends F2.g> listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                gVar = null;
                break;
            }
            gVar = listIterator.previous();
            if (gVar instanceof U3.q) {
                break;
            }
        }
        U3.q qVar = (U3.q) gVar;
        String appId = aVar.getAppId();
        String onesignalId = aVar.getOnesignalId();
        String externalId = aVar.getExternalId();
        String subscriptionId = aVar.getSubscriptionId();
        Y3.g type = aVar.getType();
        boolean enabled = qVar != null ? qVar.getEnabled() : aVar.getEnabled();
        if (qVar == null || (address = qVar.getAddress()) == null) {
            address = aVar.getAddress();
        }
        String str = address;
        if (qVar == null || (status = qVar.getStatus()) == null) {
            status = aVar.getStatus();
        }
        U3.q qVar2 = new U3.q(appId, onesignalId, externalId, subscriptionId, type, enabled, str, status);
        return updateSubscription(qVar2, kotlin.collections.q.b(qVar2), bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(3:(5:(1:(1:12)(2:56|57))(1:58)|13|14|15|16)(4:59|60|61|62)|20|(2:22|(2:24|(2:26|27)(8:28|(3:34|(3:37|(3:39|40|41)(1:42)|35)|43)|44|(1:46)|47|(1:49)|50|51))(2:52|53))(2:54|55))(5:78|79|80|(1:82)|69)|63|64|(4:66|(2:68|69)|15|16)(1:70)))|86|6|7|(0)(0)|63|64|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x012c, code lost:
    
        if (r0.resolveConditionsWithID(o2.C0799a.ID, r8) == r2) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0118, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0119, code lost:
    
        r3 = r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0101 A[Catch: a -> 0x0118, TryCatch #2 {a -> 0x0118, blocks: (B:64:0x00fc, B:66:0x0101, B:70:0x011c), top: B:63:0x00fc }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x011c A[Catch: a -> 0x0118, TRY_LEAVE, TryCatch #2 {a -> 0x0118, blocks: (B:64:0x00fc, B:66:0x0101, B:70:0x011c), top: B:63:0x00fc }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object updateSubscription(U3.q qVar, List<? extends F2.g> list, V5.b bVar) {
        e eVar;
        int i2;
        U3.q qVar2;
        n nVar;
        U3.q qVar3;
        Object updateSubscription;
        n nVar2;
        U3.q qVar4;
        C0800b c0800b;
        int i5;
        List d7;
        if (bVar instanceof e) {
            eVar = (e) bVar;
            int i7 = eVar.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                eVar.label = i7 - Integer.MIN_VALUE;
                e eVar2 = eVar;
                Object obj = eVar2.result;
                W5.a aVar = W5.a.f2787d;
                i2 = eVar2.label;
                if (i2 == 0) {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            qVar4 = (U3.q) eVar2.L$1;
                            nVar = (n) eVar2.L$0;
                        } else {
                            if (i2 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            qVar4 = (U3.q) eVar2.L$1;
                            nVar = (n) eVar2.L$0;
                        }
                        try {
                            V6.b.P(obj);
                            return new F2.a(F2.b.SUCCESS, null, null, null, 14, null);
                        } catch (C0846a e7) {
                            e = e7;
                        }
                    } else {
                        U3.q qVar5 = (U3.q) eVar2.L$2;
                        U3.q qVar6 = (U3.q) eVar2.L$1;
                        nVar2 = (n) eVar2.L$0;
                        try {
                            V6.b.P(obj);
                            qVar2 = qVar5;
                            updateSubscription = obj;
                            qVar3 = qVar6;
                        } catch (C0846a e8) {
                            e = e8;
                            qVar4 = qVar5;
                            nVar = nVar2;
                        }
                    }
                    i5 = o.$EnumSwitchMapping$0[com.onesignal.common.g.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                    if (i5 == 1) {
                        return new F2.a(F2.b.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                    }
                    if (i5 == 4) {
                        return new F2.a(F2.b.FAIL_UNAUTHORIZED, null, null, e.getRetryAfterSeconds(), 6, null);
                    }
                    if (i5 != 5) {
                        return new F2.a(F2.b.FAIL_NORETRY, null, null, null, 14, null);
                    }
                    if (e.getStatusCode() == 404 && ((d7 = r.d(qVar4.getOnesignalId(), qVar4.getSubscriptionId())) == null || !d7.isEmpty())) {
                        Iterator it = d7.iterator();
                        while (it.hasNext()) {
                            if (nVar._newRecordState.isInMissingRetryWindow((String) it.next())) {
                                return new F2.a(F2.b.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                            }
                        }
                    }
                    String createLocalId = com.onesignal.common.d.INSTANCE.createLocalId();
                    String subscriptionId = qVar4.getSubscriptionId();
                    Y3.d dVar = (Y3.d) nVar._subscriptionModelStore.get(subscriptionId);
                    if (dVar != null) {
                        com.onesignal.common.modeling.i.setStringProperty$default(dVar, "id", createLocalId, "HYDRATE", false, 8, null);
                    }
                    if (Intrinsics.a(((com.onesignal.core.internal.config.b) nVar._configModelStore.getModel()).getPushSubscriptionId(), subscriptionId)) {
                        ((com.onesignal.core.internal.config.b) nVar._configModelStore.getModel()).setPushSubscriptionId(createLocalId);
                    }
                    return new F2.a(F2.b.FAIL_NORETRY, null, kotlin.collections.q.b(new U3.a(qVar4.getAppId(), qVar4.getOnesignalId(), qVar4.getExternalId(), createLocalId, qVar4.getType(), qVar4.getEnabled(), qVar4.getAddress(), qVar4.getStatus())), null, 10, null);
                }
                V6.b.P(obj);
                Object t6 = CollectionsKt.t(list);
                Intrinsics.c(t6, "null cannot be cast to non-null type com.onesignal.user.internal.operations.UpdateSubscriptionOperation");
                qVar2 = (U3.q) t6;
                try {
                    P3.j convert = convert(qVar2.getType());
                    String address = qVar2.getAddress();
                    Boolean valueOf = Boolean.valueOf(qVar2.getEnabled());
                    Integer num = new Integer(qVar2.getStatus().getValue());
                    String sdkVersion = com.onesignal.common.h.INSTANCE.getSdkVersion();
                    String str = Build.MODEL;
                    String str2 = Build.VERSION.RELEASE;
                    Boolean valueOf2 = Boolean.valueOf(com.onesignal.common.k.INSTANCE.isRooted());
                    com.onesignal.common.c cVar = com.onesignal.common.c.INSTANCE;
                    P3.h hVar = new P3.h(null, convert, address, valueOf, num, sdkVersion, str, str2, valueOf2, cVar.getNetType(this._applicationService.getAppContext()), cVar.getCarrierName(this._applicationService.getAppContext()), AndroidUtils.INSTANCE.getAppVersion(this._applicationService.getAppContext()));
                    String resolveJwt = com.onesignal.user.internal.operations.impl.executors.c.resolveJwt(qVar2, this._jwtTokenStore, this._identityVerificationService);
                    P3.c cVar2 = this._subscriptionBackend;
                    String appId = qVar2.getAppId();
                    String subscriptionId2 = qVar2.getSubscriptionId();
                    eVar2.L$0 = this;
                    qVar3 = qVar;
                    eVar2.L$1 = qVar3;
                    eVar2.L$2 = qVar2;
                    eVar2.label = 1;
                    updateSubscription = cVar2.updateSubscription(appId, subscriptionId2, hVar, resolveJwt, eVar2);
                    if (updateSubscription != aVar) {
                        nVar2 = this;
                    }
                    return aVar;
                } catch (C0846a e9) {
                    e = e9;
                    nVar = this;
                    qVar4 = qVar2;
                    i5 = o.$EnumSwitchMapping$0[com.onesignal.common.g.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                    if (i5 == 1) {
                    }
                }
                c0800b = (C0800b) updateSubscription;
                if (c0800b == null) {
                    q2.c cVar3 = nVar2._consistencyManager;
                    String onesignalId = qVar3.getOnesignalId();
                    EnumC0826a enumC0826a = EnumC0826a.SUBSCRIPTION;
                    eVar2.L$0 = nVar2;
                    eVar2.L$1 = qVar2;
                    eVar2.L$2 = null;
                    eVar2.label = 2;
                    if (cVar3.setRywData(onesignalId, enumC0826a, c0800b, eVar2) == aVar) {
                        return aVar;
                    }
                    return new F2.a(F2.b.SUCCESS, null, null, null, 14, null);
                }
                q2.c cVar4 = nVar2._consistencyManager;
                eVar2.L$0 = nVar2;
                eVar2.L$1 = qVar2;
                eVar2.L$2 = null;
                eVar2.label = 3;
            }
        }
        eVar = new e(bVar);
        e eVar22 = eVar;
        Object obj2 = eVar22.result;
        W5.a aVar2 = W5.a.f2787d;
        i2 = eVar22.label;
        if (i2 == 0) {
        }
        c0800b = (C0800b) updateSubscription;
        if (c0800b == null) {
        }
    }

    @Override // F2.d
    public Object execute(List<? extends F2.g> list, V5.b bVar) {
        com.onesignal.debug.internal.logging.b.log(K2.c.DEBUG, "SubscriptionOperationExecutor(operations: " + list + ')');
        F2.g gVar = (F2.g) CollectionsKt.o(list);
        if (gVar instanceof U3.a) {
            U3.a aVar = (U3.a) gVar;
            return !com.onesignal.common.d.INSTANCE.isLocalId(aVar.getSubscriptionId()) ? updateExistingSubscriptionFromCreate(aVar, list, bVar) : createSubscription(aVar, list, bVar);
        }
        if (!list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((F2.g) it.next()) instanceof U3.c) {
                    if (list.size() > 1) {
                        throw new Exception("Only supports one operation! Attempted operations:\n" + list);
                    }
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list) {
                        if (obj instanceof U3.c) {
                            arrayList.add(obj);
                        }
                    }
                    return deleteSubscription((U3.c) CollectionsKt.o(arrayList), bVar);
                }
            }
        }
        if (gVar instanceof U3.q) {
            return updateSubscription((U3.q) gVar, list, bVar);
        }
        if (!(gVar instanceof U3.p)) {
            throw new Exception("Unrecognized operation: " + gVar);
        }
        if (list.size() <= 1) {
            return transferSubscription((U3.p) gVar, bVar);
        }
        throw new Exception("TransferSubscriptionOperation only supports one operation! Attempted operations:\n" + list);
    }

    @Override // F2.d
    public List<String> getOperations() {
        return r.d(CREATE_SUBSCRIPTION, UPDATE_SUBSCRIPTION, DELETE_SUBSCRIPTION, TRANSFER_SUBSCRIPTION);
    }
}
