package H5;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class Y extends CancellationException {

    /* renamed from: f, reason: collision with root package name */
    public final transient g0 f1052f;

    public Y(String str, Throwable th, g0 g0Var) {
        super(str);
        this.f1052f = g0Var;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Y)) {
            return false;
        }
        Y y = (Y) obj;
        return kotlin.jvm.internal.i.a(y.getMessage(), getMessage()) && kotlin.jvm.internal.i.a(y.f1052f, this.f1052f) && kotlin.jvm.internal.i.a(y.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        kotlin.jvm.internal.i.b(message);
        int hashCode = (this.f1052f.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return hashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.f1052f;
    }
}
