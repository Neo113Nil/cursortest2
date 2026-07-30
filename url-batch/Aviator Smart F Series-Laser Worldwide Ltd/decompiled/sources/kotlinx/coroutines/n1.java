package kotlinx.coroutines;

/* loaded from: classes3.dex */
public class n1 extends JobSupport implements z {
    private final boolean handlesException;

    public n1(l1 l1Var) {
        super(true);
        initParentJob(l1Var);
        this.handlesException = handlesException();
    }

    private final boolean handlesException() {
        JobSupport job;
        t parentHandle$kotlinx_coroutines_core = getParentHandle$kotlinx_coroutines_core();
        u uVar = parentHandle$kotlinx_coroutines_core instanceof u ? (u) parentHandle$kotlinx_coroutines_core : null;
        if (uVar != null && (job = uVar.getJob()) != null) {
            while (!job.getHandlesException$kotlinx_coroutines_core()) {
                t parentHandle$kotlinx_coroutines_core2 = job.getParentHandle$kotlinx_coroutines_core();
                u uVar2 = parentHandle$kotlinx_coroutines_core2 instanceof u ? (u) parentHandle$kotlinx_coroutines_core2 : null;
                if (uVar2 != null && (job = uVar2.getJob()) != null) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // kotlinx.coroutines.z
    public boolean complete() {
        return makeCompleting$kotlinx_coroutines_core(y5.w.INSTANCE);
    }

    @Override // kotlinx.coroutines.z
    public boolean completeExceptionally(Throwable th) {
        return makeCompleting$kotlinx_coroutines_core(new b0(th, false, 2, null));
    }

    @Override // kotlinx.coroutines.JobSupport
    public boolean getHandlesException$kotlinx_coroutines_core() {
        return this.handlesException;
    }

    @Override // kotlinx.coroutines.JobSupport
    public boolean getOnCancelComplete$kotlinx_coroutines_core() {
        return true;
    }
}
