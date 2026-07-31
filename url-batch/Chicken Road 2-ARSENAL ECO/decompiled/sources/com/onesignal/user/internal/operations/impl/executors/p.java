package com.onesignal.user.internal.operations.impl.executors;

import d2.C0317a;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l5.AbstractC0506j;
import l5.AbstractC0507k;
import n3.C0547e;
import n3.C0548f;
import n3.C0549g;
import n3.InterfaceC0546d;
import o3.InterfaceC0559a;
import o5.InterfaceC0564d;
import p5.EnumC0580a;
import q5.AbstractC0607c;
import r3.C0617a;
import u0.AbstractC0676f;
import u3.C0692a;

/* loaded from: classes.dex */
public final class p implements d2.d {
    public static final a Companion = new a(null);
    public static final String DELETE_TAG = "delete-tag";
    public static final String SET_PROPERTY = "set-property";
    public static final String SET_TAG = "set-tag";
    public static final String TRACK_PURCHASE = "track-purchase";
    public static final String TRACK_SESSION_END = "track-session-end";
    public static final String TRACK_SESSION_START = "track-session-start";
    private final InterfaceC0559a _buildUserService;
    private final O1.c _consistencyManager;
    private final r3.b _identityModelStore;
    private final com.onesignal.core.internal.config.impl.c _identityVerificationService;
    private final com.onesignal.user.internal.jwt.c _jwtTokenStore;
    private final C0692a _newRecordState;
    private final com.onesignal.user.internal.properties.b _propertiesModelStore;
    private final InterfaceC0546d _userBackend;

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
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public b(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return p.this.execute(null, this);
        }
    }

    public p(InterfaceC0546d _userBackend, r3.b _identityModelStore, com.onesignal.user.internal.properties.b _propertiesModelStore, InterfaceC0559a _buildUserService, C0692a _newRecordState, O1.c _consistencyManager, com.onesignal.user.internal.jwt.c _jwtTokenStore, com.onesignal.core.internal.config.impl.c _identityVerificationService) {
        kotlin.jvm.internal.i.e(_userBackend, "_userBackend");
        kotlin.jvm.internal.i.e(_identityModelStore, "_identityModelStore");
        kotlin.jvm.internal.i.e(_propertiesModelStore, "_propertiesModelStore");
        kotlin.jvm.internal.i.e(_buildUserService, "_buildUserService");
        kotlin.jvm.internal.i.e(_newRecordState, "_newRecordState");
        kotlin.jvm.internal.i.e(_consistencyManager, "_consistencyManager");
        kotlin.jvm.internal.i.e(_jwtTokenStore, "_jwtTokenStore");
        kotlin.jvm.internal.i.e(_identityVerificationService, "_identityVerificationService");
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
    
        if (r2.resolveConditionsWithID(M1.a.ID, r12) == r3) goto L99;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x02de A[Catch: a -> 0x0048, TryCatch #2 {a -> 0x0048, blocks: (B:14:0x0043, B:15:0x02cc, B:17:0x02de, B:18:0x02e2, B:20:0x02e8, B:37:0x02f2, B:23:0x0315, B:34:0x0319, B:26:0x0336, B:29:0x033a), top: B:13:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x029c A[Catch: a -> 0x007d, TryCatch #1 {a -> 0x007d, blocks: (B:74:0x0078, B:75:0x0298, B:77:0x029c, B:82:0x02b6), top: B:73:0x0078 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02b6 A[Catch: a -> 0x007d, TRY_LEAVE, TryCatch #1 {a -> 0x007d, blocks: (B:74:0x0078, B:75:0x0298, B:77:0x029c, B:82:0x02b6), top: B:73:0x0078 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    @Override // d2.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object execute(List<? extends d2.g> list, InterfaceC0564d interfaceC0564d) {
        b bVar;
        int i7;
        String str;
        String str2;
        String str3;
        String str4;
        p pVar;
        InterfaceC0546d interfaceC0546d;
        String aliasLabel;
        String aliasValue;
        String jwt;
        String str5;
        p pVar2;
        int i8;
        long sessionTime;
        BigDecimal amountSpent;
        ArrayList arrayList;
        M1.b bVar2;
        int i9;
        List<? extends d2.g> list2 = list;
        if (interfaceC0564d instanceof b) {
            bVar = (b) interfaceC0564d;
            int i10 = bVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.label = i10 - Integer.MIN_VALUE;
                b bVar3 = bVar;
                Object obj = bVar3.result;
                Object obj2 = EnumC0580a.f5697f;
                i7 = bVar3.label;
                int i11 = 1;
                if (i7 != 0) {
                    AbstractC0676f.w(obj);
                    com.onesignal.debug.internal.logging.b.log(i2.c.DEBUG, "UpdateUserOperationExecutor(operation: " + list2 + ')');
                    C0548f c0548f = new C0548f(null, null, null, null, null, null, 63, null);
                    str = null;
                    C0547e c0547e = new C0547e(null, null, null, null, 15, null);
                    Iterator<? extends d2.g> it = list2.iterator();
                    C0547e c0547e2 = c0547e;
                    String str6 = null;
                    boolean z5 = 0;
                    C0548f c0548f2 = c0548f;
                    while (it.hasNext()) {
                        d2.g next = it.next();
                        if (next instanceof s3.k) {
                            if (str == null) {
                                s3.k kVar = (s3.k) next;
                                str = kVar.getAppId();
                                str6 = kVar.getOnesignalId();
                            }
                            c0548f2 = k.INSTANCE.createPropertiesFromOperation((s3.k) next, c0548f2);
                        } else if (next instanceof s3.d) {
                            if (str == null) {
                                s3.d dVar = (s3.d) next;
                                str = dVar.getAppId();
                                str6 = dVar.getOnesignalId();
                            }
                            c0548f2 = k.INSTANCE.createPropertiesFromOperation((s3.d) next, c0548f2);
                        } else if (next instanceof s3.j) {
                            if (str == null) {
                                s3.j jVar = (s3.j) next;
                                str = jVar.getAppId();
                                str6 = jVar.getOnesignalId();
                            }
                            c0548f2 = k.INSTANCE.createPropertiesFromOperation((s3.j) next, c0548f2);
                        } else if (next instanceof s3.o) {
                            if (str == null) {
                                s3.o oVar = (s3.o) next;
                                str = oVar.getAppId();
                                str6 = oVar.getOnesignalId();
                            }
                            if (c0547e2.getSessionCount() != null) {
                                Integer sessionCount = c0547e2.getSessionCount();
                                kotlin.jvm.internal.i.b(sessionCount);
                                i8 = sessionCount.intValue() + i11;
                            } else {
                                i8 = i11;
                            }
                            c0547e2 = new C0547e(c0547e2.getSessionTime(), new Integer(i8), c0547e2.getAmountSpent(), c0547e2.getPurchases());
                            z5 = i11;
                        } else if (next instanceof s3.n) {
                            if (str == null) {
                                s3.n nVar = (s3.n) next;
                                str = nVar.getAppId();
                                str6 = nVar.getOnesignalId();
                            }
                            if (c0547e2.getSessionTime() != null) {
                                Long sessionTime2 = c0547e2.getSessionTime();
                                kotlin.jvm.internal.i.b(sessionTime2);
                                sessionTime = ((s3.n) next).getSessionTime() + sessionTime2.longValue();
                            } else {
                                sessionTime = ((s3.n) next).getSessionTime();
                            }
                            c0547e2 = new C0547e(new Long(sessionTime), c0547e2.getSessionCount(), c0547e2.getAmountSpent(), c0547e2.getPurchases());
                        } else {
                            if (!(next instanceof s3.m)) {
                                throw new Exception("Unrecognized operation: " + next);
                            }
                            if (str == null) {
                                s3.m mVar = (s3.m) next;
                                str = mVar.getAppId();
                                str6 = mVar.getOnesignalId();
                            }
                            if (c0547e2.getAmountSpent() != null) {
                                BigDecimal amountSpent2 = c0547e2.getAmountSpent();
                                kotlin.jvm.internal.i.b(amountSpent2);
                                amountSpent = amountSpent2.add(((s3.m) next).getAmountSpent());
                                kotlin.jvm.internal.i.d(amountSpent, "add(...)");
                            } else {
                                amountSpent = ((s3.m) next).getAmountSpent();
                            }
                            if (c0547e2.getPurchases() != null) {
                                List<C0549g> purchases = c0547e2.getPurchases();
                                kotlin.jvm.internal.i.b(purchases);
                                arrayList = AbstractC0506j.Q(purchases);
                            } else {
                                arrayList = new ArrayList();
                            }
                            for (s3.g gVar : ((s3.m) next).getPurchases()) {
                                arrayList.add(new C0549g(gVar.getSku(), gVar.getIso(), gVar.getAmount()));
                                it = it;
                            }
                            c0547e2 = new C0547e(c0547e2.getSessionTime(), c0547e2.getSessionCount(), amountSpent, arrayList);
                            it = it;
                            i11 = 1;
                        }
                    }
                    if (str != null && str6 != null) {
                        f resolveBackendParams = c.resolveBackendParams((d2.g) AbstractC0506j.E(list2), str6, this._jwtTokenStore, this._identityVerificationService);
                        try {
                            interfaceC0546d = this._userBackend;
                            aliasLabel = resolveBackendParams.getAliasLabel();
                            aliasValue = resolveBackendParams.getAliasValue();
                            jwt = resolveBackendParams.getJwt();
                            bVar3.L$0 = this;
                            bVar3.L$1 = list2;
                            bVar3.L$2 = str;
                            bVar3.L$3 = str6;
                            bVar3.label = 1;
                            str2 = str6;
                        } catch (P1.a e4) {
                            e = e4;
                            str2 = str6;
                        }
                        try {
                            Object updateUser = interfaceC0546d.updateUser(str, aliasLabel, aliasValue, c0548f2, z5, c0547e2, jwt, bVar3);
                            if (updateUser != obj2) {
                                str5 = str2;
                                obj = updateUser;
                                pVar2 = this;
                            }
                            return obj2;
                        } catch (P1.a e7) {
                            e = e7;
                            str3 = str2;
                            str4 = str;
                            pVar = this;
                            i9 = q.$EnumSwitchMapping$0[com.onesignal.common.g.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                            if (i9 == 1) {
                            }
                        }
                    }
                    return new C0317a(d2.b.SUCCESS, null, null, null, 14, null);
                }
                if (i7 != 1) {
                    if (i7 == 2) {
                        str3 = (String) bVar3.L$3;
                        str4 = (String) bVar3.L$2;
                        list2 = (List) bVar3.L$1;
                        pVar = (p) bVar3.L$0;
                    } else {
                        if (i7 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        str3 = (String) bVar3.L$3;
                        str4 = (String) bVar3.L$2;
                        list2 = (List) bVar3.L$1;
                        pVar = (p) bVar3.L$0;
                    }
                    try {
                        AbstractC0676f.w(obj);
                        if (kotlin.jvm.internal.i.a(((C0617a) pVar._identityModelStore.getModel()).getOnesignalId(), str3)) {
                            for (d2.g gVar2 : list2) {
                                if (gVar2 instanceof s3.k) {
                                    com.onesignal.common.modeling.i.setStringProperty$default(((com.onesignal.user.internal.properties.a) pVar._propertiesModelStore.getModel()).getTags(), ((s3.k) gVar2).getKey(), ((s3.k) gVar2).getValue(), "HYDRATE", false, 8, null);
                                } else if (gVar2 instanceof s3.d) {
                                    com.onesignal.common.modeling.i.setOptStringProperty$default(((com.onesignal.user.internal.properties.a) pVar._propertiesModelStore.getModel()).getTags(), ((s3.d) gVar2).getKey(), null, "HYDRATE", false, 8, null);
                                } else if (gVar2 instanceof s3.j) {
                                    com.onesignal.common.modeling.i.setOptAnyProperty$default(pVar._propertiesModelStore.getModel(), ((s3.j) gVar2).getProperty(), ((s3.j) gVar2).getValue(), "HYDRATE", false, 8, null);
                                }
                            }
                        }
                        return new C0317a(d2.b.SUCCESS, null, null, null, 14, null);
                    } catch (P1.a e8) {
                        e = e8;
                        i9 = q.$EnumSwitchMapping$0[com.onesignal.common.g.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                        if (i9 == 1) {
                        }
                    }
                } else {
                    str5 = (String) bVar3.L$3;
                    str = (String) bVar3.L$2;
                    list2 = (List) bVar3.L$1;
                    pVar2 = (p) bVar3.L$0;
                    try {
                        AbstractC0676f.w(obj);
                    } catch (P1.a e9) {
                        e = e9;
                        str3 = str5;
                        str4 = str;
                        pVar = pVar2;
                        i9 = q.$EnumSwitchMapping$0[com.onesignal.common.g.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                        if (i9 == 1) {
                            return new C0317a(d2.b.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                        }
                        if (i9 == 2) {
                            return new C0317a(d2.b.FAIL_UNAUTHORIZED, null, null, e.getRetryAfterSeconds(), 6, null);
                        }
                        if (i9 != 3) {
                            return new C0317a(d2.b.FAIL_NORETRY, null, null, null, 14, null);
                        }
                        if (e.getStatusCode() == 404 && pVar._newRecordState.isInMissingRetryWindow(str3)) {
                            return new C0317a(d2.b.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                        }
                        List<d2.g> rebuildOperationsIfCurrentUser = pVar._buildUserService.getRebuildOperationsIfCurrentUser(str4, str3);
                        return rebuildOperationsIfCurrentUser == null ? new C0317a(d2.b.FAIL_NORETRY, null, null, null, 14, null) : new C0317a(d2.b.FAIL_RETRY, null, rebuildOperationsIfCurrentUser, e.getRetryAfterSeconds(), 2, null);
                    }
                }
                bVar2 = (M1.b) obj;
                if (bVar2 == null) {
                    O1.c cVar = pVar2._consistencyManager;
                    N1.a aVar = N1.a.USER;
                    bVar3.L$0 = pVar2;
                    bVar3.L$1 = list2;
                    bVar3.L$2 = str;
                    bVar3.L$3 = str5;
                    bVar3.label = 2;
                    if (cVar.setRywData(str5, aVar, bVar2, bVar3) == obj2) {
                        return obj2;
                    }
                    str3 = str5;
                    str4 = str;
                    pVar = pVar2;
                } else {
                    O1.c cVar2 = pVar2._consistencyManager;
                    bVar3.L$0 = pVar2;
                    bVar3.L$1 = list2;
                    bVar3.L$2 = str;
                    bVar3.L$3 = str5;
                    bVar3.label = 3;
                }
                if (kotlin.jvm.internal.i.a(((C0617a) pVar._identityModelStore.getModel()).getOnesignalId(), str3)) {
                }
                return new C0317a(d2.b.SUCCESS, null, null, null, 14, null);
            }
        }
        bVar = new b(interfaceC0564d);
        b bVar32 = bVar;
        Object obj3 = bVar32.result;
        Object obj22 = EnumC0580a.f5697f;
        i7 = bVar32.label;
        int i112 = 1;
        if (i7 != 0) {
        }
        bVar2 = (M1.b) obj3;
        if (bVar2 == null) {
        }
        if (kotlin.jvm.internal.i.a(((C0617a) pVar._identityModelStore.getModel()).getOnesignalId(), str3)) {
        }
        return new C0317a(d2.b.SUCCESS, null, null, null, 14, null);
    }

    @Override // d2.d
    public List<String> getOperations() {
        return AbstractC0507k.z(SET_TAG, DELETE_TAG, SET_PROPERTY, TRACK_SESSION_START, TRACK_SESSION_END, TRACK_PURCHASE);
    }
}
