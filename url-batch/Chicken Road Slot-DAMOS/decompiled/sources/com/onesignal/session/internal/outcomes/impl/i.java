package com.onesignal.session.internal.outcomes.impl;

import com.onesignal.common.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.i0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class i implements qc.b, ra.b, sc.a {
    private final com.onesignal.core.internal.config.b _configModelStore;
    private final ja.c _deviceService;
    private final yc.b _identityModelStore;
    private final oc.a _influenceManager;
    private final com.onesignal.session.internal.outcomes.impl.b _outcomeEventsBackend;
    private final com.onesignal.session.internal.outcomes.impl.d _outcomeEventsCache;
    private final com.onesignal.session.internal.outcomes.impl.c _outcomeEventsPreferences;
    private final sc.b _session;
    private final dd.b _subscriptionManager;
    private final sa.a _time;
    private Set<String> unattributedUniqueOutcomeEventsSentOnSession;

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class a extends nd.c {
        int label;
        /* synthetic */ Object result;

        public a(ld.a aVar) {
            super(aVar);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return i.this.getUniqueIds(null, null, this);
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class b extends nd.i implements Function1 {
        final /* synthetic */ com.onesignal.session.internal.outcomes.impl.f $eventParams;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.onesignal.session.internal.outcomes.impl.f fVar, ld.a aVar) {
            super(1, aVar);
            this.$eventParams = fVar;
        }

        @Override // nd.a
        public final ld.a create(ld.a aVar) {
            return i.this.new b(this.$eventParams, aVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(ld.a aVar) {
            return ((b) create(aVar)).invokeSuspend(Unit.f5554a);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            md.a aVar = md.a.f6622d;
            int i3 = this.label;
            if (i3 == 0) {
                cf.c.M(obj);
                com.onesignal.session.internal.outcomes.impl.d dVar = i.this._outcomeEventsCache;
                com.onesignal.session.internal.outcomes.impl.f fVar = this.$eventParams;
                this.label = 1;
                if (dVar.saveUniqueOutcomeEventParams(fVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i3 != 1) {
                    i0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                cf.c.M(obj);
            }
            return Unit.f5554a;
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class c extends nd.c {
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public c(ld.a aVar) {
            super(aVar);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return i.this.sendAndCreateOutcomeEvent(null, 0.0f, 0L, null, this);
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class d extends nd.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public d(ld.a aVar) {
            super(aVar);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return i.this.sendSavedOutcomeEvent(null, this);
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class e extends nd.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public e(ld.a aVar) {
            super(aVar);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return i.this.sendSavedOutcomes(this);
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class f extends nd.c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public f(ld.a aVar) {
            super(aVar);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return i.this.sendUniqueOutcomeEvent(null, null, this);
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class g extends nd.i implements Function1 {
        int label;

        public g(ld.a aVar) {
            super(1, aVar);
        }

        @Override // nd.a
        public final ld.a create(ld.a aVar) {
            return i.this.new g(aVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(ld.a aVar) {
            return ((g) create(aVar)).invokeSuspend(Unit.f5554a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
        
            if (r5.cleanCachedUniqueOutcomeEventNotifications(r4) == r0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0026, code lost:
        
            if (r5.sendSavedOutcomes(r4) == r0) goto L15;
         */
        @Override // nd.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            md.a aVar = md.a.f6622d;
            int i3 = this.label;
            if (i3 == 0) {
                cf.c.M(obj);
                i iVar = i.this;
                this.label = 1;
            } else {
                if (i3 != 1) {
                    if (i3 == 2) {
                        cf.c.M(obj);
                        return Unit.f5554a;
                    }
                    i0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                cf.c.M(obj);
            }
            com.onesignal.session.internal.outcomes.impl.d dVar = i.this._outcomeEventsCache;
            this.label = 2;
        }
    }

    public i(sc.b bVar, oc.a aVar, com.onesignal.session.internal.outcomes.impl.d dVar, com.onesignal.session.internal.outcomes.impl.c cVar, com.onesignal.session.internal.outcomes.impl.b bVar2, com.onesignal.core.internal.config.b bVar3, yc.b bVar4, dd.b bVar5, ja.c cVar2, sa.a aVar2) {
        bVar.getClass();
        aVar.getClass();
        dVar.getClass();
        cVar.getClass();
        bVar2.getClass();
        bVar3.getClass();
        bVar4.getClass();
        bVar5.getClass();
        cVar2.getClass();
        aVar2.getClass();
        this._session = bVar;
        this._influenceManager = aVar;
        this._outcomeEventsCache = dVar;
        this._outcomeEventsPreferences = cVar;
        this._outcomeEventsBackend = bVar2;
        this._configModelStore = bVar3;
        this._identityModelStore = bVar4;
        this._subscriptionManager = bVar5;
        this._deviceService = cVar2;
        this._time = aVar2;
        this.unattributedUniqueOutcomeEventsSentOnSession = new LinkedHashSet();
        Set<String> unattributedUniqueOutcomeEventsSentByChannel = cVar.getUnattributedUniqueOutcomeEventsSentByChannel();
        this.unattributedUniqueOutcomeEventsSentOnSession = unattributedUniqueOutcomeEventsSentByChannel != null ? CollectionsKt.S(unattributedUniqueOutcomeEventsSentByChannel) : new LinkedHashSet();
        bVar.subscribe(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0046 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getUniqueIds(String str, List<oc.b> list, ld.a aVar) {
        a aVar2;
        int i3;
        List list2;
        if (aVar instanceof a) {
            aVar2 = (a) aVar;
            int i10 = aVar2.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar2.label = i10 - Integer.MIN_VALUE;
                Object obj = aVar2.result;
                md.a aVar3 = md.a.f6622d;
                i3 = aVar2.label;
                if (i3 != 0) {
                    cf.c.M(obj);
                    com.onesignal.session.internal.outcomes.impl.d dVar = this._outcomeEventsCache;
                    aVar2.label = 1;
                    obj = dVar.getNotCachedUniqueInfluencesForOutcome(str, list, aVar2);
                    if (obj == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cf.c.M(obj);
                }
                list2 = (List) obj;
                if (list2.isEmpty()) {
                    return list2;
                }
                return null;
            }
        }
        aVar2 = new a(aVar);
        Object obj2 = aVar2.result;
        md.a aVar32 = md.a.f6622d;
        i3 = aVar2.label;
        if (i3 != 0) {
        }
        list2 = (List) obj2;
        if (list2.isEmpty()) {
        }
    }

    private final List<oc.b> removeDisabledInfluences(List<oc.b> list) {
        ArrayList R = CollectionsKt.R(list);
        for (oc.b bVar : list) {
            if (bVar.getInfluenceType().isDisabled()) {
                com.onesignal.debug.internal.logging.b.debug$default("OutcomeEventsController.removeDisabledInfluences: Outcomes disabled for channel: " + bVar.getInfluenceChannel(), null, 2, null);
                R.remove(bVar);
            }
        }
        return R;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object requestMeasureOutcomeEvent(com.onesignal.session.internal.outcomes.impl.f fVar, ld.a aVar) {
        String appId = ((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getAppId();
        String id2 = this._subscriptionManager.getSubscriptions().getPush().getId();
        String value = uc.j.Companion.fromDeviceType(this._deviceService.getDeviceType()).getValue();
        if (id2.length() == 0 || value.length() == 0) {
            throw new z9.a(0, null, null, 6, null);
        }
        com.onesignal.session.internal.outcomes.impl.e fromOutcomeEventParamstoOutcomeEvent = com.onesignal.session.internal.outcomes.impl.e.Companion.fromOutcomeEventParamstoOutcomeEvent(fVar);
        int i3 = h.$EnumSwitchMapping$0[fromOutcomeEventParamstoOutcomeEvent.getSession().ordinal()];
        Object sendOutcomeEvent = this._outcomeEventsBackend.sendOutcomeEvent(appId, ((yc.a) this._identityModelStore.getModel()).getOnesignalId(), id2, value, i3 != 1 ? i3 != 2 ? null : Boolean.FALSE : Boolean.TRUE, fromOutcomeEventParamstoOutcomeEvent, aVar);
        return sendOutcomeEvent == md.a.f6622d ? sendOutcomeEvent : Unit.f5554a;
    }

    private final void saveAttributedUniqueOutcomeNotifications(com.onesignal.session.internal.outcomes.impl.f fVar) {
        com.onesignal.common.threading.b.suspendifyOnThread(10, new b(fVar, null));
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
    /* JADX WARN: Removed duplicated region for block: B:15:0x0165 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0164 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object sendAndCreateOutcomeEvent(String str, float f3, long j, List<oc.b> list, ld.a aVar) {
        c cVar;
        int i3;
        String str2;
        long j3;
        com.onesignal.session.internal.outcomes.impl.f fVar;
        i iVar;
        String str3;
        g.a responseStatusType;
        if (aVar instanceof c) {
            cVar = (c) aVar;
            int i10 = cVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.label = i10 - Integer.MIN_VALUE;
                Object obj = cVar.result;
                md.a aVar2 = md.a.f6622d;
                i3 = cVar.label;
                if (i3 != 0) {
                    cf.c.M(obj);
                    long currentTimeMillis = this._time.getCurrentTimeMillis() / 1000;
                    boolean z10 = false;
                    n nVar = null;
                    n nVar2 = null;
                    for (oc.b bVar : list) {
                        int i11 = h.$EnumSwitchMapping$0[bVar.getInfluenceType().ordinal()];
                        if (i11 == 1) {
                            if (nVar == null) {
                                nVar = new n(null, null, 3, null);
                            }
                            nVar = setSourceChannelIds(bVar, nVar);
                        } else if (i11 == 2) {
                            if (nVar2 == null) {
                                nVar2 = new n(null, null, 3, null);
                            }
                            nVar2 = setSourceChannelIds(bVar, nVar2);
                        } else if (i11 == 3) {
                            z10 = true;
                        } else if (i11 == 4) {
                            com.onesignal.debug.internal.logging.b.verbose$default("OutcomeEventsController.sendAndCreateOutcomeEvent: Outcomes disabled for channel: " + bVar.getInfluenceChannel(), null, 2, null);
                        }
                    }
                    if (nVar == null && nVar2 == null && !z10) {
                        com.onesignal.debug.internal.logging.b.verbose$default("OutcomeEventsController.sendAndCreateOutcomeEvent: Outcomes disabled for all channels", null, 2, null);
                        return null;
                    }
                    com.onesignal.session.internal.outcomes.impl.f fVar2 = new com.onesignal.session.internal.outcomes.impl.f(str, new m(nVar, nVar2), f3, j, 0L);
                    try {
                        cVar.L$0 = this;
                        str2 = str;
                        try {
                            cVar.L$1 = str2;
                            cVar.L$2 = fVar2;
                            cVar.J$0 = currentTimeMillis;
                            cVar.label = 1;
                            if (requestMeasureOutcomeEvent(fVar2, cVar) != aVar2) {
                                j3 = currentTimeMillis;
                                fVar = fVar2;
                                str3 = str2;
                                iVar = this;
                            }
                        } catch (z9.a e2) {
                            e = e2;
                            j3 = currentTimeMillis;
                            fVar = fVar2;
                            iVar = this;
                            responseStatusType = com.onesignal.common.g.INSTANCE.getResponseStatusType(e.getStatusCode());
                            StringBuilder q3 = v4.a.q("OutcomeEventsController.sendAndCreateOutcomeEvent: Sending outcome with name: ", str2, " failed with status code: ");
                            q3.append(e.getStatusCode());
                            q3.append(" and response: ");
                            q3.append(e.getResponse());
                            String sb2 = q3.toString();
                            if (responseStatusType != g.a.RETRYABLE) {
                                com.onesignal.debug.internal.logging.b.warn$default(sb2.concat(" Outcome event was cached and will be reattempted on app cold start"), null, 2, null);
                                fVar.setTimestamp(j3);
                                com.onesignal.session.internal.outcomes.impl.d dVar = iVar._outcomeEventsCache;
                                cVar.L$0 = null;
                                cVar.L$1 = null;
                                cVar.L$2 = null;
                                cVar.label = 2;
                                if (dVar.saveOutcomeEvent(fVar, cVar) == aVar2) {
                                    return aVar2;
                                }
                                return null;
                            }
                            com.onesignal.debug.internal.logging.b.error$default(sb2.concat(" Outcome event will be omitted!"), null, 2, null);
                            com.onesignal.session.internal.outcomes.impl.d dVar2 = iVar._outcomeEventsCache;
                            cVar.L$0 = null;
                            cVar.L$1 = null;
                            cVar.L$2 = null;
                            cVar.label = 3;
                            if (dVar2.deleteOldOutcomeEvent(fVar, cVar) == aVar2) {
                            }
                        }
                    } catch (z9.a e9) {
                        e = e9;
                        str2 = str;
                    }
                    return aVar2;
                }
                if (i3 != 1) {
                    if (i3 == 2 || i3 == 3) {
                        cf.c.M(obj);
                        return null;
                    }
                    i0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j3 = cVar.J$0;
                fVar = (com.onesignal.session.internal.outcomes.impl.f) cVar.L$2;
                str3 = (String) cVar.L$1;
                iVar = (i) cVar.L$0;
                try {
                    cf.c.M(obj);
                } catch (z9.a e10) {
                    e = e10;
                    str2 = str3;
                    responseStatusType = com.onesignal.common.g.INSTANCE.getResponseStatusType(e.getStatusCode());
                    StringBuilder q32 = v4.a.q("OutcomeEventsController.sendAndCreateOutcomeEvent: Sending outcome with name: ", str2, " failed with status code: ");
                    q32.append(e.getStatusCode());
                    q32.append(" and response: ");
                    q32.append(e.getResponse());
                    String sb22 = q32.toString();
                    if (responseStatusType != g.a.RETRYABLE) {
                    }
                }
                iVar.saveUniqueOutcome(fVar);
                return com.onesignal.session.internal.outcomes.impl.e.Companion.fromOutcomeEventParamstoOutcomeEvent(fVar);
            }
        }
        cVar = new c(aVar);
        Object obj2 = cVar.result;
        md.a aVar22 = md.a.f6622d;
        i3 = cVar.label;
        if (i3 != 0) {
        }
        iVar.saveUniqueOutcome(fVar);
        return com.onesignal.session.internal.outcomes.impl.e.Companion.fromOutcomeEventParamstoOutcomeEvent(fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(5:5|6|7|(1:(3:(1:(1:12)(2:16|17))(2:18|19)|13|14)(2:20|21))(5:25|26|27|(1:29)|24)|22))|39|6|7|(0)(0)|22|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006d, code lost:
    
        if (r10.deleteOldOutcomeEvent(r9, r0) != r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ca, code lost:
    
        if (r10.deleteOldOutcomeEvent(r9, r0) == r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0042, code lost:
    
        r10 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object sendSavedOutcomeEvent(com.onesignal.session.internal.outcomes.impl.f fVar, ld.a aVar) {
        d dVar;
        i iVar;
        i iVar2;
        if (aVar instanceof d) {
            dVar = (d) aVar;
            int i3 = dVar.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                dVar.label = i3 - Integer.MIN_VALUE;
                Object obj = dVar.result;
                md.a aVar2 = md.a.f6622d;
                iVar = dVar.label;
                if (iVar != 0) {
                    cf.c.M(obj);
                    try {
                        dVar.L$0 = this;
                        dVar.L$1 = fVar;
                        dVar.label = 1;
                        if (requestMeasureOutcomeEvent(fVar, dVar) != aVar2) {
                            iVar2 = this;
                        }
                    } catch (z9.a e2) {
                        e = e2;
                        iVar = this;
                        g.a responseStatusType = com.onesignal.common.g.INSTANCE.getResponseStatusType(e.getStatusCode());
                        String str = "OutcomeEventsController.sendSavedOutcomeEvent: Sending outcome with name: " + fVar.getOutcomeId() + " failed with status code: " + e.getStatusCode() + " and response: " + e.getResponse();
                        if (responseStatusType == g.a.RETRYABLE) {
                            com.onesignal.debug.internal.logging.b.warn$default(str.concat(" Outcome event was cached and will be reattempted on app cold start"), null, 2, null);
                        } else {
                            com.onesignal.debug.internal.logging.b.error$default(str.concat(" Outcome event will be omitted!"), null, 2, null);
                            com.onesignal.session.internal.outcomes.impl.d dVar2 = iVar._outcomeEventsCache;
                            dVar.L$0 = null;
                            dVar.L$1 = null;
                            dVar.label = 3;
                        }
                        return Unit.f5554a;
                    }
                    return aVar2;
                }
                if (iVar != 1) {
                    if (iVar == 2) {
                        cf.c.M(obj);
                    } else {
                        if (iVar != 3) {
                            i0.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        cf.c.M(obj);
                    }
                    return Unit.f5554a;
                }
                fVar = (com.onesignal.session.internal.outcomes.impl.f) dVar.L$1;
                iVar2 = (i) dVar.L$0;
                cf.c.M(obj);
                com.onesignal.session.internal.outcomes.impl.d dVar3 = iVar2._outcomeEventsCache;
                dVar.L$0 = iVar2;
                dVar.L$1 = fVar;
                dVar.label = 2;
            }
        }
        dVar = new d(aVar);
        Object obj2 = dVar.result;
        md.a aVar22 = md.a.f6622d;
        iVar = dVar.label;
        if (iVar != 0) {
        }
        com.onesignal.session.internal.outcomes.impl.d dVar32 = iVar2._outcomeEventsCache;
        dVar.L$0 = iVar2;
        dVar.L$1 = fVar;
        dVar.label = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object sendSavedOutcomes(ld.a aVar) {
        e eVar;
        int i3;
        i iVar;
        i iVar2;
        Iterator it;
        if (aVar instanceof e) {
            eVar = (e) aVar;
            int i10 = eVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.label = i10 - Integer.MIN_VALUE;
                Object obj = eVar.result;
                md.a aVar2 = md.a.f6622d;
                i3 = eVar.label;
                if (i3 != 0) {
                    cf.c.M(obj);
                    com.onesignal.session.internal.outcomes.impl.d dVar = this._outcomeEventsCache;
                    eVar.L$0 = this;
                    eVar.label = 1;
                    obj = dVar.getAllEventsToSend(eVar);
                    if (obj != aVar2) {
                        iVar = this;
                    }
                    return aVar2;
                }
                if (i3 != 1) {
                    if (i3 != 2) {
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    it = (Iterator) eVar.L$1;
                    iVar2 = (i) eVar.L$0;
                    cf.c.M(obj);
                    while (it.hasNext()) {
                        com.onesignal.session.internal.outcomes.impl.f fVar = (com.onesignal.session.internal.outcomes.impl.f) it.next();
                        eVar.L$0 = iVar2;
                        eVar.L$1 = it;
                        eVar.label = 2;
                        if (iVar2.sendSavedOutcomeEvent(fVar, eVar) == aVar2) {
                            return aVar2;
                        }
                    }
                    return Unit.f5554a;
                }
                iVar = (i) eVar.L$0;
                cf.c.M(obj);
                iVar2 = iVar;
                it = ((List) obj).iterator();
                while (it.hasNext()) {
                }
                return Unit.f5554a;
            }
        }
        eVar = new e(aVar);
        Object obj2 = eVar.result;
        md.a aVar22 = md.a.f6622d;
        i3 = eVar.label;
        if (i3 != 0) {
        }
        iVar2 = iVar;
        it = ((List) obj2).iterator();
        while (it.hasNext()) {
        }
        return Unit.f5554a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object sendUniqueOutcomeEvent(String str, List<oc.b> list, ld.a aVar) {
        f fVar;
        int i3;
        List<oc.b> removeDisabledInfluences;
        i iVar;
        List<oc.b> list2;
        if (aVar instanceof f) {
            fVar = (f) aVar;
            int i10 = fVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                fVar.label = i10 - Integer.MIN_VALUE;
                f fVar2 = fVar;
                Object obj = fVar2.result;
                md.a aVar2 = md.a.f6622d;
                i3 = fVar2.label;
                if (i3 != 0) {
                    cf.c.M(obj);
                    removeDisabledInfluences = removeDisabledInfluences(list);
                    if (removeDisabledInfluences.isEmpty()) {
                        com.onesignal.debug.internal.logging.b.debug$default("OutcomeEventsController.sendUniqueOutcomeEvent: Unique Outcome disabled for current session", null, 2, null);
                        return null;
                    }
                    Iterator<oc.b> it = removeDisabledInfluences.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (it.next().getInfluenceType().isAttributed()) {
                                fVar2.L$0 = this;
                                fVar2.L$1 = str;
                                fVar2.L$2 = removeDisabledInfluences;
                                fVar2.label = 1;
                                obj = getUniqueIds(str, removeDisabledInfluences, fVar2);
                                if (obj != aVar2) {
                                    iVar = this;
                                }
                            }
                        } else {
                            if (this.unattributedUniqueOutcomeEventsSentOnSession.contains(str)) {
                                com.onesignal.debug.internal.logging.b.debug$default(kotlin.text.i.c("\n                    Measure endpoint will not send because unique outcome already sent for:\n                    Session: " + oc.d.UNATTRIBUTED + "\n                    Outcome name: " + str + "\n                    "), null, 2, null);
                                return null;
                            }
                            this.unattributedUniqueOutcomeEventsSentOnSession.add(str);
                            fVar2.label = 3;
                            Object sendAndCreateOutcomeEvent = sendAndCreateOutcomeEvent(str, 0.0f, 0L, removeDisabledInfluences, fVar2);
                            if (sendAndCreateOutcomeEvent != aVar2) {
                                return sendAndCreateOutcomeEvent;
                            }
                        }
                    }
                }
                if (i3 != 1) {
                    if (i3 == 2) {
                        cf.c.M(obj);
                        return obj;
                    }
                    if (i3 == 3) {
                        cf.c.M(obj);
                        return obj;
                    }
                    i0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                List<oc.b> list3 = (List) fVar2.L$2;
                String str2 = (String) fVar2.L$1;
                iVar = (i) fVar2.L$0;
                cf.c.M(obj);
                removeDisabledInfluences = list3;
                str = str2;
                list2 = (List) obj;
                if (list2 == null) {
                    fVar2.L$0 = null;
                    fVar2.L$1 = null;
                    fVar2.L$2 = null;
                    fVar2.label = 2;
                    Object sendAndCreateOutcomeEvent2 = iVar.sendAndCreateOutcomeEvent(str, 0.0f, 0L, list2, fVar2);
                    return sendAndCreateOutcomeEvent2 == aVar2 ? aVar2 : sendAndCreateOutcomeEvent2;
                }
                com.onesignal.debug.internal.logging.b.debug$default(kotlin.text.i.c("\n                    Measure endpoint will not send because unique outcome already sent for:\n                    SessionInfluences: " + removeDisabledInfluences + "\n                    Outcome name: " + str + "\n                    "), null, 2, null);
                return null;
            }
        }
        fVar = new f(aVar);
        f fVar22 = fVar;
        Object obj2 = fVar22.result;
        md.a aVar22 = md.a.f6622d;
        i3 = fVar22.label;
        if (i3 != 0) {
        }
        list2 = (List) obj2;
        if (list2 == null) {
        }
    }

    private final n setSourceChannelIds(oc.b bVar, n nVar) {
        int i3 = h.$EnumSwitchMapping$1[bVar.getInfluenceChannel().ordinal()];
        if (i3 == 1) {
            nVar.setInAppMessagesIds(bVar.getIds());
            return nVar;
        }
        if (i3 != 2) {
            return nVar;
        }
        nVar.setNotificationIds(bVar.getIds());
        return nVar;
    }

    @Override // sc.a
    public void onSessionStarted() {
        com.onesignal.debug.internal.logging.b.debug$default("OutcomeEventsController.sessionStarted: Cleaning outcomes for new session", null, 2, null);
        this.unattributedUniqueOutcomeEventsSentOnSession = new LinkedHashSet();
        saveUnattributedUniqueOutcomeEvents();
    }

    @Override // qc.b
    public Object sendOutcomeEvent(String str, ld.a aVar) {
        return sendAndCreateOutcomeEvent(str, 0.0f, 0L, this._influenceManager.getInfluences(), aVar);
    }

    @Override // qc.b
    public Object sendOutcomeEventWithValue(String str, float f3, ld.a aVar) {
        return sendAndCreateOutcomeEvent(str, f3, 0L, this._influenceManager.getInfluences(), aVar);
    }

    @Override // qc.b
    public Object sendSessionEndOutcomeEvent(long j, ld.a aVar) {
        return sendAndCreateOutcomeEvent("os__session_duration", 0.0f, j, this._influenceManager.getInfluences(), aVar);
    }

    @Override // ra.b
    public void start() {
        com.onesignal.common.threading.b.suspendifyOnThread$default(0, new g(null), 1, null);
    }

    @Override // sc.a
    public void onSessionActive() {
    }

    @Override // sc.a
    public void onSessionEnded(long j) {
    }

    @Override // qc.b
    public Object sendUniqueOutcomeEvent(String str, ld.a aVar) {
        return sendUniqueOutcomeEvent(str, this._influenceManager.getInfluences(), aVar);
    }
}
