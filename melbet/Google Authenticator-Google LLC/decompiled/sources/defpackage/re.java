package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class re extends Throwable {
    public re() {
        super("Failure occurred while trying to finish a future.");
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return this;
    }
}
