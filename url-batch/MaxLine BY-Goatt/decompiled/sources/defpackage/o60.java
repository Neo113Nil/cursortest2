package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class o60 extends r30 {
    public js0 m;
    public /* synthetic */ Object n;
    public final /* synthetic */ js0 o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o60(js0 js0Var, r30 r30Var) {
        super(r30Var);
        this.o = js0Var;
    }

    @Override // defpackage.hn
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.h(this);
    }
}
