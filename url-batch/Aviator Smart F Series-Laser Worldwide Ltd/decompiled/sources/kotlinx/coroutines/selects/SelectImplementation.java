package kotlinx.coroutines.selects;

import com.baidu.location.LocationConst;
import f6.p;
import f6.q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.internal.d0;
import kotlinx.coroutines.internal.g0;
import kotlinx.coroutines.l;
import kotlinx.coroutines.n;
import kotlinx.coroutines.o;
import kotlinx.coroutines.selects.b;
import kotlinx.coroutines.u0;
import y5.w;

/* loaded from: classes5.dex */
public class SelectImplementation extends l implements b, k {
    private static final AtomicReferenceFieldUpdater state$FU = AtomicReferenceFieldUpdater.newUpdater(SelectImplementation.class, Object.class, LocationConst.HDYawConst.KEY_HD_YAW_STATE);
    private List<kotlinx.coroutines.selects.SelectImplementation.a> clauses;
    private final CoroutineContext context;
    private Object disposableHandleOrSegment;
    private int indexInSegment;
    private Object internalResult;
    private volatile Object state;

    public final class a {
        private final Object block;
        public final Object clauseObject;
        public Object disposableHandleOrSegment;
        public int indexInSegment = -1;
        public final q onCancellationConstructor;
        private final Object param;
        private final q processResFunc;
        private final q regFunc;

        public a(Object obj, q qVar, q qVar2, Object obj2, Object obj3, q qVar3) {
            this.clauseObject = obj;
            this.regFunc = qVar;
            this.processResFunc = qVar2;
            this.param = obj2;
            this.block = obj3;
            this.onCancellationConstructor = qVar3;
        }

        public final f6.l createOnCancellationAction(j jVar, Object obj) {
            q qVar = this.onCancellationConstructor;
            if (qVar != null) {
                return (f6.l) qVar.invoke(jVar, this.param, obj);
            }
            return null;
        }

        public final void dispose() {
            Object obj = this.disposableHandleOrSegment;
            SelectImplementation selectImplementation = SelectImplementation.this;
            if (obj instanceof d0) {
                ((d0) obj).onCancellation(this.indexInSegment, null, selectImplementation.getContext());
                return;
            }
            u0 u0Var = obj instanceof u0 ? (u0) obj : null;
            if (u0Var != null) {
                u0Var.dispose();
            }
        }

        public final Object invokeBlock(Object obj, kotlin.coroutines.c cVar) {
            Object obj2 = this.block;
            if (this.param == SelectKt.getPARAM_CLAUSE_0()) {
                s.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.coroutines.SuspendFunction0<R of kotlinx.coroutines.selects.SelectImplementation>");
                return ((f6.l) obj2).invoke(cVar);
            }
            s.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.coroutines.SuspendFunction1<kotlin.Any?, R of kotlinx.coroutines.selects.SelectImplementation>");
            return ((p) obj2).invoke(obj, cVar);
        }

        public final Object processResult(Object obj) {
            return this.processResFunc.invoke(this.clauseObject, this.param, obj);
        }

        public final boolean tryRegisterAsWaiter(SelectImplementation selectImplementation) {
            g0 g0Var;
            this.regFunc.invoke(this.clauseObject, selectImplementation, this.param);
            Object obj = selectImplementation.internalResult;
            g0Var = SelectKt.NO_RESULT;
            return obj == g0Var;
        }
    }

    public SelectImplementation(CoroutineContext coroutineContext) {
        g0 g0Var;
        g0 g0Var2;
        this.context = coroutineContext;
        g0Var = SelectKt.STATE_REG;
        this.state = g0Var;
        this.clauses = new ArrayList(2);
        this.indexInSegment = -1;
        g0Var2 = SelectKt.NO_RESULT;
        this.internalResult = g0Var2;
    }

    private final void checkClauseObject(Object obj) {
        List<kotlinx.coroutines.selects.SelectImplementation.a> list = this.clauses;
        s.checkNotNull(list);
        List<kotlinx.coroutines.selects.SelectImplementation.a> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return;
        }
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            if (((a) it.next()).clauseObject == obj) {
                throw new IllegalStateException(("Cannot use select clauses on the same object: " + obj).toString());
            }
        }
    }

    private final void cleanup(kotlinx.coroutines.selects.SelectImplementation.a aVar) {
        g0 g0Var;
        g0 g0Var2;
        List<kotlinx.coroutines.selects.SelectImplementation.a> list = this.clauses;
        if (list == null) {
            return;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            a aVar2 = (a) it.next();
            if (aVar2 != aVar) {
                aVar2.dispose();
            }
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = state$FU;
        g0Var = SelectKt.STATE_COMPLETED;
        atomicReferenceFieldUpdater.set(this, g0Var);
        g0Var2 = SelectKt.NO_RESULT;
        this.internalResult = g0Var2;
        this.clauses = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object complete(kotlin.coroutines.c cVar) {
        Object obj = state$FU.get(this);
        s.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation.ClauseData<R of kotlinx.coroutines.selects.SelectImplementation>");
        a aVar = (a) obj;
        Object obj2 = this.internalResult;
        cleanup(aVar);
        return aVar.invokeBlock(aVar.processResult(obj2), cVar);
    }

    static /* synthetic */ <R> Object doSelect$suspendImpl(SelectImplementation selectImplementation, kotlin.coroutines.c cVar) {
        return selectImplementation.isSelected() ? selectImplementation.complete(cVar) : selectImplementation.doSelectSuspend(cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0057 A[PHI: r6
      0x0057: PHI (r6v5 java.lang.Object) = (r6v4 java.lang.Object), (r6v1 java.lang.Object) binds: [B:17:0x0054, B:10:0x0028] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object doSelectSuspend(kotlin.coroutines.c cVar) {
        SelectImplementation$doSelectSuspend$1 selectImplementation$doSelectSuspend$1;
        Object coroutine_suspended;
        int i8;
        SelectImplementation selectImplementation;
        if (cVar instanceof SelectImplementation$doSelectSuspend$1) {
            selectImplementation$doSelectSuspend$1 = (SelectImplementation$doSelectSuspend$1) cVar;
            int i9 = selectImplementation$doSelectSuspend$1.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                selectImplementation$doSelectSuspend$1.label = i9 - Integer.MIN_VALUE;
                Object obj = selectImplementation$doSelectSuspend$1.result;
                coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                i8 = selectImplementation$doSelectSuspend$1.label;
                if (i8 != 0) {
                    y5.g.throwOnFailure(obj);
                    selectImplementation$doSelectSuspend$1.L$0 = this;
                    selectImplementation$doSelectSuspend$1.label = 1;
                    if (waitUntilSelected(selectImplementation$doSelectSuspend$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    selectImplementation = this;
                } else {
                    if (i8 != 1) {
                        if (i8 == 2) {
                            y5.g.throwOnFailure(obj);
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    selectImplementation = (SelectImplementation) selectImplementation$doSelectSuspend$1.L$0;
                    y5.g.throwOnFailure(obj);
                }
                selectImplementation$doSelectSuspend$1.L$0 = null;
                selectImplementation$doSelectSuspend$1.label = 2;
                obj = selectImplementation.complete(selectImplementation$doSelectSuspend$1);
                return obj != coroutine_suspended ? coroutine_suspended : obj;
            }
        }
        selectImplementation$doSelectSuspend$1 = new SelectImplementation$doSelectSuspend$1(this, cVar);
        Object obj2 = selectImplementation$doSelectSuspend$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        i8 = selectImplementation$doSelectSuspend$1.label;
        if (i8 != 0) {
        }
        selectImplementation$doSelectSuspend$1.L$0 = null;
        selectImplementation$doSelectSuspend$1.label = 2;
        obj2 = selectImplementation.complete(selectImplementation$doSelectSuspend$1);
        if (obj2 != coroutine_suspended) {
        }
    }

    private final kotlinx.coroutines.selects.SelectImplementation.a findClause(Object obj) {
        List<kotlinx.coroutines.selects.SelectImplementation.a> list = this.clauses;
        Object obj2 = null;
        if (list == null) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((a) next).clauseObject == obj) {
                obj2 = next;
                break;
            }
        }
        a aVar = (a) obj2;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException(("Clause with object " + obj + " is not found").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getInRegistrationPhase() {
        g0 g0Var;
        Object obj = state$FU.get(this);
        g0Var = SelectKt.STATE_REG;
        return obj == g0Var || (obj instanceof List);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isCancelled() {
        g0 g0Var;
        Object obj = state$FU.get(this);
        g0Var = SelectKt.STATE_CANCELLED;
        return obj == g0Var;
    }

    private final boolean isSelected() {
        return state$FU.get(this) instanceof a;
    }

    private final void loop$atomicfu(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, f6.l lVar, Object obj) {
        while (true) {
            lVar.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object processResultAndInvokeBlockRecoveringException(kotlinx.coroutines.selects.SelectImplementation.a aVar, Object obj, kotlin.coroutines.c cVar) {
        SelectImplementation$processResultAndInvokeBlockRecoveringException$1 selectImplementation$processResultAndInvokeBlockRecoveringException$1;
        Object coroutine_suspended;
        int i8;
        if (cVar instanceof SelectImplementation$processResultAndInvokeBlockRecoveringException$1) {
            selectImplementation$processResultAndInvokeBlockRecoveringException$1 = (SelectImplementation$processResultAndInvokeBlockRecoveringException$1) cVar;
            int i9 = selectImplementation$processResultAndInvokeBlockRecoveringException$1.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                selectImplementation$processResultAndInvokeBlockRecoveringException$1.label = i9 - Integer.MIN_VALUE;
                Object obj2 = selectImplementation$processResultAndInvokeBlockRecoveringException$1.result;
                coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                i8 = selectImplementation$processResultAndInvokeBlockRecoveringException$1.label;
                if (i8 != 0) {
                    y5.g.throwOnFailure(obj2);
                    Object processResult = aVar.processResult(obj);
                    selectImplementation$processResultAndInvokeBlockRecoveringException$1.label = 1;
                    obj2 = aVar.invokeBlock(processResult, selectImplementation$processResultAndInvokeBlockRecoveringException$1);
                    if (obj2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y5.g.throwOnFailure(obj2);
                }
                return obj2;
            }
        }
        selectImplementation$processResultAndInvokeBlockRecoveringException$1 = new SelectImplementation$processResultAndInvokeBlockRecoveringException$1(this, cVar);
        Object obj22 = selectImplementation$processResultAndInvokeBlockRecoveringException$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        i8 = selectImplementation$processResultAndInvokeBlockRecoveringException$1.label;
        if (i8 != 0) {
        }
        return obj22;
    }

    public static /* synthetic */ void register$default(SelectImplementation selectImplementation, a aVar, boolean z7, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: register");
        }
        if ((i8 & 1) != 0) {
            z7 = false;
        }
        selectImplementation.register(aVar, z7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void reregisterClause(Object obj) {
        a findClause = findClause(obj);
        s.checkNotNull(findClause);
        findClause.disposableHandleOrSegment = null;
        findClause.indexInSegment = -1;
        register(findClause, true);
    }

    private final int trySelectInternal(Object obj, Object obj2) {
        boolean tryResume;
        g0 g0Var;
        g0 g0Var2;
        g0 g0Var3;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = state$FU;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj3 instanceof n) {
                a findClause = findClause(obj);
                if (findClause == null) {
                    continue;
                } else {
                    f6.l createOnCancellationAction = findClause.createOnCancellationAction(this, obj2);
                    if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, obj3, findClause)) {
                        this.internalResult = obj2;
                        tryResume = SelectKt.tryResume((n) obj3, createOnCancellationAction);
                        if (tryResume) {
                            return 0;
                        }
                        this.internalResult = null;
                        return 2;
                    }
                }
            } else {
                g0Var = SelectKt.STATE_COMPLETED;
                if (s.areEqual(obj3, g0Var) || (obj3 instanceof a)) {
                    return 3;
                }
                g0Var2 = SelectKt.STATE_CANCELLED;
                if (s.areEqual(obj3, g0Var2)) {
                    return 2;
                }
                g0Var3 = SelectKt.STATE_REG;
                if (s.areEqual(obj3, g0Var3)) {
                    if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, obj3, kotlin.collections.q.listOf(obj))) {
                        return 1;
                    }
                } else {
                    if (!(obj3 instanceof List)) {
                        throw new IllegalStateException(("Unexpected state: " + obj3).toString());
                    }
                    if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, obj3, CollectionsKt___CollectionsKt.plus((Collection<? extends Object>) obj3, obj))) {
                        return 1;
                    }
                }
            }
        }
    }

    private final void update$atomicfu(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, f6.l lVar, Object obj) {
        Object obj2;
        do {
            obj2 = atomicReferenceFieldUpdater.get(obj);
        } while (!androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, obj, obj2, lVar.invoke(obj2)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0065, code lost:
    
        r0 = r0.getResult();
        r1 = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006d, code lost:
    
        if (r0 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006f, code lost:
    
        kotlin.coroutines.jvm.internal.f.probeCoroutineSuspended(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0072, code lost:
    
        r6 = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0076, code lost:
    
        if (r0 != r6) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0078, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007b, code lost:
    
        return y5.w.INSTANCE;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object waitUntilSelected(kotlin.coroutines.c cVar) {
        kotlin.coroutines.c intercepted;
        g0 g0Var;
        g0 g0Var2;
        intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(cVar);
        o oVar = new o(intercepted, 1);
        oVar.initCancellability();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = state$FU;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            g0Var = SelectKt.STATE_REG;
            if (obj == g0Var) {
                if (androidx.concurrent.futures.a.a(state$FU, this, obj, oVar)) {
                    oVar.invokeOnCancellation(this);
                    break;
                }
            } else if (obj instanceof List) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = state$FU;
                g0Var2 = SelectKt.STATE_REG;
                if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater2, this, obj, g0Var2)) {
                    Iterator it = ((Iterable) obj).iterator();
                    while (it.hasNext()) {
                        reregisterClause(it.next());
                    }
                }
            } else {
                if (!(obj instanceof a)) {
                    throw new IllegalStateException(("unexpected state: " + obj).toString());
                }
                oVar.resume(w.INSTANCE, ((a) obj).createOnCancellationAction(this, this.internalResult));
            }
        }
    }

    @Override // kotlinx.coroutines.selects.k, kotlinx.coroutines.selects.j
    public void disposeOnCompletion(u0 u0Var) {
        this.disposableHandleOrSegment = u0Var;
    }

    public Object doSelect(kotlin.coroutines.c cVar) {
        return doSelect$suspendImpl(this, cVar);
    }

    @Override // kotlinx.coroutines.selects.k, kotlinx.coroutines.selects.j
    public CoroutineContext getContext() {
        return this.context;
    }

    @Override // kotlinx.coroutines.l, kotlinx.coroutines.m, f6.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return w.INSTANCE;
    }

    @Override // kotlinx.coroutines.selects.k, kotlinx.coroutines.l2
    public void invokeOnCancellation(d0 d0Var, int i8) {
        this.disposableHandleOrSegment = d0Var;
        this.indexInSegment = i8;
    }

    @Override // kotlinx.coroutines.selects.b
    public void onTimeout(long j8, f6.l lVar) {
        b.a.onTimeout(this, j8, lVar);
    }

    public final void register(kotlinx.coroutines.selects.SelectImplementation.a aVar, boolean z7) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = state$FU;
        if (atomicReferenceFieldUpdater.get(this) instanceof a) {
            return;
        }
        if (!z7) {
            checkClauseObject(aVar.clauseObject);
        }
        if (!aVar.tryRegisterAsWaiter(this)) {
            atomicReferenceFieldUpdater.set(this, aVar);
            return;
        }
        if (!z7) {
            List<kotlinx.coroutines.selects.SelectImplementation.a> list = this.clauses;
            s.checkNotNull(list);
            list.add(aVar);
        }
        aVar.disposableHandleOrSegment = this.disposableHandleOrSegment;
        aVar.indexInSegment = this.indexInSegment;
        this.disposableHandleOrSegment = null;
        this.indexInSegment = -1;
    }

    @Override // kotlinx.coroutines.selects.k, kotlinx.coroutines.selects.j
    public void selectInRegistrationPhase(Object obj) {
        this.internalResult = obj;
    }

    @Override // kotlinx.coroutines.selects.k, kotlinx.coroutines.selects.j
    public boolean trySelect(Object obj, Object obj2) {
        return trySelectInternal(obj, obj2) == 0;
    }

    public final TrySelectDetailedResult trySelectDetailed(Object obj, Object obj2) {
        TrySelectDetailedResult TrySelectDetailedResult;
        TrySelectDetailedResult = SelectKt.TrySelectDetailedResult(trySelectInternal(obj, obj2));
        return TrySelectDetailedResult;
    }

    @Override // kotlinx.coroutines.selects.b
    public <P, Q> void invoke(g gVar, p pVar) {
        b.a.invoke(this, gVar, pVar);
    }

    @Override // kotlinx.coroutines.selects.b
    public void invoke(c cVar, f6.l lVar) {
        register$default(this, new a(cVar.getClauseObject(), cVar.getRegFunc(), cVar.getProcessResFunc(), SelectKt.getPARAM_CLAUSE_0(), lVar, cVar.getOnCancellationConstructor()), false, 1, null);
    }

    @Override // kotlinx.coroutines.selects.b
    public <Q> void invoke(e eVar, p pVar) {
        register$default(this, new a(eVar.getClauseObject(), eVar.getRegFunc(), eVar.getProcessResFunc(), null, pVar, eVar.getOnCancellationConstructor()), false, 1, null);
    }

    @Override // kotlinx.coroutines.selects.b
    public <P, Q> void invoke(g gVar, P p8, p pVar) {
        register$default(this, new a(gVar.getClauseObject(), gVar.getRegFunc(), gVar.getProcessResFunc(), p8, pVar, gVar.getOnCancellationConstructor()), false, 1, null);
    }

    @Override // kotlinx.coroutines.m
    public void invoke(Throwable th) {
        Object obj;
        g0 g0Var;
        g0 g0Var2;
        g0 g0Var3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = state$FU;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            g0Var = SelectKt.STATE_COMPLETED;
            if (obj == g0Var) {
                return;
            } else {
                g0Var2 = SelectKt.STATE_CANCELLED;
            }
        } while (!androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, obj, g0Var2));
        List<kotlinx.coroutines.selects.SelectImplementation.a> list = this.clauses;
        if (list == null) {
            return;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((a) it.next()).dispose();
        }
        g0Var3 = SelectKt.NO_RESULT;
        this.internalResult = g0Var3;
        this.clauses = null;
    }
}
