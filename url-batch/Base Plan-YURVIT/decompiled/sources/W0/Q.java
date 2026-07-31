package W0;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class Q extends CancellationException {

    /* renamed from: e, reason: collision with root package name */
    public final transient Z f923e;

    public Q(String str, Throwable th, Z z2) {
        super(str);
        this.f923e = z2;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Q)) {
            return false;
        }
        Q q2 = (Q) obj;
        return P0.h.a(q2.getMessage(), getMessage()) && P0.h.a(q2.f923e, this.f923e) && P0.h.a(q2.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        P0.h.b(message);
        int hashCode = (this.f923e.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return hashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.f923e;
    }
}
