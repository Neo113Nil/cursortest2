package com.onesignal.session.internal.outcomes.impl;

import com.onesignal.common.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import r2.C0846a;

/* loaded from: classes.dex */
public final class i implements L3.b, com.onesignal.core.internal.startup.b, N3.a {
    private final com.onesignal.core.internal.config.c _configModelStore;
    private final A2.c _deviceService;
    private final T3.b _identityModelStore;
    private final J3.a _influenceManager;
    private final com.onesignal.session.internal.outcomes.impl.b _outcomeEventsBackend;
    private final com.onesignal.session.internal.outcomes.impl.d _outcomeEventsCache;
    private final com.onesignal.session.internal.outcomes.impl.c _outcomeEventsPreferences;
    private final N3.b _session;
    private final Y3.b _subscriptionManager;
    private final I2.a _time;
    private Set<String> unattributedUniqueOutcomeEventsSentOnSession;

    public static final class a extends X5.c {
        int label;
        /* synthetic */ Object result;

        public a(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return i.this.getUniqueIds(null, null, this);
        }
    }

    public static final class b extends X5.j implements Function1 {
        final /* synthetic */ com.onesignal.session.internal.outcomes.impl.f $eventParams;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.onesignal.session.internal.outcomes.impl.f fVar, V5.b bVar) {
            super(1, bVar);
            this.$eventParams = fVar;
        }

        @Override // X5.a
        public final V5.b create(V5.b bVar) {
            return i.this.new b(this.$eventParams, bVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(V5.b bVar) {
            return ((b) create(bVar)).invokeSuspend(Unit.f6114a);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            int i2 = this.label;
            if (i2 == 0) {
                V6.b.P(obj);
                com.onesignal.session.internal.outcomes.impl.d dVar = i.this._outcomeEventsCache;
                com.onesignal.session.internal.outcomes.impl.f fVar = this.$eventParams;
                this.label = 1;
                if (dVar.saveUniqueOutcomeEventParams(fVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                V6.b.P(obj);
            }
            return Unit.f6114a;
        }
    }

    public static final class c extends X5.c {
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public c(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return i.this.sendAndCreateOutcomeEvent(null, 0.0f, 0L, null, this);
        }
    }

    public static final class d extends X5.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public d(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return i.this.sendSavedOutcomeEvent(null, this);
        }
    }

    public static final class e extends X5.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public e(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return i.this.sendSavedOutcomes(this);
        }
    }

    public static final class f extends X5.c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public f(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return i.this.sendUniqueOutcomeEvent(null, null, this);
        }
    }

    public static final class g extends X5.j implements Function1 {
        int label;

        public g(V5.b bVar) {
            super(1, bVar);
        }

        @Override // X5.a
        public final V5.b create(V5.b bVar) {
            return i.this.new g(bVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(V5.b bVar) {
            return ((g) create(bVar)).invokeSuspend(Unit.f6114a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
        
            if (r5.cleanCachedUniqueOutcomeEventNotifications(r4) == r0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0027, code lost:
        
            if (r5.sendSavedOutcomes(r4) == r0) goto L15;
         */
        @Override // X5.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            int i2 = this.label;
            if (i2 == 0) {
                V6.b.P(obj);
                i iVar = i.this;
                this.label = 1;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    V6.b.P(obj);
                    return Unit.f6114a;
                }
                V6.b.P(obj);
            }
            com.onesignal.session.internal.outcomes.impl.d dVar = i.this._outcomeEventsCache;
            this.label = 2;
        }
    }

    public i(N3.b _session, J3.a _influenceManager, com.onesignal.session.internal.outcomes.impl.d _outcomeEventsCache, com.onesignal.session.internal.outcomes.impl.c _outcomeEventsPreferences, com.onesignal.session.internal.outcomes.impl.b _outcomeEventsBackend, com.onesignal.core.internal.config.c _configModelStore, T3.b _identityModelStore, Y3.b _subscriptionManager, A2.c _deviceService, I2.a _time) {
        Intrinsics.checkNotNullParameter(_session, "_session");
        Intrinsics.checkNotNullParameter(_influenceManager, "_influenceManager");
        Intrinsics.checkNotNullParameter(_outcomeEventsCache, "_outcomeEventsCache");
        Intrinsics.checkNotNullParameter(_outcomeEventsPreferences, "_outcomeEventsPreferences");
        Intrinsics.checkNotNullParameter(_outcomeEventsBackend, "_outcomeEventsBackend");
        Intrinsics.checkNotNullParameter(_configModelStore, "_configModelStore");
        Intrinsics.checkNotNullParameter(_identityModelStore, "_identityModelStore");
        Intrinsics.checkNotNullParameter(_subscriptionManager, "_subscriptionManager");
        Intrinsics.checkNotNullParameter(_deviceService, "_deviceService");
        Intrinsics.checkNotNullParameter(_time, "_time");
        this._session = _session;
        this._influenceManager = _influenceManager;
        this._outcomeEventsCache = _outcomeEventsCache;
        this._outcomeEventsPreferences = _outcomeEventsPreferences;
        this._outcomeEventsBackend = _outcomeEventsBackend;
        this._configModelStore = _configModelStore;
        this._identityModelStore = _identityModelStore;
        this._subscriptionManager = _subscriptionManager;
        this._deviceService = _deviceService;
        this._time = _time;
        this.unattributedUniqueOutcomeEventsSentOnSession = new LinkedHashSet();
        Set<String> unattributedUniqueOutcomeEventsSentByChannel = _outcomeEventsPreferences.getUnattributedUniqueOutcomeEventsSentByChannel();
        this.unattributedUniqueOutcomeEventsSentOnSession = unattributedUniqueOutcomeEventsSentByChannel != null ? CollectionsKt.B(unattributedUniqueOutcomeEventsSentByChannel) : new LinkedHashSet();
        _session.subscribe(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0045 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0047 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getUniqueIds(String str, List<J3.b> list, V5.b bVar) {
        a aVar;
        int i2;
        List list2;
        if (bVar instanceof a) {
            aVar = (a) bVar;
            int i5 = aVar.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                aVar.label = i5 - Integer.MIN_VALUE;
                Object obj = aVar.result;
                W5.a aVar2 = W5.a.f2787d;
                i2 = aVar.label;
                if (i2 != 0) {
                    V6.b.P(obj);
                    com.onesignal.session.internal.outcomes.impl.d dVar = this._outcomeEventsCache;
                    aVar.label = 1;
                    obj = dVar.getNotCachedUniqueInfluencesForOutcome(str, list, aVar);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    V6.b.P(obj);
                }
                list2 = (List) obj;
                if (list2.isEmpty()) {
                    return list2;
                }
                return null;
            }
        }
        aVar = new a(bVar);
        Object obj2 = aVar.result;
        W5.a aVar22 = W5.a.f2787d;
        i2 = aVar.label;
        if (i2 != 0) {
        }
        list2 = (List) obj2;
        if (list2.isEmpty()) {
        }
    }

    private final List<J3.b> removeDisabledInfluences(List<J3.b> list) {
        ArrayList A7 = CollectionsKt.A(list);
        for (J3.b bVar : list) {
            if (bVar.getInfluenceType().isDisabled()) {
                com.onesignal.debug.internal.logging.b.debug$default("OutcomeEventsController.removeDisabledInfluences: Outcomes disabled for channel: " + bVar.getInfluenceChannel(), null, 2, null);
                A7.remove(bVar);
            }
        }
        return A7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object requestMeasureOutcomeEvent(com.onesignal.session.internal.outcomes.impl.f fVar, V5.b bVar) {
        String appId = ((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getAppId();
        String id = this._subscriptionManager.getSubscriptions().getPush().getId();
        String value = P3.j.Companion.fromDeviceType(this._deviceService.getDeviceType()).getValue();
        if (id.length() == 0 || value.length() == 0) {
            throw new C0846a(0, null, null, 6, null);
        }
        com.onesignal.session.internal.outcomes.impl.e fromOutcomeEventParamstoOutcomeEvent = com.onesignal.session.internal.outcomes.impl.e.Companion.fromOutcomeEventParamstoOutcomeEvent(fVar);
        int i2 = h.$EnumSwitchMapping$0[fromOutcomeEventParamstoOutcomeEvent.getSession().ordinal()];
        Object sendOutcomeEvent = this._outcomeEventsBackend.sendOutcomeEvent(appId, ((T3.a) this._identityModelStore.getModel()).getOnesignalId(), id, value, i2 != 1 ? i2 != 2 ? null : Boolean.FALSE : Boolean.TRUE, fromOutcomeEventParamstoOutcomeEvent, bVar);
        return sendOutcomeEvent == W5.a.f2787d ? sendOutcomeEvent : Unit.f6114a;
    }

    private final void saveAttributedUniqueOutcomeNotifications(com.onesignal.session.internal.outcomes.impl.f fVar) {
        com.onesignal.common.threading.b.suspendifyOnIO(new b(fVar, null));
    }

    private final void saveUnattributedUniqueOutcomeEvents() {
        this._outcomeEventsPreferences.setUnattributedUniqueOutcomeEventsSentByChannel(this.unattributedUniqueOutcomeEventsSentOnSession);
    }

    private final void saveUniqueOutcome(com.onesignal.session.internal.outcomes.impl.f fVar) {
        if (fVar.isUnattributed()) {
            saveUnattributedUniqueOutcomeEvents();
        } else {
            saveAttributedUniqueOutcomeNotifications(fVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0183 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0182 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object sendAndCreateOutcomeEvent(String str, float f7, long j, List<J3.b> list, V5.b bVar) {
        c cVar;
        int i2;
        String str2;
        long j7;
        com.onesignal.session.internal.outcomes.impl.f fVar;
        i iVar;
        String str3;
        g.a responseStatusType;
        if (bVar instanceof c) {
            cVar = (c) bVar;
            int i5 = cVar.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                cVar.label = i5 - Integer.MIN_VALUE;
                Object obj = cVar.result;
                W5.a aVar = W5.a.f2787d;
                i2 = cVar.label;
                if (i2 != 0) {
                    V6.b.P(obj);
                    long currentTimeMillis = this._time.getCurrentTimeMillis() / 1000;
                    boolean z7 = false;
                    n nVar = null;
                    n nVar2 = null;
                    for (J3.b bVar2 : list) {
                        int i7 = h.$EnumSwitchMapping$0[bVar2.getInfluenceType().ordinal()];
                        if (i7 == 1) {
                            if (nVar == null) {
                                nVar = new n(null, null, 3, null);
                            }
                            nVar = setSourceChannelIds(bVar2, nVar);
                        } else if (i7 == 2) {
                            if (nVar2 == null) {
                                nVar2 = new n(null, null, 3, null);
                            }
                            nVar2 = setSourceChannelIds(bVar2, nVar2);
                        } else if (i7 == 3) {
                            z7 = true;
                        } else if (i7 == 4) {
                            com.onesignal.debug.internal.logging.b.verbose$default("OutcomeEventsController.sendAndCreateOutcomeEvent: Outcomes disabled for channel: " + bVar2.getInfluenceChannel(), null, 2, null);
                        }
                    }
                    if (nVar == null && nVar2 == null && !z7) {
                        com.onesignal.debug.internal.logging.b.verbose$default("OutcomeEventsController.sendAndCreateOutcomeEvent: Outcomes disabled for all channels", null, 2, null);
                        return null;
                    }
                    com.onesignal.session.internal.outcomes.impl.f fVar2 = new com.onesignal.session.internal.outcomes.impl.f(str, new m(nVar, nVar2), f7, j, 0L);
                    try {
                        cVar.L$0 = this;
                        str2 = str;
                    } catch (C0846a e7) {
                        e = e7;
                        str2 = str;
                    }
                    try {
                        cVar.L$1 = str2;
                        cVar.L$2 = fVar2;
                        cVar.J$0 = currentTimeMillis;
                        cVar.label = 1;
                        if (requestMeasureOutcomeEvent(fVar2, cVar) != aVar) {
                            j7 = currentTimeMillis;
                            fVar = fVar2;
                            str3 = str2;
                            iVar = this;
                        }
                    } catch (C0846a e8) {
                        e = e8;
                        j7 = currentTimeMillis;
                        fVar = fVar2;
                        iVar = this;
                        responseStatusType = com.onesignal.common.g.INSTANCE.getResponseStatusType(e.getStatusCode());
                        String str4 = "OutcomeEventsController.sendAndCreateOutcomeEvent: Sending outcome with name: " + str2 + " failed with status code: " + e.getStatusCode() + " and response: " + e.getResponse();
                        if (responseStatusType != g.a.RETRYABLE) {
                        }
                    }
                    return aVar;
                }
                if (i2 != 1) {
                    if (i2 != 2 && i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    V6.b.P(obj);
                    return null;
                }
                j7 = cVar.J$0;
                fVar = (com.onesignal.session.internal.outcomes.impl.f) cVar.L$2;
                str3 = (String) cVar.L$1;
                iVar = (i) cVar.L$0;
                try {
                    V6.b.P(obj);
                } catch (C0846a e9) {
                    e = e9;
                    str2 = str3;
                    responseStatusType = com.onesignal.common.g.INSTANCE.getResponseStatusType(e.getStatusCode());
                    String str42 = "OutcomeEventsController.sendAndCreateOutcomeEvent: Sending outcome with name: " + str2 + " failed with status code: " + e.getStatusCode() + " and response: " + e.getResponse();
                    if (responseStatusType != g.a.RETRYABLE) {
                        com.onesignal.debug.internal.logging.b.info$default(str42 + " Outcome event was cached and will be reattempted on app cold start", null, 2, null);
                        fVar.setTimestamp(j7);
                        com.onesignal.session.internal.outcomes.impl.d dVar = iVar._outcomeEventsCache;
                        cVar.L$0 = null;
                        cVar.L$1 = null;
                        cVar.L$2 = null;
                        cVar.label = 2;
                        if (dVar.saveOutcomeEvent(fVar, cVar) == aVar) {
                            return aVar;
                        }
                        return null;
                    }
                    com.onesignal.debug.internal.logging.b.warn$default(str42 + " Outcome event will be omitted!", null, 2, null);
                    com.onesignal.session.internal.outcomes.impl.d dVar2 = iVar._outcomeEventsCache;
                    cVar.L$0 = null;
                    cVar.L$1 = null;
                    cVar.L$2 = null;
                    cVar.label = 3;
                    if (dVar2.deleteOldOutcomeEvent(fVar, cVar) == aVar) {
                    }
                }
                iVar.saveUniqueOutcome(fVar);
                return com.onesignal.session.internal.outcomes.impl.e.Companion.fromOutcomeEventParamstoOutcomeEvent(fVar);
            }
        }
        cVar = new c(bVar);
        Object obj2 = cVar.result;
        W5.a aVar2 = W5.a.f2787d;
        i2 = cVar.label;
        if (i2 != 0) {
        }
        iVar.saveUniqueOutcome(fVar);
        return com.onesignal.session.internal.outcomes.impl.e.Companion.fromOutcomeEventParamstoOutcomeEvent(fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(5:5|6|7|(1:(3:(1:(1:12)(2:16|17))(2:18|19)|13|14)(2:20|21))(5:25|26|27|(1:29)|24)|22))|39|6|7|(0)(0)|22|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006f, code lost:
    
        if (r10.deleteOldOutcomeEvent(r9, r0) != r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e2, code lost:
    
        if (r10.deleteOldOutcomeEvent(r9, r0) == r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0043, code lost:
    
        r10 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object sendSavedOutcomeEvent(com.onesignal.session.internal.outcomes.impl.f fVar, V5.b bVar) {
        d dVar;
        i iVar;
        i iVar2;
        if (bVar instanceof d) {
            dVar = (d) bVar;
            int i2 = dVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dVar.label = i2 - Integer.MIN_VALUE;
                Object obj = dVar.result;
                W5.a aVar = W5.a.f2787d;
                iVar = dVar.label;
                if (iVar != 0) {
                    V6.b.P(obj);
                    try {
                        dVar.L$0 = this;
                        dVar.L$1 = fVar;
                        dVar.label = 1;
                        if (requestMeasureOutcomeEvent(fVar, dVar) != aVar) {
                            iVar2 = this;
                        }
                    } catch (C0846a e7) {
                        e = e7;
                        iVar = this;
                        g.a responseStatusType = com.onesignal.common.g.INSTANCE.getResponseStatusType(e.getStatusCode());
                        String str = "OutcomeEventsController.sendSavedOutcomeEvent: Sending outcome with name: " + fVar.getOutcomeId() + " failed with status code: " + e.getStatusCode() + " and response: " + e.getResponse();
                        if (responseStatusType == g.a.RETRYABLE) {
                            com.onesignal.debug.internal.logging.b.info$default(str + " Outcome event was cached and will be reattempted on app cold start", null, 2, null);
                        } else {
                            com.onesignal.debug.internal.logging.b.warn$default(str + " Outcome event will be omitted!", null, 2, null);
                            com.onesignal.session.internal.outcomes.impl.d dVar2 = iVar._outcomeEventsCache;
                            dVar.L$0 = null;
                            dVar.L$1 = null;
                            dVar.label = 3;
                        }
                        return Unit.f6114a;
                    }
                    return aVar;
                }
                if (iVar != 1) {
                    if (iVar == 2) {
                        V6.b.P(obj);
                    } else {
                        if (iVar != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        V6.b.P(obj);
                    }
                    return Unit.f6114a;
                }
                fVar = (com.onesignal.session.internal.outcomes.impl.f) dVar.L$1;
                iVar2 = (i) dVar.L$0;
                V6.b.P(obj);
                com.onesignal.session.internal.outcomes.impl.d dVar3 = iVar2._outcomeEventsCache;
                dVar.L$0 = iVar2;
                dVar.L$1 = fVar;
                dVar.label = 2;
            }
        }
        dVar = new d(bVar);
        Object obj2 = dVar.result;
        W5.a aVar2 = W5.a.f2787d;
        iVar = dVar.label;
        if (iVar != 0) {
        }
        com.onesignal.session.internal.outcomes.impl.d dVar32 = iVar2._outcomeEventsCache;
        dVar.L$0 = iVar2;
        dVar.L$1 = fVar;
        dVar.label = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object sendSavedOutcomes(V5.b bVar) {
        e eVar;
        int i2;
        i iVar;
        i iVar2;
        Iterator it;
        if (bVar instanceof e) {
            eVar = (e) bVar;
            int i5 = eVar.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                eVar.label = i5 - Integer.MIN_VALUE;
                Object obj = eVar.result;
                W5.a aVar = W5.a.f2787d;
                i2 = eVar.label;
                if (i2 != 0) {
                    V6.b.P(obj);
                    com.onesignal.session.internal.outcomes.impl.d dVar = this._outcomeEventsCache;
                    eVar.L$0 = this;
                    eVar.label = 1;
                    obj = dVar.getAllEventsToSend(eVar);
                    if (obj != aVar) {
                        iVar = this;
                    }
                    return aVar;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (Iterator) eVar.L$1;
                    iVar2 = (i) eVar.L$0;
                    V6.b.P(obj);
                    while (it.hasNext()) {
                        com.onesignal.session.internal.outcomes.impl.f fVar = (com.onesignal.session.internal.outcomes.impl.f) it.next();
                        eVar.L$0 = iVar2;
                        eVar.L$1 = it;
                        eVar.label = 2;
                        if (iVar2.sendSavedOutcomeEvent(fVar, eVar) == aVar) {
                            return aVar;
                        }
                    }
                    return Unit.f6114a;
                }
                iVar = (i) eVar.L$0;
                V6.b.P(obj);
                iVar2 = iVar;
                it = ((List) obj).iterator();
                while (it.hasNext()) {
                }
                return Unit.f6114a;
            }
        }
        eVar = new e(bVar);
        Object obj2 = eVar.result;
        W5.a aVar2 = W5.a.f2787d;
        i2 = eVar.label;
        if (i2 != 0) {
        }
        iVar2 = iVar;
        it = ((List) obj2).iterator();
        while (it.hasNext()) {
        }
        return Unit.f6114a;
    }

    private final n setSourceChannelIds(J3.b bVar, n nVar) {
        int i2 = h.$EnumSwitchMapping$1[bVar.getInfluenceChannel().ordinal()];
        if (i2 == 1) {
            nVar.setInAppMessagesIds(bVar.getIds());
            return nVar;
        }
        if (i2 != 2) {
            return nVar;
        }
        nVar.setNotificationIds(bVar.getIds());
        return nVar;
    }

    @Override // N3.a
    public void onSessionActive() {
    }

    @Override // N3.a
    public void onSessionEnded(long j) {
    }

    @Override // N3.a
    public void onSessionStarted() {
        com.onesignal.debug.internal.logging.b.debug$default("OutcomeEventsController.sessionStarted: Cleaning outcomes for new session", null, 2, null);
        this.unattributedUniqueOutcomeEventsSentOnSession = new LinkedHashSet();
        saveUnattributedUniqueOutcomeEvents();
    }

    @Override // L3.b
    public Object sendOutcomeEvent(String str, V5.b bVar) {
        return sendAndCreateOutcomeEvent(str, 0.0f, 0L, this._influenceManager.getInfluences(), bVar);
    }

    @Override // L3.b
    public Object sendOutcomeEventWithValue(String str, float f7, V5.b bVar) {
        return sendAndCreateOutcomeEvent(str, f7, 0L, this._influenceManager.getInfluences(), bVar);
    }

    @Override // L3.b
    public Object sendSessionEndOutcomeEvent(long j, V5.b bVar) {
        return sendAndCreateOutcomeEvent("os__session_duration", 0.0f, j, this._influenceManager.getInfluences(), bVar);
    }

    @Override // L3.b
    public Object sendUniqueOutcomeEvent(String str, V5.b bVar) {
        return sendUniqueOutcomeEvent(str, this._influenceManager.getInfluences(), bVar);
    }

    @Override // com.onesignal.core.internal.startup.b
    public void start() {
        com.onesignal.common.threading.b.suspendifyOnIO(new g(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object sendUniqueOutcomeEvent(String str, List<J3.b> list, V5.b bVar) {
        f fVar;
        int i2;
        List<J3.b> removeDisabledInfluences;
        i iVar;
        List<J3.b> list2;
        if (bVar instanceof f) {
            fVar = (f) bVar;
            int i5 = fVar.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                fVar.label = i5 - Integer.MIN_VALUE;
                f fVar2 = fVar;
                Object obj = fVar2.result;
                W5.a aVar = W5.a.f2787d;
                i2 = fVar2.label;
                if (i2 != 0) {
                    V6.b.P(obj);
                    removeDisabledInfluences = removeDisabledInfluences(list);
                    if (removeDisabledInfluences.isEmpty()) {
                        com.onesignal.debug.internal.logging.b.debug$default("OutcomeEventsController.sendUniqueOutcomeEvent: Unique Outcome disabled for current session", null, 2, null);
                        return null;
                    }
                    Iterator<J3.b> it = removeDisabledInfluences.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (it.next().getInfluenceType().isAttributed()) {
                                fVar2.L$0 = this;
                                fVar2.L$1 = str;
                                fVar2.L$2 = removeDisabledInfluences;
                                fVar2.label = 1;
                                obj = getUniqueIds(str, removeDisabledInfluences, fVar2);
                                if (obj != aVar) {
                                    iVar = this;
                                }
                            }
                        } else {
                            if (this.unattributedUniqueOutcomeEventsSentOnSession.contains(str)) {
                                com.onesignal.debug.internal.logging.b.debug$default(kotlin.text.j.b("\n                    Measure endpoint will not send because unique outcome already sent for:\n                    Session: " + J3.d.UNATTRIBUTED + "\n                    Outcome name: " + str + "\n                    "), null, 2, null);
                                return null;
                            }
                            this.unattributedUniqueOutcomeEventsSentOnSession.add(str);
                            fVar2.label = 3;
                            Object sendAndCreateOutcomeEvent = sendAndCreateOutcomeEvent(str, 0.0f, 0L, removeDisabledInfluences, fVar2);
                            if (sendAndCreateOutcomeEvent != aVar) {
                                return sendAndCreateOutcomeEvent;
                            }
                        }
                    }
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        V6.b.P(obj);
                        return obj;
                    }
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    V6.b.P(obj);
                    return obj;
                }
                List<J3.b> list3 = (List) fVar2.L$2;
                String str2 = (String) fVar2.L$1;
                iVar = (i) fVar2.L$0;
                V6.b.P(obj);
                removeDisabledInfluences = list3;
                str = str2;
                list2 = (List) obj;
                if (list2 != null) {
                    com.onesignal.debug.internal.logging.b.debug$default(kotlin.text.j.b("\n                    Measure endpoint will not send because unique outcome already sent for:\n                    SessionInfluences: " + removeDisabledInfluences + "\n                    Outcome name: " + str + "\n                    "), null, 2, null);
                    return null;
                }
                fVar2.L$0 = null;
                fVar2.L$1 = null;
                fVar2.L$2 = null;
                fVar2.label = 2;
                Object sendAndCreateOutcomeEvent2 = iVar.sendAndCreateOutcomeEvent(str, 0.0f, 0L, list2, fVar2);
                return sendAndCreateOutcomeEvent2 == aVar ? aVar : sendAndCreateOutcomeEvent2;
            }
        }
        fVar = new f(bVar);
        f fVar22 = fVar;
        Object obj2 = fVar22.result;
        W5.a aVar2 = W5.a.f2787d;
        i2 = fVar22.label;
        if (i2 != 0) {
        }
        list2 = (List) obj2;
        if (list2 != null) {
        }
    }
}
