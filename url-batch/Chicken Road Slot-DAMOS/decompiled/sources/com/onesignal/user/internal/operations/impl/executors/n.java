package com.onesignal.user.internal.operations.impl.executors;

import a2.r;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.i0;
import kotlin.collections.y;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class n implements na.d {
    public static final a Companion = new a(null);
    public static final String DELETE_TAG = "delete-tag";
    public static final String SET_PROPERTY = "set-property";
    public static final String SET_TAG = "set-tag";
    public static final String TRACK_PURCHASE = "track-purchase";
    public static final String TRACK_SESSION_END = "track-session-end";
    public static final String TRACK_SESSION_START = "track-session-start";
    private final vc.a _buildUserService;
    private final y9.c _consistencyManager;
    private final yc.b _identityModelStore;
    private final bd.a _newRecordState;
    private final com.onesignal.user.internal.properties.b _propertiesModelStore;
    private final uc.d _userBackend;

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class b extends nd.c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public b(ld.a aVar) {
            super(aVar);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return n.this.execute(null, this);
        }
    }

    public n(uc.d dVar, yc.b bVar, com.onesignal.user.internal.properties.b bVar2, vc.a aVar, bd.a aVar2, y9.c cVar) {
        dVar.getClass();
        bVar.getClass();
        bVar2.getClass();
        aVar.getClass();
        aVar2.getClass();
        cVar.getClass();
        this._userBackend = dVar;
        this._identityModelStore = bVar;
        this._propertiesModelStore = bVar2;
        this._buildUserService = aVar;
        this._newRecordState = aVar2;
        this._consistencyManager = cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x028d, code lost:
    
        if (r2.resolveConditionsWithID(w9.a.ID, r11) == r3) goto L96;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x02a2 A[Catch: a -> 0x0048, TryCatch #1 {a -> 0x0048, blocks: (B:17:0x0043, B:18:0x0290, B:20:0x02a2, B:21:0x02a6, B:23:0x02ac, B:40:0x02b6, B:26:0x02d9, B:37:0x02dd, B:29:0x02fa, B:32:0x02fe), top: B:16:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0260 A[Catch: a -> 0x0069, TryCatch #0 {a -> 0x0069, blocks: (B:73:0x0064, B:74:0x025c, B:76:0x0260, B:81:0x027a), top: B:72:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x027a A[Catch: a -> 0x0069, TRY_LEAVE, TryCatch #0 {a -> 0x0069, blocks: (B:73:0x0064, B:74:0x025c, B:76:0x0260, B:81:0x027a), top: B:72:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    @Override // na.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object execute(List<? extends na.g> list, ld.a aVar) {
        b bVar;
        int i3;
        String str;
        String str2;
        String str3;
        n nVar;
        n nVar2;
        String str4;
        int i10;
        long sessionTime;
        BigDecimal amountSpent;
        ArrayList arrayList;
        w9.b bVar2;
        int i11;
        List<? extends na.g> list2 = list;
        if (aVar instanceof b) {
            bVar = (b) aVar;
            int i12 = bVar.label;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                bVar.label = i12 - Integer.MIN_VALUE;
                b bVar3 = bVar;
                Object obj = bVar3.result;
                Object obj2 = md.a.f6622d;
                i3 = bVar3.label;
                int i13 = 1;
                if (i3 != 0) {
                    cf.c.M(obj);
                    com.onesignal.debug.internal.logging.b.log(ua.c.DEBUG, "UpdateUserOperationExecutor(operation: " + list2 + ')');
                    uc.f fVar = new uc.f(null, null, null, null, null, null, 63, null);
                    str = null;
                    uc.e eVar = new uc.e(null, null, null, null, 15, null);
                    Iterator<? extends na.g> it = list2.iterator();
                    uc.e eVar2 = eVar;
                    String str5 = null;
                    boolean z10 = 0;
                    uc.f fVar2 = fVar;
                    while (it.hasNext()) {
                        na.g next = it.next();
                        if (next instanceof zc.k) {
                            if (str == null) {
                                zc.k kVar = (zc.k) next;
                                String appId = kVar.getAppId();
                                str5 = kVar.getOnesignalId();
                                str = appId;
                            }
                            fVar2 = i.INSTANCE.createPropertiesFromOperation((zc.k) next, fVar2);
                        } else if (next instanceof zc.d) {
                            if (str == null) {
                                zc.d dVar = (zc.d) next;
                                String appId2 = dVar.getAppId();
                                str5 = dVar.getOnesignalId();
                                str = appId2;
                            }
                            fVar2 = i.INSTANCE.createPropertiesFromOperation((zc.d) next, fVar2);
                        } else if (next instanceof zc.j) {
                            if (str == null) {
                                zc.j jVar = (zc.j) next;
                                String appId3 = jVar.getAppId();
                                str5 = jVar.getOnesignalId();
                                str = appId3;
                            }
                            fVar2 = i.INSTANCE.createPropertiesFromOperation((zc.j) next, fVar2);
                        } else if (next instanceof zc.o) {
                            if (str == null) {
                                zc.o oVar = (zc.o) next;
                                str = oVar.getAppId();
                                str5 = oVar.getOnesignalId();
                            }
                            if (eVar2.getSessionCount() != null) {
                                Integer sessionCount = eVar2.getSessionCount();
                                sessionCount.getClass();
                                i10 = sessionCount.intValue() + i13;
                            } else {
                                i10 = i13;
                            }
                            eVar2 = new uc.e(eVar2.getSessionTime(), new Integer(i10), eVar2.getAmountSpent(), eVar2.getPurchases());
                            z10 = i13;
                        } else if (next instanceof zc.n) {
                            if (str == null) {
                                zc.n nVar3 = (zc.n) next;
                                String appId4 = nVar3.getAppId();
                                str5 = nVar3.getOnesignalId();
                                str = appId4;
                            }
                            if (eVar2.getSessionTime() != null) {
                                Long sessionTime2 = eVar2.getSessionTime();
                                sessionTime2.getClass();
                                sessionTime = ((zc.n) next).getSessionTime() + sessionTime2.longValue();
                            } else {
                                sessionTime = ((zc.n) next).getSessionTime();
                            }
                            eVar2 = new uc.e(new Long(sessionTime), eVar2.getSessionCount(), eVar2.getAmountSpent(), eVar2.getPurchases());
                        } else {
                            if (!(next instanceof zc.m)) {
                                r.i(next, "Unrecognized operation: ");
                                return null;
                            }
                            if (str == null) {
                                zc.m mVar = (zc.m) next;
                                String appId5 = mVar.getAppId();
                                str5 = mVar.getOnesignalId();
                                str = appId5;
                            }
                            if (eVar2.getAmountSpent() != null) {
                                BigDecimal amountSpent2 = eVar2.getAmountSpent();
                                amountSpent2.getClass();
                                amountSpent = amountSpent2.add(((zc.m) next).getAmountSpent());
                                amountSpent.getClass();
                            } else {
                                amountSpent = ((zc.m) next).getAmountSpent();
                            }
                            if (eVar2.getPurchases() != null) {
                                List<uc.g> purchases = eVar2.getPurchases();
                                purchases.getClass();
                                arrayList = new ArrayList(purchases);
                            } else {
                                arrayList = new ArrayList();
                            }
                            for (zc.g gVar : ((zc.m) next).getPurchases()) {
                                arrayList.add(new uc.g(gVar.getSku(), gVar.getIso(), gVar.getAmount()));
                                it = it;
                            }
                            eVar2 = new uc.e(eVar2.getSessionTime(), eVar2.getSessionCount(), amountSpent, arrayList);
                            it = it;
                            i13 = 1;
                        }
                    }
                    if (str != null && str5 != null) {
                        try {
                            uc.d dVar2 = this._userBackend;
                            bVar3.L$0 = this;
                            bVar3.L$1 = list2;
                            bVar3.L$2 = str;
                            bVar3.L$3 = str5;
                            bVar3.label = 1;
                            obj = dVar2.updateUser(str, "onesignal_id", str5, fVar2, z10, eVar2, bVar3);
                            if (obj != obj2) {
                                nVar2 = this;
                                str4 = str5;
                            }
                            return obj2;
                        } catch (z9.a e2) {
                            e = e2;
                            str2 = str;
                            str3 = str5;
                            nVar = this;
                            i11 = o.$EnumSwitchMapping$0[com.onesignal.common.g.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                            if (i11 == 1) {
                            }
                        }
                    }
                    return new na.a(na.b.SUCCESS, null, null, null, 14, null);
                }
                if (i3 == 1) {
                    str4 = (String) bVar3.L$3;
                    str = (String) bVar3.L$2;
                    list2 = (List) bVar3.L$1;
                    nVar2 = (n) bVar3.L$0;
                    try {
                        cf.c.M(obj);
                    } catch (z9.a e9) {
                        e = e9;
                        str3 = str4;
                        str2 = str;
                        nVar = nVar2;
                        i11 = o.$EnumSwitchMapping$0[com.onesignal.common.g.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                        if (i11 == 1) {
                            return new na.a(na.b.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                        }
                        if (i11 == 2) {
                            return new na.a(na.b.FAIL_UNAUTHORIZED, null, null, e.getRetryAfterSeconds(), 6, null);
                        }
                        if (i11 != 3) {
                            return new na.a(na.b.FAIL_NORETRY, null, null, null, 14, null);
                        }
                        if (e.getStatusCode() == 404 && nVar._newRecordState.isInMissingRetryWindow(str3)) {
                            return new na.a(na.b.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                        }
                        List<na.g> rebuildOperationsIfCurrentUser = nVar._buildUserService.getRebuildOperationsIfCurrentUser(str2, str3);
                        return rebuildOperationsIfCurrentUser == null ? new na.a(na.b.FAIL_NORETRY, null, null, null, 14, null) : new na.a(na.b.FAIL_RETRY, null, rebuildOperationsIfCurrentUser, e.getRetryAfterSeconds(), 2, null);
                    }
                } else {
                    if (i3 != 2 && i3 != 3) {
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str3 = (String) bVar3.L$3;
                    str2 = (String) bVar3.L$2;
                    list2 = (List) bVar3.L$1;
                    nVar = (n) bVar3.L$0;
                    try {
                        cf.c.M(obj);
                        if (Intrinsics.a(((yc.a) nVar._identityModelStore.getModel()).getOnesignalId(), str3)) {
                            for (na.g gVar2 : list2) {
                                if (gVar2 instanceof zc.k) {
                                    com.onesignal.common.modeling.i.setStringProperty$default(((com.onesignal.user.internal.properties.a) nVar._propertiesModelStore.getModel()).getTags(), ((zc.k) gVar2).getKey(), ((zc.k) gVar2).getValue(), "HYDRATE", false, 8, null);
                                } else if (gVar2 instanceof zc.d) {
                                    com.onesignal.common.modeling.i.setOptStringProperty$default(((com.onesignal.user.internal.properties.a) nVar._propertiesModelStore.getModel()).getTags(), ((zc.d) gVar2).getKey(), null, "HYDRATE", false, 8, null);
                                } else if (gVar2 instanceof zc.j) {
                                    com.onesignal.common.modeling.i.setOptAnyProperty$default(nVar._propertiesModelStore.getModel(), ((zc.j) gVar2).getProperty(), ((zc.j) gVar2).getValue(), "HYDRATE", false, 8, null);
                                }
                            }
                        }
                        return new na.a(na.b.SUCCESS, null, null, null, 14, null);
                    } catch (z9.a e10) {
                        e = e10;
                        i11 = o.$EnumSwitchMapping$0[com.onesignal.common.g.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                        if (i11 == 1) {
                        }
                    }
                }
                bVar2 = (w9.b) obj;
                if (bVar2 == null) {
                    y9.c cVar = nVar2._consistencyManager;
                    x9.a aVar2 = x9.a.USER;
                    bVar3.L$0 = nVar2;
                    bVar3.L$1 = list2;
                    bVar3.L$2 = str;
                    bVar3.L$3 = str4;
                    bVar3.label = 2;
                    if (cVar.setRywData(str4, aVar2, bVar2, bVar3) == obj2) {
                        return obj2;
                    }
                    str3 = str4;
                    str2 = str;
                    nVar = nVar2;
                } else {
                    y9.c cVar2 = nVar2._consistencyManager;
                    bVar3.L$0 = nVar2;
                    bVar3.L$1 = list2;
                    bVar3.L$2 = str;
                    bVar3.L$3 = str4;
                    bVar3.label = 3;
                }
                if (Intrinsics.a(((yc.a) nVar._identityModelStore.getModel()).getOnesignalId(), str3)) {
                }
                return new na.a(na.b.SUCCESS, null, null, null, 14, null);
            }
        }
        bVar = new b(aVar);
        b bVar32 = bVar;
        Object obj3 = bVar32.result;
        Object obj22 = md.a.f6622d;
        i3 = bVar32.label;
        int i132 = 1;
        if (i3 != 0) {
        }
        bVar2 = (w9.b) obj3;
        if (bVar2 == null) {
        }
        if (Intrinsics.a(((yc.a) nVar._identityModelStore.getModel()).getOnesignalId(), str3)) {
        }
        return new na.a(na.b.SUCCESS, null, null, null, 14, null);
    }

    @Override // na.d
    public List<String> getOperations() {
        return y.f(SET_TAG, DELETE_TAG, SET_PROPERTY, TRACK_SESSION_START, TRACK_SESSION_END, TRACK_PURCHASE);
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
