package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lcb extends RuntimeException {
    private final transient kqn a;

    public lcb(kqn kqnVar) {
        this.a = kqnVar;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return String.valueOf(this.a);
    }
}
