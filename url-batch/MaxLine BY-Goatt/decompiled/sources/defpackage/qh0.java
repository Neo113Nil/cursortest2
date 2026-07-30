package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class qh0 extends r30 {
    public sh0 m;
    public d72 n;
    public /* synthetic */ Object o;
    public final /* synthetic */ sh0 p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qh0(sh0 sh0Var, r30 r30Var) {
        super(r30Var);
        this.p = sh0Var;
    }

    @Override // defpackage.hn
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.d(null, this);
    }
}
