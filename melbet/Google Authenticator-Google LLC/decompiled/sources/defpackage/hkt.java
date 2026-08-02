package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hkt extends Exception {
    public hkt(Throwable th, hlj hljVar, StackTraceElement[] stackTraceElementArr) {
        super(hljVar.toString(), th);
        setStackTrace(stackTraceElementArr);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }
}
