package defpackage;

/* loaded from: classes.dex */
public final class bj1 extends r30 {
    public /* synthetic */ Object m;
    public int n;
    public final /* synthetic */ ij o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bj1(ij ijVar, o30 o30Var) {
        super(o30Var);
        this.o = ijVar;
    }

    @Override // defpackage.hn
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.n |= Integer.MIN_VALUE;
        return this.o.d(null, this);
    }
}
