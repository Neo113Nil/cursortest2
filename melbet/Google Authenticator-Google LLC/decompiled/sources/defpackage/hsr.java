package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class hsr extends Throwable {
    public hsr() {
        super("Failure occurred while trying to finish a future.");
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }
}
