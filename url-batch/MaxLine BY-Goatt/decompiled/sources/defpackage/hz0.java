package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class hz0 extends r30 {
    public iz0 m;
    public x62 n;
    public Object o;
    public /* synthetic */ Object p;
    public final /* synthetic */ iz0 q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hz0(iz0 iz0Var, r30 r30Var) {
        super(r30Var);
        this.q = iz0Var;
    }

    @Override // defpackage.hn
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.a(this);
    }
}
