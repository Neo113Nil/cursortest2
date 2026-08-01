package com.onesignal.core.internal.operations.impl;

import ge.a0;
import ge.m;
import ge.n;
import ge.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.i0;
import kotlin.collections.y;
import kotlin.collections.z;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import wd.b0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b implements na.f, ra.b {
    private final com.onesignal.core.internal.config.b _configModelStore;
    private final bd.a _newRecordState;
    private final com.onesignal.core.internal.operations.impl.a _operationModelStore;
    private final sa.a _time;
    private x coroutineScope;
    private int enqueueIntoBucket;
    private final Map<String, na.d> executorsMap;
    private final m initialized;
    private boolean paused;
    private final List<C0019b> queue;
    private final com.onesignal.common.threading.d retryWaiter;
    private final com.onesignal.common.threading.d waiter;

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class c extends nd.i implements Function2 {
        int label;

        public c(ld.a aVar) {
            super(2, aVar);
        }

        @Override // nd.a
        public final ld.a create(Object obj, ld.a aVar) {
            return b.this.new c(aVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(x xVar, ld.a aVar) {
            return ((c) create(xVar, aVar)).invokeSuspend(Unit.f5554a);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            md.a aVar = md.a.f6622d;
            int i3 = this.label;
            if (i3 != 0) {
                if (i3 == 1) {
                    cf.c.M(obj);
                    return obj;
                }
                i0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            cf.c.M(obj);
            com.onesignal.common.threading.d dVar = b.this.retryWaiter;
            this.label = 1;
            Object waitForWake = dVar.waitForWake(this);
            return waitForWake == aVar ? aVar : waitForWake;
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class d extends nd.c {
        long J$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public d(ld.a aVar) {
            super(aVar);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.delayForPostCreate(0L, this);
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class e extends nd.i implements Function1 {
        final /* synthetic */ boolean $flush;
        final /* synthetic */ na.g $operation;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(na.g gVar, boolean z10, ld.a aVar) {
            super(1, aVar);
            this.$operation = gVar;
            this.$flush = z10;
        }

        @Override // nd.a
        public final ld.a create(ld.a aVar) {
            return b.this.new e(this.$operation, this.$flush, aVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(ld.a aVar) {
            return ((e) create(aVar)).invokeSuspend(Unit.f5554a);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            md.a aVar = md.a.f6622d;
            if (this.label != 0) {
                i0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            cf.c.M(obj);
            b bVar = b.this;
            b.internalEnqueue$default(bVar, new C0019b(this.$operation, null, bVar.enqueueIntoBucket, 0, 10, null), this.$flush, true, null, 8, null);
            return Unit.f5554a;
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class f extends nd.c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public f(ld.a aVar) {
            super(aVar);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.executeOperations$com_onesignal_core(null, this);
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class g extends nd.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public g(ld.a aVar) {
            super(aVar);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.processQueueForever(this);
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class h extends nd.i implements Function2 {
        int label;

        public h(ld.a aVar) {
            super(2, aVar);
        }

        @Override // nd.a
        public final ld.a create(Object obj, ld.a aVar) {
            return b.this.new h(aVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(x xVar, ld.a aVar) {
            return ((h) create(xVar, aVar)).invokeSuspend(Unit.f5554a);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            md.a aVar = md.a.f6622d;
            int i3 = this.label;
            if (i3 == 0) {
                cf.c.M(obj);
                b.this.loadSavedOperations$com_onesignal_core();
                b bVar = b.this;
                this.label = 1;
                if (bVar.processQueueForever(this) == aVar) {
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
    public static final class i extends nd.c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public i(ld.a aVar) {
            super(aVar);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.waitForNewOperationAndExecutionInterval(this);
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class j extends nd.i implements Function2 {
        final /* synthetic */ b0 $wakeMessage;
        Object L$0;
        int label;
        final /* synthetic */ b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(b0 b0Var, b bVar, ld.a aVar) {
            super(2, aVar);
            this.$wakeMessage = b0Var;
            this.this$0 = bVar;
        }

        @Override // nd.a
        public final ld.a create(Object obj, ld.a aVar) {
            return new j(this.$wakeMessage, this.this$0, aVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(x xVar, ld.a aVar) {
            return ((j) create(xVar, aVar)).invokeSuspend(Unit.f5554a);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            b0 b0Var;
            md.a aVar = md.a.f6622d;
            int i3 = this.label;
            if (i3 == 0) {
                cf.c.M(obj);
                b0 b0Var2 = this.$wakeMessage;
                com.onesignal.common.threading.d dVar = this.this$0.waiter;
                this.L$0 = b0Var2;
                this.label = 1;
                Object waitForWake = dVar.waitForWake(this);
                if (waitForWake == aVar) {
                    return aVar;
                }
                b0Var = b0Var2;
                obj = waitForWake;
            } else {
                if (i3 != 1) {
                    i0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b0Var = (b0) this.L$0;
                cf.c.M(obj);
            }
            b0Var.f10141d = obj;
            return Unit.f5554a;
        }
    }

    public b(List<? extends na.d> list, com.onesignal.core.internal.operations.impl.a aVar, com.onesignal.core.internal.config.b bVar, sa.a aVar2, bd.a aVar3) {
        list.getClass();
        aVar.getClass();
        bVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        this._operationModelStore = aVar;
        this._configModelStore = bVar;
        this._time = aVar2;
        this._newRecordState = aVar3;
        this.queue = new ArrayList();
        this.waiter = new com.onesignal.common.threading.d();
        this.retryWaiter = new com.onesignal.common.threading.d();
        this.coroutineScope = a0.b(a0.t("OpRepo"));
        this.initialized = a0.a();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (na.d dVar : list) {
            Iterator<String> it = dVar.getOperations().iterator();
            while (it.hasNext()) {
                linkedHashMap.put(it.next(), dVar);
            }
        }
        this.executorsMap = linkedHashMap;
    }

    private final int getExecuteBucket() {
        int i3 = this.enqueueIntoBucket;
        if (i3 == 0) {
            return 0;
        }
        return i3 - 1;
    }

    private final List<C0019b> getGroupableOperations(C0019b c0019b) {
        ArrayList g2 = y.g(c0019b);
        if (c0019b.getOperation().getGroupComparisonType() != na.c.NONE) {
            String createComparisonKey = c0019b.getOperation().getGroupComparisonType() == na.c.CREATE ? c0019b.getOperation().getCreateComparisonKey() : c0019b.getOperation().getModifyComparisonKey();
            for (C0019b c0019b2 : CollectionsKt.Q(this.queue)) {
                String createComparisonKey2 = c0019b.getOperation().getGroupComparisonType() == na.c.CREATE ? c0019b2.getOperation().getCreateComparisonKey() : c0019b2.getOperation().getModifyComparisonKey();
                if (Intrinsics.a(createComparisonKey2, "") && Intrinsics.a(createComparisonKey, "")) {
                    throw new Exception("Both comparison keys can not be blank!");
                }
                if (this._newRecordState.canAccess(c0019b2.getOperation().getApplyToRecordId()) && Intrinsics.a(createComparisonKey2, createComparisonKey)) {
                    this.queue.remove(c0019b2);
                    g2.add(c0019b2);
                }
            }
        }
        return g2;
    }

    private final void internalEnqueue(C0019b c0019b, boolean z10, boolean z11, Integer num) {
        synchronized (this.queue) {
            try {
                List<C0019b> list = this.queue;
                if (list == null || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        if (Intrinsics.a(((C0019b) it.next()).getOperation().getId(), c0019b.getOperation().getId())) {
                            com.onesignal.debug.internal.logging.b.debug$default("OperationRepo: internalEnqueue - operation.id: " + c0019b.getOperation().getId() + " already exists in the queue.", null, 2, null);
                            return;
                        }
                    }
                }
                List<C0019b> list2 = this.queue;
                if (num != null) {
                    list2.add(num.intValue(), c0019b);
                } else {
                    list2.add(c0019b);
                }
                if (z11) {
                    com.onesignal.common.modeling.b.add$default(this._operationModelStore, c0019b.getOperation(), null, 2, null);
                }
                this.waiter.wake(new a(z10, 0L));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* synthetic */ void internalEnqueue$default(b bVar, C0019b c0019b, boolean z10, boolean z11, Integer num, int i3, Object obj) {
        if ((i3 & 8) != 0) {
            num = null;
        }
        bVar.internalEnqueue(c0019b, z10, z11, num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0098, code lost:
    
        if (r2.executeOperations$com_onesignal_core(r11, r0) == r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00af, code lost:
    
        if (ge.a0.i(r7, r0) == r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ba, code lost:
    
        if (r2.waitForNewOperationAndExecutionInterval(r0) == r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00af -> B:14:0x0068). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00ba -> B:13:0x00bd). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object processQueueForever(ld.a aVar) {
        g gVar;
        int i3;
        b bVar;
        if (aVar instanceof g) {
            gVar = (g) aVar;
            int i10 = gVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gVar.label = i10 - Integer.MIN_VALUE;
                Object obj = gVar.result;
                md.a aVar2 = md.a.f6622d;
                i3 = gVar.label;
                if (i3 != 0) {
                    cf.c.M(obj);
                    gVar.L$0 = this;
                    gVar.label = 1;
                    if (waitForNewOperationAndExecutionInterval(gVar) != aVar2) {
                        bVar = this;
                    }
                    return aVar2;
                }
                if (i3 == 1) {
                    bVar = (b) gVar.L$0;
                    cf.c.M(obj);
                } else if (i3 == 2) {
                    bVar = (b) gVar.L$0;
                    cf.c.M(obj);
                    long opRepoPostWakeDelay = ((com.onesignal.core.internal.config.a) bVar._configModelStore.getModel()).getOpRepoPostWakeDelay();
                    gVar.L$0 = bVar;
                    gVar.label = 3;
                } else {
                    if (i3 != 3) {
                        if (i3 != 4) {
                            i0.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        bVar = (b) gVar.L$0;
                        cf.c.M(obj);
                        bVar.enqueueIntoBucket++;
                        if (!bVar.paused) {
                            com.onesignal.debug.internal.logging.b.debug$default("OperationRepo is paused", null, 2, null);
                            return Unit.f5554a;
                        }
                        List<C0019b> nextOps$com_onesignal_core = bVar.getNextOps$com_onesignal_core(bVar.getExecuteBucket());
                        com.onesignal.debug.internal.logging.b.debug$default("processQueueForever:ops:\n" + nextOps$com_onesignal_core, null, 2, null);
                        if (nextOps$com_onesignal_core != null) {
                            gVar.L$0 = bVar;
                            gVar.label = 2;
                        } else {
                            gVar.L$0 = bVar;
                            gVar.label = 4;
                        }
                        return aVar2;
                    }
                    bVar = (b) gVar.L$0;
                    cf.c.M(obj);
                    if (!bVar.paused) {
                    }
                }
                bVar.enqueueIntoBucket++;
                if (!bVar.paused) {
                }
            }
        }
        gVar = new g(aVar);
        Object obj2 = gVar.result;
        md.a aVar22 = md.a.f6622d;
        i3 = gVar.label;
        if (i3 != 0) {
        }
        bVar.enqueueIntoBucket++;
        if (!bVar.paused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0099, code lost:
    
        if (r11 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0099 -> B:11:0x009c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object waitForNewOperationAndExecutionInterval(ld.a aVar) {
        i iVar;
        int i3;
        b0 b0Var;
        b bVar;
        b0 b0Var2;
        long opRepoExecutionInterval;
        b0 b0Var3;
        b bVar2;
        if (aVar instanceof i) {
            iVar = (i) aVar;
            int i10 = iVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                iVar.label = i10 - Integer.MIN_VALUE;
                Object obj = iVar.result;
                md.a aVar2 = md.a.f6622d;
                i3 = iVar.label;
                if (i3 != 0) {
                    cf.c.M(obj);
                    b0Var = new b0();
                    com.onesignal.common.threading.d dVar = this.waiter;
                    iVar.L$0 = this;
                    iVar.L$1 = b0Var;
                    iVar.L$2 = b0Var;
                    iVar.label = 1;
                    obj = dVar.waitForWake(iVar);
                    if (obj != aVar2) {
                        bVar = this;
                        b0Var2 = b0Var;
                    }
                    return aVar2;
                }
                if (i3 != 1) {
                    if (i3 != 2) {
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b0Var3 = (b0) iVar.L$1;
                    bVar2 = (b) iVar.L$0;
                    cf.c.M(obj);
                    if (obj != null) {
                        opRepoExecutionInterval = ((com.onesignal.core.internal.config.a) bVar2._configModelStore.getModel()).getOpRepoExecutionInterval();
                        if (!((a) b0Var3.f10141d).getForce()) {
                            j jVar = new j(b0Var3, bVar2, null);
                            iVar.L$0 = bVar2;
                            iVar.L$1 = b0Var3;
                            iVar.L$2 = null;
                            iVar.label = 2;
                            obj = a0.D(opRepoExecutionInterval, jVar, iVar);
                        }
                    }
                    return Unit.f5554a;
                }
                b0Var = (b0) iVar.L$2;
                b0Var2 = (b0) iVar.L$1;
                bVar = (b) iVar.L$0;
                cf.c.M(obj);
                b0Var.f10141d = obj;
                opRepoExecutionInterval = ((com.onesignal.core.internal.config.a) bVar._configModelStore.getModel()).getOpRepoExecutionInterval() - ((a) b0Var2.f10141d).getPreviousWaitedTime();
                b0Var3 = b0Var2;
                bVar2 = bVar;
                if (!((a) b0Var3.f10141d).getForce()) {
                }
                return Unit.f5554a;
            }
        }
        iVar = new i(aVar);
        Object obj2 = iVar.result;
        md.a aVar22 = md.a.f6622d;
        i3 = iVar.label;
        if (i3 != 0) {
        }
        b0Var.f10141d = obj2;
        opRepoExecutionInterval = ((com.onesignal.core.internal.config.a) bVar._configModelStore.getModel()).getOpRepoExecutionInterval() - ((a) b0Var2.f10141d).getPreviousWaitedTime();
        b0Var3 = b0Var2;
        bVar2 = bVar;
        if (!((a) b0Var3.f10141d).getForce()) {
        }
        return Unit.f5554a;
    }

    @Override // na.f
    public Object awaitInitialized(ld.a aVar) {
        Object f02 = ((n) this.initialized).f0(aVar);
        return f02 == md.a.f6622d ? f02 : Unit.f5554a;
    }

    @Override // na.f
    public <T extends na.g> boolean containsInstanceOf(ce.b bVar) {
        boolean z10;
        bVar.getClass();
        synchronized (this.queue) {
            try {
                List<C0019b> list = this.queue;
                z10 = false;
                if (list == null || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (((wd.h) bVar).d(((C0019b) it.next()).getOperation())) {
                            z10 = true;
                            break;
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z10;
    }

    public final Object delayBeforeNextExecution(int i3, Integer num, ld.a aVar) {
        com.onesignal.debug.internal.logging.b.debug$default("retryAfterSeconds: " + num, null, 2, null);
        long max = Math.max(((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getOpRepoDefaultFailRetryBackoff() * i3, (num != null ? num.intValue() : 0L) * 1000);
        if (max < 1) {
            return Unit.f5554a;
        }
        com.onesignal.debug.internal.logging.b.error$default("Operations being delay for: " + max + " ms", null, 2, null);
        Object D = a0.D(max, new c(null), aVar);
        return D == md.a.f6622d ? D : Unit.f5554a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object delayForPostCreate(long j3, ld.a aVar) {
        d dVar;
        int i3;
        b bVar;
        if (aVar instanceof d) {
            dVar = (d) aVar;
            int i10 = dVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar.label = i10 - Integer.MIN_VALUE;
                Object obj = dVar.result;
                md.a aVar2 = md.a.f6622d;
                i3 = dVar.label;
                if (i3 != 0) {
                    cf.c.M(obj);
                    dVar.L$0 = this;
                    dVar.J$0 = j3;
                    dVar.label = 1;
                    if (a0.i(j3, dVar) == aVar2) {
                        return aVar2;
                    }
                    bVar = this;
                } else {
                    if (i3 != 1) {
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j3 = dVar.J$0;
                    bVar = (b) dVar.L$0;
                    cf.c.M(obj);
                }
                synchronized (bVar.queue) {
                    if (!bVar.queue.isEmpty()) {
                        bVar.waiter.wake(new a(false, j3));
                    }
                }
                return Unit.f5554a;
            }
        }
        dVar = new d(aVar);
        Object obj2 = dVar.result;
        md.a aVar22 = md.a.f6622d;
        i3 = dVar.label;
        if (i3 != 0) {
        }
        synchronized (bVar.queue) {
        }
    }

    @Override // na.f
    public void enqueue(na.g gVar, boolean z10) {
        gVar.getClass();
        com.onesignal.debug.internal.logging.b.log(ua.c.DEBUG, "OperationRepo.enqueue(operation: " + gVar + ", flush: " + z10 + ')');
        String uuid = UUID.randomUUID().toString();
        uuid.getClass();
        gVar.setId(uuid);
        com.onesignal.common.threading.a.INSTANCE.execute(new e(gVar, z10, null));
    }

    @Override // na.f
    public Object enqueueAndWait(na.g gVar, boolean z10, ld.a aVar) {
        com.onesignal.debug.internal.logging.b.log(ua.c.DEBUG, "OperationRepo.enqueueAndWait(operation: " + gVar + ", force: " + z10 + ')');
        String uuid = UUID.randomUUID().toString();
        uuid.getClass();
        gVar.setId(uuid);
        com.onesignal.common.threading.d dVar = new com.onesignal.common.threading.d();
        internalEnqueue$default(this, new C0019b(gVar, dVar, this.enqueueIntoBucket, 0, 8, null), z10, true, null, 8, null);
        return dVar.waitForWake(aVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(9:5|6|7|(1:(1:(1:(5:12|13|14|15|16)(2:19|20))(9:21|22|23|24|25|(1:27)|14|15|16))(4:49|50|51|52))(4:200|201|202|(6:204|(2:207|205)|208|209|(1:211)|29)(2:212|213))|53|54|(8:56|(2:59|57)|60|61|11a|70|(2:73|71)|74)|79|80))|217|6|7|(0)(0)|53|54|(0)|79|80|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0115, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x003f, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x037a, code lost:
    
        if (r0 == r5) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x03b4, code lost:
    
        com.onesignal.common.modeling.b.remove$default(r3._operationModelStore, ((com.onesignal.core.internal.operations.impl.b.C0019b) r0.next()).getOperation().getId(), null, 2, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x03d2, code lost:
    
        r2 = ((com.onesignal.core.internal.operations.impl.b.C0019b) r0.next()).getWaiter();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x03dc, code lost:
    
        if (r2 != null) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x03de, code lost:
    
        r2.wake(java.lang.Boolean.FALSE);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0175 A[Catch: all -> 0x0115, TryCatch #1 {all -> 0x0115, blocks: (B:54:0x00d9, B:56:0x00f9, B:57:0x00fd, B:59:0x0103, B:61:0x0118, B:62:0x011a, B:69:0x013b, B:70:0x013c, B:71:0x014a, B:73:0x0150, B:77:0x015c, B:78:0x015d, B:79:0x015e, B:80:0x0170, B:82:0x02e4, B:84:0x02ea, B:85:0x02ec, B:92:0x033f, B:96:0x0341, B:97:0x0342, B:98:0x0343, B:101:0x0175, B:102:0x018d, B:109:0x01aa, B:113:0x01ad, B:114:0x01ae, B:115:0x01af, B:116:0x01c5, B:127:0x01fa, B:132:0x01fd, B:133:0x01fe, B:134:0x01ff, B:136:0x0212, B:137:0x0217, B:138:0x0219, B:155:0x0257, B:160:0x025a, B:161:0x025b, B:162:0x025c, B:163:0x0274, B:165:0x027a, B:167:0x028e, B:168:0x0292, B:170:0x0298, B:173:0x02a4, B:178:0x02aa, B:179:0x02ae, B:181:0x02b4, B:183:0x02c8, B:184:0x02cc, B:186:0x02d2, B:189:0x02de, B:118:0x01c6, B:119:0x01ce, B:121:0x01d4, B:123:0x01ea, B:124:0x01f3, B:104:0x018e, B:105:0x0196, B:107:0x019c, B:64:0x011b, B:65:0x0121, B:67:0x0127, B:140:0x021a, B:141:0x0223, B:143:0x0229, B:145:0x0236, B:150:0x023d, B:151:0x0245, B:153:0x024b, B:87:0x02ed, B:88:0x02f9, B:90:0x02ff), top: B:53:0x00d9, inners: #0, #2, #3, #4, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01af A[Catch: all -> 0x0115, TryCatch #1 {all -> 0x0115, blocks: (B:54:0x00d9, B:56:0x00f9, B:57:0x00fd, B:59:0x0103, B:61:0x0118, B:62:0x011a, B:69:0x013b, B:70:0x013c, B:71:0x014a, B:73:0x0150, B:77:0x015c, B:78:0x015d, B:79:0x015e, B:80:0x0170, B:82:0x02e4, B:84:0x02ea, B:85:0x02ec, B:92:0x033f, B:96:0x0341, B:97:0x0342, B:98:0x0343, B:101:0x0175, B:102:0x018d, B:109:0x01aa, B:113:0x01ad, B:114:0x01ae, B:115:0x01af, B:116:0x01c5, B:127:0x01fa, B:132:0x01fd, B:133:0x01fe, B:134:0x01ff, B:136:0x0212, B:137:0x0217, B:138:0x0219, B:155:0x0257, B:160:0x025a, B:161:0x025b, B:162:0x025c, B:163:0x0274, B:165:0x027a, B:167:0x028e, B:168:0x0292, B:170:0x0298, B:173:0x02a4, B:178:0x02aa, B:179:0x02ae, B:181:0x02b4, B:183:0x02c8, B:184:0x02cc, B:186:0x02d2, B:189:0x02de, B:118:0x01c6, B:119:0x01ce, B:121:0x01d4, B:123:0x01ea, B:124:0x01f3, B:104:0x018e, B:105:0x0196, B:107:0x019c, B:64:0x011b, B:65:0x0121, B:67:0x0127, B:140:0x021a, B:141:0x0223, B:143:0x0229, B:145:0x0236, B:150:0x023d, B:151:0x0245, B:153:0x024b, B:87:0x02ed, B:88:0x02f9, B:90:0x02ff), top: B:53:0x00d9, inners: #0, #2, #3, #4, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01ff A[Catch: all -> 0x0115, TryCatch #1 {all -> 0x0115, blocks: (B:54:0x00d9, B:56:0x00f9, B:57:0x00fd, B:59:0x0103, B:61:0x0118, B:62:0x011a, B:69:0x013b, B:70:0x013c, B:71:0x014a, B:73:0x0150, B:77:0x015c, B:78:0x015d, B:79:0x015e, B:80:0x0170, B:82:0x02e4, B:84:0x02ea, B:85:0x02ec, B:92:0x033f, B:96:0x0341, B:97:0x0342, B:98:0x0343, B:101:0x0175, B:102:0x018d, B:109:0x01aa, B:113:0x01ad, B:114:0x01ae, B:115:0x01af, B:116:0x01c5, B:127:0x01fa, B:132:0x01fd, B:133:0x01fe, B:134:0x01ff, B:136:0x0212, B:137:0x0217, B:138:0x0219, B:155:0x0257, B:160:0x025a, B:161:0x025b, B:162:0x025c, B:163:0x0274, B:165:0x027a, B:167:0x028e, B:168:0x0292, B:170:0x0298, B:173:0x02a4, B:178:0x02aa, B:179:0x02ae, B:181:0x02b4, B:183:0x02c8, B:184:0x02cc, B:186:0x02d2, B:189:0x02de, B:118:0x01c6, B:119:0x01ce, B:121:0x01d4, B:123:0x01ea, B:124:0x01f3, B:104:0x018e, B:105:0x0196, B:107:0x019c, B:64:0x011b, B:65:0x0121, B:67:0x0127, B:140:0x021a, B:141:0x0223, B:143:0x0229, B:145:0x0236, B:150:0x023d, B:151:0x0245, B:153:0x024b, B:87:0x02ed, B:88:0x02f9, B:90:0x02ff), top: B:53:0x00d9, inners: #0, #2, #3, #4, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x025c A[Catch: all -> 0x0115, TryCatch #1 {all -> 0x0115, blocks: (B:54:0x00d9, B:56:0x00f9, B:57:0x00fd, B:59:0x0103, B:61:0x0118, B:62:0x011a, B:69:0x013b, B:70:0x013c, B:71:0x014a, B:73:0x0150, B:77:0x015c, B:78:0x015d, B:79:0x015e, B:80:0x0170, B:82:0x02e4, B:84:0x02ea, B:85:0x02ec, B:92:0x033f, B:96:0x0341, B:97:0x0342, B:98:0x0343, B:101:0x0175, B:102:0x018d, B:109:0x01aa, B:113:0x01ad, B:114:0x01ae, B:115:0x01af, B:116:0x01c5, B:127:0x01fa, B:132:0x01fd, B:133:0x01fe, B:134:0x01ff, B:136:0x0212, B:137:0x0217, B:138:0x0219, B:155:0x0257, B:160:0x025a, B:161:0x025b, B:162:0x025c, B:163:0x0274, B:165:0x027a, B:167:0x028e, B:168:0x0292, B:170:0x0298, B:173:0x02a4, B:178:0x02aa, B:179:0x02ae, B:181:0x02b4, B:183:0x02c8, B:184:0x02cc, B:186:0x02d2, B:189:0x02de, B:118:0x01c6, B:119:0x01ce, B:121:0x01d4, B:123:0x01ea, B:124:0x01f3, B:104:0x018e, B:105:0x0196, B:107:0x019c, B:64:0x011b, B:65:0x0121, B:67:0x0127, B:140:0x021a, B:141:0x0223, B:143:0x0229, B:145:0x0236, B:150:0x023d, B:151:0x0245, B:153:0x024b, B:87:0x02ed, B:88:0x02f9, B:90:0x02ff), top: B:53:0x00d9, inners: #0, #2, #3, #4, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02aa A[Catch: all -> 0x0115, TryCatch #1 {all -> 0x0115, blocks: (B:54:0x00d9, B:56:0x00f9, B:57:0x00fd, B:59:0x0103, B:61:0x0118, B:62:0x011a, B:69:0x013b, B:70:0x013c, B:71:0x014a, B:73:0x0150, B:77:0x015c, B:78:0x015d, B:79:0x015e, B:80:0x0170, B:82:0x02e4, B:84:0x02ea, B:85:0x02ec, B:92:0x033f, B:96:0x0341, B:97:0x0342, B:98:0x0343, B:101:0x0175, B:102:0x018d, B:109:0x01aa, B:113:0x01ad, B:114:0x01ae, B:115:0x01af, B:116:0x01c5, B:127:0x01fa, B:132:0x01fd, B:133:0x01fe, B:134:0x01ff, B:136:0x0212, B:137:0x0217, B:138:0x0219, B:155:0x0257, B:160:0x025a, B:161:0x025b, B:162:0x025c, B:163:0x0274, B:165:0x027a, B:167:0x028e, B:168:0x0292, B:170:0x0298, B:173:0x02a4, B:178:0x02aa, B:179:0x02ae, B:181:0x02b4, B:183:0x02c8, B:184:0x02cc, B:186:0x02d2, B:189:0x02de, B:118:0x01c6, B:119:0x01ce, B:121:0x01d4, B:123:0x01ea, B:124:0x01f3, B:104:0x018e, B:105:0x0196, B:107:0x019c, B:64:0x011b, B:65:0x0121, B:67:0x0127, B:140:0x021a, B:141:0x0223, B:143:0x0229, B:145:0x0236, B:150:0x023d, B:151:0x0245, B:153:0x024b, B:87:0x02ed, B:88:0x02f9, B:90:0x02ff), top: B:53:0x00d9, inners: #0, #2, #3, #4, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0361 A[Catch: all -> 0x003f, TRY_LEAVE, TryCatch #9 {all -> 0x003f, blocks: (B:13:0x003a, B:25:0x035b, B:27:0x0361), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x03b4 A[LOOP:0: B:34:0x03ae->B:36:0x03b4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f9 A[Catch: all -> 0x0115, TryCatch #1 {all -> 0x0115, blocks: (B:54:0x00d9, B:56:0x00f9, B:57:0x00fd, B:59:0x0103, B:61:0x0118, B:62:0x011a, B:69:0x013b, B:70:0x013c, B:71:0x014a, B:73:0x0150, B:77:0x015c, B:78:0x015d, B:79:0x015e, B:80:0x0170, B:82:0x02e4, B:84:0x02ea, B:85:0x02ec, B:92:0x033f, B:96:0x0341, B:97:0x0342, B:98:0x0343, B:101:0x0175, B:102:0x018d, B:109:0x01aa, B:113:0x01ad, B:114:0x01ae, B:115:0x01af, B:116:0x01c5, B:127:0x01fa, B:132:0x01fd, B:133:0x01fe, B:134:0x01ff, B:136:0x0212, B:137:0x0217, B:138:0x0219, B:155:0x0257, B:160:0x025a, B:161:0x025b, B:162:0x025c, B:163:0x0274, B:165:0x027a, B:167:0x028e, B:168:0x0292, B:170:0x0298, B:173:0x02a4, B:178:0x02aa, B:179:0x02ae, B:181:0x02b4, B:183:0x02c8, B:184:0x02cc, B:186:0x02d2, B:189:0x02de, B:118:0x01c6, B:119:0x01ce, B:121:0x01d4, B:123:0x01ea, B:124:0x01f3, B:104:0x018e, B:105:0x0196, B:107:0x019c, B:64:0x011b, B:65:0x0121, B:67:0x0127, B:140:0x021a, B:141:0x0223, B:143:0x0229, B:145:0x0236, B:150:0x023d, B:151:0x0245, B:153:0x024b, B:87:0x02ed, B:88:0x02f9, B:90:0x02ff), top: B:53:0x00d9, inners: #0, #2, #3, #4, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0173 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02ea A[Catch: all -> 0x0115, TryCatch #1 {all -> 0x0115, blocks: (B:54:0x00d9, B:56:0x00f9, B:57:0x00fd, B:59:0x0103, B:61:0x0118, B:62:0x011a, B:69:0x013b, B:70:0x013c, B:71:0x014a, B:73:0x0150, B:77:0x015c, B:78:0x015d, B:79:0x015e, B:80:0x0170, B:82:0x02e4, B:84:0x02ea, B:85:0x02ec, B:92:0x033f, B:96:0x0341, B:97:0x0342, B:98:0x0343, B:101:0x0175, B:102:0x018d, B:109:0x01aa, B:113:0x01ad, B:114:0x01ae, B:115:0x01af, B:116:0x01c5, B:127:0x01fa, B:132:0x01fd, B:133:0x01fe, B:134:0x01ff, B:136:0x0212, B:137:0x0217, B:138:0x0219, B:155:0x0257, B:160:0x025a, B:161:0x025b, B:162:0x025c, B:163:0x0274, B:165:0x027a, B:167:0x028e, B:168:0x0292, B:170:0x0298, B:173:0x02a4, B:178:0x02aa, B:179:0x02ae, B:181:0x02b4, B:183:0x02c8, B:184:0x02cc, B:186:0x02d2, B:189:0x02de, B:118:0x01c6, B:119:0x01ce, B:121:0x01d4, B:123:0x01ea, B:124:0x01f3, B:104:0x018e, B:105:0x0196, B:107:0x019c, B:64:0x011b, B:65:0x0121, B:67:0x0127, B:140:0x021a, B:141:0x0223, B:143:0x0229, B:145:0x0236, B:150:0x023d, B:151:0x0245, B:153:0x024b, B:87:0x02ed, B:88:0x02f9, B:90:0x02ff), top: B:53:0x00d9, inners: #0, #2, #3, #4, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.onesignal.core.internal.operations.impl.b] */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object executeOperations$com_onesignal_core(List<C0019b> list, ld.a aVar) {
        f fVar;
        int i3;
        Iterator it;
        Iterator it2;
        List<? extends na.g> arrayList;
        C0019b c0019b;
        b bVar;
        na.a aVar2;
        int i10;
        Integer retryAfterSeconds;
        b bVar2;
        List<C0019b> list2 = list;
        ?? r32 = "Could not find executor for operation ";
        if (aVar instanceof f) {
            fVar = (f) aVar;
            int i11 = fVar.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                fVar.label = i11 - Integer.MIN_VALUE;
                Object obj = fVar.result;
                md.a aVar3 = md.a.f6622d;
                i3 = fVar.label;
                int i12 = 1;
                if (i3 != 0) {
                    cf.c.M(obj);
                    try {
                        C0019b c0019b2 = (C0019b) CollectionsKt.x(list2);
                        na.d dVar = this.executorsMap.get(c0019b2.getOperation().getName());
                        if (dVar == null) {
                            throw new Exception("Could not find executor for operation " + c0019b2.getOperation().getName());
                        }
                        arrayList = new ArrayList<>(z.j(list2, 10));
                        Iterator it3 = list2.iterator();
                        while (it3.hasNext()) {
                            arrayList.add(((C0019b) it3.next()).getOperation());
                        }
                        fVar.L$0 = this;
                        fVar.L$1 = list2;
                        fVar.L$2 = c0019b2;
                        fVar.L$3 = arrayList;
                        fVar.label = 1;
                        Object execute = dVar.execute(arrayList, fVar);
                        if (execute != aVar3) {
                            c0019b = c0019b2;
                            obj = execute;
                            bVar = this;
                        }
                        return aVar3;
                    } catch (Throwable th) {
                        th = th;
                        r32 = this;
                        com.onesignal.debug.internal.logging.b.log(ua.c.ERROR, "Error attempting to execute operation: " + list2, th);
                        it = list2.iterator();
                        while (it.hasNext()) {
                        }
                        it2 = list2.iterator();
                        while (it2.hasNext()) {
                        }
                        return Unit.f5554a;
                    }
                }
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            i0.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        list2 = (List) fVar.L$1;
                        b bVar3 = (b) fVar.L$0;
                        cf.c.M(obj);
                        r32 = bVar3;
                        return Unit.f5554a;
                    }
                    na.a aVar4 = (na.a) fVar.L$2;
                    List<C0019b> list3 = (List) fVar.L$1;
                    b bVar4 = (b) fVar.L$0;
                    try {
                        cf.c.M(obj);
                        aVar2 = aVar4;
                        list2 = list3;
                        bVar2 = bVar4;
                        r32 = bVar2;
                        if (aVar2.getIdTranslations() != null) {
                            long opRepoPostCreateDelay = ((com.onesignal.core.internal.config.a) bVar2._configModelStore.getModel()).getOpRepoPostCreateDelay();
                            fVar.L$0 = bVar2;
                            fVar.L$1 = list2;
                            fVar.L$2 = null;
                            fVar.label = 3;
                            Object delayForPostCreate = bVar2.delayForPostCreate(opRepoPostCreateDelay, fVar);
                            r32 = bVar2;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        list2 = list3;
                        r32 = bVar4;
                        com.onesignal.debug.internal.logging.b.log(ua.c.ERROR, "Error attempting to execute operation: " + list2, th);
                        it = list2.iterator();
                        while (it.hasNext()) {
                        }
                        it2 = list2.iterator();
                        while (it2.hasNext()) {
                        }
                        return Unit.f5554a;
                    }
                    return Unit.f5554a;
                }
                List<? extends na.g> list4 = (List) fVar.L$3;
                C0019b c0019b3 = (C0019b) fVar.L$2;
                List<C0019b> list5 = (List) fVar.L$1;
                bVar = (b) fVar.L$0;
                try {
                    cf.c.M(obj);
                    arrayList = list4;
                    list2 = list5;
                    c0019b = c0019b3;
                } catch (Throwable th3) {
                    th = th3;
                    list2 = list5;
                    r32 = bVar;
                    com.onesignal.debug.internal.logging.b.log(ua.c.ERROR, "Error attempting to execute operation: " + list2, th);
                    it = list2.iterator();
                    while (it.hasNext()) {
                    }
                    it2 = list2.iterator();
                    while (it2.hasNext()) {
                    }
                    return Unit.f5554a;
                }
                aVar2 = (na.a) obj;
                com.onesignal.debug.internal.logging.b.debug$default("OperationRepo: execute response = " + aVar2.getResult(), null, 2, null);
                if (aVar2.getIdTranslations() != null) {
                    Iterator it4 = list2.iterator();
                    while (it4.hasNext()) {
                        ((C0019b) it4.next()).getOperation().translateIds(aVar2.getIdTranslations());
                    }
                    synchronized (bVar.queue) {
                        Iterator it5 = bVar.queue.iterator();
                        while (it5.hasNext()) {
                            ((C0019b) it5.next()).getOperation().translateIds(aVar2.getIdTranslations());
                        }
                    }
                    Iterator it6 = aVar2.getIdTranslations().values().iterator();
                    while (it6.hasNext()) {
                        bVar._newRecordState.add((String) it6.next());
                    }
                }
                wd.a0 a0Var = new wd.a0();
                switch (com.onesignal.core.internal.operations.impl.c.$EnumSwitchMapping$0[aVar2.getResult().ordinal()]) {
                    case 1:
                        Iterator it7 = list2.iterator();
                        while (it7.hasNext()) {
                            com.onesignal.common.modeling.b.remove$default(bVar._operationModelStore, ((C0019b) it7.next()).getOperation().getId(), null, 2, null);
                        }
                        Iterator it8 = list2.iterator();
                        while (it8.hasNext()) {
                            com.onesignal.common.threading.d waiter = ((C0019b) it8.next()).getWaiter();
                            if (waiter != null) {
                                waiter.wake(Boolean.TRUE);
                            }
                        }
                        if (aVar2.getOperations() != null) {
                            synchronized (bVar.queue) {
                                for (na.g gVar : CollectionsKt.J(aVar2.getOperations())) {
                                    String uuid = UUID.randomUUID().toString();
                                    uuid.getClass();
                                    gVar.setId(uuid);
                                    C0019b c0019b4 = new C0019b(gVar, null, 0, 0, 10, null);
                                    bVar.queue.add(0, c0019b4);
                                    com.onesignal.common.modeling.b.add$default(bVar._operationModelStore, 0, c0019b4.getOperation(), null, 4, null);
                                }
                            }
                        }
                        i10 = a0Var.f10139d;
                        retryAfterSeconds = aVar2.getRetryAfterSeconds();
                        fVar.L$0 = bVar;
                        fVar.L$1 = list2;
                        fVar.L$2 = aVar2;
                        fVar.L$3 = null;
                        fVar.label = 2;
                        if (bVar.delayBeforeNextExecution(i10, retryAfterSeconds, fVar) != aVar3) {
                            bVar2 = bVar;
                            r32 = bVar2;
                            if (aVar2.getIdTranslations() != null) {
                            }
                            return Unit.f5554a;
                        }
                        return aVar3;
                    case 2:
                    case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                    case a4.j.LONG_FIELD_NUMBER /* 4 */:
                        com.onesignal.debug.internal.logging.b.error$default("Operation execution failed without retry: " + arrayList, null, 2, null);
                        Iterator it9 = list2.iterator();
                        while (it9.hasNext()) {
                            com.onesignal.common.modeling.b.remove$default(bVar._operationModelStore, ((C0019b) it9.next()).getOperation().getId(), null, 2, null);
                        }
                        Iterator it10 = list2.iterator();
                        while (it10.hasNext()) {
                            com.onesignal.common.threading.d waiter2 = ((C0019b) it10.next()).getWaiter();
                            if (waiter2 != null) {
                                waiter2.wake(Boolean.FALSE);
                            }
                        }
                        if (aVar2.getOperations() != null) {
                        }
                        i10 = a0Var.f10139d;
                        retryAfterSeconds = aVar2.getRetryAfterSeconds();
                        fVar.L$0 = bVar;
                        fVar.L$1 = list2;
                        fVar.L$2 = aVar2;
                        fVar.L$3 = null;
                        fVar.label = 2;
                        if (bVar.delayBeforeNextExecution(i10, retryAfterSeconds, fVar) != aVar3) {
                        }
                        return aVar3;
                    case a4.j.STRING_FIELD_NUMBER /* 5 */:
                        com.onesignal.common.modeling.b.remove$default(bVar._operationModelStore, c0019b.getOperation().getId(), null, 2, null);
                        com.onesignal.common.threading.d waiter3 = c0019b.getWaiter();
                        if (waiter3 != null) {
                            waiter3.wake(Boolean.TRUE);
                        }
                        synchronized (bVar.queue) {
                            try {
                                ArrayList arrayList2 = new ArrayList();
                                for (Object obj2 : list2) {
                                    if (!Intrinsics.a((C0019b) obj2, c0019b)) {
                                        arrayList2.add(obj2);
                                    }
                                }
                                Iterator it11 = CollectionsKt.J(arrayList2).iterator();
                                while (it11.hasNext()) {
                                    bVar.queue.add(0, (C0019b) it11.next());
                                }
                            } finally {
                            }
                        }
                        if (aVar2.getOperations() != null) {
                        }
                        i10 = a0Var.f10139d;
                        retryAfterSeconds = aVar2.getRetryAfterSeconds();
                        fVar.L$0 = bVar;
                        fVar.L$1 = list2;
                        fVar.L$2 = aVar2;
                        fVar.L$3 = null;
                        fVar.label = 2;
                        if (bVar.delayBeforeNextExecution(i10, retryAfterSeconds, fVar) != aVar3) {
                        }
                        return aVar3;
                    case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                        com.onesignal.debug.internal.logging.b.error$default("Operation execution failed, retrying: " + arrayList, null, 2, null);
                        synchronized (bVar.queue) {
                            try {
                                for (C0019b c0019b5 : CollectionsKt.J(list2)) {
                                    c0019b5.setRetries(c0019b5.getRetries() + i12);
                                    if (c0019b5.getRetries() > a0Var.f10139d) {
                                        a0Var.f10139d = c0019b5.getRetries();
                                    }
                                    bVar.queue.add(0, c0019b5);
                                    i12 = 1;
                                }
                            } finally {
                            }
                        }
                        if (aVar2.getOperations() != null) {
                        }
                        i10 = a0Var.f10139d;
                        retryAfterSeconds = aVar2.getRetryAfterSeconds();
                        fVar.L$0 = bVar;
                        fVar.L$1 = list2;
                        fVar.L$2 = aVar2;
                        fVar.L$3 = null;
                        fVar.label = 2;
                        if (bVar.delayBeforeNextExecution(i10, retryAfterSeconds, fVar) != aVar3) {
                        }
                        return aVar3;
                    case a4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                        com.onesignal.debug.internal.logging.b.error$default("Operation execution failed with eventual retry, pausing the operation repo: " + arrayList, null, 2, null);
                        bVar.paused = true;
                        synchronized (bVar.queue) {
                            Iterator it12 = CollectionsKt.J(list2).iterator();
                            while (it12.hasNext()) {
                                bVar.queue.add(0, (C0019b) it12.next());
                            }
                        }
                        if (aVar2.getOperations() != null) {
                        }
                        i10 = a0Var.f10139d;
                        retryAfterSeconds = aVar2.getRetryAfterSeconds();
                        fVar.L$0 = bVar;
                        fVar.L$1 = list2;
                        fVar.L$2 = aVar2;
                        fVar.L$3 = null;
                        fVar.label = 2;
                        if (bVar.delayBeforeNextExecution(i10, retryAfterSeconds, fVar) != aVar3) {
                        }
                        return aVar3;
                    default:
                        if (aVar2.getOperations() != null) {
                        }
                        i10 = a0Var.f10139d;
                        retryAfterSeconds = aVar2.getRetryAfterSeconds();
                        fVar.L$0 = bVar;
                        fVar.L$1 = list2;
                        fVar.L$2 = aVar2;
                        fVar.L$3 = null;
                        fVar.label = 2;
                        if (bVar.delayBeforeNextExecution(i10, retryAfterSeconds, fVar) != aVar3) {
                        }
                        return aVar3;
                }
            }
        }
        fVar = new f(aVar);
        Object obj3 = fVar.result;
        md.a aVar32 = md.a.f6622d;
        i3 = fVar.label;
        int i122 = 1;
        if (i3 != 0) {
        }
        aVar2 = (na.a) obj3;
        com.onesignal.debug.internal.logging.b.debug$default("OperationRepo: execute response = " + aVar2.getResult(), null, 2, null);
        if (aVar2.getIdTranslations() != null) {
        }
        wd.a0 a0Var2 = new wd.a0();
        switch (com.onesignal.core.internal.operations.impl.c.$EnumSwitchMapping$0[aVar2.getResult().ordinal()]) {
        }
    }

    @Override // na.f
    public void forceExecuteOperations() {
        int i3 = 2;
        DefaultConstructorMarker defaultConstructorMarker = null;
        long j3 = 0;
        this.retryWaiter.wake(new a(true, j3, i3, defaultConstructorMarker));
        this.waiter.wake(new a(false, j3, i3, defaultConstructorMarker));
    }

    public final List<C0019b> getNextOps$com_onesignal_core(int i3) {
        List<C0019b> list;
        Object obj;
        synchronized (this.queue) {
            try {
                Iterator<T> it = this.queue.iterator();
                while (true) {
                    list = null;
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    C0019b c0019b = (C0019b) obj;
                    if (c0019b.getOperation().getCanStartExecute() && this._newRecordState.canAccess(c0019b.getOperation().getApplyToRecordId()) && c0019b.getBucket() <= i3) {
                        break;
                    }
                }
                C0019b c0019b2 = (C0019b) obj;
                if (c0019b2 != null) {
                    this.queue.remove(c0019b2);
                    list = getGroupableOperations(c0019b2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return list;
    }

    public final List<C0019b> getQueue$com_onesignal_core() {
        return this.queue;
    }

    public final void loadSavedOperations$com_onesignal_core() {
        this._operationModelStore.loadOperations();
        Iterator it = CollectionsKt.J(this._operationModelStore.list()).iterator();
        while (it.hasNext()) {
            internalEnqueue(new C0019b((na.g) it.next(), null, this.enqueueIntoBucket, 0, 10, null), false, false, 0);
        }
        ((n) this.initialized).S(Unit.f5554a);
    }

    @Override // ra.b
    public void start() {
        this.paused = false;
        a0.s(this.coroutineScope, null, new h(null), 3);
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class a {
        private final boolean force;
        private final long previousWaitedTime;

        public /* synthetic */ a(boolean z10, long j, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(z10, (i3 & 2) != 0 ? 0L : j);
        }

        public final boolean getForce() {
            return this.force;
        }

        public final long getPreviousWaitedTime() {
            return this.previousWaitedTime;
        }

        public a(boolean z10, long j) {
            this.force = z10;
            this.previousWaitedTime = j;
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    /* renamed from: com.onesignal.core.internal.operations.impl.b$b, reason: collision with other inner class name */
    public static final class C0019b {
        private final int bucket;
        private final na.g operation;
        private int retries;
        private final com.onesignal.common.threading.d waiter;

        public C0019b(na.g gVar, com.onesignal.common.threading.d dVar, int i3, int i10) {
            gVar.getClass();
            this.operation = gVar;
            this.waiter = dVar;
            this.bucket = i3;
            this.retries = i10;
        }

        public final int getBucket() {
            return this.bucket;
        }

        public final na.g getOperation() {
            return this.operation;
        }

        public final int getRetries() {
            return this.retries;
        }

        public final com.onesignal.common.threading.d getWaiter() {
            return this.waiter;
        }

        public final void setRetries(int i3) {
            this.retries = i3;
        }

        public String toString() {
            return "bucket:" + this.bucket + ", retries:" + this.retries + ", operation:" + this.operation + '\n';
        }

        public /* synthetic */ C0019b(na.g gVar, com.onesignal.common.threading.d dVar, int i3, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(gVar, (i11 & 2) != 0 ? null : dVar, i3, (i11 & 8) != 0 ? 0 : i10);
        }
    }
}
