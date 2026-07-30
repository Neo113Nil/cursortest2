package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ua1 extends r30 {
    public va1 m;
    public ho1 n;
    public pr2 o;
    public /* synthetic */ Object p;
    public final /* synthetic */ va1 q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ua1(va1 va1Var, r30 r30Var) {
        super(r30Var);
        this.q = va1Var;
    }

    @Override // defpackage.hn
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.d(null, null, this);
    }
}
