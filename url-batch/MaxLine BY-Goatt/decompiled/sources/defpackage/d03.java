package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class d03 extends r30 {
    public b32 m;
    public String n;
    public String[] o;
    public int p;
    public int q;
    public /* synthetic */ Object r;
    public final /* synthetic */ f03 s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d03(f03 f03Var, r30 r30Var) {
        super(r30Var);
        this.s = f03Var;
    }

    @Override // defpackage.hn
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return f03.d(this.s, null, 0, this);
    }
}
