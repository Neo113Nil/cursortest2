package kotlinx.coroutines.flow;

/* loaded from: classes5.dex */
public final class p extends kotlinx.coroutines.flow.internal.c {
    public kotlin.coroutines.c cont;
    public long index = -1;

    @Override // kotlinx.coroutines.flow.internal.c
    public boolean allocateLocked(SharedFlowImpl sharedFlowImpl) {
        if (this.index >= 0) {
            return false;
        }
        this.index = sharedFlowImpl.updateNewCollectorIndexLocked$kotlinx_coroutines_core();
        return true;
    }

    @Override // kotlinx.coroutines.flow.internal.c
    public kotlin.coroutines.c[] freeLocked(SharedFlowImpl sharedFlowImpl) {
        long j8 = this.index;
        this.index = -1L;
        this.cont = null;
        return sharedFlowImpl.updateCollectorIndexLocked$kotlinx_coroutines_core(j8);
    }
}
