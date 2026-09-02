package k0;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class L extends CancellationException {

    /* renamed from: b, reason: collision with root package name */
    public final transient T f835b;

    public L(String str, Throwable th, T t2) {
        super(str);
        this.f835b = t2;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof L) {
                L l2 = (L) obj;
                if (!e0.h.a(l2.getMessage(), getMessage()) || !e0.h.a(l2.f835b, this.f835b) || !e0.h.a(l2.getCause(), getCause())) {
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
        e0.h.b(message);
        int hashCode = (this.f835b.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return hashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.f835b;
    }
}
