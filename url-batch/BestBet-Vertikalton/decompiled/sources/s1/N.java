package s1;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class N extends CancellationException {

    /* renamed from: a, reason: collision with root package name */
    public final transient U f4020a;

    public N(String str, Throwable th, U u2) {
        super(str);
        this.f4020a = u2;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof N) {
                N n2 = (N) obj;
                if (!k1.e.a(n2.getMessage(), getMessage()) || !k1.e.a(n2.f4020a, this.f4020a) || !k1.e.a(n2.getCause(), getCause())) {
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
        k1.e.b(message);
        int hashCode = (this.f4020a.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return hashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.f4020a;
    }
}
