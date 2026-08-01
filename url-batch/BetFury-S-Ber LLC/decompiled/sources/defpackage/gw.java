package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class gw extends CancellationException {
    public final transient mw f;

    public gw(String str, Throwable th, mw mwVar) {
        super(str);
        this.f = mwVar;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gw)) {
            return false;
        }
        gw gwVar = (gw) obj;
        return mv.c(gwVar.getMessage(), getMessage()) && mv.c(gwVar.f, this.f) && mv.c(gwVar.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        message.getClass();
        int hashCode = (this.f.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return hashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.f;
    }
}
