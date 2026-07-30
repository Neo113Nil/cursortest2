package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class y60 extends r30 {
    public i70 m;
    public qo1 n;
    public /* synthetic */ Object o;
    public final /* synthetic */ i70 p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y60(i70 i70Var, r30 r30Var) {
        super(r30Var);
        this.p = i70Var;
    }

    @Override // defpackage.hn
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return i70.b(this.p, this);
    }
}
