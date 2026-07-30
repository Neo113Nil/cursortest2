package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ys0 extends CancellationException {
    public final transient et0 rtx2ld2ELZv4;

    public ys0(String str, Throwable th, et0 et0Var) {
        super(str);
        this.rtx2ld2ELZv4 = et0Var;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ys0)) {
            return false;
        }
        ys0 ys0Var = (ys0) obj;
        return cs0.wdg6QnbFHrFF(ys0Var.getMessage(), getMessage()) && cs0.wdg6QnbFHrFF(ys0Var.rtx2ld2ELZv4, this.rtx2ld2ELZv4) && cs0.wdg6QnbFHrFF(ys0Var.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        message.getClass();
        int hashCode = (this.rtx2ld2ELZv4.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return hashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.rtx2ld2ELZv4;
    }
}
