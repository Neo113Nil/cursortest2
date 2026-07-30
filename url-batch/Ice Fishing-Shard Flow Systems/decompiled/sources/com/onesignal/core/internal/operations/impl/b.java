package com.onesignal.core.internal.operations.impl;

import R5.InterfaceC0168h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import k6.InterfaceC0608c;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.r;
import kotlin.collections.s;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C;
import kotlin.jvm.internal.C0643h;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;
import n6.AbstractC0792z;
import n6.C0781n;
import n6.InterfaceC0780m;
import n6.InterfaceC0789w;
import n6.S;
import n6.p0;

/* loaded from: classes.dex */
public final class b implements F2.f, com.onesignal.core.internal.startup.b {
    private final com.onesignal.core.internal.config.c _configModelStore;
    private final com.onesignal.core.internal.config.impl.c _identityVerificationService;
    private final com.onesignal.user.internal.jwt.c _jwtTokenStore;
    private final W3.a _newRecordState;
    private final com.onesignal.core.internal.operations.impl.a _operationModelStore;
    private final I2.a _time;
    private int enqueueIntoBucket;
    private final Map<String, F2.d> executorsMap;
    private final InterfaceC0780m initialized;
    private boolean paused;
    private final List<C0022b> queue;
    private final com.onesignal.common.threading.e retryWaiter;
    private final InterfaceC0168h scope$delegate;
    private final com.onesignal.common.threading.e waiter;

    public static final class c extends X5.j implements Function2 {
        int label;

        public c(V5.b bVar) {
            super(2, bVar);
        }

        @Override // X5.a
        public final V5.b create(Object obj, V5.b bVar) {
            return b.this.new c(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            int i2 = this.label;
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                V6.b.P(obj);
                return obj;
            }
            V6.b.P(obj);
            com.onesignal.common.threading.e eVar = b.this.retryWaiter;
            this.label = 1;
            Object waitForWake = eVar.waitForWake(this);
            return waitForWake == aVar ? aVar : waitForWake;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0789w interfaceC0789w, V5.b bVar) {
            return ((c) create(interfaceC0789w, bVar)).invokeSuspend(Unit.f6114a);
        }
    }

    public static final class d extends X5.c {
        long J$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public d(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.delayForPostCreate(0L, this);
        }
    }

    public static final class e extends X5.j implements Function2 {
        final /* synthetic */ boolean $flush;
        final /* synthetic */ F2.g $operation;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(F2.g gVar, boolean z7, V5.b bVar) {
            super(2, bVar);
            this.$operation = gVar;
            this.$flush = z7;
        }

        @Override // X5.a
        public final V5.b create(Object obj, V5.b bVar) {
            return b.this.new e(this.$operation, this.$flush, bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V6.b.P(obj);
            b bVar = b.this;
            b.internalEnqueue$default(bVar, new C0022b(this.$operation, null, bVar.enqueueIntoBucket, 0, 10, null), this.$flush, true, null, 8, null);
            return Unit.f6114a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0789w interfaceC0789w, V5.b bVar) {
            return ((e) create(interfaceC0789w, bVar)).invokeSuspend(Unit.f6114a);
        }
    }

    public static final class f extends X5.j implements Function2 {
        final /* synthetic */ boolean $flush;
        final /* synthetic */ F2.g $operation;
        final /* synthetic */ com.onesignal.common.threading.e $waiter;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(F2.g gVar, com.onesignal.common.threading.e eVar, boolean z7, V5.b bVar) {
            super(2, bVar);
            this.$operation = gVar;
            this.$waiter = eVar;
            this.$flush = z7;
        }

        @Override // X5.a
        public final V5.b create(Object obj, V5.b bVar) {
            return b.this.new f(this.$operation, this.$waiter, this.$flush, bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V6.b.P(obj);
            b bVar = b.this;
            b.internalEnqueue$default(bVar, new C0022b(this.$operation, this.$waiter, bVar.enqueueIntoBucket, 0, 8, null), this.$flush, true, null, 8, null);
            return Unit.f6114a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0789w interfaceC0789w, V5.b bVar) {
            return ((f) create(interfaceC0789w, bVar)).invokeSuspend(Unit.f6114a);
        }
    }

    public static final class g extends X5.c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public g(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.executeOperations$com_onesignal_core(null, this);
        }
    }

    public static final class h extends X5.j implements Function1 {
        final /* synthetic */ boolean $ivRequired;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(boolean z7, V5.b bVar) {
            super(1, bVar);
            this.$ivRequired = z7;
        }

        @Override // X5.a
        public final V5.b create(V5.b bVar) {
            return b.this.new h(this.$ivRequired, bVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(V5.b bVar) {
            return ((h) create(bVar)).invokeSuspend(Unit.f6114a);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            int i2 = this.label;
            if (i2 == 0) {
                V6.b.P(obj);
                b bVar = b.this;
                this.label = 1;
                if (bVar.awaitInitialized(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                V6.b.P(obj);
            }
            if (this.$ivRequired) {
                b.this.removeOperationsWithoutExternalId$com_onesignal_core();
            }
            b.this.forceExecuteOperations();
            return Unit.f6114a;
        }
    }

    public static final class i extends X5.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public i(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.processQueueForever(this);
        }
    }

    public static final class j extends p implements Function0 {
        public static final j INSTANCE = new j();

        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final InterfaceC0789w invoke() {
            new AtomicInteger();
            return AbstractC0792z.b(new S(Executors.newScheduledThreadPool(1, new p0())));
        }
    }

    public static final class k extends p implements Function1 {
        public k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return Unit.f6114a;
        }

        public final void invoke(boolean z7) {
            b.this.onJwtConfigHydrated$com_onesignal_core(z7);
        }
    }

    public static final class l extends X5.j implements Function2 {
        int label;

        public l(V5.b bVar) {
            super(2, bVar);
        }

        @Override // X5.a
        public final V5.b create(Object obj, V5.b bVar) {
            return b.this.new l(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            int i2 = this.label;
            if (i2 == 0) {
                V6.b.P(obj);
                b.this.loadSavedOperations$com_onesignal_core();
                b bVar = b.this;
                this.label = 1;
                if (bVar.processQueueForever(this) == aVar) {
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

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0789w interfaceC0789w, V5.b bVar) {
            return ((l) create(interfaceC0789w, bVar)).invokeSuspend(Unit.f6114a);
        }
    }

    public static final class m extends X5.c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public m(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.waitForNewOperationAndExecutionInterval(this);
        }
    }

    public static final class n extends X5.j implements Function2 {
        final /* synthetic */ D $wakeMessage;
        Object L$0;
        int label;
        final /* synthetic */ b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(D d7, b bVar, V5.b bVar2) {
            super(2, bVar2);
            this.$wakeMessage = d7;
            this.this$0 = bVar;
        }

        @Override // X5.a
        public final V5.b create(Object obj, V5.b bVar) {
            return new n(this.$wakeMessage, this.this$0, bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            D d7;
            W5.a aVar = W5.a.f2787d;
            int i2 = this.label;
            if (i2 == 0) {
                V6.b.P(obj);
                D d8 = this.$wakeMessage;
                com.onesignal.common.threading.e eVar = this.this$0.waiter;
                this.L$0 = d8;
                this.label = 1;
                Object waitForWake = eVar.waitForWake(this);
                if (waitForWake == aVar) {
                    return aVar;
                }
                d7 = d8;
                obj = waitForWake;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                d7 = (D) this.L$0;
                V6.b.P(obj);
            }
            d7.f6152d = obj;
            return Unit.f6114a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0789w interfaceC0789w, V5.b bVar) {
            return ((n) create(interfaceC0789w, bVar)).invokeSuspend(Unit.f6114a);
        }
    }

    public b(List<? extends F2.d> executors, com.onesignal.core.internal.operations.impl.a _operationModelStore, com.onesignal.core.internal.config.c _configModelStore, I2.a _time, W3.a _newRecordState, com.onesignal.user.internal.jwt.c _jwtTokenStore, com.onesignal.core.internal.config.impl.c _identityVerificationService) {
        Intrinsics.checkNotNullParameter(executors, "executors");
        Intrinsics.checkNotNullParameter(_operationModelStore, "_operationModelStore");
        Intrinsics.checkNotNullParameter(_configModelStore, "_configModelStore");
        Intrinsics.checkNotNullParameter(_time, "_time");
        Intrinsics.checkNotNullParameter(_newRecordState, "_newRecordState");
        Intrinsics.checkNotNullParameter(_jwtTokenStore, "_jwtTokenStore");
        Intrinsics.checkNotNullParameter(_identityVerificationService, "_identityVerificationService");
        this._operationModelStore = _operationModelStore;
        this._configModelStore = _configModelStore;
        this._time = _time;
        this._newRecordState = _newRecordState;
        this._jwtTokenStore = _jwtTokenStore;
        this._identityVerificationService = _identityVerificationService;
        this.scope$delegate = R5.i.b(j.INSTANCE);
        this.queue = new ArrayList();
        this.waiter = new com.onesignal.common.threading.e();
        this.retryWaiter = new com.onesignal.common.threading.e();
        this.initialized = AbstractC0792z.a();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (F2.d dVar : executors) {
            Iterator<String> it = dVar.getOperations().iterator();
            while (it.hasNext()) {
                linkedHashMap.put(it.next(), dVar);
            }
        }
        this.executorsMap = linkedHashMap;
    }

    private final void dropAndWake(List<C0022b> list) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            com.onesignal.common.modeling.b.remove$default(this._operationModelStore, ((C0022b) it.next()).getOperation().getId(), null, 2, null);
        }
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            com.onesignal.common.threading.e waiter = ((C0022b) it2.next()).getWaiter();
            if (waiter != null) {
                waiter.wake(Boolean.FALSE);
            }
        }
    }

    private final int getExecuteBucket() {
        int i2 = this.enqueueIntoBucket;
        if (i2 == 0) {
            return 0;
        }
        return i2 - 1;
    }

    private final List<C0022b> getGroupableOperations(C0022b c0022b) {
        ArrayList e7 = r.e(c0022b);
        if (c0022b.getOperation().getGroupComparisonType() != F2.c.NONE) {
            String createComparisonKey = c0022b.getOperation().getGroupComparisonType() == F2.c.CREATE ? c0022b.getOperation().getCreateComparisonKey() : c0022b.getOperation().getModifyComparisonKey();
            for (C0022b c0022b2 : CollectionsKt.z(this.queue)) {
                String createComparisonKey2 = c0022b.getOperation().getGroupComparisonType() == F2.c.CREATE ? c0022b2.getOperation().getCreateComparisonKey() : c0022b2.getOperation().getModifyComparisonKey();
                if (Intrinsics.a(createComparisonKey2, "") && Intrinsics.a(createComparisonKey, "")) {
                    throw new Exception("Both comparison keys can not be blank!");
                }
                if (this._newRecordState.canAccess(c0022b2.getOperation().getApplyToRecordId()) && Intrinsics.a(createComparisonKey2, createComparisonKey)) {
                    this.queue.remove(c0022b2);
                    e7.add(c0022b2);
                }
            }
        }
        return e7;
    }

    private final InterfaceC0789w getScope() {
        return (InterfaceC0789w) this.scope$delegate.getValue();
    }

    private final void internalEnqueue(C0022b c0022b, boolean z7, boolean z8, Integer num) {
        Object obj;
        synchronized (this.queue) {
            try {
                List<C0022b> list = this.queue;
                if (list == null || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        if (Intrinsics.a(((C0022b) it.next()).getOperation().getId(), c0022b.getOperation().getId())) {
                            com.onesignal.debug.internal.logging.b.debug$default("OperationRepo: internalEnqueue - operation.id: " + c0022b.getOperation().getId() + " already exists in the queue.", null, 2, null);
                            return;
                        }
                    }
                }
                F2.g operation = c0022b.getOperation();
                if (operation instanceof U3.f) {
                    Iterator<T> it2 = this.queue.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it2.next();
                        C0022b c0022b2 = (C0022b) obj;
                        if ((c0022b2.getOperation() instanceof U3.f) && Intrinsics.a(((U3.f) c0022b2.getOperation()).getOnesignalId(), ((U3.f) operation).getOnesignalId())) {
                            break;
                        }
                    }
                    C0022b c0022b3 = (C0022b) obj;
                    if (c0022b3 != null) {
                        F2.g operation2 = c0022b3.getOperation();
                        Intrinsics.c(operation2, "null cannot be cast to non-null type com.onesignal.user.internal.operations.LoginUserOperation");
                        U3.f fVar = (U3.f) operation2;
                        String existingOnesignalId = ((U3.f) operation).getExistingOnesignalId();
                        if (existingOnesignalId == null || com.onesignal.common.d.INSTANCE.isLocalId(existingOnesignalId) || fVar.getExistingOnesignalId() != null) {
                            com.onesignal.debug.internal.logging.b.debug$default("OperationRepo: internalEnqueue - LoginUserOperation for onesignalId: " + ((U3.f) operation).getOnesignalId() + " already exists in the queue.", null, 2, null);
                        } else {
                            com.onesignal.debug.internal.logging.b.debug$default("OperationRepo: internalEnqueue - merging existingOnesignalId=" + existingOnesignalId + " into queued LoginUserOperation for onesignalId: " + ((U3.f) operation).getOnesignalId() + '.', null, 2, null);
                            fVar.setExistingOnesignalId$com_onesignal_core(existingOnesignalId);
                        }
                        if (c0022b.getWaiter() == null || c0022b3.getWaiter() != null) {
                            com.onesignal.common.threading.e waiter = c0022b.getWaiter();
                            if (waiter != null) {
                                waiter.wake(Boolean.TRUE);
                            }
                        } else {
                            c0022b3.setWaiter(c0022b.getWaiter());
                        }
                        if (!z8) {
                            com.onesignal.common.modeling.b.remove$default(this._operationModelStore, c0022b.getOperation().getId(), null, 2, null);
                        }
                        return;
                    }
                }
                if (num != null) {
                    this.queue.add(num.intValue(), c0022b);
                } else {
                    this.queue.add(c0022b);
                }
                if (z8) {
                    com.onesignal.common.modeling.b.add$default(this._operationModelStore, c0022b.getOperation(), null, 2, null);
                }
                Unit unit = Unit.f6114a;
                this.waiter.wake(new a(z7, 0L));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* synthetic */ void internalEnqueue$default(b bVar, C0022b c0022b, boolean z7, boolean z8, Integer num, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            num = null;
        }
        bVar.internalEnqueue(c0022b, z7, z8, num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c5, code lost:
    
        if (r2.executeOperations$com_onesignal_core(r12, r0) == r1) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00dc, code lost:
    
        if (n6.AbstractC0792z.d(r7, r0) == r1) goto L48;
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
    public final Object processQueueForever(V5.b bVar) {
        i iVar;
        int i2;
        b bVar2;
        List z7;
        if (bVar instanceof i) {
            iVar = (i) bVar;
            int i5 = iVar.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                iVar.label = i5 - Integer.MIN_VALUE;
                Object obj = iVar.result;
                W5.a aVar = W5.a.f2787d;
                i2 = iVar.label;
                if (i2 != 0) {
                    V6.b.P(obj);
                    iVar.L$0 = this;
                    iVar.label = 1;
                    if (waitForNewOperationAndExecutionInterval(iVar) != aVar) {
                        bVar2 = this;
                    }
                    return aVar;
                }
                if (i2 == 1) {
                    bVar2 = (b) iVar.L$0;
                    V6.b.P(obj);
                } else if (i2 == 2) {
                    bVar2 = (b) iVar.L$0;
                    V6.b.P(obj);
                    long opRepoPostWakeDelay = ((com.onesignal.core.internal.config.b) bVar2._configModelStore.getModel()).getOpRepoPostWakeDelay();
                    iVar.L$0 = bVar2;
                    iVar.label = 3;
                } else {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bVar2 = (b) iVar.L$0;
                        V6.b.P(obj);
                        bVar2.enqueueIntoBucket++;
                        if (!bVar2.paused) {
                            com.onesignal.debug.internal.logging.b.debug$default("OperationRepo is paused", null, 2, null);
                            return Unit.f6114a;
                        }
                        List<C0022b> nextOps$com_onesignal_core = bVar2.getNextOps$com_onesignal_core(bVar2.getExecuteBucket());
                        if (com.onesignal.debug.internal.logging.b.atLogLevel(K2.c.DEBUG)) {
                            synchronized (bVar2.queue) {
                                z7 = CollectionsKt.z(bVar2.queue);
                            }
                            com.onesignal.debug.internal.logging.b.debug$default("processQueueForever:ops:\n" + nextOps$com_onesignal_core + "\nqueue(" + z7.size() + "):\n" + z7, null, 2, null);
                        }
                        if (nextOps$com_onesignal_core != null) {
                            iVar.L$0 = bVar2;
                            iVar.label = 2;
                        } else {
                            iVar.L$0 = bVar2;
                            iVar.label = 4;
                        }
                        return aVar;
                    }
                    bVar2 = (b) iVar.L$0;
                    V6.b.P(obj);
                    if (!bVar2.paused) {
                    }
                }
                bVar2.enqueueIntoBucket++;
                if (!bVar2.paused) {
                }
            }
        }
        iVar = new i(bVar);
        Object obj2 = iVar.result;
        W5.a aVar2 = W5.a.f2787d;
        i2 = iVar.label;
        if (i2 != 0) {
        }
        bVar2.enqueueIntoBucket++;
        if (!bVar2.paused) {
        }
    }

    private final boolean shouldSuppressAnonymousOp(F2.g gVar) {
        boolean z7 = false;
        if (!this._identityVerificationService.getNewCodePathsRun() || (gVar instanceof U3.f)) {
            return false;
        }
        if (((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getUseIdentityVerification$com_onesignal_core() == com.onesignal.user.internal.jwt.b.REQUIRED && gVar.getExternalId() == null) {
            z7 = true;
        }
        if (z7) {
            com.onesignal.debug.internal.logging.b.debug$default("OperationRepo: suppressing anonymous op under IV-required: " + gVar, null, 2, null);
        }
        return z7;
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
    public final Object waitForNewOperationAndExecutionInterval(V5.b bVar) {
        m mVar;
        int i2;
        D d7;
        b bVar2;
        D d8;
        long opRepoExecutionInterval;
        D d9;
        b bVar3;
        if (bVar instanceof m) {
            mVar = (m) bVar;
            int i5 = mVar.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                mVar.label = i5 - Integer.MIN_VALUE;
                Object obj = mVar.result;
                W5.a aVar = W5.a.f2787d;
                i2 = mVar.label;
                if (i2 != 0) {
                    V6.b.P(obj);
                    d7 = new D();
                    com.onesignal.common.threading.e eVar = this.waiter;
                    mVar.L$0 = this;
                    mVar.L$1 = d7;
                    mVar.L$2 = d7;
                    mVar.label = 1;
                    obj = eVar.waitForWake(mVar);
                    if (obj != aVar) {
                        bVar2 = this;
                        d8 = d7;
                    }
                    return aVar;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d9 = (D) mVar.L$1;
                    bVar3 = (b) mVar.L$0;
                    V6.b.P(obj);
                    if (obj != null) {
                        opRepoExecutionInterval = ((com.onesignal.core.internal.config.b) bVar3._configModelStore.getModel()).getOpRepoExecutionInterval();
                        if (!((a) d9.f6152d).getForce()) {
                            n nVar = new n(d9, bVar3, null);
                            mVar.L$0 = bVar3;
                            mVar.L$1 = d9;
                            mVar.L$2 = null;
                            mVar.label = 2;
                            obj = AbstractC0792z.v(opRepoExecutionInterval, nVar, mVar);
                        }
                    }
                    return Unit.f6114a;
                }
                d7 = (D) mVar.L$2;
                d8 = (D) mVar.L$1;
                bVar2 = (b) mVar.L$0;
                V6.b.P(obj);
                d7.f6152d = obj;
                opRepoExecutionInterval = ((com.onesignal.core.internal.config.b) bVar2._configModelStore.getModel()).getOpRepoExecutionInterval() - ((a) d8.f6152d).getPreviousWaitedTime();
                d9 = d8;
                bVar3 = bVar2;
                if (!((a) d9.f6152d).getForce()) {
                }
                return Unit.f6114a;
            }
        }
        mVar = new m(bVar);
        Object obj2 = mVar.result;
        W5.a aVar2 = W5.a.f2787d;
        i2 = mVar.label;
        if (i2 != 0) {
        }
        d7.f6152d = obj2;
        opRepoExecutionInterval = ((com.onesignal.core.internal.config.b) bVar2._configModelStore.getModel()).getOpRepoExecutionInterval() - ((a) d8.f6152d).getPreviousWaitedTime();
        d9 = d8;
        bVar3 = bVar2;
        if (!((a) d9.f6152d).getForce()) {
        }
        return Unit.f6114a;
    }

    @Override // F2.f
    public Object awaitInitialized(V5.b bVar) {
        Object W4 = ((C0781n) this.initialized).W(bVar);
        return W4 == W5.a.f2787d ? W4 : Unit.f6114a;
    }

    @Override // F2.f
    public <T extends F2.g> boolean containsInstanceOf(InterfaceC0608c type) {
        boolean z7;
        Intrinsics.checkNotNullParameter(type, "type");
        synchronized (this.queue) {
            try {
                List<C0022b> list = this.queue;
                z7 = false;
                if (list == null || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (((C0643h) type).c(((C0022b) it.next()).getOperation())) {
                            z7 = true;
                            break;
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z7;
    }

    public final Object delayBeforeNextExecution(int i2, Integer num, V5.b bVar) {
        com.onesignal.debug.internal.logging.b.debug$default("retryAfterSeconds: " + num, null, 2, null);
        long max = Math.max(((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getOpRepoDefaultFailRetryBackoff() * i2, (num != null ? num.intValue() : 0L) * 1000);
        if (max < 1) {
            return Unit.f6114a;
        }
        com.onesignal.debug.internal.logging.b.debug$default("Operations being delay for: " + max + " ms", null, 2, null);
        Object v7 = AbstractC0792z.v(max, new c(null), bVar);
        return v7 == W5.a.f2787d ? v7 : Unit.f6114a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object delayForPostCreate(long j7, V5.b bVar) {
        d dVar;
        int i2;
        b bVar2;
        if (bVar instanceof d) {
            dVar = (d) bVar;
            int i5 = dVar.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                dVar.label = i5 - Integer.MIN_VALUE;
                Object obj = dVar.result;
                W5.a aVar = W5.a.f2787d;
                i2 = dVar.label;
                if (i2 != 0) {
                    V6.b.P(obj);
                    dVar.L$0 = this;
                    dVar.J$0 = j7;
                    dVar.label = 1;
                    if (AbstractC0792z.d(j7, dVar) == aVar) {
                        return aVar;
                    }
                    bVar2 = this;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j7 = dVar.J$0;
                    bVar2 = (b) dVar.L$0;
                    V6.b.P(obj);
                }
                synchronized (bVar2.queue) {
                    if (!bVar2.queue.isEmpty()) {
                        bVar2.waiter.wake(new a(false, j7));
                    }
                }
                return Unit.f6114a;
            }
        }
        dVar = new d(bVar);
        Object obj2 = dVar.result;
        W5.a aVar2 = W5.a.f2787d;
        i2 = dVar.label;
        if (i2 != 0) {
        }
        synchronized (bVar2.queue) {
        }
    }

    @Override // F2.f
    public void enqueue(F2.g operation, boolean z7) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (shouldSuppressAnonymousOp(operation)) {
            return;
        }
        com.onesignal.debug.internal.logging.b.log(K2.c.DEBUG, "OperationRepo.enqueue(operation: " + operation + ", flush: " + z7 + ')');
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
        operation.setId(uuid);
        AbstractC0792z.l(getScope(), null, new e(operation, z7, null), 3);
    }

    @Override // F2.f
    public Object enqueueAndWait(F2.g gVar, boolean z7, V5.b bVar) {
        if (shouldSuppressAnonymousOp(gVar)) {
            return Boolean.FALSE;
        }
        com.onesignal.debug.internal.logging.b.log(K2.c.DEBUG, "OperationRepo.enqueueAndWait(operation: " + gVar + ", force: " + z7 + ')');
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
        gVar.setId(uuid);
        com.onesignal.common.threading.e eVar = new com.onesignal.common.threading.e();
        AbstractC0792z.l(getScope(), null, new f(gVar, eVar, z7, null), 3);
        return eVar.waitForWake(bVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(9:5|6|7|(1:(1:(1:(5:12|13|14|15|16)(2:19|20))(9:21|22|23|24|25|(1:27)|14|15|16))(4:34|35|36|37))(4:197|198|199|(6:201|(2:204|202)|205|206|(1:208)|29)(2:209|210))|38|39|(8:41|(2:44|42)|45|46|11b|56|(2:59|57)|60)|66|67))|214|6|7|(0)(0)|38|39|(0)|66|67|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0116, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x003f, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x03b3, code lost:
    
        if (r0 == r5) goto L168;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01e1 A[Catch: all -> 0x0116, TryCatch #3 {all -> 0x0116, blocks: (B:39:0x00da, B:41:0x00fa, B:42:0x00fe, B:44:0x0104, B:46:0x0119, B:47:0x011b, B:55:0x013e, B:56:0x013f, B:57:0x014b, B:59:0x0151, B:64:0x015d, B:65:0x015e, B:66:0x015f, B:67:0x0171, B:69:0x0316, B:71:0x031c, B:72:0x031e, B:80:0x0377, B:85:0x0379, B:86:0x037a, B:87:0x037b, B:90:0x0176, B:91:0x0190, B:93:0x0196, B:96:0x01a2, B:101:0x01a8, B:102:0x01aa, B:110:0x01dc, B:115:0x01df, B:116:0x01e0, B:117:0x01e1, B:118:0x01f8, B:131:0x022e, B:136:0x0231, B:137:0x0232, B:138:0x0233, B:140:0x0247, B:141:0x024c, B:142:0x024e, B:161:0x028d, B:166:0x0290, B:167:0x0291, B:168:0x0292, B:169:0x02ab, B:171:0x02b3, B:174:0x02c2, B:175:0x02db, B:176:0x02df, B:178:0x02e5, B:180:0x02fa, B:181:0x02fe, B:183:0x0304, B:186:0x0310, B:74:0x031f, B:75:0x032b, B:77:0x0331, B:79:0x0375, B:120:0x01f9, B:121:0x0201, B:123:0x0207, B:125:0x021d, B:127:0x0226, B:130:0x022c, B:104:0x01ab, B:105:0x01b3, B:107:0x01b9, B:109:0x01da, B:49:0x011c, B:50:0x0122, B:52:0x0128, B:54:0x013c, B:144:0x024f, B:145:0x0258, B:147:0x025e, B:150:0x026b, B:155:0x0271, B:156:0x0279, B:158:0x027f, B:160:0x028b), top: B:38:0x00da, inners: #1, #2, #4, #5, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0233 A[Catch: all -> 0x0116, TryCatch #3 {all -> 0x0116, blocks: (B:39:0x00da, B:41:0x00fa, B:42:0x00fe, B:44:0x0104, B:46:0x0119, B:47:0x011b, B:55:0x013e, B:56:0x013f, B:57:0x014b, B:59:0x0151, B:64:0x015d, B:65:0x015e, B:66:0x015f, B:67:0x0171, B:69:0x0316, B:71:0x031c, B:72:0x031e, B:80:0x0377, B:85:0x0379, B:86:0x037a, B:87:0x037b, B:90:0x0176, B:91:0x0190, B:93:0x0196, B:96:0x01a2, B:101:0x01a8, B:102:0x01aa, B:110:0x01dc, B:115:0x01df, B:116:0x01e0, B:117:0x01e1, B:118:0x01f8, B:131:0x022e, B:136:0x0231, B:137:0x0232, B:138:0x0233, B:140:0x0247, B:141:0x024c, B:142:0x024e, B:161:0x028d, B:166:0x0290, B:167:0x0291, B:168:0x0292, B:169:0x02ab, B:171:0x02b3, B:174:0x02c2, B:175:0x02db, B:176:0x02df, B:178:0x02e5, B:180:0x02fa, B:181:0x02fe, B:183:0x0304, B:186:0x0310, B:74:0x031f, B:75:0x032b, B:77:0x0331, B:79:0x0375, B:120:0x01f9, B:121:0x0201, B:123:0x0207, B:125:0x021d, B:127:0x0226, B:130:0x022c, B:104:0x01ab, B:105:0x01b3, B:107:0x01b9, B:109:0x01da, B:49:0x011c, B:50:0x0122, B:52:0x0128, B:54:0x013c, B:144:0x024f, B:145:0x0258, B:147:0x025e, B:150:0x026b, B:155:0x0271, B:156:0x0279, B:158:0x027f, B:160:0x028b), top: B:38:0x00da, inners: #1, #2, #4, #5, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0292 A[Catch: all -> 0x0116, TryCatch #3 {all -> 0x0116, blocks: (B:39:0x00da, B:41:0x00fa, B:42:0x00fe, B:44:0x0104, B:46:0x0119, B:47:0x011b, B:55:0x013e, B:56:0x013f, B:57:0x014b, B:59:0x0151, B:64:0x015d, B:65:0x015e, B:66:0x015f, B:67:0x0171, B:69:0x0316, B:71:0x031c, B:72:0x031e, B:80:0x0377, B:85:0x0379, B:86:0x037a, B:87:0x037b, B:90:0x0176, B:91:0x0190, B:93:0x0196, B:96:0x01a2, B:101:0x01a8, B:102:0x01aa, B:110:0x01dc, B:115:0x01df, B:116:0x01e0, B:117:0x01e1, B:118:0x01f8, B:131:0x022e, B:136:0x0231, B:137:0x0232, B:138:0x0233, B:140:0x0247, B:141:0x024c, B:142:0x024e, B:161:0x028d, B:166:0x0290, B:167:0x0291, B:168:0x0292, B:169:0x02ab, B:171:0x02b3, B:174:0x02c2, B:175:0x02db, B:176:0x02df, B:178:0x02e5, B:180:0x02fa, B:181:0x02fe, B:183:0x0304, B:186:0x0310, B:74:0x031f, B:75:0x032b, B:77:0x0331, B:79:0x0375, B:120:0x01f9, B:121:0x0201, B:123:0x0207, B:125:0x021d, B:127:0x0226, B:130:0x022c, B:104:0x01ab, B:105:0x01b3, B:107:0x01b9, B:109:0x01da, B:49:0x011c, B:50:0x0122, B:52:0x0128, B:54:0x013c, B:144:0x024f, B:145:0x0258, B:147:0x025e, B:150:0x026b, B:155:0x0271, B:156:0x0279, B:158:0x027f, B:160:0x028b), top: B:38:0x00da, inners: #1, #2, #4, #5, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02ab A[Catch: all -> 0x0116, TryCatch #3 {all -> 0x0116, blocks: (B:39:0x00da, B:41:0x00fa, B:42:0x00fe, B:44:0x0104, B:46:0x0119, B:47:0x011b, B:55:0x013e, B:56:0x013f, B:57:0x014b, B:59:0x0151, B:64:0x015d, B:65:0x015e, B:66:0x015f, B:67:0x0171, B:69:0x0316, B:71:0x031c, B:72:0x031e, B:80:0x0377, B:85:0x0379, B:86:0x037a, B:87:0x037b, B:90:0x0176, B:91:0x0190, B:93:0x0196, B:96:0x01a2, B:101:0x01a8, B:102:0x01aa, B:110:0x01dc, B:115:0x01df, B:116:0x01e0, B:117:0x01e1, B:118:0x01f8, B:131:0x022e, B:136:0x0231, B:137:0x0232, B:138:0x0233, B:140:0x0247, B:141:0x024c, B:142:0x024e, B:161:0x028d, B:166:0x0290, B:167:0x0291, B:168:0x0292, B:169:0x02ab, B:171:0x02b3, B:174:0x02c2, B:175:0x02db, B:176:0x02df, B:178:0x02e5, B:180:0x02fa, B:181:0x02fe, B:183:0x0304, B:186:0x0310, B:74:0x031f, B:75:0x032b, B:77:0x0331, B:79:0x0375, B:120:0x01f9, B:121:0x0201, B:123:0x0207, B:125:0x021d, B:127:0x0226, B:130:0x022c, B:104:0x01ab, B:105:0x01b3, B:107:0x01b9, B:109:0x01da, B:49:0x011c, B:50:0x0122, B:52:0x0128, B:54:0x013c, B:144:0x024f, B:145:0x0258, B:147:0x025e, B:150:0x026b, B:155:0x0271, B:156:0x0279, B:158:0x027f, B:160:0x028b), top: B:38:0x00da, inners: #1, #2, #4, #5, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02db A[Catch: all -> 0x0116, TryCatch #3 {all -> 0x0116, blocks: (B:39:0x00da, B:41:0x00fa, B:42:0x00fe, B:44:0x0104, B:46:0x0119, B:47:0x011b, B:55:0x013e, B:56:0x013f, B:57:0x014b, B:59:0x0151, B:64:0x015d, B:65:0x015e, B:66:0x015f, B:67:0x0171, B:69:0x0316, B:71:0x031c, B:72:0x031e, B:80:0x0377, B:85:0x0379, B:86:0x037a, B:87:0x037b, B:90:0x0176, B:91:0x0190, B:93:0x0196, B:96:0x01a2, B:101:0x01a8, B:102:0x01aa, B:110:0x01dc, B:115:0x01df, B:116:0x01e0, B:117:0x01e1, B:118:0x01f8, B:131:0x022e, B:136:0x0231, B:137:0x0232, B:138:0x0233, B:140:0x0247, B:141:0x024c, B:142:0x024e, B:161:0x028d, B:166:0x0290, B:167:0x0291, B:168:0x0292, B:169:0x02ab, B:171:0x02b3, B:174:0x02c2, B:175:0x02db, B:176:0x02df, B:178:0x02e5, B:180:0x02fa, B:181:0x02fe, B:183:0x0304, B:186:0x0310, B:74:0x031f, B:75:0x032b, B:77:0x0331, B:79:0x0375, B:120:0x01f9, B:121:0x0201, B:123:0x0207, B:125:0x021d, B:127:0x0226, B:130:0x022c, B:104:0x01ab, B:105:0x01b3, B:107:0x01b9, B:109:0x01da, B:49:0x011c, B:50:0x0122, B:52:0x0128, B:54:0x013c, B:144:0x024f, B:145:0x0258, B:147:0x025e, B:150:0x026b, B:155:0x0271, B:156:0x0279, B:158:0x027f, B:160:0x028b), top: B:38:0x00da, inners: #1, #2, #4, #5, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x039a A[Catch: all -> 0x003f, TRY_LEAVE, TryCatch #9 {all -> 0x003f, blocks: (B:13:0x003a, B:25:0x0394, B:27:0x039a), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fa A[Catch: all -> 0x0116, TryCatch #3 {all -> 0x0116, blocks: (B:39:0x00da, B:41:0x00fa, B:42:0x00fe, B:44:0x0104, B:46:0x0119, B:47:0x011b, B:55:0x013e, B:56:0x013f, B:57:0x014b, B:59:0x0151, B:64:0x015d, B:65:0x015e, B:66:0x015f, B:67:0x0171, B:69:0x0316, B:71:0x031c, B:72:0x031e, B:80:0x0377, B:85:0x0379, B:86:0x037a, B:87:0x037b, B:90:0x0176, B:91:0x0190, B:93:0x0196, B:96:0x01a2, B:101:0x01a8, B:102:0x01aa, B:110:0x01dc, B:115:0x01df, B:116:0x01e0, B:117:0x01e1, B:118:0x01f8, B:131:0x022e, B:136:0x0231, B:137:0x0232, B:138:0x0233, B:140:0x0247, B:141:0x024c, B:142:0x024e, B:161:0x028d, B:166:0x0290, B:167:0x0291, B:168:0x0292, B:169:0x02ab, B:171:0x02b3, B:174:0x02c2, B:175:0x02db, B:176:0x02df, B:178:0x02e5, B:180:0x02fa, B:181:0x02fe, B:183:0x0304, B:186:0x0310, B:74:0x031f, B:75:0x032b, B:77:0x0331, B:79:0x0375, B:120:0x01f9, B:121:0x0201, B:123:0x0207, B:125:0x021d, B:127:0x0226, B:130:0x022c, B:104:0x01ab, B:105:0x01b3, B:107:0x01b9, B:109:0x01da, B:49:0x011c, B:50:0x0122, B:52:0x0128, B:54:0x013c, B:144:0x024f, B:145:0x0258, B:147:0x025e, B:150:0x026b, B:155:0x0271, B:156:0x0279, B:158:0x027f, B:160:0x028b), top: B:38:0x00da, inners: #1, #2, #4, #5, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0174 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x031c A[Catch: all -> 0x0116, TryCatch #3 {all -> 0x0116, blocks: (B:39:0x00da, B:41:0x00fa, B:42:0x00fe, B:44:0x0104, B:46:0x0119, B:47:0x011b, B:55:0x013e, B:56:0x013f, B:57:0x014b, B:59:0x0151, B:64:0x015d, B:65:0x015e, B:66:0x015f, B:67:0x0171, B:69:0x0316, B:71:0x031c, B:72:0x031e, B:80:0x0377, B:85:0x0379, B:86:0x037a, B:87:0x037b, B:90:0x0176, B:91:0x0190, B:93:0x0196, B:96:0x01a2, B:101:0x01a8, B:102:0x01aa, B:110:0x01dc, B:115:0x01df, B:116:0x01e0, B:117:0x01e1, B:118:0x01f8, B:131:0x022e, B:136:0x0231, B:137:0x0232, B:138:0x0233, B:140:0x0247, B:141:0x024c, B:142:0x024e, B:161:0x028d, B:166:0x0290, B:167:0x0291, B:168:0x0292, B:169:0x02ab, B:171:0x02b3, B:174:0x02c2, B:175:0x02db, B:176:0x02df, B:178:0x02e5, B:180:0x02fa, B:181:0x02fe, B:183:0x0304, B:186:0x0310, B:74:0x031f, B:75:0x032b, B:77:0x0331, B:79:0x0375, B:120:0x01f9, B:121:0x0201, B:123:0x0207, B:125:0x021d, B:127:0x0226, B:130:0x022c, B:104:0x01ab, B:105:0x01b3, B:107:0x01b9, B:109:0x01da, B:49:0x011c, B:50:0x0122, B:52:0x0128, B:54:0x013c, B:144:0x024f, B:145:0x0258, B:147:0x025e, B:150:0x026b, B:155:0x0271, B:156:0x0279, B:158:0x027f, B:160:0x028b), top: B:38:0x00da, inners: #1, #2, #4, #5, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0176 A[Catch: all -> 0x0116, TryCatch #3 {all -> 0x0116, blocks: (B:39:0x00da, B:41:0x00fa, B:42:0x00fe, B:44:0x0104, B:46:0x0119, B:47:0x011b, B:55:0x013e, B:56:0x013f, B:57:0x014b, B:59:0x0151, B:64:0x015d, B:65:0x015e, B:66:0x015f, B:67:0x0171, B:69:0x0316, B:71:0x031c, B:72:0x031e, B:80:0x0377, B:85:0x0379, B:86:0x037a, B:87:0x037b, B:90:0x0176, B:91:0x0190, B:93:0x0196, B:96:0x01a2, B:101:0x01a8, B:102:0x01aa, B:110:0x01dc, B:115:0x01df, B:116:0x01e0, B:117:0x01e1, B:118:0x01f8, B:131:0x022e, B:136:0x0231, B:137:0x0232, B:138:0x0233, B:140:0x0247, B:141:0x024c, B:142:0x024e, B:161:0x028d, B:166:0x0290, B:167:0x0291, B:168:0x0292, B:169:0x02ab, B:171:0x02b3, B:174:0x02c2, B:175:0x02db, B:176:0x02df, B:178:0x02e5, B:180:0x02fa, B:181:0x02fe, B:183:0x0304, B:186:0x0310, B:74:0x031f, B:75:0x032b, B:77:0x0331, B:79:0x0375, B:120:0x01f9, B:121:0x0201, B:123:0x0207, B:125:0x021d, B:127:0x0226, B:130:0x022c, B:104:0x01ab, B:105:0x01b3, B:107:0x01b9, B:109:0x01da, B:49:0x011c, B:50:0x0122, B:52:0x0128, B:54:0x013c, B:144:0x024f, B:145:0x0258, B:147:0x025e, B:150:0x026b, B:155:0x0271, B:156:0x0279, B:158:0x027f, B:160:0x028b), top: B:38:0x00da, inners: #1, #2, #4, #5, #8 }] */
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
    public final Object executeOperations$com_onesignal_core(List<C0022b> list, V5.b bVar) {
        g gVar;
        int i2;
        ArrayList arrayList;
        C0022b c0022b;
        b bVar2;
        F2.a aVar;
        int i5;
        Integer retryAfterSeconds;
        b bVar3;
        List<C0022b> list2 = list;
        ?? r32 = "Could not find executor for operation ";
        if (bVar instanceof g) {
            gVar = (g) bVar;
            int i7 = gVar.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                gVar.label = i7 - Integer.MIN_VALUE;
                Object obj = gVar.result;
                W5.a aVar2 = W5.a.f2787d;
                i2 = gVar.label;
                if (i2 != 0) {
                    V6.b.P(obj);
                    try {
                        C0022b c0022b2 = (C0022b) CollectionsKt.o(list2);
                        F2.d dVar = this.executorsMap.get(c0022b2.getOperation().getName());
                        if (dVar == null) {
                            throw new Exception("Could not find executor for operation " + c0022b2.getOperation().getName());
                        }
                        arrayList = new ArrayList(s.g(list2, 10));
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((C0022b) it.next()).getOperation());
                        }
                        gVar.L$0 = this;
                        gVar.L$1 = list2;
                        gVar.L$2 = c0022b2;
                        gVar.L$3 = arrayList;
                        gVar.label = 1;
                        Object execute = dVar.execute(arrayList, gVar);
                        if (execute != aVar2) {
                            c0022b = c0022b2;
                            obj = execute;
                            bVar2 = this;
                        }
                        return aVar2;
                    } catch (Throwable th) {
                        th = th;
                        r32 = this;
                        com.onesignal.debug.internal.logging.b.log(K2.c.ERROR, "Error attempting to execute operation: " + list2, th);
                        r32.dropAndWake(list2);
                        return Unit.f6114a;
                    }
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        list2 = (List) gVar.L$1;
                        b bVar4 = (b) gVar.L$0;
                        V6.b.P(obj);
                        r32 = bVar4;
                        return Unit.f6114a;
                    }
                    F2.a aVar3 = (F2.a) gVar.L$2;
                    List<C0022b> list3 = (List) gVar.L$1;
                    b bVar5 = (b) gVar.L$0;
                    try {
                        V6.b.P(obj);
                        aVar = aVar3;
                        list2 = list3;
                        bVar3 = bVar5;
                        r32 = bVar3;
                        if (aVar.getIdTranslations() != null) {
                            long opRepoPostCreateDelay = ((com.onesignal.core.internal.config.b) bVar3._configModelStore.getModel()).getOpRepoPostCreateDelay();
                            gVar.L$0 = bVar3;
                            gVar.L$1 = list2;
                            gVar.L$2 = null;
                            gVar.label = 3;
                            Object delayForPostCreate = bVar3.delayForPostCreate(opRepoPostCreateDelay, gVar);
                            r32 = bVar3;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        list2 = list3;
                        r32 = bVar5;
                        com.onesignal.debug.internal.logging.b.log(K2.c.ERROR, "Error attempting to execute operation: " + list2, th);
                        r32.dropAndWake(list2);
                        return Unit.f6114a;
                    }
                    return Unit.f6114a;
                }
                ?? r22 = (List) gVar.L$3;
                C0022b c0022b3 = (C0022b) gVar.L$2;
                List<C0022b> list4 = (List) gVar.L$1;
                bVar2 = (b) gVar.L$0;
                try {
                    V6.b.P(obj);
                    arrayList = r22;
                    list2 = list4;
                    c0022b = c0022b3;
                } catch (Throwable th3) {
                    th = th3;
                    list2 = list4;
                    r32 = bVar2;
                    com.onesignal.debug.internal.logging.b.log(K2.c.ERROR, "Error attempting to execute operation: " + list2, th);
                    r32.dropAndWake(list2);
                    return Unit.f6114a;
                }
                aVar = (F2.a) obj;
                com.onesignal.debug.internal.logging.b.debug$default("OperationRepo: execute response = " + aVar.getResult(), null, 2, null);
                if (aVar.getIdTranslations() != null) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        ((C0022b) it2.next()).getOperation().translateIds(aVar.getIdTranslations());
                    }
                    synchronized (bVar2.queue) {
                        try {
                            Iterator it3 = bVar2.queue.iterator();
                            while (it3.hasNext()) {
                                ((C0022b) it3.next()).getOperation().translateIds(aVar.getIdTranslations());
                            }
                            Unit unit = Unit.f6114a;
                        } finally {
                        }
                    }
                    Iterator it4 = aVar.getIdTranslations().values().iterator();
                    while (it4.hasNext()) {
                        bVar2._newRecordState.add((String) it4.next());
                    }
                }
                C c7 = new C();
                switch (com.onesignal.core.internal.operations.impl.c.$EnumSwitchMapping$0[aVar.getResult().ordinal()]) {
                    case 1:
                        Iterator it5 = list2.iterator();
                        while (it5.hasNext()) {
                            com.onesignal.common.modeling.b.remove$default(bVar2._operationModelStore, ((C0022b) it5.next()).getOperation().getId(), null, 2, null);
                        }
                        Iterator it6 = list2.iterator();
                        while (it6.hasNext()) {
                            com.onesignal.common.threading.e waiter = ((C0022b) it6.next()).getWaiter();
                            if (waiter != null) {
                                waiter.wake(Boolean.TRUE);
                            }
                        }
                        if (aVar.getOperations() != null) {
                            synchronized (bVar2.queue) {
                                try {
                                    for (F2.g gVar2 : CollectionsKt.v(aVar.getOperations())) {
                                        String uuid = UUID.randomUUID().toString();
                                        Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
                                        gVar2.setId(uuid);
                                        C0022b c0022b4 = new C0022b(gVar2, null, 0, 0, 10, null);
                                        bVar2.queue.add(0, c0022b4);
                                        com.onesignal.common.modeling.b.add$default(bVar2._operationModelStore, 0, c0022b4.getOperation(), null, 4, null);
                                    }
                                    Unit unit2 = Unit.f6114a;
                                } finally {
                                }
                            }
                        }
                        i5 = c7.f6151d;
                        retryAfterSeconds = aVar.getRetryAfterSeconds();
                        gVar.L$0 = bVar2;
                        gVar.L$1 = list2;
                        gVar.L$2 = aVar;
                        gVar.L$3 = null;
                        gVar.label = 2;
                        if (bVar2.delayBeforeNextExecution(i5, retryAfterSeconds, gVar) != aVar2) {
                            bVar3 = bVar2;
                            r32 = bVar3;
                            if (aVar.getIdTranslations() != null) {
                            }
                            return Unit.f6114a;
                        }
                        return aVar2;
                    case 2:
                        if (!bVar2._identityVerificationService.getNewCodePathsRun() || !com.onesignal.core.internal.operations.impl.d.handleFailUnauthorized(bVar2, c0022b, list2, bVar2._jwtTokenStore, bVar2._identityVerificationService.getIvBehaviorActive())) {
                            com.onesignal.debug.internal.logging.b.warn$default("Operation execution failed without retry: " + arrayList, null, 2, null);
                            bVar2.dropAndWake(list2);
                        }
                        if (aVar.getOperations() != null) {
                        }
                        i5 = c7.f6151d;
                        retryAfterSeconds = aVar.getRetryAfterSeconds();
                        gVar.L$0 = bVar2;
                        gVar.L$1 = list2;
                        gVar.L$2 = aVar;
                        gVar.L$3 = null;
                        gVar.label = 2;
                        if (bVar2.delayBeforeNextExecution(i5, retryAfterSeconds, gVar) != aVar2) {
                        }
                        return aVar2;
                    case 3:
                    case 4:
                        com.onesignal.debug.internal.logging.b.warn$default("Operation execution failed without retry: " + arrayList, null, 2, null);
                        bVar2.dropAndWake(list2);
                        if (aVar.getOperations() != null) {
                        }
                        i5 = c7.f6151d;
                        retryAfterSeconds = aVar.getRetryAfterSeconds();
                        gVar.L$0 = bVar2;
                        gVar.L$1 = list2;
                        gVar.L$2 = aVar;
                        gVar.L$3 = null;
                        gVar.label = 2;
                        if (bVar2.delayBeforeNextExecution(i5, retryAfterSeconds, gVar) != aVar2) {
                        }
                        return aVar2;
                    case 5:
                        com.onesignal.common.modeling.b.remove$default(bVar2._operationModelStore, c0022b.getOperation().getId(), null, 2, null);
                        com.onesignal.common.threading.e waiter2 = c0022b.getWaiter();
                        if (waiter2 != null) {
                            waiter2.wake(Boolean.TRUE);
                        }
                        synchronized (bVar2.queue) {
                            try {
                                ArrayList arrayList2 = new ArrayList();
                                for (Object obj2 : list2) {
                                    if (!Intrinsics.a((C0022b) obj2, c0022b)) {
                                        arrayList2.add(obj2);
                                    }
                                }
                                Iterator it7 = CollectionsKt.v(arrayList2).iterator();
                                while (it7.hasNext()) {
                                    bVar2.queue.add(0, (C0022b) it7.next());
                                }
                                Unit unit3 = Unit.f6114a;
                            } finally {
                            }
                        }
                        if (aVar.getOperations() != null) {
                        }
                        i5 = c7.f6151d;
                        retryAfterSeconds = aVar.getRetryAfterSeconds();
                        gVar.L$0 = bVar2;
                        gVar.L$1 = list2;
                        gVar.L$2 = aVar;
                        gVar.L$3 = null;
                        gVar.label = 2;
                        if (bVar2.delayBeforeNextExecution(i5, retryAfterSeconds, gVar) != aVar2) {
                        }
                        return aVar2;
                    case 6:
                        com.onesignal.debug.internal.logging.b.info$default("Operation execution failed, retrying: " + arrayList, null, 2, null);
                        synchronized (bVar2.queue) {
                            try {
                                for (C0022b c0022b5 : CollectionsKt.v(list2)) {
                                    c0022b5.setRetries(c0022b5.getRetries() + 1);
                                    if (c0022b5.getRetries() > c7.f6151d) {
                                        c7.f6151d = c0022b5.getRetries();
                                    }
                                    bVar2.queue.add(0, c0022b5);
                                }
                                Unit unit4 = Unit.f6114a;
                            } finally {
                            }
                        }
                        if (aVar.getOperations() != null) {
                        }
                        i5 = c7.f6151d;
                        retryAfterSeconds = aVar.getRetryAfterSeconds();
                        gVar.L$0 = bVar2;
                        gVar.L$1 = list2;
                        gVar.L$2 = aVar;
                        gVar.L$3 = null;
                        gVar.label = 2;
                        if (bVar2.delayBeforeNextExecution(i5, retryAfterSeconds, gVar) != aVar2) {
                        }
                        return aVar2;
                    case S.j.DOUBLE_FIELD_NUMBER /* 7 */:
                        com.onesignal.debug.internal.logging.b.error$default("Operation execution failed with eventual retry, pausing the operation repo: " + arrayList, null, 2, null);
                        bVar2.paused = true;
                        Iterator it8 = list2.iterator();
                        while (it8.hasNext()) {
                            com.onesignal.common.threading.e waiter3 = ((C0022b) it8.next()).getWaiter();
                            if (waiter3 != null) {
                                waiter3.wake(Boolean.FALSE);
                            }
                        }
                        synchronized (bVar2.queue) {
                            try {
                                for (C0022b c0022b6 : CollectionsKt.v(list2)) {
                                    bVar2.queue.add(0, new C0022b(c0022b6.getOperation(), null, c0022b6.getBucket(), c0022b6.getRetries()));
                                }
                                Unit unit5 = Unit.f6114a;
                            } finally {
                            }
                        }
                        if (aVar.getOperations() != null) {
                        }
                        i5 = c7.f6151d;
                        retryAfterSeconds = aVar.getRetryAfterSeconds();
                        gVar.L$0 = bVar2;
                        gVar.L$1 = list2;
                        gVar.L$2 = aVar;
                        gVar.L$3 = null;
                        gVar.label = 2;
                        if (bVar2.delayBeforeNextExecution(i5, retryAfterSeconds, gVar) != aVar2) {
                        }
                        return aVar2;
                    default:
                        if (aVar.getOperations() != null) {
                        }
                        i5 = c7.f6151d;
                        retryAfterSeconds = aVar.getRetryAfterSeconds();
                        gVar.L$0 = bVar2;
                        gVar.L$1 = list2;
                        gVar.L$2 = aVar;
                        gVar.L$3 = null;
                        gVar.label = 2;
                        if (bVar2.delayBeforeNextExecution(i5, retryAfterSeconds, gVar) != aVar2) {
                        }
                        return aVar2;
                }
            }
        }
        gVar = new g(bVar);
        Object obj3 = gVar.result;
        W5.a aVar22 = W5.a.f2787d;
        i2 = gVar.label;
        if (i2 != 0) {
        }
        aVar = (F2.a) obj3;
        com.onesignal.debug.internal.logging.b.debug$default("OperationRepo: execute response = " + aVar.getResult(), null, 2, null);
        if (aVar.getIdTranslations() != null) {
        }
        C c72 = new C();
        switch (com.onesignal.core.internal.operations.impl.c.$EnumSwitchMapping$0[aVar.getResult().ordinal()]) {
        }
    }

    @Override // F2.f
    public void forceExecuteOperations() {
        int i2 = 2;
        DefaultConstructorMarker defaultConstructorMarker = null;
        long j7 = 0;
        this.retryWaiter.wake(new a(true, j7, i2, defaultConstructorMarker));
        this.waiter.wake(new a(false, j7, i2, defaultConstructorMarker));
    }

    public final List<C0022b> getNextOps$com_onesignal_core(int i2) {
        Object obj;
        List<C0022b> list = null;
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
                    C0022b c0022b = (C0022b) obj;
                    if (c0022b.getOperation().getCanStartExecute() && this._newRecordState.canAccess(c0022b.getOperation().getApplyToRecordId()) && c0022b.getBucket() <= i2 && (!newCodePathsRun || com.onesignal.core.internal.operations.impl.d.hasValidJwtIfRequired(this, this._jwtTokenStore, c0022b.getOperation(), ivBehaviorActive))) {
                        break;
                    }
                }
                C0022b c0022b2 = (C0022b) obj;
                if (c0022b2 != null) {
                    this.queue.remove(c0022b2);
                    list = getGroupableOperations(c0022b2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return list;
    }

    public final List<C0022b> getQueue$com_onesignal_core() {
        return this.queue;
    }

    public final void loadSavedOperations$com_onesignal_core() {
        this._operationModelStore.loadOperations();
        Iterator it = CollectionsKt.v(this._operationModelStore.list()).iterator();
        while (it.hasNext()) {
            internalEnqueue(new C0022b((F2.g) it.next(), null, this.enqueueIntoBucket, 0, 10, null), false, false, 0);
        }
        ((C0781n) this.initialized).J(Unit.f6114a);
    }

    public final void onJwtConfigHydrated$com_onesignal_core(boolean z7) {
        com.onesignal.common.threading.b.suspendifyOnIO(new h(z7, null));
    }

    public final void removeOperationsWithoutExternalId$com_onesignal_core() {
        int i2;
        ArrayList arrayList;
        synchronized (this.queue) {
            try {
                List<C0022b> list = this.queue;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : list) {
                    if (((C0022b) obj).getOperation().getExternalId() == null) {
                        arrayList2.add(obj);
                    }
                }
                int size = arrayList2.size();
                i2 = 0;
                int i5 = 0;
                while (i5 < size) {
                    Object obj2 = arrayList2.get(i5);
                    i5++;
                    com.onesignal.common.threading.e waiter = ((C0022b) obj2).getWaiter();
                    if (waiter != null) {
                        waiter.wake(Boolean.FALSE);
                    }
                }
                this.queue.removeAll(arrayList2);
                Iterator<T> it = this.queue.iterator();
                while (it.hasNext()) {
                    F2.g operation = ((C0022b) it.next()).getOperation();
                    if ((operation instanceof U3.f) && ((U3.f) operation).getExistingOnesignalId() != null) {
                        com.onesignal.debug.internal.logging.b.debug$default("OperationRepo: cleared existingOnesignalId on LoginUserOperation (was " + ((U3.f) operation).getExistingOnesignalId() + ')', null, 2, null);
                        ((U3.f) operation).setExistingOnesignalId$com_onesignal_core(null);
                    }
                }
                com.onesignal.debug.internal.logging.b.debug$default("OperationRepo: removeOperationsWithoutExternalId removed " + arrayList2.size() + " of " + (arrayList2.size() + this.queue.size()) + " operations", null, 2, null);
                arrayList = new ArrayList(s.g(arrayList2, 10));
                int size2 = arrayList2.size();
                int i7 = 0;
                while (i7 < size2) {
                    Object obj3 = arrayList2.get(i7);
                    i7++;
                    arrayList.add(((C0022b) obj3).getOperation().getId());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        int size3 = arrayList.size();
        while (i2 < size3) {
            Object obj4 = arrayList.get(i2);
            i2++;
            com.onesignal.common.modeling.b.remove$default(this._operationModelStore, (String) obj4, null, 2, null);
        }
    }

    @Override // com.onesignal.core.internal.startup.b
    public void start() {
        this.paused = false;
        this._identityVerificationService.setOnJwtConfigHydratedHandler(new k());
        AbstractC0792z.l(getScope(), null, new l(null), 3);
    }

    public static final class a {
        private final boolean force;
        private final long previousWaitedTime;

        public a(boolean z7, long j) {
            this.force = z7;
            this.previousWaitedTime = j;
        }

        public final boolean getForce() {
            return this.force;
        }

        public final long getPreviousWaitedTime() {
            return this.previousWaitedTime;
        }

        public /* synthetic */ a(boolean z7, long j, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(z7, (i2 & 2) != 0 ? 0L : j);
        }
    }

    /* renamed from: com.onesignal.core.internal.operations.impl.b$b, reason: collision with other inner class name */
    public static final class C0022b {
        private final int bucket;
        private final F2.g operation;
        private int retries;
        private com.onesignal.common.threading.e waiter;

        public C0022b(F2.g operation, com.onesignal.common.threading.e eVar, int i2, int i5) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            this.operation = operation;
            this.waiter = eVar;
            this.bucket = i2;
            this.retries = i5;
        }

        public final int getBucket() {
            return this.bucket;
        }

        public final F2.g getOperation() {
            return this.operation;
        }

        public final int getRetries() {
            return this.retries;
        }

        public final com.onesignal.common.threading.e getWaiter() {
            return this.waiter;
        }

        public final void setRetries(int i2) {
            this.retries = i2;
        }

        public final void setWaiter(com.onesignal.common.threading.e eVar) {
            this.waiter = eVar;
        }

        public String toString() {
            return "bucket:" + this.bucket + ", retries:" + this.retries + ", operation:" + this.operation + '\n';
        }

        public /* synthetic */ C0022b(F2.g gVar, com.onesignal.common.threading.e eVar, int i2, int i5, int i7, DefaultConstructorMarker defaultConstructorMarker) {
            this(gVar, (i7 & 2) != 0 ? null : eVar, i2, (i7 & 8) != 0 ? 0 : i5);
        }
    }
}
