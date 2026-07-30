package n6;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class Y extends CancellationException {

    /* renamed from: d, reason: collision with root package name */
    public final transient f0 f7035d;

    public Y(String str, Throwable th, f0 f0Var) {
        super(str);
        this.f7035d = f0Var;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Y)) {
            return false;
        }
        Y y7 = (Y) obj;
        return Intrinsics.a(y7.getMessage(), getMessage()) && Intrinsics.a(y7.f7035d, this.f7035d) && Intrinsics.a(y7.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        Intrinsics.b(message);
        int hashCode = (this.f7035d.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return hashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.f7035d;
    }
}
