package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class np extends r30 {
    public w72 m;
    public Object[] n;
    public int o;
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ op r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public np(op opVar, r30 r30Var) {
        super(r30Var);
        this.r = opVar;
    }

    @Override // defpackage.hn
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.a(null, this);
    }
}
