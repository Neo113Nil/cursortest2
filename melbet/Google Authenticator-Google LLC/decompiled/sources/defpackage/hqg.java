package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hqg extends Exception {
    private static final long serialVersionUID = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hqg(Exception exc) {
        super(exc);
        exc.getClass();
    }

    @Override // java.lang.Throwable
    public final /* bridge */ /* synthetic */ Throwable getCause() {
        Throwable cause = super.getCause();
        cause.getClass();
        return (Exception) cause;
    }
}
