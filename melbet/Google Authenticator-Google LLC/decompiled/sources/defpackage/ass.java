package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ass extends yo {
    private final Throwable a;

    public ass(Throwable th) {
        this.a = th;
    }

    public final String toString() {
        return "FAILURE (" + this.a.getMessage() + ")";
    }
}
