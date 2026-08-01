package r1;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class O extends CancellationException {

    /* renamed from: a, reason: collision with root package name */
    public final transient V f4048a;

    public O(String str, Throwable th, V v2) {
        super(str);
        this.f4048a = v2;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof O) {
                O o2 = (O) obj;
                if (!j1.h.a(o2.getMessage(), getMessage()) || !j1.h.a(o2.f4048a, this.f4048a) || !j1.h.a(o2.getCause(), getCause())) {
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
        j1.h.b(message);
        int hashCode = (this.f4048a.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return hashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.f4048a;
    }
}
