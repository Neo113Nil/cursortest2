package m6;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class p1 extends CancellationException implements d0<p1> {

    /* renamed from: f, reason: collision with root package name */
    public final o1 f19324f;

    public p1(String str, Throwable th, o1 o1Var) {
        super(str);
        this.f19324f = o1Var;
        if (th != null) {
            initCause(th);
        }
    }

    @Override // m6.d0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public p1 a() {
        if (!p0.c()) {
            return null;
        }
        String message = getMessage();
        kotlin.jvm.internal.i.b(message);
        return new p1(message, this, this.f19324f);
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof p1) {
                p1 p1Var = (p1) obj;
                if (!kotlin.jvm.internal.i.a(p1Var.getMessage(), getMessage()) || !kotlin.jvm.internal.i.a(p1Var.f19324f, this.f19324f) || !kotlin.jvm.internal.i.a(p1Var.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        if (p0.c()) {
            return super.fillInStackTrace();
        }
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        String message = getMessage();
        kotlin.jvm.internal.i.b(message);
        int hashCode = ((message.hashCode() * 31) + this.f19324f.hashCode()) * 31;
        Throwable cause = getCause();
        return hashCode + (cause == null ? 0 : cause.hashCode());
    }

    @Override // java.lang.Throwable
    public String toString() {
        return super.toString() + "; job=" + this.f19324f;
    }
}
