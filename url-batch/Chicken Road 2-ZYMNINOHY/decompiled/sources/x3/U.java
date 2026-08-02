package x3;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class U extends CancellationException {

    /* renamed from: a, reason: collision with root package name */
    public final transient d0 f16008a;

    public U(String str, Throwable th, d0 d0Var) {
        super(str);
        this.f16008a = d0Var;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof U)) {
            return false;
        }
        U u4 = (U) obj;
        return kotlin.jvm.internal.i.a(u4.getMessage(), getMessage()) && kotlin.jvm.internal.i.a(u4.f16008a, this.f16008a) && kotlin.jvm.internal.i.a(u4.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        kotlin.jvm.internal.i.b(message);
        int hashCode = (this.f16008a.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return hashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.f16008a;
    }
}
