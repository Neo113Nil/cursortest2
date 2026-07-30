package kotlinx.coroutines;

/* loaded from: classes3.dex */
public abstract class r1 extends d0 implements u0, g1 {
    public JobSupport job;

    @Override // kotlinx.coroutines.u0
    public void dispose() {
        getJob().removeNode$kotlinx_coroutines_core(this);
    }

    public final JobSupport getJob() {
        JobSupport jobSupport = this.job;
        if (jobSupport != null) {
            return jobSupport;
        }
        kotlin.jvm.internal.s.throwUninitializedPropertyAccessException("job");
        return null;
    }

    @Override // kotlinx.coroutines.g1
    public w1 getList() {
        return null;
    }

    @Override // kotlinx.coroutines.d0, f6.l
    public abstract /* synthetic */ Object invoke(Object obj);

    @Override // kotlinx.coroutines.g1
    public boolean isActive() {
        return true;
    }

    public final void setJob(JobSupport jobSupport) {
        this.job = jobSupport;
    }

    @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
    public String toString() {
        return k0.getClassSimpleName(this) + '@' + k0.getHexAddress(this) + "[job@" + k0.getHexAddress(getJob()) + ']';
    }
}
