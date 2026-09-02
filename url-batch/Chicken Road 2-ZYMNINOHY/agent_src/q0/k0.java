package q0;

/* loaded from: classes.dex */
public final class k0 extends T.G {

    /* renamed from: c, reason: collision with root package name */
    public final v2.I f15040c;

    public k0(String str, v2.a0 a0Var) {
        super(str, null, false, 1);
        this.f15040c = v2.I.k(a0Var);
    }

    @Override // T.G, java.lang.Throwable
    public final String getMessage() {
        String message = super.getMessage();
        v2.I i4 = this.f15040c;
        if (i4.isEmpty()) {
            return message;
        }
        return message + "\nsniff failures: " + i4;
    }
}
