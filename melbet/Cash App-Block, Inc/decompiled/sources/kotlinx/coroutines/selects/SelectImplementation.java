package kotlinx.coroutines.selects;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.datadog.trace.api.ConfigCollectorAtomicFieldUpdaterHelper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancelHandler;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.Waiter;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.internal.Symbol;
import okio.Path$$ExternalSyntheticBUOutline0;
import okio.internal.DefaultSocket;
import org.bouncycastle.asn1.cmc.GetCert$$ExternalSyntheticOutline0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import papa.internal.LaunchTracker;
import sun.misc.Unsafe;

/* loaded from: classes3.dex */
public class SelectImplementation implements CancelHandler, SelectInstance, Waiter {
    public static final /* synthetic */ AtomicReferenceFieldUpdater state$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(SelectImplementation.class, Object.class, "state$volatile");
    public static final /* synthetic */ long state$volatile$FU$offset = ConfigCollectorAtomicFieldUpdaterHelper.unsafe.objectFieldOffset(SelectImplementation.class.getDeclaredField("state$volatile"));
    public final CoroutineContext context;
    public Object disposableHandleOrSegment;
    private volatile /* synthetic */ Object state$volatile = SelectKt.STATE_REG;
    public ArrayList clauses = new ArrayList(2);
    public int indexInSegment = -1;
    public Object internalResult = SelectKt.NO_RESULT;

    public final class ClauseData {
        public final SuspendLambda block;
        public final Object clauseObject;
        public Object disposableHandleOrSegment;
        public int indexInSegment = -1;
        public final Function3 onCancellationConstructor;
        public final Object param;
        public final Function3 processResFunc;
        public final Function3 regFunc;

        public ClauseData(Object obj, Function3 function3, Function3 function32, Symbol symbol, SuspendLambda suspendLambda, Function3 function33) {
            this.clauseObject = obj;
            this.regFunc = function3;
            this.processResFunc = function32;
            this.param = symbol;
            this.block = suspendLambda;
            this.onCancellationConstructor = function33;
        }

        public final void dispose() {
            Object obj = this.disposableHandleOrSegment;
            if (obj instanceof Segment) {
                ((Segment) obj).onCancellation(this.indexInSegment, SelectImplementation.this.context);
                return;
            }
            DisposableHandle disposableHandle = obj instanceof DisposableHandle ? (DisposableHandle) obj : null;
            if (disposableHandle != null) {
                disposableHandle.dispose();
            }
        }
    }

    public SelectImplementation(CoroutineContext coroutineContext) {
        this.context = coroutineContext;
    }

    public final void cleanup(ClauseData clauseData) {
        ArrayList<ClauseData> arrayList = this.clauses;
        if (arrayList == null) {
            return;
        }
        for (ClauseData clauseData2 : arrayList) {
            if (clauseData2 != clauseData) {
                clauseData2.dispose();
            }
        }
        state$volatile$FU.getClass();
        ConfigCollectorAtomicFieldUpdaterHelper.unsafe.putObjectVolatile(this, state$volatile$FU$offset, SelectKt.STATE_COMPLETED);
        this.internalResult = SelectKt.NO_RESULT;
        this.clauses = null;
    }

    public final Object complete(ContinuationImpl continuationImpl) {
        state$volatile$FU.getClass();
        Object objectVolatile = ConfigCollectorAtomicFieldUpdaterHelper.unsafe.getObjectVolatile(this, state$volatile$FU$offset);
        objectVolatile.getClass();
        ClauseData clauseData = (ClauseData) objectVolatile;
        Object obj = this.internalResult;
        cleanup(clauseData);
        Function3 function3 = clauseData.processResFunc;
        Object obj2 = clauseData.clauseObject;
        Object obj3 = clauseData.param;
        Object invoke = function3.invoke(obj2, obj3, obj);
        Continuation continuation = clauseData.block;
        return obj3 == SelectKt.PARAM_CLAUSE_0 ? ((Function1) continuation).invoke(continuationImpl) : ((Function2) continuation).invoke(invoke, continuationImpl);
    }

    public final Object doSelect(SuspendLambda suspendLambda) {
        return isSelected$1() ? complete(suspendLambda) : doSelectSuspend(suspendLambda);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003e, code lost:
    
        if (waitUntilSelected(r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0049 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object doSelectSuspend(ContinuationImpl continuationImpl) {
        SelectImplementation$doSelectSuspend$1 selectImplementation$doSelectSuspend$1;
        int i;
        if (continuationImpl instanceof SelectImplementation$doSelectSuspend$1) {
            selectImplementation$doSelectSuspend$1 = (SelectImplementation$doSelectSuspend$1) continuationImpl;
            int i2 = selectImplementation$doSelectSuspend$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                selectImplementation$doSelectSuspend$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = selectImplementation$doSelectSuspend$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = selectImplementation$doSelectSuspend$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    selectImplementation$doSelectSuspend$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return obj;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                selectImplementation$doSelectSuspend$1.label = 2;
                Object complete = complete(selectImplementation$doSelectSuspend$1);
                return complete != coroutineSingletons ? coroutineSingletons : complete;
            }
        }
        selectImplementation$doSelectSuspend$1 = new SelectImplementation$doSelectSuspend$1(this, continuationImpl);
        Object obj2 = selectImplementation$doSelectSuspend$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = selectImplementation$doSelectSuspend$1.label;
        if (i != 0) {
        }
        selectImplementation$doSelectSuspend$1.label = 2;
        Object complete2 = complete(selectImplementation$doSelectSuspend$1);
        if (complete2 != coroutineSingletons2) {
        }
    }

    public final ClauseData findClause(Object obj) {
        Object obj2;
        ArrayList arrayList = this.clauses;
        if (arrayList == null) {
            return null;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (((ClauseData) obj2).clauseObject == obj) {
                break;
            }
        }
        ClauseData clauseData = (ClauseData) obj2;
        if (clauseData != null) {
            return clauseData;
        }
        a$$ExternalSyntheticBUOutline0.m$1("Clause with object ", obj, " is not found");
        return null;
    }

    @Override // kotlinx.coroutines.CancelHandler
    public final void invoke(Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object objectVolatile;
        do {
            atomicReferenceFieldUpdater = state$volatile$FU;
            atomicReferenceFieldUpdater.getClass();
            objectVolatile = ConfigCollectorAtomicFieldUpdaterHelper.unsafe.getObjectVolatile(this, state$volatile$FU$offset);
            if (objectVolatile == SelectKt.STATE_COMPLETED) {
                return;
            }
        } while (!GetCert$$ExternalSyntheticOutline0.m(atomicReferenceFieldUpdater, this, objectVolatile));
        ArrayList arrayList = this.clauses;
        if (arrayList == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((ClauseData) it.next()).dispose();
        }
        this.internalResult = SelectKt.NO_RESULT;
        this.clauses = null;
    }

    @Override // kotlinx.coroutines.Waiter
    public final void invokeOnCancellation(Segment segment, int i) {
        this.disposableHandleOrSegment = segment;
        this.indexInSegment = i;
    }

    public final boolean isSelected$1() {
        state$volatile$FU.getClass();
        return ConfigCollectorAtomicFieldUpdaterHelper.unsafe.getObjectVolatile(this, state$volatile$FU$offset) instanceof ClauseData;
    }

    public final void register(ClauseData clauseData, boolean z) {
        Object obj = clauseData.clauseObject;
        state$volatile$FU.getClass();
        Unsafe unsafe = ConfigCollectorAtomicFieldUpdaterHelper.unsafe;
        long j = state$volatile$FU$offset;
        if (unsafe.getObjectVolatile(this, j) instanceof ClauseData) {
            return;
        }
        if (!z) {
            ArrayList arrayList = this.clauses;
            arrayList.getClass();
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((ClauseData) it.next()).clauseObject == obj) {
                        Path$$ExternalSyntheticBUOutline0.m((Object) Boxes$$ExternalSyntheticOutline1.m("Cannot use select clauses on the same object: ", obj));
                        return;
                    }
                }
            }
        }
        clauseData.regFunc.invoke(obj, this, clauseData.param);
        if (this.internalResult != SelectKt.NO_RESULT) {
            ConfigCollectorAtomicFieldUpdaterHelper.unsafe.putObjectVolatile(this, j, clauseData);
            return;
        }
        if (!z) {
            ArrayList arrayList2 = this.clauses;
            arrayList2.getClass();
            arrayList2.add(clauseData);
        }
        clauseData.disposableHandleOrSegment = this.disposableHandleOrSegment;
        clauseData.indexInSegment = this.indexInSegment;
        this.disposableHandleOrSegment = null;
        this.indexInSegment = -1;
    }

    public final boolean trySelect(Object obj, Object obj2) {
        return trySelectInternal(obj, obj2) == 0;
    }

    public final int trySelectInternal(Object obj, Object obj2) {
        SelectImplementation selectImplementation;
        String obj3;
        Unsafe unsafe;
        Unsafe unsafe2;
        while (true) {
            state$volatile$FU.getClass();
            Unsafe unsafe3 = ConfigCollectorAtomicFieldUpdaterHelper.unsafe;
            long j = state$volatile$FU$offset;
            Object objectVolatile = unsafe3.getObjectVolatile(this, j);
            if (objectVolatile instanceof CancellableContinuation) {
                ClauseData findClause = this.findClause(obj);
                if (findClause != null) {
                    Function3 function3 = findClause.onCancellationConstructor;
                    Function3 function32 = function3 != null ? (Function3) function3.invoke(this, findClause.param, obj2) : null;
                    while (true) {
                        Unsafe unsafe4 = ConfigCollectorAtomicFieldUpdaterHelper.unsafe;
                        selectImplementation = this;
                        if (unsafe4.compareAndSwapObject(selectImplementation, state$volatile$FU$offset, objectVolatile, findClause)) {
                            CancellableContinuation cancellableContinuation = (CancellableContinuation) objectVolatile;
                            selectImplementation.internalResult = obj2;
                            Symbol tryResume = cancellableContinuation.tryResume(Unit.INSTANCE, function32);
                            if (tryResume == null) {
                                selectImplementation.internalResult = SelectKt.NO_RESULT;
                                return 2;
                            }
                            cancellableContinuation.completeResume(tryResume);
                            return 0;
                        }
                        if (unsafe4.getObjectVolatile(selectImplementation, j) != objectVolatile) {
                            break;
                        }
                        this = selectImplementation;
                    }
                } else {
                    continue;
                }
            } else {
                selectImplementation = this;
                if (Intrinsics.areEqual(objectVolatile, SelectKt.STATE_COMPLETED) || (objectVolatile instanceof ClauseData)) {
                    return 3;
                }
                if (Intrinsics.areEqual(objectVolatile, SelectKt.STATE_CANCELLED)) {
                    return 2;
                }
                if (Intrinsics.areEqual(objectVolatile, SelectKt.STATE_REG)) {
                    List listOf = CollectionsKt__CollectionsJVMKt.listOf(obj);
                    do {
                        unsafe2 = ConfigCollectorAtomicFieldUpdaterHelper.unsafe;
                        if (unsafe2.compareAndSwapObject(selectImplementation, state$volatile$FU$offset, objectVolatile, listOf)) {
                            return 1;
                        }
                    } while (unsafe2.getObjectVolatile(selectImplementation, j) == objectVolatile);
                } else {
                    if (!(objectVolatile instanceof List)) {
                        obj3 = ("Unexpected state: " + objectVolatile).toString();
                        a$$ExternalSyntheticBUOutline0.m$1(obj3);
                        return 0;
                    }
                    ArrayList plus = CollectionsKt.plus((Collection) objectVolatile, obj);
                    do {
                        unsafe = ConfigCollectorAtomicFieldUpdaterHelper.unsafe;
                        if (unsafe.compareAndSwapObject(selectImplementation, state$volatile$FU$offset, objectVolatile, plus)) {
                            return 1;
                        }
                    } while (unsafe.getObjectVolatile(selectImplementation, j) == objectVolatile);
                }
            }
            this = selectImplementation;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x008c, code lost:
    
        r0 = r9.getResult();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0092, code lost:
    
        if (r0 != kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0094, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0097, code lost:
    
        return kotlin.Unit.INSTANCE;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object waitUntilSelected(SelectImplementation$doSelectSuspend$1 selectImplementation$doSelectSuspend$1) {
        CancellableContinuationImpl cancellableContinuationImpl;
        String obj;
        CancellableContinuationImpl cancellableContinuationImpl2 = new CancellableContinuationImpl(1, IntrinsicsKt__IntrinsicsJvmKt.intercepted(selectImplementation$doSelectSuspend$1));
        cancellableContinuationImpl2.initCancellability();
        loop0: while (true) {
            state$volatile$FU.getClass();
            Unsafe unsafe = ConfigCollectorAtomicFieldUpdaterHelper.unsafe;
            long j = state$volatile$FU$offset;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            CancellableContinuationImpl cancellableContinuationImpl3 = cancellableContinuationImpl2;
            Symbol symbol = SelectKt.STATE_REG;
            if (objectVolatile == symbol) {
                CancellableContinuationImpl cancellableContinuationImpl4 = cancellableContinuationImpl3;
                while (true) {
                    Unsafe unsafe2 = ConfigCollectorAtomicFieldUpdaterHelper.unsafe;
                    cancellableContinuationImpl = cancellableContinuationImpl4;
                    if (unsafe2.compareAndSwapObject(this, state$volatile$FU$offset, objectVolatile, cancellableContinuationImpl4)) {
                        cancellableContinuationImpl.invokeOnCancellationImpl(this);
                        break loop0;
                    }
                    if (unsafe2.getObjectVolatile(this, j) != objectVolatile) {
                        break;
                    }
                    cancellableContinuationImpl4 = cancellableContinuationImpl;
                }
            } else {
                cancellableContinuationImpl = cancellableContinuationImpl3;
                if (objectVolatile instanceof List) {
                    while (true) {
                        Unsafe unsafe3 = ConfigCollectorAtomicFieldUpdaterHelper.unsafe;
                        if (unsafe3.compareAndSwapObject(this, state$volatile$FU$offset, objectVolatile, symbol)) {
                            Iterator it = ((Iterable) objectVolatile).iterator();
                            while (it.hasNext()) {
                                ClauseData findClause = findClause(it.next());
                                findClause.getClass();
                                findClause.disposableHandleOrSegment = null;
                                findClause.indexInSegment = -1;
                                register(findClause, true);
                            }
                        } else if (unsafe3.getObjectVolatile(this, j) != objectVolatile) {
                            break;
                        }
                    }
                    cancellableContinuationImpl2 = cancellableContinuationImpl;
                } else {
                    if (!(objectVolatile instanceof ClauseData)) {
                        obj = ("unexpected state: " + objectVolatile).toString();
                        a$$ExternalSyntheticBUOutline0.m$1(obj);
                        return null;
                    }
                    Unit unit = Unit.INSTANCE;
                    ClauseData clauseData = (ClauseData) objectVolatile;
                    Object obj2 = this.internalResult;
                    Function3 function3 = clauseData.onCancellationConstructor;
                    cancellableContinuationImpl.resume(unit, function3 != null ? (Function3) function3.invoke(this, clauseData.param, obj2) : null);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void invoke(DefaultSocket defaultSocket, Function2 function2) {
        register(new ClauseData(defaultSocket.socket, (Function3) defaultSocket.closeBits, (Function3) defaultSocket.source, null, (SuspendLambda) function2, (Function3) defaultSocket.sink), false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void invoke(LaunchTracker launchTracker, Function1 function1) {
        register(new ClauseData((JobSupport) launchTracker.appLaunchedCallback, (Function3) launchTracker.lastAppBecameInvisibleRealtimeMillis, (SelectKt$DUMMY_PROCESS_RESULT_FUNCTION$1) launchTracker.launchInProgress, SelectKt.PARAM_CLAUSE_0, (SuspendLambda) function1, null), false);
    }
}
