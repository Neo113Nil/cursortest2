package com.onesignal.user.internal.operations.impl.executors;

import a2.r;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.i0;
import kotlin.collections.o0;
import kotlin.collections.y;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c implements na.d {
    public static final a Companion = new a(null);
    public static final String DELETE_ALIAS = "delete-alias";
    public static final String SET_ALIAS = "set-alias";
    private final vc.a _buildUserService;
    private final uc.b _identityBackend;
    private final yc.b _identityModelStore;
    private final bd.a _newRecordState;

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
            return c.this.execute(null, this);
        }
    }

    public c(uc.b bVar, yc.b bVar2, vc.a aVar, bd.a aVar2) {
        bVar.getClass();
        bVar2.getClass();
        aVar.getClass();
        aVar2.getClass();
        this._identityBackend = bVar;
        this._identityModelStore = bVar2;
        this._buildUserService = aVar;
        this._newRecordState = aVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x025f A[Catch: a -> 0x0040, TRY_LEAVE, TryCatch #0 {a -> 0x0040, blocks: (B:13:0x003b, B:14:0x0246, B:16:0x025f), top: B:12:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013e A[Catch: a -> 0x0059, TRY_LEAVE, TryCatch #1 {a -> 0x0059, blocks: (B:50:0x0054, B:51:0x0125, B:53:0x013e), top: B:49:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    @Override // na.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object execute(List<? extends na.g> list, ld.a aVar) {
        b bVar;
        int i3;
        c cVar;
        na.g gVar;
        c cVar2;
        na.g gVar2;
        int i10;
        int i11;
        if (aVar instanceof b) {
            bVar = (b) aVar;
            int i12 = bVar.label;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                bVar.label = i12 - Integer.MIN_VALUE;
                b bVar2 = bVar;
                Object obj = bVar2.result;
                md.a aVar2 = md.a.f6622d;
                i3 = bVar2.label;
                if (i3 == 0) {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            i0.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        gVar2 = (na.g) bVar2.L$1;
                        cVar2 = (c) bVar2.L$0;
                        try {
                            cf.c.M(obj);
                            if (Intrinsics.a(((yc.a) cVar2._identityModelStore.getModel()).getOnesignalId(), ((zc.b) gVar2).getOnesignalId())) {
                                com.onesignal.common.modeling.i.setOptStringProperty$default(cVar2._identityModelStore.getModel(), ((zc.b) gVar2).getLabel(), null, "HYDRATE", false, 8, null);
                            }
                            return new na.a(na.b.SUCCESS, null, null, null, 14, null);
                        } catch (z9.a e2) {
                            e = e2;
                            i11 = d.$EnumSwitchMapping$0[com.onesignal.common.g.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                            if (i11 != 1) {
                                return new na.a(na.b.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                            }
                            if (i11 == 2) {
                                return new na.a(na.b.FAIL_NORETRY, null, null, null, 14, null);
                            }
                            if (i11 == 3) {
                                return new na.a(na.b.SUCCESS, null, null, null, 14, null);
                            }
                            if (i11 == 4) {
                                return new na.a(na.b.FAIL_UNAUTHORIZED, null, null, e.getRetryAfterSeconds(), 6, null);
                            }
                            if (i11 == 5) {
                                return (e.getStatusCode() == 404 && cVar2._newRecordState.isInMissingRetryWindow(((zc.b) gVar2).getOnesignalId())) ? new na.a(na.b.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null) : new na.a(na.b.SUCCESS, null, null, null, 14, null);
                            }
                            r.p();
                            return null;
                        }
                    }
                    gVar = (na.g) bVar2.L$1;
                    cVar = (c) bVar2.L$0;
                    try {
                        cf.c.M(obj);
                        if (Intrinsics.a(((yc.a) cVar._identityModelStore.getModel()).getOnesignalId(), ((zc.i) gVar).getOnesignalId())) {
                            com.onesignal.common.modeling.i.setStringProperty$default(cVar._identityModelStore.getModel(), ((zc.i) gVar).getLabel(), ((zc.i) gVar).getValue(), "HYDRATE", false, 8, null);
                        }
                        return new na.a(na.b.SUCCESS, null, null, null, 14, null);
                    } catch (z9.a e9) {
                        e = e9;
                        i10 = d.$EnumSwitchMapping$0[com.onesignal.common.g.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                        if (i10 != 1) {
                            return new na.a(na.b.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                        }
                        if (i10 == 2) {
                            return new na.a(na.b.FAIL_NORETRY, null, null, null, 14, null);
                        }
                        if (i10 == 3) {
                            return new na.a(na.b.FAIL_CONFLICT, null, null, e.getRetryAfterSeconds(), 6, null);
                        }
                        if (i10 == 4) {
                            return new na.a(na.b.FAIL_UNAUTHORIZED, null, null, e.getRetryAfterSeconds(), 6, null);
                        }
                        if (i10 != 5) {
                            r.p();
                            return null;
                        }
                        if (e.getStatusCode() == 404 && cVar._newRecordState.isInMissingRetryWindow(((zc.i) gVar).getOnesignalId())) {
                            return new na.a(na.b.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                        }
                        zc.i iVar = (zc.i) gVar;
                        List<na.g> rebuildOperationsIfCurrentUser = cVar._buildUserService.getRebuildOperationsIfCurrentUser(iVar.getAppId(), iVar.getOnesignalId());
                        return rebuildOperationsIfCurrentUser == null ? new na.a(na.b.FAIL_NORETRY, null, null, null, 14, null) : new na.a(na.b.FAIL_RETRY, null, rebuildOperationsIfCurrentUser, e.getRetryAfterSeconds(), 2, null);
                    }
                }
                cf.c.M(obj);
                com.onesignal.debug.internal.logging.b.debug$default("IdentityOperationExecutor(operations: " + list + ')', null, 2, null);
                if (list == null || !list.isEmpty()) {
                    for (na.g gVar3 : list) {
                        if (!(gVar3 instanceof zc.i) && !(gVar3 instanceof zc.b)) {
                            r.i(list, "Unrecognized operation(s)! Attempted operations:\n");
                            return null;
                        }
                    }
                }
                if (list == null || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (((na.g) it.next()) instanceof zc.i) {
                            if (list == null || !list.isEmpty()) {
                                Iterator<T> it2 = list.iterator();
                                while (it2.hasNext()) {
                                    if (((na.g) it2.next()) instanceof zc.b) {
                                        throw new Exception("Can't process SetAliasOperation and DeleteAliasOperation at the same time.");
                                    }
                                }
                            }
                        }
                    }
                }
                na.g gVar4 = (na.g) CollectionsKt.C(list);
                if (!(gVar4 instanceof zc.i)) {
                    if (gVar4 instanceof zc.b) {
                        try {
                            uc.b bVar3 = this._identityBackend;
                            String appId = ((zc.b) gVar4).getAppId();
                            String onesignalId = ((zc.b) gVar4).getOnesignalId();
                            String label = ((zc.b) gVar4).getLabel();
                            bVar2.L$0 = this;
                            bVar2.L$1 = gVar4;
                            bVar2.label = 2;
                            if (bVar3.deleteAlias(appId, "onesignal_id", onesignalId, label, bVar2) != aVar2) {
                                cVar2 = this;
                                gVar2 = gVar4;
                                if (Intrinsics.a(((yc.a) cVar2._identityModelStore.getModel()).getOnesignalId(), ((zc.b) gVar2).getOnesignalId())) {
                                }
                            }
                        } catch (z9.a e10) {
                            e = e10;
                            cVar2 = this;
                            gVar2 = gVar4;
                            i11 = d.$EnumSwitchMapping$0[com.onesignal.common.g.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                            if (i11 != 1) {
                            }
                        }
                    }
                    return new na.a(na.b.SUCCESS, null, null, null, 14, null);
                }
                try {
                    uc.b bVar4 = this._identityBackend;
                    String appId2 = ((zc.i) gVar4).getAppId();
                    String onesignalId2 = ((zc.i) gVar4).getOnesignalId();
                    Map<String, String> b10 = o0.b(new Pair(((zc.i) gVar4).getLabel(), ((zc.i) gVar4).getValue()));
                    bVar2.L$0 = this;
                    bVar2.L$1 = gVar4;
                    bVar2.label = 1;
                    if (bVar4.setAlias(appId2, "onesignal_id", onesignalId2, b10, bVar2) != aVar2) {
                        cVar = this;
                        gVar = gVar4;
                        if (Intrinsics.a(((yc.a) cVar._identityModelStore.getModel()).getOnesignalId(), ((zc.i) gVar).getOnesignalId())) {
                        }
                        return new na.a(na.b.SUCCESS, null, null, null, 14, null);
                    }
                } catch (z9.a e11) {
                    e = e11;
                    cVar = this;
                    gVar = gVar4;
                    i10 = d.$EnumSwitchMapping$0[com.onesignal.common.g.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                    if (i10 != 1) {
                    }
                }
                return aVar2;
            }
        }
        bVar = new b(aVar);
        b bVar22 = bVar;
        Object obj2 = bVar22.result;
        md.a aVar22 = md.a.f6622d;
        i3 = bVar22.label;
        if (i3 == 0) {
        }
    }

    @Override // na.d
    public List<String> getOperations() {
        return y.f(SET_ALIAS, DELETE_ALIAS);
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
