package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class qr extends CancellationException {
    public final transient ur f;

    public qr(String str, Throwable th, ur urVar) {
        super(str);
        this.f = urVar;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qr)) {
            return false;
        }
        qr qrVar = (qr) obj;
        return kr.b(qrVar.getMessage(), getMessage()) && kr.b(qrVar.f, this.f) && kr.b(qrVar.getCause(), getCause());
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
