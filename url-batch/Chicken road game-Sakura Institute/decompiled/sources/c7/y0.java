package c7;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class y0 extends CancellationException {

    /* renamed from: f, reason: collision with root package name */
    public final transient f1 f1761f;

    public y0(String str, Throwable th, f1 f1Var) {
        super(str);
        this.f1761f = f1Var;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return r6.k.a(y0Var.getMessage(), getMessage()) && r6.k.a(y0Var.f1761f, this.f1761f) && r6.k.a(y0Var.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        r6.k.c(message);
        int hashCode = (this.f1761f.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return hashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.f1761f;
    }
}
