package D4;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class Y extends CancellationException {

    /* renamed from: a, reason: collision with root package name */
    public final transient g0 f485a;

    public Y(String str, Throwable th, g0 g0Var) {
        super(str);
        this.f485a = g0Var;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Y) {
                Y y5 = (Y) obj;
                if (!kotlin.jvm.internal.i.a(y5.getMessage(), getMessage()) || !kotlin.jvm.internal.i.a(y5.f485a, this.f485a) || !kotlin.jvm.internal.i.a(y5.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        kotlin.jvm.internal.i.b(message);
        int hashCode = (this.f485a.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return hashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.f485a;
    }
}
