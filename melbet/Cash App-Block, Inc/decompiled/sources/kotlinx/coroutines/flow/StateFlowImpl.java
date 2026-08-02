package kotlinx.coroutines.flow;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.datadog.trace.api.ConfigCollectorAtomicFieldUpdaterHelper;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.AbstractSharedFlow;
import kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot;
import kotlinx.coroutines.flow.internal.CombineKt;
import kotlinx.coroutines.flow.internal.FusibleFlow;
import kotlinx.coroutines.internal.Symbol;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class StateFlowImpl extends AbstractSharedFlow implements MutableStateFlow, Flow, FusibleFlow {
    public static final /* synthetic */ AtomicReferenceFieldUpdater _state$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(StateFlowImpl.class, Object.class, "_state$volatile");
    public static final /* synthetic */ long _state$volatile$FU$offset = ConfigCollectorAtomicFieldUpdaterHelper.unsafe.objectFieldOffset(StateFlowImpl.class.getDeclaredField("_state$volatile"));
    private volatile /* synthetic */ Object _state$volatile;
    public int sequence;

    public StateFlowImpl(Object obj) {
        this._state$volatile = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x009c, code lost:
    
        if (r13.equals(r14) != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0102, code lost:
    
        if (r14 == r1) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0082, code lost:
    
        if (kotlin.Unit.INSTANCE == r1) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008a A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:13:0x0032, B:14:0x0082, B:16:0x008a, B:19:0x0091, B:20:0x0095, B:24:0x0098, B:26:0x00b9, B:29:0x00c9, B:30:0x00e3, B:36:0x00f7, B:41:0x0100, B:32:0x00ea, B:35:0x00f0, B:46:0x009e, B:49:0x00a5, B:57:0x0047, B:59:0x0050, B:60:0x0073, B:62:0x005e, B:64:0x0062), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c9 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:13:0x0032, B:14:0x0082, B:16:0x008a, B:19:0x0091, B:20:0x0095, B:24:0x0098, B:26:0x00b9, B:29:0x00c9, B:30:0x00e3, B:36:0x00f7, B:41:0x0100, B:32:0x00ea, B:35:0x00f0, B:46:0x009e, B:49:0x00a5, B:57:0x0047, B:59:0x0050, B:60:0x0073, B:62:0x005e, B:64:0x0062), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00c8 -> B:14:0x0082). Please report as a decompilation issue!!! */
    @Override // kotlinx.coroutines.flow.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        StateFlowImpl$collect$1 stateFlowImpl$collect$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        StateFlowSlot stateFlowSlot;
        FlowCollector flowCollector2;
        Job job;
        Object obj;
        Object andSet;
        Object obj2;
        try {
            if (continuation instanceof StateFlowImpl$collect$1) {
                stateFlowImpl$collect$1 = (StateFlowImpl$collect$1) continuation;
                int i2 = stateFlowImpl$collect$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    stateFlowImpl$collect$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj3 = stateFlowImpl$collect$1.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = stateFlowImpl$collect$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj3);
                        stateFlowSlot = (StateFlowSlot) allocateSlot();
                        if (flowCollector instanceof SubscribedFlowCollector) {
                            stateFlowImpl$collect$1.L$0 = flowCollector;
                            stateFlowImpl$collect$1.L$1 = stateFlowSlot;
                            stateFlowImpl$collect$1.label = 1;
                            if (((SubscribedFlowCollector) flowCollector).onSubscription(stateFlowImpl$collect$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    } else if (i == 1) {
                        stateFlowSlot = stateFlowImpl$collect$1.L$1;
                        flowCollector = stateFlowImpl$collect$1.L$0;
                        SafeTrace.throwOnFailure(obj3);
                    } else if (i == 2) {
                        obj = stateFlowImpl$collect$1.L$4;
                        job = stateFlowImpl$collect$1.L$2;
                        stateFlowSlot = stateFlowImpl$collect$1.L$1;
                        flowCollector2 = stateFlowImpl$collect$1.L$0;
                        SafeTrace.throwOnFailure(obj3);
                        AtomicReference atomicReference = stateFlowSlot._state;
                        Symbol symbol = FlowKt.NONE;
                        andSet = atomicReference.getAndSet(symbol);
                        andSet.getClass();
                        if (andSet == FlowKt.PENDING) {
                        }
                        Object obj4 = _state$volatile$FU.get(this);
                        if (job != null) {
                        }
                        if (obj4 == CombineKt.NULL) {
                        }
                        stateFlowImpl$collect$1.L$0 = flowCollector2;
                        stateFlowImpl$collect$1.L$1 = stateFlowSlot;
                        stateFlowImpl$collect$1.L$2 = job;
                        stateFlowImpl$collect$1.L$3 = null;
                        stateFlowImpl$collect$1.L$4 = obj4;
                        stateFlowImpl$collect$1.label = 2;
                        if (flowCollector2.emit(obj2, stateFlowImpl$collect$1) == coroutineSingletons) {
                        }
                    } else {
                        if (i != 3) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        obj = stateFlowImpl$collect$1.L$3;
                        job = stateFlowImpl$collect$1.L$2;
                        stateFlowSlot = stateFlowImpl$collect$1.L$1;
                        flowCollector2 = stateFlowImpl$collect$1.L$0;
                        SafeTrace.throwOnFailure(obj3);
                        Object obj42 = _state$volatile$FU.get(this);
                        if (job != null && !job.isActive()) {
                            throw job.getCancellationException();
                        }
                        obj2 = obj42 == CombineKt.NULL ? null : obj42;
                        stateFlowImpl$collect$1.L$0 = flowCollector2;
                        stateFlowImpl$collect$1.L$1 = stateFlowSlot;
                        stateFlowImpl$collect$1.L$2 = job;
                        stateFlowImpl$collect$1.L$3 = null;
                        stateFlowImpl$collect$1.L$4 = obj42;
                        stateFlowImpl$collect$1.label = 2;
                        if (flowCollector2.emit(obj2, stateFlowImpl$collect$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        obj = obj42;
                        AtomicReference atomicReference2 = stateFlowSlot._state;
                        Symbol symbol2 = FlowKt.NONE;
                        andSet = atomicReference2.getAndSet(symbol2);
                        andSet.getClass();
                        if (andSet == FlowKt.PENDING) {
                            stateFlowImpl$collect$1.L$0 = flowCollector2;
                            stateFlowImpl$collect$1.L$1 = stateFlowSlot;
                            stateFlowImpl$collect$1.L$2 = job;
                            stateFlowImpl$collect$1.L$3 = obj;
                            stateFlowImpl$collect$1.L$4 = null;
                            stateFlowImpl$collect$1.label = 3;
                            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt__IntrinsicsJvmKt.intercepted(stateFlowImpl$collect$1));
                            cancellableContinuationImpl.initCancellability();
                            AtomicReference atomicReference3 = stateFlowSlot._state;
                            while (true) {
                                if (atomicReference3.compareAndSet(symbol2, cancellableContinuationImpl)) {
                                    break;
                                }
                                if (atomicReference3.get() != symbol2) {
                                    Result.Companion companion = Result.Companion;
                                    cancellableContinuationImpl.resumeWith(Unit.INSTANCE);
                                    break;
                                }
                            }
                            Object result = cancellableContinuationImpl.getResult();
                            if (result != CoroutineSingletons.COROUTINE_SUSPENDED) {
                            }
                        }
                        Object obj422 = _state$volatile$FU.get(this);
                        if (job != null) {
                            throw job.getCancellationException();
                        }
                        if (obj422 == CombineKt.NULL) {
                        }
                        stateFlowImpl$collect$1.L$0 = flowCollector2;
                        stateFlowImpl$collect$1.L$1 = stateFlowSlot;
                        stateFlowImpl$collect$1.L$2 = job;
                        stateFlowImpl$collect$1.L$3 = null;
                        stateFlowImpl$collect$1.L$4 = obj422;
                        stateFlowImpl$collect$1.label = 2;
                        if (flowCollector2.emit(obj2, stateFlowImpl$collect$1) == coroutineSingletons) {
                        }
                    }
                    flowCollector2 = flowCollector;
                    job = (Job) stateFlowImpl$collect$1.getContext().get(Job.Key.$$INSTANCE);
                    obj = null;
                    Object obj4222 = _state$volatile$FU.get(this);
                    if (job != null) {
                    }
                    if (obj4222 == CombineKt.NULL) {
                    }
                    stateFlowImpl$collect$1.L$0 = flowCollector2;
                    stateFlowImpl$collect$1.L$1 = stateFlowSlot;
                    stateFlowImpl$collect$1.L$2 = job;
                    stateFlowImpl$collect$1.L$3 = null;
                    stateFlowImpl$collect$1.L$4 = obj4222;
                    stateFlowImpl$collect$1.label = 2;
                    if (flowCollector2.emit(obj2, stateFlowImpl$collect$1) == coroutineSingletons) {
                    }
                }
            }
            if (i != 0) {
            }
            flowCollector2 = flowCollector;
            job = (Job) stateFlowImpl$collect$1.getContext().get(Job.Key.$$INSTANCE);
            obj = null;
            Object obj42222 = _state$volatile$FU.get(this);
            if (job != null) {
            }
            if (obj42222 == CombineKt.NULL) {
            }
            stateFlowImpl$collect$1.L$0 = flowCollector2;
            stateFlowImpl$collect$1.L$1 = stateFlowSlot;
            stateFlowImpl$collect$1.L$2 = job;
            stateFlowImpl$collect$1.L$3 = null;
            stateFlowImpl$collect$1.L$4 = obj42222;
            stateFlowImpl$collect$1.label = 2;
            if (flowCollector2.emit(obj2, stateFlowImpl$collect$1) == coroutineSingletons) {
            }
        } catch (Throwable th) {
            freeSlot(stateFlowSlot);
            throw th;
        }
        stateFlowImpl$collect$1 = new StateFlowImpl$collect$1(this, continuation);
        Object obj32 = stateFlowImpl$collect$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = stateFlowImpl$collect$1.label;
    }

    public final boolean compareAndSet(Object obj, Object obj2) {
        Symbol symbol = CombineKt.NULL;
        if (obj == null) {
            obj = symbol;
        }
        if (obj2 == null) {
            obj2 = symbol;
        }
        return updateState(obj, obj2);
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    public final AbstractSharedFlowSlot createSlot() {
        return new StateFlowSlot();
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    public final AbstractSharedFlowSlot[] createSlotArray() {
        return new StateFlowSlot[2];
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow, kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        setValue(obj);
        return Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.flow.internal.FusibleFlow
    public final Flow fuse(CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow) {
        return (((i < 0 || i >= 2) && i != -2) || bufferOverflow != BufferOverflow.DROP_OLDEST) ? FlowKt.fuseSharedFlow(this, coroutineContext, i, bufferOverflow) : this;
    }

    @Override // kotlinx.coroutines.flow.SharedFlow
    public final List getReplayCache() {
        return CollectionsKt__CollectionsJVMKt.listOf(getValue());
    }

    @Override // kotlinx.coroutines.flow.StateFlow
    public final Object getValue() {
        Symbol symbol = CombineKt.NULL;
        _state$volatile$FU.getClass();
        Object objectVolatile = ConfigCollectorAtomicFieldUpdaterHelper.unsafe.getObjectVolatile(this, _state$volatile$FU$offset);
        if (objectVolatile == symbol) {
            return null;
        }
        return objectVolatile;
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow
    public final void resetReplayCache() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    public final void setValue(Object obj) {
        if (obj == null) {
            obj = CombineKt.NULL;
        }
        updateState(null, obj);
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow
    public final boolean tryEmit(Object obj) {
        setValue(obj);
        return true;
    }

    public final boolean updateState(Object obj, Object obj2) {
        int i;
        AbstractSharedFlowSlot[] abstractSharedFlowSlotArr;
        Symbol symbol;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _state$volatile$FU;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !Intrinsics.areEqual(obj3, obj)) {
                return false;
            }
            if (Intrinsics.areEqual(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i2 = this.sequence;
            if ((i2 & 1) != 0) {
                this.sequence = i2 + 2;
                return true;
            }
            int i3 = i2 + 1;
            this.sequence = i3;
            AbstractSharedFlowSlot[] abstractSharedFlowSlotArr2 = this.slots;
            while (true) {
                StateFlowSlot[] stateFlowSlotArr = (StateFlowSlot[]) abstractSharedFlowSlotArr2;
                if (stateFlowSlotArr != null) {
                    for (StateFlowSlot stateFlowSlot : stateFlowSlotArr) {
                        if (stateFlowSlot != null) {
                            AtomicReference atomicReference = stateFlowSlot._state;
                            while (true) {
                                Object obj4 = atomicReference.get();
                                if (obj4 != null && obj4 != (symbol = FlowKt.PENDING)) {
                                    Symbol symbol2 = FlowKt.NONE;
                                    if (obj4 != symbol2) {
                                        while (!atomicReference.compareAndSet(obj4, symbol2)) {
                                            if (atomicReference.get() != obj4) {
                                                break;
                                            }
                                        }
                                        Unit unit = Unit.INSTANCE;
                                        Result.Companion companion = Result.Companion;
                                        ((CancellableContinuationImpl) obj4).resumeWith(unit);
                                        break;
                                    }
                                    while (!atomicReference.compareAndSet(obj4, symbol)) {
                                        if (atomicReference.get() != obj4) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i = this.sequence;
                    if (i == i3) {
                        this.sequence = i3 + 1;
                        return true;
                    }
                    abstractSharedFlowSlotArr = this.slots;
                }
                abstractSharedFlowSlotArr2 = abstractSharedFlowSlotArr;
                i3 = i;
            }
        }
    }
}
