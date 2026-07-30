package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class jc0 extends r30 {
    public /* synthetic */ Object m;
    public final /* synthetic */ kc0 n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jc0(kc0 kc0Var, o30 o30Var) {
        super(o30Var);
        this.n = kc0Var;
    }

    @Override // defpackage.hn
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.d(null, this);
    }
}
