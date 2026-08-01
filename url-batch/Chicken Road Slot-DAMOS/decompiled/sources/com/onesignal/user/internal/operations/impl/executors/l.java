package com.onesignal.user.internal.operations.impl.executors;

import a2.r;
import android.os.Build;
import com.onesignal.common.AndroidUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.i0;
import kotlin.collections.o0;
import kotlin.collections.x;
import kotlin.collections.y;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import zc.p;
import zc.q;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class l implements na.d {
    public static final String CREATE_SUBSCRIPTION = "create-subscription";
    public static final a Companion = new a(null);
    public static final String DELETE_SUBSCRIPTION = "delete-subscription";
    public static final String TRANSFER_SUBSCRIPTION = "transfer-subscription";
    public static final String UPDATE_SUBSCRIPTION = "update-subscription";
    private final ea.f _applicationService;
    private final vc.a _buildUserService;
    private final com.onesignal.core.internal.config.b _configModelStore;
    private final y9.c _consistencyManager;
    private final ja.c _deviceService;
    private final bd.a _newRecordState;
    private final uc.c _subscriptionBackend;
    private final dd.e _subscriptionModelStore;

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class b extends nd.c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public b(ld.a aVar) {
            super(aVar);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return l.this.createSubscription(null, null, this);
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class c extends nd.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public c(ld.a aVar) {
            super(aVar);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return l.this.deleteSubscription(null, this);
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class d extends nd.c {
        int label;
        /* synthetic */ Object result;

        public d(ld.a aVar) {
            super(aVar);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return l.this.transferSubscription(null, this);
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class e extends nd.c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public e(ld.a aVar) {
            super(aVar);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return l.this.updateSubscription(null, null, this);
        }
    }

    public l(uc.c cVar, ja.c cVar2, ea.f fVar, dd.e eVar, com.onesignal.core.internal.config.b bVar, vc.a aVar, bd.a aVar2, y9.c cVar3) {
        cVar.getClass();
        cVar2.getClass();
        fVar.getClass();
        eVar.getClass();
        bVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        cVar3.getClass();
        this._subscriptionBackend = cVar;
        this._deviceService = cVar2;
        this._applicationService = fVar;
        this._subscriptionModelStore = eVar;
        this._configModelStore = bVar;
        this._buildUserService = aVar;
        this._newRecordState = aVar2;
        this._consistencyManager = cVar3;
    }

    private final uc.j convert(dd.g gVar) {
        int i3 = m.$EnumSwitchMapping$1[gVar.ordinal()];
        return i3 != 1 ? i3 != 2 ? uc.j.Companion.fromDeviceType(this._deviceService.getDeviceType()) : uc.j.EMAIL : uc.j.SMS;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01b5, code lost:
    
        if (r0.resolveConditionsWithID(w9.a.ID, r9) == r3) goto L86;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01c7 A[Catch: a -> 0x0042, TryCatch #1 {a -> 0x0042, blocks: (B:14:0x003d, B:16:0x01b8, B:18:0x01c7, B:19:0x01d4, B:21:0x01ea, B:22:0x01f5), top: B:13:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01ea A[Catch: a -> 0x0042, TryCatch #1 {a -> 0x0042, blocks: (B:14:0x003d, B:16:0x01b8, B:18:0x01c7, B:19:0x01d4, B:21:0x01ea, B:22:0x01f5), top: B:13:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x016c A[Catch: a -> 0x017d, TryCatch #3 {a -> 0x017d, blocks: (B:64:0x0168, B:66:0x016c, B:68:0x0180, B:70:0x018a, B:75:0x01a5), top: B:63:0x0168 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0180 A[Catch: a -> 0x017d, TryCatch #3 {a -> 0x017d, blocks: (B:64:0x0168, B:66:0x016c, B:68:0x0180, B:70:0x018a, B:75:0x01a5), top: B:63:0x0168 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createSubscription(zc.a aVar, List<? extends na.g> list, ld.a aVar2) {
        b bVar;
        int i3;
        na.g gVar;
        String address;
        dd.f status;
        zc.a aVar3;
        l lVar;
        Object createSubscription;
        Pair pair;
        zc.a aVar4;
        String str;
        int i10;
        dd.d dVar;
        try {
            if (aVar2 instanceof b) {
                bVar = (b) aVar2;
                int i11 = bVar.label;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    bVar.label = i11 - Integer.MIN_VALUE;
                    b bVar2 = bVar;
                    Object obj = bVar2.result;
                    md.a aVar5 = md.a.f6622d;
                    i3 = bVar2.label;
                    if (i3 != 0) {
                        cf.c.M(obj);
                        if (list == null || !list.isEmpty()) {
                            Iterator<T> it = list.iterator();
                            while (it.hasNext()) {
                                if (((na.g) it.next()) instanceof zc.c) {
                                    return new na.a(na.b.SUCCESS, null, null, null, 14, null);
                                }
                            }
                        }
                        ListIterator<? extends na.g> listIterator = list.listIterator(list.size());
                        while (true) {
                            if (!listIterator.hasPrevious()) {
                                gVar = null;
                                break;
                            }
                            gVar = listIterator.previous();
                            if (gVar instanceof q) {
                                break;
                            }
                        }
                        q qVar = (q) gVar;
                        boolean enabled = qVar != null ? qVar.getEnabled() : aVar.getEnabled();
                        if (qVar == null || (address = qVar.getAddress()) == null) {
                            address = aVar.getAddress();
                        }
                        String str2 = address;
                        if (qVar == null || (status = qVar.getStatus()) == null) {
                            status = aVar.getStatus();
                        }
                        String subscriptionId = com.onesignal.common.d.INSTANCE.isLocalId(aVar.getSubscriptionId()) ? null : aVar.getSubscriptionId();
                        try {
                            uc.j convert = convert(aVar.getType());
                            Boolean valueOf = Boolean.valueOf(enabled);
                            Integer num = new Integer(status.getValue());
                            String sdkVersion = com.onesignal.common.h.INSTANCE.getSdkVersion();
                            String str3 = Build.MODEL;
                            String str4 = Build.VERSION.RELEASE;
                            Boolean valueOf2 = Boolean.valueOf(com.onesignal.common.j.INSTANCE.isRooted());
                            com.onesignal.common.c cVar = com.onesignal.common.c.INSTANCE;
                            uc.h hVar = new uc.h(subscriptionId, convert, str2, valueOf, num, sdkVersion, str3, str4, valueOf2, cVar.getNetType(this._applicationService.getAppContext()), cVar.getCarrierName(this._applicationService.getAppContext()), AndroidUtils.INSTANCE.getAppVersion(this._applicationService.getAppContext()));
                            uc.c cVar2 = this._subscriptionBackend;
                            String appId = aVar.getAppId();
                            String onesignalId = aVar.getOnesignalId();
                            bVar2.L$0 = this;
                            aVar3 = aVar;
                            try {
                                bVar2.L$1 = aVar3;
                                bVar2.label = 1;
                                createSubscription = cVar2.createSubscription(appId, "onesignal_id", onesignalId, hVar, bVar2);
                                if (createSubscription != aVar5) {
                                    lVar = this;
                                }
                                return aVar5;
                            } catch (z9.a e2) {
                                e = e2;
                                lVar = this;
                                i10 = m.$EnumSwitchMapping$0[com.onesignal.common.g.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                                if (i10 != 1) {
                                    return new na.a(na.b.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                                }
                                if (i10 == 2 || i10 == 3) {
                                    return new na.a(na.b.FAIL_NORETRY, null, null, null, 14, null);
                                }
                                if (i10 == 4) {
                                    return new na.a(na.b.FAIL_UNAUTHORIZED, null, null, e.getRetryAfterSeconds(), 6, null);
                                }
                                if (i10 != 5) {
                                    r.p();
                                    return null;
                                }
                                if (e.getStatusCode() == 404 && lVar._newRecordState.isInMissingRetryWindow(aVar3.getOnesignalId())) {
                                    return new na.a(na.b.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                                }
                                List<na.g> rebuildOperationsIfCurrentUser = lVar._buildUserService.getRebuildOperationsIfCurrentUser(aVar3.getAppId(), aVar3.getOnesignalId());
                                return rebuildOperationsIfCurrentUser == null ? new na.a(na.b.FAIL_NORETRY, null, null, null, 14, null) : new na.a(na.b.FAIL_RETRY, null, rebuildOperationsIfCurrentUser, e.getRetryAfterSeconds(), 2, null);
                            }
                        } catch (z9.a e9) {
                            e = e9;
                            aVar3 = aVar;
                        }
                    } else if (i3 != 1) {
                        if (i3 == 2) {
                            str = (String) bVar2.L$2;
                            aVar4 = (zc.a) bVar2.L$1;
                            lVar = (l) bVar2.L$0;
                        } else {
                            if (i3 != 3) {
                                i0.l("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            str = (String) bVar2.L$2;
                            aVar4 = (zc.a) bVar2.L$1;
                            lVar = (l) bVar2.L$0;
                        }
                        try {
                            cf.c.M(obj);
                            String str5 = str;
                            dVar = (dd.d) lVar._subscriptionModelStore.get(aVar4.getSubscriptionId());
                            if (dVar != null) {
                                com.onesignal.common.modeling.i.setStringProperty$default(dVar, "id", str5, "HYDRATE", false, 8, null);
                            }
                            if (Intrinsics.a(((com.onesignal.core.internal.config.a) lVar._configModelStore.getModel()).getPushSubscriptionId(), aVar4.getSubscriptionId())) {
                                ((com.onesignal.core.internal.config.a) lVar._configModelStore.getModel()).setPushSubscriptionId(str5);
                            }
                            return new na.a(na.b.SUCCESS, o0.b(new Pair(aVar4.getSubscriptionId(), str5)), null, null, 12, null);
                        } catch (z9.a e10) {
                            e = e10;
                            aVar3 = aVar4;
                            i10 = m.$EnumSwitchMapping$0[com.onesignal.common.g.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                            if (i10 != 1) {
                            }
                        }
                    } else {
                        zc.a aVar6 = (zc.a) bVar2.L$1;
                        l lVar2 = (l) bVar2.L$0;
                        try {
                            cf.c.M(obj);
                            createSubscription = obj;
                            aVar3 = aVar6;
                            lVar = lVar2;
                        } catch (z9.a e11) {
                            e = e11;
                            aVar3 = aVar6;
                            lVar = lVar2;
                            i10 = m.$EnumSwitchMapping$0[com.onesignal.common.g.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                            if (i10 != 1) {
                            }
                        }
                    }
                    pair = (Pair) createSubscription;
                    if (pair != null) {
                        return new na.a(na.b.SUCCESS, null, null, null, 14, null);
                    }
                    String str6 = (String) pair.f5552d;
                    w9.b bVar3 = (w9.b) pair.f5553e;
                    if (bVar3 != null) {
                        y9.c cVar3 = lVar._consistencyManager;
                        String onesignalId2 = aVar3.getOnesignalId();
                        x9.a aVar7 = x9.a.SUBSCRIPTION;
                        bVar2.L$0 = lVar;
                        bVar2.L$1 = aVar3;
                        bVar2.L$2 = str6;
                        bVar2.label = 2;
                        if (cVar3.setRywData(onesignalId2, aVar7, bVar3, bVar2) == aVar5) {
                            return aVar5;
                        }
                        aVar4 = aVar3;
                        str = str6;
                    } else {
                        y9.c cVar4 = lVar._consistencyManager;
                        bVar2.L$0 = lVar;
                        bVar2.L$1 = aVar3;
                        bVar2.L$2 = str6;
                        bVar2.label = 3;
                    }
                    String str52 = str;
                    dVar = (dd.d) lVar._subscriptionModelStore.get(aVar4.getSubscriptionId());
                    if (dVar != null) {
                    }
                    if (Intrinsics.a(((com.onesignal.core.internal.config.a) lVar._configModelStore.getModel()).getPushSubscriptionId(), aVar4.getSubscriptionId())) {
                    }
                    return new na.a(na.b.SUCCESS, o0.b(new Pair(aVar4.getSubscriptionId(), str52)), null, null, 12, null);
                }
            }
            pair = (Pair) createSubscription;
            if (pair != null) {
            }
        } catch (z9.a e12) {
            e = e12;
            i10 = m.$EnumSwitchMapping$0[com.onesignal.common.g.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
            if (i10 != 1) {
            }
        }
        bVar = new b(aVar2);
        b bVar22 = bVar;
        Object obj2 = bVar22.result;
        md.a aVar52 = md.a.f6622d;
        i3 = bVar22.label;
        if (i3 != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object deleteSubscription(zc.c cVar, ld.a aVar) {
        c cVar2;
        int i3;
        z9.a aVar2;
        l lVar;
        int i10;
        List f3;
        if (aVar instanceof c) {
            cVar2 = (c) aVar;
            int i11 = cVar2.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cVar2.label = i11 - Integer.MIN_VALUE;
                Object obj = cVar2.result;
                md.a aVar3 = md.a.f6622d;
                i3 = cVar2.label;
                if (i3 != 0) {
                    cf.c.M(obj);
                    try {
                        uc.c cVar3 = this._subscriptionBackend;
                        String appId = cVar.getAppId();
                        String subscriptionId = cVar.getSubscriptionId();
                        cVar2.L$0 = this;
                        cVar2.L$1 = cVar;
                        cVar2.label = 1;
                        if (cVar3.deleteSubscription(appId, subscriptionId, cVar2) == aVar3) {
                            return aVar3;
                        }
                        lVar = this;
                    } catch (z9.a e2) {
                        aVar2 = e2;
                        lVar = this;
                        i10 = m.$EnumSwitchMapping$0[com.onesignal.common.g.INSTANCE.getResponseStatusType(aVar2.getStatusCode()).ordinal()];
                        if (i10 != 1) {
                        }
                    }
                } else {
                    if (i3 != 1) {
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cVar = (zc.c) cVar2.L$1;
                    lVar = (l) cVar2.L$0;
                    try {
                        cf.c.M(obj);
                    } catch (z9.a e9) {
                        aVar2 = e9;
                        i10 = m.$EnumSwitchMapping$0[com.onesignal.common.g.INSTANCE.getResponseStatusType(aVar2.getStatusCode()).ordinal()];
                        if (i10 != 1) {
                            return new na.a(na.b.FAIL_RETRY, null, null, aVar2.getRetryAfterSeconds(), 6, null);
                        }
                        if (i10 != 5) {
                            return new na.a(na.b.FAIL_NORETRY, null, null, null, 14, null);
                        }
                        if (aVar2.getStatusCode() == 404 && ((f3 = y.f(cVar.getOnesignalId(), cVar.getSubscriptionId())) == null || !f3.isEmpty())) {
                            Iterator it = f3.iterator();
                            while (it.hasNext()) {
                                if (lVar._newRecordState.isInMissingRetryWindow((String) it.next())) {
                                    return new na.a(na.b.FAIL_RETRY, null, null, aVar2.getRetryAfterSeconds(), 6, null);
                                }
                            }
                        }
                        return new na.a(na.b.SUCCESS, null, null, null, 14, null);
                    }
                }
                lVar._subscriptionModelStore.remove(cVar.getSubscriptionId(), "HYDRATE");
                return new na.a(na.b.SUCCESS, null, null, null, 14, null);
            }
        }
        cVar2 = new c(aVar);
        Object obj2 = cVar2.result;
        md.a aVar32 = md.a.f6622d;
        i3 = cVar2.label;
        if (i3 != 0) {
        }
        lVar._subscriptionModelStore.remove(cVar.getSubscriptionId(), "HYDRATE");
        return new na.a(na.b.SUCCESS, null, null, null, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object transferSubscription(p pVar, ld.a aVar) {
        d dVar;
        int i3;
        int i10;
        try {
            if (aVar instanceof d) {
                dVar = (d) aVar;
                int i11 = dVar.label;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    dVar.label = i11 - Integer.MIN_VALUE;
                    d dVar2 = dVar;
                    Object obj = dVar2.result;
                    md.a aVar2 = md.a.f6622d;
                    i3 = dVar2.label;
                    i10 = 1;
                    if (i3 != 0) {
                        cf.c.M(obj);
                        uc.c cVar = this._subscriptionBackend;
                        String appId = pVar.getAppId();
                        String subscriptionId = pVar.getSubscriptionId();
                        String onesignalId = pVar.getOnesignalId();
                        dVar2.label = 1;
                        if (cVar.transferSubscription(appId, subscriptionId, "onesignal_id", onesignalId, dVar2) == aVar2) {
                            return aVar2;
                        }
                    } else {
                        if (i3 != 1) {
                            i0.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        cf.c.M(obj);
                    }
                    i10 = 0;
                    return new na.a(na.b.SUCCESS, null, null, null, 14, null);
                }
            }
            if (i3 != 0) {
            }
            i10 = 0;
            return new na.a(na.b.SUCCESS, null, null, null, 14, null);
        } catch (z9.a e2) {
            return m.$EnumSwitchMapping$0[com.onesignal.common.g.INSTANCE.getResponseStatusType(e2.getStatusCode()).ordinal()] == i10 ? new na.a(na.b.FAIL_RETRY, null, null, e2.getRetryAfterSeconds(), 6, null) : new na.a(na.b.FAIL_NORETRY, null, null, null, 14, null);
        }
        dVar = new d(aVar);
        d dVar22 = dVar;
        Object obj2 = dVar22.result;
        md.a aVar22 = md.a.f6622d;
        i3 = dVar22.label;
        i10 = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x010d, code lost:
    
        if (r0.resolveConditionsWithID(w9.a.ID, r2) == r3) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e6 A[Catch: a -> 0x0055, TryCatch #0 {a -> 0x0055, blocks: (B:49:0x0050, B:50:0x00e1, B:52:0x00e6, B:56:0x00fd), top: B:48:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00fd A[Catch: a -> 0x0055, TRY_LEAVE, TryCatch #0 {a -> 0x0055, blocks: (B:49:0x0050, B:50:0x00e1, B:52:0x00e6, B:56:0x00fd), top: B:48:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object updateSubscription(q qVar, List<? extends na.g> list, ld.a aVar) {
        e eVar;
        int i3;
        q qVar2;
        l lVar;
        q qVar3;
        l lVar2;
        q qVar4;
        w9.b bVar;
        List f3;
        if (aVar instanceof e) {
            eVar = (e) aVar;
            int i10 = eVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.label = i10 - Integer.MIN_VALUE;
                Object obj = eVar.result;
                md.a aVar2 = md.a.f6622d;
                i3 = eVar.label;
                if (i3 == 0) {
                    if (i3 == 1) {
                        qVar2 = (q) eVar.L$2;
                        qVar4 = (q) eVar.L$1;
                        lVar2 = (l) eVar.L$0;
                        try {
                            cf.c.M(obj);
                        } catch (z9.a e2) {
                            e = e2;
                            qVar3 = qVar2;
                            lVar = lVar2;
                        }
                    } else {
                        if (i3 != 2 && i3 != 3) {
                            i0.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qVar3 = (q) eVar.L$1;
                        lVar = (l) eVar.L$0;
                        try {
                            cf.c.M(obj);
                            return new na.a(na.b.SUCCESS, null, null, null, 14, null);
                        } catch (z9.a e9) {
                            e = e9;
                        }
                    }
                    int i11 = m.$EnumSwitchMapping$0[com.onesignal.common.g.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                    if (i11 == 1) {
                        return new na.a(na.b.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                    }
                    if (i11 != 5) {
                        return new na.a(na.b.FAIL_NORETRY, null, null, null, 14, null);
                    }
                    if (e.getStatusCode() == 404 && ((f3 = y.f(qVar3.getOnesignalId(), qVar3.getSubscriptionId())) == null || !f3.isEmpty())) {
                        Iterator it = f3.iterator();
                        while (it.hasNext()) {
                            if (lVar._newRecordState.isInMissingRetryWindow((String) it.next())) {
                                return new na.a(na.b.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                            }
                        }
                    }
                    return new na.a(na.b.FAIL_NORETRY, null, x.c(new zc.a(qVar3.getAppId(), qVar3.getOnesignalId(), qVar3.getSubscriptionId(), qVar3.getType(), qVar3.getEnabled(), qVar3.getAddress(), qVar3.getStatus())), null, 10, null);
                }
                cf.c.M(obj);
                Object C = CollectionsKt.C(list);
                C.getClass();
                qVar2 = (q) C;
                try {
                    uc.j convert = convert(qVar2.getType());
                    String address = qVar2.getAddress();
                    Boolean valueOf = Boolean.valueOf(qVar2.getEnabled());
                    Integer num = new Integer(qVar2.getStatus().getValue());
                    String sdkVersion = com.onesignal.common.h.INSTANCE.getSdkVersion();
                    String str = Build.MODEL;
                    String str2 = Build.VERSION.RELEASE;
                    Boolean valueOf2 = Boolean.valueOf(com.onesignal.common.j.INSTANCE.isRooted());
                    com.onesignal.common.c cVar = com.onesignal.common.c.INSTANCE;
                    uc.h hVar = new uc.h(null, convert, address, valueOf, num, sdkVersion, str, str2, valueOf2, cVar.getNetType(this._applicationService.getAppContext()), cVar.getCarrierName(this._applicationService.getAppContext()), AndroidUtils.INSTANCE.getAppVersion(this._applicationService.getAppContext()));
                    uc.c cVar2 = this._subscriptionBackend;
                    String appId = qVar2.getAppId();
                    String subscriptionId = qVar2.getSubscriptionId();
                    eVar.L$0 = this;
                    eVar.L$1 = qVar;
                    eVar.L$2 = qVar2;
                    eVar.label = 1;
                    obj = cVar2.updateSubscription(appId, subscriptionId, hVar, eVar);
                    if (obj != aVar2) {
                        lVar2 = this;
                        qVar4 = qVar;
                    }
                    return aVar2;
                } catch (z9.a e10) {
                    e = e10;
                    lVar = this;
                    qVar3 = qVar2;
                }
                bVar = (w9.b) obj;
                if (bVar == null) {
                    y9.c cVar3 = lVar2._consistencyManager;
                    String onesignalId = qVar4.getOnesignalId();
                    x9.a aVar3 = x9.a.SUBSCRIPTION;
                    eVar.L$0 = lVar2;
                    eVar.L$1 = qVar2;
                    eVar.L$2 = null;
                    eVar.label = 2;
                    if (cVar3.setRywData(onesignalId, aVar3, bVar, eVar) == aVar2) {
                        return aVar2;
                    }
                    return new na.a(na.b.SUCCESS, null, null, null, 14, null);
                }
                y9.c cVar4 = lVar2._consistencyManager;
                eVar.L$0 = lVar2;
                eVar.L$1 = qVar2;
                eVar.L$2 = null;
                eVar.label = 3;
            }
        }
        eVar = new e(aVar);
        Object obj2 = eVar.result;
        md.a aVar22 = md.a.f6622d;
        i3 = eVar.label;
        if (i3 == 0) {
        }
        bVar = (w9.b) obj2;
        if (bVar == null) {
        }
    }

    @Override // na.d
    public Object execute(List<? extends na.g> list, ld.a aVar) {
        com.onesignal.debug.internal.logging.b.log(ua.c.DEBUG, "SubscriptionOperationExecutor(operations: " + list + ')');
        na.g gVar = (na.g) CollectionsKt.x(list);
        if (gVar instanceof zc.a) {
            return createSubscription((zc.a) gVar, list, aVar);
        }
        if (!list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((na.g) it.next()) instanceof zc.c) {
                    if (list.size() > 1) {
                        r.i(list, "Only supports one operation! Attempted operations:\n");
                        return null;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list) {
                        if (obj instanceof zc.c) {
                            arrayList.add(obj);
                        }
                    }
                    return deleteSubscription((zc.c) CollectionsKt.x(arrayList), aVar);
                }
            }
        }
        if (gVar instanceof q) {
            return updateSubscription((q) gVar, list, aVar);
        }
        if (!(gVar instanceof p)) {
            r.i(gVar, "Unrecognized operation: ");
            return null;
        }
        if (list.size() <= 1) {
            return transferSubscription((p) gVar, aVar);
        }
        r.i(list, "TransferSubscriptionOperation only supports one operation! Attempted operations:\n");
        return null;
    }

    @Override // na.d
    public List<String> getOperations() {
        return y.f(CREATE_SUBSCRIPTION, UPDATE_SUBSCRIPTION, DELETE_SUBSCRIPTION, TRANSFER_SUBSCRIPTION);
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
