package o1;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class N extends CancellationException {

    /* renamed from: a, reason: collision with root package name */
    public final transient U f3317a;

    public N(String str, Throwable th, U u2) {
        super(str);
        this.f3317a = u2;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof N) {
                N n2 = (N) obj;
                if (!g1.f.a(n2.getMessage(), getMessage()) || !g1.f.a(n2.f3317a, this.f3317a) || !g1.f.a(n2.getCause(), getCause())) {
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
        g1.f.b(message);
        int hashCode = (this.f3317a.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return hashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.f3317a;
    }
}
