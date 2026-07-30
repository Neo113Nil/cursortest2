package defpackage;

/* loaded from: classes.dex */
public final class en0 extends r30 {
    public /* synthetic */ Object m;
    public int n;
    public final /* synthetic */ fn0 o;
    public fn0 p;
    public ym0 q;
    public vc2 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public en0(fn0 fn0Var, o30 o30Var) {
        super(o30Var);
        this.o = fn0Var;
    }

    @Override // defpackage.hn
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.n |= Integer.MIN_VALUE;
        return this.o.a(null, this);
    }
}
