package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class lr1 extends r30 {
    public long m;
    public /* synthetic */ Object n;
    public final /* synthetic */ mr1 o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lr1(mr1 mr1Var, r30 r30Var) {
        super(r30Var);
        this.o = mr1Var;
    }

    @Override // defpackage.hn
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.Y(0L, this);
    }
}
