package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class z7 extends r30 {
    public an1 m;
    public iq n;
    public /* synthetic */ Object o;
    public final /* synthetic */ b8 p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z7(b8 b8Var, r30 r30Var) {
        super(r30Var);
        this.p = b8Var;
    }

    @Override // defpackage.hn
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.g(this);
    }
}
