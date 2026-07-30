package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class lc2 extends r30 {
    public js0 m;
    public oo1 n;
    public /* synthetic */ Object o;
    public final /* synthetic */ js0 p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lc2(js0 js0Var, r30 r30Var) {
        super(r30Var);
        this.p = js0Var;
    }

    @Override // defpackage.hn
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.F(this);
    }
}
