package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class fj1 extends r30 {
    public /* synthetic */ Object m;
    public final /* synthetic */ ij1 n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fj1(ij1 ij1Var, r30 r30Var) {
        super(r30Var);
        this.n = ij1Var;
    }

    @Override // defpackage.hn
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.e(this);
    }
}
