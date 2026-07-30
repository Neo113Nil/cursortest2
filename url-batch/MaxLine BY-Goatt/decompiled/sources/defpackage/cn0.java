package defpackage;

/* loaded from: classes.dex */
public final class cn0 extends r30 {
    public /* synthetic */ Object m;
    public int n;
    public final /* synthetic */ dn0 o;
    public Object p;
    public ym0 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cn0(dn0 dn0Var, o30 o30Var) {
        super(o30Var);
        this.o = dn0Var;
    }

    @Override // defpackage.hn
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.n |= Integer.MIN_VALUE;
        return this.o.a(null, this);
    }
}
