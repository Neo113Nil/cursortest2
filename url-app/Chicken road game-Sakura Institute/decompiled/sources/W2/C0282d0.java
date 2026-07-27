package W2;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: W2.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0282d0 extends CancellationException {

    /* renamed from: d, reason: collision with root package name */
    public final transient k0 f4254d;

    public C0282d0(String str, Throwable th, k0 k0Var) {
        super(str);
        this.f4254d = k0Var;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C0282d0) {
                C0282d0 c0282d0 = (C0282d0) obj;
                if (!Intrinsics.a(c0282d0.getMessage(), getMessage()) || !Intrinsics.a(c0282d0.f4254d, this.f4254d) || !Intrinsics.a(c0282d0.getCause(), getCause())) {
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
        Intrinsics.c(message);
        int hashCode = (this.f4254d.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return hashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.f4254d;
    }
}
