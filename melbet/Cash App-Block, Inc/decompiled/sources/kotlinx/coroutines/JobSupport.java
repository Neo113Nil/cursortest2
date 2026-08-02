package kotlinx.coroutines;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.datadog.trace.api.ConfigCollectorAtomicFieldUpdaterHelper;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.ExceptionsKt__ExceptionsKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.sequences.Sequence;
import kotlin.text.StringsKt__StringsKt$lineSequence$$inlined$Sequence$1;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.internal.ListClosed;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.selects.SelectImplementation;
import kotlinx.coroutines.selects.SelectInstance;
import okio.Path$$ExternalSyntheticBUOutline0;
import okio.internal.DefaultSocket;
import papa.internal.LaunchTracker;
import radiography.Radiography$renderScannableViewTree$1$2;
import sun.misc.Unsafe;

/* loaded from: classes3.dex */
public class JobSupport implements Job, ParentJob {
    public static final /* synthetic */ AtomicReferenceFieldUpdater _parentHandle$volatile$FU;
    public static final /* synthetic */ long _parentHandle$volatile$FU$offset;
    public static final /* synthetic */ AtomicReferenceFieldUpdater _state$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(JobSupport.class, Object.class, "_state$volatile");
    public static final /* synthetic */ long _state$volatile$FU$offset;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    public final class AwaitContinuation extends CancellableContinuationImpl {
        public final JobSupport job;

        public AwaitContinuation(Continuation continuation, JobSupport jobSupport) {
            super(1, continuation);
            this.job = jobSupport;
        }

        @Override // kotlinx.coroutines.CancellableContinuationImpl
        public final Throwable getContinuationCancellationCause(JobSupport jobSupport) {
            Throwable rootCause;
            Object state$kotlinx_coroutines_core = this.job.getState$kotlinx_coroutines_core();
            return (!(state$kotlinx_coroutines_core instanceof Finishing) || (rootCause = ((Finishing) state$kotlinx_coroutines_core).getRootCause()) == null) ? state$kotlinx_coroutines_core instanceof CompletedExceptionally ? ((CompletedExceptionally) state$kotlinx_coroutines_core).cause : jobSupport.getCancellationException() : rootCause;
        }

        @Override // kotlinx.coroutines.CancellableContinuationImpl
        public final String nameString() {
            return "AwaitContinuation";
        }
    }

    public final class ChildCompletion extends JobNode {
        public final ChildHandleNode child;
        public final JobSupport parent;
        public final Object proposedUpdate;
        public final Finishing state;

        public ChildCompletion(JobSupport jobSupport, Finishing finishing, ChildHandleNode childHandleNode, Object obj) {
            this.parent = jobSupport;
            this.state = finishing;
            this.child = childHandleNode;
            this.proposedUpdate = obj;
        }

        @Override // kotlinx.coroutines.JobNode
        public final boolean getOnCancelling() {
            return false;
        }

        @Override // kotlinx.coroutines.JobNode
        public final void invoke(Throwable th) {
            ChildHandleNode childHandleNode = this.child;
            ChildHandleNode nextChild = JobSupport.nextChild(childHandleNode);
            JobSupport jobSupport = this.parent;
            Finishing finishing = this.state;
            Object obj = this.proposedUpdate;
            if (nextChild == null || !jobSupport.tryWaitForChild(finishing, nextChild, obj)) {
                finishing.list.addLast(new ListClosed(2), 2);
                ChildHandleNode nextChild2 = JobSupport.nextChild(childHandleNode);
                if (nextChild2 == null || !jobSupport.tryWaitForChild(finishing, nextChild2, obj)) {
                    jobSupport.afterCompletion(jobSupport.finalizeFinishingState(finishing, obj));
                }
            }
        }
    }

    public final class Finishing implements Incomplete {
        public static final /* synthetic */ AtomicReferenceFieldUpdater _exceptionsHolder$volatile$FU;
        public static final /* synthetic */ long _exceptionsHolder$volatile$FU$offset;
        public static final /* synthetic */ AtomicIntegerFieldUpdater _isCompleting$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(Finishing.class, "_isCompleting$volatile");
        public static final /* synthetic */ AtomicReferenceFieldUpdater _rootCause$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(Finishing.class, Object.class, "_rootCause$volatile");
        public static final /* synthetic */ long _rootCause$volatile$FU$offset;
        private volatile /* synthetic */ Object _exceptionsHolder$volatile;
        private volatile /* synthetic */ int _isCompleting$volatile = 0;
        private volatile /* synthetic */ Object _rootCause$volatile;
        public final NodeList list;

        static {
            Unsafe unsafe = ConfigCollectorAtomicFieldUpdaterHelper.unsafe;
            _rootCause$volatile$FU$offset = unsafe.objectFieldOffset(Finishing.class.getDeclaredField("_rootCause$volatile"));
            _exceptionsHolder$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(Finishing.class, Object.class, "_exceptionsHolder$volatile");
            _exceptionsHolder$volatile$FU$offset = unsafe.objectFieldOffset(Finishing.class.getDeclaredField("_exceptionsHolder$volatile"));
        }

        public Finishing(NodeList nodeList, Throwable th) {
            this.list = nodeList;
            this._rootCause$volatile = th;
        }

        public final void addExceptionLocked(Throwable th) {
            String obj;
            Throwable rootCause = getRootCause();
            if (rootCause == null) {
                setRootCause(th);
                return;
            }
            if (th == rootCause) {
                return;
            }
            Object exceptionsHolder = getExceptionsHolder();
            if (exceptionsHolder == null) {
                setExceptionsHolder(th);
                return;
            }
            if (!(exceptionsHolder instanceof Throwable)) {
                if (exceptionsHolder instanceof ArrayList) {
                    ((ArrayList) exceptionsHolder).add(th);
                    return;
                } else {
                    obj = ("State is " + exceptionsHolder).toString();
                    a$$ExternalSyntheticBUOutline0.m$1(obj);
                    return;
                }
            }
            if (th == exceptionsHolder) {
                return;
            }
            ArrayList arrayList = new ArrayList(4);
            arrayList.add(exceptionsHolder);
            arrayList.add(th);
            setExceptionsHolder(arrayList);
        }

        public final Object getExceptionsHolder() {
            _exceptionsHolder$volatile$FU.getClass();
            return ConfigCollectorAtomicFieldUpdaterHelper.unsafe.getObjectVolatile(this, _exceptionsHolder$volatile$FU$offset);
        }

        @Override // kotlinx.coroutines.Incomplete
        public final NodeList getList() {
            return this.list;
        }

        public final Throwable getRootCause() {
            _rootCause$volatile$FU.getClass();
            return (Throwable) ConfigCollectorAtomicFieldUpdaterHelper.unsafe.getObjectVolatile(this, _rootCause$volatile$FU$offset);
        }

        @Override // kotlinx.coroutines.Incomplete
        public final boolean isActive() {
            return getRootCause() == null;
        }

        public final boolean isCancelling() {
            return getRootCause() != null;
        }

        public final ArrayList sealLocked(Throwable th) {
            String obj;
            ArrayList arrayList;
            Object exceptionsHolder = getExceptionsHolder();
            if (exceptionsHolder == null) {
                arrayList = new ArrayList(4);
            } else if (exceptionsHolder instanceof Throwable) {
                ArrayList arrayList2 = new ArrayList(4);
                arrayList2.add(exceptionsHolder);
                arrayList = arrayList2;
            } else {
                if (!(exceptionsHolder instanceof ArrayList)) {
                    obj = ("State is " + exceptionsHolder).toString();
                    a$$ExternalSyntheticBUOutline0.m$1(obj);
                    return null;
                }
                arrayList = (ArrayList) exceptionsHolder;
            }
            Throwable rootCause = getRootCause();
            if (rootCause != null) {
                arrayList.add(0, rootCause);
            }
            if (th != null && !th.equals(rootCause)) {
                arrayList.add(th);
            }
            setExceptionsHolder(JobKt.SEALED);
            return arrayList;
        }

        public final void setExceptionsHolder(Object obj) {
            _exceptionsHolder$volatile$FU.getClass();
            ConfigCollectorAtomicFieldUpdaterHelper.unsafe.putObjectVolatile(this, _exceptionsHolder$volatile$FU$offset, obj);
        }

        public final void setRootCause(Throwable th) {
            _rootCause$volatile$FU.getClass();
            ConfigCollectorAtomicFieldUpdaterHelper.unsafe.putObjectVolatile(this, _rootCause$volatile$FU$offset, th);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Finishing[cancelling=");
            sb.append(isCancelling());
            sb.append(", completing=");
            sb.append(_isCompleting$volatile$FU.get(this) == 1);
            sb.append(", rootCause=");
            sb.append(getRootCause());
            sb.append(", exceptions=");
            sb.append(getExceptionsHolder());
            sb.append(", list=");
            sb.append(this.list);
            sb.append(']');
            return sb.toString();
        }
    }

    /* loaded from: classes9.dex */
    public final class SelectOnAwaitCompletionHandler extends JobNode {
        public final SelectInstance select;

        public SelectOnAwaitCompletionHandler(SelectInstance selectInstance) {
            this.select = selectInstance;
        }

        @Override // kotlinx.coroutines.JobNode
        public final boolean getOnCancelling() {
            return false;
        }

        @Override // kotlinx.coroutines.JobNode
        public final void invoke(Throwable th) {
            JobSupport jobSupport = JobSupport.this;
            Object state$kotlinx_coroutines_core = jobSupport.getState$kotlinx_coroutines_core();
            if (!(state$kotlinx_coroutines_core instanceof CompletedExceptionally)) {
                state$kotlinx_coroutines_core = JobKt.unboxState(state$kotlinx_coroutines_core);
            }
            ((SelectImplementation) this.select).trySelect(jobSupport, state$kotlinx_coroutines_core);
        }
    }

    /* loaded from: classes9.dex */
    public final class SelectOnJoinCompletionHandler extends JobNode {
        public final SelectInstance select;

        public SelectOnJoinCompletionHandler(SelectInstance selectInstance) {
            this.select = selectInstance;
        }

        @Override // kotlinx.coroutines.JobNode
        public final boolean getOnCancelling() {
            return false;
        }

        @Override // kotlinx.coroutines.JobNode
        public final void invoke(Throwable th) {
            ((SelectImplementation) this.select).trySelect(JobSupport.this, Unit.INSTANCE);
        }
    }

    static {
        Unsafe unsafe = ConfigCollectorAtomicFieldUpdaterHelper.unsafe;
        _state$volatile$FU$offset = unsafe.objectFieldOffset(JobSupport.class.getDeclaredField("_state$volatile"));
        _parentHandle$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(JobSupport.class, Object.class, "_parentHandle$volatile");
        _parentHandle$volatile$FU$offset = unsafe.objectFieldOffset(JobSupport.class.getDeclaredField("_parentHandle$volatile"));
    }

    public JobSupport(boolean z) {
        this._state$volatile = z ? JobKt.EMPTY_ACTIVE : JobKt.EMPTY_NEW;
    }

    public static ChildHandleNode nextChild(LockFreeLinkedListNode lockFreeLinkedListNode) {
        while (lockFreeLinkedListNode.isRemoved()) {
            lockFreeLinkedListNode = lockFreeLinkedListNode.getPrevNode();
        }
        while (true) {
            lockFreeLinkedListNode = lockFreeLinkedListNode.getNextNode();
            if (!lockFreeLinkedListNode.isRemoved()) {
                if (lockFreeLinkedListNode instanceof ChildHandleNode) {
                    return (ChildHandleNode) lockFreeLinkedListNode;
                }
                if (lockFreeLinkedListNode instanceof NodeList) {
                    return null;
                }
            }
        }
    }

    public static String stateString(Object obj) {
        if (!(obj instanceof Finishing)) {
            return obj instanceof Incomplete ? ((Incomplete) obj).isActive() ? "Active" : "New" : obj instanceof CompletedExceptionally ? "Cancelled" : "Completed";
        }
        Finishing finishing = (Finishing) obj;
        return finishing.isCancelling() ? "Cancelling" : Finishing._isCompleting$volatile$FU.get(finishing) == 1 ? "Completing" : "Active";
    }

    public void afterCompletion(Object obj) {
    }

    public void afterResume(Object obj) {
        afterCompletion(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0089, code lost:
    
        return r5;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [kotlinx.coroutines.InactiveNodeList] */
    @Override // kotlinx.coroutines.Job
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ChildHandle attachChild(JobSupport jobSupport) {
        JobSupport jobSupport2;
        ChildHandleNode childHandleNode = new ChildHandleNode(jobSupport);
        childHandleNode.job = this;
        loop0: while (true) {
            Object state$kotlinx_coroutines_core = this.getState$kotlinx_coroutines_core();
            if (state$kotlinx_coroutines_core instanceof Empty) {
                Empty empty = (Empty) state$kotlinx_coroutines_core;
                boolean z = empty.isActive;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _state$volatile$FU;
                if (z) {
                    while (true) {
                        atomicReferenceFieldUpdater.getClass();
                        Unsafe unsafe = ConfigCollectorAtomicFieldUpdaterHelper.unsafe;
                        long j = _state$volatile$FU$offset;
                        jobSupport2 = this;
                        if (unsafe.compareAndSwapObject(jobSupport2, j, state$kotlinx_coroutines_core, childHandleNode)) {
                            break loop0;
                        }
                        if (unsafe.getObjectVolatile(jobSupport2, j) != state$kotlinx_coroutines_core) {
                            break;
                        }
                        this = jobSupport2;
                    }
                } else {
                    jobSupport2 = this;
                    NodeList nodeList = new NodeList();
                    if (!z) {
                        nodeList = new InactiveNodeList(nodeList);
                    }
                    SizeMode$EnumUnboxingLocalUtility.m(atomicReferenceFieldUpdater, jobSupport2, empty, nodeList);
                }
                this = jobSupport2;
            } else {
                jobSupport2 = this;
                boolean z2 = state$kotlinx_coroutines_core instanceof Incomplete;
                NonDisposableHandle nonDisposableHandle = NonDisposableHandle.INSTANCE;
                if (!z2) {
                    Object state$kotlinx_coroutines_core2 = jobSupport2.getState$kotlinx_coroutines_core();
                    CompletedExceptionally completedExceptionally = state$kotlinx_coroutines_core2 instanceof CompletedExceptionally ? (CompletedExceptionally) state$kotlinx_coroutines_core2 : null;
                    childHandleNode.invoke(completedExceptionally != null ? completedExceptionally.cause : null);
                    return nonDisposableHandle;
                }
                NodeList list = ((Incomplete) state$kotlinx_coroutines_core).getList();
                if (list == null) {
                    jobSupport2.promoteSingleToNodeList((JobNode) state$kotlinx_coroutines_core);
                    this = jobSupport2;
                } else if (!list.addLast(childHandleNode, 7)) {
                    boolean addLast = list.addLast(childHandleNode, 3);
                    Object state$kotlinx_coroutines_core3 = jobSupport2.getState$kotlinx_coroutines_core();
                    if (state$kotlinx_coroutines_core3 instanceof Finishing) {
                        r0 = ((Finishing) state$kotlinx_coroutines_core3).getRootCause();
                    } else {
                        CompletedExceptionally completedExceptionally2 = state$kotlinx_coroutines_core3 instanceof CompletedExceptionally ? (CompletedExceptionally) state$kotlinx_coroutines_core3 : null;
                        if (completedExceptionally2 != null) {
                            r0 = completedExceptionally2.cause;
                        }
                    }
                    childHandleNode.invoke(r0);
                    if (addLast) {
                        break loop0;
                    }
                    return nonDisposableHandle;
                }
            }
        }
    }

    public final Object awaitInternal(Continuation continuation) {
        Object state$kotlinx_coroutines_core;
        do {
            state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
            if (!(state$kotlinx_coroutines_core instanceof Incomplete)) {
                if (state$kotlinx_coroutines_core instanceof CompletedExceptionally) {
                    throw ((CompletedExceptionally) state$kotlinx_coroutines_core).cause;
                }
                return JobKt.unboxState(state$kotlinx_coroutines_core);
            }
        } while (startInternal(state$kotlinx_coroutines_core) < 0);
        AwaitContinuation awaitContinuation = new AwaitContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), this);
        awaitContinuation.initCancellability();
        awaitContinuation.invokeOnCancellationImpl(new DisposeOnCancel(JobKt.invokeOnCompletion$default(this, new ResumeAwaitOnCompletion(awaitContinuation)), 0));
        Object result = awaitContinuation.getResult();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return result;
    }

    @Override // kotlinx.coroutines.Job
    public void cancel(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(cancellationExceptionMessage(), null, this);
        }
        cancelInternal(cancellationException);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
    
        if (r0 == kotlinx.coroutines.JobKt.COMPLETING_WAITING_CHILDREN) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0059, code lost:
    
        r0 = r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean cancelImpl$kotlinx_coroutines_core(Object obj) {
        Symbol symbol;
        String obj2;
        Object obj3 = JobKt.COMPLETING_ALREADY;
        if (getOnCancelComplete$kotlinx_coroutines_core()) {
            do {
                Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
                if (state$kotlinx_coroutines_core instanceof Incomplete) {
                    if (state$kotlinx_coroutines_core instanceof Finishing) {
                        if (Finishing._isCompleting$volatile$FU.get((Finishing) state$kotlinx_coroutines_core) == 1) {
                        }
                    }
                    obj3 = tryMakeCompleting(state$kotlinx_coroutines_core, new CompletedExceptionally(createCauseException(obj), false));
                }
                obj3 = JobKt.COMPLETING_ALREADY;
                break;
            } while (obj3 == JobKt.COMPLETING_RETRY);
        }
        if (obj3 == JobKt.COMPLETING_ALREADY) {
            Throwable th = null;
            while (true) {
                Object state$kotlinx_coroutines_core2 = getState$kotlinx_coroutines_core();
                if (!(state$kotlinx_coroutines_core2 instanceof Finishing)) {
                    if (!(state$kotlinx_coroutines_core2 instanceof Incomplete)) {
                        symbol = JobKt.TOO_LATE_TO_CANCEL;
                        break;
                    }
                    if (th == null) {
                        th = createCauseException(obj);
                    }
                    Incomplete incomplete = (Incomplete) state$kotlinx_coroutines_core2;
                    if (!incomplete.isActive()) {
                        Object tryMakeCompleting = tryMakeCompleting(state$kotlinx_coroutines_core2, new CompletedExceptionally(th, false));
                        if (tryMakeCompleting == JobKt.COMPLETING_ALREADY) {
                            obj2 = ("Cannot happen in " + state$kotlinx_coroutines_core2).toString();
                            a$$ExternalSyntheticBUOutline0.m$1(obj2);
                            return false;
                        }
                        if (tryMakeCompleting != JobKt.COMPLETING_RETRY) {
                            obj3 = tryMakeCompleting;
                            break;
                        }
                    } else if (tryMakeCancelling(incomplete, th)) {
                        symbol = JobKt.COMPLETING_ALREADY;
                        break;
                    }
                } else {
                    synchronized (state$kotlinx_coroutines_core2) {
                        if (((Finishing) state$kotlinx_coroutines_core2).getExceptionsHolder() == JobKt.SEALED) {
                            symbol = JobKt.TOO_LATE_TO_CANCEL;
                        } else {
                            boolean isCancelling = ((Finishing) state$kotlinx_coroutines_core2).isCancelling();
                            if (th == null) {
                                th = createCauseException(obj);
                            }
                            ((Finishing) state$kotlinx_coroutines_core2).addExceptionLocked(th);
                            Throwable rootCause = isCancelling ? null : ((Finishing) state$kotlinx_coroutines_core2).getRootCause();
                            if (rootCause != null) {
                                notifyCancelling(((Finishing) state$kotlinx_coroutines_core2).list, rootCause);
                            }
                            symbol = JobKt.COMPLETING_ALREADY;
                        }
                    }
                }
            }
        }
        if (obj3 != JobKt.COMPLETING_ALREADY && obj3 != JobKt.COMPLETING_WAITING_CHILDREN) {
            if (obj3 == JobKt.TOO_LATE_TO_CANCEL) {
                return false;
            }
            afterCompletion(obj3);
            return true;
        }
        return true;
    }

    public void cancelInternal(CancellationException cancellationException) {
        cancelImpl$kotlinx_coroutines_core(cancellationException);
    }

    public final boolean cancelParent(Throwable th) {
        if (isScopedCoroutine()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        ChildHandle parentHandle$kotlinx_coroutines_core = getParentHandle$kotlinx_coroutines_core();
        return (parentHandle$kotlinx_coroutines_core == null || parentHandle$kotlinx_coroutines_core == NonDisposableHandle.INSTANCE) ? z : parentHandle$kotlinx_coroutines_core.childCancelled(th) || z;
    }

    public String cancellationExceptionMessage() {
        return "Job was cancelled";
    }

    public boolean childCancelled(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return cancelImpl$kotlinx_coroutines_core(th) && getHandlesException$kotlinx_coroutines_core();
    }

    public boolean complete(Object obj) {
        return makeCompleting$kotlinx_coroutines_core(obj);
    }

    public final void completeStateFinalization(Incomplete incomplete, Object obj) {
        ChildHandle parentHandle$kotlinx_coroutines_core = getParentHandle$kotlinx_coroutines_core();
        if (parentHandle$kotlinx_coroutines_core != null) {
            parentHandle$kotlinx_coroutines_core.dispose();
            setParentHandle$kotlinx_coroutines_core(NonDisposableHandle.INSTANCE);
        }
        CompletionHandlerException completionHandlerException = null;
        CompletedExceptionally completedExceptionally = obj instanceof CompletedExceptionally ? (CompletedExceptionally) obj : null;
        Throwable th = completedExceptionally != null ? completedExceptionally.cause : null;
        if (incomplete instanceof JobNode) {
            try {
                ((JobNode) incomplete).invoke(th);
                return;
            } catch (Throwable th2) {
                handleOnCompletionException$kotlinx_coroutines_core(new CompletionHandlerException("Exception in completion handler " + incomplete + " for " + this, th2));
                return;
            }
        }
        NodeList list = incomplete.getList();
        if (list != null) {
            list.addLast(new ListClosed(1), 1);
            Object next = list.getNext();
            next.getClass();
            for (LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode) next; !lockFreeLinkedListNode.equals(list); lockFreeLinkedListNode = lockFreeLinkedListNode.getNextNode()) {
                if (lockFreeLinkedListNode instanceof JobNode) {
                    try {
                        ((JobNode) lockFreeLinkedListNode).invoke(th);
                    } catch (Throwable th3) {
                        if (completionHandlerException != null) {
                            ExceptionsKt__ExceptionsKt.addSuppressed(completionHandlerException, th3);
                        } else {
                            completionHandlerException = new CompletionHandlerException("Exception in completion handler " + lockFreeLinkedListNode + " for " + this, th3);
                        }
                    }
                }
            }
            if (completionHandlerException != null) {
                handleOnCompletionException$kotlinx_coroutines_core(completionHandlerException);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Throwable] */
    public final Throwable createCauseException(Object obj) {
        String obj2;
        CancellationException cancellationException;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        JobSupport jobSupport = (JobSupport) ((ParentJob) obj);
        Object state$kotlinx_coroutines_core = jobSupport.getState$kotlinx_coroutines_core();
        if (state$kotlinx_coroutines_core instanceof Finishing) {
            cancellationException = ((Finishing) state$kotlinx_coroutines_core).getRootCause();
        } else if (state$kotlinx_coroutines_core instanceof CompletedExceptionally) {
            cancellationException = ((CompletedExceptionally) state$kotlinx_coroutines_core).cause;
        } else {
            if (state$kotlinx_coroutines_core instanceof Incomplete) {
                obj2 = ("Cannot be cancelling child in this state: " + state$kotlinx_coroutines_core).toString();
                a$$ExternalSyntheticBUOutline0.m$1(obj2);
                return null;
            }
            cancellationException = null;
        }
        CancellationException cancellationException2 = cancellationException instanceof CancellationException ? cancellationException : null;
        return cancellationException2 == null ? new JobCancellationException("Parent job is ".concat(stateString(state$kotlinx_coroutines_core)), cancellationException, jobSupport) : cancellationException2;
    }

    public final Object finalizeFinishingState(Finishing finishing, Object obj) {
        Finishing finishing2;
        Throwable th;
        Throwable finalRootCause;
        JobSupport jobSupport;
        Finishing finishing3;
        CompletedExceptionally completedExceptionally = obj instanceof CompletedExceptionally ? (CompletedExceptionally) obj : null;
        Throwable th2 = completedExceptionally != null ? completedExceptionally.cause : null;
        synchronized (finishing) {
            try {
                finishing.isCancelling();
                ArrayList<Throwable> sealLocked = finishing.sealLocked(th2);
                finalRootCause = getFinalRootCause(finishing, sealLocked);
                if (finalRootCause != null) {
                    try {
                        if (sealLocked.size() > 1) {
                            Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(sealLocked.size()));
                            for (Throwable th3 : sealLocked) {
                                if (th3 != finalRootCause && th3 != finalRootCause && !(th3 instanceof CancellationException) && newSetFromMap.add(th3)) {
                                    ExceptionsKt__ExceptionsKt.addSuppressed(finalRootCause, th3);
                                }
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        finishing2 = finishing;
                        throw th;
                    }
                }
            } catch (Throwable th5) {
                finishing2 = finishing;
                th = th5;
            }
        }
        if (finalRootCause != null && finalRootCause != th2) {
            obj = new CompletedExceptionally(finalRootCause, false);
        }
        if (finalRootCause != null && (cancelParent(finalRootCause) || handleJobException(finalRootCause))) {
            obj.getClass();
            CompletedExceptionally._handled$volatile$FU.compareAndSet((CompletedExceptionally) obj, 0, 1);
        }
        onCompletionInternal(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _state$volatile$FU;
        Object incompleteStateBox = obj instanceof Incomplete ? new IncompleteStateBox((Incomplete) obj) : obj;
        while (true) {
            atomicReferenceFieldUpdater.getClass();
            Unsafe unsafe = ConfigCollectorAtomicFieldUpdaterHelper.unsafe;
            long j = _state$volatile$FU$offset;
            jobSupport = this;
            finishing3 = finishing;
            if (!unsafe.compareAndSwapObject(jobSupport, j, finishing3, incompleteStateBox) && unsafe.getObjectVolatile(jobSupport, j) == finishing3) {
                this = jobSupport;
                finishing = finishing3;
            }
        }
        jobSupport.completeStateFinalization(finishing3, obj);
        return obj;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object fold(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element get(CoroutineContext.Key key) {
        return CoroutineContext.Element.DefaultImpls.get(this, key);
    }

    @Override // kotlinx.coroutines.Job
    public final CancellationException getCancellationException() {
        CancellationException cancellationException;
        Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        if (state$kotlinx_coroutines_core instanceof Finishing) {
            Throwable rootCause = ((Finishing) state$kotlinx_coroutines_core).getRootCause();
            if (rootCause == null) {
                Path$$ExternalSyntheticBUOutline0.m$1(this, "Job is still new or active: ");
                return null;
            }
            String concat = getClass().getSimpleName().concat(" is cancelling");
            cancellationException = rootCause instanceof CancellationException ? (CancellationException) rootCause : null;
            return cancellationException == null ? new JobCancellationException(concat, rootCause, this) : cancellationException;
        }
        if (state$kotlinx_coroutines_core instanceof Incomplete) {
            Path$$ExternalSyntheticBUOutline0.m$1(this, "Job is still new or active: ");
            return null;
        }
        if (!(state$kotlinx_coroutines_core instanceof CompletedExceptionally)) {
            return new JobCancellationException(getClass().getSimpleName().concat(" has completed normally"), null, this);
        }
        Throwable th = ((CompletedExceptionally) state$kotlinx_coroutines_core).cause;
        cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        return cancellationException == null ? new JobCancellationException(cancellationExceptionMessage(), th, this) : cancellationException;
    }

    @Override // kotlinx.coroutines.Job
    public final Sequence getChildren() {
        return new StringsKt__StringsKt$lineSequence$$inlined$Sequence$1(new JobSupport$children$1(null, this), 2);
    }

    public Object getCompleted() {
        return getCompletedInternal$kotlinx_coroutines_core();
    }

    public final Object getCompletedInternal$kotlinx_coroutines_core() {
        Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        if (state$kotlinx_coroutines_core instanceof Incomplete) {
            a$$ExternalSyntheticBUOutline0.m$1("This job has not completed yet");
            return null;
        }
        if (state$kotlinx_coroutines_core instanceof CompletedExceptionally) {
            throw ((CompletedExceptionally) state$kotlinx_coroutines_core).cause;
        }
        return JobKt.unboxState(state$kotlinx_coroutines_core);
    }

    public final Throwable getCompletionExceptionOrNull() {
        Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        if (state$kotlinx_coroutines_core instanceof Incomplete) {
            a$$ExternalSyntheticBUOutline0.m$1("This job has not completed yet");
            return null;
        }
        CompletedExceptionally completedExceptionally = state$kotlinx_coroutines_core instanceof CompletedExceptionally ? (CompletedExceptionally) state$kotlinx_coroutines_core : null;
        if (completedExceptionally != null) {
            return completedExceptionally.cause;
        }
        return null;
    }

    public final Throwable getFinalRootCause(Finishing finishing, ArrayList arrayList) {
        Object obj;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (finishing.isCancelling()) {
                return new JobCancellationException(cancellationExceptionMessage(), null, this);
            }
            return null;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (!(((Throwable) obj) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof TimeoutCancellationException) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                Throwable th3 = (Throwable) next;
                if (th3 != th2 && (th3 instanceof TimeoutCancellationException)) {
                    obj2 = next;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj2;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    public boolean getHandlesException$kotlinx_coroutines_core() {
        return true;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final CoroutineContext.Key getKey() {
        return Job.Key.$$INSTANCE;
    }

    public DefaultSocket getOnAwait() {
        return getOnAwaitInternal();
    }

    public final DefaultSocket getOnAwaitInternal() {
        JobSupport$onAwaitInternal$1 jobSupport$onAwaitInternal$1 = JobSupport$onAwaitInternal$1.INSTANCE;
        TypeIntrinsics.beforeCheckcastToFunctionOfArity(3, jobSupport$onAwaitInternal$1);
        JobSupport$onAwaitInternal$2 jobSupport$onAwaitInternal$2 = JobSupport$onAwaitInternal$2.INSTANCE;
        TypeIntrinsics.beforeCheckcastToFunctionOfArity(3, jobSupport$onAwaitInternal$2);
        return new DefaultSocket(this, jobSupport$onAwaitInternal$1, jobSupport$onAwaitInternal$2, null, 9);
    }

    public boolean getOnCancelComplete$kotlinx_coroutines_core() {
        return this instanceof CompletableDeferredImpl;
    }

    @Override // kotlinx.coroutines.Job
    public final LaunchTracker getOnJoin() {
        JobSupport$onJoin$1 jobSupport$onJoin$1 = JobSupport$onJoin$1.INSTANCE;
        TypeIntrinsics.beforeCheckcastToFunctionOfArity(3, jobSupport$onJoin$1);
        return new LaunchTracker(this, jobSupport$onJoin$1);
    }

    public final NodeList getOrPromoteCancellingList(Incomplete incomplete) {
        NodeList list = incomplete.getList();
        if (list != null) {
            return list;
        }
        if (incomplete instanceof Empty) {
            return new NodeList();
        }
        if (incomplete instanceof JobNode) {
            promoteSingleToNodeList((JobNode) incomplete);
            return null;
        }
        Path$$ExternalSyntheticBUOutline0.m$1(incomplete, "State should have list: ");
        return null;
    }

    public final ChildHandle getParentHandle$kotlinx_coroutines_core() {
        _parentHandle$volatile$FU.getClass();
        return (ChildHandle) ConfigCollectorAtomicFieldUpdaterHelper.unsafe.getObjectVolatile(this, _parentHandle$volatile$FU$offset);
    }

    public final Object getState$kotlinx_coroutines_core() {
        _state$volatile$FU.getClass();
        return ConfigCollectorAtomicFieldUpdaterHelper.unsafe.getObjectVolatile(this, _state$volatile$FU$offset);
    }

    public boolean handleJobException(Throwable th) {
        return false;
    }

    public void handleOnCompletionException$kotlinx_coroutines_core(CompletionHandlerException completionHandlerException) {
        throw completionHandlerException;
    }

    public final void initParentJob(Job job) {
        NonDisposableHandle nonDisposableHandle = NonDisposableHandle.INSTANCE;
        if (job == null) {
            setParentHandle$kotlinx_coroutines_core(nonDisposableHandle);
            return;
        }
        job.start();
        ChildHandle attachChild = job.attachChild(this);
        setParentHandle$kotlinx_coroutines_core(attachChild);
        if (isCompleted()) {
            attachChild.dispose();
            setParentHandle$kotlinx_coroutines_core(nonDisposableHandle);
        }
    }

    @Override // kotlinx.coroutines.Job
    public final DisposableHandle invokeOnCompletion(boolean z, boolean z2, Radiography$renderScannableViewTree$1$2 radiography$renderScannableViewTree$1$2) {
        return invokeOnCompletionInternal$kotlinx_coroutines_core(z2, z ? new InvokeOnCancelling(radiography$renderScannableViewTree$1$2) : new InvokeOnCompletion(radiography$renderScannableViewTree$1$2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0085, code lost:
    
        return r5;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [kotlinx.coroutines.InactiveNodeList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final DisposableHandle invokeOnCompletionInternal$kotlinx_coroutines_core(boolean z, JobNode jobNode) {
        JobNode jobNode2;
        JobSupport jobSupport;
        NonDisposableHandle nonDisposableHandle;
        boolean addLast;
        jobNode.job = this;
        loop0: while (true) {
            Object state$kotlinx_coroutines_core = this.getState$kotlinx_coroutines_core();
            if (state$kotlinx_coroutines_core instanceof Empty) {
                Empty empty = (Empty) state$kotlinx_coroutines_core;
                boolean z2 = empty.isActive;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _state$volatile$FU;
                if (z2) {
                    while (true) {
                        atomicReferenceFieldUpdater.getClass();
                        Unsafe unsafe = ConfigCollectorAtomicFieldUpdaterHelper.unsafe;
                        long j = _state$volatile$FU$offset;
                        JobSupport jobSupport2 = this;
                        jobNode2 = jobNode;
                        jobSupport = jobSupport2;
                        if (unsafe.compareAndSwapObject(jobSupport2, j, state$kotlinx_coroutines_core, jobNode2)) {
                            break loop0;
                        }
                        if (unsafe.getObjectVolatile(jobSupport, j) != state$kotlinx_coroutines_core) {
                            break;
                        }
                        this = jobSupport;
                        jobNode = jobNode2;
                    }
                } else {
                    jobNode2 = jobNode;
                    jobSupport = this;
                    NodeList nodeList = new NodeList();
                    if (!z2) {
                        nodeList = new InactiveNodeList(nodeList);
                    }
                    SizeMode$EnumUnboxingLocalUtility.m(atomicReferenceFieldUpdater, jobSupport, empty, nodeList);
                }
                this = jobSupport;
                jobNode = jobNode2;
            } else {
                jobNode2 = jobNode;
                jobSupport = this;
                boolean z3 = state$kotlinx_coroutines_core instanceof Incomplete;
                nonDisposableHandle = NonDisposableHandle.INSTANCE;
                if (z3) {
                    Incomplete incomplete = (Incomplete) state$kotlinx_coroutines_core;
                    NodeList list = incomplete.getList();
                    if (list == null) {
                        jobSupport.promoteSingleToNodeList((JobNode) state$kotlinx_coroutines_core);
                    } else {
                        if (jobNode2.getOnCancelling()) {
                            Finishing finishing = incomplete instanceof Finishing ? (Finishing) incomplete : null;
                            Throwable rootCause = finishing != null ? finishing.getRootCause() : null;
                            if (rootCause == null) {
                                addLast = list.addLast(jobNode2, 5);
                            } else if (z) {
                                jobNode2.invoke(rootCause);
                                return nonDisposableHandle;
                            }
                        } else {
                            addLast = list.addLast(jobNode2, 1);
                        }
                        if (addLast) {
                            break;
                        }
                    }
                    this = jobSupport;
                    jobNode = jobNode2;
                } else if (z) {
                    Object state$kotlinx_coroutines_core2 = jobSupport.getState$kotlinx_coroutines_core();
                    CompletedExceptionally completedExceptionally = state$kotlinx_coroutines_core2 instanceof CompletedExceptionally ? (CompletedExceptionally) state$kotlinx_coroutines_core2 : null;
                    jobNode2.invoke(completedExceptionally != null ? completedExceptionally.cause : null);
                }
            }
        }
        return nonDisposableHandle;
    }

    @Override // kotlinx.coroutines.Job
    public boolean isActive() {
        Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        return (state$kotlinx_coroutines_core instanceof Incomplete) && ((Incomplete) state$kotlinx_coroutines_core).isActive();
    }

    @Override // kotlinx.coroutines.Job
    public final boolean isCancelled() {
        Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        if (state$kotlinx_coroutines_core instanceof CompletedExceptionally) {
            return true;
        }
        return (state$kotlinx_coroutines_core instanceof Finishing) && ((Finishing) state$kotlinx_coroutines_core).isCancelling();
    }

    @Override // kotlinx.coroutines.Job
    public final boolean isCompleted() {
        return !(getState$kotlinx_coroutines_core() instanceof Incomplete);
    }

    public boolean isScopedCoroutine() {
        return this instanceof BlockingCoroutine;
    }

    @Override // kotlinx.coroutines.Job
    public final Object join(Continuation continuation) {
        Object state$kotlinx_coroutines_core;
        do {
            state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
            if (!(state$kotlinx_coroutines_core instanceof Incomplete)) {
                JobKt.ensureActive(continuation.getContext());
                return Unit.INSTANCE;
            }
        } while (startInternal(state$kotlinx_coroutines_core) < 0);
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        cancellableContinuationImpl.initCancellability();
        cancellableContinuationImpl.invokeOnCancellationImpl(new DisposeOnCancel(JobKt.invokeOnCompletion$default(this, new ResumeOnCompletion(cancellableContinuationImpl)), 0));
        Object result = cancellableContinuationImpl.getResult();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (result != coroutineSingletons) {
            result = Unit.INSTANCE;
        }
        return result == coroutineSingletons ? result : Unit.INSTANCE;
    }

    public final boolean makeCompleting$kotlinx_coroutines_core(Object obj) {
        Object tryMakeCompleting;
        do {
            tryMakeCompleting = tryMakeCompleting(getState$kotlinx_coroutines_core(), obj);
            if (tryMakeCompleting == JobKt.COMPLETING_ALREADY) {
                return false;
            }
            if (tryMakeCompleting == JobKt.COMPLETING_WAITING_CHILDREN) {
                return true;
            }
        } while (tryMakeCompleting == JobKt.COMPLETING_RETRY);
        afterCompletion(tryMakeCompleting);
        return true;
    }

    public final Object makeCompletingOnce$kotlinx_coroutines_core(Object obj) {
        Object tryMakeCompleting;
        do {
            tryMakeCompleting = tryMakeCompleting(getState$kotlinx_coroutines_core(), obj);
            if (tryMakeCompleting == JobKt.COMPLETING_ALREADY) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                CompletedExceptionally completedExceptionally = obj instanceof CompletedExceptionally ? (CompletedExceptionally) obj : null;
                throw new IllegalStateException(str, completedExceptionally != null ? completedExceptionally.cause : null);
            }
        } while (tryMakeCompleting == JobKt.COMPLETING_RETRY);
        return tryMakeCompleting;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(CoroutineContext.Key key) {
        return CoroutineContext.Element.DefaultImpls.minusKey(this, key);
    }

    public String nameString$kotlinx_coroutines_core() {
        return getClass().getSimpleName();
    }

    public final void notifyCancelling(NodeList nodeList, Throwable th) {
        nodeList.addLast(new ListClosed(4), 4);
        Object next = nodeList.getNext();
        next.getClass();
        CompletionHandlerException completionHandlerException = null;
        for (LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode) next; !lockFreeLinkedListNode.equals(nodeList); lockFreeLinkedListNode = lockFreeLinkedListNode.getNextNode()) {
            if ((lockFreeLinkedListNode instanceof JobNode) && ((JobNode) lockFreeLinkedListNode).getOnCancelling()) {
                try {
                    ((JobNode) lockFreeLinkedListNode).invoke(th);
                } catch (Throwable th2) {
                    if (completionHandlerException != null) {
                        ExceptionsKt__ExceptionsKt.addSuppressed(completionHandlerException, th2);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + lockFreeLinkedListNode + " for " + this, th2);
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            handleOnCompletionException$kotlinx_coroutines_core(completionHandlerException);
        }
        cancelParent(th);
    }

    public void onCompletionInternal(Object obj) {
    }

    public void onStart() {
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return CoroutineContext.Element.DefaultImpls.plus(this, coroutineContext);
    }

    public final void promoteSingleToNodeList(JobNode jobNode) {
        jobNode.addOneIfEmpty(new NodeList());
        LockFreeLinkedListNode nextNode = jobNode.getNextNode();
        while (true) {
            _state$volatile$FU.getClass();
            Unsafe unsafe = ConfigCollectorAtomicFieldUpdaterHelper.unsafe;
            long j = _state$volatile$FU$offset;
            JobSupport jobSupport = this;
            JobNode jobNode2 = jobNode;
            if (unsafe.compareAndSwapObject(jobSupport, j, jobNode2, nextNode) || unsafe.getObjectVolatile(jobSupport, j) != jobNode2) {
                return;
            }
            this = jobSupport;
            jobNode = jobNode2;
        }
    }

    public final void removeNode$kotlinx_coroutines_core(JobNode jobNode) {
        JobSupport jobSupport;
        while (true) {
            Object state$kotlinx_coroutines_core = this.getState$kotlinx_coroutines_core();
            if (!(state$kotlinx_coroutines_core instanceof JobNode)) {
                if (!(state$kotlinx_coroutines_core instanceof Incomplete) || ((Incomplete) state$kotlinx_coroutines_core).getList() == null) {
                    return;
                }
                jobNode.removeOrNext();
                return;
            }
            if (state$kotlinx_coroutines_core != jobNode) {
                return;
            }
            Empty empty = JobKt.EMPTY_ACTIVE;
            while (true) {
                _state$volatile$FU.getClass();
                Unsafe unsafe = ConfigCollectorAtomicFieldUpdaterHelper.unsafe;
                long j = _state$volatile$FU$offset;
                jobSupport = this;
                if (unsafe.compareAndSwapObject(jobSupport, j, state$kotlinx_coroutines_core, empty)) {
                    return;
                }
                if (unsafe.getObjectVolatile(jobSupport, j) != state$kotlinx_coroutines_core) {
                    break;
                } else {
                    this = jobSupport;
                }
            }
            this = jobSupport;
        }
    }

    public final void setParentHandle$kotlinx_coroutines_core(ChildHandle childHandle) {
        _parentHandle$volatile$FU.getClass();
        ConfigCollectorAtomicFieldUpdaterHelper.unsafe.putObjectVolatile(this, _parentHandle$volatile$FU$offset, childHandle);
    }

    @Override // kotlinx.coroutines.Job
    public final boolean start() {
        int startInternal;
        do {
            startInternal = startInternal(getState$kotlinx_coroutines_core());
            if (startInternal == 0) {
                return false;
            }
        } while (startInternal != 1);
        return true;
    }

    public final int startInternal(Object obj) {
        Unsafe unsafe;
        Unsafe unsafe2;
        boolean z = obj instanceof Empty;
        long j = _state$volatile$FU$offset;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _state$volatile$FU;
        if (z) {
            if (((Empty) obj).isActive) {
                return 0;
            }
            Empty empty = JobKt.EMPTY_ACTIVE;
            do {
                atomicReferenceFieldUpdater.getClass();
                unsafe2 = ConfigCollectorAtomicFieldUpdaterHelper.unsafe;
                if (unsafe2.compareAndSwapObject(this, _state$volatile$FU$offset, obj, empty)) {
                    onStart();
                    return 1;
                }
            } while (unsafe2.getObjectVolatile(this, j) == obj);
            return -1;
        }
        if (!(obj instanceof InactiveNodeList)) {
            return 0;
        }
        NodeList nodeList = ((InactiveNodeList) obj).list;
        do {
            atomicReferenceFieldUpdater.getClass();
            unsafe = ConfigCollectorAtomicFieldUpdaterHelper.unsafe;
            if (unsafe.compareAndSwapObject(this, _state$volatile$FU$offset, obj, nodeList)) {
                onStart();
                return 1;
            }
        } while (unsafe.getObjectVolatile(this, j) == obj);
        return -1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(nameString$kotlinx_coroutines_core() + '{' + stateString(getState$kotlinx_coroutines_core()) + '}');
        sb.append('@');
        sb.append(JobKt.getHexAddress(this));
        return sb.toString();
    }

    public final boolean tryFinalizeSimpleState(Incomplete incomplete, Object obj) {
        Object incompleteStateBox = obj instanceof Incomplete ? new IncompleteStateBox((Incomplete) obj) : obj;
        while (true) {
            _state$volatile$FU.getClass();
            Unsafe unsafe = ConfigCollectorAtomicFieldUpdaterHelper.unsafe;
            long j = _state$volatile$FU$offset;
            JobSupport jobSupport = this;
            Incomplete incomplete2 = incomplete;
            if (unsafe.compareAndSwapObject(jobSupport, j, incomplete2, incompleteStateBox)) {
                jobSupport.onCompletionInternal(obj);
                jobSupport.completeStateFinalization(incomplete2, obj);
                return true;
            }
            if (unsafe.getObjectVolatile(jobSupport, j) != incomplete2) {
                return false;
            }
            this = jobSupport;
            incomplete = incomplete2;
        }
    }

    public final boolean tryMakeCancelling(Incomplete incomplete, Throwable th) {
        NodeList orPromoteCancellingList = getOrPromoteCancellingList(incomplete);
        if (orPromoteCancellingList == null) {
            return false;
        }
        Finishing finishing = new Finishing(orPromoteCancellingList, th);
        while (true) {
            _state$volatile$FU.getClass();
            Unsafe unsafe = ConfigCollectorAtomicFieldUpdaterHelper.unsafe;
            long j = _state$volatile$FU$offset;
            JobSupport jobSupport = this;
            Incomplete incomplete2 = incomplete;
            if (unsafe.compareAndSwapObject(jobSupport, j, incomplete2, finishing)) {
                jobSupport.notifyCancelling(orPromoteCancellingList, th);
                return true;
            }
            if (unsafe.getObjectVolatile(jobSupport, j) != incomplete2) {
                return false;
            }
            this = jobSupport;
            incomplete = incomplete2;
        }
    }

    public final Object tryMakeCompleting(Object obj, Object obj2) {
        if (!(obj instanceof Incomplete)) {
            return JobKt.COMPLETING_ALREADY;
        }
        if (((obj instanceof Empty) || (obj instanceof JobNode)) && !(obj instanceof ChildHandleNode) && !(obj2 instanceof CompletedExceptionally)) {
            return tryFinalizeSimpleState((Incomplete) obj, obj2) ? obj2 : JobKt.COMPLETING_RETRY;
        }
        Incomplete incomplete = (Incomplete) obj;
        NodeList orPromoteCancellingList = getOrPromoteCancellingList(incomplete);
        if (orPromoteCancellingList == null) {
            return JobKt.COMPLETING_RETRY;
        }
        Finishing finishing = incomplete instanceof Finishing ? (Finishing) incomplete : null;
        if (finishing == null) {
            finishing = new Finishing(orPromoteCancellingList, null);
        }
        synchronized (finishing) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = Finishing._isCompleting$volatile$FU;
            if (atomicIntegerFieldUpdater.get(finishing) == 1) {
                return JobKt.COMPLETING_ALREADY;
            }
            atomicIntegerFieldUpdater.set(finishing, 1);
            if (finishing != incomplete) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _state$volatile$FU;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, incomplete, finishing)) {
                    if (atomicReferenceFieldUpdater.get(this) != incomplete) {
                        return JobKt.COMPLETING_RETRY;
                    }
                }
            }
            boolean isCancelling = finishing.isCancelling();
            CompletedExceptionally completedExceptionally = obj2 instanceof CompletedExceptionally ? (CompletedExceptionally) obj2 : null;
            if (completedExceptionally != null) {
                finishing.addExceptionLocked(completedExceptionally.cause);
            }
            Throwable rootCause = isCancelling ? null : finishing.getRootCause();
            if (rootCause != null) {
                notifyCancelling(orPromoteCancellingList, rootCause);
            }
            ChildHandleNode nextChild = nextChild(orPromoteCancellingList);
            if (nextChild != null && tryWaitForChild(finishing, nextChild, obj2)) {
                return JobKt.COMPLETING_WAITING_CHILDREN;
            }
            orPromoteCancellingList.addLast(new ListClosed(2), 2);
            ChildHandleNode nextChild2 = nextChild(orPromoteCancellingList);
            return (nextChild2 == null || !tryWaitForChild(finishing, nextChild2, obj2)) ? finalizeFinishingState(finishing, obj2) : JobKt.COMPLETING_WAITING_CHILDREN;
        }
    }

    public final boolean tryWaitForChild(Finishing finishing, ChildHandleNode childHandleNode, Object obj) {
        while (childHandleNode.childJob.invokeOnCompletionInternal$kotlinx_coroutines_core(false, new ChildCompletion(this, finishing, childHandleNode, obj)) == NonDisposableHandle.INSTANCE) {
            childHandleNode = nextChild(childHandleNode);
            if (childHandleNode == null) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlinx.coroutines.Job
    public final DisposableHandle invokeOnCompletion(Function1 function1) {
        return invokeOnCompletionInternal$kotlinx_coroutines_core(true, new InvokeOnCompletion(function1));
    }
}
