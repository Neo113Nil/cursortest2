package com.onesignal.user.internal.operations.impl.executors;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p4.C4860a;
import q7.C4938g;
import r7.AbstractC4979j;
import r7.AbstractC4980k;
import r7.t;
import v7.InterfaceC5133d;
import w7.EnumC5179a;
import x7.AbstractC5219c;

/* loaded from: classes2.dex */
public final class d implements D4.d {
    public static final a Companion = new a(null);
    public static final String DELETE_ALIAS = "delete-alias";
    public static final String SET_ALIAS = "set-alias";
    private final N5.a _buildUserService;
    private final M5.b _identityBackend;
    private final Q5.b _identityModelStore;
    private final com.onesignal.core.internal.config.impl.c _identityVerificationService;
    private final com.onesignal.user.internal.jwt.c _jwtTokenStore;
    private final T5.a _newRecordState;

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
            return d.this.execute(null, this);
        }
    }

    public d(M5.b _identityBackend, Q5.b _identityModelStore, N5.a _buildUserService, T5.a _newRecordState, com.onesignal.user.internal.jwt.c _jwtTokenStore, com.onesignal.core.internal.config.impl.c _identityVerificationService) {
        kotlin.jvm.internal.h.e(_identityBackend, "_identityBackend");
        kotlin.jvm.internal.h.e(_identityModelStore, "_identityModelStore");
        kotlin.jvm.internal.h.e(_buildUserService, "_buildUserService");
        kotlin.jvm.internal.h.e(_newRecordState, "_newRecordState");
        kotlin.jvm.internal.h.e(_jwtTokenStore, "_jwtTokenStore");
        kotlin.jvm.internal.h.e(_identityVerificationService, "_identityVerificationService");
        this._identityBackend = _identityBackend;
        this._identityModelStore = _identityModelStore;
        this._buildUserService = _buildUserService;
        this._newRecordState = _newRecordState;
        this._jwtTokenStore = _jwtTokenStore;
        this._identityVerificationService = _identityVerificationService;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x02ac A[Catch: a -> 0x02c8, TRY_LEAVE, TryCatch #1 {a -> 0x02c8, blocks: (B:16:0x0293, B:18:0x02ac), top: B:15:0x0293 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0168 A[Catch: a -> 0x0189, TRY_LEAVE, TryCatch #4 {a -> 0x0189, blocks: (B:58:0x014f, B:60:0x0168), top: B:57:0x014f }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    @Override // D4.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object execute(List<? extends D4.g> list, InterfaceC5133d interfaceC5133d) {
        b bVar;
        int i;
        int i4;
        d dVar;
        D4.g gVar;
        int i9;
        d dVar2;
        D4.g gVar2;
        int i10;
        int i11;
        if (interfaceC5133d instanceof b) {
            bVar = (b) interfaceC5133d;
            int i12 = bVar.label;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                bVar.label = i12 - Integer.MIN_VALUE;
                b bVar2 = bVar;
                Object obj = bVar2.result;
                EnumC5179a enumC5179a = EnumC5179a.f41704n;
                i = bVar2.label;
                if (i != 0) {
                    com.bumptech.glide.f.r(obj);
                    com.onesignal.debug.internal.logging.b.debug$default("IdentityOperationExecutor(operations: " + list + ')', null, 2, null);
                    if (list == null || !list.isEmpty()) {
                        for (D4.g gVar3 : list) {
                            if (!(gVar3 instanceof R5.i) && !(gVar3 instanceof R5.b)) {
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
                            if (((D4.g) it.next()) instanceof R5.i) {
                                if (list == null || !list.isEmpty()) {
                                    Iterator<T> it2 = list.iterator();
                                    while (it2.hasNext()) {
                                        if (((D4.g) it2.next()) instanceof R5.b) {
                                            throw new Exception("Can't process SetAliasOperation and DeleteAliasOperation at the same time.");
                                        }
                                    }
                                }
                            }
                        }
                    }
                    D4.g gVar4 = (D4.g) AbstractC4979j.L(list);
                    if (gVar4 instanceof R5.i) {
                        f resolveBackendParams = c.resolveBackendParams(gVar4, ((R5.i) gVar4).getOnesignalId(), this._jwtTokenStore, this._identityVerificationService);
                        try {
                            M5.b bVar3 = this._identityBackend;
                            String appId = ((R5.i) gVar4).getAppId();
                            try {
                                String aliasLabel = resolveBackendParams.getAliasLabel();
                                try {
                                    String aliasValue = resolveBackendParams.getAliasValue();
                                    try {
                                        Map<String, String> A8 = t.A(new C4938g(((R5.i) gVar4).getLabel(), ((R5.i) gVar4).getValue()));
                                        String jwt = resolveBackendParams.getJwt();
                                        bVar2.L$0 = this;
                                        bVar2.L$1 = gVar4;
                                        bVar2.label = 1;
                                        i9 = 2;
                                        try {
                                            if (bVar3.setAlias(appId, aliasLabel, aliasValue, A8, jwt, bVar2) != enumC5179a) {
                                                dVar2 = this;
                                                gVar2 = gVar4;
                                                if (kotlin.jvm.internal.h.a(((Q5.a) dVar2._identityModelStore.getModel()).getOnesignalId(), ((R5.i) gVar2).getOnesignalId())) {
                                                }
                                            }
                                        } catch (C4860a e6) {
                                            e = e6;
                                            dVar2 = this;
                                            gVar2 = gVar4;
                                            i10 = e.$EnumSwitchMapping$0[com.onesignal.common.g.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                                            if (i10 == 1) {
                                                return new D4.a(D4.b.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                                            }
                                            if (i10 == i9) {
                                                return new D4.a(D4.b.FAIL_NORETRY, null, null, null, 14, null);
                                            }
                                            if (i10 == 3) {
                                                return new D4.a(D4.b.FAIL_CONFLICT, null, null, e.getRetryAfterSeconds(), 6, null);
                                            }
                                            if (i10 == 4) {
                                                return new D4.a(D4.b.FAIL_UNAUTHORIZED, null, null, e.getRetryAfterSeconds(), 6, null);
                                            }
                                            if (i10 != 5) {
                                                throw new B0.c();
                                            }
                                            if (e.getStatusCode() == 404 && dVar2._newRecordState.isInMissingRetryWindow(((R5.i) gVar2).getOnesignalId())) {
                                                return new D4.a(D4.b.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                                            }
                                            R5.i iVar = (R5.i) gVar2;
                                            List<D4.g> rebuildOperationsIfCurrentUser = dVar2._buildUserService.getRebuildOperationsIfCurrentUser(iVar.getAppId(), iVar.getOnesignalId());
                                            return rebuildOperationsIfCurrentUser == null ? new D4.a(D4.b.FAIL_NORETRY, null, null, null, 14, null) : new D4.a(D4.b.FAIL_RETRY, null, rebuildOperationsIfCurrentUser, e.getRetryAfterSeconds(), 2, null);
                                        }
                                    } catch (C4860a e9) {
                                        e = e9;
                                        i9 = 2;
                                    }
                                } catch (C4860a e10) {
                                    e = e10;
                                    i9 = 2;
                                }
                            } catch (C4860a e11) {
                                e = e11;
                                i9 = 2;
                            }
                        } catch (C4860a e12) {
                            e = e12;
                            i9 = 2;
                        }
                    } else {
                        i4 = 2;
                        if (gVar4 instanceof R5.b) {
                            f resolveBackendParams2 = c.resolveBackendParams(gVar4, ((R5.b) gVar4).getOnesignalId(), this._jwtTokenStore, this._identityVerificationService);
                            try {
                                M5.b bVar4 = this._identityBackend;
                                String appId2 = ((R5.b) gVar4).getAppId();
                                String aliasLabel2 = resolveBackendParams2.getAliasLabel();
                                String aliasValue2 = resolveBackendParams2.getAliasValue();
                                String label = ((R5.b) gVar4).getLabel();
                                String jwt2 = resolveBackendParams2.getJwt();
                                bVar2.L$0 = this;
                                bVar2.L$1 = gVar4;
                                bVar2.label = 2;
                                if (bVar4.deleteAlias(appId2, aliasLabel2, aliasValue2, label, jwt2, bVar2) != enumC5179a) {
                                    dVar = this;
                                    gVar = gVar4;
                                    if (kotlin.jvm.internal.h.a(((Q5.a) dVar._identityModelStore.getModel()).getOnesignalId(), ((R5.b) gVar).getOnesignalId())) {
                                    }
                                }
                            } catch (C4860a e13) {
                                e = e13;
                                dVar = this;
                                gVar = gVar4;
                                i11 = e.$EnumSwitchMapping$0[com.onesignal.common.g.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                                if (i11 == 1) {
                                }
                            }
                        }
                    }
                    return enumC5179a;
                }
                if (i == 1) {
                    gVar2 = (D4.g) bVar2.L$1;
                    dVar2 = (d) bVar2.L$0;
                    try {
                        com.bumptech.glide.f.r(obj);
                        i9 = 2;
                        try {
                            if (kotlin.jvm.internal.h.a(((Q5.a) dVar2._identityModelStore.getModel()).getOnesignalId(), ((R5.i) gVar2).getOnesignalId())) {
                                com.onesignal.common.modeling.i.setStringProperty$default(dVar2._identityModelStore.getModel(), ((R5.i) gVar2).getLabel(), ((R5.i) gVar2).getValue(), "HYDRATE", false, 8, null);
                            }
                        } catch (C4860a e14) {
                            e = e14;
                            i10 = e.$EnumSwitchMapping$0[com.onesignal.common.g.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                            if (i10 == 1) {
                            }
                        }
                    } catch (C4860a e15) {
                        e = e15;
                        i9 = 2;
                        i10 = e.$EnumSwitchMapping$0[com.onesignal.common.g.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                        if (i10 == 1) {
                        }
                    }
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gVar = (D4.g) bVar2.L$1;
                    dVar = (d) bVar2.L$0;
                    try {
                        com.bumptech.glide.f.r(obj);
                        i4 = 2;
                        try {
                            if (kotlin.jvm.internal.h.a(((Q5.a) dVar._identityModelStore.getModel()).getOnesignalId(), ((R5.b) gVar).getOnesignalId())) {
                                com.onesignal.common.modeling.i.setOptStringProperty$default(dVar._identityModelStore.getModel(), ((R5.b) gVar).getLabel(), null, "HYDRATE", false, 8, null);
                            }
                        } catch (C4860a e16) {
                            e = e16;
                            i11 = e.$EnumSwitchMapping$0[com.onesignal.common.g.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                            if (i11 == 1) {
                                return new D4.a(D4.b.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                            }
                            if (i11 == i4) {
                                return new D4.a(D4.b.FAIL_NORETRY, null, null, null, 14, null);
                            }
                            if (i11 == 3) {
                                return new D4.a(D4.b.SUCCESS, null, null, null, 14, null);
                            }
                            if (i11 == 4) {
                                return new D4.a(D4.b.FAIL_UNAUTHORIZED, null, null, e.getRetryAfterSeconds(), 6, null);
                            }
                            if (i11 == 5) {
                                return (e.getStatusCode() == 404 && dVar._newRecordState.isInMissingRetryWindow(((R5.b) gVar).getOnesignalId())) ? new D4.a(D4.b.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null) : new D4.a(D4.b.SUCCESS, null, null, null, 14, null);
                            }
                            throw new B0.c();
                        }
                    } catch (C4860a e17) {
                        e = e17;
                        i4 = 2;
                        i11 = e.$EnumSwitchMapping$0[com.onesignal.common.g.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                        if (i11 == 1) {
                        }
                    }
                }
                return new D4.a(D4.b.SUCCESS, null, null, null, 14, null);
            }
        }
        bVar = new b(interfaceC5133d);
        b bVar22 = bVar;
        Object obj2 = bVar22.result;
        EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
        i = bVar22.label;
        if (i != 0) {
        }
        return new D4.a(D4.b.SUCCESS, null, null, null, 14, null);
    }

    @Override // D4.d
    public List<String> getOperations() {
        return AbstractC4980k.B(SET_ALIAS, DELETE_ALIAS);
    }
}
