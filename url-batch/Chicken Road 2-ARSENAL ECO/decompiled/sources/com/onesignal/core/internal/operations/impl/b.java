package com.onesignal.core.internal.operations.impl;

import H5.AbstractC0165z;
import H5.C0153m;
import H5.InterfaceC0152l;
import H5.InterfaceC0163x;
import H5.S;
import H5.q0;
import com.onesignal.inAppMessages.internal.display.impl.a;
import d2.C0317a;
import g2.InterfaceC0391a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import k5.InterfaceC0475e;
import k5.v;
import kotlin.jvm.internal.s;
import l5.AbstractC0506j;
import l5.AbstractC0507k;
import l5.AbstractC0508l;
import m1.AbstractC0521b;
import o5.InterfaceC0564d;
import p5.EnumC0580a;
import q5.AbstractC0607c;
import u0.AbstractC0676f;
import u3.C0692a;
import x5.InterfaceC0732a;
import x5.InterfaceC0743l;
import x5.InterfaceC0747p;

/* loaded from: classes.dex */
public final class b implements d2.f, com.onesignal.core.internal.startup.b {
    private final com.onesignal.core.internal.config.c _configModelStore;
    private final com.onesignal.core.internal.config.impl.c _identityVerificationService;
    private final com.onesignal.user.internal.jwt.c _jwtTokenStore;
    private final C0692a _newRecordState;
    private final com.onesignal.core.internal.operations.impl.a _operationModelStore;
    private final InterfaceC0391a _time;
    private int enqueueIntoBucket;
    private final Map<String, d2.d> executorsMap;
    private final InterfaceC0152l initialized;
    private boolean paused;
    private final List<C0023b> queue;
    private final com.onesignal.common.threading.d retryWaiter;
    private final InterfaceC0475e scope$delegate;
    private final com.onesignal.common.threading.d waiter;

    public static final class c extends q5.g implements InterfaceC0747p {
        int label;

        public c(InterfaceC0564d interfaceC0564d) {
            super(2, interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(Object obj, InterfaceC0564d interfaceC0564d) {
            return b.this.new c(interfaceC0564d);
        }

        @Override // x5.InterfaceC0747p
        public final Object invoke(InterfaceC0163x interfaceC0163x, InterfaceC0564d interfaceC0564d) {
            return ((c) create(interfaceC0163x, interfaceC0564d)).invokeSuspend(v.f5219a);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            int i7 = this.label;
            if (i7 != 0) {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC0676f.w(obj);
                return obj;
            }
            AbstractC0676f.w(obj);
            com.onesignal.common.threading.d dVar = b.this.retryWaiter;
            this.label = 1;
            Object waitForWake = dVar.waitForWake(this);
            return waitForWake == enumC0580a ? enumC0580a : waitForWake;
        }
    }

    public static final class d extends AbstractC0607c {
        long J$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public d(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.delayForPostCreate(0L, this);
        }
    }

    public static final class e extends q5.g implements InterfaceC0747p {
        final /* synthetic */ boolean $flush;
        final /* synthetic */ d2.g $operation;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(d2.g gVar, boolean z5, InterfaceC0564d interfaceC0564d) {
            super(2, interfaceC0564d);
            this.$operation = gVar;
            this.$flush = z5;
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(Object obj, InterfaceC0564d interfaceC0564d) {
            return b.this.new e(this.$operation, this.$flush, interfaceC0564d);
        }

        @Override // x5.InterfaceC0747p
        public final Object invoke(InterfaceC0163x interfaceC0163x, InterfaceC0564d interfaceC0564d) {
            return ((e) create(interfaceC0163x, interfaceC0564d)).invokeSuspend(v.f5219a);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0676f.w(obj);
            b bVar = b.this;
            b.internalEnqueue$default(bVar, new C0023b(this.$operation, null, bVar.enqueueIntoBucket, 0, 10, null), this.$flush, true, null, 8, null);
            return v.f5219a;
        }
    }

    public static final class f extends q5.g implements InterfaceC0747p {
        final /* synthetic */ boolean $flush;
        final /* synthetic */ d2.g $operation;
        final /* synthetic */ com.onesignal.common.threading.d $waiter;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(d2.g gVar, com.onesignal.common.threading.d dVar, boolean z5, InterfaceC0564d interfaceC0564d) {
            super(2, interfaceC0564d);
            this.$operation = gVar;
            this.$waiter = dVar;
            this.$flush = z5;
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(Object obj, InterfaceC0564d interfaceC0564d) {
            return b.this.new f(this.$operation, this.$waiter, this.$flush, interfaceC0564d);
        }

        @Override // x5.InterfaceC0747p
        public final Object invoke(InterfaceC0163x interfaceC0163x, InterfaceC0564d interfaceC0564d) {
            return ((f) create(interfaceC0163x, interfaceC0564d)).invokeSuspend(v.f5219a);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0676f.w(obj);
            b bVar = b.this;
            b.internalEnqueue$default(bVar, new C0023b(this.$operation, this.$waiter, bVar.enqueueIntoBucket, 0, 8, null), this.$flush, true, null, 8, null);
            return v.f5219a;
        }
    }

    public static final class g extends AbstractC0607c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public g(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.executeOperations$com_onesignal_core(null, this);
        }
    }

    public static final class h extends q5.g implements InterfaceC0743l {
        final /* synthetic */ boolean $ivRequired;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(boolean z5, InterfaceC0564d interfaceC0564d) {
            super(1, interfaceC0564d);
            this.$ivRequired = z5;
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(InterfaceC0564d interfaceC0564d) {
            return b.this.new h(this.$ivRequired, interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            int i7 = this.label;
            if (i7 == 0) {
                AbstractC0676f.w(obj);
                b bVar = b.this;
                this.label = 1;
                if (bVar.awaitInitialized(this) == enumC0580a) {
                    return enumC0580a;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC0676f.w(obj);
            }
            if (this.$ivRequired) {
                b.this.removeOperationsWithoutExternalId$com_onesignal_core();
            }
            b.this.forceExecuteOperations();
            return v.f5219a;
        }

        @Override // x5.InterfaceC0743l
        public final Object invoke(InterfaceC0564d interfaceC0564d) {
            return ((h) create(interfaceC0564d)).invokeSuspend(v.f5219a);
        }
    }

    public static final class i extends AbstractC0607c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public i(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.processQueueForever(this);
        }
    }

    public static final class j extends kotlin.jvm.internal.j implements InterfaceC0732a {
        public static final j INSTANCE = new j();

        public j() {
            super(0);
        }

        @Override // x5.InterfaceC0732a
        public final InterfaceC0163x invoke() {
            new AtomicInteger();
            return AbstractC0165z.b(new S(Executors.newScheduledThreadPool(1, new q0())));
        }
    }

    public static final class k extends kotlin.jvm.internal.j implements InterfaceC0743l {
        public k() {
            super(1);
        }

        @Override // x5.InterfaceC0743l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return v.f5219a;
        }

        public final void invoke(boolean z5) {
            b.this.onJwtConfigHydrated$com_onesignal_core(z5);
        }
    }

    public static final class l extends q5.g implements InterfaceC0747p {
        int label;

        public l(InterfaceC0564d interfaceC0564d) {
            super(2, interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(Object obj, InterfaceC0564d interfaceC0564d) {
            return b.this.new l(interfaceC0564d);
        }

        @Override // x5.InterfaceC0747p
        public final Object invoke(InterfaceC0163x interfaceC0163x, InterfaceC0564d interfaceC0564d) {
            return ((l) create(interfaceC0163x, interfaceC0564d)).invokeSuspend(v.f5219a);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            int i7 = this.label;
            if (i7 == 0) {
                AbstractC0676f.w(obj);
                b.this.loadSavedOperations$com_onesignal_core();
                b bVar = b.this;
                this.label = 1;
                if (bVar.processQueueForever(this) == enumC0580a) {
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
    }

    public static final class m extends AbstractC0607c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public m(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.waitForNewOperationAndExecutionInterval(this);
        }
    }

    public static final class n extends q5.g implements InterfaceC0747p {
        final /* synthetic */ s $wakeMessage;
        Object L$0;
        int label;
        final /* synthetic */ b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(s sVar, b bVar, InterfaceC0564d interfaceC0564d) {
            super(2, interfaceC0564d);
            this.$wakeMessage = sVar;
            this.this$0 = bVar;
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(Object obj, InterfaceC0564d interfaceC0564d) {
            return new n(this.$wakeMessage, this.this$0, interfaceC0564d);
        }

        @Override // x5.InterfaceC0747p
        public final Object invoke(InterfaceC0163x interfaceC0163x, InterfaceC0564d interfaceC0564d) {
            return ((n) create(interfaceC0163x, interfaceC0564d)).invokeSuspend(v.f5219a);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            s sVar;
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            int i7 = this.label;
            if (i7 == 0) {
                AbstractC0676f.w(obj);
                s sVar2 = this.$wakeMessage;
                com.onesignal.common.threading.d dVar = this.this$0.waiter;
                this.L$0 = sVar2;
                this.label = 1;
                Object waitForWake = dVar.waitForWake(this);
                if (waitForWake == enumC0580a) {
                    return enumC0580a;
                }
                sVar = sVar2;
                obj = waitForWake;
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sVar = (s) this.L$0;
                AbstractC0676f.w(obj);
            }
            sVar.f5233f = obj;
            return v.f5219a;
        }
    }

    public b(List<? extends d2.d> executors, com.onesignal.core.internal.operations.impl.a _operationModelStore, com.onesignal.core.internal.config.c _configModelStore, InterfaceC0391a _time, C0692a _newRecordState, com.onesignal.user.internal.jwt.c _jwtTokenStore, com.onesignal.core.internal.config.impl.c _identityVerificationService) {
        kotlin.jvm.internal.i.e(executors, "executors");
        kotlin.jvm.internal.i.e(_operationModelStore, "_operationModelStore");
        kotlin.jvm.internal.i.e(_configModelStore, "_configModelStore");
        kotlin.jvm.internal.i.e(_time, "_time");
        kotlin.jvm.internal.i.e(_newRecordState, "_newRecordState");
        kotlin.jvm.internal.i.e(_jwtTokenStore, "_jwtTokenStore");
        kotlin.jvm.internal.i.e(_identityVerificationService, "_identityVerificationService");
        this._operationModelStore = _operationModelStore;
        this._configModelStore = _configModelStore;
        this._time = _time;
        this._newRecordState = _newRecordState;
        this._jwtTokenStore = _jwtTokenStore;
        this._identityVerificationService = _identityVerificationService;
        this.scope$delegate = AbstractC0521b.x(j.INSTANCE);
        this.queue = new ArrayList();
        this.waiter = new com.onesignal.common.threading.d();
        this.retryWaiter = new com.onesignal.common.threading.d();
        this.initialized = AbstractC0165z.a();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (d2.d dVar : executors) {
            Iterator<String> it = dVar.getOperations().iterator();
            while (it.hasNext()) {
                linkedHashMap.put(it.next(), dVar);
            }
        }
        this.executorsMap = linkedHashMap;
    }

    private final void dropAndWake(List<C0023b> list) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            com.onesignal.common.modeling.b.remove$default(this._operationModelStore, ((C0023b) it.next()).getOperation().getId(), null, 2, null);
        }
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            com.onesignal.common.threading.d waiter = ((C0023b) it2.next()).getWaiter();
            if (waiter != null) {
                waiter.wake(Boolean.FALSE);
            }
        }
    }

    private final int getExecuteBucket() {
        int i7 = this.enqueueIntoBucket;
        if (i7 == 0) {
            return 0;
        }
        return i7 - 1;
    }

    private final List<C0023b> getGroupableOperations(C0023b c0023b) {
        ArrayList A6 = AbstractC0507k.A(c0023b);
        if (c0023b.getOperation().getGroupComparisonType() != d2.c.NONE) {
            String createComparisonKey = c0023b.getOperation().getGroupComparisonType() == d2.c.CREATE ? c0023b.getOperation().getCreateComparisonKey() : c0023b.getOperation().getModifyComparisonKey();
            for (C0023b c0023b2 : AbstractC0506j.P(this.queue)) {
                String createComparisonKey2 = c0023b.getOperation().getGroupComparisonType() == d2.c.CREATE ? c0023b2.getOperation().getCreateComparisonKey() : c0023b2.getOperation().getModifyComparisonKey();
                if (kotlin.jvm.internal.i.a(createComparisonKey2, "") && kotlin.jvm.internal.i.a(createComparisonKey, "")) {
                    throw new Exception("Both comparison keys can not be blank!");
                }
                if (this._newRecordState.canAccess(c0023b2.getOperation().getApplyToRecordId()) && kotlin.jvm.internal.i.a(createComparisonKey2, createComparisonKey)) {
                    this.queue.remove(c0023b2);
                    A6.add(c0023b2);
                }
            }
        }
        return A6;
    }

    private final InterfaceC0163x getScope() {
        return (InterfaceC0163x) this.scope$delegate.getValue();
    }

    private final void internalEnqueue(C0023b c0023b, boolean z5, boolean z6, Integer num) {
        Object obj;
        synchronized (this.queue) {
            try {
                List<C0023b> list = this.queue;
                if (list == null || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        if (kotlin.jvm.internal.i.a(((C0023b) it.next()).getOperation().getId(), c0023b.getOperation().getId())) {
                            com.onesignal.debug.internal.logging.b.debug$default("OperationRepo: internalEnqueue - operation.id: " + c0023b.getOperation().getId() + " already exists in the queue.", null, 2, null);
                            return;
                        }
                    }
                }
                d2.g operation = c0023b.getOperation();
                if (operation instanceof s3.f) {
                    Iterator<T> it2 = this.queue.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it2.next();
                        C0023b c0023b2 = (C0023b) obj;
                        if ((c0023b2.getOperation() instanceof s3.f) && kotlin.jvm.internal.i.a(((s3.f) c0023b2.getOperation()).getOnesignalId(), ((s3.f) operation).getOnesignalId())) {
                            break;
                        }
                    }
                    C0023b c0023b3 = (C0023b) obj;
                    if (c0023b3 != null) {
                        d2.g operation2 = c0023b3.getOperation();
                        kotlin.jvm.internal.i.c(operation2, "null cannot be cast to non-null type com.onesignal.user.internal.operations.LoginUserOperation");
                        s3.f fVar = (s3.f) operation2;
                        String existingOnesignalId = ((s3.f) operation).getExistingOnesignalId();
                        if (existingOnesignalId == null || com.onesignal.common.d.INSTANCE.isLocalId(existingOnesignalId) || fVar.getExistingOnesignalId() != null) {
                            com.onesignal.debug.internal.logging.b.debug$default("OperationRepo: internalEnqueue - LoginUserOperation for onesignalId: " + ((s3.f) operation).getOnesignalId() + " already exists in the queue.", null, 2, null);
                        } else {
                            com.onesignal.debug.internal.logging.b.debug$default("OperationRepo: internalEnqueue - merging existingOnesignalId=" + existingOnesignalId + " into queued LoginUserOperation for onesignalId: " + ((s3.f) operation).getOnesignalId() + '.', null, 2, null);
                            fVar.setExistingOnesignalId$com_onesignal_core(existingOnesignalId);
                        }
                        if (c0023b.getWaiter() == null || c0023b3.getWaiter() != null) {
                            com.onesignal.common.threading.d waiter = c0023b.getWaiter();
                            if (waiter != null) {
                                waiter.wake(Boolean.TRUE);
                            }
                        } else {
                            c0023b3.setWaiter(c0023b.getWaiter());
                        }
                        if (!z6) {
                            com.onesignal.common.modeling.b.remove$default(this._operationModelStore, c0023b.getOperation().getId(), null, 2, null);
                        }
                        return;
                    }
                }
                if (num != null) {
                    this.queue.add(num.intValue(), c0023b);
                } else {
                    this.queue.add(c0023b);
                }
                if (z6) {
                    com.onesignal.common.modeling.b.add$default(this._operationModelStore, c0023b.getOperation(), null, 2, null);
                }
                this.waiter.wake(new a(z5, 0L));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* synthetic */ void internalEnqueue$default(b bVar, C0023b c0023b, boolean z5, boolean z6, Integer num, int i7, Object obj) {
        if ((i7 & 8) != 0) {
            num = null;
        }
        bVar.internalEnqueue(c0023b, z5, z6, num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c5, code lost:
    
        if (r2.executeOperations$com_onesignal_core(r12, r0) == r1) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00dc, code lost:
    
        if (H5.AbstractC0165z.d(r7, r0) == r1) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e7, code lost:
    
        if (r2.waitForNewOperationAndExecutionInterval(r0) == r1) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00dc -> B:14:0x006b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00e7 -> B:13:0x00ea). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object processQueueForever(InterfaceC0564d interfaceC0564d) {
        i iVar;
        int i7;
        b bVar;
        List P6;
        if (interfaceC0564d instanceof i) {
            iVar = (i) interfaceC0564d;
            int i8 = iVar.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                iVar.label = i8 - Integer.MIN_VALUE;
                Object obj = iVar.result;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                i7 = iVar.label;
                if (i7 != 0) {
                    AbstractC0676f.w(obj);
                    iVar.L$0 = this;
                    iVar.label = 1;
                    if (waitForNewOperationAndExecutionInterval(iVar) != enumC0580a) {
                        bVar = this;
                    }
                    return enumC0580a;
                }
                if (i7 == 1) {
                    bVar = (b) iVar.L$0;
                    AbstractC0676f.w(obj);
                } else if (i7 == 2) {
                    bVar = (b) iVar.L$0;
                    AbstractC0676f.w(obj);
                    long opRepoPostWakeDelay = ((com.onesignal.core.internal.config.b) bVar._configModelStore.getModel()).getOpRepoPostWakeDelay();
                    iVar.L$0 = bVar;
                    iVar.label = 3;
                } else {
                    if (i7 != 3) {
                        if (i7 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bVar = (b) iVar.L$0;
                        AbstractC0676f.w(obj);
                        bVar.enqueueIntoBucket++;
                        if (!bVar.paused) {
                            com.onesignal.debug.internal.logging.b.debug$default("OperationRepo is paused", null, 2, null);
                            return v.f5219a;
                        }
                        List<C0023b> nextOps$com_onesignal_core = bVar.getNextOps$com_onesignal_core(bVar.getExecuteBucket());
                        if (com.onesignal.debug.internal.logging.b.atLogLevel(i2.c.DEBUG)) {
                            synchronized (bVar.queue) {
                                P6 = AbstractC0506j.P(bVar.queue);
                            }
                            com.onesignal.debug.internal.logging.b.debug$default("processQueueForever:ops:\n" + nextOps$com_onesignal_core + "\nqueue(" + P6.size() + "):\n" + P6, null, 2, null);
                        }
                        if (nextOps$com_onesignal_core != null) {
                            iVar.L$0 = bVar;
                            iVar.label = 2;
                        } else {
                            iVar.L$0 = bVar;
                            iVar.label = 4;
                        }
                        return enumC0580a;
                    }
                    bVar = (b) iVar.L$0;
                    AbstractC0676f.w(obj);
                    if (!bVar.paused) {
                    }
                }
                bVar.enqueueIntoBucket++;
                if (!bVar.paused) {
                }
            }
        }
        iVar = new i(interfaceC0564d);
        Object obj2 = iVar.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = iVar.label;
        if (i7 != 0) {
        }
        bVar.enqueueIntoBucket++;
        if (!bVar.paused) {
        }
    }

    private final boolean shouldSuppressAnonymousOp(d2.g gVar) {
        boolean z5 = false;
        if (!this._identityVerificationService.getNewCodePathsRun() || (gVar instanceof s3.f)) {
            return false;
        }
        if (((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getUseIdentityVerification$com_onesignal_core() == com.onesignal.user.internal.jwt.b.REQUIRED && gVar.getExternalId() == null) {
            z5 = true;
        }
        if (z5) {
            com.onesignal.debug.internal.logging.b.debug$default("OperationRepo: suppressing anonymous op under IV-required: " + gVar, null, 2, null);
        }
        return z5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x009a, code lost:
    
        if (r11 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x009a -> B:11:0x009d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object waitForNewOperationAndExecutionInterval(InterfaceC0564d interfaceC0564d) {
        m mVar;
        int i7;
        s sVar;
        b bVar;
        s sVar2;
        long opRepoExecutionInterval;
        s sVar3;
        b bVar2;
        if (interfaceC0564d instanceof m) {
            mVar = (m) interfaceC0564d;
            int i8 = mVar.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                mVar.label = i8 - Integer.MIN_VALUE;
                Object obj = mVar.result;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                i7 = mVar.label;
                if (i7 != 0) {
                    AbstractC0676f.w(obj);
                    sVar = new s();
                    com.onesignal.common.threading.d dVar = this.waiter;
                    mVar.L$0 = this;
                    mVar.L$1 = sVar;
                    mVar.L$2 = sVar;
                    mVar.label = 1;
                    obj = dVar.waitForWake(mVar);
                    if (obj != enumC0580a) {
                        bVar = this;
                        sVar2 = sVar;
                    }
                    return enumC0580a;
                }
                if (i7 != 1) {
                    if (i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sVar3 = (s) mVar.L$1;
                    bVar2 = (b) mVar.L$0;
                    AbstractC0676f.w(obj);
                    if (obj != null) {
                        opRepoExecutionInterval = ((com.onesignal.core.internal.config.b) bVar2._configModelStore.getModel()).getOpRepoExecutionInterval();
                        if (!((a) sVar3.f5233f).getForce()) {
                            n nVar = new n(sVar3, bVar2, null);
                            mVar.L$0 = bVar2;
                            mVar.L$1 = sVar3;
                            mVar.L$2 = null;
                            mVar.label = 2;
                            obj = AbstractC0165z.v(opRepoExecutionInterval, nVar, mVar);
                        }
                    }
                    return v.f5219a;
                }
                sVar = (s) mVar.L$2;
                sVar2 = (s) mVar.L$1;
                bVar = (b) mVar.L$0;
                AbstractC0676f.w(obj);
                sVar.f5233f = obj;
                opRepoExecutionInterval = ((com.onesignal.core.internal.config.b) bVar._configModelStore.getModel()).getOpRepoExecutionInterval() - ((a) sVar2.f5233f).getPreviousWaitedTime();
                sVar3 = sVar2;
                bVar2 = bVar;
                if (!((a) sVar3.f5233f).getForce()) {
                }
                return v.f5219a;
            }
        }
        mVar = new m(interfaceC0564d);
        Object obj2 = mVar.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = mVar.label;
        if (i7 != 0) {
        }
        sVar.f5233f = obj2;
        opRepoExecutionInterval = ((com.onesignal.core.internal.config.b) bVar._configModelStore.getModel()).getOpRepoExecutionInterval() - ((a) sVar2.f5233f).getPreviousWaitedTime();
        sVar3 = sVar2;
        bVar2 = bVar;
        if (!((a) sVar3.f5233f).getForce()) {
        }
        return v.f5219a;
    }

    @Override // d2.f
    public Object awaitInitialized(InterfaceC0564d interfaceC0564d) {
        Object T6 = ((C0153m) this.initialized).T(interfaceC0564d);
        return T6 == EnumC0580a.f5697f ? T6 : v.f5219a;
    }

    @Override // d2.f
    public <T extends d2.g> boolean containsInstanceOf(D5.c type) {
        boolean z5;
        kotlin.jvm.internal.i.e(type, "type");
        synchronized (this.queue) {
            try {
                List<C0023b> list = this.queue;
                z5 = false;
                if (list == null || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (((kotlin.jvm.internal.d) type).c(((C0023b) it.next()).getOperation())) {
                            z5 = true;
                            break;
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z5;
    }

    public final Object delayBeforeNextExecution(int i7, Integer num, InterfaceC0564d interfaceC0564d) {
        com.onesignal.debug.internal.logging.b.debug$default("retryAfterSeconds: " + num, null, 2, null);
        long max = Math.max(((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getOpRepoDefaultFailRetryBackoff() * i7, (num != null ? num.intValue() : 0L) * 1000);
        v vVar = v.f5219a;
        if (max < 1) {
            return vVar;
        }
        com.onesignal.debug.internal.logging.b.debug$default("Operations being delay for: " + max + " ms", null, 2, null);
        Object v5 = AbstractC0165z.v(max, new c(null), interfaceC0564d);
        return v5 == EnumC0580a.f5697f ? v5 : vVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object delayForPostCreate(long j4, InterfaceC0564d interfaceC0564d) {
        d dVar;
        int i7;
        b bVar;
        if (interfaceC0564d instanceof d) {
            dVar = (d) interfaceC0564d;
            int i8 = dVar.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                dVar.label = i8 - Integer.MIN_VALUE;
                Object obj = dVar.result;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                i7 = dVar.label;
                if (i7 != 0) {
                    AbstractC0676f.w(obj);
                    dVar.L$0 = this;
                    dVar.J$0 = j4;
                    dVar.label = 1;
                    if (AbstractC0165z.d(j4, dVar) == enumC0580a) {
                        return enumC0580a;
                    }
                    bVar = this;
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j4 = dVar.J$0;
                    bVar = (b) dVar.L$0;
                    AbstractC0676f.w(obj);
                }
                synchronized (bVar.queue) {
                    if (!bVar.queue.isEmpty()) {
                        bVar.waiter.wake(new a(false, j4));
                    }
                }
                return v.f5219a;
            }
        }
        dVar = new d(interfaceC0564d);
        Object obj2 = dVar.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = dVar.label;
        if (i7 != 0) {
        }
        synchronized (bVar.queue) {
        }
    }

    @Override // d2.f
    public void enqueue(d2.g operation, boolean z5) {
        kotlin.jvm.internal.i.e(operation, "operation");
        if (shouldSuppressAnonymousOp(operation)) {
            return;
        }
        com.onesignal.debug.internal.logging.b.log(i2.c.DEBUG, "OperationRepo.enqueue(operation: " + operation + ", flush: " + z5 + ')');
        String uuid = UUID.randomUUID().toString();
        kotlin.jvm.internal.i.d(uuid, "toString(...)");
        operation.setId(uuid);
        AbstractC0165z.l(getScope(), null, new e(operation, z5, null), 3);
    }

    @Override // d2.f
    public Object enqueueAndWait(d2.g gVar, boolean z5, InterfaceC0564d interfaceC0564d) {
        if (shouldSuppressAnonymousOp(gVar)) {
            return Boolean.FALSE;
        }
        com.onesignal.debug.internal.logging.b.log(i2.c.DEBUG, "OperationRepo.enqueueAndWait(operation: " + gVar + ", force: " + z5 + ')');
        String uuid = UUID.randomUUID().toString();
        kotlin.jvm.internal.i.d(uuid, "toString(...)");
        gVar.setId(uuid);
        com.onesignal.common.threading.d dVar = new com.onesignal.common.threading.d();
        AbstractC0165z.l(getScope(), null, new f(gVar, dVar, z5, null), 3);
        return dVar.waitForWake(interfaceC0564d);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(9:5|6|7|(1:(1:(1:(5:12|13|14|15|16)(2:19|20))(9:21|22|23|24|25|(1:27)|14|15|16))(4:34|35|36|37))(4:190|191|192|(6:194|(2:197|195)|198|199|(1:201)|29)(2:202|203))|38|39|(8:41|(2:44|42)|45|46|11b|55|(2:58|56)|59)|64|65))|207|6|7|(0)(0)|38|39|(0)|64|65|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0116, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x003f, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0396, code lost:
    
        if (r0 == r5) goto L168;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01d7 A[Catch: all -> 0x0116, TryCatch #3 {all -> 0x0116, blocks: (B:39:0x00da, B:41:0x00fa, B:42:0x00fe, B:44:0x0104, B:46:0x0119, B:47:0x011b, B:54:0x013c, B:55:0x013d, B:56:0x0149, B:58:0x014f, B:62:0x015b, B:63:0x015c, B:64:0x015d, B:65:0x016a, B:67:0x0303, B:69:0x0309, B:70:0x030b, B:77:0x035d, B:81:0x035f, B:82:0x0360, B:83:0x0361, B:86:0x0170, B:87:0x018a, B:89:0x0190, B:92:0x019c, B:97:0x01a2, B:98:0x01a4, B:106:0x01d3, B:110:0x01d5, B:111:0x01d6, B:112:0x01d7, B:113:0x01ed, B:125:0x021e, B:130:0x0221, B:131:0x0222, B:132:0x0223, B:134:0x0236, B:135:0x023b, B:136:0x023d, B:154:0x027a, B:159:0x027d, B:160:0x027e, B:161:0x027f, B:162:0x0298, B:164:0x02a0, B:167:0x02b0, B:168:0x02c9, B:169:0x02cd, B:171:0x02d3, B:173:0x02e7, B:174:0x02eb, B:176:0x02f1, B:179:0x02fd, B:100:0x01a5, B:101:0x01ad, B:103:0x01b3, B:115:0x01ee, B:116:0x01f7, B:118:0x01fd, B:120:0x0211, B:122:0x0218, B:49:0x011c, B:50:0x0122, B:52:0x0128, B:72:0x030c, B:73:0x0318, B:75:0x031e, B:138:0x023e, B:139:0x0247, B:141:0x024d, B:144:0x025a, B:149:0x0260, B:150:0x0268, B:152:0x026e), top: B:38:0x00da, inners: #1, #2, #4, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0223 A[Catch: all -> 0x0116, TryCatch #3 {all -> 0x0116, blocks: (B:39:0x00da, B:41:0x00fa, B:42:0x00fe, B:44:0x0104, B:46:0x0119, B:47:0x011b, B:54:0x013c, B:55:0x013d, B:56:0x0149, B:58:0x014f, B:62:0x015b, B:63:0x015c, B:64:0x015d, B:65:0x016a, B:67:0x0303, B:69:0x0309, B:70:0x030b, B:77:0x035d, B:81:0x035f, B:82:0x0360, B:83:0x0361, B:86:0x0170, B:87:0x018a, B:89:0x0190, B:92:0x019c, B:97:0x01a2, B:98:0x01a4, B:106:0x01d3, B:110:0x01d5, B:111:0x01d6, B:112:0x01d7, B:113:0x01ed, B:125:0x021e, B:130:0x0221, B:131:0x0222, B:132:0x0223, B:134:0x0236, B:135:0x023b, B:136:0x023d, B:154:0x027a, B:159:0x027d, B:160:0x027e, B:161:0x027f, B:162:0x0298, B:164:0x02a0, B:167:0x02b0, B:168:0x02c9, B:169:0x02cd, B:171:0x02d3, B:173:0x02e7, B:174:0x02eb, B:176:0x02f1, B:179:0x02fd, B:100:0x01a5, B:101:0x01ad, B:103:0x01b3, B:115:0x01ee, B:116:0x01f7, B:118:0x01fd, B:120:0x0211, B:122:0x0218, B:49:0x011c, B:50:0x0122, B:52:0x0128, B:72:0x030c, B:73:0x0318, B:75:0x031e, B:138:0x023e, B:139:0x0247, B:141:0x024d, B:144:0x025a, B:149:0x0260, B:150:0x0268, B:152:0x026e), top: B:38:0x00da, inners: #1, #2, #4, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x027f A[Catch: all -> 0x0116, TryCatch #3 {all -> 0x0116, blocks: (B:39:0x00da, B:41:0x00fa, B:42:0x00fe, B:44:0x0104, B:46:0x0119, B:47:0x011b, B:54:0x013c, B:55:0x013d, B:56:0x0149, B:58:0x014f, B:62:0x015b, B:63:0x015c, B:64:0x015d, B:65:0x016a, B:67:0x0303, B:69:0x0309, B:70:0x030b, B:77:0x035d, B:81:0x035f, B:82:0x0360, B:83:0x0361, B:86:0x0170, B:87:0x018a, B:89:0x0190, B:92:0x019c, B:97:0x01a2, B:98:0x01a4, B:106:0x01d3, B:110:0x01d5, B:111:0x01d6, B:112:0x01d7, B:113:0x01ed, B:125:0x021e, B:130:0x0221, B:131:0x0222, B:132:0x0223, B:134:0x0236, B:135:0x023b, B:136:0x023d, B:154:0x027a, B:159:0x027d, B:160:0x027e, B:161:0x027f, B:162:0x0298, B:164:0x02a0, B:167:0x02b0, B:168:0x02c9, B:169:0x02cd, B:171:0x02d3, B:173:0x02e7, B:174:0x02eb, B:176:0x02f1, B:179:0x02fd, B:100:0x01a5, B:101:0x01ad, B:103:0x01b3, B:115:0x01ee, B:116:0x01f7, B:118:0x01fd, B:120:0x0211, B:122:0x0218, B:49:0x011c, B:50:0x0122, B:52:0x0128, B:72:0x030c, B:73:0x0318, B:75:0x031e, B:138:0x023e, B:139:0x0247, B:141:0x024d, B:144:0x025a, B:149:0x0260, B:150:0x0268, B:152:0x026e), top: B:38:0x00da, inners: #1, #2, #4, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0298 A[Catch: all -> 0x0116, TryCatch #3 {all -> 0x0116, blocks: (B:39:0x00da, B:41:0x00fa, B:42:0x00fe, B:44:0x0104, B:46:0x0119, B:47:0x011b, B:54:0x013c, B:55:0x013d, B:56:0x0149, B:58:0x014f, B:62:0x015b, B:63:0x015c, B:64:0x015d, B:65:0x016a, B:67:0x0303, B:69:0x0309, B:70:0x030b, B:77:0x035d, B:81:0x035f, B:82:0x0360, B:83:0x0361, B:86:0x0170, B:87:0x018a, B:89:0x0190, B:92:0x019c, B:97:0x01a2, B:98:0x01a4, B:106:0x01d3, B:110:0x01d5, B:111:0x01d6, B:112:0x01d7, B:113:0x01ed, B:125:0x021e, B:130:0x0221, B:131:0x0222, B:132:0x0223, B:134:0x0236, B:135:0x023b, B:136:0x023d, B:154:0x027a, B:159:0x027d, B:160:0x027e, B:161:0x027f, B:162:0x0298, B:164:0x02a0, B:167:0x02b0, B:168:0x02c9, B:169:0x02cd, B:171:0x02d3, B:173:0x02e7, B:174:0x02eb, B:176:0x02f1, B:179:0x02fd, B:100:0x01a5, B:101:0x01ad, B:103:0x01b3, B:115:0x01ee, B:116:0x01f7, B:118:0x01fd, B:120:0x0211, B:122:0x0218, B:49:0x011c, B:50:0x0122, B:52:0x0128, B:72:0x030c, B:73:0x0318, B:75:0x031e, B:138:0x023e, B:139:0x0247, B:141:0x024d, B:144:0x025a, B:149:0x0260, B:150:0x0268, B:152:0x026e), top: B:38:0x00da, inners: #1, #2, #4, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02c9 A[Catch: all -> 0x0116, TryCatch #3 {all -> 0x0116, blocks: (B:39:0x00da, B:41:0x00fa, B:42:0x00fe, B:44:0x0104, B:46:0x0119, B:47:0x011b, B:54:0x013c, B:55:0x013d, B:56:0x0149, B:58:0x014f, B:62:0x015b, B:63:0x015c, B:64:0x015d, B:65:0x016a, B:67:0x0303, B:69:0x0309, B:70:0x030b, B:77:0x035d, B:81:0x035f, B:82:0x0360, B:83:0x0361, B:86:0x0170, B:87:0x018a, B:89:0x0190, B:92:0x019c, B:97:0x01a2, B:98:0x01a4, B:106:0x01d3, B:110:0x01d5, B:111:0x01d6, B:112:0x01d7, B:113:0x01ed, B:125:0x021e, B:130:0x0221, B:131:0x0222, B:132:0x0223, B:134:0x0236, B:135:0x023b, B:136:0x023d, B:154:0x027a, B:159:0x027d, B:160:0x027e, B:161:0x027f, B:162:0x0298, B:164:0x02a0, B:167:0x02b0, B:168:0x02c9, B:169:0x02cd, B:171:0x02d3, B:173:0x02e7, B:174:0x02eb, B:176:0x02f1, B:179:0x02fd, B:100:0x01a5, B:101:0x01ad, B:103:0x01b3, B:115:0x01ee, B:116:0x01f7, B:118:0x01fd, B:120:0x0211, B:122:0x0218, B:49:0x011c, B:50:0x0122, B:52:0x0128, B:72:0x030c, B:73:0x0318, B:75:0x031e, B:138:0x023e, B:139:0x0247, B:141:0x024d, B:144:0x025a, B:149:0x0260, B:150:0x0268, B:152:0x026e), top: B:38:0x00da, inners: #1, #2, #4, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x037d A[Catch: all -> 0x003f, TRY_LEAVE, TryCatch #9 {all -> 0x003f, blocks: (B:13:0x003a, B:25:0x0377, B:27:0x037d), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fa A[Catch: all -> 0x0116, TryCatch #3 {all -> 0x0116, blocks: (B:39:0x00da, B:41:0x00fa, B:42:0x00fe, B:44:0x0104, B:46:0x0119, B:47:0x011b, B:54:0x013c, B:55:0x013d, B:56:0x0149, B:58:0x014f, B:62:0x015b, B:63:0x015c, B:64:0x015d, B:65:0x016a, B:67:0x0303, B:69:0x0309, B:70:0x030b, B:77:0x035d, B:81:0x035f, B:82:0x0360, B:83:0x0361, B:86:0x0170, B:87:0x018a, B:89:0x0190, B:92:0x019c, B:97:0x01a2, B:98:0x01a4, B:106:0x01d3, B:110:0x01d5, B:111:0x01d6, B:112:0x01d7, B:113:0x01ed, B:125:0x021e, B:130:0x0221, B:131:0x0222, B:132:0x0223, B:134:0x0236, B:135:0x023b, B:136:0x023d, B:154:0x027a, B:159:0x027d, B:160:0x027e, B:161:0x027f, B:162:0x0298, B:164:0x02a0, B:167:0x02b0, B:168:0x02c9, B:169:0x02cd, B:171:0x02d3, B:173:0x02e7, B:174:0x02eb, B:176:0x02f1, B:179:0x02fd, B:100:0x01a5, B:101:0x01ad, B:103:0x01b3, B:115:0x01ee, B:116:0x01f7, B:118:0x01fd, B:120:0x0211, B:122:0x0218, B:49:0x011c, B:50:0x0122, B:52:0x0128, B:72:0x030c, B:73:0x0318, B:75:0x031e, B:138:0x023e, B:139:0x0247, B:141:0x024d, B:144:0x025a, B:149:0x0260, B:150:0x0268, B:152:0x026e), top: B:38:0x00da, inners: #1, #2, #4, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0309 A[Catch: all -> 0x0116, TryCatch #3 {all -> 0x0116, blocks: (B:39:0x00da, B:41:0x00fa, B:42:0x00fe, B:44:0x0104, B:46:0x0119, B:47:0x011b, B:54:0x013c, B:55:0x013d, B:56:0x0149, B:58:0x014f, B:62:0x015b, B:63:0x015c, B:64:0x015d, B:65:0x016a, B:67:0x0303, B:69:0x0309, B:70:0x030b, B:77:0x035d, B:81:0x035f, B:82:0x0360, B:83:0x0361, B:86:0x0170, B:87:0x018a, B:89:0x0190, B:92:0x019c, B:97:0x01a2, B:98:0x01a4, B:106:0x01d3, B:110:0x01d5, B:111:0x01d6, B:112:0x01d7, B:113:0x01ed, B:125:0x021e, B:130:0x0221, B:131:0x0222, B:132:0x0223, B:134:0x0236, B:135:0x023b, B:136:0x023d, B:154:0x027a, B:159:0x027d, B:160:0x027e, B:161:0x027f, B:162:0x0298, B:164:0x02a0, B:167:0x02b0, B:168:0x02c9, B:169:0x02cd, B:171:0x02d3, B:173:0x02e7, B:174:0x02eb, B:176:0x02f1, B:179:0x02fd, B:100:0x01a5, B:101:0x01ad, B:103:0x01b3, B:115:0x01ee, B:116:0x01f7, B:118:0x01fd, B:120:0x0211, B:122:0x0218, B:49:0x011c, B:50:0x0122, B:52:0x0128, B:72:0x030c, B:73:0x0318, B:75:0x031e, B:138:0x023e, B:139:0x0247, B:141:0x024d, B:144:0x025a, B:149:0x0260, B:150:0x0268, B:152:0x026e), top: B:38:0x00da, inners: #1, #2, #4, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0170 A[Catch: all -> 0x0116, TryCatch #3 {all -> 0x0116, blocks: (B:39:0x00da, B:41:0x00fa, B:42:0x00fe, B:44:0x0104, B:46:0x0119, B:47:0x011b, B:54:0x013c, B:55:0x013d, B:56:0x0149, B:58:0x014f, B:62:0x015b, B:63:0x015c, B:64:0x015d, B:65:0x016a, B:67:0x0303, B:69:0x0309, B:70:0x030b, B:77:0x035d, B:81:0x035f, B:82:0x0360, B:83:0x0361, B:86:0x0170, B:87:0x018a, B:89:0x0190, B:92:0x019c, B:97:0x01a2, B:98:0x01a4, B:106:0x01d3, B:110:0x01d5, B:111:0x01d6, B:112:0x01d7, B:113:0x01ed, B:125:0x021e, B:130:0x0221, B:131:0x0222, B:132:0x0223, B:134:0x0236, B:135:0x023b, B:136:0x023d, B:154:0x027a, B:159:0x027d, B:160:0x027e, B:161:0x027f, B:162:0x0298, B:164:0x02a0, B:167:0x02b0, B:168:0x02c9, B:169:0x02cd, B:171:0x02d3, B:173:0x02e7, B:174:0x02eb, B:176:0x02f1, B:179:0x02fd, B:100:0x01a5, B:101:0x01ad, B:103:0x01b3, B:115:0x01ee, B:116:0x01f7, B:118:0x01fd, B:120:0x0211, B:122:0x0218, B:49:0x011c, B:50:0x0122, B:52:0x0128, B:72:0x030c, B:73:0x0318, B:75:0x031e, B:138:0x023e, B:139:0x0247, B:141:0x024d, B:144:0x025a, B:149:0x0260, B:150:0x0268, B:152:0x026e), top: B:38:0x00da, inners: #1, #2, #4, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.onesignal.core.internal.operations.impl.b] */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object executeOperations$com_onesignal_core(List<C0023b> list, InterfaceC0564d interfaceC0564d) {
        g gVar;
        int i7;
        ArrayList arrayList;
        C0023b c0023b;
        b bVar;
        C0317a c0317a;
        int i8;
        Integer retryAfterSeconds;
        b bVar2;
        List<C0023b> list2 = list;
        ?? r32 = "Could not find executor for operation ";
        if (interfaceC0564d instanceof g) {
            gVar = (g) interfaceC0564d;
            int i9 = gVar.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                gVar.label = i9 - Integer.MIN_VALUE;
                Object obj = gVar.result;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                i7 = gVar.label;
                if (i7 != 0) {
                    AbstractC0676f.w(obj);
                    try {
                        C0023b c0023b2 = (C0023b) AbstractC0506j.E(list2);
                        d2.d dVar = this.executorsMap.get(c0023b2.getOperation().getName());
                        if (dVar == null) {
                            throw new Exception("Could not find executor for operation " + c0023b2.getOperation().getName());
                        }
                        arrayList = new ArrayList(AbstractC0508l.C(list2, 10));
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((C0023b) it.next()).getOperation());
                        }
                        gVar.L$0 = this;
                        gVar.L$1 = list2;
                        gVar.L$2 = c0023b2;
                        gVar.L$3 = arrayList;
                        gVar.label = 1;
                        Object execute = dVar.execute(arrayList, gVar);
                        if (execute != enumC0580a) {
                            c0023b = c0023b2;
                            obj = execute;
                            bVar = this;
                        }
                        return enumC0580a;
                    } catch (Throwable th) {
                        th = th;
                        r32 = this;
                        com.onesignal.debug.internal.logging.b.log(i2.c.ERROR, "Error attempting to execute operation: " + list2, th);
                        r32.dropAndWake(list2);
                        return v.f5219a;
                    }
                }
                if (i7 != 1) {
                    if (i7 != 2) {
                        if (i7 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        list2 = (List) gVar.L$1;
                        b bVar3 = (b) gVar.L$0;
                        AbstractC0676f.w(obj);
                        r32 = bVar3;
                        return v.f5219a;
                    }
                    C0317a c0317a2 = (C0317a) gVar.L$2;
                    List<C0023b> list3 = (List) gVar.L$1;
                    b bVar4 = (b) gVar.L$0;
                    try {
                        AbstractC0676f.w(obj);
                        c0317a = c0317a2;
                        list2 = list3;
                        bVar2 = bVar4;
                        r32 = bVar2;
                        if (c0317a.getIdTranslations() != null) {
                            long opRepoPostCreateDelay = ((com.onesignal.core.internal.config.b) bVar2._configModelStore.getModel()).getOpRepoPostCreateDelay();
                            gVar.L$0 = bVar2;
                            gVar.L$1 = list2;
                            gVar.L$2 = null;
                            gVar.label = 3;
                            Object delayForPostCreate = bVar2.delayForPostCreate(opRepoPostCreateDelay, gVar);
                            r32 = bVar2;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        list2 = list3;
                        r32 = bVar4;
                        com.onesignal.debug.internal.logging.b.log(i2.c.ERROR, "Error attempting to execute operation: " + list2, th);
                        r32.dropAndWake(list2);
                        return v.f5219a;
                    }
                    return v.f5219a;
                }
                ?? r22 = (List) gVar.L$3;
                C0023b c0023b3 = (C0023b) gVar.L$2;
                List<C0023b> list4 = (List) gVar.L$1;
                bVar = (b) gVar.L$0;
                try {
                    AbstractC0676f.w(obj);
                    arrayList = r22;
                    list2 = list4;
                    c0023b = c0023b3;
                } catch (Throwable th3) {
                    th = th3;
                    list2 = list4;
                    r32 = bVar;
                    com.onesignal.debug.internal.logging.b.log(i2.c.ERROR, "Error attempting to execute operation: " + list2, th);
                    r32.dropAndWake(list2);
                    return v.f5219a;
                }
                c0317a = (C0317a) obj;
                com.onesignal.debug.internal.logging.b.debug$default("OperationRepo: execute response = " + c0317a.getResult(), null, 2, null);
                if (c0317a.getIdTranslations() != null) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        ((C0023b) it2.next()).getOperation().translateIds(c0317a.getIdTranslations());
                    }
                    synchronized (bVar.queue) {
                        Iterator it3 = bVar.queue.iterator();
                        while (it3.hasNext()) {
                            ((C0023b) it3.next()).getOperation().translateIds(c0317a.getIdTranslations());
                        }
                    }
                    Iterator it4 = c0317a.getIdTranslations().values().iterator();
                    while (it4.hasNext()) {
                        bVar._newRecordState.add((String) it4.next());
                    }
                }
                switch (com.onesignal.core.internal.operations.impl.c.$EnumSwitchMapping$0[c0317a.getResult().ordinal()]) {
                    case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                        Iterator it5 = list2.iterator();
                        while (it5.hasNext()) {
                            com.onesignal.common.modeling.b.remove$default(bVar._operationModelStore, ((C0023b) it5.next()).getOperation().getId(), null, 2, null);
                        }
                        Iterator it6 = list2.iterator();
                        while (it6.hasNext()) {
                            com.onesignal.common.threading.d waiter = ((C0023b) it6.next()).getWaiter();
                            if (waiter != null) {
                                waiter.wake(Boolean.TRUE);
                            }
                        }
                        i8 = 0;
                        if (c0317a.getOperations() != null) {
                            synchronized (bVar.queue) {
                                for (d2.g gVar2 : AbstractC0506j.M(c0317a.getOperations())) {
                                    String uuid = UUID.randomUUID().toString();
                                    kotlin.jvm.internal.i.d(uuid, "toString(...)");
                                    gVar2.setId(uuid);
                                    C0023b c0023b4 = new C0023b(gVar2, null, 0, 0, 10, null);
                                    bVar.queue.add(0, c0023b4);
                                    com.onesignal.common.modeling.b.add$default(bVar._operationModelStore, 0, c0023b4.getOperation(), null, 4, null);
                                }
                            }
                        }
                        retryAfterSeconds = c0317a.getRetryAfterSeconds();
                        gVar.L$0 = bVar;
                        gVar.L$1 = list2;
                        gVar.L$2 = c0317a;
                        gVar.L$3 = null;
                        gVar.label = 2;
                        if (bVar.delayBeforeNextExecution(i8, retryAfterSeconds, gVar) != enumC0580a) {
                            bVar2 = bVar;
                            r32 = bVar2;
                            if (c0317a.getIdTranslations() != null) {
                            }
                            return v.f5219a;
                        }
                        return enumC0580a;
                    case com.onesignal.core.internal.permissions.h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                        if (!bVar._identityVerificationService.getNewCodePathsRun() || !com.onesignal.core.internal.operations.impl.d.handleFailUnauthorized(bVar, c0023b, list2, bVar._jwtTokenStore, bVar._identityVerificationService.getIvBehaviorActive())) {
                            com.onesignal.debug.internal.logging.b.warn$default("Operation execution failed without retry: " + arrayList, null, 2, null);
                            bVar.dropAndWake(list2);
                        }
                        i8 = 0;
                        if (c0317a.getOperations() != null) {
                        }
                        retryAfterSeconds = c0317a.getRetryAfterSeconds();
                        gVar.L$0 = bVar;
                        gVar.L$1 = list2;
                        gVar.L$2 = c0317a;
                        gVar.L$3 = null;
                        gVar.label = 2;
                        if (bVar.delayBeforeNextExecution(i8, retryAfterSeconds, gVar) != enumC0580a) {
                        }
                        return enumC0580a;
                    case 3:
                    case 4:
                        com.onesignal.debug.internal.logging.b.warn$default("Operation execution failed without retry: " + arrayList, null, 2, null);
                        bVar.dropAndWake(list2);
                        i8 = 0;
                        if (c0317a.getOperations() != null) {
                        }
                        retryAfterSeconds = c0317a.getRetryAfterSeconds();
                        gVar.L$0 = bVar;
                        gVar.L$1 = list2;
                        gVar.L$2 = c0317a;
                        gVar.L$3 = null;
                        gVar.label = 2;
                        if (bVar.delayBeforeNextExecution(i8, retryAfterSeconds, gVar) != enumC0580a) {
                        }
                        return enumC0580a;
                    case 5:
                        com.onesignal.common.modeling.b.remove$default(bVar._operationModelStore, c0023b.getOperation().getId(), null, 2, null);
                        com.onesignal.common.threading.d waiter2 = c0023b.getWaiter();
                        if (waiter2 != null) {
                            waiter2.wake(Boolean.TRUE);
                        }
                        synchronized (bVar.queue) {
                            try {
                                ArrayList arrayList2 = new ArrayList();
                                for (Object obj2 : list2) {
                                    if (!kotlin.jvm.internal.i.a((C0023b) obj2, c0023b)) {
                                        arrayList2.add(obj2);
                                    }
                                }
                                Iterator it7 = AbstractC0506j.M(arrayList2).iterator();
                                while (it7.hasNext()) {
                                    bVar.queue.add(0, (C0023b) it7.next());
                                }
                            } finally {
                            }
                        }
                        i8 = 0;
                        if (c0317a.getOperations() != null) {
                        }
                        retryAfterSeconds = c0317a.getRetryAfterSeconds();
                        gVar.L$0 = bVar;
                        gVar.L$1 = list2;
                        gVar.L$2 = c0317a;
                        gVar.L$3 = null;
                        gVar.label = 2;
                        if (bVar.delayBeforeNextExecution(i8, retryAfterSeconds, gVar) != enumC0580a) {
                        }
                        return enumC0580a;
                    case 6:
                        com.onesignal.debug.internal.logging.b.info$default("Operation execution failed, retrying: " + arrayList, null, 2, null);
                        synchronized (bVar.queue) {
                            try {
                                i8 = 0;
                                for (C0023b c0023b5 : AbstractC0506j.M(list2)) {
                                    c0023b5.setRetries(c0023b5.getRetries() + 1);
                                    if (c0023b5.getRetries() > i8) {
                                        i8 = c0023b5.getRetries();
                                    }
                                    bVar.queue.add(0, c0023b5);
                                }
                            } finally {
                            }
                        }
                        if (c0317a.getOperations() != null) {
                        }
                        retryAfterSeconds = c0317a.getRetryAfterSeconds();
                        gVar.L$0 = bVar;
                        gVar.L$1 = list2;
                        gVar.L$2 = c0317a;
                        gVar.L$3 = null;
                        gVar.label = 2;
                        if (bVar.delayBeforeNextExecution(i8, retryAfterSeconds, gVar) != enumC0580a) {
                        }
                        return enumC0580a;
                    case 7:
                        com.onesignal.debug.internal.logging.b.error$default("Operation execution failed with eventual retry, pausing the operation repo: " + arrayList, null, 2, null);
                        bVar.paused = true;
                        Iterator it8 = list2.iterator();
                        while (it8.hasNext()) {
                            com.onesignal.common.threading.d waiter3 = ((C0023b) it8.next()).getWaiter();
                            if (waiter3 != null) {
                                waiter3.wake(Boolean.FALSE);
                            }
                        }
                        synchronized (bVar.queue) {
                            for (C0023b c0023b6 : AbstractC0506j.M(list2)) {
                                bVar.queue.add(0, new C0023b(c0023b6.getOperation(), null, c0023b6.getBucket(), c0023b6.getRetries()));
                            }
                        }
                        i8 = 0;
                        if (c0317a.getOperations() != null) {
                        }
                        retryAfterSeconds = c0317a.getRetryAfterSeconds();
                        gVar.L$0 = bVar;
                        gVar.L$1 = list2;
                        gVar.L$2 = c0317a;
                        gVar.L$3 = null;
                        gVar.label = 2;
                        if (bVar.delayBeforeNextExecution(i8, retryAfterSeconds, gVar) != enumC0580a) {
                        }
                        return enumC0580a;
                    default:
                        i8 = 0;
                        if (c0317a.getOperations() != null) {
                        }
                        retryAfterSeconds = c0317a.getRetryAfterSeconds();
                        gVar.L$0 = bVar;
                        gVar.L$1 = list2;
                        gVar.L$2 = c0317a;
                        gVar.L$3 = null;
                        gVar.label = 2;
                        if (bVar.delayBeforeNextExecution(i8, retryAfterSeconds, gVar) != enumC0580a) {
                        }
                        return enumC0580a;
                }
            }
        }
        gVar = new g(interfaceC0564d);
        Object obj3 = gVar.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = gVar.label;
        if (i7 != 0) {
        }
        c0317a = (C0317a) obj3;
        com.onesignal.debug.internal.logging.b.debug$default("OperationRepo: execute response = " + c0317a.getResult(), null, 2, null);
        if (c0317a.getIdTranslations() != null) {
        }
        switch (com.onesignal.core.internal.operations.impl.c.$EnumSwitchMapping$0[c0317a.getResult().ordinal()]) {
        }
    }

    @Override // d2.f
    public void forceExecuteOperations() {
        int i7 = 2;
        kotlin.jvm.internal.e eVar = null;
        long j4 = 0;
        this.retryWaiter.wake(new a(true, j4, i7, eVar));
        this.waiter.wake(new a(false, j4, i7, eVar));
    }

    public final List<C0023b> getNextOps$com_onesignal_core(int i7) {
        Object obj;
        List<C0023b> list = null;
        if (((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getUseIdentityVerification$com_onesignal_core() == com.onesignal.user.internal.jwt.b.UNKNOWN) {
            return null;
        }
        boolean newCodePathsRun = this._identityVerificationService.getNewCodePathsRun();
        boolean ivBehaviorActive = this._identityVerificationService.getIvBehaviorActive();
        synchronized (this.queue) {
            try {
                Iterator<T> it = this.queue.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    C0023b c0023b = (C0023b) obj;
                    if (c0023b.getOperation().getCanStartExecute() && this._newRecordState.canAccess(c0023b.getOperation().getApplyToRecordId()) && c0023b.getBucket() <= i7 && (!newCodePathsRun || com.onesignal.core.internal.operations.impl.d.hasValidJwtIfRequired(this, this._jwtTokenStore, c0023b.getOperation(), ivBehaviorActive))) {
                        break;
                    }
                }
                C0023b c0023b2 = (C0023b) obj;
                if (c0023b2 != null) {
                    this.queue.remove(c0023b2);
                    list = getGroupableOperations(c0023b2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return list;
    }

    public final List<C0023b> getQueue$com_onesignal_core() {
        return this.queue;
    }

    public final void loadSavedOperations$com_onesignal_core() {
        this._operationModelStore.loadOperations();
        Iterator it = AbstractC0506j.M(this._operationModelStore.list()).iterator();
        while (it.hasNext()) {
            internalEnqueue(new C0023b((d2.g) it.next(), null, this.enqueueIntoBucket, 0, 10, null), false, false, 0);
        }
        ((C0153m) this.initialized).U(v.f5219a);
    }

    public final void onJwtConfigHydrated$com_onesignal_core(boolean z5) {
        com.onesignal.common.threading.b.suspendifyOnIO(new h(z5, null));
    }

    public final void removeOperationsWithoutExternalId$com_onesignal_core() {
        int i7;
        ArrayList arrayList;
        synchronized (this.queue) {
            try {
                List<C0023b> list = this.queue;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : list) {
                    if (((C0023b) obj).getOperation().getExternalId() == null) {
                        arrayList2.add(obj);
                    }
                }
                int size = arrayList2.size();
                i7 = 0;
                int i8 = 0;
                while (i8 < size) {
                    Object obj2 = arrayList2.get(i8);
                    i8++;
                    com.onesignal.common.threading.d waiter = ((C0023b) obj2).getWaiter();
                    if (waiter != null) {
                        waiter.wake(Boolean.FALSE);
                    }
                }
                this.queue.removeAll(arrayList2);
                Iterator<T> it = this.queue.iterator();
                while (it.hasNext()) {
                    d2.g operation = ((C0023b) it.next()).getOperation();
                    if ((operation instanceof s3.f) && ((s3.f) operation).getExistingOnesignalId() != null) {
                        com.onesignal.debug.internal.logging.b.debug$default("OperationRepo: cleared existingOnesignalId on LoginUserOperation (was " + ((s3.f) operation).getExistingOnesignalId() + ')', null, 2, null);
                        ((s3.f) operation).setExistingOnesignalId$com_onesignal_core(null);
                    }
                }
                com.onesignal.debug.internal.logging.b.debug$default("OperationRepo: removeOperationsWithoutExternalId removed " + arrayList2.size() + " of " + (arrayList2.size() + this.queue.size()) + " operations", null, 2, null);
                arrayList = new ArrayList(AbstractC0508l.C(arrayList2, 10));
                int size2 = arrayList2.size();
                int i9 = 0;
                while (i9 < size2) {
                    Object obj3 = arrayList2.get(i9);
                    i9++;
                    arrayList.add(((C0023b) obj3).getOperation().getId());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        int size3 = arrayList.size();
        while (i7 < size3) {
            Object obj4 = arrayList.get(i7);
            i7++;
            com.onesignal.common.modeling.b.remove$default(this._operationModelStore, (String) obj4, null, 2, null);
        }
    }

    @Override // com.onesignal.core.internal.startup.b
    public void start() {
        this.paused = false;
        this._identityVerificationService.setOnJwtConfigHydratedHandler(new k());
        AbstractC0165z.l(getScope(), null, new l(null), 3);
    }

    public static final class a {
        private final boolean force;
        private final long previousWaitedTime;

        public a(boolean z5, long j4) {
            this.force = z5;
            this.previousWaitedTime = j4;
        }

        public final boolean getForce() {
            return this.force;
        }

        public final long getPreviousWaitedTime() {
            return this.previousWaitedTime;
        }

        public /* synthetic */ a(boolean z5, long j4, int i7, kotlin.jvm.internal.e eVar) {
            this(z5, (i7 & 2) != 0 ? 0L : j4);
        }
    }

    /* renamed from: com.onesignal.core.internal.operations.impl.b$b, reason: collision with other inner class name */
    public static final class C0023b {
        private final int bucket;
        private final d2.g operation;
        private int retries;
        private com.onesignal.common.threading.d waiter;

        public C0023b(d2.g operation, com.onesignal.common.threading.d dVar, int i7, int i8) {
            kotlin.jvm.internal.i.e(operation, "operation");
            this.operation = operation;
            this.waiter = dVar;
            this.bucket = i7;
            this.retries = i8;
        }

        public final int getBucket() {
            return this.bucket;
        }

        public final d2.g getOperation() {
            return this.operation;
        }

        public final int getRetries() {
            return this.retries;
        }

        public final com.onesignal.common.threading.d getWaiter() {
            return this.waiter;
        }

        public final void setRetries(int i7) {
            this.retries = i7;
        }

        public final void setWaiter(com.onesignal.common.threading.d dVar) {
            this.waiter = dVar;
        }

        public String toString() {
            return "bucket:" + this.bucket + ", retries:" + this.retries + ", operation:" + this.operation + '\n';
        }

        public /* synthetic */ C0023b(d2.g gVar, com.onesignal.common.threading.d dVar, int i7, int i8, int i9, kotlin.jvm.internal.e eVar) {
            this(gVar, (i9 & 2) != 0 ? null : dVar, i7, (i9 & 8) != 0 ? 0 : i8);
        }
    }
}
