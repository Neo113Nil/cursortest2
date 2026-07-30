package com.onesignal.user.internal.operations.impl.executors;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.H;
import kotlin.collections.r;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import r2.C0846a;

/* loaded from: classes.dex */
public final class d implements F2.d {
    public static final a Companion = new a(null);
    public static final String DELETE_ALIAS = "delete-alias";
    public static final String SET_ALIAS = "set-alias";
    private final Q3.a _buildUserService;
    private final P3.b _identityBackend;
    private final T3.b _identityModelStore;
    private final com.onesignal.core.internal.config.impl.c _identityVerificationService;
    private final com.onesignal.user.internal.jwt.c _jwtTokenStore;
    private final W3.a _newRecordState;

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
            return d.this.execute(null, this);
        }
    }

    public d(P3.b _identityBackend, T3.b _identityModelStore, Q3.a _buildUserService, W3.a _newRecordState, com.onesignal.user.internal.jwt.c _jwtTokenStore, com.onesignal.core.internal.config.impl.c _identityVerificationService) {
        Intrinsics.checkNotNullParameter(_identityBackend, "_identityBackend");
        Intrinsics.checkNotNullParameter(_identityModelStore, "_identityModelStore");
        Intrinsics.checkNotNullParameter(_buildUserService, "_buildUserService");
        Intrinsics.checkNotNullParameter(_newRecordState, "_newRecordState");
        Intrinsics.checkNotNullParameter(_jwtTokenStore, "_jwtTokenStore");
        Intrinsics.checkNotNullParameter(_identityVerificationService, "_identityVerificationService");
        this._identityBackend = _identityBackend;
        this._identityModelStore = _identityModelStore;
        this._buildUserService = _buildUserService;
        this._newRecordState = _newRecordState;
        this._jwtTokenStore = _jwtTokenStore;
        this._identityVerificationService = _identityVerificationService;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x02ac A[Catch: a -> 0x02c8, TRY_LEAVE, TryCatch #7 {a -> 0x02c8, blocks: (B:16:0x0293, B:18:0x02ac), top: B:15:0x0293 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0168 A[Catch: a -> 0x0189, TRY_LEAVE, TryCatch #3 {a -> 0x0189, blocks: (B:58:0x014f, B:60:0x0168), top: B:57:0x014f }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    @Override // F2.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object execute(List<? extends F2.g> list, V5.b bVar) {
        b bVar2;
        int i2;
        int i5;
        d dVar;
        F2.g gVar;
        int i7;
        d dVar2;
        F2.g gVar2;
        Map<String, String> b7;
        String jwt;
        int i8;
        int i9;
        if (bVar instanceof b) {
            bVar2 = (b) bVar;
            int i10 = bVar2.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar2.label = i10 - Integer.MIN_VALUE;
                b bVar3 = bVar2;
                Object obj = bVar3.result;
                W5.a aVar = W5.a.f2787d;
                i2 = bVar3.label;
                if (i2 != 0) {
                    V6.b.P(obj);
                    com.onesignal.debug.internal.logging.b.debug$default("IdentityOperationExecutor(operations: " + list + ')', null, 2, null);
                    if (list == null || !list.isEmpty()) {
                        for (F2.g gVar3 : list) {
                            if (!(gVar3 instanceof U3.i) && !(gVar3 instanceof U3.b)) {
                                throw new Exception("Unrecognized operation(s)! Attempted operations:\n" + list);
                            }
                        }
                    }
                    if (list == null || !list.isEmpty()) {
                        Iterator<T> it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            if (((F2.g) it.next()) instanceof U3.i) {
                                if (list == null || !list.isEmpty()) {
                                    Iterator<T> it2 = list.iterator();
                                    while (it2.hasNext()) {
                                        if (((F2.g) it2.next()) instanceof U3.b) {
                                            throw new Exception("Can't process SetAliasOperation and DeleteAliasOperation at the same time.");
                                        }
                                    }
                                }
                            }
                        }
                    }
                    F2.g gVar4 = (F2.g) CollectionsKt.t(list);
                    if (gVar4 instanceof U3.i) {
                        f resolveBackendParams = c.resolveBackendParams(gVar4, ((U3.i) gVar4).getOnesignalId(), this._jwtTokenStore, this._identityVerificationService);
                        try {
                            P3.b bVar4 = this._identityBackend;
                            String appId = ((U3.i) gVar4).getAppId();
                            try {
                                String aliasLabel = resolveBackendParams.getAliasLabel();
                                try {
                                    String aliasValue = resolveBackendParams.getAliasValue();
                                    try {
                                        b7 = H.b(new Pair(((U3.i) gVar4).getLabel(), ((U3.i) gVar4).getValue()));
                                        jwt = resolveBackendParams.getJwt();
                                        bVar3.L$0 = this;
                                        bVar3.L$1 = gVar4;
                                        bVar3.label = 1;
                                        i7 = 2;
                                    } catch (C0846a e7) {
                                        e = e7;
                                        i7 = 2;
                                    }
                                    try {
                                        if (bVar4.setAlias(appId, aliasLabel, aliasValue, b7, jwt, bVar3) != aVar) {
                                            dVar2 = this;
                                            gVar2 = gVar4;
                                            if (Intrinsics.a(((T3.a) dVar2._identityModelStore.getModel()).getOnesignalId(), ((U3.i) gVar2).getOnesignalId())) {
                                            }
                                        }
                                    } catch (C0846a e8) {
                                        e = e8;
                                        dVar2 = this;
                                        gVar2 = gVar4;
                                        i8 = e.$EnumSwitchMapping$0[com.onesignal.common.g.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                                        if (i8 == 1) {
                                        }
                                    }
                                } catch (C0846a e9) {
                                    e = e9;
                                    i7 = 2;
                                }
                            } catch (C0846a e10) {
                                e = e10;
                                i7 = 2;
                            }
                        } catch (C0846a e11) {
                            e = e11;
                            i7 = 2;
                        }
                    } else {
                        i5 = 2;
                        if (gVar4 instanceof U3.b) {
                            f resolveBackendParams2 = c.resolveBackendParams(gVar4, ((U3.b) gVar4).getOnesignalId(), this._jwtTokenStore, this._identityVerificationService);
                            try {
                                P3.b bVar5 = this._identityBackend;
                                String appId2 = ((U3.b) gVar4).getAppId();
                                String aliasLabel2 = resolveBackendParams2.getAliasLabel();
                                String aliasValue2 = resolveBackendParams2.getAliasValue();
                                String label = ((U3.b) gVar4).getLabel();
                                String jwt2 = resolveBackendParams2.getJwt();
                                bVar3.L$0 = this;
                                bVar3.L$1 = gVar4;
                                bVar3.label = 2;
                                if (bVar5.deleteAlias(appId2, aliasLabel2, aliasValue2, label, jwt2, bVar3) != aVar) {
                                    dVar = this;
                                    gVar = gVar4;
                                    if (Intrinsics.a(((T3.a) dVar._identityModelStore.getModel()).getOnesignalId(), ((U3.b) gVar).getOnesignalId())) {
                                    }
                                }
                            } catch (C0846a e12) {
                                e = e12;
                                dVar = this;
                                gVar = gVar4;
                                i9 = e.$EnumSwitchMapping$0[com.onesignal.common.g.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                                if (i9 == 1) {
                                    return new F2.a(F2.b.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                                }
                                if (i9 == i5) {
                                    return new F2.a(F2.b.FAIL_NORETRY, null, null, null, 14, null);
                                }
                                if (i9 == 3) {
                                    return new F2.a(F2.b.SUCCESS, null, null, null, 14, null);
                                }
                                if (i9 == 4) {
                                    return new F2.a(F2.b.FAIL_UNAUTHORIZED, null, null, e.getRetryAfterSeconds(), 6, null);
                                }
                                if (i9 == 5) {
                                    return (e.getStatusCode() == 404 && dVar._newRecordState.isInMissingRetryWindow(((U3.b) gVar).getOnesignalId())) ? new F2.a(F2.b.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null) : new F2.a(F2.b.SUCCESS, null, null, null, 14, null);
                                }
                                throw new R5.k();
                            }
                        }
                    }
                    return aVar;
                }
                if (i2 == 1) {
                    gVar2 = (F2.g) bVar3.L$1;
                    dVar2 = (d) bVar3.L$0;
                    try {
                        V6.b.P(obj);
                        i7 = 2;
                    } catch (C0846a e13) {
                        e = e13;
                        i7 = 2;
                        i8 = e.$EnumSwitchMapping$0[com.onesignal.common.g.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                        if (i8 == 1) {
                            return new F2.a(F2.b.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                        }
                        if (i8 == i7) {
                            return new F2.a(F2.b.FAIL_NORETRY, null, null, null, 14, null);
                        }
                        if (i8 == 3) {
                            return new F2.a(F2.b.FAIL_CONFLICT, null, null, e.getRetryAfterSeconds(), 6, null);
                        }
                        if (i8 == 4) {
                            return new F2.a(F2.b.FAIL_UNAUTHORIZED, null, null, e.getRetryAfterSeconds(), 6, null);
                        }
                        if (i8 != 5) {
                            throw new R5.k();
                        }
                        if (e.getStatusCode() == 404 && dVar2._newRecordState.isInMissingRetryWindow(((U3.i) gVar2).getOnesignalId())) {
                            return new F2.a(F2.b.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                        }
                        U3.i iVar = (U3.i) gVar2;
                        List<F2.g> rebuildOperationsIfCurrentUser = dVar2._buildUserService.getRebuildOperationsIfCurrentUser(iVar.getAppId(), iVar.getOnesignalId());
                        return rebuildOperationsIfCurrentUser == null ? new F2.a(F2.b.FAIL_NORETRY, null, null, null, 14, null) : new F2.a(F2.b.FAIL_RETRY, null, rebuildOperationsIfCurrentUser, e.getRetryAfterSeconds(), 2, null);
                    }
                    try {
                        if (Intrinsics.a(((T3.a) dVar2._identityModelStore.getModel()).getOnesignalId(), ((U3.i) gVar2).getOnesignalId())) {
                            com.onesignal.common.modeling.i.setStringProperty$default(dVar2._identityModelStore.getModel(), ((U3.i) gVar2).getLabel(), ((U3.i) gVar2).getValue(), "HYDRATE", false, 8, null);
                        }
                    } catch (C0846a e14) {
                        e = e14;
                        i8 = e.$EnumSwitchMapping$0[com.onesignal.common.g.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                        if (i8 == 1) {
                        }
                    }
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gVar = (F2.g) bVar3.L$1;
                    dVar = (d) bVar3.L$0;
                    try {
                        V6.b.P(obj);
                        i5 = 2;
                        try {
                            if (Intrinsics.a(((T3.a) dVar._identityModelStore.getModel()).getOnesignalId(), ((U3.b) gVar).getOnesignalId())) {
                                com.onesignal.common.modeling.i.setOptStringProperty$default(dVar._identityModelStore.getModel(), ((U3.b) gVar).getLabel(), null, "HYDRATE", false, 8, null);
                            }
                        } catch (C0846a e15) {
                            e = e15;
                            i9 = e.$EnumSwitchMapping$0[com.onesignal.common.g.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                            if (i9 == 1) {
                            }
                        }
                    } catch (C0846a e16) {
                        e = e16;
                        i5 = 2;
                        i9 = e.$EnumSwitchMapping$0[com.onesignal.common.g.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                        if (i9 == 1) {
                        }
                    }
                }
                return new F2.a(F2.b.SUCCESS, null, null, null, 14, null);
            }
        }
        bVar2 = new b(bVar);
        b bVar32 = bVar2;
        Object obj2 = bVar32.result;
        W5.a aVar2 = W5.a.f2787d;
        i2 = bVar32.label;
        if (i2 != 0) {
        }
        return new F2.a(F2.b.SUCCESS, null, null, null, 14, null);
    }

    @Override // F2.d
    public List<String> getOperations() {
        return r.d(SET_ALIAS, DELETE_ALIAS);
    }
}
