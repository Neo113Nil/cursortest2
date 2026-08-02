package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cnf extends UnsupportedOperationException {
    private final cli a;

    public cnf(cli cliVar) {
        this.a = cliVar;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Missing ".concat(String.valueOf(String.valueOf(this.a)));
    }
}
