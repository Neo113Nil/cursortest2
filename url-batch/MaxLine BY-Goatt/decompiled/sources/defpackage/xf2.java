package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class xf2 extends r30 {
    public b82 m;
    public /* synthetic */ Object n;
    public final /* synthetic */ cg2 o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xf2(cg2 cg2Var, r30 r30Var) {
        super(r30Var);
        this.o = cg2Var;
    }

    @Override // defpackage.hn
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.b(0L, this);
    }
}
