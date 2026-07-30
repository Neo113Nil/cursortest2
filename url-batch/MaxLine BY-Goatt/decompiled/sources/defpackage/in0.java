package defpackage;

/* loaded from: classes.dex */
public final class in0 extends r30 {
    public kc0 m;
    public /* synthetic */ Object n;
    public int o;
    public final /* synthetic */ kc0 p;
    public Object q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public in0(kc0 kc0Var, o30 o30Var) {
        super(o30Var);
        this.p = kc0Var;
    }

    @Override // defpackage.hn
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.o |= Integer.MIN_VALUE;
        return this.p.d(null, this);
    }
}
