package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class lbm extends Throwable {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lbm(StackTraceElement[] stackTraceElementArr) {
        super("Coroutine encountered an exception.");
        stackTraceElementArr.getClass();
        setStackTrace(stackTraceElementArr);
    }

    @Override // java.lang.Throwable
    public final /* bridge */ /* synthetic */ Throwable fillInStackTrace() {
        return this;
    }
}
