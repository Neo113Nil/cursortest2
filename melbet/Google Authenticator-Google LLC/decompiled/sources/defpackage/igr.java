package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class igr extends Exception {
    public igr(Throwable th) {
        super(th);
        StackTraceElement[] b = hom.b(hkn.class, -1, 2);
        if (b.length > 0) {
            setStackTrace(b);
        }
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }
}
