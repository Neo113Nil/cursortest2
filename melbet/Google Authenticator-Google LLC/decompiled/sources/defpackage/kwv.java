package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kwv extends CancellationException implements kvg {
    private final transient kwu a;

    public kwv(String str, Throwable th, kwu kwuVar) {
        super(str);
        this.a = kwuVar;
        if (th != null) {
            initCause(th);
        }
    }

    @Override // defpackage.kvg
    public final /* bridge */ /* synthetic */ Throwable a() {
        if (!kvo.a) {
            return null;
        }
        String message = getMessage();
        message.getClass();
        return new kwv(message, this, b());
    }

    public final kwu b() {
        kwu kwuVar = this.a;
        return kwuVar == null ? kxh.a : kwuVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kwv) {
            kwv kwvVar = (kwv) obj;
            if (ksp.b(kwvVar.getMessage(), getMessage()) && ksp.b(kwvVar.b(), b()) && ksp.b(kwvVar.getCause(), getCause())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        if (kvo.a) {
            return super.fillInStackTrace();
        }
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        message.getClass();
        int hashCode = (message.hashCode() * 31) + b().hashCode();
        Throwable cause = getCause();
        return (hashCode * 31) + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + b();
    }
}
