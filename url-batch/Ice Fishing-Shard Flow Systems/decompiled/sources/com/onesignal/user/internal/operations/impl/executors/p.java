package com.onesignal.user.internal.operations.impl.executors;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.r;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o2.C0800b;
import p2.EnumC0826a;
import r2.C0846a;

/* loaded from: classes.dex */
public final class p implements F2.d {
    public static final a Companion = new a(null);
    public static final String DELETE_TAG = "delete-tag";
    public static final String SET_PROPERTY = "set-property";
    public static final String SET_TAG = "set-tag";
    public static final String TRACK_PURCHASE = "track-purchase";
    public static final String TRACK_SESSION_END = "track-session-end";
    public static final String TRACK_SESSION_START = "track-session-start";
    private final Q3.a _buildUserService;
    private final q2.c _consistencyManager;
    private final T3.b _identityModelStore;
    private final com.onesignal.core.internal.config.impl.c _identityVerificationService;
    private final com.onesignal.user.internal.jwt.c _jwtTokenStore;
    private final W3.a _newRecordState;
    private final com.onesignal.user.internal.properties.b _propertiesModelStore;
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
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public b(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return p.this.execute(null, this);
        }
    }

    public p(P3.d _userBackend, T3.b _identityModelStore, com.onesignal.user.internal.properties.b _propertiesModelStore, Q3.a _buildUserService, W3.a _newRecordState, q2.c _consistencyManager, com.onesignal.user.internal.jwt.c _jwtTokenStore, com.onesignal.core.internal.config.impl.c _identityVerificationService) {
        Intrinsics.checkNotNullParameter(_userBackend, "_userBackend");
        Intrinsics.checkNotNullParameter(_identityModelStore, "_identityModelStore");
        Intrinsics.checkNotNullParameter(_propertiesModelStore, "_propertiesModelStore");
        Intrinsics.checkNotNullParameter(_buildUserService, "_buildUserService");
        Intrinsics.checkNotNullParameter(_newRecordState, "_newRecordState");
        Intrinsics.checkNotNullParameter(_consistencyManager, "_consistencyManager");
        Intrinsics.checkNotNullParameter(_jwtTokenStore, "_jwtTokenStore");
        Intrinsics.checkNotNullParameter(_identityVerificationService, "_identityVerificationService");
        this._userBackend = _userBackend;
        this._identityModelStore = _identityModelStore;
        this._propertiesModelStore = _propertiesModelStore;
        this._buildUserService = _buildUserService;
        this._newRecordState = _newRecordState;
        this._consistencyManager = _consistencyManager;
        this._jwtTokenStore = _jwtTokenStore;
        this._identityVerificationService = _identityVerificationService;
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x02c9, code lost:
    
        if (r2.resolveConditionsWithID(o2.C0799a.ID, r12) == r3) goto L99;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x02de A[Catch: a -> 0x0048, TryCatch #2 {a -> 0x0048, blocks: (B:14:0x0043, B:15:0x02cc, B:17:0x02de, B:18:0x02e2, B:20:0x02e8, B:37:0x02f2, B:23:0x0315, B:34:0x0319, B:26:0x0336, B:29:0x033a), top: B:13:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x029c A[Catch: a -> 0x007d, TryCatch #0 {a -> 0x007d, blocks: (B:74:0x0078, B:75:0x0298, B:77:0x029c, B:82:0x02b6), top: B:73:0x0078 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02b6 A[Catch: a -> 0x007d, TRY_LEAVE, TryCatch #0 {a -> 0x007d, blocks: (B:74:0x0078, B:75:0x0298, B:77:0x029c, B:82:0x02b6), top: B:73:0x0078 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    @Override // F2.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object execute(List<? extends F2.g> list, V5.b bVar) {
        b bVar2;
        int i2;
        String str;
        String str2;
        String str3;
        String str4;
        p pVar;
        P3.d dVar;
        String aliasLabel;
        String aliasValue;
        String jwt;
        String str5;
        p pVar2;
        int i5;
        long sessionTime;
        BigDecimal amountSpent;
        ArrayList arrayList;
        C0800b c0800b;
        int i7;
        List<? extends F2.g> list2 = list;
        if (bVar instanceof b) {
            bVar2 = (b) bVar;
            int i8 = bVar2.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                bVar2.label = i8 - Integer.MIN_VALUE;
                b bVar3 = bVar2;
                Object obj = bVar3.result;
                Object obj2 = W5.a.f2787d;
                i2 = bVar3.label;
                int i9 = 1;
                if (i2 != 0) {
                    V6.b.P(obj);
                    com.onesignal.debug.internal.logging.b.log(K2.c.DEBUG, "UpdateUserOperationExecutor(operation: " + list2 + ')');
                    P3.f fVar = new P3.f(null, null, null, null, null, null, 63, null);
                    str = null;
                    P3.e eVar = new P3.e(null, null, null, null, 15, null);
                    Iterator<? extends F2.g> it = list2.iterator();
                    P3.e eVar2 = eVar;
                    String str6 = null;
                    boolean z7 = 0;
                    P3.f fVar2 = fVar;
                    while (it.hasNext()) {
                        F2.g next = it.next();
                        if (next instanceof U3.k) {
                            if (str == null) {
                                U3.k kVar = (U3.k) next;
                                str = kVar.getAppId();
                                str6 = kVar.getOnesignalId();
                            }
                            fVar2 = k.INSTANCE.createPropertiesFromOperation((U3.k) next, fVar2);
                        } else if (next instanceof U3.d) {
                            if (str == null) {
                                U3.d dVar2 = (U3.d) next;
                                str = dVar2.getAppId();
                                str6 = dVar2.getOnesignalId();
                            }
                            fVar2 = k.INSTANCE.createPropertiesFromOperation((U3.d) next, fVar2);
                        } else if (next instanceof U3.j) {
                            if (str == null) {
                                U3.j jVar = (U3.j) next;
                                str = jVar.getAppId();
                                str6 = jVar.getOnesignalId();
                            }
                            fVar2 = k.INSTANCE.createPropertiesFromOperation((U3.j) next, fVar2);
                        } else if (next instanceof U3.o) {
                            if (str == null) {
                                U3.o oVar = (U3.o) next;
                                str = oVar.getAppId();
                                str6 = oVar.getOnesignalId();
                            }
                            if (eVar2.getSessionCount() != null) {
                                Integer sessionCount = eVar2.getSessionCount();
                                Intrinsics.b(sessionCount);
                                i5 = sessionCount.intValue() + i9;
                            } else {
                                i5 = i9;
                            }
                            eVar2 = new P3.e(eVar2.getSessionTime(), new Integer(i5), eVar2.getAmountSpent(), eVar2.getPurchases());
                            z7 = i9;
                        } else if (next instanceof U3.n) {
                            if (str == null) {
                                U3.n nVar = (U3.n) next;
                                str = nVar.getAppId();
                                str6 = nVar.getOnesignalId();
                            }
                            if (eVar2.getSessionTime() != null) {
                                Long sessionTime2 = eVar2.getSessionTime();
                                Intrinsics.b(sessionTime2);
                                sessionTime = ((U3.n) next).getSessionTime() + sessionTime2.longValue();
                            } else {
                                sessionTime = ((U3.n) next).getSessionTime();
                            }
                            eVar2 = new P3.e(new Long(sessionTime), eVar2.getSessionCount(), eVar2.getAmountSpent(), eVar2.getPurchases());
                        } else {
                            if (!(next instanceof U3.m)) {
                                throw new Exception("Unrecognized operation: " + next);
                            }
                            if (str == null) {
                                U3.m mVar = (U3.m) next;
                                str = mVar.getAppId();
                                str6 = mVar.getOnesignalId();
                            }
                            if (eVar2.getAmountSpent() != null) {
                                BigDecimal amountSpent2 = eVar2.getAmountSpent();
                                Intrinsics.b(amountSpent2);
                                amountSpent = amountSpent2.add(((U3.m) next).getAmountSpent());
                                Intrinsics.checkNotNullExpressionValue(amountSpent, "add(...)");
                            } else {
                                amountSpent = ((U3.m) next).getAmountSpent();
                            }
                            if (eVar2.getPurchases() != null) {
                                List<P3.g> purchases = eVar2.getPurchases();
                                Intrinsics.b(purchases);
                                arrayList = CollectionsKt.A(purchases);
                            } else {
                                arrayList = new ArrayList();
                            }
                            for (U3.g gVar : ((U3.m) next).getPurchases()) {
                                arrayList.add(new P3.g(gVar.getSku(), gVar.getIso(), gVar.getAmount()));
                                it = it;
                            }
                            eVar2 = new P3.e(eVar2.getSessionTime(), eVar2.getSessionCount(), amountSpent, arrayList);
                            it = it;
                            i9 = 1;
                        }
                    }
                    if (str != null && str6 != null) {
                        f resolveBackendParams = c.resolveBackendParams((F2.g) CollectionsKt.o(list2), str6, this._jwtTokenStore, this._identityVerificationService);
                        try {
                            dVar = this._userBackend;
                            aliasLabel = resolveBackendParams.getAliasLabel();
                            aliasValue = resolveBackendParams.getAliasValue();
                            jwt = resolveBackendParams.getJwt();
                            bVar3.L$0 = this;
                            bVar3.L$1 = list2;
                            bVar3.L$2 = str;
                            bVar3.L$3 = str6;
                            bVar3.label = 1;
                            str2 = str6;
                        } catch (C0846a e7) {
                            e = e7;
                            str2 = str6;
                        }
                        try {
                            Object updateUser = dVar.updateUser(str, aliasLabel, aliasValue, fVar2, z7, eVar2, jwt, bVar3);
                            if (updateUser != obj2) {
                                str5 = str2;
                                obj = updateUser;
                                pVar2 = this;
                            }
                            return obj2;
                        } catch (C0846a e8) {
                            e = e8;
                            str3 = str2;
                            str4 = str;
                            pVar = this;
                            i7 = q.$EnumSwitchMapping$0[com.onesignal.common.g.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                            if (i7 == 1) {
                            }
                        }
                    }
                    return new F2.a(F2.b.SUCCESS, null, null, null, 14, null);
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        str3 = (String) bVar3.L$3;
                        str4 = (String) bVar3.L$2;
                        list2 = (List) bVar3.L$1;
                        pVar = (p) bVar3.L$0;
                    } else {
                        if (i2 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        str3 = (String) bVar3.L$3;
                        str4 = (String) bVar3.L$2;
                        list2 = (List) bVar3.L$1;
                        pVar = (p) bVar3.L$0;
                    }
                    try {
                        V6.b.P(obj);
                        if (Intrinsics.a(((T3.a) pVar._identityModelStore.getModel()).getOnesignalId(), str3)) {
                            for (F2.g gVar2 : list2) {
                                if (gVar2 instanceof U3.k) {
                                    com.onesignal.common.modeling.i.setStringProperty$default(((com.onesignal.user.internal.properties.a) pVar._propertiesModelStore.getModel()).getTags(), ((U3.k) gVar2).getKey(), ((U3.k) gVar2).getValue(), "HYDRATE", false, 8, null);
                                } else if (gVar2 instanceof U3.d) {
                                    com.onesignal.common.modeling.i.setOptStringProperty$default(((com.onesignal.user.internal.properties.a) pVar._propertiesModelStore.getModel()).getTags(), ((U3.d) gVar2).getKey(), null, "HYDRATE", false, 8, null);
                                } else if (gVar2 instanceof U3.j) {
                                    com.onesignal.common.modeling.i.setOptAnyProperty$default(pVar._propertiesModelStore.getModel(), ((U3.j) gVar2).getProperty(), ((U3.j) gVar2).getValue(), "HYDRATE", false, 8, null);
                                }
                            }
                        }
                        return new F2.a(F2.b.SUCCESS, null, null, null, 14, null);
                    } catch (C0846a e9) {
                        e = e9;
                        i7 = q.$EnumSwitchMapping$0[com.onesignal.common.g.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                        if (i7 == 1) {
                        }
                    }
                } else {
                    str5 = (String) bVar3.L$3;
                    str = (String) bVar3.L$2;
                    list2 = (List) bVar3.L$1;
                    pVar2 = (p) bVar3.L$0;
                    try {
                        V6.b.P(obj);
                    } catch (C0846a e10) {
                        e = e10;
                        str3 = str5;
                        str4 = str;
                        pVar = pVar2;
                        i7 = q.$EnumSwitchMapping$0[com.onesignal.common.g.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                        if (i7 == 1) {
                            return new F2.a(F2.b.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                        }
                        if (i7 == 2) {
                            return new F2.a(F2.b.FAIL_UNAUTHORIZED, null, null, e.getRetryAfterSeconds(), 6, null);
                        }
                        if (i7 != 3) {
                            return new F2.a(F2.b.FAIL_NORETRY, null, null, null, 14, null);
                        }
                        if (e.getStatusCode() == 404 && pVar._newRecordState.isInMissingRetryWindow(str3)) {
                            return new F2.a(F2.b.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                        }
                        List<F2.g> rebuildOperationsIfCurrentUser = pVar._buildUserService.getRebuildOperationsIfCurrentUser(str4, str3);
                        return rebuildOperationsIfCurrentUser == null ? new F2.a(F2.b.FAIL_NORETRY, null, null, null, 14, null) : new F2.a(F2.b.FAIL_RETRY, null, rebuildOperationsIfCurrentUser, e.getRetryAfterSeconds(), 2, null);
                    }
                }
                c0800b = (C0800b) obj;
                if (c0800b == null) {
                    q2.c cVar = pVar2._consistencyManager;
                    EnumC0826a enumC0826a = EnumC0826a.USER;
                    bVar3.L$0 = pVar2;
                    bVar3.L$1 = list2;
                    bVar3.L$2 = str;
                    bVar3.L$3 = str5;
                    bVar3.label = 2;
                    if (cVar.setRywData(str5, enumC0826a, c0800b, bVar3) == obj2) {
                        return obj2;
                    }
                    str3 = str5;
                    str4 = str;
                    pVar = pVar2;
                } else {
                    q2.c cVar2 = pVar2._consistencyManager;
                    bVar3.L$0 = pVar2;
                    bVar3.L$1 = list2;
                    bVar3.L$2 = str;
                    bVar3.L$3 = str5;
                    bVar3.label = 3;
                }
                if (Intrinsics.a(((T3.a) pVar._identityModelStore.getModel()).getOnesignalId(), str3)) {
                }
                return new F2.a(F2.b.SUCCESS, null, null, null, 14, null);
            }
        }
        bVar2 = new b(bVar);
        b bVar32 = bVar2;
        Object obj3 = bVar32.result;
        Object obj22 = W5.a.f2787d;
        i2 = bVar32.label;
        int i92 = 1;
        if (i2 != 0) {
        }
        c0800b = (C0800b) obj3;
        if (c0800b == null) {
        }
        if (Intrinsics.a(((T3.a) pVar._identityModelStore.getModel()).getOnesignalId(), str3)) {
        }
        return new F2.a(F2.b.SUCCESS, null, null, null, 14, null);
    }

    @Override // F2.d
    public List<String> getOperations() {
        return r.d(SET_TAG, DELETE_TAG, SET_PROPERTY, TRACK_SESSION_START, TRACK_SESSION_END, TRACK_PURCHASE);
    }
}
