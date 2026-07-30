package kotlinx.coroutines;

/* loaded from: classes3.dex */
public abstract class f2 {
    /* renamed from: SupervisorJob, reason: collision with other method in class */
    public static final z m1259SupervisorJob(l1 l1Var) {
        return new e2(l1Var);
    }

    /* renamed from: SupervisorJob$default, reason: collision with other method in class */
    public static /* synthetic */ z m1260SupervisorJob$default(l1 l1Var, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            l1Var = null;
        }
        return m1259SupervisorJob(l1Var);
    }

    public static final <R> Object supervisorScope(f6.p pVar, kotlin.coroutines.c cVar) {
        Object coroutine_suspended;
        d2 d2Var = new d2(cVar.getContext(), cVar);
        Object startUndispatchedOrReturn = l6.b.startUndispatchedOrReturn(d2Var, d2Var, pVar);
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        if (startUndispatchedOrReturn == coroutine_suspended) {
            kotlin.coroutines.jvm.internal.f.probeCoroutineSuspended(cVar);
        }
        return startUndispatchedOrReturn;
    }

    public static /* synthetic */ l1 SupervisorJob$default(l1 l1Var, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            l1Var = null;
        }
        return m1259SupervisorJob(l1Var);
    }
}
