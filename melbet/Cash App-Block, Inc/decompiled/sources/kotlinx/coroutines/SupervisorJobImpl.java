package kotlinx.coroutines;

/* loaded from: classes3.dex */
public final class SupervisorJobImpl extends JobImpl {
    @Override // kotlinx.coroutines.JobSupport
    public final boolean childCancelled(Throwable th) {
        return false;
    }
}
