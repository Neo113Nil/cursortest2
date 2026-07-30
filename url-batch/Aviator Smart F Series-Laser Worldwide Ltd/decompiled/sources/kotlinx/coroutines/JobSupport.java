package kotlinx.coroutines;

import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import kotlinx.coroutines.l1;

/* loaded from: classes3.dex */
public class JobSupport implements l1, v, z1 {
    private volatile Object _parentHandle;
    private volatile Object _state;
    private static final AtomicReferenceFieldUpdater _state$FU = AtomicReferenceFieldUpdater.newUpdater(JobSupport.class, Object.class, "_state");
    private static final AtomicReferenceFieldUpdater _parentHandle$FU = AtomicReferenceFieldUpdater.newUpdater(JobSupport.class, Object.class, "_parentHandle");

    private static final class a extends o {
        private final JobSupport job;

        public a(kotlin.coroutines.c cVar, JobSupport jobSupport) {
            super(cVar, 1);
            this.job = jobSupport;
        }

        @Override // kotlinx.coroutines.o
        public Throwable getContinuationCancellationCause(l1 l1Var) {
            Throwable rootCause;
            Object state$kotlinx_coroutines_core = this.job.getState$kotlinx_coroutines_core();
            return (!(state$kotlinx_coroutines_core instanceof c) || (rootCause = ((c) state$kotlinx_coroutines_core).getRootCause()) == null) ? state$kotlinx_coroutines_core instanceof b0 ? ((b0) state$kotlinx_coroutines_core).cause : l1Var.getCancellationException() : rootCause;
        }

        @Override // kotlinx.coroutines.o
        protected String nameString() {
            return "AwaitContinuation";
        }
    }

    private static final class b extends r1 {
        private final u child;
        private final JobSupport parent;
        private final Object proposedUpdate;
        private final c state;

        public b(JobSupport jobSupport, c cVar, u uVar, Object obj) {
            this.parent = jobSupport;
            this.state = cVar;
            this.child = uVar;
            this.proposedUpdate = obj;
        }

        @Override // kotlinx.coroutines.r1, kotlinx.coroutines.d0, f6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return y5.w.INSTANCE;
        }

        @Override // kotlinx.coroutines.d0
        public void invoke(Throwable th) {
            this.parent.continueCompleting(this.state, this.child, this.proposedUpdate);
        }
    }

    private static final class c implements g1 {
        private volatile Object _exceptionsHolder;
        private volatile int _isCompleting;
        private volatile Object _rootCause;
        private final w1 list;
        private static final AtomicIntegerFieldUpdater _isCompleting$FU = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isCompleting");
        private static final AtomicReferenceFieldUpdater _rootCause$FU = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_rootCause");
        private static final AtomicReferenceFieldUpdater _exceptionsHolder$FU = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_exceptionsHolder");

        public c(w1 w1Var, boolean z7, Throwable th) {
            this.list = w1Var;
            this._isCompleting = z7 ? 1 : 0;
            this._rootCause = th;
        }

        private final ArrayList<Throwable> allocateList() {
            return new ArrayList<>(4);
        }

        private final Object getExceptionsHolder() {
            return _exceptionsHolder$FU.get(this);
        }

        private final void setExceptionsHolder(Object obj) {
            _exceptionsHolder$FU.set(this, obj);
        }

        public final void addExceptionLocked(Throwable th) {
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
            if (exceptionsHolder instanceof Throwable) {
                if (th == exceptionsHolder) {
                    return;
                }
                ArrayList<Throwable> allocateList = allocateList();
                allocateList.add(exceptionsHolder);
                allocateList.add(th);
                setExceptionsHolder(allocateList);
                return;
            }
            if (exceptionsHolder instanceof ArrayList) {
                ((ArrayList) exceptionsHolder).add(th);
                return;
            }
            throw new IllegalStateException(("State is " + exceptionsHolder).toString());
        }

        @Override // kotlinx.coroutines.g1
        public w1 getList() {
            return this.list;
        }

        public final Throwable getRootCause() {
            return (Throwable) _rootCause$FU.get(this);
        }

        @Override // kotlinx.coroutines.g1
        public boolean isActive() {
            return getRootCause() == null;
        }

        public final boolean isCancelling() {
            return getRootCause() != null;
        }

        public final boolean isCompleting() {
            return _isCompleting$FU.get(this) != 0;
        }

        public final boolean isSealed() {
            kotlinx.coroutines.internal.g0 g0Var;
            Object exceptionsHolder = getExceptionsHolder();
            g0Var = s1.SEALED;
            return exceptionsHolder == g0Var;
        }

        public final List<Throwable> sealLocked(Throwable th) {
            ArrayList<Throwable> arrayList;
            kotlinx.coroutines.internal.g0 g0Var;
            Object exceptionsHolder = getExceptionsHolder();
            if (exceptionsHolder == null) {
                arrayList = allocateList();
            } else if (exceptionsHolder instanceof Throwable) {
                ArrayList<Throwable> allocateList = allocateList();
                allocateList.add(exceptionsHolder);
                arrayList = allocateList;
            } else {
                if (!(exceptionsHolder instanceof ArrayList)) {
                    throw new IllegalStateException(("State is " + exceptionsHolder).toString());
                }
                arrayList = (ArrayList) exceptionsHolder;
            }
            Throwable rootCause = getRootCause();
            if (rootCause != null) {
                arrayList.add(0, rootCause);
            }
            if (th != null && !kotlin.jvm.internal.s.areEqual(th, rootCause)) {
                arrayList.add(th);
            }
            g0Var = s1.SEALED;
            setExceptionsHolder(g0Var);
            return arrayList;
        }

        public final void setCompleting(boolean z7) {
            _isCompleting$FU.set(this, z7 ? 1 : 0);
        }

        public final void setRootCause(Throwable th) {
            _rootCause$FU.set(this, th);
        }

        public String toString() {
            return "Finishing[cancelling=" + isCancelling() + ", completing=" + isCompleting() + ", rootCause=" + getRootCause() + ", exceptions=" + getExceptionsHolder() + ", list=" + getList() + ']';
        }
    }

    private final class d extends r1 {
        private final kotlinx.coroutines.selects.j select;

        public d(kotlinx.coroutines.selects.j jVar) {
            this.select = jVar;
        }

        @Override // kotlinx.coroutines.r1, kotlinx.coroutines.d0, f6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return y5.w.INSTANCE;
        }

        @Override // kotlinx.coroutines.d0
        public void invoke(Throwable th) {
            Object state$kotlinx_coroutines_core = JobSupport.this.getState$kotlinx_coroutines_core();
            if (!(state$kotlinx_coroutines_core instanceof b0)) {
                state$kotlinx_coroutines_core = s1.unboxState(state$kotlinx_coroutines_core);
            }
            this.select.trySelect(JobSupport.this, state$kotlinx_coroutines_core);
        }
    }

    private final class e extends r1 {
        private final kotlinx.coroutines.selects.j select;

        public e(kotlinx.coroutines.selects.j jVar) {
            this.select = jVar;
        }

        @Override // kotlinx.coroutines.r1, kotlinx.coroutines.d0, f6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return y5.w.INSTANCE;
        }

        @Override // kotlinx.coroutines.d0
        public void invoke(Throwable th) {
            this.select.trySelect(JobSupport.this, y5.w.INSTANCE);
        }
    }

    public static final class f extends LockFreeLinkedListNode.a {
        final /* synthetic */ Object $expect$inlined;
        final /* synthetic */ JobSupport this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(LockFreeLinkedListNode lockFreeLinkedListNode, JobSupport jobSupport, Object obj) {
            super(lockFreeLinkedListNode);
            this.this$0 = jobSupport;
            this.$expect$inlined = obj;
        }

        @Override // kotlinx.coroutines.internal.b
        public Object prepare(LockFreeLinkedListNode lockFreeLinkedListNode) {
            if (this.this$0.getState$kotlinx_coroutines_core() == this.$expect$inlined) {
                return null;
            }
            return kotlinx.coroutines.internal.s.getCONDITION_FALSE();
        }
    }

    public JobSupport(boolean z7) {
        this._state = z7 ? s1.EMPTY_ACTIVE : s1.EMPTY_NEW;
    }

    private final boolean addLastAtomic(Object obj, w1 w1Var, r1 r1Var) {
        int tryCondAddNext;
        f fVar = new f(r1Var, this, obj);
        do {
            tryCondAddNext = w1Var.getPrevNode().tryCondAddNext(r1Var, w1Var, fVar);
            if (tryCondAddNext == 1) {
                return true;
            }
        } while (tryCondAddNext != 2);
        return false;
    }

    private final void addSuppressedExceptions(Throwable th, List<? extends Throwable> list) {
        if (list.size() <= 1) {
            return;
        }
        Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
        for (Throwable th2 : list) {
            if (th2 != th && th2 != th && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                y5.b.addSuppressed(th, th2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object awaitSuspend(kotlin.coroutines.c cVar) {
        kotlin.coroutines.c intercepted;
        Object coroutine_suspended;
        intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(cVar);
        a aVar = new a(intercepted, this);
        aVar.initCancellability();
        q.disposeOnCancellation(aVar, invokeOnCompletion(new a2(aVar)));
        Object result = aVar.getResult();
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        if (result == coroutine_suspended) {
            kotlin.coroutines.jvm.internal.f.probeCoroutineSuspended(cVar);
        }
        return result;
    }

    private final Object cancelMakeCompleting(Object obj) {
        kotlinx.coroutines.internal.g0 g0Var;
        Object tryMakeCompleting;
        kotlinx.coroutines.internal.g0 g0Var2;
        do {
            Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
            if (!(state$kotlinx_coroutines_core instanceof g1) || ((state$kotlinx_coroutines_core instanceof c) && ((c) state$kotlinx_coroutines_core).isCompleting())) {
                g0Var = s1.COMPLETING_ALREADY;
                return g0Var;
            }
            tryMakeCompleting = tryMakeCompleting(state$kotlinx_coroutines_core, new b0(createCauseException(obj), false, 2, null));
            g0Var2 = s1.COMPLETING_RETRY;
        } while (tryMakeCompleting == g0Var2);
        return tryMakeCompleting;
    }

    private final boolean cancelParent(Throwable th) {
        if (isScopedCoroutine()) {
            return true;
        }
        boolean z7 = th instanceof CancellationException;
        t parentHandle$kotlinx_coroutines_core = getParentHandle$kotlinx_coroutines_core();
        return (parentHandle$kotlinx_coroutines_core == null || parentHandle$kotlinx_coroutines_core == x1.INSTANCE) ? z7 : parentHandle$kotlinx_coroutines_core.childCancelled(th) || z7;
    }

    private final void completeStateFinalization(g1 g1Var, Object obj) {
        t parentHandle$kotlinx_coroutines_core = getParentHandle$kotlinx_coroutines_core();
        if (parentHandle$kotlinx_coroutines_core != null) {
            parentHandle$kotlinx_coroutines_core.dispose();
            setParentHandle$kotlinx_coroutines_core(x1.INSTANCE);
        }
        b0 b0Var = obj instanceof b0 ? (b0) obj : null;
        Throwable th = b0Var != null ? b0Var.cause : null;
        if (!(g1Var instanceof r1)) {
            w1 list = g1Var.getList();
            if (list != null) {
                notifyCompletion(list, th);
                return;
            }
            return;
        }
        try {
            ((r1) g1Var).invoke(th);
        } catch (Throwable th2) {
            handleOnCompletionException$kotlinx_coroutines_core(new CompletionHandlerException("Exception in completion handler " + g1Var + " for " + this, th2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void continueCompleting(c cVar, u uVar, Object obj) {
        u nextChild = nextChild(uVar);
        if (nextChild == null || !tryWaitForChild(cVar, nextChild, obj)) {
            afterCompletion(finalizeFinishingState(cVar, obj));
        }
    }

    private final Throwable createCauseException(Object obj) {
        if (obj == null || (obj instanceof Throwable)) {
            Throwable th = (Throwable) obj;
            return th == null ? new JobCancellationException(cancellationExceptionMessage(), null, this) : th;
        }
        kotlin.jvm.internal.s.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((z1) obj).getChildJobCancellationCause();
    }

    public static /* synthetic */ JobCancellationException defaultCancellationException$kotlinx_coroutines_core$default(JobSupport jobSupport, String str, Throwable th, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: defaultCancellationException");
        }
        if ((i8 & 1) != 0) {
            str = null;
        }
        if ((i8 & 2) != 0) {
            th = null;
        }
        if (str == null) {
            str = jobSupport.cancellationExceptionMessage();
        }
        return new JobCancellationException(str, th, jobSupport);
    }

    private final Object finalizeFinishingState(c cVar, Object obj) {
        boolean isCancelling;
        Throwable finalRootCause;
        b0 b0Var = obj instanceof b0 ? (b0) obj : null;
        Throwable th = b0Var != null ? b0Var.cause : null;
        synchronized (cVar) {
            isCancelling = cVar.isCancelling();
            List<Throwable> sealLocked = cVar.sealLocked(th);
            finalRootCause = getFinalRootCause(cVar, sealLocked);
            if (finalRootCause != null) {
                addSuppressedExceptions(finalRootCause, sealLocked);
            }
        }
        if (finalRootCause != null && finalRootCause != th) {
            obj = new b0(finalRootCause, false, 2, null);
        }
        if (finalRootCause != null && (cancelParent(finalRootCause) || handleJobException(finalRootCause))) {
            kotlin.jvm.internal.s.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            ((b0) obj).makeHandled();
        }
        if (!isCancelling) {
            onCancelling(finalRootCause);
        }
        onCompletionInternal(obj);
        androidx.concurrent.futures.a.a(_state$FU, this, cVar, s1.boxIncomplete(obj));
        completeStateFinalization(cVar, obj);
        return obj;
    }

    private final u firstChild(g1 g1Var) {
        u uVar = g1Var instanceof u ? (u) g1Var : null;
        if (uVar != null) {
            return uVar;
        }
        w1 list = g1Var.getList();
        if (list != null) {
            return nextChild(list);
        }
        return null;
    }

    private final Throwable getExceptionOrNull(Object obj) {
        b0 b0Var = obj instanceof b0 ? (b0) obj : null;
        if (b0Var != null) {
            return b0Var.cause;
        }
        return null;
    }

    private final Throwable getFinalRootCause(c cVar, List<? extends Throwable> list) {
        Object obj;
        Object obj2 = null;
        if (list.isEmpty()) {
            if (cVar.isCancelling()) {
                return new JobCancellationException(cancellationExceptionMessage(), null, this);
            }
            return null;
        }
        List<? extends Throwable> list2 = list;
        Iterator<T> it = list2.iterator();
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
        Throwable th2 = list.get(0);
        if (th2 instanceof TimeoutCancellationException) {
            Iterator<T> it2 = list2.iterator();
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

    protected static /* synthetic */ void getOnAwaitInternal$annotations() {
    }

    public static /* synthetic */ void getOnJoin$annotations() {
    }

    private final w1 getOrPromoteCancellingList(g1 g1Var) {
        w1 list = g1Var.getList();
        if (list != null) {
            return list;
        }
        if (g1Var instanceof x0) {
            return new w1();
        }
        if (g1Var instanceof r1) {
            promoteSingleToNodeList((r1) g1Var);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + g1Var).toString());
    }

    private final boolean isCancelling(g1 g1Var) {
        return (g1Var instanceof c) && ((c) g1Var).isCancelling();
    }

    private final boolean joinInternal() {
        Object state$kotlinx_coroutines_core;
        do {
            state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
            if (!(state$kotlinx_coroutines_core instanceof g1)) {
                return false;
            }
        } while (startInternal(state$kotlinx_coroutines_core) < 0);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object joinSuspend(kotlin.coroutines.c cVar) {
        kotlin.coroutines.c intercepted;
        Object coroutine_suspended;
        Object coroutine_suspended2;
        intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(cVar);
        o oVar = new o(intercepted, 1);
        oVar.initCancellability();
        q.disposeOnCancellation(oVar, invokeOnCompletion(new b2(oVar)));
        Object result = oVar.getResult();
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        if (result == coroutine_suspended) {
            kotlin.coroutines.jvm.internal.f.probeCoroutineSuspended(cVar);
        }
        coroutine_suspended2 = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        return result == coroutine_suspended2 ? result : y5.w.INSTANCE;
    }

    private final void loop$atomicfu(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, f6.l lVar, Object obj) {
        while (true) {
            lVar.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    private final Void loopOnState(f6.l lVar) {
        while (true) {
            lVar.invoke(getState$kotlinx_coroutines_core());
        }
    }

    private final Object makeCancelling(Object obj) {
        kotlinx.coroutines.internal.g0 g0Var;
        kotlinx.coroutines.internal.g0 g0Var2;
        kotlinx.coroutines.internal.g0 g0Var3;
        kotlinx.coroutines.internal.g0 g0Var4;
        kotlinx.coroutines.internal.g0 g0Var5;
        kotlinx.coroutines.internal.g0 g0Var6;
        Throwable th = null;
        while (true) {
            Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
            if (state$kotlinx_coroutines_core instanceof c) {
                synchronized (state$kotlinx_coroutines_core) {
                    if (((c) state$kotlinx_coroutines_core).isSealed()) {
                        g0Var2 = s1.TOO_LATE_TO_CANCEL;
                        return g0Var2;
                    }
                    boolean isCancelling = ((c) state$kotlinx_coroutines_core).isCancelling();
                    if (obj != null || !isCancelling) {
                        if (th == null) {
                            th = createCauseException(obj);
                        }
                        ((c) state$kotlinx_coroutines_core).addExceptionLocked(th);
                    }
                    Throwable rootCause = isCancelling ^ true ? ((c) state$kotlinx_coroutines_core).getRootCause() : null;
                    if (rootCause != null) {
                        notifyCancelling(((c) state$kotlinx_coroutines_core).getList(), rootCause);
                    }
                    g0Var = s1.COMPLETING_ALREADY;
                    return g0Var;
                }
            }
            if (!(state$kotlinx_coroutines_core instanceof g1)) {
                g0Var3 = s1.TOO_LATE_TO_CANCEL;
                return g0Var3;
            }
            if (th == null) {
                th = createCauseException(obj);
            }
            g1 g1Var = (g1) state$kotlinx_coroutines_core;
            if (!g1Var.isActive()) {
                Object tryMakeCompleting = tryMakeCompleting(state$kotlinx_coroutines_core, new b0(th, false, 2, null));
                g0Var5 = s1.COMPLETING_ALREADY;
                if (tryMakeCompleting == g0Var5) {
                    throw new IllegalStateException(("Cannot happen in " + state$kotlinx_coroutines_core).toString());
                }
                g0Var6 = s1.COMPLETING_RETRY;
                if (tryMakeCompleting != g0Var6) {
                    return tryMakeCompleting;
                }
            } else if (tryMakeCancelling(g1Var, th)) {
                g0Var4 = s1.COMPLETING_ALREADY;
                return g0Var4;
            }
        }
    }

    private final r1 makeNode(f6.l lVar, boolean z7) {
        r1 r1Var;
        if (z7) {
            r1Var = lVar instanceof m1 ? (m1) lVar : null;
            if (r1Var == null) {
                r1Var = new j1(lVar);
            }
        } else {
            r1Var = lVar instanceof r1 ? (r1) lVar : null;
            if (r1Var == null) {
                r1Var = new k1(lVar);
            }
        }
        r1Var.setJob(this);
        return r1Var;
    }

    private final u nextChild(LockFreeLinkedListNode lockFreeLinkedListNode) {
        while (lockFreeLinkedListNode.isRemoved()) {
            lockFreeLinkedListNode = lockFreeLinkedListNode.getPrevNode();
        }
        while (true) {
            lockFreeLinkedListNode = lockFreeLinkedListNode.getNextNode();
            if (!lockFreeLinkedListNode.isRemoved()) {
                if (lockFreeLinkedListNode instanceof u) {
                    return (u) lockFreeLinkedListNode;
                }
                if (lockFreeLinkedListNode instanceof w1) {
                    return null;
                }
            }
        }
    }

    private final void notifyCancelling(w1 w1Var, Throwable th) {
        onCancelling(th);
        Object next = w1Var.getNext();
        kotlin.jvm.internal.s.checkNotNull(next, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        CompletionHandlerException completionHandlerException = null;
        for (LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode) next; !kotlin.jvm.internal.s.areEqual(lockFreeLinkedListNode, w1Var); lockFreeLinkedListNode = lockFreeLinkedListNode.getNextNode()) {
            if (lockFreeLinkedListNode instanceof m1) {
                r1 r1Var = (r1) lockFreeLinkedListNode;
                try {
                    r1Var.invoke(th);
                } catch (Throwable th2) {
                    if (completionHandlerException != null) {
                        y5.b.addSuppressed(completionHandlerException, th2);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + r1Var + " for " + this, th2);
                        y5.w wVar = y5.w.INSTANCE;
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            handleOnCompletionException$kotlinx_coroutines_core(completionHandlerException);
        }
        cancelParent(th);
    }

    private final void notifyCompletion(w1 w1Var, Throwable th) {
        Object next = w1Var.getNext();
        kotlin.jvm.internal.s.checkNotNull(next, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        CompletionHandlerException completionHandlerException = null;
        for (LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode) next; !kotlin.jvm.internal.s.areEqual(lockFreeLinkedListNode, w1Var); lockFreeLinkedListNode = lockFreeLinkedListNode.getNextNode()) {
            if (lockFreeLinkedListNode instanceof r1) {
                r1 r1Var = (r1) lockFreeLinkedListNode;
                try {
                    r1Var.invoke(th);
                } catch (Throwable th2) {
                    if (completionHandlerException != null) {
                        y5.b.addSuppressed(completionHandlerException, th2);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + r1Var + " for " + this, th2);
                        y5.w wVar = y5.w.INSTANCE;
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            handleOnCompletionException$kotlinx_coroutines_core(completionHandlerException);
        }
    }

    private final /* synthetic */ <T extends r1> void notifyHandlers(w1 w1Var, Throwable th) {
        Object next = w1Var.getNext();
        kotlin.jvm.internal.s.checkNotNull(next, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        CompletionHandlerException completionHandlerException = null;
        for (LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode) next; !kotlin.jvm.internal.s.areEqual(lockFreeLinkedListNode, w1Var); lockFreeLinkedListNode = lockFreeLinkedListNode.getNextNode()) {
            kotlin.jvm.internal.s.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
            if (lockFreeLinkedListNode instanceof LockFreeLinkedListNode) {
                r1 r1Var = (r1) lockFreeLinkedListNode;
                try {
                    r1Var.invoke(th);
                } catch (Throwable th2) {
                    if (completionHandlerException != null) {
                        y5.b.addSuppressed(completionHandlerException, th2);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + r1Var + " for " + this, th2);
                        y5.w wVar = y5.w.INSTANCE;
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            handleOnCompletionException$kotlinx_coroutines_core(completionHandlerException);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object onAwaitInternalProcessResFunc(Object obj, Object obj2) {
        if (obj2 instanceof b0) {
            throw ((b0) obj2).cause;
        }
        return obj2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onAwaitInternalRegFunc(kotlinx.coroutines.selects.j jVar, Object obj) {
        Object state$kotlinx_coroutines_core;
        do {
            state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
            if (!(state$kotlinx_coroutines_core instanceof g1)) {
                if (!(state$kotlinx_coroutines_core instanceof b0)) {
                    state$kotlinx_coroutines_core = s1.unboxState(state$kotlinx_coroutines_core);
                }
                jVar.selectInRegistrationPhase(state$kotlinx_coroutines_core);
                return;
            }
        } while (startInternal(state$kotlinx_coroutines_core) < 0);
        jVar.disposeOnCompletion(invokeOnCompletion(new d(jVar)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [kotlinx.coroutines.f1] */
    private final void promoteEmptyToNodeList(x0 x0Var) {
        w1 w1Var = new w1();
        if (!x0Var.isActive()) {
            w1Var = new f1(w1Var);
        }
        androidx.concurrent.futures.a.a(_state$FU, this, x0Var, w1Var);
    }

    private final void promoteSingleToNodeList(r1 r1Var) {
        r1Var.addOneIfEmpty(new w1());
        androidx.concurrent.futures.a.a(_state$FU, this, r1Var, r1Var.getNextNode());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void registerSelectForOnJoin(kotlinx.coroutines.selects.j jVar, Object obj) {
        if (joinInternal()) {
            jVar.disposeOnCompletion(invokeOnCompletion(new e(jVar)));
        } else {
            jVar.selectInRegistrationPhase(y5.w.INSTANCE);
        }
    }

    private final int startInternal(Object obj) {
        x0 x0Var;
        if (!(obj instanceof x0)) {
            if (!(obj instanceof f1)) {
                return 0;
            }
            if (!androidx.concurrent.futures.a.a(_state$FU, this, obj, ((f1) obj).getList())) {
                return -1;
            }
            onStart();
            return 1;
        }
        if (((x0) obj).isActive()) {
            return 0;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _state$FU;
        x0Var = s1.EMPTY_ACTIVE;
        if (!androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, obj, x0Var)) {
            return -1;
        }
        onStart();
        return 1;
    }

    private final String stateString(Object obj) {
        if (!(obj instanceof c)) {
            return obj instanceof g1 ? ((g1) obj).isActive() ? "Active" : "New" : obj instanceof b0 ? "Cancelled" : "Completed";
        }
        c cVar = (c) obj;
        return cVar.isCancelling() ? "Cancelling" : cVar.isCompleting() ? "Completing" : "Active";
    }

    public static /* synthetic */ CancellationException toCancellationException$default(JobSupport jobSupport, Throwable th, String str, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
        }
        if ((i8 & 1) != 0) {
            str = null;
        }
        return jobSupport.toCancellationException(th, str);
    }

    private final boolean tryFinalizeSimpleState(g1 g1Var, Object obj) {
        if (!androidx.concurrent.futures.a.a(_state$FU, this, g1Var, s1.boxIncomplete(obj))) {
            return false;
        }
        onCancelling(null);
        onCompletionInternal(obj);
        completeStateFinalization(g1Var, obj);
        return true;
    }

    private final boolean tryMakeCancelling(g1 g1Var, Throwable th) {
        w1 orPromoteCancellingList = getOrPromoteCancellingList(g1Var);
        if (orPromoteCancellingList == null) {
            return false;
        }
        if (!androidx.concurrent.futures.a.a(_state$FU, this, g1Var, new c(orPromoteCancellingList, false, th))) {
            return false;
        }
        notifyCancelling(orPromoteCancellingList, th);
        return true;
    }

    private final Object tryMakeCompleting(Object obj, Object obj2) {
        kotlinx.coroutines.internal.g0 g0Var;
        kotlinx.coroutines.internal.g0 g0Var2;
        if (!(obj instanceof g1)) {
            g0Var2 = s1.COMPLETING_ALREADY;
            return g0Var2;
        }
        if ((!(obj instanceof x0) && !(obj instanceof r1)) || (obj instanceof u) || (obj2 instanceof b0)) {
            return tryMakeCompletingSlowPath((g1) obj, obj2);
        }
        if (tryFinalizeSimpleState((g1) obj, obj2)) {
            return obj2;
        }
        g0Var = s1.COMPLETING_RETRY;
        return g0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v2 */
    private final Object tryMakeCompletingSlowPath(g1 g1Var, Object obj) {
        kotlinx.coroutines.internal.g0 g0Var;
        kotlinx.coroutines.internal.g0 g0Var2;
        kotlinx.coroutines.internal.g0 g0Var3;
        w1 orPromoteCancellingList = getOrPromoteCancellingList(g1Var);
        if (orPromoteCancellingList == null) {
            g0Var3 = s1.COMPLETING_RETRY;
            return g0Var3;
        }
        c cVar = g1Var instanceof c ? (c) g1Var : null;
        if (cVar == null) {
            cVar = new c(orPromoteCancellingList, false, null);
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        synchronized (cVar) {
            if (cVar.isCompleting()) {
                g0Var2 = s1.COMPLETING_ALREADY;
                return g0Var2;
            }
            cVar.setCompleting(true);
            if (cVar != g1Var && !androidx.concurrent.futures.a.a(_state$FU, this, g1Var, cVar)) {
                g0Var = s1.COMPLETING_RETRY;
                return g0Var;
            }
            boolean isCancelling = cVar.isCancelling();
            b0 b0Var = obj instanceof b0 ? (b0) obj : null;
            if (b0Var != null) {
                cVar.addExceptionLocked(b0Var.cause);
            }
            ?? rootCause = Boolean.valueOf(true ^ isCancelling).booleanValue() ? cVar.getRootCause() : 0;
            ref$ObjectRef.element = rootCause;
            y5.w wVar = y5.w.INSTANCE;
            if (rootCause != 0) {
                notifyCancelling(orPromoteCancellingList, rootCause);
            }
            u firstChild = firstChild(g1Var);
            return (firstChild == null || !tryWaitForChild(cVar, firstChild, obj)) ? finalizeFinishingState(cVar, obj) : s1.COMPLETING_WAITING_CHILDREN;
        }
    }

    private final boolean tryWaitForChild(c cVar, u uVar, Object obj) {
        while (l1.a.invokeOnCompletion$default(uVar.childJob, false, false, new b(this, cVar, uVar, obj), 1, null) == x1.INSTANCE) {
            uVar = nextChild(uVar);
            if (uVar == null) {
                return false;
            }
        }
        return true;
    }

    protected void afterCompletion(Object obj) {
    }

    @Override // kotlinx.coroutines.l1
    public final t attachChild(v vVar) {
        u0 invokeOnCompletion$default = l1.a.invokeOnCompletion$default(this, true, false, new u(vVar), 2, null);
        kotlin.jvm.internal.s.checkNotNull(invokeOnCompletion$default, "null cannot be cast to non-null type kotlinx.coroutines.ChildHandle");
        return (t) invokeOnCompletion$default;
    }

    protected final Object awaitInternal(kotlin.coroutines.c cVar) {
        Object state$kotlinx_coroutines_core;
        do {
            state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
            if (!(state$kotlinx_coroutines_core instanceof g1)) {
                if (state$kotlinx_coroutines_core instanceof b0) {
                    throw ((b0) state$kotlinx_coroutines_core).cause;
                }
                return s1.unboxState(state$kotlinx_coroutines_core);
            }
        } while (startInternal(state$kotlinx_coroutines_core) < 0);
        return awaitSuspend(cVar);
    }

    @Override // kotlinx.coroutines.l1
    public /* synthetic */ void cancel() {
        cancel((CancellationException) null);
    }

    public final boolean cancelCoroutine(Throwable th) {
        return cancelImpl$kotlinx_coroutines_core(th);
    }

    public final boolean cancelImpl$kotlinx_coroutines_core(Object obj) {
        Object obj2;
        kotlinx.coroutines.internal.g0 g0Var;
        kotlinx.coroutines.internal.g0 g0Var2;
        kotlinx.coroutines.internal.g0 g0Var3;
        obj2 = s1.COMPLETING_ALREADY;
        if (getOnCancelComplete$kotlinx_coroutines_core() && (obj2 = cancelMakeCompleting(obj)) == s1.COMPLETING_WAITING_CHILDREN) {
            return true;
        }
        g0Var = s1.COMPLETING_ALREADY;
        if (obj2 == g0Var) {
            obj2 = makeCancelling(obj);
        }
        g0Var2 = s1.COMPLETING_ALREADY;
        if (obj2 == g0Var2 || obj2 == s1.COMPLETING_WAITING_CHILDREN) {
            return true;
        }
        g0Var3 = s1.TOO_LATE_TO_CANCEL;
        if (obj2 == g0Var3) {
            return false;
        }
        afterCompletion(obj2);
        return true;
    }

    public void cancelInternal(Throwable th) {
        cancelImpl$kotlinx_coroutines_core(th);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String cancellationExceptionMessage() {
        return "Job was cancelled";
    }

    public boolean childCancelled(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return cancelImpl$kotlinx_coroutines_core(th) && getHandlesException$kotlinx_coroutines_core();
    }

    public final JobCancellationException defaultCancellationException$kotlinx_coroutines_core(String str, Throwable th) {
        if (str == null) {
            str = cancellationExceptionMessage();
        }
        return new JobCancellationException(str, th, this);
    }

    @Override // kotlinx.coroutines.l1, kotlin.coroutines.CoroutineContext.a, kotlin.coroutines.CoroutineContext
    public <R> R fold(R r8, f6.p pVar) {
        return (R) l1.a.fold(this, r8, pVar);
    }

    @Override // kotlinx.coroutines.l1, kotlin.coroutines.CoroutineContext.a, kotlin.coroutines.CoroutineContext
    public <E extends CoroutineContext.a> E get(CoroutineContext.b bVar) {
        return (E) l1.a.get(this, bVar);
    }

    @Override // kotlinx.coroutines.l1
    public final CancellationException getCancellationException() {
        Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        if (!(state$kotlinx_coroutines_core instanceof c)) {
            if (state$kotlinx_coroutines_core instanceof g1) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (state$kotlinx_coroutines_core instanceof b0) {
                return toCancellationException$default(this, ((b0) state$kotlinx_coroutines_core).cause, null, 1, null);
            }
            return new JobCancellationException(k0.getClassSimpleName(this) + " has completed normally", null, this);
        }
        Throwable rootCause = ((c) state$kotlinx_coroutines_core).getRootCause();
        if (rootCause != null) {
            CancellationException cancellationException = toCancellationException(rootCause, k0.getClassSimpleName(this) + " is cancelling");
            if (cancellationException != null) {
                return cancellationException;
            }
        }
        throw new IllegalStateException(("Job is still new or active: " + this).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    @Override // kotlinx.coroutines.z1
    public CancellationException getChildJobCancellationCause() {
        CancellationException cancellationException;
        Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        if (state$kotlinx_coroutines_core instanceof c) {
            cancellationException = ((c) state$kotlinx_coroutines_core).getRootCause();
        } else if (state$kotlinx_coroutines_core instanceof b0) {
            cancellationException = ((b0) state$kotlinx_coroutines_core).cause;
        } else {
            if (state$kotlinx_coroutines_core instanceof g1) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + state$kotlinx_coroutines_core).toString());
            }
            cancellationException = null;
        }
        CancellationException cancellationException2 = cancellationException instanceof CancellationException ? cancellationException : null;
        if (cancellationException2 != null) {
            return cancellationException2;
        }
        return new JobCancellationException("Parent job is " + stateString(state$kotlinx_coroutines_core), cancellationException, this);
    }

    @Override // kotlinx.coroutines.l1
    public final kotlin.sequences.m getChildren() {
        return kotlin.sequences.q.sequence(new JobSupport$children$1(this, null));
    }

    public final Object getCompletedInternal$kotlinx_coroutines_core() {
        Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        if (!(!(state$kotlinx_coroutines_core instanceof g1))) {
            throw new IllegalStateException("This job has not completed yet".toString());
        }
        if (state$kotlinx_coroutines_core instanceof b0) {
            throw ((b0) state$kotlinx_coroutines_core).cause;
        }
        return s1.unboxState(state$kotlinx_coroutines_core);
    }

    protected final Throwable getCompletionCause() {
        Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        if (state$kotlinx_coroutines_core instanceof c) {
            Throwable rootCause = ((c) state$kotlinx_coroutines_core).getRootCause();
            if (rootCause != null) {
                return rootCause;
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        if (!(state$kotlinx_coroutines_core instanceof g1)) {
            if (state$kotlinx_coroutines_core instanceof b0) {
                return ((b0) state$kotlinx_coroutines_core).cause;
            }
            return null;
        }
        throw new IllegalStateException(("Job is still new or active: " + this).toString());
    }

    protected final boolean getCompletionCauseHandled() {
        Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        return (state$kotlinx_coroutines_core instanceof b0) && ((b0) state$kotlinx_coroutines_core).getHandled();
    }

    public final Throwable getCompletionExceptionOrNull() {
        Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        if (!(state$kotlinx_coroutines_core instanceof g1)) {
            return getExceptionOrNull(state$kotlinx_coroutines_core);
        }
        throw new IllegalStateException("This job has not completed yet".toString());
    }

    public boolean getHandlesException$kotlinx_coroutines_core() {
        return true;
    }

    @Override // kotlinx.coroutines.l1, kotlin.coroutines.CoroutineContext.a
    public final CoroutineContext.b getKey() {
        return l1.Key;
    }

    protected final kotlinx.coroutines.selects.e getOnAwaitInternal() {
        JobSupport$onAwaitInternal$1 jobSupport$onAwaitInternal$1 = JobSupport$onAwaitInternal$1.INSTANCE;
        kotlin.jvm.internal.s.checkNotNull(jobSupport$onAwaitInternal$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        f6.q qVar = (f6.q) kotlin.jvm.internal.x.beforeCheckcastToFunctionOfArity(jobSupport$onAwaitInternal$1, 3);
        JobSupport$onAwaitInternal$2 jobSupport$onAwaitInternal$2 = JobSupport$onAwaitInternal$2.INSTANCE;
        kotlin.jvm.internal.s.checkNotNull(jobSupport$onAwaitInternal$2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'param')] kotlin.Any?, @[ParameterName(name = 'clauseResult')] kotlin.Any?, kotlin.Any?>{ kotlinx.coroutines.selects.SelectKt.ProcessResultFunction }");
        return new kotlinx.coroutines.selects.f(this, qVar, (f6.q) kotlin.jvm.internal.x.beforeCheckcastToFunctionOfArity(jobSupport$onAwaitInternal$2, 3), null, 8, null);
    }

    public boolean getOnCancelComplete$kotlinx_coroutines_core() {
        return false;
    }

    @Override // kotlinx.coroutines.l1
    public final kotlinx.coroutines.selects.c getOnJoin() {
        JobSupport$onJoin$1 jobSupport$onJoin$1 = JobSupport$onJoin$1.INSTANCE;
        kotlin.jvm.internal.s.checkNotNull(jobSupport$onJoin$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        return new kotlinx.coroutines.selects.d(this, (f6.q) kotlin.jvm.internal.x.beforeCheckcastToFunctionOfArity(jobSupport$onJoin$1, 3), null, 4, null);
    }

    @Override // kotlinx.coroutines.l1
    public l1 getParent() {
        t parentHandle$kotlinx_coroutines_core = getParentHandle$kotlinx_coroutines_core();
        if (parentHandle$kotlinx_coroutines_core != null) {
            return parentHandle$kotlinx_coroutines_core.getParent();
        }
        return null;
    }

    public final t getParentHandle$kotlinx_coroutines_core() {
        return (t) _parentHandle$FU.get(this);
    }

    public final Object getState$kotlinx_coroutines_core() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _state$FU;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof kotlinx.coroutines.internal.z)) {
                return obj;
            }
            ((kotlinx.coroutines.internal.z) obj).perform(this);
        }
    }

    protected boolean handleJobException(Throwable th) {
        return false;
    }

    protected final void initParentJob(l1 l1Var) {
        if (l1Var == null) {
            setParentHandle$kotlinx_coroutines_core(x1.INSTANCE);
            return;
        }
        l1Var.start();
        t attachChild = l1Var.attachChild(this);
        setParentHandle$kotlinx_coroutines_core(attachChild);
        if (isCompleted()) {
            attachChild.dispose();
            setParentHandle$kotlinx_coroutines_core(x1.INSTANCE);
        }
    }

    @Override // kotlinx.coroutines.l1
    public final u0 invokeOnCompletion(f6.l lVar) {
        return invokeOnCompletion(false, true, lVar);
    }

    @Override // kotlinx.coroutines.l1
    public boolean isActive() {
        Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        return (state$kotlinx_coroutines_core instanceof g1) && ((g1) state$kotlinx_coroutines_core).isActive();
    }

    @Override // kotlinx.coroutines.l1
    public final boolean isCancelled() {
        Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        return (state$kotlinx_coroutines_core instanceof b0) || ((state$kotlinx_coroutines_core instanceof c) && ((c) state$kotlinx_coroutines_core).isCancelling());
    }

    @Override // kotlinx.coroutines.l1
    public final boolean isCompleted() {
        return !(getState$kotlinx_coroutines_core() instanceof g1);
    }

    public final boolean isCompletedExceptionally() {
        return getState$kotlinx_coroutines_core() instanceof b0;
    }

    protected boolean isScopedCoroutine() {
        return false;
    }

    @Override // kotlinx.coroutines.l1
    public final Object join(kotlin.coroutines.c cVar) {
        Object coroutine_suspended;
        if (!joinInternal()) {
            o1.ensureActive(cVar.getContext());
            return y5.w.INSTANCE;
        }
        Object joinSuspend = joinSuspend(cVar);
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        return joinSuspend == coroutine_suspended ? joinSuspend : y5.w.INSTANCE;
    }

    public final boolean makeCompleting$kotlinx_coroutines_core(Object obj) {
        Object tryMakeCompleting;
        kotlinx.coroutines.internal.g0 g0Var;
        kotlinx.coroutines.internal.g0 g0Var2;
        do {
            tryMakeCompleting = tryMakeCompleting(getState$kotlinx_coroutines_core(), obj);
            g0Var = s1.COMPLETING_ALREADY;
            if (tryMakeCompleting == g0Var) {
                return false;
            }
            if (tryMakeCompleting == s1.COMPLETING_WAITING_CHILDREN) {
                return true;
            }
            g0Var2 = s1.COMPLETING_RETRY;
        } while (tryMakeCompleting == g0Var2);
        afterCompletion(tryMakeCompleting);
        return true;
    }

    public final Object makeCompletingOnce$kotlinx_coroutines_core(Object obj) {
        Object tryMakeCompleting;
        kotlinx.coroutines.internal.g0 g0Var;
        kotlinx.coroutines.internal.g0 g0Var2;
        do {
            tryMakeCompleting = tryMakeCompleting(getState$kotlinx_coroutines_core(), obj);
            g0Var = s1.COMPLETING_ALREADY;
            if (tryMakeCompleting == g0Var) {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, getExceptionOrNull(obj));
            }
            g0Var2 = s1.COMPLETING_RETRY;
        } while (tryMakeCompleting == g0Var2);
        return tryMakeCompleting;
    }

    @Override // kotlinx.coroutines.l1, kotlin.coroutines.CoroutineContext.a, kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.b bVar) {
        return l1.a.minusKey(this, bVar);
    }

    public String nameString$kotlinx_coroutines_core() {
        return k0.getClassSimpleName(this);
    }

    protected void onCancelling(Throwable th) {
    }

    protected void onCompletionInternal(Object obj) {
    }

    protected void onStart() {
    }

    @Override // kotlinx.coroutines.v
    public final void parentCancelled(z1 z1Var) {
        cancelImpl$kotlinx_coroutines_core(z1Var);
    }

    @Override // kotlinx.coroutines.l1, kotlin.coroutines.CoroutineContext.a, kotlin.coroutines.CoroutineContext
    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return l1.a.plus(this, coroutineContext);
    }

    public final void removeNode$kotlinx_coroutines_core(r1 r1Var) {
        Object state$kotlinx_coroutines_core;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        x0 x0Var;
        do {
            state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
            if (!(state$kotlinx_coroutines_core instanceof r1)) {
                if (!(state$kotlinx_coroutines_core instanceof g1) || ((g1) state$kotlinx_coroutines_core).getList() == null) {
                    return;
                }
                r1Var.mo1292remove();
                return;
            }
            if (state$kotlinx_coroutines_core != r1Var) {
                return;
            }
            atomicReferenceFieldUpdater = _state$FU;
            x0Var = s1.EMPTY_ACTIVE;
        } while (!androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, state$kotlinx_coroutines_core, x0Var));
    }

    public final void setParentHandle$kotlinx_coroutines_core(t tVar) {
        _parentHandle$FU.set(this, tVar);
    }

    @Override // kotlinx.coroutines.l1
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

    protected final CancellationException toCancellationException(Throwable th, String str) {
        CancellationException cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        if (cancellationException == null) {
            if (str == null) {
                str = cancellationExceptionMessage();
            }
            cancellationException = new JobCancellationException(str, th, this);
        }
        return cancellationException;
    }

    public final String toDebugString() {
        return nameString$kotlinx_coroutines_core() + '{' + stateString(getState$kotlinx_coroutines_core()) + '}';
    }

    public String toString() {
        return toDebugString() + '@' + k0.getHexAddress(this);
    }

    @Override // kotlinx.coroutines.l1
    public /* synthetic */ boolean cancel(Throwable th) {
        Throwable jobCancellationException;
        if (th == null || (jobCancellationException = toCancellationException$default(this, th, null, 1, null)) == null) {
            jobCancellationException = new JobCancellationException(cancellationExceptionMessage(), null, this);
        }
        cancelInternal(jobCancellationException);
        return true;
    }

    @Override // kotlinx.coroutines.l1
    public final u0 invokeOnCompletion(boolean z7, boolean z8, f6.l lVar) {
        r1 makeNode = makeNode(lVar, z7);
        while (true) {
            Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
            if (state$kotlinx_coroutines_core instanceof x0) {
                x0 x0Var = (x0) state$kotlinx_coroutines_core;
                if (!x0Var.isActive()) {
                    promoteEmptyToNodeList(x0Var);
                } else if (androidx.concurrent.futures.a.a(_state$FU, this, state$kotlinx_coroutines_core, makeNode)) {
                    return makeNode;
                }
            } else {
                if (!(state$kotlinx_coroutines_core instanceof g1)) {
                    if (z8) {
                        b0 b0Var = state$kotlinx_coroutines_core instanceof b0 ? (b0) state$kotlinx_coroutines_core : null;
                        lVar.invoke(b0Var != null ? b0Var.cause : null);
                    }
                    return x1.INSTANCE;
                }
                w1 list = ((g1) state$kotlinx_coroutines_core).getList();
                if (list == null) {
                    kotlin.jvm.internal.s.checkNotNull(state$kotlinx_coroutines_core, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    promoteSingleToNodeList((r1) state$kotlinx_coroutines_core);
                } else {
                    u0 u0Var = x1.INSTANCE;
                    if (z7 && (state$kotlinx_coroutines_core instanceof c)) {
                        synchronized (state$kotlinx_coroutines_core) {
                            try {
                                r3 = ((c) state$kotlinx_coroutines_core).getRootCause();
                                if (r3 != null) {
                                    if ((lVar instanceof u) && !((c) state$kotlinx_coroutines_core).isCompleting()) {
                                    }
                                    y5.w wVar = y5.w.INSTANCE;
                                }
                                if (addLastAtomic(state$kotlinx_coroutines_core, list, makeNode)) {
                                    if (r3 == null) {
                                        return makeNode;
                                    }
                                    u0Var = makeNode;
                                    y5.w wVar2 = y5.w.INSTANCE;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    if (r3 != null) {
                        if (z8) {
                            lVar.invoke(r3);
                        }
                        return u0Var;
                    }
                    if (addLastAtomic(state$kotlinx_coroutines_core, list, makeNode)) {
                        return makeNode;
                    }
                }
            }
        }
    }

    @Override // kotlinx.coroutines.l1
    public l1 plus(l1 l1Var) {
        return l1.a.plus((l1) this, l1Var);
    }

    @Override // kotlinx.coroutines.l1
    public void cancel(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(cancellationExceptionMessage(), null, this);
        }
        cancelInternal(cancellationException);
    }

    public void handleOnCompletionException$kotlinx_coroutines_core(Throwable th) {
        throw th;
    }
}
