package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dhp extends RuntimeException {
    public dhp(String str, StackTraceElement[] stackTraceElementArr, Throwable th) {
        super(str, th);
        setStackTrace(stackTraceElementArr);
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return this;
    }
}
