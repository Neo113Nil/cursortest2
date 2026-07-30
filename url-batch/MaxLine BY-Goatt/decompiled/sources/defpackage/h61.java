package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class h61 extends CancellationException {
    public final transient n61 m;

    public h61(String str, Throwable th, n61 n61Var) {
        super(str);
        this.m = n61Var;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h61)) {
            return false;
        }
        h61 h61Var = (h61) obj;
        return Intrinsics.b(h61Var.getMessage(), getMessage()) && Intrinsics.b(h61Var.m, this.m) && Intrinsics.b(h61Var.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        message.getClass();
        int hashCode = (this.m.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return hashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.m;
    }
}
