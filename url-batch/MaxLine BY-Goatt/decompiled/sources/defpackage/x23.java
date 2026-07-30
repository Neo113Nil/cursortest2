package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class x23 extends UnsupportedOperationException {
    public final mk0 m;

    public x23(mk0 mk0Var) {
        this.m = mk0Var;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Missing ".concat(String.valueOf(this.m));
    }
}
