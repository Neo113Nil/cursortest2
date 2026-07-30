package kotlinx.coroutines;

import java.util.concurrent.CancellationException;

/* loaded from: classes3.dex */
public final class JobCancellationException extends CancellationException implements f0 {
    public final transient l1 job;

    public JobCancellationException(String str, Throwable th, l1 l1Var) {
        super(str);
        this.job = l1Var;
        if (th != null) {
            initCause(th);
        }
    }

    @Override // kotlinx.coroutines.f0
    public JobCancellationException createCopy() {
        return null;
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof JobCancellationException) {
                JobCancellationException jobCancellationException = (JobCancellationException) obj;
                if (!kotlin.jvm.internal.s.areEqual(jobCancellationException.getMessage(), getMessage()) || !kotlin.jvm.internal.s.areEqual(jobCancellationException.job, this.job) || !kotlin.jvm.internal.s.areEqual(jobCancellationException.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        String message = getMessage();
        kotlin.jvm.internal.s.checkNotNull(message);
        int hashCode = ((message.hashCode() * 31) + this.job.hashCode()) * 31;
        Throwable cause = getCause();
        return hashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        return super.toString() + "; job=" + this.job;
    }
}
