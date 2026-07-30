package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class tr2 extends r30 {
    public jo2 m;
    public /* synthetic */ Object n;
    public final /* synthetic */ ur2 o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tr2(ur2 ur2Var, hn hnVar) {
        super(hnVar);
        this.o = ur2Var;
    }

    @Override // defpackage.hn
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.i(0L, null, this);
    }
}
