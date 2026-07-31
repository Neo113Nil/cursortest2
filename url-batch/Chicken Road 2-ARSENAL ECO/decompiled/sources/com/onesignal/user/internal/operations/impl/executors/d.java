package com.onesignal.user.internal.operations.impl.executors;

import H5.r;
import d2.C0317a;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k5.C0477g;
import l5.AbstractC0506j;
import l5.AbstractC0507k;
import l5.t;
import n3.InterfaceC0544b;
import o3.InterfaceC0559a;
import o5.InterfaceC0564d;
import p5.EnumC0580a;
import q5.AbstractC0607c;
import r3.C0617a;
import u0.AbstractC0676f;
import u3.C0692a;

/* loaded from: classes.dex */
public final class d implements d2.d {
    public static final a Companion = new a(null);
    public static final String DELETE_ALIAS = "delete-alias";
    public static final String SET_ALIAS = "set-alias";
    private final InterfaceC0559a _buildUserService;
    private final InterfaceC0544b _identityBackend;
    private final r3.b _identityModelStore;
    private final com.onesignal.core.internal.config.impl.c _identityVerificationService;
    private final com.onesignal.user.internal.jwt.c _jwtTokenStore;
    private final C0692a _newRecordState;

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
            return d.this.execute(null, this);
        }
    }

    public d(InterfaceC0544b _identityBackend, r3.b _identityModelStore, InterfaceC0559a _buildUserService, C0692a _newRecordState, com.onesignal.user.internal.jwt.c _jwtTokenStore, com.onesignal.core.internal.config.impl.c _identityVerificationService) {
        kotlin.jvm.internal.i.e(_identityBackend, "_identityBackend");
        kotlin.jvm.internal.i.e(_identityModelStore, "_identityModelStore");
        kotlin.jvm.internal.i.e(_buildUserService, "_buildUserService");
        kotlin.jvm.internal.i.e(_newRecordState, "_newRecordState");
        kotlin.jvm.internal.i.e(_jwtTokenStore, "_jwtTokenStore");
        kotlin.jvm.internal.i.e(_identityVerificationService, "_identityVerificationService");
        this._identityBackend = _identityBackend;
        this._identityModelStore = _identityModelStore;
        this._buildUserService = _buildUserService;
        this._newRecordState = _newRecordState;
        this._jwtTokenStore = _jwtTokenStore;
        this._identityVerificationService = _identityVerificationService;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x02ac A[Catch: a -> 0x02c8, TRY_LEAVE, TryCatch #6 {a -> 0x02c8, blocks: (B:16:0x0293, B:18:0x02ac), top: B:15:0x0293 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0168 A[Catch: a -> 0x0189, TRY_LEAVE, TryCatch #7 {a -> 0x0189, blocks: (B:58:0x014f, B:60:0x0168), top: B:57:0x014f }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    @Override // d2.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object execute(List<? extends d2.g> list, InterfaceC0564d interfaceC0564d) {
        b bVar;
        int i7;
        int i8;
        d dVar;
        d2.g gVar;
        int i9;
        d dVar2;
        d2.g gVar2;
        Map<String, String> q02;
        String jwt;
        int i10;
        int i11;
        if (interfaceC0564d instanceof b) {
            bVar = (b) interfaceC0564d;
            int i12 = bVar.label;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                bVar.label = i12 - Integer.MIN_VALUE;
                b bVar2 = bVar;
                Object obj = bVar2.result;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                i7 = bVar2.label;
                if (i7 != 0) {
                    AbstractC0676f.w(obj);
                    com.onesignal.debug.internal.logging.b.debug$default("IdentityOperationExecutor(operations: " + list + ')', null, 2, null);
                    if (list == null || !list.isEmpty()) {
                        for (d2.g gVar3 : list) {
                            if (!(gVar3 instanceof s3.i) && !(gVar3 instanceof s3.b)) {
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
                            if (((d2.g) it.next()) instanceof s3.i) {
                                if (list == null || !list.isEmpty()) {
                                    Iterator<T> it2 = list.iterator();
                                    while (it2.hasNext()) {
                                        if (((d2.g) it2.next()) instanceof s3.b) {
                                            throw new Exception("Can't process SetAliasOperation and DeleteAliasOperation at the same time.");
                                        }
                                    }
                                }
                            }
                        }
                    }
                    d2.g gVar4 = (d2.g) AbstractC0506j.J(list);
                    if (gVar4 instanceof s3.i) {
                        f resolveBackendParams = c.resolveBackendParams(gVar4, ((s3.i) gVar4).getOnesignalId(), this._jwtTokenStore, this._identityVerificationService);
                        try {
                            InterfaceC0544b interfaceC0544b = this._identityBackend;
                            String appId = ((s3.i) gVar4).getAppId();
                            try {
                                String aliasLabel = resolveBackendParams.getAliasLabel();
                                try {
                                    String aliasValue = resolveBackendParams.getAliasValue();
                                    try {
                                        q02 = t.q0(new C0477g(((s3.i) gVar4).getLabel(), ((s3.i) gVar4).getValue()));
                                        jwt = resolveBackendParams.getJwt();
                                        bVar2.L$0 = this;
                                        bVar2.L$1 = gVar4;
                                        bVar2.label = 1;
                                        i9 = 2;
                                    } catch (P1.a e4) {
                                        e = e4;
                                        i9 = 2;
                                    }
                                    try {
                                        if (interfaceC0544b.setAlias(appId, aliasLabel, aliasValue, q02, jwt, bVar2) != enumC0580a) {
                                            dVar2 = this;
                                            gVar2 = gVar4;
                                            if (kotlin.jvm.internal.i.a(((C0617a) dVar2._identityModelStore.getModel()).getOnesignalId(), ((s3.i) gVar2).getOnesignalId())) {
                                            }
                                        }
                                    } catch (P1.a e7) {
                                        e = e7;
                                        dVar2 = this;
                                        gVar2 = gVar4;
                                        i10 = e.$EnumSwitchMapping$0[com.onesignal.common.g.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                                        if (i10 == 1) {
                                        }
                                    }
                                } catch (P1.a e8) {
                                    e = e8;
                                    i9 = 2;
                                }
                            } catch (P1.a e9) {
                                e = e9;
                                i9 = 2;
                            }
                        } catch (P1.a e10) {
                            e = e10;
                            i9 = 2;
                        }
                    } else {
                        i8 = 2;
                        if (gVar4 instanceof s3.b) {
                            f resolveBackendParams2 = c.resolveBackendParams(gVar4, ((s3.b) gVar4).getOnesignalId(), this._jwtTokenStore, this._identityVerificationService);
                            try {
                                InterfaceC0544b interfaceC0544b2 = this._identityBackend;
                                String appId2 = ((s3.b) gVar4).getAppId();
                                String aliasLabel2 = resolveBackendParams2.getAliasLabel();
                                String aliasValue2 = resolveBackendParams2.getAliasValue();
                                String label = ((s3.b) gVar4).getLabel();
                                String jwt2 = resolveBackendParams2.getJwt();
                                bVar2.L$0 = this;
                                bVar2.L$1 = gVar4;
                                bVar2.label = 2;
                                if (interfaceC0544b2.deleteAlias(appId2, aliasLabel2, aliasValue2, label, jwt2, bVar2) != enumC0580a) {
                                    dVar = this;
                                    gVar = gVar4;
                                    if (kotlin.jvm.internal.i.a(((C0617a) dVar._identityModelStore.getModel()).getOnesignalId(), ((s3.b) gVar).getOnesignalId())) {
                                    }
                                }
                            } catch (P1.a e11) {
                                e = e11;
                                dVar = this;
                                gVar = gVar4;
                                i11 = e.$EnumSwitchMapping$0[com.onesignal.common.g.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                                if (i11 == 1) {
                                }
                            }
                        }
                    }
                    return enumC0580a;
                }
                if (i7 == 1) {
                    gVar2 = (d2.g) bVar2.L$1;
                    dVar2 = (d) bVar2.L$0;
                    try {
                        AbstractC0676f.w(obj);
                        i9 = 2;
                    } catch (P1.a e12) {
                        e = e12;
                        i9 = 2;
                        i10 = e.$EnumSwitchMapping$0[com.onesignal.common.g.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                        if (i10 == 1) {
                            return new C0317a(d2.b.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                        }
                        if (i10 == i9) {
                            return new C0317a(d2.b.FAIL_NORETRY, null, null, null, 14, null);
                        }
                        if (i10 == 3) {
                            return new C0317a(d2.b.FAIL_CONFLICT, null, null, e.getRetryAfterSeconds(), 6, null);
                        }
                        if (i10 == 4) {
                            return new C0317a(d2.b.FAIL_UNAUTHORIZED, null, null, e.getRetryAfterSeconds(), 6, null);
                        }
                        if (i10 != 5) {
                            throw new r();
                        }
                        if (e.getStatusCode() == 404 && dVar2._newRecordState.isInMissingRetryWindow(((s3.i) gVar2).getOnesignalId())) {
                            return new C0317a(d2.b.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                        }
                        s3.i iVar = (s3.i) gVar2;
                        List<d2.g> rebuildOperationsIfCurrentUser = dVar2._buildUserService.getRebuildOperationsIfCurrentUser(iVar.getAppId(), iVar.getOnesignalId());
                        return rebuildOperationsIfCurrentUser == null ? new C0317a(d2.b.FAIL_NORETRY, null, null, null, 14, null) : new C0317a(d2.b.FAIL_RETRY, null, rebuildOperationsIfCurrentUser, e.getRetryAfterSeconds(), 2, null);
                    }
                    try {
                        if (kotlin.jvm.internal.i.a(((C0617a) dVar2._identityModelStore.getModel()).getOnesignalId(), ((s3.i) gVar2).getOnesignalId())) {
                            com.onesignal.common.modeling.i.setStringProperty$default(dVar2._identityModelStore.getModel(), ((s3.i) gVar2).getLabel(), ((s3.i) gVar2).getValue(), "HYDRATE", false, 8, null);
                        }
                    } catch (P1.a e13) {
                        e = e13;
                        i10 = e.$EnumSwitchMapping$0[com.onesignal.common.g.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                        if (i10 == 1) {
                        }
                    }
                } else {
                    if (i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gVar = (d2.g) bVar2.L$1;
                    dVar = (d) bVar2.L$0;
                    try {
                        AbstractC0676f.w(obj);
                        i8 = 2;
                    } catch (P1.a e14) {
                        e = e14;
                        i8 = 2;
                        i11 = e.$EnumSwitchMapping$0[com.onesignal.common.g.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                        if (i11 == 1) {
                            return new C0317a(d2.b.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                        }
                        if (i11 == i8) {
                            return new C0317a(d2.b.FAIL_NORETRY, null, null, null, 14, null);
                        }
                        if (i11 == 3) {
                            return new C0317a(d2.b.SUCCESS, null, null, null, 14, null);
                        }
                        if (i11 == 4) {
                            return new C0317a(d2.b.FAIL_UNAUTHORIZED, null, null, e.getRetryAfterSeconds(), 6, null);
                        }
                        if (i11 == 5) {
                            return (e.getStatusCode() == 404 && dVar._newRecordState.isInMissingRetryWindow(((s3.b) gVar).getOnesignalId())) ? new C0317a(d2.b.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null) : new C0317a(d2.b.SUCCESS, null, null, null, 14, null);
                        }
                        throw new r();
                    }
                    try {
                        if (kotlin.jvm.internal.i.a(((C0617a) dVar._identityModelStore.getModel()).getOnesignalId(), ((s3.b) gVar).getOnesignalId())) {
                            com.onesignal.common.modeling.i.setOptStringProperty$default(dVar._identityModelStore.getModel(), ((s3.b) gVar).getLabel(), null, "HYDRATE", false, 8, null);
                        }
                    } catch (P1.a e15) {
                        e = e15;
                        i11 = e.$EnumSwitchMapping$0[com.onesignal.common.g.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                        if (i11 == 1) {
                        }
                    }
                }
                return new C0317a(d2.b.SUCCESS, null, null, null, 14, null);
            }
        }
        bVar = new b(interfaceC0564d);
        b bVar22 = bVar;
        Object obj2 = bVar22.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = bVar22.label;
        if (i7 != 0) {
        }
        return new C0317a(d2.b.SUCCESS, null, null, null, 14, null);
    }

    @Override // d2.d
    public List<String> getOperations() {
        return AbstractC0507k.z(SET_ALIAS, DELETE_ALIAS);
    }
}
