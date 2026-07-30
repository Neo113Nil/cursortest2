package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class k61 extends fs {
    public final n61 w;

    public k61(o30 o30Var, n61 n61Var) {
        super(1, o30Var);
        this.w = n61Var;
    }

    @Override // defpackage.fs
    public final String A() {
        return "AwaitContinuation";
    }

    @Override // defpackage.fs
    public final Throwable q(n61 n61Var) {
        Throwable e;
        Object O = this.w.O();
        return (!(O instanceof m61) || (e = ((m61) O).e()) == null) ? O instanceof gx ? ((gx) O).a : n61Var.v() : e;
    }
}
