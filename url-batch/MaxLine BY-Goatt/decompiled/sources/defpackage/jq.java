package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class jq extends r30 {
    public /* synthetic */ Object m;
    public final /* synthetic */ lq n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jq(lq lqVar, r30 r30Var) {
        super(r30Var);
        this.n = lqVar;
    }

    @Override // defpackage.hn
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        Object G = lq.G(this.n, this);
        return G == b50.m ? G : new st(G);
    }
}
