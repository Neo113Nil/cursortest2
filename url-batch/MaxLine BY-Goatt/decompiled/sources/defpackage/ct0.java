package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ct0 extends RuntimeException {
    public final dt0 m;
    public final Throwable n;

    public ct0(dt0 dt0Var, Throwable th) {
        super(th);
        this.m = dt0Var;
        this.n = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.n;
    }
}
