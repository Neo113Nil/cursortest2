package q2;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class Y extends CancellationException {

    /* renamed from: d, reason: collision with root package name */
    public final transient f0 f7875d;

    public Y(String str, Throwable th, f0 f0Var) {
        super(str);
        this.f7875d = f0Var;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Y) {
                Y y3 = (Y) obj;
                if (!f2.j.a(y3.getMessage(), getMessage()) || !f2.j.a(y3.f7875d, this.f7875d) || !f2.j.a(y3.getCause(), getCause())) {
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
        f2.j.c(message);
        int hashCode = (this.f7875d.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return hashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.f7875d;
    }
}
