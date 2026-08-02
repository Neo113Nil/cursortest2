package kotlinx.coroutines;

/* loaded from: classes3.dex */
public class StandaloneCoroutine extends AbstractCoroutine {
    @Override // kotlinx.coroutines.JobSupport
    public final boolean handleJobException(Throwable th) {
        JobKt.handleCoroutineException(this.context, th);
        return true;
    }
}
