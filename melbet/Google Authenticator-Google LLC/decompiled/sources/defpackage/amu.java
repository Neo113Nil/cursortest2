package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class amu extends RuntimeException {
    public final Throwable a;
    public final int b;

    public amu(int i, Throwable th) {
        super(th);
        this.b = i;
        this.a = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.a;
    }
}
