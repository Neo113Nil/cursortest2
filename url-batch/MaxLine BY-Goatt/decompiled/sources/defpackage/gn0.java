package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class gn0 extends r30 {
    public dd m;
    public Object n;
    public /* synthetic */ Object o;
    public final /* synthetic */ dd p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gn0(dd ddVar, o30 o30Var) {
        super(o30Var);
        this.p = ddVar;
    }

    @Override // defpackage.hn
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.d(null, this);
    }
}
