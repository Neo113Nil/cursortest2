package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/JobCancellationException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class JobCancellationException extends CancellationException {
    public final transient JobSupport _job;

    public JobCancellationException(String str, Throwable th, JobSupport jobSupport) {
        super(str);
        this._job = jobSupport;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof JobCancellationException)) {
            return false;
        }
        JobCancellationException jobCancellationException = (JobCancellationException) obj;
        if (!Intrinsics.areEqual(jobCancellationException.getMessage(), getMessage())) {
            return false;
        }
        Object obj2 = jobCancellationException._job;
        if (obj2 == null) {
            obj2 = NonCancellable.INSTANCE;
        }
        Object obj3 = this._job;
        if (obj3 == null) {
            obj3 = NonCancellable.INSTANCE;
        }
        return Intrinsics.areEqual(obj2, obj3) && Intrinsics.areEqual(jobCancellationException.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        message.getClass();
        int hashCode = message.hashCode() * 31;
        Object obj = this._job;
        if (obj == null) {
            obj = NonCancellable.INSTANCE;
        }
        int hashCode2 = (obj.hashCode() + hashCode) * 31;
        Throwable cause = getCause();
        return hashCode2 + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("; job=");
        Object obj = this._job;
        if (obj == null) {
            obj = NonCancellable.INSTANCE;
        }
        sb.append(obj);
        return sb.toString();
    }
}
