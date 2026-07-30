package kotlinx.coroutines.flow;

import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.internal.g0;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.o1;

/* loaded from: classes5.dex */
final class StateFlowImpl extends kotlinx.coroutines.flow.internal.a implements j, a, kotlinx.coroutines.flow.internal.i {
    private static final AtomicReferenceFieldUpdater _state$FU = AtomicReferenceFieldUpdater.newUpdater(StateFlowImpl.class, Object.class, "_state");
    private volatile Object _state;
    private int sequence;

    public StateFlowImpl(Object obj) {
        this._state = obj;
    }

    public static /* synthetic */ void getValue$annotations() {
    }

    private final boolean updateState(Object obj, Object obj2) {
        int i8;
        kotlinx.coroutines.flow.internal.c[] slots;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _state$FU;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !kotlin.jvm.internal.s.areEqual(obj3, obj)) {
                return false;
            }
            if (kotlin.jvm.internal.s.areEqual(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i9 = this.sequence;
            if ((i9 & 1) != 0) {
                this.sequence = i9 + 2;
                return true;
            }
            int i10 = i9 + 1;
            this.sequence = i10;
            kotlinx.coroutines.flow.internal.c[] slots2 = getSlots();
            y5.w wVar = y5.w.INSTANCE;
            while (true) {
                v[] vVarArr = (v[]) slots2;
                if (vVarArr != null) {
                    for (v vVar : vVarArr) {
                        if (vVar != null) {
                            vVar.makePending();
                        }
                    }
                }
                synchronized (this) {
                    i8 = this.sequence;
                    if (i8 == i10) {
                        this.sequence = i10 + 1;
                        return true;
                    }
                    slots = getSlots();
                    y5.w wVar2 = y5.w.INSTANCE;
                }
                slots2 = slots;
                i10 = i8;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00bc, code lost:
    
        if (kotlin.jvm.internal.s.areEqual(r11, r12) == false) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b3 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:13:0x003e, B:14:0x00ab, B:16:0x00b3, B:18:0x00b8, B:20:0x00d9, B:22:0x00df, B:26:0x00be, B:29:0x00c5, B:38:0x0060, B:40:0x0073, B:41:0x009c), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b8 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:13:0x003e, B:14:0x00ab, B:16:0x00b3, B:18:0x00b8, B:20:0x00d9, B:22:0x00df, B:26:0x00be, B:29:0x00c5, B:38:0x0060, B:40:0x0073, B:41:0x009c), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00df A[Catch: all -> 0x0043, TRY_LEAVE, TryCatch #0 {all -> 0x0043, blocks: (B:13:0x003e, B:14:0x00ab, B:16:0x00b3, B:18:0x00b8, B:20:0x00d9, B:22:0x00df, B:26:0x00be, B:29:0x00c5, B:38:0x0060, B:40:0x0073, B:41:0x009c), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v2, types: [kotlinx.coroutines.flow.internal.c] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [kotlinx.coroutines.flow.internal.a] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00dd -> B:14:0x00ab). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00ef -> B:14:0x00ab). Please report as a decompilation issue!!! */
    @Override // kotlinx.coroutines.flow.j, kotlinx.coroutines.flow.t, kotlinx.coroutines.flow.n, kotlinx.coroutines.flow.e, kotlinx.coroutines.flow.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object collect(f fVar, kotlin.coroutines.c cVar) {
        StateFlowImpl$collect$1 stateFlowImpl$collect$1;
        Object coroutine_suspended;
        int i8;
        ?? r8;
        StateFlowImpl stateFlowImpl;
        v vVar;
        f fVar2;
        l1 l1Var;
        Object obj;
        StateFlowImpl stateFlowImpl2;
        v vVar2;
        boolean takePending;
        Object obj2;
        try {
            if (cVar instanceof StateFlowImpl$collect$1) {
                stateFlowImpl$collect$1 = (StateFlowImpl$collect$1) cVar;
                int i9 = stateFlowImpl$collect$1.label;
                if ((i9 & Integer.MIN_VALUE) != 0) {
                    stateFlowImpl$collect$1.label = i9 - Integer.MIN_VALUE;
                    Object obj3 = stateFlowImpl$collect$1.result;
                    coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                    i8 = stateFlowImpl$collect$1.label;
                    ?? r62 = 1;
                    if (i8 != 0) {
                        y5.g.throwOnFailure(obj3);
                        v vVar3 = (v) allocateSlot();
                        try {
                            if (fVar instanceof SubscribedFlowCollector) {
                                stateFlowImpl$collect$1.L$0 = this;
                                stateFlowImpl$collect$1.L$1 = fVar;
                                stateFlowImpl$collect$1.L$2 = vVar3;
                                stateFlowImpl$collect$1.label = 1;
                                if (((SubscribedFlowCollector) fVar).onSubscription(stateFlowImpl$collect$1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            stateFlowImpl = this;
                            vVar = vVar3;
                        } catch (Throwable th) {
                            th = th;
                            r8 = this;
                            r62 = vVar3;
                            r8.freeSlot(r62);
                            throw th;
                        }
                    } else if (i8 == 1) {
                        v vVar4 = (v) stateFlowImpl$collect$1.L$2;
                        fVar = (f) stateFlowImpl$collect$1.L$1;
                        StateFlowImpl stateFlowImpl3 = (StateFlowImpl) stateFlowImpl$collect$1.L$0;
                        y5.g.throwOnFailure(obj3);
                        vVar = vVar4;
                        stateFlowImpl = stateFlowImpl3;
                    } else if (i8 == 2) {
                        obj = stateFlowImpl$collect$1.L$4;
                        l1Var = (l1) stateFlowImpl$collect$1.L$3;
                        v vVar5 = (v) stateFlowImpl$collect$1.L$2;
                        fVar2 = (f) stateFlowImpl$collect$1.L$1;
                        StateFlowImpl stateFlowImpl4 = (StateFlowImpl) stateFlowImpl$collect$1.L$0;
                        y5.g.throwOnFailure(obj3);
                        vVar2 = vVar5;
                        stateFlowImpl2 = stateFlowImpl4;
                        takePending = vVar2.takePending();
                        r62 = vVar2;
                        r8 = stateFlowImpl2;
                        if (!takePending) {
                        }
                        Object obj4 = _state$FU.get(r8);
                        if (l1Var != null) {
                        }
                        if (obj != null) {
                        }
                        if (obj4 == kotlinx.coroutines.flow.internal.l.NULL) {
                        }
                        stateFlowImpl$collect$1.L$0 = r8;
                        stateFlowImpl$collect$1.L$1 = fVar2;
                        stateFlowImpl$collect$1.L$2 = r62;
                        stateFlowImpl$collect$1.L$3 = l1Var;
                        stateFlowImpl$collect$1.L$4 = obj4;
                        stateFlowImpl$collect$1.label = 2;
                        if (fVar2.emit(obj2, stateFlowImpl$collect$1) == coroutine_suspended) {
                        }
                    } else {
                        if (i8 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        obj = stateFlowImpl$collect$1.L$4;
                        l1Var = (l1) stateFlowImpl$collect$1.L$3;
                        v vVar6 = (v) stateFlowImpl$collect$1.L$2;
                        fVar2 = (f) stateFlowImpl$collect$1.L$1;
                        StateFlowImpl stateFlowImpl5 = (StateFlowImpl) stateFlowImpl$collect$1.L$0;
                        y5.g.throwOnFailure(obj3);
                        r62 = vVar6;
                        r8 = stateFlowImpl5;
                        Object obj42 = _state$FU.get(r8);
                        if (l1Var != null) {
                            o1.ensureActive(l1Var);
                        }
                        if (obj != null) {
                            vVar2 = r62;
                            stateFlowImpl2 = r8;
                        }
                        obj2 = obj42 == kotlinx.coroutines.flow.internal.l.NULL ? null : obj42;
                        stateFlowImpl$collect$1.L$0 = r8;
                        stateFlowImpl$collect$1.L$1 = fVar2;
                        stateFlowImpl$collect$1.L$2 = r62;
                        stateFlowImpl$collect$1.L$3 = l1Var;
                        stateFlowImpl$collect$1.L$4 = obj42;
                        stateFlowImpl$collect$1.label = 2;
                        if (fVar2.emit(obj2, stateFlowImpl$collect$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        obj = obj42;
                        vVar2 = r62;
                        stateFlowImpl2 = r8;
                        takePending = vVar2.takePending();
                        r62 = vVar2;
                        r8 = stateFlowImpl2;
                        if (!takePending) {
                            stateFlowImpl$collect$1.L$0 = stateFlowImpl2;
                            stateFlowImpl$collect$1.L$1 = fVar2;
                            stateFlowImpl$collect$1.L$2 = vVar2;
                            stateFlowImpl$collect$1.L$3 = l1Var;
                            stateFlowImpl$collect$1.L$4 = obj;
                            stateFlowImpl$collect$1.label = 3;
                            Object awaitPending = vVar2.awaitPending(stateFlowImpl$collect$1);
                            r62 = vVar2;
                            r8 = stateFlowImpl2;
                            if (awaitPending == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        Object obj422 = _state$FU.get(r8);
                        if (l1Var != null) {
                        }
                        if (obj != null) {
                        }
                        if (obj422 == kotlinx.coroutines.flow.internal.l.NULL) {
                        }
                        stateFlowImpl$collect$1.L$0 = r8;
                        stateFlowImpl$collect$1.L$1 = fVar2;
                        stateFlowImpl$collect$1.L$2 = r62;
                        stateFlowImpl$collect$1.L$3 = l1Var;
                        stateFlowImpl$collect$1.L$4 = obj422;
                        stateFlowImpl$collect$1.label = 2;
                        if (fVar2.emit(obj2, stateFlowImpl$collect$1) == coroutine_suspended) {
                        }
                    }
                    fVar2 = fVar;
                    l1Var = (l1) stateFlowImpl$collect$1.getContext().get(l1.Key);
                    obj = null;
                    r62 = vVar;
                    r8 = stateFlowImpl;
                    Object obj4222 = _state$FU.get(r8);
                    if (l1Var != null) {
                    }
                    if (obj != null) {
                    }
                    if (obj4222 == kotlinx.coroutines.flow.internal.l.NULL) {
                    }
                    stateFlowImpl$collect$1.L$0 = r8;
                    stateFlowImpl$collect$1.L$1 = fVar2;
                    stateFlowImpl$collect$1.L$2 = r62;
                    stateFlowImpl$collect$1.L$3 = l1Var;
                    stateFlowImpl$collect$1.L$4 = obj4222;
                    stateFlowImpl$collect$1.label = 2;
                    if (fVar2.emit(obj2, stateFlowImpl$collect$1) == coroutine_suspended) {
                    }
                }
            }
            if (i8 != 0) {
            }
            fVar2 = fVar;
            l1Var = (l1) stateFlowImpl$collect$1.getContext().get(l1.Key);
            obj = null;
            r62 = vVar;
            r8 = stateFlowImpl;
            Object obj42222 = _state$FU.get(r8);
            if (l1Var != null) {
            }
            if (obj != null) {
            }
            if (obj42222 == kotlinx.coroutines.flow.internal.l.NULL) {
            }
            stateFlowImpl$collect$1.L$0 = r8;
            stateFlowImpl$collect$1.L$1 = fVar2;
            stateFlowImpl$collect$1.L$2 = r62;
            stateFlowImpl$collect$1.L$3 = l1Var;
            stateFlowImpl$collect$1.L$4 = obj42222;
            stateFlowImpl$collect$1.label = 2;
            if (fVar2.emit(obj2, stateFlowImpl$collect$1) == coroutine_suspended) {
            }
        } catch (Throwable th2) {
            th = th2;
        }
        stateFlowImpl$collect$1 = new StateFlowImpl$collect$1(this, cVar);
        Object obj32 = stateFlowImpl$collect$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        i8 = stateFlowImpl$collect$1.label;
        ?? r622 = 1;
    }

    @Override // kotlinx.coroutines.flow.j
    public boolean compareAndSet(Object obj, Object obj2) {
        if (obj == null) {
            obj = kotlinx.coroutines.flow.internal.l.NULL;
        }
        if (obj2 == null) {
            obj2 = kotlinx.coroutines.flow.internal.l.NULL;
        }
        return updateState(obj, obj2);
    }

    @Override // kotlinx.coroutines.flow.j, kotlinx.coroutines.flow.i, kotlinx.coroutines.flow.f
    public Object emit(Object obj, kotlin.coroutines.c cVar) {
        setValue(obj);
        return y5.w.INSTANCE;
    }

    @Override // kotlinx.coroutines.flow.internal.i
    public e fuse(CoroutineContext coroutineContext, int i8, BufferOverflow bufferOverflow) {
        return u.fuseStateFlow(this, coroutineContext, i8, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.j, kotlinx.coroutines.flow.t, kotlinx.coroutines.flow.n
    public List<Object> getReplayCache() {
        return kotlin.collections.q.listOf(getValue());
    }

    @Override // kotlinx.coroutines.flow.j, kotlinx.coroutines.flow.t
    public Object getValue() {
        g0 g0Var = kotlinx.coroutines.flow.internal.l.NULL;
        Object obj = _state$FU.get(this);
        if (obj == g0Var) {
            return null;
        }
        return obj;
    }

    @Override // kotlinx.coroutines.flow.j, kotlinx.coroutines.flow.i
    public void resetReplayCache() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @Override // kotlinx.coroutines.flow.j
    public void setValue(Object obj) {
        if (obj == null) {
            obj = kotlinx.coroutines.flow.internal.l.NULL;
        }
        updateState(null, obj);
    }

    @Override // kotlinx.coroutines.flow.j, kotlinx.coroutines.flow.i
    public boolean tryEmit(Object obj) {
        setValue(obj);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.flow.internal.a
    public v createSlot() {
        return new v();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.flow.internal.a
    public v[] createSlotArray(int i8) {
        return new v[i8];
    }
}
