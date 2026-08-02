package t2;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class V extends CancellationException {

    /* renamed from: a, reason: collision with root package name */
    public final transient e0 f10393a;

    public V(String str, Throwable th, e0 e0Var) {
        super(str);
        this.f10393a = e0Var;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof V)) {
            return false;
        }
        V v = (V) obj;
        return kotlin.jvm.internal.j.a(v.getMessage(), getMessage()) && kotlin.jvm.internal.j.a(v.f10393a, this.f10393a) && kotlin.jvm.internal.j.a(v.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        kotlin.jvm.internal.j.b(message);
        int hashCode = (this.f10393a.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return hashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.f10393a;
    }
}
