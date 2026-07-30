package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ir1 extends r30 {
    public /* synthetic */ Object m;
    public final /* synthetic */ js0 n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ir1(js0 js0Var, r30 r30Var) {
        super(r30Var);
        this.n = js0Var;
    }

    @Override // defpackage.hn
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.f(0L, 0L, this);
    }
}
