package com.onesignal.session.internal.outcomes.impl;

import com.onesignal.common.g;
import g2.InterfaceC0391a;
import h3.C0406b;
import h3.EnumC0408d;
import h3.InterfaceC0405a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import k5.v;
import l3.InterfaceC0493a;
import l3.InterfaceC0494b;
import l5.AbstractC0506j;
import n3.EnumC0552j;
import o5.InterfaceC0564d;
import p5.EnumC0580a;
import q5.AbstractC0607c;
import r3.C0617a;
import u0.AbstractC0676f;
import w3.InterfaceC0720b;
import x5.InterfaceC0743l;

/* loaded from: classes.dex */
public final class i implements j3.b, com.onesignal.core.internal.startup.b, InterfaceC0493a {
    private final com.onesignal.core.internal.config.c _configModelStore;
    private final Y1.c _deviceService;
    private final r3.b _identityModelStore;
    private final InterfaceC0405a _influenceManager;
    private final com.onesignal.session.internal.outcomes.impl.b _outcomeEventsBackend;
    private final com.onesignal.session.internal.outcomes.impl.d _outcomeEventsCache;
    private final com.onesignal.session.internal.outcomes.impl.c _outcomeEventsPreferences;
    private final InterfaceC0494b _session;
    private final InterfaceC0720b _subscriptionManager;
    private final InterfaceC0391a _time;
    private Set<String> unattributedUniqueOutcomeEventsSentOnSession;

    public static final class a extends AbstractC0607c {
        int label;
        /* synthetic */ Object result;

        public a(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return i.this.getUniqueIds(null, null, this);
        }
    }

    public static final class b extends q5.g implements InterfaceC0743l {
        final /* synthetic */ com.onesignal.session.internal.outcomes.impl.f $eventParams;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.onesignal.session.internal.outcomes.impl.f fVar, InterfaceC0564d interfaceC0564d) {
            super(1, interfaceC0564d);
            this.$eventParams = fVar;
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(InterfaceC0564d interfaceC0564d) {
            return i.this.new b(this.$eventParams, interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            int i7 = this.label;
            if (i7 == 0) {
                AbstractC0676f.w(obj);
                com.onesignal.session.internal.outcomes.impl.d dVar = i.this._outcomeEventsCache;
                com.onesignal.session.internal.outcomes.impl.f fVar = this.$eventParams;
                this.label = 1;
                if (dVar.saveUniqueOutcomeEventParams(fVar, this) == enumC0580a) {
                    return enumC0580a;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC0676f.w(obj);
            }
            return v.f5219a;
        }

        @Override // x5.InterfaceC0743l
        public final Object invoke(InterfaceC0564d interfaceC0564d) {
            return ((b) create(interfaceC0564d)).invokeSuspend(v.f5219a);
        }
    }

    public static final class c extends AbstractC0607c {
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public c(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return i.this.sendAndCreateOutcomeEvent(null, 0.0f, 0L, null, this);
        }
    }

    public static final class d extends AbstractC0607c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public d(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return i.this.sendSavedOutcomeEvent(null, this);
        }
    }

    public static final class e extends AbstractC0607c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public e(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return i.this.sendSavedOutcomes(this);
        }
    }

    public static final class f extends AbstractC0607c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public f(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return i.this.sendUniqueOutcomeEvent(null, null, this);
        }
    }

    public static final class g extends q5.g implements InterfaceC0743l {
        int label;

        public g(InterfaceC0564d interfaceC0564d) {
            super(1, interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(InterfaceC0564d interfaceC0564d) {
            return i.this.new g(interfaceC0564d);
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
        @Override // q5.AbstractC0605a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            int i7 = this.label;
            if (i7 == 0) {
                AbstractC0676f.w(obj);
                i iVar = i.this;
                this.label = 1;
            } else {
                if (i7 != 1) {
                    if (i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0676f.w(obj);
                    return v.f5219a;
                }
                AbstractC0676f.w(obj);
            }
            com.onesignal.session.internal.outcomes.impl.d dVar = i.this._outcomeEventsCache;
            this.label = 2;
        }

        @Override // x5.InterfaceC0743l
        public final Object invoke(InterfaceC0564d interfaceC0564d) {
            return ((g) create(interfaceC0564d)).invokeSuspend(v.f5219a);
        }
    }

    public i(InterfaceC0494b _session, InterfaceC0405a _influenceManager, com.onesignal.session.internal.outcomes.impl.d _outcomeEventsCache, com.onesignal.session.internal.outcomes.impl.c _outcomeEventsPreferences, com.onesignal.session.internal.outcomes.impl.b _outcomeEventsBackend, com.onesignal.core.internal.config.c _configModelStore, r3.b _identityModelStore, InterfaceC0720b _subscriptionManager, Y1.c _deviceService, InterfaceC0391a _time) {
        kotlin.jvm.internal.i.e(_session, "_session");
        kotlin.jvm.internal.i.e(_influenceManager, "_influenceManager");
        kotlin.jvm.internal.i.e(_outcomeEventsCache, "_outcomeEventsCache");
        kotlin.jvm.internal.i.e(_outcomeEventsPreferences, "_outcomeEventsPreferences");
        kotlin.jvm.internal.i.e(_outcomeEventsBackend, "_outcomeEventsBackend");
        kotlin.jvm.internal.i.e(_configModelStore, "_configModelStore");
        kotlin.jvm.internal.i.e(_identityModelStore, "_identityModelStore");
        kotlin.jvm.internal.i.e(_subscriptionManager, "_subscriptionManager");
        kotlin.jvm.internal.i.e(_deviceService, "_deviceService");
        kotlin.jvm.internal.i.e(_time, "_time");
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
        this.unattributedUniqueOutcomeEventsSentOnSession = unattributedUniqueOutcomeEventsSentByChannel != null ? AbstractC0506j.S(unattributedUniqueOutcomeEventsSentByChannel) : new LinkedHashSet<>();
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
    public final Object getUniqueIds(String str, List<C0406b> list, InterfaceC0564d interfaceC0564d) {
        a aVar;
        int i7;
        List list2;
        if (interfaceC0564d instanceof a) {
            aVar = (a) interfaceC0564d;
            int i8 = aVar.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                aVar.label = i8 - Integer.MIN_VALUE;
                Object obj = aVar.result;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                i7 = aVar.label;
                if (i7 != 0) {
                    AbstractC0676f.w(obj);
                    com.onesignal.session.internal.outcomes.impl.d dVar = this._outcomeEventsCache;
                    aVar.label = 1;
                    obj = dVar.getNotCachedUniqueInfluencesForOutcome(str, list, aVar);
                    if (obj == enumC0580a) {
                        return enumC0580a;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0676f.w(obj);
                }
                list2 = (List) obj;
                if (list2.isEmpty()) {
                    return list2;
                }
                return null;
            }
        }
        aVar = new a(interfaceC0564d);
        Object obj2 = aVar.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = aVar.label;
        if (i7 != 0) {
        }
        list2 = (List) obj2;
        if (list2.isEmpty()) {
        }
    }

    private final List<C0406b> removeDisabledInfluences(List<C0406b> list) {
        ArrayList Q6 = AbstractC0506j.Q(list);
        for (C0406b c0406b : list) {
            if (c0406b.getInfluenceType().isDisabled()) {
                com.onesignal.debug.internal.logging.b.debug$default("OutcomeEventsController.removeDisabledInfluences: Outcomes disabled for channel: " + c0406b.getInfluenceChannel(), null, 2, null);
                Q6.remove(c0406b);
            }
        }
        return Q6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object requestMeasureOutcomeEvent(com.onesignal.session.internal.outcomes.impl.f fVar, InterfaceC0564d interfaceC0564d) {
        String appId = ((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getAppId();
        String id = this._subscriptionManager.getSubscriptions().getPush().getId();
        String value = EnumC0552j.Companion.fromDeviceType(this._deviceService.getDeviceType()).getValue();
        if (id.length() == 0 || value.length() == 0) {
            throw new P1.a(0, null, null, 6, null);
        }
        com.onesignal.session.internal.outcomes.impl.e fromOutcomeEventParamstoOutcomeEvent = com.onesignal.session.internal.outcomes.impl.e.Companion.fromOutcomeEventParamstoOutcomeEvent(fVar);
        int i7 = h.$EnumSwitchMapping$0[fromOutcomeEventParamstoOutcomeEvent.getSession().ordinal()];
        Object sendOutcomeEvent = this._outcomeEventsBackend.sendOutcomeEvent(appId, ((C0617a) this._identityModelStore.getModel()).getOnesignalId(), id, value, i7 != 1 ? i7 != 2 ? null : Boolean.FALSE : Boolean.TRUE, fromOutcomeEventParamstoOutcomeEvent, interfaceC0564d);
        return sendOutcomeEvent == EnumC0580a.f5697f ? sendOutcomeEvent : v.f5219a;
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
    public final Object sendAndCreateOutcomeEvent(String str, float f7, long j4, List<C0406b> list, InterfaceC0564d interfaceC0564d) {
        c cVar;
        int i7;
        String str2;
        long j7;
        com.onesignal.session.internal.outcomes.impl.f fVar;
        i iVar;
        String str3;
        g.a responseStatusType;
        if (interfaceC0564d instanceof c) {
            cVar = (c) interfaceC0564d;
            int i8 = cVar.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                cVar.label = i8 - Integer.MIN_VALUE;
                Object obj = cVar.result;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                i7 = cVar.label;
                if (i7 != 0) {
                    AbstractC0676f.w(obj);
                    long currentTimeMillis = this._time.getCurrentTimeMillis() / 1000;
                    boolean z5 = false;
                    n nVar = null;
                    n nVar2 = null;
                    for (C0406b c0406b : list) {
                        int i9 = h.$EnumSwitchMapping$0[c0406b.getInfluenceType().ordinal()];
                        if (i9 == 1) {
                            if (nVar == null) {
                                nVar = new n(null, null, 3, null);
                            }
                            nVar = setSourceChannelIds(c0406b, nVar);
                        } else if (i9 == 2) {
                            if (nVar2 == null) {
                                nVar2 = new n(null, null, 3, null);
                            }
                            nVar2 = setSourceChannelIds(c0406b, nVar2);
                        } else if (i9 == 3) {
                            z5 = true;
                        } else if (i9 == 4) {
                            com.onesignal.debug.internal.logging.b.verbose$default("OutcomeEventsController.sendAndCreateOutcomeEvent: Outcomes disabled for channel: " + c0406b.getInfluenceChannel(), null, 2, null);
                        }
                    }
                    if (nVar == null && nVar2 == null && !z5) {
                        com.onesignal.debug.internal.logging.b.verbose$default("OutcomeEventsController.sendAndCreateOutcomeEvent: Outcomes disabled for all channels", null, 2, null);
                        return null;
                    }
                    com.onesignal.session.internal.outcomes.impl.f fVar2 = new com.onesignal.session.internal.outcomes.impl.f(str, new m(nVar, nVar2), f7, j4, 0L);
                    try {
                        cVar.L$0 = this;
                        str2 = str;
                    } catch (P1.a e4) {
                        e = e4;
                        str2 = str;
                    }
                    try {
                        cVar.L$1 = str2;
                        cVar.L$2 = fVar2;
                        cVar.J$0 = currentTimeMillis;
                        cVar.label = 1;
                        if (requestMeasureOutcomeEvent(fVar2, cVar) != enumC0580a) {
                            j7 = currentTimeMillis;
                            fVar = fVar2;
                            str3 = str2;
                            iVar = this;
                        }
                    } catch (P1.a e7) {
                        e = e7;
                        j7 = currentTimeMillis;
                        fVar = fVar2;
                        iVar = this;
                        responseStatusType = com.onesignal.common.g.INSTANCE.getResponseStatusType(e.getStatusCode());
                        String str4 = "OutcomeEventsController.sendAndCreateOutcomeEvent: Sending outcome with name: " + str2 + " failed with status code: " + e.getStatusCode() + " and response: " + e.getResponse();
                        if (responseStatusType != g.a.RETRYABLE) {
                        }
                    }
                    return enumC0580a;
                }
                if (i7 != 1) {
                    if (i7 != 2 && i7 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0676f.w(obj);
                    return null;
                }
                j7 = cVar.J$0;
                fVar = (com.onesignal.session.internal.outcomes.impl.f) cVar.L$2;
                str3 = (String) cVar.L$1;
                iVar = (i) cVar.L$0;
                try {
                    AbstractC0676f.w(obj);
                } catch (P1.a e8) {
                    e = e8;
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
                        if (dVar.saveOutcomeEvent(fVar, cVar) == enumC0580a) {
                            return enumC0580a;
                        }
                        return null;
                    }
                    com.onesignal.debug.internal.logging.b.warn$default(str42 + " Outcome event will be omitted!", null, 2, null);
                    com.onesignal.session.internal.outcomes.impl.d dVar2 = iVar._outcomeEventsCache;
                    cVar.L$0 = null;
                    cVar.L$1 = null;
                    cVar.L$2 = null;
                    cVar.label = 3;
                    if (dVar2.deleteOldOutcomeEvent(fVar, cVar) == enumC0580a) {
                    }
                }
                iVar.saveUniqueOutcome(fVar);
                return com.onesignal.session.internal.outcomes.impl.e.Companion.fromOutcomeEventParamstoOutcomeEvent(fVar);
            }
        }
        cVar = new c(interfaceC0564d);
        Object obj2 = cVar.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = cVar.label;
        if (i7 != 0) {
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
    public final Object sendSavedOutcomeEvent(com.onesignal.session.internal.outcomes.impl.f fVar, InterfaceC0564d interfaceC0564d) {
        d dVar;
        i iVar;
        i iVar2;
        if (interfaceC0564d instanceof d) {
            dVar = (d) interfaceC0564d;
            int i7 = dVar.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                dVar.label = i7 - Integer.MIN_VALUE;
                Object obj = dVar.result;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                iVar = dVar.label;
                if (iVar != 0) {
                    AbstractC0676f.w(obj);
                    try {
                        dVar.L$0 = this;
                        dVar.L$1 = fVar;
                        dVar.label = 1;
                        if (requestMeasureOutcomeEvent(fVar, dVar) != enumC0580a) {
                            iVar2 = this;
                        }
                    } catch (P1.a e4) {
                        e = e4;
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
                        return v.f5219a;
                    }
                    return enumC0580a;
                }
                if (iVar != 1) {
                    if (iVar == 2) {
                        AbstractC0676f.w(obj);
                    } else {
                        if (iVar != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC0676f.w(obj);
                    }
                    return v.f5219a;
                }
                fVar = (com.onesignal.session.internal.outcomes.impl.f) dVar.L$1;
                iVar2 = (i) dVar.L$0;
                AbstractC0676f.w(obj);
                com.onesignal.session.internal.outcomes.impl.d dVar3 = iVar2._outcomeEventsCache;
                dVar.L$0 = iVar2;
                dVar.L$1 = fVar;
                dVar.label = 2;
            }
        }
        dVar = new d(interfaceC0564d);
        Object obj2 = dVar.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
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
    public final Object sendSavedOutcomes(InterfaceC0564d interfaceC0564d) {
        e eVar;
        int i7;
        i iVar;
        i iVar2;
        Iterator it;
        if (interfaceC0564d instanceof e) {
            eVar = (e) interfaceC0564d;
            int i8 = eVar.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                eVar.label = i8 - Integer.MIN_VALUE;
                Object obj = eVar.result;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                i7 = eVar.label;
                if (i7 != 0) {
                    AbstractC0676f.w(obj);
                    com.onesignal.session.internal.outcomes.impl.d dVar = this._outcomeEventsCache;
                    eVar.L$0 = this;
                    eVar.label = 1;
                    obj = dVar.getAllEventsToSend(eVar);
                    if (obj != enumC0580a) {
                        iVar = this;
                    }
                    return enumC0580a;
                }
                if (i7 != 1) {
                    if (i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (Iterator) eVar.L$1;
                    iVar2 = (i) eVar.L$0;
                    AbstractC0676f.w(obj);
                    while (it.hasNext()) {
                        com.onesignal.session.internal.outcomes.impl.f fVar = (com.onesignal.session.internal.outcomes.impl.f) it.next();
                        eVar.L$0 = iVar2;
                        eVar.L$1 = it;
                        eVar.label = 2;
                        if (iVar2.sendSavedOutcomeEvent(fVar, eVar) == enumC0580a) {
                            return enumC0580a;
                        }
                    }
                    return v.f5219a;
                }
                iVar = (i) eVar.L$0;
                AbstractC0676f.w(obj);
                iVar2 = iVar;
                it = ((List) obj).iterator();
                while (it.hasNext()) {
                }
                return v.f5219a;
            }
        }
        eVar = new e(interfaceC0564d);
        Object obj2 = eVar.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = eVar.label;
        if (i7 != 0) {
        }
        iVar2 = iVar;
        it = ((List) obj2).iterator();
        while (it.hasNext()) {
        }
        return v.f5219a;
    }

    private final n setSourceChannelIds(C0406b c0406b, n nVar) {
        int i7 = h.$EnumSwitchMapping$1[c0406b.getInfluenceChannel().ordinal()];
        if (i7 == 1) {
            nVar.setInAppMessagesIds(c0406b.getIds());
            return nVar;
        }
        if (i7 != 2) {
            return nVar;
        }
        nVar.setNotificationIds(c0406b.getIds());
        return nVar;
    }

    @Override // l3.InterfaceC0493a
    public void onSessionActive() {
    }

    @Override // l3.InterfaceC0493a
    public void onSessionEnded(long j4) {
    }

    @Override // l3.InterfaceC0493a
    public void onSessionStarted() {
        com.onesignal.debug.internal.logging.b.debug$default("OutcomeEventsController.sessionStarted: Cleaning outcomes for new session", null, 2, null);
        this.unattributedUniqueOutcomeEventsSentOnSession = new LinkedHashSet();
        saveUnattributedUniqueOutcomeEvents();
    }

    @Override // j3.b
    public Object sendOutcomeEvent(String str, InterfaceC0564d interfaceC0564d) {
        return sendAndCreateOutcomeEvent(str, 0.0f, 0L, this._influenceManager.getInfluences(), interfaceC0564d);
    }

    @Override // j3.b
    public Object sendOutcomeEventWithValue(String str, float f7, InterfaceC0564d interfaceC0564d) {
        return sendAndCreateOutcomeEvent(str, f7, 0L, this._influenceManager.getInfluences(), interfaceC0564d);
    }

    @Override // j3.b
    public Object sendSessionEndOutcomeEvent(long j4, InterfaceC0564d interfaceC0564d) {
        return sendAndCreateOutcomeEvent("os__session_duration", 0.0f, j4, this._influenceManager.getInfluences(), interfaceC0564d);
    }

    @Override // j3.b
    public Object sendUniqueOutcomeEvent(String str, InterfaceC0564d interfaceC0564d) {
        return sendUniqueOutcomeEvent(str, this._influenceManager.getInfluences(), interfaceC0564d);
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
    public final Object sendUniqueOutcomeEvent(String str, List<C0406b> list, InterfaceC0564d interfaceC0564d) {
        f fVar;
        int i7;
        List<C0406b> removeDisabledInfluences;
        i iVar;
        List<C0406b> list2;
        if (interfaceC0564d instanceof f) {
            fVar = (f) interfaceC0564d;
            int i8 = fVar.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                fVar.label = i8 - Integer.MIN_VALUE;
                f fVar2 = fVar;
                Object obj = fVar2.result;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                i7 = fVar2.label;
                if (i7 != 0) {
                    AbstractC0676f.w(obj);
                    removeDisabledInfluences = removeDisabledInfluences(list);
                    if (removeDisabledInfluences.isEmpty()) {
                        com.onesignal.debug.internal.logging.b.debug$default("OutcomeEventsController.sendUniqueOutcomeEvent: Unique Outcome disabled for current session", null, 2, null);
                        return null;
                    }
                    Iterator<C0406b> it = removeDisabledInfluences.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (it.next().getInfluenceType().isAttributed()) {
                                fVar2.L$0 = this;
                                fVar2.L$1 = str;
                                fVar2.L$2 = removeDisabledInfluences;
                                fVar2.label = 1;
                                obj = getUniqueIds(str, removeDisabledInfluences, fVar2);
                                if (obj != enumC0580a) {
                                    iVar = this;
                                }
                            }
                        } else {
                            if (this.unattributedUniqueOutcomeEventsSentOnSession.contains(str)) {
                                com.onesignal.debug.internal.logging.b.debug$default(F5.k.y("\n                    Measure endpoint will not send because unique outcome already sent for:\n                    Session: " + EnumC0408d.UNATTRIBUTED + "\n                    Outcome name: " + str + "\n                    "), null, 2, null);
                                return null;
                            }
                            this.unattributedUniqueOutcomeEventsSentOnSession.add(str);
                            fVar2.label = 3;
                            Object sendAndCreateOutcomeEvent = sendAndCreateOutcomeEvent(str, 0.0f, 0L, removeDisabledInfluences, fVar2);
                            if (sendAndCreateOutcomeEvent != enumC0580a) {
                                return sendAndCreateOutcomeEvent;
                            }
                        }
                    }
                }
                if (i7 != 1) {
                    if (i7 == 2) {
                        AbstractC0676f.w(obj);
                        return obj;
                    }
                    if (i7 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0676f.w(obj);
                    return obj;
                }
                List<C0406b> list3 = (List) fVar2.L$2;
                String str2 = (String) fVar2.L$1;
                iVar = (i) fVar2.L$0;
                AbstractC0676f.w(obj);
                removeDisabledInfluences = list3;
                str = str2;
                list2 = (List) obj;
                if (list2 != null) {
                    com.onesignal.debug.internal.logging.b.debug$default(F5.k.y("\n                    Measure endpoint will not send because unique outcome already sent for:\n                    SessionInfluences: " + removeDisabledInfluences + "\n                    Outcome name: " + str + "\n                    "), null, 2, null);
                    return null;
                }
                fVar2.L$0 = null;
                fVar2.L$1 = null;
                fVar2.L$2 = null;
                fVar2.label = 2;
                Object sendAndCreateOutcomeEvent2 = iVar.sendAndCreateOutcomeEvent(str, 0.0f, 0L, list2, fVar2);
                return sendAndCreateOutcomeEvent2 == enumC0580a ? enumC0580a : sendAndCreateOutcomeEvent2;
            }
        }
        fVar = new f(interfaceC0564d);
        f fVar22 = fVar;
        Object obj2 = fVar22.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = fVar22.label;
        if (i7 != 0) {
        }
        list2 = (List) obj2;
        if (list2 != null) {
        }
    }
}
