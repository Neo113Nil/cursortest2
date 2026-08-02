package Y0;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class Q extends CancellationException {

    /* renamed from: e, reason: collision with root package name */
    public final transient Z f1177e;

    public Q(String str, Throwable th, Z z2) {
        super(str);
        this.f1177e = z2;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Q) {
                Q q2 = (Q) obj;
                if (!Q0.h.a(q2.getMessage(), getMessage()) || !Q0.h.a(q2.f1177e, this.f1177e) || !Q0.h.a(q2.getCause(), getCause())) {
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
        Q0.h.b(message);
        int hashCode = (this.f1177e.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return hashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.f1177e;
    }
}
