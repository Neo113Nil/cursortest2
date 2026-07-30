package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class e03 extends r30 {
    public t21 m;
    public /* synthetic */ Object n;
    public final /* synthetic */ f03 o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e03(f03 f03Var, r30 r30Var) {
        super(r30Var);
        this.o = f03Var;
    }

    @Override // defpackage.hn
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.e(this);
    }
}
